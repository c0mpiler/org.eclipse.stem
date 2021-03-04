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

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.stem.model.metamodel.CompartmentType;

/**
 * Wrapper for GenFeature. Provides STEM-specific methods for STEM's Model
 * Generator.
 * 
 */
public class STEMGenFeature {
	private GenFeature genFeature;
	private GenClass genClassContext;
	private STEMGenFeatureConstraint constraint;

	public STEMGenFeature(GenFeature genFeature, GenClass context) {
		this.genFeature = genFeature;
		this.genClassContext = context;
	}

	public static STEMGenFeature get(GenFeature genFeature) {
		return new STEMGenFeature(genFeature, null);
	}

	public static STEMGenFeature get(GenFeature genFeature, GenClass context) {
		return new STEMGenFeature(genFeature, context);
	}

	public GenClass getContextGenClass() {
		return genClassContext;
	}

	public GenFeature getGenFeature() {
		return genFeature;
	}

	public static List<String> getPrimitiveAccessorTypes() {
		return Arrays.asList(CodeGenConstants.PRIMITIVE_TYPES);
	}

	public CompartmentType getCompartmentType() {
		EAnnotation typeAnnotation = genFeature.getEcoreFeature()
				.getEAnnotation(
						CodeGenConstants.COMPARTMENT_TYPE_ANNOTATION_SOURCE);
		CompartmentType type = null;
		if (typeAnnotation != null) {
			type = CompartmentType.get(typeAnnotation.getDetails().get("type"));
		}
		if (type == null) {
			type = CompartmentType.STANDARD;
		}

		return type;
	}

	public boolean isIncidenceFeature() {
		return (getCompartmentType() == CompartmentType.INCIDENCE || genFeature
				.getName().toLowerCase().contains("incidence"));
	}

	public boolean isDiseaseDeathsFeature() {
		return (getCompartmentType() == CompartmentType.DEATHS || genFeature
				.getName().toLowerCase().contains("diseasedeath"));
	}

	public String getBaseType() {
		return genFeature.getImportedType(genClassContext);
	}

	public boolean hasPrimitiveAccessor() {
		return getPrimitiveAccessorTypes().contains(getBaseType());
	}

	public String getFullPrimitiveGetterName() {
		StringBuilder sb = new StringBuilder();
		sb.append(getPrimitiveGetterName());
		sb.append("(");
		sb.append(genClassContext.getQualifiedFeatureID(genFeature));
		sb.append(")");

		return sb.toString();
	}

	public String getFullPrimitiveSetterName(String parameterName) {
		StringBuilder sb = new StringBuilder();
		sb.append(getPrimitiveSetterName());
		sb.append("(");
		sb.append(genClassContext.getQualifiedFeatureID(genFeature));
		sb.append(", ");
		sb.append(parameterName);
		sb.append(")");

		return sb.toString();
	}

	public String getGetterName() {
		return genFeature.getGetAccessor();
	}

	public String getSetterName() {
		return "set" + genFeature.getAccessorName();
	}

	public String getFullGetterName() {
		StringBuilder sb = new StringBuilder();
		sb.append(getGetterName());
		sb.append("()");
		return sb.toString();
	}

	public String getFullSetterName(String parameterName) {
		StringBuilder sb = new StringBuilder();
		sb.append(getSetterName());
		sb.append("(");
		sb.append(parameterName);
		sb.append(")");
		return sb.toString();
	}

	public String getPrimitiveGetterName() {
		String type = getBaseType();
		List<String> types = getPrimitiveAccessorTypes();
		if (types.contains(type)) {
			return getPrimitiveGetterName(type);
		}
		return null;
	}

	public String getPrimitiveSetterName() {
		String type = getBaseType();
		List<String> types = getPrimitiveAccessorTypes();
		if (types.contains(type)) {
			return getPrimitiveSetterName(type);
		}
		return null;
	}

	public static String getPrimitiveAccessorName(String prefix,
			String primitiveName) {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		sb.append(primitiveName.substring(0, 1).toUpperCase());
		sb.append(primitiveName.substring(1).toLowerCase());
		return sb.toString();
	}

	public static String getPrimitiveGetterName(String primitive) {
		return getPrimitiveAccessorName("eGet", primitive);
	}

