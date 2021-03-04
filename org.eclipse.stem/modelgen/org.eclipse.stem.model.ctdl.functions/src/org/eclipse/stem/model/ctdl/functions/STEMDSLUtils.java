/*******************************************************************************
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 *******************************************************************************/
package org.eclipse.stem.model.ctdl.functions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class STEMDSLUtils 
{	
	private static final Map<String, Class<?>> GLOBAL_USER_VARS = new HashMap<String, Class<?>>();
	private static final Map<String, Class<?>> GLOBAL_SYSTEM_VARS = new HashMap<String, Class<?>>();
	static 
	{
		GLOBAL_USER_VARS.put("timeDelta", long.class);
		GLOBAL_USER_VARS.put("t", double.class);
		
		GLOBAL_SYSTEM_VARS
				.put("time", org.eclipse.stem.core.model.STEMTime.class);
		GLOBAL_SYSTEM_VARS.put("label",
				org.eclipse.stem.core.graph.Label.class);
		GLOBAL_SYSTEM_VARS.put("labelValue",
				org.eclipse.stem.core.graph.LabelValue.class);
		GLOBAL_SYSTEM_VARS.put("node",
				org.eclipse.stem.core.graph.Node.class);
		GLOBAL_SYSTEM_VARS.put("model",
				org.eclipse.stem.core.model.IntegrationDecorator.class);
	}
	
	public static Class<?> getTypeForGlobalVariable(String name)
	{
		Class<?> type = GLOBAL_USER_VARS.get(name);
		if (type == null) {
			type = GLOBAL_SYSTEM_VARS.get(name);
		}
		return type;
	}
	
	public static Map<String, Class<?>> getGlobalUserVariables()
	{
		return Collections.unmodifiableMap(GLOBAL_USER_VARS);
	}

	public static Map<String, Class<?>> getGlobalSystemVariables()
	{
		return Collections.unmodifiableMap(GLOBAL_SYSTEM_VARS);
	}
//	
//	public static String getNormalizedTypeNameForClass(Class<?> clazz)
//	{
//		if (clazz == null) {
//			return null;
//		}
//		
//		if (isNumber(clazz)) {
//			return "number";
//		} else if (clazz == String.class) {
//			return "string";
//		} else {
//			return clazz.getName();
//		}
//	}
//	
//	public static String getNormalizedTypeNameForClass(String className)
//	{
//		if (className == null) {
//			return null;
//		}
//		
//		if (isNumber(className)) {
//			return "number";
//		} else if (String.class.getName().equals(className)) {
//			return "string";
//		} else {
//			return className;
//		}
//	}
//	
//	public static List<String> classTypeNames = Arrays.asList(new String[] {
//		"double", "int", "float", "long", "short", 
//		"java.lang.Double", "java.lang.Integer", "java.lang.Float", "java.lang.Long", 
//		"java.lang.Short" 	
//	});
//	
//	public static boolean isNumber(String className)
//	{
//		return classTypeNames.contains(className);
//	}
//	
//	public static boolean isNumber(Class<?> clazz)
//	{
//		return (clazz == double.class || clazz == Double.class ||
//			    clazz == int.class || clazz == Integer.class ||
//				clazz == float.class || clazz == Float.class ||
//				clazz == long.class || clazz == Long.class ||
//				clazz == short.class || clazz == Short.class);
//				
//	}
//	
//	public static List<Compartment> getAllCompartmentsForGroup(
//			CompartmentGroup cg) {
//		List<Compartment> compartments = new ArrayList<Compartment>();
//		if (cg != null) {
//			compartments.addAll(getAllCompartmentsForGroup(cg.getParentGroup()));
//			compartments.addAll(cg.getCompartments());
//
//		}
//		return compartments;
//	}
//
//	public static List<Compartment> getAllCompartmentsForModel(Model model) {
//		return getAllCompartmentsForGroup(model.getCompartments());
//	}
//	
//	public static List<ModelParam> getAllParametersForModel(Model model) {
//		List<ModelParam> params = new ArrayList<ModelParam>();
//		if (model != null) {
//			params.addAll(getAllParametersForModel(model.getParentModel()));
//			params.addAll(model.getParameters());
//		}
//		return params;
//	}
//	
//	public static String ucfirst(String str)
//	{		
//		if (str.length() > 0 && Character.isLowerCase(str.codePointAt(0))) {
//			StringBuilder sb = new StringBuilder();
//			sb.appendCodePoint(Character.toUpperCase(str.codePointAt(0)));
//			sb.append(str.substring(1));
//			return sb.toString();
//		}
//		
//		return str;
//	}
//		
//	public static String lcfirst(String str)
//	{		
//		if (str.length() > 0 && Character.isUpperCase(str.codePointAt(0))) {
//			StringBuilder sb = new StringBuilder();
//			sb.appendCodePoint(Character.toLowerCase(str.codePointAt(0)));
//			sb.append(str.substring(1));
//			return sb.toString();
//		}
//		
//		return str;
//	}

}
