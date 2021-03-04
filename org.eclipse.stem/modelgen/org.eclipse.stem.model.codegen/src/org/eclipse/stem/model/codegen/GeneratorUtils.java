/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.codegen;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.stem.model.codegen.descriptor.EClassDescriptor;
import org.eclipse.stem.model.codegen.descriptor.JavaClassDescriptor;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Model;
import org.eclipse.stem.model.metamodel.Package;
import org.eclipse.stem.model.metamodel.Transition;

/**
 * Shared utilities for various common operations 
 * to assist with model generation
 *
 */
public class GeneratorUtils 
{
	
	
	public static GenClass getGenClassForMetamodelModel(Model model, GenModel gm) {
		List<GenPackage> genPackages = gm.getGenPackages();
		if (genPackages.size() > 0) {
			return getGenClassForMetamodelModel(model, genPackages.iterator().next());
		}
		return null;
	}
	public static GenClass getGenClassForMetamodelModel(Model model, GenPackage gp)
	{
		for (GenClass genClass : gp.getGenClasses()) {
			if (genClass.getName().equals(model.getName())) {
				return genClass;
			}
		}
		return null;
	}
	
	public static Model getMetamodelModelForGenClass(GenClass genClass, Package metamodel)
	{
		for (Model model : metamodel.getModels()) {
			if (genClass.getName().equals(model.getName())) {
				return model;
			}
		}
		return null;
	}
	
	public static Package loadMetamodel(URI uri) throws IOException {
		if (uri != null) {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(uri);
			resource.load(null);
			if (resource.getContents().size() > 0) {
				EObject obj = resource.getContents().get(0);
				EcoreUtil.resolveAll(obj);
	
				if (obj instanceof Package) {
					return (Package) obj;
				}
			}
		}
		return null;
	}
	
	public static GenModel loadGenModel(URI uri) throws IOException {
		if (uri != null) {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(uri);
			resource.load(null);
			if (resource.getContents().size() > 0) {
				EObject obj = resource.getContents().get(0);
				EcoreUtil.resolveAll(obj);
	
				if (obj instanceof GenModel) {
					return (GenModel)obj;
				}
			}
		}
		return null;
	}
	
	/**
	 * Converts a list of GenClasses to STEMGenClasses
	 * @param genClasses
	 * @return
	 */
	public static List<STEMGenClass> getSTEMGenClasses(List<GenClass> genClasses) {
		List<STEMGenClass> classes = new ArrayList<STEMGenClass>();
		for (GenClass gc : genClasses) {
			classes.add(STEMGenClass.get(gc));
		}
		return classes;
	}

	/**
	 * Finds all GenClasses that extend the given EClass inthis GenPackage
	 * @param pkg
	 * @param descriptor
	 * @return
	 */
	public static List<GenClass> findGenClassesThatExtendBaseType(
			GenPackage pkg, EClassDescriptor descriptor) {
		List<GenClass> classes = new ArrayList<GenClass>();
		for (GenClass genClass : pkg.getGenClasses()) {
			if (classExtends(genClass, descriptor)) {
				classes.add(genClass);
			}
		}

		return classes;
	}

	/**
	 * Gets the fully-qualified Java name for the given JavaClassDescriptor
	 * @param descriptor
	 * @return
	 */
	public static String getQualifiedJavaNameForDescriptor(
			JavaClassDescriptor descriptor) {
		if (descriptor != null) {
			return descriptor.getQualifiedClassName();
		}

		return null;
	}

	/**
	 * Gets the fully-qualified Java name for the given EClass within the context
	 * of the given GenPackage 
	 * 
	 * @param basePackage
	 * @param descriptor
	 * @return
	 */
	public static String getQualifiedJavaNameForDescriptor(
			GenPackage basePackage, EClassDescriptor descriptor) {
		if (descriptor != null) {
			GenClass gc = findGenClassForNSURI(basePackage,
					descriptor.getNSURI(), descriptor.getClassName());
			if (gc != null) {
				return gc.getQualifiedInterfaceName();
			}
		}

		return null;
	}

