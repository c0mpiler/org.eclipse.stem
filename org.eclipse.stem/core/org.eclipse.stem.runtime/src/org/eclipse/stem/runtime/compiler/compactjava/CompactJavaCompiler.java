package org.eclipse.stem.runtime.compiler.compactjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.graph.DynamicLabel;
import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.EdgeLabel;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.graph.LabelValue;
import org.eclipse.stem.core.graph.Node;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.sequencer.Sequencer;
import org.eclipse.stem.core.sequencer.SequentialSequencer;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.jobs.adapters.executable.emf.ExecutableAdapter;
import org.eclipse.stem.jobs.execution.IExecutable;
import org.eclipse.stem.runtime.compactjava.RuntimeDecorator;
import org.eclipse.stem.runtime.compactjava.RuntimeEdge;
import org.eclipse.stem.runtime.compactjava.RuntimeExecutable;
import org.eclipse.stem.runtime.compactjava.RuntimeGraph;
import org.eclipse.stem.runtime.compactjava.RuntimeIdentifiable;
import org.eclipse.stem.runtime.compactjava.RuntimeLabel;
import org.eclipse.stem.runtime.compactjava.RuntimeNode;
import org.eclipse.stem.runtime.compactjava.RuntimeScenario;
import org.eclipse.stem.runtime.compactjava.RuntimeSequencer;
import org.eclipse.stem.runtime.compactjava.RuntimeSolver;
import org.eclipse.stem.runtime.compactjava.RuntimeType;
import org.eclipse.stem.runtime.compiler.Compiler;

/**
 * A compiler that translates STEM executables into compact java 
 * @author edlund
 *
 */
public class CompactJavaCompiler implements Compiler {