	public static String getPrimitiveSetterName(String primitive) {
		return getPrimitiveAccessorName("eSet", primitive);
	}

	public STEMGenFeatureConstraint getConstraint() {
		if (constraint == null) {
			EAnnotation annotation = genFeature.getEcoreFeature()
					.getEAnnotation(
							CodeGenConstants.CONSTRAINT_ANNOTATION_SOURCE);
			if (annotation != null) {
				constraint = new STEMGenFeatureConstraint(annotation, this);
			}
		}

		return constraint;
	}

	public static String getValueForAnnotationKey(EAnnotation annotation,
			String key) {
		if (annotation != null) {
			return annotation.getDetails().get(key);
		}

		return null;
	}

	private EAnnotation getMessagesAnnotation() {
		return genFeature.getEcoreFeature().getEAnnotation(
				CodeGenConstants.MESSAGES_ANNOTATION_SOURCE);
	}

	private String getMessageForKey(String key, String defaultMessage) {
		String retVal = getValueForAnnotationKey(getMessagesAnnotation(), key);
		if (GeneratorUtils.isNullOrEmpty(retVal)) {
			retVal = defaultMessage;
		}

		return retVal;
	}

	public String getUnitMessage() {
		return getMessageForKey(CodeGenConstants.MESSAGES_ANNOTATION_UNIT_KEY,
				CodeGenConstants.EMPTY_STRING);
	}

	public String getInvalidMessage() {
		return getMessageForKey(
				CodeGenConstants.MESSAGES_ANNOTATION_INVALID_KEY,
				getDefaultInvalidMessage());
	}

	public String getMissingMessage() {
		return getMessageForKey(
				CodeGenConstants.MESSAGES_ANNOTATION_MISSING_KEY,
				getDefaultMissingMessage());
	}

	public String getToolTipMessage() {
		return getMessageForKey(
				CodeGenConstants.MESSAGES_ANNOTATION_TOOLTIP_KEY,
				getDefaultToolTipMessage());
	}

	public String getNameMessage() {
		return getMessageForKey("name", getDefaultNameMessage());
	}

	public String getDefaultToolTipMessage() {
		return getNameMessage();
	}

	public String getDefaultMissingMessage() {
		return "A value for " + getNameMessage() + " is required";
	}

	public String getDefaultInvalidMessage() {
		return "The value for " + getNameMessage() + " is invalid";
	}

	public String getDefaultNameMessage() {
		return genFeature.getFormattedName();
	}

	public boolean isRequired() {
		return genFeature.getEcoreFeature().getLowerBound() > 0;
	}

	public static class STEMGenFeatureConstraint {
		public STEMGenFeature stemGenFeature;
		public EAnnotation annotation;

		public boolean hasMin = false;
		public boolean hasMax = false;
		public double minValue = Double.NEGATIVE_INFINITY;
		public double maxValue = Double.POSITIVE_INFINITY;

		public String regexPattern;

		public static final String MIN_VALUE_KEY = "min";
		public static final String MAX_VALUE_KEY = "max";
		public static final String REGEX_KEY = "regex";

		public STEMGenFeatureConstraint(EAnnotation annotation,
				STEMGenFeature stemGenFeature) {
			this.stemGenFeature = stemGenFeature;
			this.annotation = annotation;
			populate();
		}

		public void populate() {
			EMap<String, String> details = annotation.getDetails();

			String min = details.get(MIN_VALUE_KEY);
			if (min != null) {
				try {
					minValue = Double.parseDouble(min);
					hasMin = true;
				} catch (NumberFormatException nfe) {
				}
			}

			String max = details.get(MAX_VALUE_KEY);
			if (max != null) {
				try {
					maxValue = Double.parseDouble(max);
					hasMax = true;
				} catch (NumberFormatException nfe) {
				}
			}

			regexPattern = details.get(REGEX_KEY);

		}

		public boolean hasMin() {
			return hasMin;
		}

		public boolean hasMax() {
			return hasMax;
		}

		public double getMin() {
			return minValue;
		}

		public double getMax() {
			return maxValue;
		}

		public boolean isRequired() {
			return stemGenFeature.isRequired();
		}

	}
}