	/**
	 * Find the GenClass for the given NS URI / EClass name
	 * within the context of the given GenPackage
	 * @param baseGenPackage
	 * @param nsURI
	 * @param className
	 * @return
	 */
	public static GenClass findGenClassForNSURI(GenPackage baseGenPackage,
			String nsURI, String className) {
		GenPackage containerGenPackage = findGenPackageForNSURI(
				baseGenPackage, nsURI);
		if (containerGenPackage != null) {
			return findGenClassInPkg(containerGenPackage, className);
		}
		return null;
	}


//	public static boolean extendsConcreteImplementation(GenClass genClass,
//			String topLevelClass) {
//		if (classExtends(genClass, topLevelClass)) {
//			if (genClass.isAbstract() || genClass.isInterface()) {
//				for (GenClass g2 : genClass.getBaseGenClasses()) {
//					if (extendsConcreteImplementation(g2, topLevelClass)) {
//						return true;
//					}
//				}
//			} else {
//				return true;
//			}
//		}
//
//		return false;
//	}

//	public static boolean classExtends(GenClass genClass, String className) {
//		for (GenClass g2 : genClass.getAllBaseGenClasses()) {
//			if (g2.getQualifiedInterfaceName().equals(className)) {
//				return true;
//			}
//		}
//		return false;
//	}

//	public static boolean uriMatchesEPackage(EPackage pkg, String nsURI) {
//		return pkg.getNsURI().equals(nsURI);
//	}

