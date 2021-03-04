package org.eclipse.stem.core.scenario.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.stem.core.STEMXMIResourceFactoryImpl;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.tests.Activator;

/**
 * TestUtil
 * @author jhkauf
 *
 */
public class IntegrationTestUtil {
	
	
	protected static final String RUNTIME_WORKSPACE_PATH =  Platform.getLocation().toOSString();
	protected final static String REFERENCE_DIR = "./resources/"; //$NON-NLS-1$
	protected final static String sep = File.separator;
	
	
	/**
	 * This will create targetLocation if it does not already exist
	 * @param sourceDirectory source directory
	 * @param targetDirectory destination directory
	 * @throws IOException
	 * @throws CoreException 
	 */
    public static void copyDirectoryRecursive(File sourceDirectory , File targetDirectory)
    throws IOException, CoreException {
    	
        if (sourceDirectory.isDirectory()) {
            if (!targetDirectory.exists()) {
                targetDirectory.mkdir();
            }
            
            String[] children = sourceDirectory.list();
            for (int i=0; i<children.length; i++) {
                copyDirectoryRecursive(new File(sourceDirectory, children[i]),
                        new File(targetDirectory, children[i]));
            }
        } else {
            
            InputStream inputStream = new FileInputStream(sourceDirectory);
            OutputStream outputStream = new FileOutputStream(targetDirectory);
            
            // Copy the bits from instream to outstream
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, len);
            }
            inputStream.close();
            outputStream.close();
        }
      
    }//copyDirectory
    
    
    /**
     * 
     * @param sourceDirectory
     * @param targetDirectory
     * @throws IOException
     * @throws CoreException
     */
    public static void importProject(File sourceDirectory , File targetDirectory)  throws IOException, CoreException {
    	 
        if(targetDirectory.exists()) return; // already exists
    	if (sourceDirectory.isDirectory()) {
          copyDirectoryRecursive(sourceDirectory, targetDirectory);
        } 
        
        // done copying. Now create the Eclipse OSGi Project   
        String pathSTR = targetDirectory.getAbsolutePath()+"/.project";//$NON-NLS-1$
        IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(pathSTR));
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
        project.create(description, null);
        project.open(null);
     }//copyDirectory
    
    /**
     * @param projectDirectory
     * @throws IOException
     * @throws CoreException
     */
    public static void refreshProject(File projectDirectory)  throws IOException, CoreException {
    	 // refresh the project
        String pathSTR = projectDirectory.getAbsolutePath()+"/.project";//$NON-NLS-1$
        IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(pathSTR));
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
        project.refreshLocal(IResource.DEPTH_INFINITE, null);
     }//copyDirectory
    
    /**
     * 
     * @param targetDirectory
     * @throws CoreException 
     * 
     */
    public static boolean removeDirectory(File targetDirectory) throws CoreException  {
    	
    	String pathSTR = targetDirectory.getAbsolutePath()+"/.project"; //$NON-NLS-1$
        IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(pathSTR));
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
    	project.delete(true, true, null);
    	if(targetDirectory.exists()) {
    		return targetDirectory.delete();
    	}
    	return true;
    }
    
    /**
	 * @return an {@link Scenario} for testing.
	 */
	public static List<File> setUpWorkspace() {
		
		List<File> projectDirectories = new ArrayList<File>();
		// 1. copy the project folders for the experiment to run 
		//    FROM the source directory TO the runtime workspace where ever that is
		File refDirectory = new File(IntegrationTestUtil.REFERENCE_DIR);
		if (refDirectory.isDirectory()) {
			// should always be true
			File[] projects = refDirectory.listFiles();
			if(projects==null) {
				Activator.logInformation("Error:AutomatedExperiment projects not found !!");//$NON-NLS-1$
				System.exit(1);
			}
			for (int i = 0; i < projects.length; i ++) {
				if(projects[i].isDirectory()) {
					// check that this is not a system directory with name beginning with "."
					String nameStr = projects[i].getName();
					
					if(!nameStr.substring(0,1).equals(".")) {//$NON-NLS-1$
						// this is a good directory
						String runProjectName = IntegrationTestUtil.RUNTIME_WORKSPACE_PATH+sep+nameStr;
						File targetDirectory = new File(runProjectName);
							try {
								// 1. create the project and folder
								IntegrationTestUtil.importProject(projects[i], targetDirectory);
								// 2. remember it
								projectDirectories.add(targetDirectory);
								Activator.logInformation("found "+targetDirectory.getAbsolutePath());
								
							} catch (Exception e) {
								Activator.logInformation("Project Copy failed "+e.getMessage());//$NON-NLS-1$
								e.printStackTrace();
								
							}
						}
						
						
					}// if good dir name
					
				}// for all projects
		}//if
		return projectDirectories;
	}// setUpWorkspace
	
	/**
	 * @return an {@link Scenario} for testing.
	 */
	public static void refreshWorkspace(List<File> projects) {
		
		
		for (int i = 0; i < projects.size(); i++) {
			if (projects.get(i).isDirectory()) {
				// check that this is not a system directory with name beginning
				// with "."
				String nameStr = projects.get(i).getName();

				if (!nameStr.substring(0, 1).equals(".")) {//$NON-NLS-1$
					// this is a good directory
					String runProjectName = IntegrationTestUtil.RUNTIME_WORKSPACE_PATH + sep + nameStr;
					File targetDirectory = new File(runProjectName);
					try {
						// 1. create the project and folder
						IntegrationTestUtil.refreshProject(targetDirectory);
						Activator.logInformation("found "+ targetDirectory.getAbsolutePath());
					} catch (Exception e) {
						Activator.logInformation("Project Copy failed " + e.getMessage());//$NON-NLS-1$
						e.printStackTrace();
					}
				}

			}// if good dir name

		}// for all projects
		
		
	}// setUpWorkspace
	
	/**
	 * 
	 * @param projects
	 * @return
	 */
	public static List<String> readScenarios(List<File> projects, String scenario_folder) {
			List<String> scenarioList = new ArrayList<String>();
			for (int i=0; i < projects.size(); i ++ ) {
				File project = projects.get(i);
				String path = project.getAbsolutePath();
				File scenarioFolder = new File(path+scenario_folder);
				if(scenarioFolder.exists()&&scenarioFolder.isDirectory()) {
					File[] scenariosToRun = scenarioFolder.listFiles();
					if(scenariosToRun != null) {
						for (int j = 0; j <scenariosToRun.length; j++) {
							File scenario = scenariosToRun[j];
							if(scenario.getName().indexOf(".scenario")>=1) {
								// this really is a scenario file
								scenarioList.add(scenario.getAbsolutePath());
							}//if scenario
						}// for all
					}//  list not null
					
				}// if scenario folder
			}// for all projects
			
			return scenarioList;
	}//readScenarios

	
	/**
	 * 
	 * @param filename
	 * @return
	 */
	public static Scenario loadScenario(final String filename) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", //$NON-NLS-1$
				STEMXMIResourceFactoryImpl.INSTANCE);
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("platform", //$NON-NLS-1$
				STEMXMIResourceFactoryImpl.INSTANCE);
		final Resource resource = resourceSet.getResource(URI.createFileURI(filename), true);
		try 
		{			
			resource.load(null);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		Scenario toReturn = (Scenario)resource.getContents().get(0);
		return toReturn;
	}

}// TestUtil
