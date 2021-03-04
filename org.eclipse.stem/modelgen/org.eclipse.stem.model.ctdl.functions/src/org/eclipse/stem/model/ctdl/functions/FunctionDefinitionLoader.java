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


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class FunctionDefinitionLoader {
	public static final String EXTENSION_POINT_NAME = "org.eclipse.stem.model.ctdl.functions.functions";
	private static FunctionDefinitionLoader INSTANCE;

	private Map<String,List<ExternalFunctionDefinition>> functionDefinitions = new HashMap<String,List<ExternalFunctionDefinition>>();
	private ResourceSet resourceSet;
	private Resource defaultResource;

	private FunctionDefinitionLoader() 
	{
		load();
	}

	public static synchronized FunctionDefinitionLoader getInstance() 
	{
		//if (INSTANCE == null) {
			INSTANCE = new FunctionDefinitionLoader();
		//}
		return INSTANCE;
	}

	public Map<String,List<ExternalFunctionDefinition>> getDefinitions() 
	{
		return Collections.unmodifiableMap(functionDefinitions);
	}

	private void load() 
	{
		resourceSet = new ResourceSetImpl();
		defaultResource = resourceSet.createResource(URI
				.createURI("empty.extFunc"));

		IConfigurationElement[] extensions = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_POINT_NAME);

		for (IConfigurationElement extension : extensions) {
			ExternalFunctionDefinition functionDef = getDefinitionForExtension(extension);
			if (functionDef != null) {
				List<ExternalFunctionDefinition> definitionsByName = functionDefinitions.get(functionDef.getName());
				if (definitionsByName == null) {
					definitionsByName = new ArrayList<ExternalFunctionDefinition>();
					functionDefinitions.put(functionDef.getName(), definitionsByName);
				}
				definitionsByName.add(functionDef);
			}
		}
	}

	private ExternalFunctionDefinition getDefinitionForExtension(
			IConfigurationElement functionDef) 
	{

		ExternalFunctionDefinition functionDefinition = ExternalFunctionsFactory.eINSTANCE.createExternalFunctionDefinition();

		functionDefinition.setName(functionDef.getAttribute("name"));
		functionDefinition.setClassName(functionDef.getAttribute("className"));
		functionDefinition.setMethodName(functionDef.getAttribute("methodName"));
		functionDefinition.setExtPointDefinition(functionDef);

		try {
			populateFunctionArguments(functionDefinition);
			populateMethodArguments(functionDefinition);
			validateClassAndMethodSignature(functionDefinition);
		} catch (FunctionDefinitionException fde) {
			fde.printStackTrace();
			return null;
		}

		defaultResource.getContents().add(functionDefinition);
		return functionDefinition;

	}
	
	private void populateFunctionArguments(ExternalFunctionDefinition definition)
	{
		IConfigurationElement[] functionParamBlocks = definition.getExtPointDefinition()
				.getChildren("functionParams");
		if (functionParamBlocks.length > 0) {
			IConfigurationElement[] args = functionParamBlocks[0]
					.getChildren("functionParam");
			for (IConfigurationElement arg : args) {
				FunctionArgument fa = ExternalFunctionsFactory.eINSTANCE.createFunctionArgument();
				fa.setName(arg.getAttribute("name"));
				fa.setType(arg.getAttribute("type"));
				definition.getFunctionArguments().add(fa);
			}
		}
	}
	
	private void populateMethodArguments(ExternalFunctionDefinition definition) throws FunctionDefinitionException
	{
		IConfigurationElement[] generatedParamBlocks = definition.getExtPointDefinition()
				.getChildren("generatedParams");
		if (generatedParamBlocks.length > 0) {
			IConfigurationElement[] args = generatedParamBlocks[0]
					.getChildren("generatedParam");
			for (IConfigurationElement arg : args) {
				String mapsFrom = arg.getAttribute("mapsFrom");
				
				FunctionArgument fa = getParameterByName(mapsFrom, definition);

				if (fa != null) {
					FunctionArgumentReference ref = ExternalFunctionsFactory.eINSTANCE.createFunctionArgumentReference();
					ref.setArgIndex(definition.getFunctionArguments().indexOf(fa));
					ref.setRef(fa);
					ref.setType(fa.getType());
					definition.getJavaMethodArguments().add(ref);
				} else {
					Class<?> globalType = STEMDSLUtils.getGlobalSystemVariables().get(mapsFrom);
					if (globalType == null) {
						globalType = STEMDSLUtils.getGlobalUserVariables().get(mapsFrom);
					}
					if (globalType == null) {
						throw new FunctionDefinitionException("Unable to find parameter mapping for method parameter key "+ mapsFrom, definition);
					}
					
					SystemArgumentReference ref = ExternalFunctionsFactory.eINSTANCE.createSystemArgumentReference();
					ref.setMapsFrom(mapsFrom);
					ref.setType(globalType.getName());
					definition.getJavaMethodArguments().add(ref);
				}
			}
		}
	}

	private void validateClassAndMethodSignature(
			ExternalFunctionDefinition definition) throws FunctionDefinitionException 
	{

		Throwable parent = null;
		Class<?> functionClass = null;
		
		// Attempt 1:  Try to grab it reflectively by class name
		try {
			functionClass = Class.forName(definition.getClassName());
		} catch (ClassNotFoundException e) { } // continue 

		// Attempt 2:  Use the definition available from OSGi/plugin registry
		if (functionClass == null) {
			try {
				Object classInstance = definition.getExtPointDefinition().createExecutableExtension("className");
				if (classInstance != null) {
					functionClass = classInstance.getClass();
				}
			} catch (CoreException e) {
				// It may be useful to hold on to this
				parent = e;
			}

		}
		
		definition.setClass(functionClass);
		
		// If we still can't find it, then bail out.
		// TODO Decide if we can still proceed without the class instance
		if (definition.getClass_() == null) {
			throw new FunctionDefinitionException("Could not instantiate instance of function definition class for function "+ definition.getName(), definition, parent);
		}
		
		String[] declaredParams = getJavaMethodArgTypes(definition);
		
		Method foundMethod = null;
		for (Method method : functionClass.getMethods()) {
			if (method.getName().equals(definition.getMethodName()) // Check method name
					/*&& method.getReturnType() == double.class*/		// Check return type
					&& Modifier.isPublic(method.getModifiers())		// Check is public
					&& Modifier.isStatic(method.getModifiers())) 	// Check is static
			{
				Class<?>[] methodParams = method.getParameterTypes();
				if (methodParams.length == declaredParams.length) {
					boolean match = true;
					for (int idx=0; idx<methodParams.length; idx++) {
						if (!methodParameterMatch(methodParams[idx], declaredParams[idx])) {
							match = false;
							break;
						} else {
							definition.getJavaMethodArguments().get(idx).setJavaType(methodParams[idx]);
						}
					}
					if (match) {
						foundMethod = method;
						break;
					}		
				}
			}
		}
		
		definition.setMethod(foundMethod);
		
		if (definition.getMethod() == null) {
			throw new FunctionDefinitionException("Could not find an appropriate class method for definition "+ definition.getName(), definition);
		}
		
//		for () {
//			Class<?> asdf = m.getReturnType();
//
//			// if (asdf.getName())
//			System.out.println(m);
//		}

	}
	
	
	private boolean methodParameterMatch(Class<?> methodParam, String declaredParam) {
		if (methodParam.getName().equals(declaredParam)) {
			return true;
		}
		
		if (declaredParam.equals("compartment")) {
			if (methodParam == double.class || (methodParam == org.eclipse.emf.ecore.EAttribute.class)) {
				return true;
			}
		}
		
		return false;
	}
	
	private String[] getJavaMethodArgTypes(ExternalFunctionDefinition definition) throws FunctionDefinitionException 
	{
		String[] types = new String[definition.getJavaMethodArguments().size()];
		int idx = 0;
		for (JavaMethodArgument arg : definition.getJavaMethodArguments()) {
			types[idx++] = arg.getType();
		}
		return types;
	}

	private FunctionArgument getParameterByName(String name, ExternalFunctionDefinition def)
	{
		for (FunctionArgument param : def.getFunctionArguments()) {
			if (param.getName().equals(name)) {
				return param;
			}
		}
		return null;
	}

}
