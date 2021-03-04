package org.eclipse.stem.definitions.labels.impl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.definitions.labels.*;
import org.eclipse.stem.definitions.labels.AreaLabel;
import org.eclipse.stem.definitions.labels.AreaLabelValue;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabel;
import org.eclipse.stem.definitions.labels.CommonBorderRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.EarthScienceLabel;
import org.eclipse.stem.definitions.labels.EarthScienceLabelValue;
import org.eclipse.stem.definitions.labels.LabelsFactory;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.definitions.labels.PhysicalRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.PopulationLabel;
import org.eclipse.stem.definitions.labels.PopulationLabelValue;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationship;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabel;
import org.eclipse.stem.definitions.labels.RelativePhysicalRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabel;
import org.eclipse.stem.definitions.labels.RoadTransportRelationshipLabelValue;
import org.eclipse.stem.definitions.labels.TransportMode;
import org.eclipse.stem.definitions.labels.TransportRelationshipLabel;
import org.eclipse.stem.definitions.labels.TransportRelationshipLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelsFactoryImpl extends EFactoryImpl implements LabelsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LabelsFactory init() {
		try {
			LabelsFactory theLabelsFactory = (LabelsFactory)EPackage.Registry.INSTANCE.getEFactory(LabelsPackage.eNS_URI);
			if (theLabelsFactory != null) {
				return theLabelsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LabelsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LabelsPackage.AREA_LABEL: return createAreaLabel();
			case LabelsPackage.AREA_LABEL_VALUE: return createAreaLabelValue();
			case LabelsPackage.COMMON_BORDER_RELATIONSHIP_LABEL: return createCommonBorderRelationshipLabel();
			case LabelsPackage.COMMON_BORDER_RELATIONSHIP_LABEL_VALUE: return createCommonBorderRelationshipLabelValue();
			case LabelsPackage.POPULATION_LABEL: return createPopulationLabel();
			case LabelsPackage.POPULATION_LABEL_VALUE: return createPopulationLabelValue();
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL: return createRelativePhysicalRelationshipLabel();
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP_LABEL_VALUE: return createRelativePhysicalRelationshipLabelValue();
			case LabelsPackage.TRANSPORT_RELATIONSHIP_LABEL: return createTransportRelationshipLabel();
			case LabelsPackage.TRANSPORT_RELATIONSHIP_LABEL_VALUE: return createTransportRelationshipLabelValue();
			case LabelsPackage.PHYSICAL_RELATIONSHIP_LABEL_VALUE: return createPhysicalRelationshipLabelValue();
			case LabelsPackage.ROAD_TRANSPORT_RELATIONSHIP_LABEL: return createRoadTransportRelationshipLabel();
			case LabelsPackage.ROAD_TRANSPORT_RELATIONSHIP_LABEL_VALUE: return createRoadTransportRelationshipLabelValue();
			case LabelsPackage.EARTH_SCIENCE_LABEL: return createEarthScienceLabel();
			case LabelsPackage.EARTH_SCIENCE_LABEL_VALUE: return createEarthScienceLabelValue();
			case LabelsPackage.GENERIC_LABEL_VALUE: return createGenericLabelValue();
			case LabelsPackage.DOUBLE_LABEL_VALUE: return createDoubleLabelValue();
			case LabelsPackage.INTEGER_LABEL_VALUE: return createIntegerLabelValue();
			case LabelsPackage.LONG_LABEL_VALUE: return createLongLabelValue();
			case LabelsPackage.STRING_LABEL_VALUE: return createStringLabelValue();
			case LabelsPackage.KEY_VALUE_LABEL_VALUE: return createKeyValueLabelValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP:
				return createRelativePhysicalRelationshipFromString(eDataType, initialValue);
			case LabelsPackage.TRANSPORT_MODE:
				return createTransportModeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LabelsPackage.RELATIVE_PHYSICAL_RELATIONSHIP:
				return convertRelativePhysicalRelationshipToString(eDataType, instanceValue);
			case LabelsPackage.TRANSPORT_MODE:
				return convertTransportModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaLabel createAreaLabel() {
		AreaLabelImpl areaLabel = new AreaLabelImpl();
		return areaLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaLabelValue createAreaLabelValue() {
		AreaLabelValueImpl areaLabelValue = new AreaLabelValueImpl();
		return areaLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonBorderRelationshipLabel createCommonBorderRelationshipLabel() {
		CommonBorderRelationshipLabelImpl commonBorderRelationshipLabel = new CommonBorderRelationshipLabelImpl();
		return commonBorderRelationshipLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonBorderRelationshipLabelValue createCommonBorderRelationshipLabelValue() {
		CommonBorderRelationshipLabelValueImpl commonBorderRelationshipLabelValue = new CommonBorderRelationshipLabelValueImpl();
		return commonBorderRelationshipLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopulationLabel createPopulationLabel() {
		PopulationLabelImpl populationLabel = new PopulationLabelImpl();
		return populationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PopulationLabelValue createPopulationLabelValue() {
		PopulationLabelValueImpl populationLabelValue = new PopulationLabelValueImpl();
		return populationLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativePhysicalRelationshipLabel createRelativePhysicalRelationshipLabel() {
		RelativePhysicalRelationshipLabelImpl relativePhysicalRelationshipLabel = new RelativePhysicalRelationshipLabelImpl();
		return relativePhysicalRelationshipLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativePhysicalRelationshipLabelValue createRelativePhysicalRelationshipLabelValue() {
		RelativePhysicalRelationshipLabelValueImpl relativePhysicalRelationshipLabelValue = new RelativePhysicalRelationshipLabelValueImpl();
		return relativePhysicalRelationshipLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportRelationshipLabel createTransportRelationshipLabel() {
		TransportRelationshipLabelImpl transportRelationshipLabel = new TransportRelationshipLabelImpl();
		return transportRelationshipLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransportRelationshipLabelValue createTransportRelationshipLabelValue() {
		TransportRelationshipLabelValueImpl transportRelationshipLabelValue = new TransportRelationshipLabelValueImpl();
		return transportRelationshipLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalRelationshipLabelValue createPhysicalRelationshipLabelValue() {
		PhysicalRelationshipLabelValueImpl physicalRelationshipLabelValue = new PhysicalRelationshipLabelValueImpl();
		return physicalRelationshipLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoadTransportRelationshipLabel createRoadTransportRelationshipLabel() {
		RoadTransportRelationshipLabelImpl roadTransportRelationshipLabel = new RoadTransportRelationshipLabelImpl();
		return roadTransportRelationshipLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoadTransportRelationshipLabelValue createRoadTransportRelationshipLabelValue() {
		RoadTransportRelationshipLabelValueImpl roadTransportRelationshipLabelValue = new RoadTransportRelationshipLabelValueImpl();
		return roadTransportRelationshipLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EarthScienceLabel createEarthScienceLabel() {
		EarthScienceLabelImpl earthScienceLabel = new EarthScienceLabelImpl();
		return earthScienceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EarthScienceLabelValue createEarthScienceLabelValue() {
		EarthScienceLabelValueImpl earthScienceLabelValue = new EarthScienceLabelValueImpl();
		return earthScienceLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T> GenericLabelValue<T> createGenericLabelValue() {
		GenericLabelValueImpl<T> genericLabelValue = new GenericLabelValueImpl<T>();
		return genericLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleLabelValue createDoubleLabelValue() {
		DoubleLabelValueImpl doubleLabelValue = new DoubleLabelValueImpl();
		return doubleLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerLabelValue createIntegerLabelValue() {
		IntegerLabelValueImpl integerLabelValue = new IntegerLabelValueImpl();
		return integerLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongLabelValue createLongLabelValue() {
		LongLabelValueImpl longLabelValue = new LongLabelValueImpl();
		return longLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLabelValue createStringLabelValue() {
		StringLabelValueImpl stringLabelValue = new StringLabelValueImpl();
		return stringLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueLabelValue createKeyValueLabelValue() {
		KeyValueLabelValueImpl keyValueLabelValue = new KeyValueLabelValueImpl();
		return keyValueLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePhysicalRelationship createRelativePhysicalRelationshipFromString(EDataType eDataType, String initialValue) {
		RelativePhysicalRelationship result = RelativePhysicalRelationship.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativePhysicalRelationshipToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMode createTransportModeFromString(EDataType eDataType, String initialValue) {
		TransportMode result = TransportMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransportModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelsPackage getLabelsPackage() {
		return (LabelsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LabelsPackage getPackage() {
		return LabelsPackage.eINSTANCE;
	}

} //LabelsFactoryImpl
