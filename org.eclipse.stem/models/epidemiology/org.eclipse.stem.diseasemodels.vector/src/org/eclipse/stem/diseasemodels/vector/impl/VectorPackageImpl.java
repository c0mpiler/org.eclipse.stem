package org.eclipse.stem.diseasemodels.vector.impl;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.vector.AbstractDengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabel;
import org.eclipse.stem.diseasemodels.vector.DengueModelVectorLabelValue;
import org.eclipse.stem.diseasemodels.vector.MacdonaldRossDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabel;
import org.eclipse.stem.diseasemodels.vector.SimpleDengueModelHostLabelValue;
import org.eclipse.stem.diseasemodels.vector.VectorDiseaseModel;
import org.eclipse.stem.diseasemodels.vector.VectorFactory;
import org.eclipse.stem.diseasemodels.vector.VectorPackage;
import org.eclipse.stem.diseasemodels.vector.VerySimpleDengueModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VectorPackageImpl extends EPackageImpl implements VectorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macdonaldRossDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorDiseaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dengueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDengueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verySimpleDengueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dengueModelHostLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dengueModelHostLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dengueModelVectorLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dengueModelVectorLabelValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDengueModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDengueModelHostLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDengueModelHostLabelValueEClass = null;

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
	 * @see org.eclipse.stem.diseasemodels.vector.VectorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VectorPackageImpl() {
		super(eNS_URI, VectorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VectorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VectorPackage init() {
		if (isInited) return (VectorPackage)EPackage.Registry.INSTANCE.getEPackage(VectorPackage.eNS_URI);

		// Obtain or create and register package
		VectorPackageImpl theVectorPackage = (VectorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VectorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VectorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StandardPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theVectorPackage.createPackageContents();

		// Initialize created meta-data
		theVectorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVectorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VectorPackage.eNS_URI, theVectorPackage);
		return theVectorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacdonaldRossDiseaseModel() {
		return macdonaldRossDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacdonaldRossDiseaseModel_BitingRate() {
		return (EAttribute)macdonaldRossDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacdonaldRossDiseaseModel_InfectiousBitingProportionHuman() {
		return (EAttribute)macdonaldRossDiseaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacdonaldRossDiseaseModel_InfectiousBitingProportionVector() {
		return (EAttribute)macdonaldRossDiseaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacdonaldRossDiseaseModel_RecoveryRate() {
		return (EAttribute)macdonaldRossDiseaseModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacdonaldRossDiseaseModel_IncubationRate() {
		return (EAttribute)macdonaldRossDiseaseModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacdonaldRossDiseaseModel_VectorIncubationRate() {
		return (EAttribute)macdonaldRossDiseaseModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacdonaldRossDiseaseModel_ImmunityLossRate() {
		return (EAttribute)macdonaldRossDiseaseModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVectorDiseaseModel() {
		return vectorDiseaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVectorDiseaseModel_VectorPopulationIdentifier() {
		return (EAttribute)vectorDiseaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDengueModel() {
		return dengueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_BitingRateSV() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_BitingRateIV() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostInfectivity1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostInfectivity2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostInfectivity3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostInfectivity4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryIncubationRate1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryIncubationRate2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryIncubationRate3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryIncubationRate4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryRecoveryRate1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryRecoveryRate2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryRecoveryRate3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryRecoveryRate4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryImmunityLossRate1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryImmunityLossRate2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryImmunityLossRate3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryImmunityLossRate4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryDiseaseDeathRate1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryDiseaseDeathRate2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryDiseaseDeathRate3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostPrimaryDiseaseDeathRate4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE12() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE13() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE14() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE21() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE23() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE24() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE31() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE32() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE34() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE41() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE42() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostADE43() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate12() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate13() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate14() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate21() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate23() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate24() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate31() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate32() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate34() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate41() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate42() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryDiseaseDeathRate43() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate12() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate13() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate14() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate21() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate23() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate24() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate31() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate32() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate34() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate41() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate42() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryRecoveryRate43() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate12() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate13() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate14() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate21() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate23() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate24() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate31() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate32() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate34() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate41() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate42() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_HostSecondaryIncubationRate43() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorInfectivity1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorInfectivity2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorInfectivity3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorInfectivity4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorADE1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorADE2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorADE3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorADE4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorIncubationRate1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorIncubationRate2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorIncubationRate3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_VectorIncubationRate4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_Episilon1() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_Episilon2() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_Episilon3() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModel_Episilon4() {
		return (EAttribute)dengueModelEClass.getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDengueModel() {
		return simpleDengueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_HostTransmissionRate() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_AdeFactor() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_HostImmunityLossRate() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_HostPrimaryDeathRate() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_HostRecoveryRate() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_HostSecondaryDeathRate() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_VectorIncubationRate() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_VectorTransmissionRate() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModel_ImmunityStrength() {
		return (EAttribute)simpleDengueModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerySimpleDengueModel() {
		return verySimpleDengueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerySimpleDengueModel_TransmissionRate() {
		return (EAttribute)verySimpleDengueModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerySimpleDengueModel_RecoveryRate() {
		return (EAttribute)verySimpleDengueModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerySimpleDengueModel_ImmunityLossRate() {
		return (EAttribute)verySimpleDengueModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerySimpleDengueModel_AdeFactor() {
		return (EAttribute)verySimpleDengueModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerySimpleDengueModel_ImmunityStrength() {
		return (EAttribute)verySimpleDengueModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerySimpleDengueModel_PrimaryDeathRate() {
		return (EAttribute)verySimpleDengueModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerySimpleDengueModel_SecondaryDeathRate() {
		return (EAttribute)verySimpleDengueModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDengueModelHostLabel() {
		return dengueModelHostLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDengueModelHostLabelValue() {
		return dengueModelHostLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E1() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E2() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E3() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E4() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E12() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E13() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E14() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E21() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E23() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E24() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E31() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E32() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E34() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E41() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E42() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelHostLabelValue_E43() {
		return (EAttribute)dengueModelHostLabelValueEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDengueModelVectorLabel() {
		return dengueModelVectorLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDengueModelVectorLabelValue() {
		return dengueModelVectorLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_E1() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_E2() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_E3() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_E4() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_I1() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_I2() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_I3() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_I4() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_Incidence1() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_Incidence2() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_Incidence3() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDengueModelVectorLabelValue_Incidence4() {
		return (EAttribute)dengueModelVectorLabelValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDengueModel() {
		return abstractDengueModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDengueModelHostLabel() {
		return simpleDengueModelHostLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDengueModelHostLabelValue() {
		return simpleDengueModelHostLabelValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I1() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I2() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I3() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I4() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_C1() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_C2() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_C3() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_C4() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_R1() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_R2() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_R3() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_R4() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I12() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I13() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I14() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I21() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I23() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I24() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I31() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I32() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I34() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I41() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I42() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_I43() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_R() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence1() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence2() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence3() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence4() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence12() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence21() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence31() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence41() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence13() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence23() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence32() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence42() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence14() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence24() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence34() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_Incidence43() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths1() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths2() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths3() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths4() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths12() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths21() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths31() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths41() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths13() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths23() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths32() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths42() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths14() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths24() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths34() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDengueModelHostLabelValue_DiseaseDeaths43() {
		return (EAttribute)simpleDengueModelHostLabelValueEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VectorFactory getVectorFactory() {
		return (VectorFactory)getEFactoryInstance();
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
		macdonaldRossDiseaseModelEClass = createEClass(MACDONALD_ROSS_DISEASE_MODEL);
		createEAttribute(macdonaldRossDiseaseModelEClass, MACDONALD_ROSS_DISEASE_MODEL__BITING_RATE);
		createEAttribute(macdonaldRossDiseaseModelEClass, MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_HUMAN);
		createEAttribute(macdonaldRossDiseaseModelEClass, MACDONALD_ROSS_DISEASE_MODEL__INFECTIOUS_BITING_PROPORTION_VECTOR);
		createEAttribute(macdonaldRossDiseaseModelEClass, MACDONALD_ROSS_DISEASE_MODEL__RECOVERY_RATE);
		createEAttribute(macdonaldRossDiseaseModelEClass, MACDONALD_ROSS_DISEASE_MODEL__INCUBATION_RATE);
		createEAttribute(macdonaldRossDiseaseModelEClass, MACDONALD_ROSS_DISEASE_MODEL__VECTOR_INCUBATION_RATE);
		createEAttribute(macdonaldRossDiseaseModelEClass, MACDONALD_ROSS_DISEASE_MODEL__IMMUNITY_LOSS_RATE);

		vectorDiseaseModelEClass = createEClass(VECTOR_DISEASE_MODEL);
		createEAttribute(vectorDiseaseModelEClass, VECTOR_DISEASE_MODEL__VECTOR_POPULATION_IDENTIFIER);

		dengueModelEClass = createEClass(DENGUE_MODEL);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__BITING_RATE_SV);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__BITING_RATE_IV);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_INFECTIVITY1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_INFECTIVITY2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_INFECTIVITY3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_INFECTIVITY4);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_INCUBATION_RATE4);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_RECOVERY_RATE4);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_IMMUNITY_LOSS_RATE4);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_PRIMARY_DISEASE_DEATH_RATE4);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE12);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE13);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE14);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE21);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE23);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE24);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE31);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE32);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE34);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE41);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE42);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_ADE43);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE12);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE13);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE14);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE21);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE23);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE24);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE31);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE32);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE34);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE41);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE42);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_DISEASE_DEATH_RATE43);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE12);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE13);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE14);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE21);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE23);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE24);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE31);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE32);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE34);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE41);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE42);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_RECOVERY_RATE43);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE12);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE13);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE14);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE21);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE23);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE24);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE31);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE32);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE34);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE41);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE42);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__HOST_SECONDARY_INCUBATION_RATE43);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_INFECTIVITY1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_INFECTIVITY2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_INFECTIVITY3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_INFECTIVITY4);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_ADE1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_ADE2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_ADE3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_ADE4);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_INCUBATION_RATE1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_INCUBATION_RATE2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_INCUBATION_RATE3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__VECTOR_INCUBATION_RATE4);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__EPISILON1);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__EPISILON2);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__EPISILON3);
		createEAttribute(dengueModelEClass, DENGUE_MODEL__EPISILON4);

		simpleDengueModelEClass = createEClass(SIMPLE_DENGUE_MODEL);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__HOST_TRANSMISSION_RATE);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__ADE_FACTOR);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__HOST_IMMUNITY_LOSS_RATE);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__HOST_PRIMARY_DEATH_RATE);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__HOST_RECOVERY_RATE);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__HOST_SECONDARY_DEATH_RATE);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__VECTOR_INCUBATION_RATE);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__VECTOR_TRANSMISSION_RATE);
		createEAttribute(simpleDengueModelEClass, SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH);

		verySimpleDengueModelEClass = createEClass(VERY_SIMPLE_DENGUE_MODEL);
		createEAttribute(verySimpleDengueModelEClass, VERY_SIMPLE_DENGUE_MODEL__TRANSMISSION_RATE);
		createEAttribute(verySimpleDengueModelEClass, VERY_SIMPLE_DENGUE_MODEL__RECOVERY_RATE);
		createEAttribute(verySimpleDengueModelEClass, VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_LOSS_RATE);
		createEAttribute(verySimpleDengueModelEClass, VERY_SIMPLE_DENGUE_MODEL__ADE_FACTOR);
		createEAttribute(verySimpleDengueModelEClass, VERY_SIMPLE_DENGUE_MODEL__IMMUNITY_STRENGTH);
		createEAttribute(verySimpleDengueModelEClass, VERY_SIMPLE_DENGUE_MODEL__PRIMARY_DEATH_RATE);
		createEAttribute(verySimpleDengueModelEClass, VERY_SIMPLE_DENGUE_MODEL__SECONDARY_DEATH_RATE);

		dengueModelHostLabelEClass = createEClass(DENGUE_MODEL_HOST_LABEL);

		dengueModelHostLabelValueEClass = createEClass(DENGUE_MODEL_HOST_LABEL_VALUE);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E1);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E2);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E3);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E4);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E12);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E13);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E14);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E21);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E23);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E24);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E31);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E32);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E34);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E41);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E42);
		createEAttribute(dengueModelHostLabelValueEClass, DENGUE_MODEL_HOST_LABEL_VALUE__E43);

		dengueModelVectorLabelEClass = createEClass(DENGUE_MODEL_VECTOR_LABEL);

		dengueModelVectorLabelValueEClass = createEClass(DENGUE_MODEL_VECTOR_LABEL_VALUE);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__E1);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__E2);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__E3);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__E4);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__I1);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__I2);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__I3);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__I4);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE1);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE2);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE3);
		createEAttribute(dengueModelVectorLabelValueEClass, DENGUE_MODEL_VECTOR_LABEL_VALUE__INCIDENCE4);

		abstractDengueModelEClass = createEClass(ABSTRACT_DENGUE_MODEL);

		simpleDengueModelHostLabelEClass = createEClass(SIMPLE_DENGUE_MODEL_HOST_LABEL);

		simpleDengueModelHostLabelValueEClass = createEClass(SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I1);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I2);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I3);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I4);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C1);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C2);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C3);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__C4);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R1);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R2);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R3);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R4);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I12);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I13);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I14);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I21);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I23);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I24);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I31);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I32);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I34);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I41);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I42);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__I43);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__R);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE1);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE2);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE3);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE4);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE12);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE21);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE31);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE41);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE13);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE23);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE32);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE42);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE14);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE24);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE34);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__INCIDENCE43);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS1);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS2);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS3);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS4);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS12);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS21);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS31);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS41);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS13);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS23);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS32);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS42);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS14);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS24);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS34);
		createEAttribute(simpleDengueModelHostLabelValueEClass, SIMPLE_DENGUE_MODEL_HOST_LABEL_VALUE__DISEASE_DEATHS43);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage)EPackage.Registry.INSTANCE.getEPackage(StandardPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		macdonaldRossDiseaseModelEClass.getESuperTypes().add(this.getVectorDiseaseModel());
		vectorDiseaseModelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModel());
		dengueModelEClass.getESuperTypes().add(this.getAbstractDengueModel());
		simpleDengueModelEClass.getESuperTypes().add(this.getAbstractDengueModel());
		verySimpleDengueModelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModel());
		dengueModelHostLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		dengueModelHostLabelValueEClass.getESuperTypes().add(this.getSimpleDengueModelHostLabelValue());
		dengueModelVectorLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		dengueModelVectorLabelValueEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabelValue());
		abstractDengueModelEClass.getESuperTypes().add(this.getVectorDiseaseModel());
		simpleDengueModelHostLabelEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabel());
		simpleDengueModelHostLabelValueEClass.getESuperTypes().add(theStandardPackage.getStandardDiseaseModelLabelValue());

		// Initialize classes and features; add operations and parameters
		initEClass(macdonaldRossDiseaseModelEClass, MacdonaldRossDiseaseModel.class, "MacdonaldRossDiseaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacdonaldRossDiseaseModel_BitingRate(), theEcorePackage.getEDouble(), "bitingRate", "0.5", 0, 1, MacdonaldRossDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacdonaldRossDiseaseModel_InfectiousBitingProportionHuman(), theEcorePackage.getEDouble(), "infectiousBitingProportionHuman", "0.5", 0, 1, MacdonaldRossDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacdonaldRossDiseaseModel_InfectiousBitingProportionVector(), theEcorePackage.getEDouble(), "infectiousBitingProportionVector", "1.0", 0, 1, MacdonaldRossDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacdonaldRossDiseaseModel_RecoveryRate(), theEcorePackage.getEDouble(), "recoveryRate", "3.33E-3", 0, 1, MacdonaldRossDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacdonaldRossDiseaseModel_IncubationRate(), theEcorePackage.getEDouble(), "incubationRate", "0.0625", 0, 1, MacdonaldRossDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacdonaldRossDiseaseModel_VectorIncubationRate(), theEcorePackage.getEDouble(), "vectorIncubationRate", "0.1", 0, 1, MacdonaldRossDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMacdonaldRossDiseaseModel_ImmunityLossRate(), theEcorePackage.getEDouble(), "immunityLossRate", "0.02", 0, 1, MacdonaldRossDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorDiseaseModelEClass, VectorDiseaseModel.class, "VectorDiseaseModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVectorDiseaseModel_VectorPopulationIdentifier(), theEcorePackage.getEString(), "vectorPopulationIdentifier", "anopheles", 0, 1, VectorDiseaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dengueModelEClass, DengueModel.class, "DengueModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDengueModel_BitingRateSV(), theEcorePackage.getEDouble(), "bitingRateSV", "1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_BitingRateIV(), theEcorePackage.getEDouble(), "bitingRateIV", "1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostInfectivity1(), theEcorePackage.getEDouble(), "hostInfectivity1", "0.5", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostInfectivity2(), theEcorePackage.getEDouble(), "hostInfectivity2", "0.5", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostInfectivity3(), theEcorePackage.getEDouble(), "hostInfectivity3", "0.5", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostInfectivity4(), theEcorePackage.getEDouble(), "hostInfectivity4", "0.5", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryIncubationRate1(), theEcorePackage.getEDouble(), "hostPrimaryIncubationRate1", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryIncubationRate2(), theEcorePackage.getEDouble(), "hostPrimaryIncubationRate2", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryIncubationRate3(), theEcorePackage.getEDouble(), "hostPrimaryIncubationRate3", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryIncubationRate4(), theEcorePackage.getEDouble(), "hostPrimaryIncubationRate4", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryRecoveryRate1(), theEcorePackage.getEDouble(), "hostPrimaryRecoveryRate1", "0.14", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryRecoveryRate2(), theEcorePackage.getEDouble(), "hostPrimaryRecoveryRate2", "0.14", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryRecoveryRate3(), theEcorePackage.getEDouble(), "hostPrimaryRecoveryRate3", "0.14", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryRecoveryRate4(), theEcorePackage.getEDouble(), "hostPrimaryRecoveryRate4", "0.14", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryImmunityLossRate1(), theEcorePackage.getEDouble(), "hostPrimaryImmunityLossRate1", "0.024", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryImmunityLossRate2(), theEcorePackage.getEDouble(), "hostPrimaryImmunityLossRate2", "0.024", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryImmunityLossRate3(), theEcorePackage.getEDouble(), "hostPrimaryImmunityLossRate3", "0.024", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryImmunityLossRate4(), theEcorePackage.getEDouble(), "hostPrimaryImmunityLossRate4", "0.024", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryDiseaseDeathRate1(), theEcorePackage.getEDouble(), "hostPrimaryDiseaseDeathRate1", "0.0000001", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryDiseaseDeathRate2(), theEcorePackage.getEDouble(), "hostPrimaryDiseaseDeathRate2", "0.0000001", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryDiseaseDeathRate3(), theEcorePackage.getEDouble(), "hostPrimaryDiseaseDeathRate3", "0.0000001", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostPrimaryDiseaseDeathRate4(), theEcorePackage.getEDouble(), "hostPrimaryDiseaseDeathRate4", "0.0000001", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE12(), theEcorePackage.getEDouble(), "hostADE12", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE13(), theEcorePackage.getEDouble(), "hostADE13", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE14(), theEcorePackage.getEDouble(), "hostADE14", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE21(), theEcorePackage.getEDouble(), "hostADE21", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE23(), theEcorePackage.getEDouble(), "hostADE23", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE24(), theEcorePackage.getEDouble(), "hostADE24", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE31(), theEcorePackage.getEDouble(), "hostADE31", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE32(), theEcorePackage.getEDouble(), "hostADE32", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE34(), theEcorePackage.getEDouble(), "hostADE34", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE41(), theEcorePackage.getEDouble(), "hostADE41", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE42(), theEcorePackage.getEDouble(), "hostADE42", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostADE43(), theEcorePackage.getEDouble(), "hostADE43", "1.8", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate12(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate12", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate13(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate13", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate14(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate14", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate21(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate21", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate23(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate23", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate24(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate24", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate31(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate31", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate32(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate32", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate34(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate34", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate41(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate41", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate42(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate42", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryDiseaseDeathRate43(), theEcorePackage.getEDouble(), "hostSecondaryDiseaseDeathRate43", "0.00123", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate12(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate12", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate13(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate13", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate14(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate14", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate21(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate21", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate23(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate23", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate24(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate24", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate31(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate31", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate32(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate32", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate34(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate34", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate41(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate41", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate42(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate42", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryRecoveryRate43(), theEcorePackage.getEDouble(), "hostSecondaryRecoveryRate43", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate12(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate12", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate13(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate13", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate14(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate14", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate21(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate21", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate23(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate23", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate24(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate24", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate31(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate31", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate32(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate32", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate34(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate34", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate41(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate41", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate42(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate42", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_HostSecondaryIncubationRate43(), theEcorePackage.getEDouble(), "hostSecondaryIncubationRate43", "0.2", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorInfectivity1(), theEcorePackage.getEDouble(), "vectorInfectivity1", "1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorInfectivity2(), theEcorePackage.getEDouble(), "vectorInfectivity2", "1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorInfectivity3(), theEcorePackage.getEDouble(), "vectorInfectivity3", "1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorInfectivity4(), theEcorePackage.getEDouble(), "vectorInfectivity4", "1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorADE1(), theEcorePackage.getEDouble(), "vectorADE1", "1.0", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorADE2(), theEcorePackage.getEDouble(), "vectorADE2", "1.0", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorADE3(), theEcorePackage.getEDouble(), "vectorADE3", "1.0", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorADE4(), theEcorePackage.getEDouble(), "vectorADE4", "1.0", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorIncubationRate1(), theEcorePackage.getEDouble(), "vectorIncubationRate1", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorIncubationRate2(), theEcorePackage.getEDouble(), "vectorIncubationRate2", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorIncubationRate3(), theEcorePackage.getEDouble(), "vectorIncubationRate3", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_VectorIncubationRate4(), theEcorePackage.getEDouble(), "vectorIncubationRate4", "0.1", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_Episilon1(), theEcorePackage.getEDouble(), "episilon1", "0.5", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_Episilon2(), theEcorePackage.getEDouble(), "episilon2", "0.5", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_Episilon3(), theEcorePackage.getEDouble(), "episilon3", "0.5", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModel_Episilon4(), theEcorePackage.getEDouble(), "episilon4", "0.5", 0, 1, DengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleDengueModelEClass, SimpleDengueModel.class, "SimpleDengueModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleDengueModel_HostTransmissionRate(), theEcorePackage.getEDouble(), "hostTransmissionRate", "0.041", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModel_AdeFactor(), theEcorePackage.getEDouble(), "adeFactor", "1", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModel_HostImmunityLossRate(), theEcorePackage.getEDouble(), "hostImmunityLossRate", "0.005479", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModel_HostPrimaryDeathRate(), theEcorePackage.getEDouble(), "hostPrimaryDeathRate", "0", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModel_HostRecoveryRate(), theEcorePackage.getEDouble(), "hostRecoveryRate", "0.247", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModel_HostSecondaryDeathRate(), theEcorePackage.getEDouble(), "hostSecondaryDeathRate", "0", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModel_VectorIncubationRate(), theEcorePackage.getEDouble(), "vectorIncubationRate", "0.082", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModel_VectorTransmissionRate(), theEcorePackage.getEDouble(), "vectorTransmissionRate", "1.45", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModel_ImmunityStrength(), theEcorePackage.getEDouble(), "immunityStrength", "0", 0, 1, SimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verySimpleDengueModelEClass, VerySimpleDengueModel.class, "VerySimpleDengueModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerySimpleDengueModel_TransmissionRate(), theEcorePackage.getEDouble(), "transmissionRate", "0.55", 0, 1, VerySimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerySimpleDengueModel_RecoveryRate(), theEcorePackage.getEDouble(), "recoveryRate", "0.274", 0, 1, VerySimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerySimpleDengueModel_ImmunityLossRate(), theEcorePackage.getEDouble(), "immunityLossRate", "0.0055", 0, 1, VerySimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerySimpleDengueModel_AdeFactor(), theEcorePackage.getEDouble(), "adeFactor", "1.0", 0, 1, VerySimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerySimpleDengueModel_ImmunityStrength(), theEcorePackage.getEDouble(), "immunityStrength", "0.0", 0, 1, VerySimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerySimpleDengueModel_PrimaryDeathRate(), theEcorePackage.getEDouble(), "primaryDeathRate", "0", 0, 1, VerySimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerySimpleDengueModel_SecondaryDeathRate(), theEcorePackage.getEDouble(), "secondaryDeathRate", "0", 0, 1, VerySimpleDengueModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dengueModelHostLabelEClass, DengueModelHostLabel.class, "DengueModelHostLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dengueModelHostLabelValueEClass, DengueModelHostLabelValue.class, "DengueModelHostLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDengueModelHostLabelValue_E1(), theEcorePackage.getEDouble(), "E1", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E2(), theEcorePackage.getEDouble(), "E2", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E3(), theEcorePackage.getEDouble(), "E3", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E4(), theEcorePackage.getEDouble(), "E4", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E12(), theEcorePackage.getEDouble(), "E12", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E13(), theEcorePackage.getEDouble(), "E13", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E14(), theEcorePackage.getEDouble(), "E14", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E21(), theEcorePackage.getEDouble(), "E21", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E23(), theEcorePackage.getEDouble(), "E23", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E24(), theEcorePackage.getEDouble(), "E24", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E31(), theEcorePackage.getEDouble(), "E31", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E32(), theEcorePackage.getEDouble(), "E32", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E34(), theEcorePackage.getEDouble(), "E34", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E41(), theEcorePackage.getEDouble(), "E41", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E42(), theEcorePackage.getEDouble(), "E42", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelHostLabelValue_E43(), theEcorePackage.getEDouble(), "E43", null, 0, 1, DengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dengueModelVectorLabelEClass, DengueModelVectorLabel.class, "DengueModelVectorLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dengueModelVectorLabelValueEClass, DengueModelVectorLabelValue.class, "DengueModelVectorLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDengueModelVectorLabelValue_E1(), theEcorePackage.getEDouble(), "E1", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_E2(), theEcorePackage.getEDouble(), "E2", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_E3(), theEcorePackage.getEDouble(), "E3", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_E4(), theEcorePackage.getEDouble(), "E4", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_I1(), theEcorePackage.getEDouble(), "I1", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_I2(), theEcorePackage.getEDouble(), "I2", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_I3(), theEcorePackage.getEDouble(), "I3", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_I4(), theEcorePackage.getEDouble(), "I4", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_Incidence1(), theEcorePackage.getEDouble(), "incidence1", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_Incidence2(), theEcorePackage.getEDouble(), "incidence2", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_Incidence3(), theEcorePackage.getEDouble(), "incidence3", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDengueModelVectorLabelValue_Incidence4(), theEcorePackage.getEDouble(), "incidence4", null, 0, 1, DengueModelVectorLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDengueModelEClass, AbstractDengueModel.class, "AbstractDengueModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleDengueModelHostLabelEClass, SimpleDengueModelHostLabel.class, "SimpleDengueModelHostLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleDengueModelHostLabelValueEClass, SimpleDengueModelHostLabelValue.class, "SimpleDengueModelHostLabelValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleDengueModelHostLabelValue_I1(), theEcorePackage.getEDouble(), "I1", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I2(), theEcorePackage.getEDouble(), "I2", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I3(), theEcorePackage.getEDouble(), "I3", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I4(), theEcorePackage.getEDouble(), "I4", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_C1(), theEcorePackage.getEDouble(), "C1", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_C2(), theEcorePackage.getEDouble(), "C2", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_C3(), theEcorePackage.getEDouble(), "C3", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_C4(), theEcorePackage.getEDouble(), "C4", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_R1(), theEcorePackage.getEDouble(), "R1", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_R2(), theEcorePackage.getEDouble(), "R2", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_R3(), theEcorePackage.getEDouble(), "R3", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_R4(), theEcorePackage.getEDouble(), "R4", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I12(), theEcorePackage.getEDouble(), "I12", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I13(), theEcorePackage.getEDouble(), "I13", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I14(), theEcorePackage.getEDouble(), "I14", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I21(), theEcorePackage.getEDouble(), "I21", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I23(), theEcorePackage.getEDouble(), "I23", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I24(), theEcorePackage.getEDouble(), "I24", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I31(), theEcorePackage.getEDouble(), "I31", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I32(), theEcorePackage.getEDouble(), "I32", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I34(), theEcorePackage.getEDouble(), "I34", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I41(), theEcorePackage.getEDouble(), "I41", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I42(), theEcorePackage.getEDouble(), "I42", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_I43(), theEcorePackage.getEDouble(), "I43", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_R(), theEcorePackage.getEDouble(), "R", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence1(), theEcorePackage.getEDouble(), "incidence1", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence2(), theEcorePackage.getEDouble(), "incidence2", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence3(), theEcorePackage.getEDouble(), "incidence3", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence4(), theEcorePackage.getEDouble(), "incidence4", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence12(), theEcorePackage.getEDouble(), "incidence12", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence21(), theEcorePackage.getEDouble(), "incidence21", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence31(), theEcorePackage.getEDouble(), "incidence31", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence41(), theEcorePackage.getEDouble(), "incidence41", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence13(), theEcorePackage.getEDouble(), "incidence13", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence23(), theEcorePackage.getEDouble(), "incidence23", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence32(), theEcorePackage.getEDouble(), "incidence32", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence42(), theEcorePackage.getEDouble(), "incidence42", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence14(), theEcorePackage.getEDouble(), "incidence14", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence24(), theEcorePackage.getEDouble(), "incidence24", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence34(), theEcorePackage.getEDouble(), "incidence34", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_Incidence43(), theEcorePackage.getEDouble(), "incidence43", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths1(), theEcorePackage.getEDouble(), "diseaseDeaths1", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths2(), theEcorePackage.getEDouble(), "diseaseDeaths2", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths3(), theEcorePackage.getEDouble(), "diseaseDeaths3", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths4(), theEcorePackage.getEDouble(), "diseaseDeaths4", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths12(), theEcorePackage.getEDouble(), "diseaseDeaths12", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths21(), theEcorePackage.getEDouble(), "diseaseDeaths21", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths31(), theEcorePackage.getEDouble(), "diseaseDeaths31", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths41(), theEcorePackage.getEDouble(), "diseaseDeaths41", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths13(), theEcorePackage.getEDouble(), "diseaseDeaths13", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths23(), theEcorePackage.getEDouble(), "diseaseDeaths23", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths32(), theEcorePackage.getEDouble(), "diseaseDeaths32", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths42(), theEcorePackage.getEDouble(), "diseaseDeaths42", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths14(), theEcorePackage.getEDouble(), "diseaseDeaths14", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths24(), theEcorePackage.getEDouble(), "diseaseDeaths24", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths34(), theEcorePackage.getEDouble(), "diseaseDeaths34", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleDengueModelHostLabelValue_DiseaseDeaths43(), theEcorePackage.getEDouble(), "diseaseDeaths43", null, 0, 1, SimpleDengueModelHostLabelValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/stem/modelgen/generated
		createGeneratedAnnotations();
		// http:///org/eclipse/stem/modelgen/model/label
		createLabelAnnotations();
		// http:///org/eclipse/stem/modelgen/model/labelvalue
		createLabelvalueAnnotations();
		// http:///org/eclipse/stem/modelgen/modelparam/constraints
		createConstraintsAnnotations();
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
		  (macdonaldRossDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });											
		addAnnotation
		  (vectorDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (dengueModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });																																																																																										
		addAnnotation
		  (simpleDengueModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });													
		addAnnotation
		  (verySimpleDengueModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });											
		addAnnotation
		  (dengueModelHostLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (dengueModelHostLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (dengueModelVectorLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (dengueModelVectorLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (abstractDengueModelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });				
		addAnnotation
		  (simpleDengueModelHostLabelEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
		   });		
		addAnnotation
		  (simpleDengueModelHostLabelValueEClass, 
		   source, 
		   new String[] {
			 "version", "1.0"
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
		  (macdonaldRossDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "SEIRLabel"
		   });											
		addAnnotation
		  (vectorDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "StandardDiseaseModelLabel"
		   });				
		addAnnotation
		  (dengueModelEClass, 
		   source, 
		   new String[] {
			 "*", "DengueModelHostLabel"
		   });																																																																																										
		addAnnotation
		  (simpleDengueModelEClass, 
		   source, 
		   new String[] {
			 "*", "SimpleDengueModelHostLabel"
		   });													
		addAnnotation
		  (verySimpleDengueModelEClass, 
		   source, 
		   new String[] {
			 "*", "SimpleDengueModelHostLabel"
		   });															
		addAnnotation
		  (abstractDengueModelEClass, 
		   source, 
		   new String[] {
			 "*", "DengueModelHostLabel"
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
		  (macdonaldRossDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "SEIRLabelValue"
		   });											
		addAnnotation
		  (vectorDiseaseModelEClass, 
		   source, 
		   new String[] {
			 "*", "StandardDiseaseModelLabelValue"
		   });				
		addAnnotation
		  (dengueModelEClass, 
		   source, 
		   new String[] {
			 "*", "DengueModelHostLabelValue"
		   });																																																																																										
		addAnnotation
		  (simpleDengueModelEClass, 
		   source, 
		   new String[] {
			 "*", "SimpleDengueModelHostLabelValue"
		   });													
		addAnnotation
		  (verySimpleDengueModelEClass, 
		   source, 
		   new String[] {
			 "*", "SimpleDengueModelHostLabelValue"
		   });															
		addAnnotation
		  (abstractDengueModelEClass, 
		   source, 
		   new String[] {
			 "*", "DengueModelHostLabelValue"
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
		  (getMacdonaldRossDiseaseModel_BitingRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getMacdonaldRossDiseaseModel_InfectiousBitingProportionHuman(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getMacdonaldRossDiseaseModel_InfectiousBitingProportionVector(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getMacdonaldRossDiseaseModel_RecoveryRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getMacdonaldRossDiseaseModel_IncubationRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getMacdonaldRossDiseaseModel_VectorIncubationRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getMacdonaldRossDiseaseModel_ImmunityLossRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });								
		addAnnotation
		  (getDengueModel_BitingRateSV(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_BitingRateIV(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostInfectivity1(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_HostInfectivity2(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_HostInfectivity3(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_HostInfectivity4(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryIncubationRate1(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryIncubationRate2(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryIncubationRate3(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryIncubationRate4(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryRecoveryRate1(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryRecoveryRate2(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryRecoveryRate3(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryRecoveryRate4(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryImmunityLossRate1(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryImmunityLossRate2(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryImmunityLossRate3(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryImmunityLossRate4(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryDiseaseDeathRate1(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryDiseaseDeathRate2(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryDiseaseDeathRate3(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostPrimaryDiseaseDeathRate4(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE12(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE13(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE14(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE21(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE23(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE24(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE31(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE32(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE34(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE41(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE42(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostADE43(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate12(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate13(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate14(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate21(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate23(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate24(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate31(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate32(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate34(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate41(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate42(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryDiseaseDeathRate43(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate12(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate13(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate14(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate21(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate23(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate24(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate31(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate32(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate34(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate41(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate42(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryRecoveryRate43(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate12(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate13(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate14(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate21(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate23(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate24(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate31(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate32(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate34(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate41(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate42(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_HostSecondaryIncubationRate43(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_VectorInfectivity1(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_VectorInfectivity2(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_VectorInfectivity3(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_VectorInfectivity4(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_VectorADE1(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_VectorADE2(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_VectorADE3(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_VectorADE4(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_VectorIncubationRate1(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_VectorIncubationRate2(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_VectorIncubationRate3(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_VectorIncubationRate4(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getDengueModel_Episilon1(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_Episilon2(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_Episilon3(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getDengueModel_Episilon4(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });					
		addAnnotation
		  (getSimpleDengueModel_HostTransmissionRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getSimpleDengueModel_AdeFactor(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getSimpleDengueModel_HostImmunityLossRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getSimpleDengueModel_HostPrimaryDeathRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getSimpleDengueModel_HostRecoveryRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getSimpleDengueModel_HostSecondaryDeathRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getSimpleDengueModel_VectorIncubationRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getSimpleDengueModel_VectorTransmissionRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getSimpleDengueModel_ImmunityStrength(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });					
		addAnnotation
		  (getVerySimpleDengueModel_TransmissionRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getVerySimpleDengueModel_RecoveryRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getVerySimpleDengueModel_ImmunityLossRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getVerySimpleDengueModel_AdeFactor(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getVerySimpleDengueModel_ImmunityStrength(), 
		   source, 
		   new String[] {
			 "minValue", "0",
			 "maxValue", "1"
		   });		
		addAnnotation
		  (getVerySimpleDengueModel_PrimaryDeathRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });		
		addAnnotation
		  (getVerySimpleDengueModel_SecondaryDeathRate(), 
		   source, 
		   new String[] {
			 "minValue", "0"
		   });									
	}

} //VectorPackageImpl
