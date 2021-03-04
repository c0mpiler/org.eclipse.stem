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
package org.eclipse.stem.diseasemodels.poliodiseasemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabel;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OpvLabelValue;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.OralPolioVaccineModel;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioFactory;
import org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PolioPackageImpl extends EPackageImpl implements PolioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oralPolioVaccineModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opvLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opvLabelValueEClass = null;

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
	 * @see org.eclipse.stem.diseasemodels.poliodiseasemodel.PolioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PolioPackageImpl() {
		super(eNS_URI, PolioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PolioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PolioPackage init() {
		if (isInited) return (PolioPackage)EPackage.Registry.INSTANCE.getEPackage(PolioPackage.eNS_URI);

		// Obtain or create and register package
		PolioPackageImpl thePolioPackage = (PolioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PolioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PolioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePolioPackage.createPackageContents();

		// Initialize created meta-data
		thePolioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePolioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PolioPackage.eNS_URI, thePolioPackage);
		return thePolioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOralPolioVaccineModel() {
		return oralPolioVaccineModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOralPolioVaccineModel_EfficacyVaccine() {
		return (EAttribute)oralPolioVaccineModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOralPolioVaccineModel_ReversionRate() {
		return (EAttribute)oralPolioVaccineModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOralPolioVaccineModel_PartialSusceptibilityVaccine() {
		return (EAttribute)oralPolioVaccineModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOralPolioVaccineModel_TransRateVaccine() {
		return (EAttribute)oralPolioVaccineModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOralPolioVaccineModel_IncubRateVaccine() {
		return (EAttribute)oralPolioVaccineModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOralPolioVaccineModel_InfectRecoveryRateVaccine() {
		return (EAttribute)oralPolioVaccineModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOralPolioVaccineModel_ParalyticFractionVaccine() {
		return (EAttribute)oralPolioVaccineModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOralPolioVaccineModel_ParalyticFractionWild() {
		return (EAttribute)oralPolioVaccineModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpvLabel() {
		return opvLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpvLabelValue() {
		return opvLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpvLabelValue_Sv() {
		return (EAttribute)opvLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpvLabelValue_Ev() {
		return (EAttribute)opvLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpvLabelValue_V() {
		return (EAttribute)opvLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpvLabelValue_Pv() {
		return (EAttribute)opvLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpvLabelValue_Pw() {
		return (EAttribute)opvLabelValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolioFactory getPolioFactory() {
		return (PolioFactory)getEFactoryInstance();
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
		oralPolioVaccineModelEClass = createEClass(ORAL_POLIO_VACCINE_MODEL);
		createEAttribute(oralPolioVaccineModelEClass, ORAL_POLIO_VACCINE_MODEL__EFFICACY_VACCINE);
		createEAttribute(oralPolioVaccineModelEClass, ORAL_POLIO_VACCINE_MODEL__REVERSION_RATE);
		createEAttribute(oralPolioVaccineModelEClass, ORAL_POLIO_VACCINE_MODEL__PARTIAL_SUSCEPTIBILITY_VACCINE);
		createEAttribute(oralPolioVaccineModelEClass, ORAL_POLIO_VACCINE_MODEL__TRANS_RATE_VACCINE);
		createEAttribute(oralPolioVaccineModelEClass, ORAL_POLIO_VACCINE_MODEL__INCUB_RATE_VACCINE);
		createEAttribute(oralPolioVaccineModelEClass, ORAL_POLIO_VACCINE_MODEL__INFECT_RECOVERY_RATE_VACCINE);
		createEAttribute(oralPolioVaccineModelEClass, ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_VACCINE);
		createEAttribute(oralPolioVaccineModelEClass, ORAL_POLIO_VACCINE_MODEL__PARALYTIC_FRACTION_WILD);

		opvLabelEClass = createEClass(OPV_LABEL);

		opvLabelValueEClass = createEClass(OPV_LABEL_VALUE);
		createEAttribute(opvLabelValueEClass, OPV_LABEL_VALUE__SV);
		createEAttribute(opvLabelValueEClass, OPV_LABEL_VALUE__EV);
		createEAttribute(opvLabelValueEClass, OPV_LABEL_VALUE__V);
		createEAttribute(opvLabelValueEClass, OPV_LABEL_VALUE__PV);
		createEAttribute(opvLabelValueEClass, OPV_LABEL_VALUE__PW);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oralPolioVaccineModelEClass.getESuperTypes().add(theStandardPackage.getSEIR());
		opvLabelEClass.getESuperTypes().add(theStandardPackage.getSEIRLabel());
		opvLabelValueEClass.getESuperTypes().add(theStandardPackage.getSEIRLabelValue());

		// Initialize classes and features; add operations and parameters
		initEClass(oralPolioVaccineModelEClass, OralPolioVaccineModel.class, "OralPolioVaccineModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOralPolioVaccineModel_EfficacyVaccine(), theEcorePackage.getEDouble(), "efficacyVaccine", "1.0", 0, 1, OralPolioVaccineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOralPolioVaccineModel_ReversionRate(), theEcorePackage.getEDouble(), "reversionRate", "1e-4", 0, 1, OralPolioVaccineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOralPolioVaccineModel_PartialSusceptibilityVaccine(), theEcorePackage.getEDouble(), "partialSusceptibilityVaccine", "0.0", 0, 1, OralPolioVaccineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOralPolioVaccineModel_TransRateVaccine(), theEcorePackage.getEDouble(), "transRateVaccine", "1.0", 0, 1, OralPolioVaccineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOralPolioVaccineModel_IncubRateVaccine(), theEcorePackage.getEDouble(), "incubRateVaccine", "1.0", 0, 1, OralPolioVaccineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOralPolioVaccineModel_InfectRecoveryRateVaccine(), theEcorePackage.getEDouble(), "infectRecoveryRateVaccine", "22.81", 0, 1, OralPolioVaccineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOralPolioVaccineModel_ParalyticFractionVaccine(), theEcorePackage.getEDouble(), "paralyticFractionVaccine", "7.14e-7", 0, 1, OralPolioVaccineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOralPolioVaccineModel_ParalyticFractionWild(), theEcorePackage.getEDouble(), "paralyticFractionWild", "0.005", 0, 1, OralPolioVaccineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(opvLabelEClass, OpvLabel.class, "OpvLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(opvLabelValueEClass, OpvLabelValue.class, "OpvLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getOpvLabelValue_Sv(), theEcorePackage.getEDouble(), "sv", "0.0", 0, 1, OpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOpvLabelValue_Ev(), theEcorePackage.getEDouble(), "ev", "0.0", 0, 1, OpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOpvLabelValue_V(), theEcorePackage.getEDouble(), "v", "0.0", 0, 1, OpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOpvLabelValue_Pv(), theEcorePackage.getEDouble(), "pv", "0.0", 0, 1, OpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getOpvLabelValue_Pw(), theEcorePackage.getEDouble(), "pw", "0.0", 0, 1, OpvLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Create resource
		createResource(eNS_URI);
	}

} //PolioPackageImpl
