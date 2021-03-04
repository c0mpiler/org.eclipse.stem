package org.eclipse.stem.utility.generators;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Calculate an average for the earth science data files in STEM
 * @author edlund
 *
 */
public class AverageESData {

	/**
	 * @param args
	 */
	@SuppressWarnings("nls")
	public static void main(String[] args) {
		
		if(args.length < 1) { 
			System.out.println("Usage: AverageESData <input earth science plugin folder> <out postfix>");
			System.exit(-1);
		}
		try {
			File dir = new File(args[0]);
			String out_postfix = "";
			if(args.length == 2)
				out_postfix = args[1];
			
			if(!dir.exists() || !dir.isDirectory()) {
				System.out.println("Not a valid directory");
				System.exit(-1);
			}
			
			// Just assume it's a valid STEM internal earth science data plugin
			
			File contryDir = new File(dir.getAbsolutePath()+File.separator+"resources"+File.separator+"data"+File.separator+"country");
			if(!contryDir.exists() || !contryDir.isDirectory()) {
				System.out.println("Not a valid directory: "+contryDir);
				System.exit(-1);
			}
			
			Map<String, FileWriter> fws = new HashMap<String, FileWriter>();
			for(String country:contryDir.list()) {
				if(country.startsWith(".")) continue;
				Map<String, Map<String, Double>> result = processDataFolder(contryDir.getAbsolutePath()+File.separator+country);
				for(String dttype:result.keySet()) {
					FileWriter fw = null;
					if(!fws.containsKey(dttype)) {
						fw = new FileWriter(dttype+out_postfix+".csv");
						fws.put(dttype, fw);
					} else fw = fws.get(dttype);
					for(String key:result.get(dttype).keySet()) {
						double res = result.get(dttype).get(key);
						fw.write(key+","+res+"\n");
						fw.flush();
					}
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	final static double MISSING_DATA = 99999.0;
	
	/**
	 * 
	 * @param folder
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("nls")
	private static Map<String, Map<String, Double>> processDataFolder(String folder) throws Exception {
		// First iterate all data files to find the highest admin level
		
		HashMap<String, Map<String, Double>> result = new HashMap<String, Map<String, Double>>();
		int adminHigh = -1;
		File dataDir = new File(folder);
		for(String dataFile:dataDir.list()) {
			if(dataFile.startsWith(".")) continue;
			int admin = -1;
			try {
				admin = Integer.parseInt(dataFile.charAt(4)+"");
			} catch(Exception e) {
				continue; // not valid file
			}
			if(admin > adminHigh) adminHigh = admin;
			if(adminHigh == 3 && dataFile.contains("USA")) adminHigh = 2; // Fix for VT
		}
		// Next process the highest admin files
		for(String dataFile:dataDir.list()) {
			if(dataFile.startsWith(".")) continue;
			int admin = -1; 
			try {
				admin = Integer.parseInt(dataFile.charAt(4)+"");
			} catch(Exception e) {
				continue; 
			}
			if(admin != adminHigh) continue;
			String dataFileAbsPath = dataDir.getAbsolutePath()+File.separator+dataFile;
			String datatype = null;
			try {
				datatype = dataFile.substring(6, dataFile.lastIndexOf("_"));
			} catch(Exception e) {
				datatype = dataFile.substring(6, dataFile.lastIndexOf(".")); // area file
			}
			if(!datatype.equals("area") && !datatype.equals("nighttemp") && !datatype.equals("rainfall") && !datatype.equals("temperature") && !datatype.equals("vegetation"))
				continue;
			Properties properties = new Properties();
			properties.load(new FileInputStream(dataFileAbsPath));
			for(Object o:properties.keySet()) {
				String prop = ((String)o).trim();
				if(prop.equals("RECORD_CLASSNAME") ||
						prop.equals("TITLE") ||
						prop.equals("VALID") ||
						prop.equals("ISOKEY") ||
						prop.equals("ADMIN_LEVEL") ||
						prop.equals("UNITS") ||
						prop.equals("DATA_TYPE")  ||
						prop.equals("SOURCE")
						) continue;
				
				String val = properties.getProperty(prop);
				String [] toks = val.split(",");
				double avg = 0;
				double samples = 0;
				if(!datatype.equals("area")) {
					for(int i=0;i<120;i+=10) {
						double value = Double.parseDouble(toks[i]);
						if(value != MISSING_DATA) {
							avg += value;
							++samples;
						}
					}
					if(samples != 0) avg = avg/samples;
					else avg = MISSING_DATA;
				} else avg = Double.parseDouble(val);
				
				Map<String, Double> dtmap = result.get(datatype);
				if(dtmap == null) {
					dtmap = new HashMap<String, Double>();
					result.put(datatype, dtmap);
				}
				dtmap.put(prop, avg);
			}
		}
		return result;
	}

}
