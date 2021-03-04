package org.eclipse.stem.runtime.compactjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RuntimeScenario extends RuntimeIdentifiable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RuntimeGraph graph;
	private TypeSystem nodeTypeSystem;
	private TypeSystem edgeTypeSystem;
	private TypeSystem labelTypeSystem;
	private TypeSystem decoratorTypeSystem;
	private TypeSystem solverTypeSystem;
	
	private Map<Integer, String> nodeIdISOKeyMap;
	private List<RuntimeDecorator> runtimeDecorators;
	private RuntimeSequencer runtimeSequencer;
	private RuntimeSolver runtimeSolver;
	
	/**
	 * 
	 */
	public RuntimeScenario() {
		super(null); // No type for scenarios
		this.nodeTypeSystem = new TypeSystem();
		this.edgeTypeSystem = new TypeSystem();
		this.labelTypeSystem = new TypeSystem();
		this.decoratorTypeSystem = new TypeSystem(); 
		this.solverTypeSystem = new TypeSystem(); 
		
		this.nodeIdISOKeyMap = new HashMap<Integer, String>();
		this.runtimeDecorators = new ArrayList<RuntimeDecorator>();
	}
	
	
	/**
	 * Set the runtime graph
	 * @param g
	 */
	public void setGraph(RuntimeGraph g) {
		this.graph = g;
	}
	
	/**
	 * Retrieve the runtime graph
	 * @return
	 */
	public RuntimeGraph getGraph() {
		return graph;
	}
	
	/**
	 * get the Node Type System
	 * @return TypeSystem. 
	 */
	public TypeSystem getNodeTypeSystem() {
		return nodeTypeSystem;
	}

	/**
	 * get the Ege Type System
	 * @return TypeSystem. 
	 */

	public TypeSystem getEdgeTypeSystem() {
		return edgeTypeSystem;
	}
	
	/**
	 * get the Label Type System
	 * @return TypeSystem. 
	 */

	public TypeSystem getLabelTypeSystem() {
		return labelTypeSystem;
	}
	
	/**
	 * get the decorator Type System
	 * @return TypeSystem. 
	 */

	public TypeSystem getDecoratorTypeSystem() {
		return decoratorTypeSystem;
	}
	
	/**
	 * get the solver Type System
	 * @return TypeSystem. 
	 */

	public TypeSystem getSolverTypeSystem() {
		return solverTypeSystem;
	}
	
	/**
	 * Register a new iso key
	 * @param id Node id
	 * @param isoKey The iso key
	 */
	public void registerISOKey(int id, String isoKey) {
		this.nodeIdISOKeyMap.put(id, isoKey);
	}

	/**
	 * Retrieve an iso key 
	 * @param id The id of the node
	 * @return ISO Key, the iso key
	 */
	public String retrieveISOKey(int id) {
		return nodeIdISOKeyMap.get(id);
	}
	
	/**
	 * Add a new decorator
	 * @param r THe decorator
	 */
	public void addRuntimeDecorator(RuntimeDecorator r) {
		this.runtimeDecorators.add(r);
	}
	
	/**
	 * Return the runtime decorators
	 * @return The decorators
	 */
	public List<RuntimeDecorator> getRuntimeDecorators() {
		return runtimeDecorators;
	}
	
	/**
	 * Set sequencer
	 * @param rs RuntimeSequencer
	 */
	public void setRuntimeSequencer(RuntimeSequencer rs) {
		this.runtimeSequencer = rs;
	}
	/**
	 * get sequencer
	 * @return RuntimeSequencer
	 */
	public RuntimeSequencer getRuntimeSequencer() {
		return this.runtimeSequencer; 
	}

	/**
	 * get the solver
	 * @return RuntimeSolver
	 */
	public RuntimeSolver getRuntimeSolver() {
		return runtimeSolver;
	}

	/**
	 * set the solver
	 * @param runtimeSolver
	 */
	public void setRuntimeSolver(RuntimeSolver runtimeSolver) {
		this.runtimeSolver = runtimeSolver;
	}
}
