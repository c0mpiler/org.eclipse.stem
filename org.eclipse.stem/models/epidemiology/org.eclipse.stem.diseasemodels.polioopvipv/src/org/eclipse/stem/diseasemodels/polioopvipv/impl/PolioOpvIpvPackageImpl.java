/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.experiment.ExperimentPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.logger.LoggerPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.predicate.PredicatePackage;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.sequencer.SequencerPackage;
import org.eclipse.stem.core.solver.SolverPackage;
import org.eclipse.stem.core.trigger.TriggerPackage;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvDiseaseModel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvFactory;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabel;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue;
import org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolioOpvIpvPackageImpl extends EPackageImpl implements PolioOpvIpvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polioOpvIpvLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polioOpvIpvLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polioOpvIpvDiseaseModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolioOpvIpvPackageImpl() {
		super(eNS_URI, PolioOpvIpvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PolioOpvIpvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolioOpvIpvPackage init() {
		if (isInited) return (PolioOpvIpvPackage)EPackage.Registry.INSTANCE.getEPackage(PolioOpvIpvPackage.eNS_URI);

		// Obtain or create and register package
		PolioOpvIpvPackageImpl thePolioOpvIpvPackage = (PolioOpvIpvPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolioOpvIpvPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolioOpvIpvPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();
		DiseasepredicatesPackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		ExperimentPackage.eINSTANCE.eClass();
		GraphPackage.eINSTANCE.eClass();
		ModelPackage.eINSTANCE.eClass();
		ModifierPackage.eINSTANCE.eClass();
		PredicatePackage.eINSTANCE.eClass();
		ScenarioPackage.eINSTANCE.eClass();
		SequencerPackage.eINSTANCE.eClass();
		TriggerPackage.eINSTANCE.eClass();
		SolverPackage.eINSTANCE.eClass();
		LoggerPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePolioOpvIpvPackage.createPackageContents();

		// Initialize created meta-data
		thePolioOpvIpvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolioOpvIpvPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolioOpvIpvPackage.eNS_URI, thePolioOpvIpvPackage);
		return thePolioOpvIpvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolioOpvIpvLabel() {
		return polioOpvIpvLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolioOpvIpvLabelValue() {
		return polioOpvIpvLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Sopv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Eopv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Vopv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Popv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Pw() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Sipv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Eipv_w() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Cipv_w() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Eipv_opv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Cipv_opv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Incidence_opv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Incidence_ipv_w() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvLabelValue_Incidence_ipv_opv() {
		return (EAttribute)polioOpvIpvLabelValueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolioOpvIpvDiseaseModel() {
		return polioOpvIpvDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_OpvEfficacy() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_ReversionRateOPV() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_BirthDeathRateDeveloping() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_TransmissionRateOPV() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_TransmissionRateWild() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_RelativeSusceptibilityRecentOPV() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_RelativeSusceptibilityIPV() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_IncubationRateVaccine() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_IncubationRateWild() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_RecoveryRateVaccine() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_RecoveryRateWild() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_ParalyticIncidenceFromVaccine() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolioOpvIpvDiseaseModel_ParalyticCaseProportion() {
		return (EAttribute)polioOpvIpvDiseaseModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioOpvIpvFactory getPolioOpvIpvFactory() {
		return (PolioOpvIpvFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		polioOpvIpvLabelEClass = createEClass(POLIO_OPV_IPV_LABEL);

		polioOpvIpvLabelValueEClass = createEClass(POLIO_OPV_IPV_LABEL_VALUE);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__SOPV);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__EOPV);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__VOPV);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__POPV);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__PW);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__SIPV);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__EIPV_W);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__CIPV_W);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__EIPV_OPV);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__CIPV_OPV);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_OPV);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_W);
		createEAttribute(polioOpvIpvLabelValueEClass, POLIO_OPV_IPV_LABEL_VALUE__INCIDENCE_IPV_OPV);

		polioOpvIpvDiseaseModelEClass = createEClass(POLIO_OPV_IPV_DISEASE_MODEL);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__OPV_EFFICACY);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__REVERSION_RATE_OPV);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__BIRTH_DEATH_RATE_DEVELOPING);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_OPV);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__TRANSMISSION_RATE_WILD);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_RECENT_OPV);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__RELATIVE_SUSCEPTIBILITY_IPV);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_VACCINE);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__INCUBATION_RATE_WILD);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_VACCINE);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__RECOVERY_RATE_WILD);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_INCIDENCE_FROM_VACCINE);
		createEAttribute(polioOpvIpvDiseaseModelEClass, POLIO_OPV_IPV_DISEASE_MODEL__PARALYTIC_CASE_PROPORTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		polioOpvIpvLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		polioOpvIpvLabelValueEClass.getESuperTypes().add(theStandardPackage.getSEIRLabelValue());
		polioOpvIpvDiseaseModelEClass.getESuperTypes().add(theStandardPackage.getSEIR());

		// Initialize classes and features; add operations and parameters
		initEClass(polioOpvIpvLabelEClass, PolioOpvIpvLabel.class, "PolioOpvIpvLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(polioOpvIpvLabelValueEClass, PolioOpvIpvLabelValue.class, "PolioOpvIpvLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolioOpvIpvLabelValue_Sopv(), ecorePackage.getEDouble(), "Sopv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Eopv(), ecorePackage.getEDouble(), "Eopv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Vopv(), ecorePackage.getEDouble(), "Vopv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Popv(), ecorePackage.getEDouble(), "Popv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Pw(), ecorePackage.getEDouble(), "Pw", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Sipv(), ecorePackage.getEDouble(), "Sipv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Eipv_w(), ecorePackage.getEDouble(), "Eipv_w", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Cipv_w(), ecorePackage.getEDouble(), "Cipv_w", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Eipv_opv(), ecorePackage.getEDouble(), "Eipv_opv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Cipv_opv(), ecorePackage.getEDouble(), "Cipv_opv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Incidence_opv(), ecorePackage.getEDouble(), "Incidence_opv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Incidence_ipv_w(), ecorePackage.getEDouble(), "Incidence_ipv_w", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvLabelValue_Incidence_ipv_opv(), ecorePackage.getEDouble(), "Incidence_ipv_opv", null, 0, 1, PolioOpvIpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polioOpvIpvDiseaseModelEClass, PolioOpvIpvDiseaseModel.class, "PolioOpvIpvDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolioOpvIpvDiseaseModel_OpvEfficacy(), ecorePackage.getEDouble(), "opvEfficacy", "0.9", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_ReversionRateOPV(), ecorePackage.getEDouble(), "reversionRateOPV", "10e-4", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_BirthDeathRateDeveloping(), ecorePackage.getEDouble(), "birthDeathRateDeveloping", "0.04", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_TransmissionRateOPV(), ecorePackage.getEDouble(), "transmissionRateOPV", "0.1", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_TransmissionRateWild(), ecorePackage.getEDouble(), "transmissionRateWild", "0.5", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_RelativeSusceptibilityRecentOPV(), ecorePackage.getEDouble(), "relativeSusceptibilityRecentOPV", "0.25", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_RelativeSusceptibilityIPV(), ecorePackage.getEDouble(), "relativeSusceptibilityIPV", "0.95", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_IncubationRateVaccine(), ecorePackage.getEDouble(), "incubationRateVaccine", "0.1", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_IncubationRateWild(), ecorePackage.getEDouble(), "incubationRateWild", "0.5", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_RecoveryRateVaccine(), ecorePackage.getEDouble(), "recoveryRateVaccine", "0.143", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_RecoveryRateWild(), ecorePackage.getEDouble(), "recoveryRateWild", "0.625", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_ParalyticIncidenceFromVaccine(), ecorePackage.getEDouble(), "paralyticIncidenceFromVaccine", "7.14e-7", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolioOpvIpvDiseaseModel_ParalyticCaseProportion(), ecorePackage.getEDouble(), "paralyticCaseProportion", "0.005", 0, 1, PolioOpvIpvDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eclipse.stem.model.generated
		createOrgAnnotations();
		// org.eclipse.stem.model.compartmentType
		createOrg_1Annotations();
		// org.eclipse.stem.model.label
		createOrg_2Annotations();
		// org.eclipse.stem.model.labelvalue
		createOrg_3Annotations();
		// org.eclipse.stem.models.feature.constraint
		createOrg_4Annotations();
		// org.eclipse.stem.models.feature.messages
		createOrg_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.stem.model.generated</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.stem.model.generated";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (polioOpvIpvLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (polioOpvIpvLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Sopv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Eopv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Vopv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Popv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Pw(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Sipv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Eipv_w(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Cipv_w(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Eipv_opv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (getPolioOpvIpvLabelValue_Cipv_opv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });			
		addAnnotation
		  (getPolioOpvIpvLabelValue_Incidence_opv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });			
		addAnnotation
		  (getPolioOpvIpvLabelValue_Incidence_ipv_w(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });			
		addAnnotation
		  (getPolioOpvIpvLabelValue_Incidence_ipv_opv(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (polioOpvIpvDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_OpvEfficacy(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ReversionRateOPV(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_BirthDeathRateDeveloping(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_TransmissionRateOPV(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_TransmissionRateWild(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RelativeSusceptibilityRecentOPV(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RelativeSusceptibilityIPV(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_IncubationRateVaccine(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_IncubationRateWild(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RecoveryRateVaccine(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RecoveryRateWild(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ParalyticIncidenceFromVaccine(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ParalyticCaseProportion(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.stem.model.compartmentType</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_1Annotations() {
		String source = "org.eclipse.stem.model.compartmentType";															
		addAnnotation
		  (getPolioOpvIpvLabelValue_Incidence_opv(), 
		   source, 
		   new String[] {
			 "type", "Incidence"
		   });			
		addAnnotation
		  (getPolioOpvIpvLabelValue_Incidence_ipv_w(), 
		   source, 
		   new String[] {
			 "type", "Incidence"
		   });			
		addAnnotation
		  (getPolioOpvIpvLabelValue_Incidence_ipv_opv(), 
		   source, 
		   new String[] {
			 "type", "Incidence"
		   });																																											
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.stem.model.label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_2Annotations() {
		String source = "org.eclipse.stem.model.label";																					
		addAnnotation
		  (polioOpvIpvDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "PolioOpvIpvLabel"
		   });																																									
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.stem.model.labelvalue</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_3Annotations() {
		String source = "org.eclipse.stem.model.labelvalue";																						
		addAnnotation
		  (polioOpvIpvDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "PolioOpvIpvLabelValue"
		   });																																								
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.stem.models.feature.constraint</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_4Annotations() {
		String source = "org.eclipse.stem.models.feature.constraint";																								
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_OpvEfficacy(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ReversionRateOPV(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_BirthDeathRateDeveloping(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_TransmissionRateOPV(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_TransmissionRateWild(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RelativeSusceptibilityRecentOPV(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RelativeSusceptibilityIPV(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_IncubationRateVaccine(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_IncubationRateWild(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RecoveryRateVaccine(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RecoveryRateWild(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ParalyticIncidenceFromVaccine(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ParalyticCaseProportion(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });		
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.stem.models.feature.messages</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_5Annotations() {
		String source = "org.eclipse.stem.models.feature.messages";																									
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_OpvEfficacy(), 
		   source, 
		   new String[] {
			 "name", "Efficacy of live-attenuated vaccine (a)"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ReversionRateOPV(), 
		   source, 
		   new String[] {
			 "name", "OPV Reversion Rate (\u03c6)"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_BirthDeathRateDeveloping(), 
		   source, 
		   new String[] {
			 "name", "Birth-Death Rate - Developing Countries (\u03bc)"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_TransmissionRateOPV(), 
		   source, 
		   new String[] {
			 "name", "Transmission Rate - OPV Derived Virus (\u03b2opv)"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_TransmissionRateWild(), 
		   source, 
		   new String[] {
			 "name", "Transmission Rate - Wild Virus (\u03b2w)"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RelativeSusceptibilityRecentOPV(), 
		   source, 
		   new String[] {
			 "name", "Relative Susceptibility - Recent OPV Infection (fr)"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RelativeSusceptibilityIPV(), 
		   source, 
		   new String[] {
			 "name", "Relative Susceptibility - IPV Only (fi)"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_IncubationRateVaccine(), 
		   source, 
		   new String[] {
			 "name", "Incubation Rate - Vaccine (\u03c3v)",
			 "tooltip", "Incubation rate of vaccine-derived poliovirus"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_IncubationRateWild(), 
		   source, 
		   new String[] {
			 "name", "Incubation Rate - Wild (\u03c3w)",
			 "tooltip", "Incubation rate of wild poliovirus"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RecoveryRateVaccine(), 
		   source, 
		   new String[] {
			 "name", "Recovery Rate - Vaccine (\u03b3v)",
			 "tooltip", "Recovery Rate of vaccine-derived poliovirus"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_RecoveryRateWild(), 
		   source, 
		   new String[] {
			 "name", "Recovery Rate - Wild (\u03b3w)",
			 "tooltip", "Recovery Rate of wild poliovirus"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ParalyticIncidenceFromVaccine(), 
		   source, 
		   new String[] {
			 "name", "Paralytic Incidences in Newly Vaccinated (\u03b5)"
		   });				
		addAnnotation
		  (getPolioOpvIpvDiseaseModel_ParalyticCaseProportion(), 
		   source, 
		   new String[] {
			 "name", "Proportion of Paralytic Polio cases (\u03c0para)"
		   });	
	}

} //PolioOpvIpvPackageImpl
