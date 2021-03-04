package org.eclipse.stem.interventions.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.interventions.ControlGraphGenerator;
import org.eclipse.stem.interventions.InterventionsFactory;
import org.eclipse.stem.interventions.InterventionsPackage;
import org.eclipse.stem.interventions.PeriodicControlGraphGenerator;
import org.eclipse.stem.interventions.StandardInterventionLabel;
import org.eclipse.stem.interventions.StandardInterventionLabelValue;
import org.eclipse.stem.interventions.StandardPeriodicInterventionLabelValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterventionsFactoryImpl extends EFactoryImpl implements InterventionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterventionsFactory init() {
		try {
			InterventionsFactory theInterventionsFactory = (InterventionsFactory)EPackage.Registry.INSTANCE.getEFactory("http:///org/eclipse/stem/interventions.ecore"); 
			if (theInterventionsFactory != null) {
				return theInterventionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InterventionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsFactoryImpl() {
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
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL: return createStandardInterventionLabel();
			case InterventionsPackage.CONTROL_GRAPH_GENERATOR: return createControlGraphGenerator();
			case InterventionsPackage.STANDARD_INTERVENTION_LABEL_VALUE: return createStandardInterventionLabelValue();
			case InterventionsPackage.STANDARD_PERIODIC_INTERVENTION_LABEL_VALUE: return createStandardPeriodicInterventionLabelValue();
			case InterventionsPackage.PERIODIC_CONTROL_GRAPH_GENERATOR: return createPeriodicControlGraphGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardInterventionLabel createStandardInterventionLabel() {
		StandardInterventionLabelImpl standardInterventionLabel = new StandardInterventionLabelImpl();
		return standardInterventionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlGraphGenerator createControlGraphGenerator() {
		ControlGraphGeneratorImpl controlGraphGenerator = new ControlGraphGeneratorImpl();
		return controlGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardInterventionLabelValue createStandardInterventionLabelValue() {
		StandardInterventionLabelValueImpl standardInterventionLabelValue = new StandardInterventionLabelValueImpl();
		return standardInterventionLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardPeriodicInterventionLabelValue createStandardPeriodicInterventionLabelValue() {
		StandardPeriodicInterventionLabelValueImpl standardPeriodicInterventionLabelValue = new StandardPeriodicInterventionLabelValueImpl();
		return standardPeriodicInterventionLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicControlGraphGenerator createPeriodicControlGraphGenerator() {
		PeriodicControlGraphGeneratorImpl periodicControlGraphGenerator = new PeriodicControlGraphGeneratorImpl();
		return periodicControlGraphGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterventionsPackage getInterventionsPackage() {
		return (InterventionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InterventionsPackage getPackage() {
		return InterventionsPackage.eINSTANCE;
	}

} //InterventionsFactoryImpl
