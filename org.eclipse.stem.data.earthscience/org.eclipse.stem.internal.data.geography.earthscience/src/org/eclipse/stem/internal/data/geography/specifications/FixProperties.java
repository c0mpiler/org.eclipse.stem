package org.eclipse.stem.internal.data.geography.specifications;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FixProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String startPattern = args[0];
			String append = args[1];
			String sourcedir = args[2];
			String filePat = args[3];
			
			File f = new File(sourcedir);
			
			if(f.isFile() && !f.isHidden())
				processFile(f, startPattern, append, filePat);
			else if(f.isDirectory()){
				processDir(f, startPattern, append, filePat);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void processDir(File f, String startPattern, String append, String filePat) throws IOException {
		for(String file:f.list()) {
			String fname = f.getCanonicalPath()+File.separator+file;
			File f2 = new File(fname);
			if(f2.isDirectory()) processDir(f2, startPattern, append, filePat);
			else if (f2.isFile() && !f2.isHidden())
				processFile(f2, startPattern, append, filePat);
		}
	}

	private static void processFile(File f, String startPattern, String append, String filePat) throws IOException {
		String canonicalName = f.getCanonicalPath();
		String name = f.getName();
		if(!name.contains(filePat)) return;
		
		String newDir = canonicalName.substring(0, canonicalName.indexOf(name))+File.separator+"tmp";
		String newName = newDir+File.separator+name;
		
		BufferedReader in = new BufferedReader(new FileReader(f));
		File newDirF = new File(newDir);
		if(!newDirF.exists()) newDirF.mkdirs();
		
		FileWriter out = new FileWriter(newName);
		
		String line = in.readLine();
		String nl = System.getProperty("line.separator");
		while(line != null) {
			if(line.startsWith(startPattern)) {
				out.write(line+nl);
				out.write(append);
				out.write(nl+nl);
			} else  
			out.write(line+nl);
			
			line = in.readLine();
		}
		in.close();
		out.flush();
		out.close();	
	}
}
