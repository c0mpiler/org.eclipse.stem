package org.eclipse.stem.internal.data.geography.earthscience;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class GenerateUpdateXML {

	private static String INTERNAL_DATA_ID = "org.eclipse.stem.internal.data.geography.earthscience.";
	private static String DATA_ID = "org.eclipse.stem.data.geography.earthscience.";

	private static String[] HEADER = {
		"<?xml version=\"1.0\"?>",
		"  <project name=\"STEM Internal Earthscience Data\" default=\"update_all\">",
		"  <description>",
		"    Run all of the installed earthscience update.xml files",
		"  </description>",
		"",
		"  <!-- P r o j e c t  S p e c i f i c a t i o n s -->",
		"",
		"  <!-- The name of the project -->",
		"  <property name=\"project.name\" value=\"stem\" />",
		"",
		"  <!-- The prefix for fully qualified names -->",
		"  <property name=\"ID_ROOT\" value=\"org.eclipse.stem\" />",
		"",
		"  <!-- Are we running headless? -->",
		"  <condition property=\"runningHeadless\" >",
		"    <isset property=\"buildDirectory\" />",
		"  </condition>",
		"",
		"  <!-- The buildDirectory property is set in a headless build -->",
		"  <condition property=\"pluginRootDirectory\" value=\"${buildDirectory}/plugins\" else=\"..\">",
		"    <isset property=\"runningHeadless\" />",
		"  </condition>",
		"",
		"  <target name=\"update_all\" description=\"Run all of the child ant files\">"
	};

	private static String[] FOOTER = {
		"  </target>",
		"</project>"
	};




	public static void main(String[] args) {
		// CWD is the current working directory
		final String CWD = System.getProperty("user.dir"); //$NON-NLS-1$
		// WORKSPACE is the directory of the parent workspace
		final String WORKSPACE = CWD.substring(0, CWD.lastIndexOf(File.separator));


		try {
			BufferedWriter xml = new BufferedWriter (new FileWriter(CWD + File.separator + "updateEarthscienceData.xml"));

			for (String line : HEADER) {
				xml.write(line + "\n");
			}

			//detect all earthscience data plugins that exist in the workspace
			File f = new File(WORKSPACE);
			String [] dirs = f.list();
			Arrays.sort(dirs);
			for (String fn: dirs) {
				if (fn.startsWith(INTERNAL_DATA_ID)) {
					String ext = fn.substring(INTERNAL_DATA_ID.length());
					
					if (ext.equals("elevation")) {
						continue;
					}
					
					File test = new File (WORKSPACE + File.separator + DATA_ID + ext);

					if (test.exists()) {
						xml.write("    <ant dir=\"${pluginRootDirectory}/${ID_ROOT}.internal.data.geography.earthscience." + ext + "\" antfile=\"update.xml\"/>\n");
					} else {
						System.err.println("Internal data plugin exists, but target plugin is missing. \n" + "Expect target plugin '" + DATA_ID + ext + "' to exist for internal plugin '" + fn + "'.");
					}
				}

			}
			
			for (String line : FOOTER) {
				xml.write(line + "\n");
			}

			xml.flush();
			xml.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
