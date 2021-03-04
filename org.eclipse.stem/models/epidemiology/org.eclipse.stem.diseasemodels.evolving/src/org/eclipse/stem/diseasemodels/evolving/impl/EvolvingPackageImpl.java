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
package org.eclipse.stem.diseasemodels.evolving.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingDiseaseTransformer;
import org.eclipse.stem.diseasemodels.evolving.EvolvingFactory;
import org.eclipse.stem.diseasemodels.evolving.EvolvingPackage;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSEIRDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.evolving.EvolvingSIRDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolvingPackageImpl extends EPackageImpl implements EvolvingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingDiseaseTransformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSIDiseaseModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSIDiseaseModelLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSIDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSIRDiseaseModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSIRDiseaseModelLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSIRDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSEIRDiseaseModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSEIRDiseaseModelLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolvingSEIRDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanArrayEDataType = null;

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
	 * @see org.eclipse.stem.diseasemodels.evolving.EvolvingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EvolvingPackageImpl() {
		super(eNS_URI, EvolvingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EvolvingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EvolvingPackage init() {
		if (isInited) return (EvolvingPackage)EPackage.Registry.INSTANCE.getEPackage(EvolvingPackage.eNS_URI);

		// Obtain or create and register package
		EvolvingPackageImpl theEvolvingPackage = (EvolvingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EvolvingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EvolvingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEvolvingPackage.createPackageContents();

		// Initialize created meta-data
		theEvolvingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEvolvingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EvolvingPackage.eNS_URI, theEvolvingPackage);
		return theEvolvingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingDiseaseTransformer() {
		return evolvingDiseaseTransformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvolvingDiseaseTransformer_BaseDisease() {
		return (EReference)evolvingDiseaseTransformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvolvingDiseaseTransformer_EvolvedDiseases() {
		return (EReference)evolvingDiseaseTransformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingDiseaseTransformer_EvolutionCount() {
		return (EAttribute)evolvingDiseaseTransformerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingDiseaseTransformer_EvolutionCountHardLimit() {
		return (EAttribute)evolvingDiseaseTransformerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingDiseaseTransformer_StopAllEvolution() {
		return (EAttribute)evolvingDiseaseTransformerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingDiseaseModel() {
		return evolvingDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvolvingDiseaseModel_ParentDisease() {
		return (EReference)evolvingDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvolvingDiseaseModel_Transformer() {
		return (EReference)evolvingDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvolvingDiseaseModel_EvolvedAt() {
		return (EReference)evolvingDiseaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingDiseaseModel_EvolutionCount() {
		return (EAttribute)evolvingDiseaseModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSIDiseaseModelLabel() {
		return evolvingSIDiseaseModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSIDiseaseModelLabelValue() {
		return evolvingSIDiseaseModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingDiseaseModel_Genome() {
		return (EAttribute)evolvingDiseaseModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSIDiseaseModel() {
		return evolvingSIDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingSIDiseaseModel_CaseMutationRate() {
		return (EAttribute)evolvingSIDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingSIDiseaseModel_GenomeLength() {
		return (EAttribute)evolvingSIDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingSIDiseaseModel_GeneticDistNonlinExponent() {
		return (EAttribute)evolvingSIDiseaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSIRDiseaseModelLabel() {
		return evolvingSIRDiseaseModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSIRDiseaseModelLabelValue() {
		return evolvingSIRDiseaseModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSIRDiseaseModel() {
		return evolvingSIRDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingSIRDiseaseModel_ImmunityLossRate() {
		return (EAttribute)evolvingSIRDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingSIRDiseaseModel_CrossImmunityRate() {
		return (EAttribute)evolvingSIRDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSEIRDiseaseModelLabel() {
		return evolvingSEIRDiseaseModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSEIRDiseaseModelLabelValue() {
		return evolvingSEIRDiseaseModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvolvingSEIRDiseaseModel() {
		return evolvingSEIRDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvolvingSEIRDiseaseModel_IncubationRate() {
		return (EAttribute)evolvingSEIRDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanArray() {
		return booleanArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolvingFactory getEvolvingFactory() {
		return (EvolvingFactory)getEFactoryInstance();
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
		evolvingDiseaseTransformerEClass = createEClass(EVOLVING_DISEASE_TRANSFORMER);
		createEReference(evolvingDiseaseTransformerEClass, EVOLVING_DISEASE_TRANSFORMER__BASE_DISEASE);
		createEReference(evolvingDiseaseTransformerEClass, EVOLVING_DISEASE_TRANSFORMER__EVOLVED_DISEASES);
		createEAttribute(evolvingDiseaseTransformerEClass, EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT);
		createEAttribute(evolvingDiseaseTransformerEClass, EVOLVING_DISEASE_TRANSFORMER__EVOLUTION_COUNT_HARD_LIMIT);
		createEAttribute(evolvingDiseaseTransformerEClass, EVOLVING_DISEASE_TRANSFORMER__STOP_ALL_EVOLUTION);

		evolvingDiseaseModelEClass = createEClass(EVOLVING_DISEASE_MODEL);
		createEReference(evolvingDiseaseModelEClass, EVOLVING_DISEASE_MODEL__PARENT_DISEASE);
		createEReference(evolvingDiseaseModelEClass, EVOLVING_DISEASE_MODEL__TRANSFORMER);
		createEReference(evolvingDiseaseModelEClass, EVOLVING_DISEASE_MODEL__EVOLVED_AT);
		createEAttribute(evolvingDiseaseModelEClass, EVOLVING_DISEASE_MODEL__GENOME);
		createEAttribute(evolvingDiseaseModelEClass, EVOLVING_DISEASE_MODEL__EVOLUTION_COUNT);

		evolvingSIDiseaseModelLabelEClass = createEClass(EVOLVING_SI_DISEASE_MODEL_LABEL);

		evolvingSIDiseaseModelLabelValueEClass = createEClass(EVOLVING_SI_DISEASE_MODEL_LABEL_VALUE);

		evolvingSIDiseaseModelEClass = createEClass(EVOLVING_SI_DISEASE_MODEL);
		createEAttribute(evolvingSIDiseaseModelEClass, EVOLVING_SI_DISEASE_MODEL__CASE_MUTATION_RATE);
		createEAttribute(evolvingSIDiseaseModelEClass, EVOLVING_SI_DISEASE_MODEL__GENOME_LENGTH);
		createEAttribute(evolvingSIDiseaseModelEClass, EVOLVING_SI_DISEASE_MODEL__GENETIC_DIST_NONLIN_EXPONENT);

		evolvingSIRDiseaseModelLabelEClass = createEClass(EVOLVING_SIR_DISEASE_MODEL_LABEL);

		evolvingSIRDiseaseModelLabelValueEClass = createEClass(EVOLVING_SIR_DISEASE_MODEL_LABEL_VALUE);

		evolvingSIRDiseaseModelEClass = createEClass(EVOLVING_SIR_DISEASE_MODEL);
		createEAttribute(evolvingSIRDiseaseModelEClass, EVOLVING_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE);
		createEAttribute(evolvingSIRDiseaseModelEClass, EVOLVING_SIR_DISEASE_MODEL__CROSS_IMMUNITY_RATE);

		evolvingSEIRDiseaseModelLabelEClass = createEClass(EVOLVING_SEIR_DISEASE_MODEL_LABEL);

		evolvingSEIRDiseaseModelLabelValueEClass = createEClass(EVOLVING_SEIR_DISEASE_MODEL_LABEL_VALUE);

		evolvingSEIRDiseaseModelEClass = createEClass(EVOLVING_SEIR_DISEASE_MODEL);
		createEAttribute(evolvingSEIRDiseaseModelEClass, EVOLVING_SEIR_DISEASE_MODEL__INCUBATION_RATE);

		// Create data types
		booleanArrayEDataType = createEDataType(BOOLEAN_ARRAY);
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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		evolvingDiseaseTransformerEClass.getESuperTypes().add(theModelPackage.getTransformationDecorator());
		evolvingSIDiseaseModelLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		evolvingSIDiseaseModelLabelValueEClass.getESuperTypes().add(theStandardPackage.getSILabelValue());
		evolvingSIDiseaseModelEClass.getESuperTypes().add(theStandardPackage.getSI());
		evolvingSIDiseaseModelEClass.getESuperTypes().add(this.getEvolvingDiseaseModel());
		evolvingSIRDiseaseModelLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		evolvingSIRDiseaseModelLabelValueEClass.getESuperTypes().add(theStandardPackage.getSIRLabelValue());
		evolvingSIRDiseaseModelEClass.getESuperTypes().add(this.getEvolvingSIDiseaseModel());
		evolvingSEIRDiseaseModelLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		evolvingSEIRDiseaseModelLabelValueEClass.getESuperTypes().add(theStandardPackage.getSEIRLabelValue());
		evolvingSEIRDiseaseModelEClass.getESuperTypes().add(this.getEvolvingSIRDiseaseModel());

		// Initialize classes and features; add operations and parameters
		initEClass(evolvingDiseaseTransformerEClass, EvolvingDiseaseTransformer.class, "EvolvingDiseaseTransformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvolvingDiseaseTransformer_BaseDisease(), theStandardPackage.getDiseaseModel(), null, "baseDisease", null, 1, 1, EvolvingDiseaseTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvolvingDiseaseTransformer_EvolvedDiseases(), theStandardPackage.getDiseaseModel(), null, "evolvedDiseases", null, 0, -1, EvolvingDiseaseTransformer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingDiseaseTransformer_EvolutionCount(), ecorePackage.getEInt(), "evolutionCount", "0", 0, 1, EvolvingDiseaseTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingDiseaseTransformer_EvolutionCountHardLimit(), ecorePackage.getEInt(), "evolutionCountHardLimit", "256", 0, 1, EvolvingDiseaseTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingDiseaseTransformer_StopAllEvolution(), ecorePackage.getEBoolean(), "stopAllEvolution", "false", 0, 1, EvolvingDiseaseTransformer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evolvingDiseaseModelEClass, EvolvingDiseaseModel.class, "EvolvingDiseaseModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvolvingDiseaseModel_ParentDisease(), this.getEvolvingDiseaseModel(), null, "parentDisease", null, 0, 1, EvolvingDiseaseModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvolvingDiseaseModel_Transformer(), this.getEvolvingDiseaseTransformer(), null, "transformer", null, 0, 1, EvolvingDiseaseModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvolvingDiseaseModel_EvolvedAt(), theStandardPackage.getDiseaseModelLabel(), null, "evolvedAt", null, 0, 1, EvolvingDiseaseModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingDiseaseModel_Genome(), this.getBooleanArray(), "genome", null, 0, 1, EvolvingDiseaseModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingDiseaseModel_EvolutionCount(), ecorePackage.getEInt(), "evolutionCount", "0", 0, 1, EvolvingDiseaseModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(evolvingDiseaseModelEClass, this.getEvolvingDiseaseModel(), "evolve", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getDiseaseModelLabel(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(evolvingDiseaseModelEClass, null, "calculateEvolvedInitialState", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(evolvingDiseaseModelEClass, ecorePackage.getEDouble(), "getGeneticDistance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvolvingDiseaseModel(), "otherDiseaseStrain", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(evolvingSIDiseaseModelLabelEClass, EvolvingSIDiseaseModelLabel.class, "EvolvingSIDiseaseModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evolvingSIDiseaseModelLabelValueEClass, EvolvingSIDiseaseModelLabelValue.class, "EvolvingSIDiseaseModelLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evolvingSIDiseaseModelEClass, EvolvingSIDiseaseModel.class, "EvolvingSIDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvolvingSIDiseaseModel_CaseMutationRate(), ecorePackage.getEDouble(), "caseMutationRate", "0.00001", 0, 1, EvolvingSIDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingSIDiseaseModel_GenomeLength(), ecorePackage.getEInt(), "genomeLength", "5", 0, 1, EvolvingSIDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingSIDiseaseModel_GeneticDistNonlinExponent(), ecorePackage.getEDouble(), "geneticDistNonlinExponent", "1.0", 0, 1, EvolvingSIDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evolvingSIRDiseaseModelLabelEClass, EvolvingSIRDiseaseModelLabel.class, "EvolvingSIRDiseaseModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evolvingSIRDiseaseModelLabelValueEClass, EvolvingSIRDiseaseModelLabelValue.class, "EvolvingSIRDiseaseModelLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evolvingSIRDiseaseModelEClass, EvolvingSIRDiseaseModel.class, "EvolvingSIRDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvolvingSIRDiseaseModel_ImmunityLossRate(), ecorePackage.getEDouble(), "immunityLossRate", "0.0", 0, 1, EvolvingSIRDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvolvingSIRDiseaseModel_CrossImmunityRate(), ecorePackage.getEDouble(), "crossImmunityRate", "0.75", 0, 1, EvolvingSIRDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evolvingSEIRDiseaseModelLabelEClass, EvolvingSEIRDiseaseModelLabel.class, "EvolvingSEIRDiseaseModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evolvingSEIRDiseaseModelLabelValueEClass, EvolvingSEIRDiseaseModelLabelValue.class, "EvolvingSEIRDiseaseModelLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(evolvingSEIRDiseaseModelEClass, EvolvingSEIRDiseaseModel.class, "EvolvingSEIRDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvolvingSEIRDiseaseModel_IncubationRate(), ecorePackage.getEDouble(), "incubationRate", "0.0", 0, 1, EvolvingSEIRDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(booleanArrayEDataType, boolean[].class, "BooleanArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/stem/modelgen/generated
		createGeneratedAnnotations();
		// http:///org/eclipse/stem/modelgen/metamodel
		createMetamodelAnnotations();
		// http:///org/eclipse/stem/modelgen/model/label
		createLabelAnnotations();
		// http:///org/eclipse/stem/modelgen/model/labelvalue
		createLabelvalueAnnotations();
		// http:///org/eclipse/stem/modelgen/model/adapters
		createAdaptersAnnotations();
		// http:///org/eclipse/stem/modelgen/modelparam/constraints
		createConstraintsAnnotations();
		// http:///org/eclipse/stem/modelgen/modelparam/messages
		createMessagesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/generated</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGeneratedAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/generated";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSIDiseaseModelLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSIDiseaseModelLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSIDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSIRDiseaseModelLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSIRDiseaseModelLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSIRDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingSIRDiseaseModel_ImmunityLossRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSEIRDiseaseModelLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSEIRDiseaseModelLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (evolvingSEIRDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });	
		addAnnotation
		  (getEvolvingSEIRDiseaseModel_IncubationRate(), 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/metamodel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetamodelAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/metamodel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "uri", "platform:/resource/org.eclipse.stem.diseasemodels.evolving/model/evolving.metamodel"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/model/label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLabelAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/model/label";	
		addAnnotation
		  (evolvingSIDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "EvolvingSIDiseaseModelLabel"
		   });	
		addAnnotation
		  (evolvingSIRDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "EvolvingSIRDiseaseModelLabel"
		   });	
		addAnnotation
		  (evolvingSEIRDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "EvolvingSEIRDiseaseModelLabel"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/model/labelvalue</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLabelvalueAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/model/labelvalue";	
		addAnnotation
		  (evolvingSIDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "EvolvingSIDiseaseModelLabelValue"
		   });	
		addAnnotation
		  (evolvingSIRDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "EvolvingSIRDiseaseModelLabelValue"
		   });	
		addAnnotation
		  (evolvingSEIRDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "EvolvingSEIRDiseaseModelLabelValue"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/model/adapters</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAdaptersAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/model/adapters";	
		addAnnotation
		  (evolvingSIDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "propertyEditorSuperClass", "org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor",
			 "stringProviderSuperClass", "org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter",
			 "labelRelativeValueProviderSuperClass", "org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider",
			 "labelValueRelativeValueProviderSuperClass", "org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider"
		   });	
		addAnnotation
		  (evolvingSIRDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "propertyEditorSuperClass", "org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor",
			 "stringProviderSuperClass", "org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter",
			 "labelRelativeValueProviderSuperClass", "org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider",
			 "labelValueRelativeValueProviderSuperClass", "org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider"
		   });	
		addAnnotation
		  (evolvingSEIRDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "propertyEditorSuperClass", "org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor",
			 "stringProviderSuperClass", "org.eclipse.stem.ui.wizards.StandardPropertyStringProviderAdapterFactory.StandardPropertyStringProviderAdapter",
			 "labelRelativeValueProviderSuperClass", "org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider",
			 "labelValueRelativeValueProviderSuperClass", "org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/modelparam/constraints</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createConstraintsAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/modelparam/constraints";	
		addAnnotation
		  (getEvolvingSIRDiseaseModel_ImmunityLossRate(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });	
		addAnnotation
		  (getEvolvingSEIRDiseaseModel_IncubationRate(), 
		   source, 
		   new String[] {
			 "minValue", "0.0",
			 "maxValue", "1.0"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/stem/modelgen/modelparam/messages</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMessagesAnnotations() {
		String source = "http:///org/eclipse/stem/modelgen/modelparam/messages";	
		addAnnotation
		  (getEvolvingSIRDiseaseModel_ImmunityLossRate(), 
		   source, 
		   new String[] {
			 "name", "Immunity Loss Rate"
		   });	
		addAnnotation
		  (getEvolvingSEIRDiseaseModel_IncubationRate(), 
		   source, 
		   new String[] {
			 "name", "Incubation Rate"
		   });
	}

} //EvolvingPackageImpl
