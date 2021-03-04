package org.eclipse.stem.fbd.util;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.stem.fbd.model.EmpiricalDataset;
import org.eclipse.stem.fbd.model.scenario.BatchExperimentScenario;

public class GenerateOutbreakDataUsingZipCode {

	public static int NUM_RUNS = 50;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if(args.length < 4) {
			System.out.println("Usage: GenerateOutbreakDataUsingZipCode <Population Density File> <Food Distribution file> <output file> <seed>");
			System.exit(-1);
		}
		try {

			EmpiricalDataset ed = EmpiricalDataset
					.createDatasetFromFiles(
							new File(args[0]),
							new File(args[1]));

		
			FileWriter fw = new FileWriter(args[2]);
		/*	for(int i=0;i<ed.getFoodDistributionNames().length;++i) 
				if(i<ed.getFoodDistributionNames().length-1) fw.write(ed.getFoodDistributionNames()[i]+",");
				else
					fw.write(ed.getFoodDistributionNames()[i]);
			fw.write("\n");
*/
			long seed = Long.parseLong(args[3]);
			for(int prod=0;prod<ed.getFoodDistributionNames().length;++prod) {			
			//	for(int prod=0;prod<2;++prod) {
				for(int run=0;run<NUM_RUNS;++run) {
					fw.write(ed.getFoodDistributionNames()[prod]+"_"+run+"\t");
					long s = seed+run;
					List<String> results = runBatch(ed, prod, s, 0.0);
					for(int i=0;i<BatchExperimentScenario.MAX_NO_OF_REPORTS;++i) {
						if(i<results.size()-1)
							fw.write(results.get(i)+"\t");
						else
							fw.write(results.get(i)+"\n");
					}
				}
				System.out.println("Product: "+prod);
			}

			fw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	static BatchExperimentScenario scenario;

	public static List<String> runBatch(EmpiricalDataset ed, int contaminationSource, long seed, double noise) {
		ArrayList<List<Integer>> results = new ArrayList<List<Integer>>();
		ArrayList<List<Double>> relativeProbs = new ArrayList<List<Double>>();

		List<String>  returnVal = null;

		if(scenario == null)
			scenario = new BatchExperimentScenario(ed);

		try {
			scenario.init(contaminationSource, (int)seed);
			ZipCodeCapturer zcc = new ZipCodeCapturer();
			scenario.registerContaminationEventObserver(zcc);
			scenario.runExperiment(noise, seed);
			scenario.unregisterContaminationEventObserver(zcc);

			returnVal= zcc.getZips();

		} catch (MagicTableException e) {
			e.printStackTrace();
		}

		return returnVal;
	}


}