	/**
	 * Whether or not the given EClass extends the GenClass
	 * @param genClass
	 * @param descriptor
	 * @return
	 */
	public static boolean classExtends(GenClass genClass,
			EClassDescriptor descriptor) {
		for (GenClass g2 : genClass.getAllBaseGenClasses()) {
			if (g2.getGenPackage().getNSURI().equals(descriptor.getNSURI())
					&& g2.getName().equals(descriptor.getClassName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets the list of GenClass from the EAnnotation map
	 * @param baseGenClass
	 * @param annotation
	 * @return
	 */
	public static Map<String, GenClass> getGenClassesForAnnotations(
			GenClass baseGenClass, EAnnotation annotation) {
		Map<String, GenClass> retVal = new HashMap<String, GenClass>();
		for (Entry<String, String> entry : annotation.getDetails().entrySet()) {
			GenClass match = findGenClass(baseGenClass.getGenPackage(),
					entry.getValue());
			retVal.put(entry.getKey(), match);
			if (match == null) {
				ModelGeneratorAdapter.addWarning("Unable to find class "
						+ entry.getValue() + " for " + baseGenClass.getName()
						+ "/" + annotation.getSource() + "/" + entry.getKey());
			}
		}

		return retVal;
	}

	/**
	 * Returns either the default or (if not found) first entry 
	 * from the given map
	 * 
	 * @param data
	 * @param defaultKey
	 * @return
	 */
	public static GenClass getDefaultOrFirstEntryFromMap(
			Map<String, GenClass> data, String defaultKey) {
		GenClass entry = getDefaultEntryFromMap(data, defaultKey);
		if (entry == null && data != null && data.size() > 0) {
			entry = data.values().iterator().next();
		}

		return entry;
	}

	/**
	 * Gets the default GenClass from the map for the given key
	 * @param data
	 * @param defaultKey
	 * @return
	 */
	public static GenClass getDefaultEntryFromMap(Map<String, GenClass> data,
			String defaultKey) {
		GenClass defaultEntry = null;
		if (data != null) {
			defaultEntry = data.get(defaultKey);
		}
		return defaultEntry;

	}

	/**
	 * Find and return the GenPackage for a given EMF Namespace URI
	 * within the scope of the given base Genpackage
	 * @param genPackage
	 * @param nsURI
	 * @return
	 */
	public static GenPackage findGenPackageForNSURI(
			GenPackage basePackage, String nsURI) {
		List<GenPackage> pkgs = basePackage.getGenModel().getUsedGenPackages();
		if (basePackage.getNSURI().equals(nsURI)) {
			return basePackage;
		}
		
		for (GenPackage pkg : pkgs) {
			if (pkg.getNSURI().equals(nsURI)) {
				return pkg;
			}
		}

		return null;
	}

	/**
	 * Attempts to find a matching GenPackage/EPackage for the given 
	 * Java package name.
	 * 
	 * @param genPackage
	 * @param packageName
	 * @return
	 */
	public static List<GenPackage> findGenPackageForJavaPackageName(
			GenPackage genPackage, String packageName) {
		List<GenPackage> pkgs = genPackage.getGenModel().getUsedGenPackages();
		List<GenPackage> candidates = new ArrayList<GenPackage>();
		if (genPackage.getClassPackageName().equals(packageName)
				|| genPackage.getInterfacePackageName().equals(packageName)) {
			candidates.add(genPackage);
		}

		for (GenPackage pkg : pkgs) {
			if (pkg.getClassPackageName().equals(packageName)
					|| pkg.getInterfacePackageName().equals(packageName)) {
				candidates.add(pkg);
			}
		}

		return candidates;
	}

	/**
	 * Attempts to find a matching GenClass/EClass for the given
	 * fully-qualified Java name.  This matches both interface as well as
	 * implementation name for the given Java Package.
	 * 
	 * Examples matches for ExampleClass include com.example.ExampleClass
	 * and com.example.impl.ExampleClassImpl.
	 * 
	 * @param genPackage
	 * @param className
	 * @return
	 */
	private static GenClass findGenClass(GenPackage genPackage, String className) {
		String pkgName = null;
		int pkgIdx = className.lastIndexOf('.');
		if (pkgIdx >= 0) {
			pkgName = className.substring(0, pkgIdx);
			className = className.substring(pkgIdx + 1);
		}

		List<GenPackage> pkgsToSearch = null;
		if (pkgName != null) {
			pkgsToSearch = findGenPackageForJavaPackageName(genPackage, pkgName);
		} else {
			pkgsToSearch = new ArrayList<GenPackage>();
			pkgsToSearch.add(genPackage);
			pkgsToSearch.addAll(genPackage.getGenModel().getUsedGenPackages());
		}

		GenClass cls = null;
		for (GenPackage pkg : pkgsToSearch) {
			cls = findGenClassInPkg(pkg, className);
			if (cls != null) {
				break;
			}
		}

		return cls;
	}

	/**
	 * @param genPkg
	 * @param className
	 * @return
	 */
	private static GenClass findGenClassInPkg(GenPackage genPkg,
			String className) {
		GenClass match = null;
		for (GenClass cls : genPkg.getGenClasses()) {
			if (cls.getName().equals(className)
					|| cls.getClassName().equals(className)
					|| cls.getInterfaceName().equals(className)) {
				match = cls;
				break;
			}
		}

		return match;
	}

	/**
	 * Whether the string is either null or contains no content (empty).
	 * @param s
	 * @return
	 */
	public static boolean isNullOrEmpty(String s) {
		return (s == null || CodeGenConstants.EMPTY_STRING.equals(s));
	}
	
	/**
	 * Transforms a string in condensed camel-case or Java identifier form
	 * into space-separated upper-case words.
	 * 
	 * Example:  thisIsAValue would returns "This Is A Value"
	 * 
	 * @param str String to format
	 * @return The formatted string in space-separated, upper-case words
	 */
	public static String formatToCapWords(String str) {
		StringBuilder sb = new StringBuilder();
		if (str.length() > 0) {
			sb.appendCodePoint(Character.toUpperCase(str.codePointAt(0)));
			for (int idx = 1; idx < str.length(); idx++) {
				int cp = str.codePointAt(idx);

				if (Character.isUpperCase(cp)
						&& (Character.isLowerCase(str.codePointAt(idx - 1)) || (str
								.length() > idx + 1 && Character
								.isLowerCase(str.codePointAt(idx + 1))))) {
					sb.append(' ');
				}

				sb.appendCodePoint(cp);
			}
		}
		return sb.toString();
	}
	
	/**
	 * Formats a string to camel case
	 * @param str
	 * @return
	 */
	public static String formatToCamelCase(String str)
	{
		StringBuilder sb = new StringBuilder();

		if (str.length() > 0) {
			
			boolean nextIsLC = true;
			boolean nextIsUC = false;
			for (int idx=0; idx<str.length(); idx++) {
				int cp = str.codePointAt(idx);
				if (Character.isJavaIdentifierPart(cp)) {
					if (nextIsLC) {
						sb.appendCodePoint(Character.toLowerCase(cp));
						nextIsLC = false;
					} else if (nextIsUC) {
						sb.appendCodePoint(Character.toUpperCase(cp));
						nextIsUC = false;
					} else {
						sb.appendCodePoint(cp);
					}
				} else {
					if (!nextIsLC) {
						nextIsUC = true;
					}
				}
			}
		}
		
		return sb.toString();
	}
	
	/**
	 * Formats a string to upper case words with no spaces.
	 * Example:  This is a test => ThisIsATest
	 * @param str
	 * @return
	 */
	public static String formatToUpperCaseWordsNoSpaces(String str)
	{
		str = formatToCamelCase(str);
		
		StringBuilder sb = new StringBuilder();
		if (str.length() > 0) {
			sb.appendCodePoint(Character.toUpperCase(str.codePointAt(0)));
			sb.append(str.substring(1));
		}
		
		return sb.toString();
	}
	
	/**
	 * Formats a string to a valid Java package name
	 * @param str String to format
	 * @return A formatted, valid Java package name
	 */
	public static String formatToJavaPackageName(String str)
	{
		boolean firstWhiteSpace = true;
		
		str = str.trim();
		
		StringBuilder sb = new StringBuilder();
		if (str != null) {
			for (int idx=0; idx<str.length(); idx++) {
				int c = str.codePointAt(idx);
				if (Character.isWhitespace(c)) {
					if (firstWhiteSpace) {
						sb.append('.');
						firstWhiteSpace = false;
					}
				} else if (c == '.' || Character.isJavaIdentifierPart(c)) {
					sb.appendCodePoint(c);
					firstWhiteSpace = true;
				}
			}
		}
		
		return sb.toString().toLowerCase();
	}
	
	/**
	 * Checks whether the string is a valid Java package name / identifer
	 * @param str String to validate
	 * @return Whether the string is a valid Java package name
	 */
	public static boolean isValidJavaPackageName(String str)
	{
		boolean valid = false;
		for (String token : str.split("\\.")) {
			if (isValidJavaName(token)) {
				valid = true;
			} else {
				valid = false;
				break;
			}
		}
		return valid;
	}
	
	/**
	 * Checks whether the string is a valid Java identifier
	 * @param str String to validate
	 * @return Whether the string is a valid Java identifier
	 */
	public static boolean isValidJavaName(String str)
	{
		boolean valid = false;
		if (str.length() > 0) {
			valid = Character.isJavaIdentifierStart(str.codePointAt(0));
			for (int idx=1; valid && idx<str.length(); idx++) {
				valid = Character.isJavaIdentifierPart(str.codePointAt(idx));
				if (!valid) {
					break;
				}
			}
		}
		return valid;
	}
	
	public static void safeClose(InputStream is) {
		try {
			is.close();
		} catch (Throwable t) {
			// do nothing
		}
	}
	
	public static STEMGenFeature findGenFeatureForEClass(String name, List<STEMGenFeature> features) {
		for (STEMGenFeature feature : features) {
			if (feature.getGenFeature().getName().equals(name)) {
				return feature;
			}
		}
		return null;
	}
	
	public static String getTransitionPrettyName(Transition t) {
		Compartment source = t.getSource();
		Compartment target = t.getTarget();
		
		String sourceName = "?";
		String targetName = "?";
		
		if (source != null) {
			sourceName = source.getName();
		}
		
		if (target != null) {
			targetName = target.getName();
		}
		
		return sourceName +" -> "+ targetName;
	}
}