package org.eclipse.stem.populationmodels.standard.impl;

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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.graph.GraphPackage;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.definitions.labels.LabelsPackage;
import org.eclipse.stem.populationmodels.standard.AgeGroup;
import org.eclipse.stem.populationmodels.standard.AgingPopulationModel;
import org.eclipse.stem.populationmodels.standard.DemographicPopulationModel;
import org.eclipse.stem.populationmodels.standard.EarthSciencePopulationInitializer;
import org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationInitializer;
import org.eclipse.stem.populationmodels.standard.ExternalDataSourcePopulationModel;
import org.eclipse.stem.populationmodels.standard.MosquitoPopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationGroup;
import org.eclipse.stem.populationmodels.standard.PopulationInitializer;
import org.eclipse.stem.populationmodels.standard.PopulationModel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.SeasonalMigratoryPopulationModel;
import org.eclipse.stem.populationmodels.standard.SeasonalPopulationModel;
import org.eclipse.stem.populationmodels.standard.SinModulatePopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;
import org.eclipse.stem.populationmodels.standard.StandardPackage;
import org.eclipse.stem.populationmodels.standard.StandardPopulationInitializer;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.StochasticStandardPopulationModel;
import org.eclipse.stem.populationmodels.standard.YetiPopulationInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardPackageImpl extends EPackageImpl implements StandardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardPopulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardPopulationModelLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationModelLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardPopulationModelLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stochasticStandardPopulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demographicPopulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardPopulationInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonalPopulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSciencePopulationInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yetiPopulationInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mosquitoPopulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agingPopulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDataSourcePopulationInitializerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDataSourcePopulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinModulatePopulationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonalMigratoryPopulationModelEClass = null;

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
	 * @see org.eclipse.stem.populationmodels.standard.StandardPackage#eNS_URI
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
		LabelsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStandardPackage.createPackageContents();

		// Initialize created meta-data
		theStandardPackage.initializePackageContents();

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
	public EClass getPopulationModel() {
		return populationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationModel_PopulationIdentifier() {
		return (EAttribute)populationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationModel_Name() {
		return (EAttribute)populationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationModel_TargetISOKey() {
		return (EAttribute)populationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationModel_InitialRescalingFactor() {
		return (EAttribute)populationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationModel_TimePeriod() {
		return (EAttribute)populationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardPopulationModel() {
		return standardPopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationModel_BirthRate() {
		return (EAttribute)standardPopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationModel_DeathRate() {
		return (EAttribute)standardPopulationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationModelLabel() {
		return populationModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulationModelLabel_PopulationLabel() {
		return (EReference)populationModelLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationModelLabel_PopulationIdentifier() {
		return (EAttribute)populationModelLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardPopulationModelLabel() {
		return standardPopulationModelLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationModelLabelValue() {
		return populationModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardPopulationModelLabelValue() {
		return standardPopulationModelLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationModelLabelValue_Count() {
		return (EAttribute)standardPopulationModelLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationModelLabelValue_Births() {
		return (EAttribute)standardPopulationModelLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationModelLabelValue_Deaths() {
		return (EAttribute)standardPopulationModelLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationModelLabelValue_Density() {
		return (EAttribute)standardPopulationModelLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStochasticStandardPopulationModel() {
		return stochasticStandardPopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStochasticStandardPopulationModel_Gain() {
		return (EAttribute)stochasticStandardPopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDemographicPopulationModel() {
		return demographicPopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDemographicPopulationModel_PopulationGroups() {
		return (EReference)demographicPopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationGroup() {
		return populationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationGroup_Identifier() {
		return (EAttribute)populationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationGroup_Fraction() {
		return (EAttribute)populationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationInitializer() {
		return populationInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopulationInitializer_PopulationIdentifier() {
		return (EAttribute)populationInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardPopulationInitializer() {
		return standardPopulationInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationInitializer_Individuals() {
		return (EAttribute)standardPopulationInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationInitializer_UseDensity() {
		return (EAttribute)standardPopulationInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationInitializer_TargetISOKey() {
		return (EAttribute)standardPopulationInitializerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardPopulationInitializer_TargetURI() {
		return (EAttribute)standardPopulationInitializerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeasonalPopulationModel() {
		return seasonalPopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalPopulationModel_Phase() {
		return (EAttribute)seasonalPopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalPopulationModel_ModulationAmplitude() {
		return (EAttribute)seasonalPopulationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalPopulationModel_Period() {
		return (EAttribute)seasonalPopulationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalPopulationModel_UseLatitude() {
		return (EAttribute)seasonalPopulationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSciencePopulationInitializer() {
		return earthSciencePopulationInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYetiPopulationInitializer() {
		return yetiPopulationInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMosquitoPopulationModel() {
		return mosquitoPopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMosquitoPopulationModel_ScalingFactor() {
		return (EAttribute)mosquitoPopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMosquitoPopulationModel_MortalityRate() {
		return (EAttribute)mosquitoPopulationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMosquitoPopulationModel_Host() {
		return (EAttribute)mosquitoPopulationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgingPopulationModel() {
		return agingPopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgingPopulationModel_HasMaxAge() {
		return (EAttribute)agingPopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgeGroup() {
		return ageGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgeGroup_FromAge() {
		return (EAttribute)ageGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgeGroup_ToAge() {
		return (EAttribute)ageGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgeGroup_DeathFactor() {
		return (EAttribute)ageGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgeGroup_Limited() {
		return (EAttribute)ageGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDataSourcePopulationInitializer() {
		return externalDataSourcePopulationInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourcePopulationInitializer_DataPath() {
		return (EAttribute)externalDataSourcePopulationInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourcePopulationInitializer_Row() {
		return (EAttribute)externalDataSourcePopulationInitializerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDataSourcePopulationModel() {
		return externalDataSourcePopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourcePopulationModel_DataPath() {
		return (EAttribute)externalDataSourcePopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourcePopulationModel_BufferSize() {
		return (EAttribute)externalDataSourcePopulationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDataSourcePopulationModel_Restart() {
		return (EAttribute)externalDataSourcePopulationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinModulatePopulationModel() {
		return sinModulatePopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinModulatePopulationModel_PhaseShift() {
		return (EAttribute)sinModulatePopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinModulatePopulationModel_PeriodSin() {
		return (EAttribute)sinModulatePopulationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinModulatePopulationModel_MaxBound() {
		return (EAttribute)sinModulatePopulationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinModulatePopulationModel_MinBound() {
		return (EAttribute)sinModulatePopulationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeasonalMigratoryPopulationModel() {
		return seasonalMigratoryPopulationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalMigratoryPopulationModel_Phase() {
		return (EAttribute)seasonalMigratoryPopulationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeasonalMigratoryPopulationModel_Period() {
		return (EAttribute)seasonalMigratoryPopulationModelEClass.getEStructuralFeatures().get(1);
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
		populationModelEClass = createEClass(POPULATION_MODEL);
		createEAttribute(populationModelEClass, POPULATION_MODEL__POPULATION_IDENTIFIER);
		createEAttribute(populationModelEClass, POPULATION_MODEL__NAME);
		createEAttribute(populationModelEClass, POPULATION_MODEL__TARGET_ISO_KEY);
		createEAttribute(populationModelEClass, POPULATION_MODEL__INITIAL_RESCALING_FACTOR);
		createEAttribute(populationModelEClass, POPULATION_MODEL__TIME_PERIOD);

		standardPopulationModelEClass = createEClass(STANDARD_POPULATION_MODEL);
		createEAttribute(standardPopulationModelEClass, STANDARD_POPULATION_MODEL__BIRTH_RATE);
		createEAttribute(standardPopulationModelEClass, STANDARD_POPULATION_MODEL__DEATH_RATE);

		populationModelLabelEClass = createEClass(POPULATION_MODEL_LABEL);
		createEReference(populationModelLabelEClass, POPULATION_MODEL_LABEL__POPULATION_LABEL);
		createEAttribute(populationModelLabelEClass, POPULATION_MODEL_LABEL__POPULATION_IDENTIFIER);

		standardPopulationModelLabelEClass = createEClass(STANDARD_POPULATION_MODEL_LABEL);

		populationModelLabelValueEClass = createEClass(POPULATION_MODEL_LABEL_VALUE);

		standardPopulationModelLabelValueEClass = createEClass(STANDARD_POPULATION_MODEL_LABEL_VALUE);
		createEAttribute(standardPopulationModelLabelValueEClass, STANDARD_POPULATION_MODEL_LABEL_VALUE__COUNT);
		createEAttribute(standardPopulationModelLabelValueEClass, STANDARD_POPULATION_MODEL_LABEL_VALUE__BIRTHS);
		createEAttribute(standardPopulationModelLabelValueEClass, STANDARD_POPULATION_MODEL_LABEL_VALUE__DEATHS);
		createEAttribute(standardPopulationModelLabelValueEClass, STANDARD_POPULATION_MODEL_LABEL_VALUE__DENSITY);

		stochasticStandardPopulationModelEClass = createEClass(STOCHASTIC_STANDARD_POPULATION_MODEL);
		createEAttribute(stochasticStandardPopulationModelEClass, STOCHASTIC_STANDARD_POPULATION_MODEL__GAIN);

		demographicPopulationModelEClass = createEClass(DEMOGRAPHIC_POPULATION_MODEL);
		createEReference(demographicPopulationModelEClass, DEMOGRAPHIC_POPULATION_MODEL__POPULATION_GROUPS);

		populationGroupEClass = createEClass(POPULATION_GROUP);
		createEAttribute(populationGroupEClass, POPULATION_GROUP__IDENTIFIER);
		createEAttribute(populationGroupEClass, POPULATION_GROUP__FRACTION);

		populationInitializerEClass = createEClass(POPULATION_INITIALIZER);
		createEAttribute(populationInitializerEClass, POPULATION_INITIALIZER__POPULATION_IDENTIFIER);

		standardPopulationInitializerEClass = createEClass(STANDARD_POPULATION_INITIALIZER);
		createEAttribute(standardPopulationInitializerEClass, STANDARD_POPULATION_INITIALIZER__INDIVIDUALS);
		createEAttribute(standardPopulationInitializerEClass, STANDARD_POPULATION_INITIALIZER__USE_DENSITY);
		createEAttribute(standardPopulationInitializerEClass, STANDARD_POPULATION_INITIALIZER__TARGET_ISO_KEY);
		createEAttribute(standardPopulationInitializerEClass, STANDARD_POPULATION_INITIALIZER__TARGET_URI);

		seasonalPopulationModelEClass = createEClass(SEASONAL_POPULATION_MODEL);
		createEAttribute(seasonalPopulationModelEClass, SEASONAL_POPULATION_MODEL__PHASE);
		createEAttribute(seasonalPopulationModelEClass, SEASONAL_POPULATION_MODEL__MODULATION_AMPLITUDE);
		createEAttribute(seasonalPopulationModelEClass, SEASONAL_POPULATION_MODEL__PERIOD);
		createEAttribute(seasonalPopulationModelEClass, SEASONAL_POPULATION_MODEL__USE_LATITUDE);

		earthSciencePopulationInitializerEClass = createEClass(EARTH_SCIENCE_POPULATION_INITIALIZER);

		yetiPopulationInitializerEClass = createEClass(YETI_POPULATION_INITIALIZER);

		mosquitoPopulationModelEClass = createEClass(MOSQUITO_POPULATION_MODEL);
		createEAttribute(mosquitoPopulationModelEClass, MOSQUITO_POPULATION_MODEL__SCALING_FACTOR);
		createEAttribute(mosquitoPopulationModelEClass, MOSQUITO_POPULATION_MODEL__MORTALITY_RATE);
		createEAttribute(mosquitoPopulationModelEClass, MOSQUITO_POPULATION_MODEL__HOST);

		agingPopulationModelEClass = createEClass(AGING_POPULATION_MODEL);
		createEAttribute(agingPopulationModelEClass, AGING_POPULATION_MODEL__HAS_MAX_AGE);

		ageGroupEClass = createEClass(AGE_GROUP);
		createEAttribute(ageGroupEClass, AGE_GROUP__FROM_AGE);
		createEAttribute(ageGroupEClass, AGE_GROUP__TO_AGE);
		createEAttribute(ageGroupEClass, AGE_GROUP__DEATH_FACTOR);
		createEAttribute(ageGroupEClass, AGE_GROUP__LIMITED);

		externalDataSourcePopulationInitializerEClass = createEClass(EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER);
		createEAttribute(externalDataSourcePopulationInitializerEClass, EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__DATA_PATH);
		createEAttribute(externalDataSourcePopulationInitializerEClass, EXTERNAL_DATA_SOURCE_POPULATION_INITIALIZER__ROW);

		externalDataSourcePopulationModelEClass = createEClass(EXTERNAL_DATA_SOURCE_POPULATION_MODEL);
		createEAttribute(externalDataSourcePopulationModelEClass, EXTERNAL_DATA_SOURCE_POPULATION_MODEL__DATA_PATH);
		createEAttribute(externalDataSourcePopulationModelEClass, EXTERNAL_DATA_SOURCE_POPULATION_MODEL__BUFFER_SIZE);
		createEAttribute(externalDataSourcePopulationModelEClass, EXTERNAL_DATA_SOURCE_POPULATION_MODEL__RESTART);

		sinModulatePopulationModelEClass = createEClass(SIN_MODULATE_POPULATION_MODEL);
		createEAttribute(sinModulatePopulationModelEClass, SIN_MODULATE_POPULATION_MODEL__PHASE_SHIFT);
		createEAttribute(sinModulatePopulationModelEClass, SIN_MODULATE_POPULATION_MODEL__PERIOD_SIN);
		createEAttribute(sinModulatePopulationModelEClass, SIN_MODULATE_POPULATION_MODEL__MAX_BOUND);
		createEAttribute(sinModulatePopulationModelEClass, SIN_MODULATE_POPULATION_MODEL__MIN_BOUND);

		seasonalMigratoryPopulationModelEClass = createEClass(SEASONAL_MIGRATORY_POPULATION_MODEL);
		createEAttribute(seasonalMigratoryPopulationModelEClass, SEASONAL_MIGRATORY_POPULATION_MODEL__PHASE);
		createEAttribute(seasonalMigratoryPopulationModelEClass, SEASONAL_MIGRATORY_POPULATION_MODEL__PERIOD);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		GraphPackage theGraphPackage = (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);
		LabelsPackage theLabelsPackage = (LabelsPackage)EPackage.Registry.INSTANCE.getEPackage(LabelsPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		populationModelEClass.getESuperTypes().add(theModelPackage.getIntegrationDecorator());
		populationModelEClass.getESuperTypes().add(theModifierPackage.getModifiable());
		standardPopulationModelEClass.getESuperTypes().add(this.getPopulationModel());
		populationModelLabelEClass.getESuperTypes().add(theGraphPackage.getIntegrationLabel());
		standardPopulationModelLabelEClass.getESuperTypes().add(this.getPopulationModelLabel());
		populationModelLabelValueEClass.getESuperTypes().add(theGraphPackage.getIntegrationLabelValue());
		standardPopulationModelLabelValueEClass.getESuperTypes().add(this.getPopulationModelLabelValue());
		stochasticStandardPopulationModelEClass.getESuperTypes().add(this.getStandardPopulationModel());
		demographicPopulationModelEClass.getESuperTypes().add(this.getStandardPopulationModel());
		populationInitializerEClass.getESuperTypes().add(theModelPackage.getNodeDecorator());
		populationInitializerEClass.getESuperTypes().add(theModifierPackage.getModifiable());
		standardPopulationInitializerEClass.getESuperTypes().add(this.getPopulationInitializer());
		seasonalPopulationModelEClass.getESuperTypes().add(this.getStandardPopulationModel());
		earthSciencePopulationInitializerEClass.getESuperTypes().add(this.getPopulationInitializer());
		yetiPopulationInitializerEClass.getESuperTypes().add(this.getEarthSciencePopulationInitializer());
		mosquitoPopulationModelEClass.getESuperTypes().add(this.getPopulationModel());
		agingPopulationModelEClass.getESuperTypes().add(this.getDemographicPopulationModel());
		ageGroupEClass.getESuperTypes().add(this.getPopulationGroup());
		externalDataSourcePopulationInitializerEClass.getESuperTypes().add(this.getPopulationInitializer());
		externalDataSourcePopulationModelEClass.getESuperTypes().add(this.getPopulationModel());
		sinModulatePopulationModelEClass.getESuperTypes().add(this.getStandardPopulationModel());
		seasonalMigratoryPopulationModelEClass.getESuperTypes().add(this.getStandardPopulationModel());

		// Initialize classes and features; add operations and parameters
		initEClass(populationModelEClass, PopulationModel.class, "PopulationModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopulationModel_PopulationIdentifier(), theEcorePackage.getEString(), "populationIdentifier", "human", 0, 1, PopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulationModel_Name(), theEcorePackage.getEString(), "name", "HumanPopulationModel", 0, 1, PopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulationModel_TargetISOKey(), theEcorePackage.getEString(), "targetISOKey", "", 0, 1, PopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulationModel_InitialRescalingFactor(), theEcorePackage.getEDouble(), "initialRescalingFactor", "1.0", 0, 1, PopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulationModel_TimePeriod(), ecorePackage.getELong(), "timePeriod", "86400000", 0, 1, PopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(populationModelEClass, theEcorePackage.getEString(), "getAllLabelIdentifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(populationModelEClass, this.getPopulationModelLabel(), "createPopulationModelLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "populationIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(populationModelEClass, this.getPopulationModelLabelValue(), "createPopulationModelLabelValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "populationIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(standardPopulationModelEClass, StandardPopulationModel.class, "StandardPopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardPopulationModel_BirthRate(), theEcorePackage.getEDouble(), "birthRate", "0.0", 0, 1, StandardPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPopulationModel_DeathRate(), theEcorePackage.getEDouble(), "deathRate", "0.0", 0, 1, StandardPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(populationModelLabelEClass, PopulationModelLabel.class, "PopulationModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopulationModelLabel_PopulationLabel(), theLabelsPackage.getPopulationLabel(), null, "populationLabel", null, 0, 1, PopulationModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulationModelLabel_PopulationIdentifier(), theEcorePackage.getEString(), "populationIdentifier", null, 0, 1, PopulationModelLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardPopulationModelLabelEClass, StandardPopulationModelLabel.class, "StandardPopulationModelLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(populationModelLabelValueEClass, PopulationModelLabelValue.class, "PopulationModelLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standardPopulationModelLabelValueEClass, StandardPopulationModelLabelValue.class, "StandardPopulationModelLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardPopulationModelLabelValue_Count(), theEcorePackage.getEDouble(), "count", null, 0, 1, StandardPopulationModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPopulationModelLabelValue_Births(), theEcorePackage.getEDouble(), "births", null, 0, 1, StandardPopulationModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPopulationModelLabelValue_Deaths(), theEcorePackage.getEDouble(), "deaths", null, 0, 1, StandardPopulationModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPopulationModelLabelValue_Density(), theEcorePackage.getEDouble(), "density", null, 0, 1, StandardPopulationModelLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(stochasticStandardPopulationModelEClass, StochasticStandardPopulationModel.class, "StochasticStandardPopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStochasticStandardPopulationModel_Gain(), theEcorePackage.getEDouble(), "gain", "0.01", 0, 1, StochasticStandardPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(demographicPopulationModelEClass, DemographicPopulationModel.class, "DemographicPopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDemographicPopulationModel_PopulationGroups(), this.getPopulationGroup(), null, "populationGroups", null, 1, -1, DemographicPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(populationGroupEClass, PopulationGroup.class, "PopulationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopulationGroup_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, PopulationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPopulationGroup_Fraction(), theEcorePackage.getEDouble(), "fraction", "0.5", 0, 1, PopulationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(populationInitializerEClass, PopulationInitializer.class, "PopulationInitializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopulationInitializer_PopulationIdentifier(), theEcorePackage.getEString(), "populationIdentifier", "human", 0, 1, PopulationInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(standardPopulationInitializerEClass, StandardPopulationInitializer.class, "StandardPopulationInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStandardPopulationInitializer_Individuals(), theEcorePackage.getEDouble(), "individuals", "1", 0, 1, StandardPopulationInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPopulationInitializer_UseDensity(), theEcorePackage.getEBoolean(), "useDensity", "false", 0, 1, StandardPopulationInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPopulationInitializer_TargetISOKey(), theEcorePackage.getEString(), "targetISOKey", null, 0, 1, StandardPopulationInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStandardPopulationInitializer_TargetURI(), theCommonPackage.getURI(), "targetURI", null, 0, 1, StandardPopulationInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seasonalPopulationModelEClass, SeasonalPopulationModel.class, "SeasonalPopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeasonalPopulationModel_Phase(), theEcorePackage.getEDouble(), "phase", "0.0", 0, 1, SeasonalPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalPopulationModel_ModulationAmplitude(), theEcorePackage.getEDouble(), "modulationAmplitude", "1.0", 0, 1, SeasonalPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalPopulationModel_Period(), theEcorePackage.getEDouble(), "period", "365.25", 0, 1, SeasonalPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalPopulationModel_UseLatitude(), theEcorePackage.getEBoolean(), "useLatitude", "true", 0, 1, SeasonalPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSciencePopulationInitializerEClass, EarthSciencePopulationInitializer.class, "EarthSciencePopulationInitializer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(yetiPopulationInitializerEClass, YetiPopulationInitializer.class, "YetiPopulationInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mosquitoPopulationModelEClass, MosquitoPopulationModel.class, "MosquitoPopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMosquitoPopulationModel_ScalingFactor(), theEcorePackage.getEDouble(), "scalingFactor", "1.0", 0, 1, MosquitoPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMosquitoPopulationModel_MortalityRate(), theEcorePackage.getEDouble(), "mortalityRate", "0.05", 0, 1, MosquitoPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMosquitoPopulationModel_Host(), theEcorePackage.getEString(), "host", "human", 0, 1, MosquitoPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agingPopulationModelEClass, AgingPopulationModel.class, "AgingPopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgingPopulationModel_HasMaxAge(), theEcorePackage.getEBoolean(), "hasMaxAge", null, 0, 1, AgingPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ageGroupEClass, AgeGroup.class, "AgeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgeGroup_FromAge(), theEcorePackage.getEInt(), "fromAge", null, 0, 1, AgeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgeGroup_ToAge(), theEcorePackage.getEInt(), "toAge", null, 0, 1, AgeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgeGroup_DeathFactor(), theEcorePackage.getEDouble(), "deathFactor", "1.0", 0, 1, AgeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgeGroup_Limited(), theEcorePackage.getEBoolean(), "limited", null, 0, 1, AgeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalDataSourcePopulationInitializerEClass, ExternalDataSourcePopulationInitializer.class, "ExternalDataSourcePopulationInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalDataSourcePopulationInitializer_DataPath(), theEcorePackage.getEString(), "dataPath", null, 0, 1, ExternalDataSourcePopulationInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDataSourcePopulationInitializer_Row(), theEcorePackage.getEInt(), "row", "1", 0, 1, ExternalDataSourcePopulationInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalDataSourcePopulationModelEClass, ExternalDataSourcePopulationModel.class, "ExternalDataSourcePopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalDataSourcePopulationModel_DataPath(), theEcorePackage.getEString(), "dataPath", null, 0, 1, ExternalDataSourcePopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDataSourcePopulationModel_BufferSize(), theEcorePackage.getEInt(), "bufferSize", "250", 0, 1, ExternalDataSourcePopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDataSourcePopulationModel_Restart(), theEcorePackage.getEBoolean(), "restart", "true", 0, 1, ExternalDataSourcePopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinModulatePopulationModelEClass, SinModulatePopulationModel.class, "SinModulatePopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSinModulatePopulationModel_PhaseShift(), theEcorePackage.getEDouble(), "phaseShift", "0.0", 0, 1, SinModulatePopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSinModulatePopulationModel_PeriodSin(), theEcorePackage.getEDouble(), "periodSin", "365.25", 0, 1, SinModulatePopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSinModulatePopulationModel_MaxBound(), theEcorePackage.getEDouble(), "maxBound", "1", 0, 1, SinModulatePopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSinModulatePopulationModel_MinBound(), theEcorePackage.getEDouble(), "minBound", "0", 0, 1, SinModulatePopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seasonalMigratoryPopulationModelEClass, SeasonalMigratoryPopulationModel.class, "SeasonalMigratoryPopulationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeasonalMigratoryPopulationModel_Phase(), theEcorePackage.getEDouble(), "phase", "0.0", 0, 1, SeasonalMigratoryPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeasonalMigratoryPopulationModel_Period(), theEcorePackage.getEDouble(), "period", "365.25", 0, 1, SeasonalMigratoryPopulationModel.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StandardPackageImpl