	@Override
	public RuntimeExecutable compile(IExecutable executable) {
		Scenario scenario = (Scenario)((ExecutableAdapter)executable).getTarget();

		try {
			scenario.initialize();
		} catch(ScenarioInitializationException se) {
			se.printStackTrace(); 
			return null;
		}
		Graph g = scenario.getCanonicalGraph();

		// Compile it!!!	

		// Create runtime executable
		RuntimeExecutable rExecutable = new RuntimeExecutable();
		// and a new runtime scenario
		RuntimeScenario rScenario = new RuntimeScenario();
		rExecutable.setExecutable(rScenario);
		
		// Create runtime graph
		RuntimeGraph rGraph = new RuntimeGraph();
		
		// Set the runtime graph in the executable
		rScenario.setGraph(rGraph);
		
		// Build the list of nodes
		EMap<URI, Node> nodes = g.getNodes();		
		// Temporary map to remember how URI's map to node & label IDs
		Map<URI, Integer> nodeURIIdMap = new HashMap<URI, Integer>();
		Map<URI, Integer> labelURIIdMap = new HashMap<URI, Integer>();
		
		int nodeCounter = 0;
		short typeCounter = 0;
		for(Map.Entry<URI, Node> entry:nodes.entrySet()) {
			Node n = entry.getValue();

			String type = n.eClass().getName();
			short typeId=rScenario.getNodeTypeSystem().findTypeId(type);
			if(typeId == -1) {
				typeId = typeCounter++;
				rScenario.getNodeTypeSystem().addType(typeId, type);
			} 
			// Create a new runtime node
			RuntimeNode rNode = new RuntimeNode(rScenario.getNodeTypeSystem().getRuntimeType(typeId));
			rNode.setId(nodeCounter++);
	
			rGraph.addNode(rNode.getId(), rNode);	
			nodeURIIdMap.put(n.getURI(), rNode.getId());
		}

		// Build the list of edges and connect to the right node IDs
		EMap<URI, Edge> edges = g.getEdges();

		int edgeCounter = 0;
		int labelCounter = 0;
		typeCounter = 0;
		short labelTypeCounter = 0;
		
		for(Map.Entry<URI, Edge> entry:edges.entrySet()) {
			Edge e = entry.getValue();
			EdgeLabel el = e.getLabel();
			// Add the edge type
			String type = e.eClass().getName();
			short typeId=rScenario.getEdgeTypeSystem().findTypeId(type);
			if(typeId == -1) {
				typeId = typeCounter++;
				rScenario.getEdgeTypeSystem().addType(typeId, type);
			} 
			// Create a new runtime edge
			RuntimeEdge rEdge = new RuntimeEdge(rScenario.getEdgeTypeSystem().getRuntimeType(typeId));
			rEdge.setId(edgeCounter++);
			URI nA = e.getNodeAURI();
			URI nB = e.getNodeBURI();
			if(!nodeURIIdMap.containsKey(nA)) continue; // Node not found, skip edge
			if(!nodeURIIdMap.containsKey(nB)) continue; //  - || -
			int aId = nodeURIIdMap.get(nA);
			int bId = nodeURIIdMap.get(nB);
			rEdge.setNodeA(aId);
			rEdge.setNodeB(bId);
			
			RuntimeNode aNode = rGraph.findNode(aId);
			aNode.addEdge(rEdge);
			RuntimeNode bNode = rGraph.findNode(bId);
			bNode.addEdge(rEdge);
			
			// Add the edge label and its type
			type = el.eClass().getName();
			typeId=rScenario.getLabelTypeSystem().findTypeId(type);
			if(typeId == -1) {
				typeId = labelTypeCounter++;
				rScenario.getLabelTypeSystem().addType(typeId, type);
			} 
			RuntimeLabel rLabel = new RuntimeLabel(rScenario.getLabelTypeSystem().getRuntimeType(typeId));
			addLabelValues(rScenario.getLabelTypeSystem().getRuntimeType(typeId), rLabel, el);	

			
			rLabel.setId(labelCounter++);
			rGraph.addLabel(rLabel.getId(), rLabel);
			rEdge.setEdgeLabel(rLabel);
			
			
			rGraph.addEdge(rEdge.getId(), rEdge);
		}

		// Extract node labels
		for(Map.Entry<URI, NodeLabel>entry:g.getNodeLabels()) {
			URI u = entry.getKey();
			if(labelURIIdMap.containsKey(u)) continue; // already added		
			NodeLabel nl = entry.getValue();
			URI nURI = nl.getURIOfIdentifiableToBeLabeled();
			int nId = nodeURIIdMap.get(nURI);
			String type = nl.eClass().getName();
			short typeId=rScenario.getLabelTypeSystem().findTypeId(type);
			if(typeId == -1) {
				typeId = labelTypeCounter++;
				rScenario.getLabelTypeSystem().addType(typeId, type);
			} 
			// Create the runtime label
			RuntimeLabel rLabel = new RuntimeLabel(rScenario.getLabelTypeSystem().getRuntimeType(typeId));			
			addLabelValues(rScenario.getLabelTypeSystem().getRuntimeType(typeId), rLabel, nl);	
			System.out.println("Adding label "+rLabel.getRuntimeType().getDoubleAttributeNames()+ " to node "+nId);
			rLabel.setId(labelCounter++);
			labelURIIdMap.put(u, rLabel.getId());
			RuntimeNode rNode = rGraph.findNode(nId);
			rNode.addLabel(typeId, rLabel);			
//				System.out.println("adding label "+rLabel.getAllDoubleAttributes()+" of type "+rLabel.getType()+" to node "+nId);
		  rGraph.addLabel(rLabel.getId(), rLabel);
			
		}
			
		// Extract decorators
		
		short decoratorTypeCounter = 0;
		for(Decorator d:g.getDecorators()) {
			// We only care about integration decorators
			if(! (d instanceof IntegrationDecorator)) continue;
			
			String type = d.eClass().getName();
			short typeId=rScenario.getDecoratorTypeSystem().findTypeId(type);
			if(typeId == -1) {
				typeId = decoratorTypeCounter++;
				rScenario.getDecoratorTypeSystem().addType(typeId, type);
			} 
			
			RuntimeDecorator rd = new RuntimeDecorator(rScenario.getDecoratorTypeSystem().getRuntimeType(typeId));
			rd.setName(d.eClass().getName());
			addEObjectValues(rScenario.getDecoratorTypeSystem().getRuntimeType(typeId), rd, d);
			rScenario.addRuntimeDecorator(rd);
			
			// Extract the node labels and values
			
			for(DynamicLabel nl:d.getLabelsToUpdate()) {
				if(labelURIIdMap.containsKey(nl.getURI())) {
					int rLabelId = labelURIIdMap.get(nl.getURI());
					rd.addLabelToUpdate(rLabelId);
					System.out.println("Skipping "+nl.getURI());
					continue; // already added
				}
				URI nURI = nl.getURIOfIdentifiableToBeLabeled();
				int nId = nodeURIIdMap.get(nURI);

				type = nl.eClass().getName();
				typeId=rScenario.getLabelTypeSystem().findTypeId(type);
				if(typeId == -1) {
					typeId = typeCounter++;
					rScenario.getLabelTypeSystem().addType(typeId, type);
				} 
				// Create the runtime label
				RuntimeLabel rLabel = new RuntimeLabel(rScenario.getLabelTypeSystem().getRuntimeType(typeId));
				addLabelValues(rScenario.getLabelTypeSystem().getRuntimeType(typeId), rLabel, nl);	

				
				rLabel.setId(labelCounter++);
				labelURIIdMap.put(nl.getURI(), rLabel.getId());
				
				System.out.println("Adding label "+rLabel.getRuntimeType().getDoubleAttributeNames()+ " to node "+nId);
				RuntimeNode rNode = rGraph.findNode(nId);
				rNode.addLabel(typeId, rLabel);
				
			    rd.addLabelToUpdate(rLabel.getId());
				rGraph.addLabel(rLabel.getId(), rLabel);
			}

		}
		
		// Sequencer
		
		SequentialSequencer s =(SequentialSequencer) scenario.getSequencer();
		long duration = s.getDuration();
		long inc = s.getTimeIncrement();
		RuntimeSequencer rs = new RuntimeSequencer();
		rs.setDays(duration / 86400000);
		rs.setStepSize(inc/86400000);	
		rScenario.setRuntimeSequencer(rs);
		
		// Solver
		Solver solver = scenario.getSolver();
		String type = solver.eClass().getName();
		short typeId=rScenario.getSolverTypeSystem().findTypeId(type);
		if(typeId == -1) {
			typeId = 0; // Only one
			rScenario.getSolverTypeSystem().addType(typeId, type);
		} 

		RuntimeSolver rSolver = new RuntimeSolver(rScenario.getSolverTypeSystem().getRuntimeType(typeId));
		addEObjectValues(rScenario.getSolverTypeSystem().getRuntimeType(typeId), rSolver, solver);
		rSolver.setName(solver.eClass().getName());
		rScenario.setRuntimeSolver(rSolver);
		
		// Done
		return rExecutable;
	}

	private void addLabelValues(RuntimeType rType, RuntimeLabel rLabel, Label l) {
		if(l == null) return;
		// Add attributes from label itself
		addEObjectValues(rType, rLabel, l);
		
		// And for the label value
		LabelValue lv = l.getCurrentValue();
		addEObjectValues(rType, rLabel, lv);
	}

	private void addEObjectValues(RuntimeType rt, RuntimeIdentifiable id, EObject eo) {
		if(eo == null) return;
		for(EAttribute attr:eo.eClass().getEAllAttributes()) {
			Object val = eo.eGet(attr);
			if(val instanceof Double ) {
				id.addDoubleAttributeValue(rt, attr.getName(), (Double)val);
			} else if (val instanceof String 
					|| val instanceof Boolean
					|| val instanceof Long
					|| val instanceof Integer) {
			   id.addAttributeValue(rt, attr.getName(), val);
		}
		}
	}
}
