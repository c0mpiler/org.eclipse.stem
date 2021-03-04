package org.eclipse.stem.runtime.execute.compactjava;

import java.util.HashMap;

/**
 * Mapping from the STEM decorator EMF name to a runtime class used to calculate derivative
 * @author edlund
 */

public class DecoratorMapper {

	public static HashMap<String, String> nameClassMap;
	
	static {
		nameClassMap = new HashMap<String, String>();
		nameClassMap.put("DeterministicSEIRDiseaseModel", "org.eclipse.stem.runtime.execute.compactjava.DeterministicSEIRModel");
		nameClassMap.put("DengueModel", "org.eclipse.stem.runtime.execute.compactjava.DengueModel");
	}
}
