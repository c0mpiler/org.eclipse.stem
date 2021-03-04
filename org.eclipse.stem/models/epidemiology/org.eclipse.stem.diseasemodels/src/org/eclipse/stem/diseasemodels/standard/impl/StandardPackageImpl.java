package org.eclipse.stem.diseasemodels.standard.impl;

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

import java.util.Random;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.predicate.PredicatePackage;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.DiseasepredicatesPackage;
import org.eclipse.stem.diseasemodels.predicates.diseasepredicates.impl.DiseasepredicatesPackageImpl;
import org.eclipse.stem.diseasemodels.standard.DeterministicSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DeterministicSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DeterministicSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.Infector;
import org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection;
import org.eclipse.stem.diseasemodels.standard.SEIRLabel;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.SILabel;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.SIRInoculator;
import org.eclipse.stem.diseasemodels.standard.SIRLabel;
import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabel;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseModelLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardInfector;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.StandardStochasticDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticSIRDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("deprecation")
public class StandardPackageImpl extends EPackageImpl implements StandardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deterministicSEIRDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deterministicSIDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deterministicSIRDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diseaseModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diseaseModelLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seirLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seirLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siInfectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sirLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sirLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardDiseaseModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardDiseaseModelLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardInfectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticSEIRDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticSIDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticSIRDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardStochasticDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sirInoculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticPoissonSIDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticPoissonSIRDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticPoissonSEIRDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infectorInoculatorCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardDiseaseInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diseaseInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDataSourceDiseaseInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType randomEDataType = null;

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
	 * @see org.eclipse.stem.diseasemodels.standard.StandardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StandardPackageImpl() {
		super(eNS_URI, StandardFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StandardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StandardPackage init() {
		if (isInited) return (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);

		// Obtain or create and register package
		StandardPackageImpl theStandardPackage = (StandardPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StandardPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PredicatePackage.eINSTANCE.eClass();
		org.eclipse.stem.populationmodels.standard.StandardPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DiseasepredicatesPackageImpl theDiseasepredicatesPackage = (DiseasepredicatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DiseasepredicatesPackage.eNS_URI) instanceof DiseasepredicatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DiseasepredicatesPackage.eNS_URI) : DiseasepredicatesPackage.eINSTANCE);

		// Create package meta-data objects
		theStandardPackage.createPackageContents();
		theDiseasepredicatesPackage.createPackageContents();

		// Initialize created meta-data
		theStandardPackage.initializePackageContents();
		theDiseasepredicatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStandardPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StandardPackage.eNS_URI, theStandardPackage);
		return theStandardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeterministicSEIRDiseaseModel() {
		return deterministicSEIRDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeterministicSIDiseaseModel() {
		return deterministicSIDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeterministicSIRDiseaseModel() {
		return deterministicSIRDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiseaseModel() {
		return diseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiseaseModel_PopulationIdentifier() {
		return (EAttribute)diseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiseaseModel_TimePeriod() {
		return (EAttribute)diseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiseaseModel_DiseaseName() {
		return (EAttribute)diseaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiseaseModel_FiniteDifference() {
		return (EAttribute)diseaseModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiseaseModel_FrequencyDependent() {
		return (EAttribute)diseaseModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiseaseModelLabel() {
		return diseaseModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseaseModelLabel_PopulationLabel() {
		return (EReference)diseaseModelLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiseaseModelLabel_PopulationModelLabel() {
		return (EReference)diseaseModelLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiseaseModelLabelValue() {
		return diseaseModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiseaseModelLabelValue_PopulationCount() {
		return (EAttribute)diseaseModelLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfector() {
		return infectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfector_DiseaseModel() {
		return (EReference)infectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfector_TargetURI() {
		return (EAttribute)infectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfector_DiseaseName() {
		return (EAttribute)infectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfector_TargetISOKey() {
		return (EAttribute)infectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfector_LabelsToInfect() {
		return (EReference)infectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfector_PopulationIdentifier() {
		return (EAttribute)infectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfector_InfectPercentage() {
		return (EAttribute)infectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfector_TargetFeature() {
		return (EAttribute)infectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEIR() {
		return seirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEIR_IncubationRate() {
		return (EAttribute)seirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEIRLabel() {
		return seirLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSEIRLabelValue() {
		return seirLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSEIRLabelValue_E() {
		return (EAttribute)seirLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSI() {
		return siEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSI_TransmissionRate() {
		return (EAttribute)siEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSI_NonLinearityCoefficient() {
		return (EAttribute)siEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSI_RecoveryRate() {
		return (EAttribute)siEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSI_InfectiousMortalityRate() {
		return (EAttribute)siEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSIInfector() {
		return siInfectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSIInfector_InfectiousCount() {
		return (EAttribute)siInfectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSILabel() {
		return siLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSILabelValue() {
		return siLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSILabelValue_I() {
		return (EAttribute)siLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSIR() {
		return sirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSIR_ImmunityLossRate() {
		return (EAttribute)sirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSIRLabel() {
		return sirLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSIRLabelValue() {
		return sirLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSIRLabelValue_R() {
		return (EAttribute)sirLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardDiseaseModel() {
		return standardDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseModel_ReferencePopulationDensity() {
		return (EAttribute)standardDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseModel_RoadNetworkInfectiousProportion() {
		return (EAttribute)standardDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseModel_CharacteristicMixingDistance() {
		return (EAttribute)standardDiseaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardDiseaseModelLabel() {
		return standardDiseaseModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardDiseaseModelLabelValue() {
		return standardDiseaseModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseModelLabelValue_S() {
		return (EAttribute)standardDiseaseModelLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseModelLabelValue_Incidence() {
		return (EAttribute)standardDiseaseModelLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseModelLabelValue_DiseaseDeaths() {
		return (EAttribute)standardDiseaseModelLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardInfector() {
		return standardInfectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticSEIRDiseaseModel() {
		return stochasticSEIRDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticSIDiseaseModel() {
		return stochasticSIDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticSIRDiseaseModel() {
		return stochasticSIRDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticDiseaseModel() {
		return stochasticDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStochasticDiseaseModel_Seed() {
		return (EAttribute)stochasticDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStochasticDiseaseModel_RandomGenerator() {
		return (EAttribute)stochasticDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardStochasticDiseaseModel() {
		return standardStochasticDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardStochasticDiseaseModel_Gain() {
		return (EAttribute)standardStochasticDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSIRInoculator() {
		return sirInoculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSIRInoculator_InoculatedPercentage() {
		return (EAttribute)sirInoculatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSIRInoculator_InoculatePercentage() {
		return (EAttribute)sirInoculatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticPoissonSIDiseaseModel() {
		return stochasticPoissonSIDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticPoissonSIRDiseaseModel() {
		return stochasticPoissonSIRDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticPoissonSEIRDiseaseModel() {
		return stochasticPoissonSEIRDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfectorInoculatorCollection() {
		return infectorInoculatorCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfectorInoculatorCollection_List() {
		return (EReference)infectorInoculatorCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfectorInoculatorCollection_ImportFolder() {
		return (EAttribute)infectorInoculatorCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardDiseaseInitializer() {
		return standardDiseaseInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseInitializer_TargetISOKey() {
		return (EAttribute)standardDiseaseInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseInitializer_TargetURI() {
		return (EAttribute)standardDiseaseInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseInitializer_Compartments() {
		return (EAttribute)standardDiseaseInitializerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseInitializer_CompartmentValues() {
		return (EAttribute)standardDiseaseInitializerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardDiseaseInitializer_UseFractions() {
		return (EAttribute)standardDiseaseInitializerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiseaseInitializer() {
		return diseaseInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiseaseInitializer_DiseaseName() {
		return (EAttribute)diseaseInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiseaseInitializer_PopulationIdentifier() {
		return (EAttribute)diseaseInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDataSourceDiseaseInitializer() {
		return externalDataSourceDiseaseInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourceDiseaseInitializer_DataPath() {
		return (EAttribute)externalDataSourceDiseaseInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourceDiseaseInitializer_Row() {
		return (EAttribute)externalDataSourceDiseaseInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourceDiseaseInitializer_DoRescaling() {
		return (EAttribute)externalDataSourceDiseaseInitializerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRandom() {
		return randomEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardFactory getStandardFactory() {
		return (StandardFactory)getEFactoryInstance();
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
		deterministicSEIRDiseaseModelEClass = createEClass(DETERMINISTIC_SEIR_DISEASE_MODEL);

		deterministicSIDiseaseModelEClass = createEClass(DETERMINISTIC_SI_DISEASE_MODEL);

		deterministicSIRDiseaseModelEClass = createEClass(DETERMINISTIC_SIR_DISEASE_MODEL);

		diseaseModelEClass = createEClass(DISEASE_MODEL);
		createEAttribute(diseaseModelEClass, DISEASE_MODEL__POPULATION_IDENTIFIER);
		createEAttribute(diseaseModelEClass, DISEASE_MODEL__TIME_PERIOD);
		createEAttribute(diseaseModelEClass, DISEASE_MODEL__DISEASE_NAME);
		createEAttribute(diseaseModelEClass, DISEASE_MODEL__FINITE_DIFFERENCE);
		createEAttribute(diseaseModelEClass, DISEASE_MODEL__FREQUENCY_DEPENDENT);

		diseaseModelLabelEClass = createEClass(DISEASE_MODEL_LABEL);
		createEReference(diseaseModelLabelEClass, DISEASE_MODEL_LABEL__POPULATION_LABEL);
		createEReference(diseaseModelLabelEClass, DISEASE_MODEL_LABEL__POPULATION_MODEL_LABEL);

		diseaseModelLabelValueEClass = createEClass(DISEASE_MODEL_LABEL_VALUE);
		createEAttribute(diseaseModelLabelValueEClass, DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT);

		infectorEClass = createEClass(INFECTOR);
		createEReference(infectorEClass, INFECTOR__DISEASE_MODEL);
		createEAttribute(infectorEClass, INFECTOR__TARGET_URI);
		createEAttribute(infectorEClass, INFECTOR__DISEASE_NAME);
		createEAttribute(infectorEClass, INFECTOR__TARGET_ISO_KEY);
		createEReference(infectorEClass, INFECTOR__LABELS_TO_INFECT);
		createEAttribute(infectorEClass, INFECTOR__POPULATION_IDENTIFIER);
		createEAttribute(infectorEClass, INFECTOR__INFECT_PERCENTAGE);
		createEAttribute(infectorEClass, INFECTOR__TARGET_FEATURE);

		seirEClass = createEClass(SEIR);
		createEAttribute(seirEClass, SEIR__INCUBATION_RATE);

		seirLabelEClass = createEClass(SEIR_LABEL);

		seirLabelValueEClass = createEClass(SEIR_LABEL_VALUE);
		createEAttribute(seirLabelValueEClass, SEIR_LABEL_VALUE__E);

		siEClass = createEClass(SI);
		createEAttribute(siEClass, SI__TRANSMISSION_RATE);
		createEAttribute(siEClass, SI__NON_LINEARITY_COEFFICIENT);
		createEAttribute(siEClass, SI__RECOVERY_RATE);
		createEAttribute(siEClass, SI__INFECTIOUS_MORTALITY_RATE);

		siInfectorEClass = createEClass(SI_INFECTOR);
		createEAttribute(siInfectorEClass, SI_INFECTOR__INFECTIOUS_COUNT);

		siLabelEClass = createEClass(SI_LABEL);

		siLabelValueEClass = createEClass(SI_LABEL_VALUE);
		createEAttribute(siLabelValueEClass, SI_LABEL_VALUE__I);

		sirEClass = createEClass(SIR);
		createEAttribute(sirEClass, SIR__IMMUNITY_LOSS_RATE);

		sirLabelEClass = createEClass(SIR_LABEL);

		sirLabelValueEClass = createEClass(SIR_LABEL_VALUE);
		createEAttribute(sirLabelValueEClass, SIR_LABEL_VALUE__R);

		standardDiseaseModelEClass = createEClass(STANDARD_DISEASE_MODEL);
		createEAttribute(standardDiseaseModelEClass, STANDARD_DISEASE_MODEL__REFERENCE_POPULATION_DENSITY);
		createEAttribute(standardDiseaseModelEClass, STANDARD_DISEASE_MODEL__ROAD_NETWORK_INFECTIOUS_PROPORTION);
		createEAttribute(standardDiseaseModelEClass, STANDARD_DISEASE_MODEL__CHARACTERISTIC_MIXING_DISTANCE);

		standardDiseaseModelLabelEClass = createEClass(STANDARD_DISEASE_MODEL_LABEL);

		standardDiseaseModelLabelValueEClass = createEClass(STANDARD_DISEASE_MODEL_LABEL_VALUE);
		createEAttribute(standardDiseaseModelLabelValueEClass, STANDARD_DISEASE_MODEL_LABEL_VALUE__S);
		createEAttribute(standardDiseaseModelLabelValueEClass, STANDARD_DISEASE_MODEL_LABEL_VALUE__INCIDENCE);
		createEAttribute(standardDiseaseModelLabelValueEClass, STANDARD_DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS);

		standardInfectorEClass = createEClass(STANDARD_INFECTOR);

		stochasticSEIRDiseaseModelEClass = createEClass(STOCHASTIC_SEIR_DISEASE_MODEL);

		stochasticSIDiseaseModelEClass = createEClass(STOCHASTIC_SI_DISEASE_MODEL);

		stochasticSIRDiseaseModelEClass = createEClass(STOCHASTIC_SIR_DISEASE_MODEL);

		stochasticDiseaseModelEClass = createEClass(STOCHASTIC_DISEASE_MODEL);
		createEAttribute(stochasticDiseaseModelEClass, STOCHASTIC_DISEASE_MODEL__SEED);
		createEAttribute(stochasticDiseaseModelEClass, STOCHASTIC_DISEASE_MODEL__RANDOM_GENERATOR);

		standardStochasticDiseaseModelEClass = createEClass(STANDARD_STOCHASTIC_DISEASE_MODEL);
		createEAttribute(standardStochasticDiseaseModelEClass, STANDARD_STOCHASTIC_DISEASE_MODEL__GAIN);

		sirInoculatorEClass = createEClass(SIR_INOCULATOR);
		createEAttribute(sirInoculatorEClass, SIR_INOCULATOR__INOCULATED_PERCENTAGE);
		createEAttribute(sirInoculatorEClass, SIR_INOCULATOR__INOCULATE_PERCENTAGE);

		stochasticPoissonSIDiseaseModelEClass = createEClass(STOCHASTIC_POISSON_SI_DISEASE_MODEL);

		stochasticPoissonSIRDiseaseModelEClass = createEClass(STOCHASTIC_POISSON_SIR_DISEASE_MODEL);

		stochasticPoissonSEIRDiseaseModelEClass = createEClass(STOCHASTIC_POISSON_SEIR_DISEASE_MODEL);

		infectorInoculatorCollectionEClass = createEClass(INFECTOR_INOCULATOR_COLLECTION);
		createEReference(infectorInoculatorCollectionEClass, INFECTOR_INOCULATOR_COLLECTION__LIST);
		createEAttribute(infectorInoculatorCollectionEClass, INFECTOR_INOCULATOR_COLLECTION__IMPORT_FOLDER);

		standardDiseaseInitializerEClass = createEClass(STANDARD_DISEASE_INITIALIZER);
		createEAttribute(standardDiseaseInitializerEClass, STANDARD_DISEASE_INITIALIZER__TARGET_ISO_KEY);
		createEAttribute(standardDiseaseInitializerEClass, STANDARD_DISEASE_INITIALIZER__TARGET_URI);
		createEAttribute(standardDiseaseInitializerEClass, STANDARD_DISEASE_INITIALIZER__COMPARTMENTS);
		createEAttribute(standardDiseaseInitializerEClass, STANDARD_DISEASE_INITIALIZER__COMPARTMENT_VALUES);
		createEAttribute(standardDiseaseInitializerEClass, STANDARD_DISEASE_INITIALIZER__USE_FRACTIONS);

		diseaseInitializerEClass = createEClass(DISEASE_INITIALIZER);
		createEAttribute(diseaseInitializerEClass, DISEASE_INITIALIZER__DISEASE_NAME);
		createEAttribute(diseaseInitializerEClass, DISEASE_INITIALIZER__POPULATION_IDENTIFIER);

		externalDataSourceDiseaseInitializerEClass = createEClass(EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER);
		createEAttribute(externalDataSourceDiseaseInitializerEClass, EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DATA_PATH);
		createEAttribute(externalDataSourceDiseaseInitializerEClass, EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__ROW);
		createEAttribute(externalDataSourceDiseaseInitializerEClass, EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER__DO_RESCALING);

		// Create data types
		randomEDataType = createEDataType(RANDOM);
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
		ModifierPackage theModifierPackage = (ModifierPackage)EPackage.Registry.INSTANCE.getEPackage(ModifierPackage.eNS_URI);
		org.eclipse.stem.populationmodels.standard.StandardPackage theStandardPackage_1 = (org.eclipse.stem.populationmodels.standard.StandardPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.stem.populationmodels.standard.StandardPackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		LabelsPackage theLabelsPackage = (LabelsPackage)EPackage.Registry.INSTANCE.getEPackage(LabelsPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deterministicSEIRDiseaseModelEClass.getESuperTypes().add(this.getSEIR());
		deterministicSIDiseaseModelEClass.getESuperTypes().add(this.getSI());
		deterministicSIRDiseaseModelEClass.getESuperTypes().add(this.getSIR());
		diseaseModelEClass.getESuperTypes().add(theModelPackage.getIntegrationDecorator());
		diseaseModelEClass.getESuperTypes().add(theModifierPackage.getModifiable());
		diseaseModelLabelEClass.getESuperTypes().add(theGraphPackage.getIntegrationLabel());
		diseaseModelLabelValueEClass.getESuperTypes().add(theGraphPackage.getIntegrationLabelValue());
		infectorEClass.getESuperTypes().add(theModelPackage.getNodeDecorator());
		infectorEClass.getESuperTypes().add(theModifierPackage.getModifiable());
		seirEClass.getESuperTypes().add(this.getSIR());
		seirLabelEClass.getESuperTypes().add(this.getStandardDiseaseModelLabel());
		seirLabelValueEClass.getESuperTypes().add(this.getSIRLabelValue());
		siEClass.getESuperTypes().add(this.getStandardDiseaseModel());
		siInfectorEClass.getESuperTypes().add(this.getStandardInfector());
		siLabelEClass.getESuperTypes().add(this.getStandardDiseaseModelLabel());
		siLabelValueEClass.getESuperTypes().add(this.getStandardDiseaseModelLabelValue());
		sirEClass.getESuperTypes().add(this.getSI());
		sirLabelEClass.getESuperTypes().add(this.getStandardDiseaseModelLabel());
		sirLabelValueEClass.getESuperTypes().add(this.getSILabelValue());
		standardDiseaseModelEClass.getESuperTypes().add(this.getDiseaseModel());
		standardDiseaseModelLabelEClass.getESuperTypes().add(this.getDiseaseModelLabel());
		standardDiseaseModelLabelValueEClass.getESuperTypes().add(this.getDiseaseModelLabelValue());
		standardInfectorEClass.getESuperTypes().add(this.getInfector());
		stochasticSEIRDiseaseModelEClass.getESuperTypes().add(this.getSEIR());
		stochasticSEIRDiseaseModelEClass.getESuperTypes().add(this.getStandardStochasticDiseaseModel());
		stochasticSIDiseaseModelEClass.getESuperTypes().add(this.getSI());
		stochasticSIDiseaseModelEClass.getESuperTypes().add(this.getStandardStochasticDiseaseModel());
		stochasticSIRDiseaseModelEClass.getESuperTypes().add(this.getSIR());
		stochasticSIRDiseaseModelEClass.getESuperTypes().add(this.getStandardStochasticDiseaseModel());
		standardStochasticDiseaseModelEClass.getESuperTypes().add(this.getStochasticDiseaseModel());
		sirInoculatorEClass.getESuperTypes().add(this.getSIInfector());
		stochasticPoissonSIDiseaseModelEClass.getESuperTypes().add(this.getSI());
		stochasticPoissonSIRDiseaseModelEClass.getESuperTypes().add(this.getSIR());
		stochasticPoissonSEIRDiseaseModelEClass.getESuperTypes().add(this.getSEIR());
		infectorInoculatorCollectionEClass.getESuperTypes().add(theModelPackage.getNodeDecorator());
		infectorInoculatorCollectionEClass.getESuperTypes().add(theModifierPackage.getModifiable());
		standardDiseaseInitializerEClass.getESuperTypes().add(this.getDiseaseInitializer());
		diseaseInitializerEClass.getESuperTypes().add(theModelPackage.getNodeDecorator());
		externalDataSourceDiseaseInitializerEClass.getESuperTypes().add(this.getDiseaseInitializer());

		// Initialize classes and features; add operations and parameters
		initEClass(deterministicSEIRDiseaseModelEClass, DeterministicSEIRDiseaseModel.class, "DeterministicSEIRDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(deterministicSIDiseaseModelEClass, DeterministicSIDiseaseModel.class, "DeterministicSIDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(deterministicSIRDiseaseModelEClass, DeterministicSIRDiseaseModel.class, "DeterministicSIRDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(diseaseModelEClass, DiseaseModel.class, "DiseaseModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDiseaseModel_PopulationIdentifier(), ecorePackage.getEString(), "populationIdentifier", "human", 0, 1, DiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDiseaseModel_TimePeriod(), ecorePackage.getELong(), "timePeriod", "86400000", 0, 1, DiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDiseaseModel_DiseaseName(), ecorePackage.getEString(), "diseaseName", null, 0, 1, DiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiseaseModel_FiniteDifference(), ecorePackage.getEBoolean(), "finiteDifference", "true", 0, 1, DiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDiseaseModel_FrequencyDependent(), ecorePackage.getEBoolean(), "frequencyDependent", "true", 0, 1, DiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		EOperation op = addEOperation(diseaseModelEClass, this.getDiseaseModelLabel(), "createDiseaseModelLabel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "populationIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diseaseModelEClass, this.getDiseaseModelLabelValue(), "createDiseaseModelLabelValue", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "populationIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(diseaseModelEClass, this.getInfector(), "createInfector", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(diseaseModelEClass, ecorePackage.getEString(), "getAllLabelIdentifiers", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diseaseModelEClass, theStandardPackage_1.getPopulationModelLabel(), "getPopulationModelLabels", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEString(), "populationIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theGraphPackage.getGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(diseaseModelLabelEClass, DiseaseModelLabel.class, "DiseaseModelLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDiseaseModelLabel_PopulationLabel(), theLabelsPackage.getPopulationLabel(), null, "populationLabel", null, 0, 1, DiseaseModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDiseaseModelLabel_PopulationModelLabel(), theStandardPackage_1.getPopulationModelLabel(), null, "populationModelLabel", null, 0, 1, DiseaseModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(diseaseModelLabelEClass, ecorePackage.getEString(), "toTooltipString", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(diseaseModelLabelValueEClass, DiseaseModelLabelValue.class, "DiseaseModelLabelValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDiseaseModelLabelValue_PopulationCount(), ecorePackage.getEDouble(), "populationCount", null, 0, 1, DiseaseModelLabelValue.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(infectorEClass, Infector.class, "Infector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInfector_DiseaseModel(), this.getStandardDiseaseModel(), null, "diseaseModel", null, 0, 1, Infector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInfector_TargetURI(), theCommonPackage.getURI(), "targetURI", null, 0, 1, Infector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInfector_DiseaseName(), ecorePackage.getEString(), "diseaseName", null, 0, 1, Infector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInfector_TargetISOKey(), ecorePackage.getEString(), "targetISOKey", null, 0, 1, Infector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getInfector_LabelsToInfect(), this.getDiseaseModelLabel(), null, "labelsToInfect", null, 0, -1, Infector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInfector_PopulationIdentifier(), ecorePackage.getEString(), "populationIdentifier", null, 0, 1, Infector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInfector_InfectPercentage(), ecorePackage.getEBoolean(), "infectPercentage", "false", 0, 1, Infector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getInfector_TargetFeature(), ecorePackage.getEString(), "targetFeature", "i", 0, 1, Infector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(seirEClass, org.eclipse.stem.diseasemodels.standard.SEIR.class, "SEIR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSEIR_IncubationRate(), ecorePackage.getEDouble(), "incubationRate", "0.0", 0, 1, org.eclipse.stem.diseasemodels.standard.SEIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = addEOperation(seirEClass, ecorePackage.getEDouble(), "getAdjustedIncubationRate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getELong(), "timeDelta", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(seirLabelEClass, SEIRLabel.class, "SEIRLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(seirLabelValueEClass, SEIRLabelValue.class, "SEIRLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSEIRLabelValue_E(), ecorePackage.getEDouble(), "e", null, 0, 1, SEIRLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(siEClass, org.eclipse.stem.diseasemodels.standard.SI.class, "SI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSI_TransmissionRate(), ecorePackage.getEDouble(), "transmissionRate", "0.0", 0, 1, org.eclipse.stem.diseasemodels.standard.SI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getSI_NonLinearityCoefficient(), ecorePackage.getEDouble(), "nonLinearityCoefficient", "1.0", 0, 1, org.eclipse.stem.diseasemodels.standard.SI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getSI_RecoveryRate(), ecorePackage.getEDouble(), "recoveryRate", "0.0", 0, 1, org.eclipse.stem.diseasemodels.standard.SI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getSI_InfectiousMortalityRate(), ecorePackage.getEDouble(), "infectiousMortalityRate", "0.0", 0, 1, org.eclipse.stem.diseasemodels.standard.SI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = addEOperation(siEClass, ecorePackage.getEDouble(), "getAdjustedInfectiousMortalityRate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getELong(), "timeDelta", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(siEClass, ecorePackage.getEDouble(), "getAdjustedTransmissionRate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getELong(), "timeDelta", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(siEClass, ecorePackage.getEDouble(), "getAdjustedRecoveryRate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getELong(), "timeDelta", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(siInfectorEClass, SIInfector.class, "SIInfector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSIInfector_InfectiousCount(), ecorePackage.getEDouble(), "infectiousCount", "1", 0, 1, SIInfector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(siLabelEClass, SILabel.class, "SILabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(siLabelValueEClass, SILabelValue.class, "SILabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSILabelValue_I(), ecorePackage.getEDouble(), "i", null, 0, 1, SILabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(sirEClass, org.eclipse.stem.diseasemodels.standard.SIR.class, "SIR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSIR_ImmunityLossRate(), ecorePackage.getEDouble(), "immunityLossRate", "0.0", 0, 1, org.eclipse.stem.diseasemodels.standard.SIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = addEOperation(sirEClass, ecorePackage.getEDouble(), "getAdjustedImmunityLossRate", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getELong(), "timeDelta", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(sirLabelEClass, SIRLabel.class, "SIRLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(sirLabelValueEClass, SIRLabelValue.class, "SIRLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSIRLabelValue_R(), ecorePackage.getEDouble(), "r", null, 0, 1, SIRLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(standardDiseaseModelEClass, StandardDiseaseModel.class, "StandardDiseaseModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStandardDiseaseModel_ReferencePopulationDensity(), ecorePackage.getEDouble(), "referencePopulationDensity", "100", 0, 1, StandardDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getStandardDiseaseModel_RoadNetworkInfectiousProportion(), ecorePackage.getEDouble(), "roadNetworkInfectiousProportion", "0.01", 0, 1, StandardDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getStandardDiseaseModel_CharacteristicMixingDistance(), ecorePackage.getEDouble(), "characteristicMixingDistance", "2.25", 0, 1, StandardDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = addEOperation(standardDiseaseModelEClass, ecorePackage.getEDouble(), "getNormalizedEffectiveInfectious", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theGraphPackage.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getStandardDiseaseModelLabel(), "diseaseLabel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEDouble(), "onsiteInfectious", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEAttribute(), "infectiousAttribute", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEAttribute(), "mixingAttribute", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEAttribute(), "roadAttribute", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(standardDiseaseModelEClass, theEcorePackage.getEAttribute(), "getBirthsCompartment", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(standardDiseaseModelEClass, null, "doDeaths", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getStandardDiseaseModelLabelValue(), "currentState", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getStandardDiseaseModelLabelValue(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEDouble(), "deaths", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(standardDiseaseModelLabelEClass, StandardDiseaseModelLabel.class, "StandardDiseaseModelLabel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(standardDiseaseModelLabelValueEClass, StandardDiseaseModelLabelValue.class, "StandardDiseaseModelLabelValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStandardDiseaseModelLabelValue_S(), ecorePackage.getEDouble(), "s", null, 0, 1, StandardDiseaseModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStandardDiseaseModelLabelValue_Incidence(), ecorePackage.getEDouble(), "incidence", "0.0", 0, 1, StandardDiseaseModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getStandardDiseaseModelLabelValue_DiseaseDeaths(), ecorePackage.getEDouble(), "diseaseDeaths", "0.0", 0, 1, StandardDiseaseModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(standardInfectorEClass, StandardInfector.class, "StandardInfector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stochasticSEIRDiseaseModelEClass, StochasticSEIRDiseaseModel.class, "StochasticSEIRDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stochasticSIDiseaseModelEClass, StochasticSIDiseaseModel.class, "StochasticSIDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stochasticSIRDiseaseModelEClass, StochasticSIRDiseaseModel.class, "StochasticSIRDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stochasticDiseaseModelEClass, StochasticDiseaseModel.class, "StochasticDiseaseModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStochasticDiseaseModel_Seed(), ecorePackage.getELong(), "seed", "0", 0, 1, StochasticDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getStochasticDiseaseModel_RandomGenerator(), this.getRandom(), "randomGenerator", "0", 0, 1, StochasticDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(standardStochasticDiseaseModelEClass, StandardStochasticDiseaseModel.class, "StandardStochasticDiseaseModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStandardStochasticDiseaseModel_Gain(), ecorePackage.getEDouble(), "gain", "0.01", 0, 1, StandardStochasticDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		addEOperation(standardStochasticDiseaseModelEClass, ecorePackage.getEDouble(), "computeNoise", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(sirInoculatorEClass, SIRInoculator.class, "SIRInoculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSIRInoculator_InoculatedPercentage(), ecorePackage.getEDouble(), "inoculatedPercentage", "1", 0, 1, SIRInoculator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getSIRInoculator_InoculatePercentage(), ecorePackage.getEBoolean(), "inoculatePercentage", "true", 0, 1, SIRInoculator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(stochasticPoissonSIDiseaseModelEClass, StochasticPoissonSIDiseaseModel.class, "StochasticPoissonSIDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stochasticPoissonSIRDiseaseModelEClass, StochasticPoissonSIRDiseaseModel.class, "StochasticPoissonSIRDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(stochasticPoissonSEIRDiseaseModelEClass, StochasticPoissonSEIRDiseaseModel.class, "StochasticPoissonSEIRDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(infectorInoculatorCollectionEClass, InfectorInoculatorCollection.class, "InfectorInoculatorCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInfectorInoculatorCollection_List(), this.getInfector(), null, "list", null, 0, -1, InfectorInoculatorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInfectorInoculatorCollection_ImportFolder(), ecorePackage.getEString(), "importFolder", "", 0, 1, InfectorInoculatorCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(standardDiseaseInitializerEClass, StandardDiseaseInitializer.class, "StandardDiseaseInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getStandardDiseaseInitializer_TargetISOKey(), ecorePackage.getEString(), "targetISOKey", null, 0, 1, StandardDiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStandardDiseaseInitializer_TargetURI(), theCommonPackage.getURI(), "targetURI", null, 0, 1, StandardDiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getStandardDiseaseInitializer_Compartments(), ecorePackage.getEString(), "compartments", "", 0, -1, StandardDiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getStandardDiseaseInitializer_CompartmentValues(), ecorePackage.getEDouble(), "compartmentValues", "0.0", 0, -1, StandardDiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getStandardDiseaseInitializer_UseFractions(), ecorePackage.getEBoolean(), "useFractions", null, 0, 1, StandardDiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(diseaseInitializerEClass, DiseaseInitializer.class, "DiseaseInitializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDiseaseInitializer_DiseaseName(), ecorePackage.getEString(), "diseaseName", null, 0, 1, DiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiseaseInitializer_PopulationIdentifier(), ecorePackage.getEString(), "populationIdentifier", null, 0, 1, DiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(externalDataSourceDiseaseInitializerEClass, ExternalDataSourceDiseaseInitializer.class, "ExternalDataSourceDiseaseInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getExternalDataSourceDiseaseInitializer_DataPath(), ecorePackage.getEString(), "dataPath", null, 0, 1, ExternalDataSourceDiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExternalDataSourceDiseaseInitializer_Row(), ecorePackage.getEInt(), "row", null, 0, 1, ExternalDataSourceDiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getExternalDataSourceDiseaseInitializer_DoRescaling(), theEcorePackage.getEBoolean(), "doRescaling", "false", 0, 1, ExternalDataSourceDiseaseInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		// Initialize data types
		initEDataType(randomEDataType, Random.class, "Random", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //StandardPackageImpl
