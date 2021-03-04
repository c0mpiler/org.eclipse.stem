package org.eclipse.stem.fbd.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.stem.fbd.model.EmpiricalDataset;
import org.eclipse.stem.fbd.model.scenario.BatchExperimentScenario;
import org.eclipse.stem.fbd.prediction.MLSourcePredictor;



public class GenerateFoodSensitivitySpecificity {

	//private static final double [] THRESHOLDS = {1E-25};
	private static final double [] THRESHOLDS = {1.0/256, 1.0/128, 1.0/64, 1.0/32, 1.0/16, 1.0/8, 1.0/4, 1.0/2, 1.0};
	//private static final double [] THRESHOLDS = {1.0};

	static int guiltyProd;

	static ArrayList<Integer> productFilter;

	// Whether to drop products with zero (or close to zero) probabilities from selectivity analysis
	static boolean DROP_ZERO_PROBABILITIES_FROM_SELECTIVITY = true;
	static double ZERO_THRESHOLD = 1E-70; // should be small enough 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage: GenerateFoodSensitivitySpecificity <Population Density File> <Food Distribution file> <Product filter file>");
			System.exit(-1);
		}
		try {
			EmpiricalDataset ed = EmpiricalDataset
					.createDatasetFromFiles(
							new File(args[0]),
							new File(args[1]));

			if(args.length == 3) 
				readFilterFile(args[2]);


			FileWriter fw_sensitivity = null;
			FileWriter fw_specificity = null;
			FileWriter fw_skipped_tn = null;
			if(args.length ==3) {
				fw_sensitivity = new FileWriter("sensitivities_sz_"+productFilter.size()+".csv");
				fw_specificity = new FileWriter("specificity_sz_"+productFilter.size()+".csv");
				fw_skipped_tn = new FileWriter("skippedTN_sz_"+productFilter.size()+".csv");
			} else { 
				fw_sensitivity = new FileWriter("sensitivities.csv");
				fw_specificity = new FileWriter("specificity.csv");
				fw_skipped_tn = new FileWriter("skippedTN.csv");
			}

			fw_sensitivity.write("threshold,");
			fw_specificity.write("threshold,");
			fw_skipped_tn.write("pid,");

			for(int i=0;i<BatchExperimentScenario.MAX_NO_OF_REPORTS;++i) {
				fw_sensitivity.write("report "+(i+1)+",");
				fw_specificity.write("report "+(i+1)+",");
				fw_skipped_tn.write("report "+(i+1)+",");
			}

			fw_sensitivity.write("\n");
			fw_specificity.write("\n");
			fw_skipped_tn.write("\n");

			List<Double []> avg_sensitivities = new ArrayList<Double[]>();
			List<Double []> avg_specificities = new ArrayList<Double[]>();
			double [] skippedTruePositives = null;

			//		new double[BatchExperimentScenario.MAX_NO_OF_REPORTS];
			//double [] avg_specificities = new double[BatchExperimentScenario.MAX_NO_OF_REPORTS];
			for(guiltyProd=0;guiltyProd<ed.getFoodDistributionNames().length;++guiltyProd) {	
			//for(guiltyProd=0;guiltyProd<3;++guiltyProd) {	
				if(productFilter != null && !productFilter.contains(guiltyProd+1)) // +1 products goes from 1, ... in file
					continue;
				Object [] results = runBatch(ed, guiltyProd, 100, 0.0);
				@SuppressWarnings("unchecked")
				ArrayList<List<Integer>> res = (ArrayList<List<Integer>>)results[0];
				ArrayList<List<List<Double>>> probs = (ArrayList<List<List<Double>>>)results[1];

				for(int th_ind = 0;th_ind<THRESHOLDS.length;++th_ind) {
					double threshold = THRESHOLDS[th_ind];

					double [] sensitivities = getSensitivities(threshold, probs);
					Object [] o = getSpecificities(threshold, probs);
					double [] specificities = (double[])o[0];
					skippedTruePositives = (double[])o[1]; // same for every threshold

					if(avg_sensitivities.size() <= th_ind) {
						Double [] d1 = new Double[BatchExperimentScenario.MAX_NO_OF_REPORTS];
						Double [] d2 = new Double[BatchExperimentScenario.MAX_NO_OF_REPORTS];

						for(int d=0;d<BatchExperimentScenario.MAX_NO_OF_REPORTS;++d) {
							d1[d] = Double.valueOf(0);
							d2[d] = Double.valueOf(0);

						}
						avg_sensitivities.add(d1);
						avg_specificities.add(d2);
					}
					for(int i=0;i<sensitivities.length;++i) {
						avg_sensitivities.get(th_ind)[i]=avg_sensitivities.get(th_ind)[i]+sensitivities[i];
						avg_specificities.get(th_ind)[i]=avg_specificities.get(th_ind)[i]+specificities[i];
					}
				}
				fw_skipped_tn.write(""+guiltyProd+",");
				for(int caseR = 0;caseR < skippedTruePositives.length;++caseR)
					if(caseR < skippedTruePositives.length-1)
						fw_skipped_tn.write(skippedTruePositives[caseR]+",");
					else
						fw_skipped_tn.write(skippedTruePositives[caseR]+"");
				fw_skipped_tn.write("\n");
				System.out.println("Processing data for product: "+guiltyProd);	
			} // for all products

			for(int th_ind=0;th_ind<THRESHOLDS.length;++th_ind) {
				for(int i=0;i<avg_sensitivities.get(th_ind).length;++i) {
					if(productFilter == null) {
						avg_sensitivities.get(th_ind)[i]=avg_sensitivities.get(th_ind)[i]/ed.getFoodDistributionNames().length;
						avg_specificities.get(th_ind)[i]=avg_specificities.get(th_ind)[i]/ed.getFoodDistributionNames().length;
					} else {
						avg_sensitivities.get(th_ind)[i]=avg_sensitivities.get(th_ind)[i]/productFilter.size();
						avg_specificities.get(th_ind)[i]=avg_specificities.get(th_ind)[i]/productFilter.size();
					}
					//avg_sensitivities[i]=avg_sensitivities[i]/1;
					//avg_specificities[i]=avg_specificities[i]/1;
				}
			}

			for(int th_ind = 0;th_ind<THRESHOLDS.length;++th_ind) {
				double threshold = THRESHOLDS[th_ind];

				fw_sensitivity.write(""+1/threshold+",");
				fw_specificity.write(""+1/threshold+",");

				for(int i=0;i<avg_sensitivities.get(th_ind).length;++i) {
					fw_sensitivity.write(""+avg_sensitivities.get(th_ind)[i]);
					fw_specificity.write(""+avg_specificities.get(th_ind)[i]);
					if(i < avg_sensitivities.get(th_ind).length-1) {
						fw_sensitivity.write(",");
						fw_specificity.write(",");
					}
				}
				fw_sensitivity.write("\n");
				fw_specificity.write("\n");

				fw_sensitivity.flush();
				fw_specificity.flush();
			}
			fw_sensitivity.close();
			fw_specificity.close();
			fw_skipped_tn.close();
		} catch(Exception e) {
			e.printStackTrace();
		} 

		// Write AUC.csv file

	}

	private static void readFilterFile(String fname) throws Exception {
		productFilter = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new FileReader(fname));

		String pid_str = br.readLine();
		while(pid_str != null) {
			productFilter.add(Integer.parseInt(pid_str.trim()));
			pid_str = br.readLine();
		}
		br.close();
	}

	static BatchExperimentScenario scenario;

	public static Object[]  runBatch(EmpiricalDataset ed, int contaminationSource, int repeats, double noise) {
		ArrayList<List<Integer>> results = new ArrayList<List<Integer>>();
		ArrayList<List<List<Double>>> relativeProbs = new ArrayList<List<List<Double>>>();

		Object [] returnVal = new Object[2];

		if(scenario == null)
			scenario = new BatchExperimentScenario(ed);

		try {
			scenario.init(contaminationSource, contaminationSource);
			for (int i = 0; i < repeats; i++) {

				MLSourcePredictor pred = new MLSourcePredictor(
						scenario.getFoodDistributions(), contaminationSource);
				scenario.registerContaminationEventObserver(pred);
				scenario.runExperiment(noise, i);
				scenario.unregisterContaminationEventObserver(pred);
				results.add(pred.getHistory());

				ArrayList<List<Double>> runCaseReportProbs = new ArrayList<List<Double>>();
				relativeProbs.add(runCaseReportProbs);

				for(int j=0;j<BatchExperimentScenario.MAX_NO_OF_REPORTS;++j) {
					List<Double> relativeProbForReports = null;
					if(runCaseReportProbs.size() <=j) {
						relativeProbForReports = new ArrayList<Double>();
						runCaseReportProbs.add(relativeProbForReports);
					} else relativeProbForReports = runCaseReportProbs.get(j);
					double [] rp = pred.getRelativeProbabilityFor(j);

					int p=0;
					for(double d:rp) {
						rp[p]=Math.exp(rp[p]);
						++p;
					}
					p=0;
					//	if(relativeProbForReports.size() ==  0)
					//		for(double d:rp) relativeProbForReports.add(d);
					for(double d:rp) {
						relativeProbForReports.add(d);
					}
				}
			}

		} catch (MagicTableException e) {
			e.printStackTrace();
		}

		returnVal[0] = results;
		returnVal[1] = relativeProbs;
		return returnVal;
	}

	/**
	 * Compute sensitivity, i.e. the probability that a guilty product is correctly identified
	 * as such. 
	 * 
	 * Sensitivity = "true positives" divided by ("true positives" + "false negatives") 
	 * 
	 * True positives = Out of the 100 runs, how many times were the guilty product above the likelihood threshold
	 * False negatives = Out of the 100 runs, how many times were the guilty product below the likelihood threshold 
	 * 
	 * So denominator is just the total number of runs (100).
	 * 
	 * @param threshold
	 * @param probabilities
	 * @return
	 */
	private static double[] getSensitivities(double threshold,
			ArrayList<List<List<Double>>> probabilities) {
		// process results
		double[] res = new double[BatchExperimentScenario.MAX_NO_OF_REPORTS];
		double noOfExp = (double) probabilities.size();

		// Loop over each run
		ArrayList<Double> sensitivityForCaseReport = new ArrayList<Double>();


		for(int run=0;run<noOfExp;++run) {

			for(int caseReports = 0;caseReports <probabilities.get(run).size();++caseReports) {

				List<Double> runProbs = probabilities.get(run).get(caseReports);
				// Find max
				double max = -1;
				for(int j=0;j<runProbs.size();++j)
					//if(productFilter == null && runProbs.get(j) >max) 
					//	max=runProbs.get(j);
					//else if(productFilter != null && productFilter.contains(j) && runProbs.get(j) >max)
					//	max=runProbs.get(j);
					if(runProbs.get(j) >max) 
						max=runProbs.get(j);

				//size = runProbs.get(guiltyProd)/max;
				double add = 1;
				if(runProbs.get(guiltyProd) / max < threshold)
					add = 0;

				if(sensitivityForCaseReport.size()-1 < caseReports)
					sensitivityForCaseReport.add(add);
				else 
					sensitivityForCaseReport.set(caseReports, sensitivityForCaseReport.get(caseReports)+add);
			}
		}


		for(int i=0;i<res.length;++i) {
			res[i] = sensitivityForCaseReport.get(i)/noOfExp;
		}
		return res;
	}

	/**
	 * Compute specificity, i.e. the probability that a non-guilty product is correctly identified as such.
	 * 
	 * Specificity = "true negatives" divided by ("true negatives" + "false positives")
	 * 
	 * True negatives = the number of products below the likelihood threshold (that is not the guilty one)
	 * False positives = The number of products above the likelihood threshold (that is not the guilty one)
	 * 
	 * Average specificity over the 100 runs 
	 * 
	 * @param threshold
	 * @param probabilities
	 * @return
	 */
	private static Object[] getSpecificities(double threshold,
			ArrayList<List<List<Double>>> probabilities) {
		// process results
		Object [] result = new Object[2];
		double[] res1 = new double[BatchExperimentScenario.MAX_NO_OF_REPORTS];
		double [] res2 = new double[BatchExperimentScenario.MAX_NO_OF_REPORTS];

		double noOfExp = (double) probabilities.size();

		// Loop over each run
		ArrayList<Double> specificityForCaseReport = new ArrayList<Double>();
		ArrayList<Double> skippedTrueNegativesForCaseReport = new ArrayList<Double>();


		for(int run=0;run<noOfExp;++run) {
			for(int caseReports = 0;caseReports <probabilities.get(run).size();++caseReports) {
				List<Double> runProbs = probabilities.get(run).get(caseReports);
				// Find max
				double max = -1;
				for(int j=0;j<runProbs.size();++j)
					if(runProbs.get(j) >max) max=runProbs.get(j);

				double trueNegatives = 0.0;
				double falsePositives = 0.0;
				double skippedTrueNegatives = 0.0;
				for(int j=0;j<runProbs.size();++j) {
					//					if(productFilter != null && !productFilter.contains(j))
					//						continue;
					if(!DROP_ZERO_PROBABILITIES_FROM_SELECTIVITY && runProbs.get(j) / max < threshold && j != guiltyProd)
						++trueNegatives;
					else if(DROP_ZERO_PROBABILITIES_FROM_SELECTIVITY && runProbs.get(j) / max < threshold &&
							runProbs.get(j) > ZERO_THRESHOLD && j != guiltyProd)
						++trueNegatives;
					else if(DROP_ZERO_PROBABILITIES_FROM_SELECTIVITY && runProbs.get(j) / max < threshold &&
							runProbs.get(j) <= ZERO_THRESHOLD && j != guiltyProd)
						++skippedTrueNegatives;

					if(runProbs.get(j) / max >= threshold && j != guiltyProd)
						++falsePositives;
				}

				double specificity = 0;
				if(trueNegatives+falsePositives == 0.0)
					specificity = 1.0; // No product is non-guilty, so perfect specificity
				else
					specificity = trueNegatives/(trueNegatives+falsePositives);

				if(specificityForCaseReport.size()-1 < caseReports)
					specificityForCaseReport.add(specificity);
				else 
					specificityForCaseReport.set(caseReports, specificityForCaseReport.get(caseReports)+specificity);

				if(skippedTrueNegativesForCaseReport.size()-1 < caseReports)
					skippedTrueNegativesForCaseReport.add(skippedTrueNegatives);
				else 
					skippedTrueNegativesForCaseReport.set(caseReports, skippedTrueNegativesForCaseReport.get(caseReports)+skippedTrueNegatives);

			}
		}

		for(int i=0;i<res1.length;++i) {
			res1[i] = specificityForCaseReport.get(i)/noOfExp;
			res2[i] = skippedTrueNegativesForCaseReport.get(i)/noOfExp;
		}
		result[0] = res1;
		result[1] = res2;
		return result;
	}

}
