package org.eclipse.stem.runtime.execute.compactjava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import org.apache.commons.math.ode.FirstOrderIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.eclipse.stem.runtime.compactjava.RuntimeDecorator;
import org.eclipse.stem.runtime.compactjava.RuntimeExecutable;
import org.eclipse.stem.runtime.compactjava.RuntimeGraph;
import org.eclipse.stem.runtime.compactjava.RuntimeLabel;
import org.eclipse.stem.runtime.compactjava.RuntimeScenario;
import org.eclipse.stem.runtime.compactjava.RuntimeSolver;
import org.eclipse.stem.runtime.compactjava.RuntimeType;

public class Runner  {

	
	public static double transmissionRate = 1.2;
	public static double incubationRate = 0.5;
	public static double recoveryRate = 0.3;
	public static double immunityLossRate = 0.003;
	
	private int dimensions=0;
	private short seirLabelTypeId=-1;
	
	RuntimeExecutable rExecutable = null;

	/**
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		
		if(args.length < 1) {
			System.out.println("Usage: Runner <Input executable> <log>");
			System.exit(-1);
		}
		
		boolean log = false;
		if(args.length > 1 ) log = true;
		
		String fIn = args[0];
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fIn));
			RuntimeExecutable rExec =(RuntimeExecutable) ois.readObject();
			ois.close();
			Runner runner = new Runner();
			long now = System.currentTimeMillis();
			runner.execute(rExec, log);
			long then = System.currentTimeMillis();
			System.out.println("Total time:"+(then-now)/1000.0+" seconds");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void execute(RuntimeExecutable re, boolean log) throws Exception {
		this.rExecutable = re;
		if(re.getExecutable() instanceof RuntimeScenario)
			executeScenario((RuntimeScenario)re.getExecutable(), log);
		// Experiments etc. goes here
		
	}
	
	public void executeScenario(RuntimeScenario rs, boolean log) throws Exception {
		// Run an SEIR model 
		
		// Figure out the solver. 
		FirstOrderIntegrator integrator = null;
		RuntimeSolver rSolver = rs.getRuntimeSolver();
		if(rSolver.getName().equals("DormandPrince853")) {
			short typeId = rs.getSolverTypeSystem().findTypeId("DormandPrince853");
			RuntimeType solverType = rs.getSolverTypeSystem().getRuntimeType(typeId);
			integrator = new DormandPrince853Integrator(
					rSolver.getDoubleAttributeValue(solverType.getDoubleAttributeIndex("minStep")), 
					rSolver.getDoubleAttributeValue(solverType.getDoubleAttributeIndex("maxStep")), 
					rSolver.getDoubleAttributeValue(solverType.getDoubleAttributeIndex("absoluteTolerance")), 
					rSolver.getDoubleAttributeValue(solverType.getDoubleAttributeIndex("relativeTolerance")));
		}
		else {
			System.err.println("Solver "+rs.getRuntimeSolver().getName()+" not implemented yet");
			return;
		}
		
		// Current values for each decorator
		ArrayList<double[]> yD = new ArrayList<double []>();
		ArrayList<RuntimeDiffEquation> diffEquations = new ArrayList<RuntimeDiffEquation>(); 
		RuntimeGraph rGraph = rs.getGraph();
		
		// Figure out the dimensions for each decorator
		// and create arrays with the size of the dimension
		for(RuntimeDecorator rd:rs.getRuntimeDecorators()) {
			// Load the class that figures out the derivatives
			String name = rd.getName();
			String dClass = DecoratorMapper.nameClassMap.get(name);
			if(dClass == null) {
				System.err.println("Error, unable to load derivative class for "+name);
				continue;
			}
			@SuppressWarnings("unchecked")
			Class<RuntimeDiffEquation> clazz = (Class<RuntimeDiffEquation>)Class.forName(dClass);
			Constructor<RuntimeDiffEquation> constructor = clazz.getConstructor(RuntimeScenario.class, RuntimeDecorator.class, Integer.class);
		
			int totalDimensions = 0;
			for(int labelId:rd.getLabelsToUpdate()) {
				RuntimeLabel rLabel = rGraph.findLabel(labelId);
				totalDimensions += rLabel.getNumDoubleAttributes();
			}
			double [] y = new double[totalDimensions];
			yD.add(y);
			
			RuntimeDiffEquation rde = constructor.newInstance(rs, rd, totalDimensions);
			diffEquations.add(rde);

			// Initialize
			rde.initialize(y);
		}
		
		// ToDo: add log header here
		
		
		
		if(log) 
			for(double [] y:yD)
				writeToFile(y); // Initial value
				
				
		double numSteps = rs.getRuntimeSequencer().getDays();
		double stepSize = rs.getRuntimeSequencer().getStepSize();
		
		for(double t=0;t<numSteps;t+=stepSize) {
			int di = 0;
			for(RuntimeDiffEquation rde:diffEquations) {
				integrator.integrate(rde, t, yD.get(di), t+1.0, yD.get(di));
				if(log) writeToFile(yD.get(di));
			
			}
		}
		

	}

	
	private void writeToFile(double [] y) {
		// Implement logging here
//		for(int i=0;i<y.length;++i)
//			System.out.print(y[i]+",");
		System.out.println("cycle:"+cycle++);
	}
	private static int cycle = 0;
}
