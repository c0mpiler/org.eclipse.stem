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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.stem.diseasemodels.standard.DeterministicSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DeterministicSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.DeterministicSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.ExternalDataSourceDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.InfectorInoculatorCollection;
import org.eclipse.stem.diseasemodels.standard.SEIR;
import org.eclipse.stem.diseasemodels.standard.SEIRLabel;
import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.SI;
import org.eclipse.stem.diseasemodels.standard.SIInfector;
import org.eclipse.stem.diseasemodels.standard.SILabel;
import org.eclipse.stem.diseasemodels.standard.SILabelValue;
import org.eclipse.stem.diseasemodels.standard.SIR;
import org.eclipse.stem.diseasemodels.standard.SIRInoculator;
import org.eclipse.stem.diseasemodels.standard.SIRLabel;
import org.eclipse.stem.diseasemodels.standard.SIRLabelValue;
import org.eclipse.stem.diseasemodels.standard.StandardDiseaseInitializer;
import org.eclipse.stem.diseasemodels.standard.StandardFactory;
import org.eclipse.stem.diseasemodels.standard.StandardPackage;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticPoissonSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticSIDiseaseModel;
import org.eclipse.stem.diseasemodels.standard.StochasticSIRDiseaseModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
@SuppressWarnings("deprecation")
public class StandardFactoryImpl extends EFactoryImpl implements StandardFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardFactory init() {
		try {
			StandardFactory theStandardFactory = (StandardFactory)EPackage.Registry.INSTANCE.getEFactory(StandardPackage.eNS_URI);
			if (theStandardFactory != null) {
				return theStandardFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StandardFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardFactoryImpl() {
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
			case StandardPackage.DETERMINISTIC_SEIR_DISEASE_MODEL: return createDeterministicSEIRDiseaseModel();
			case StandardPackage.DETERMINISTIC_SI_DISEASE_MODEL: return createDeterministicSIDiseaseModel();
			case StandardPackage.DETERMINISTIC_SIR_DISEASE_MODEL: return createDeterministicSIRDiseaseModel();
			case StandardPackage.SEIR: return createSEIR();
			case StandardPackage.SEIR_LABEL: return createSEIRLabel();
			case StandardPackage.SEIR_LABEL_VALUE: return createSEIRLabelValue();
			case StandardPackage.SI: return createSI();
			case StandardPackage.SI_INFECTOR: return createSIInfector();
			case StandardPackage.SI_LABEL: return createSILabel();
			case StandardPackage.SI_LABEL_VALUE: return createSILabelValue();
			case StandardPackage.SIR: return createSIR();
			case StandardPackage.SIR_LABEL: return createSIRLabel();
			case StandardPackage.SIR_LABEL_VALUE: return createSIRLabelValue();
			case StandardPackage.STOCHASTIC_SEIR_DISEASE_MODEL: return createStochasticSEIRDiseaseModel();
			case StandardPackage.STOCHASTIC_SI_DISEASE_MODEL: return createStochasticSIDiseaseModel();
			case StandardPackage.STOCHASTIC_SIR_DISEASE_MODEL: return createStochasticSIRDiseaseModel();
			case StandardPackage.SIR_INOCULATOR: return createSIRInoculator();
			case StandardPackage.STOCHASTIC_POISSON_SI_DISEASE_MODEL: return createStochasticPoissonSIDiseaseModel();
			case StandardPackage.STOCHASTIC_POISSON_SIR_DISEASE_MODEL: return createStochasticPoissonSIRDiseaseModel();
			case StandardPackage.STOCHASTIC_POISSON_SEIR_DISEASE_MODEL: return createStochasticPoissonSEIRDiseaseModel();
			case StandardPackage.INFECTOR_INOCULATOR_COLLECTION: return createInfectorInoculatorCollection();
			case StandardPackage.STANDARD_DISEASE_INITIALIZER: return createStandardDiseaseInitializer();
			case StandardPackage.EXTERNAL_DATA_SOURCE_DISEASE_INITIALIZER: return createExternalDataSourceDiseaseInitializer();
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
			case StandardPackage.RANDOM:
				return createRandomFromString(eDataType, initialValue);
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
			case StandardPackage.RANDOM:
				return convertRandomToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeterministicSEIRDiseaseModel createDeterministicSEIRDiseaseModel() {
		DeterministicSEIRDiseaseModelImpl deterministicSEIRDiseaseModel = new DeterministicSEIRDiseaseModelImpl();
		return deterministicSEIRDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeterministicSIDiseaseModel createDeterministicSIDiseaseModel() {
		DeterministicSIDiseaseModelImpl deterministicSIDiseaseModel = new DeterministicSIDiseaseModelImpl();
		return deterministicSIDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeterministicSIRDiseaseModel createDeterministicSIRDiseaseModel() {
		DeterministicSIRDiseaseModelImpl deterministicSIRDiseaseModel = new DeterministicSIRDiseaseModelImpl();
		return deterministicSIRDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIR createSEIR() {
		SEIRImpl seir = new SEIRImpl();
		return seir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIRLabel createSEIRLabel() {
		SEIRLabelImpl seirLabel = new SEIRLabelImpl();
		return seirLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEIRLabelValue createSEIRLabelValue() {
		SEIRLabelValueImpl seirLabelValue = new SEIRLabelValueImpl();
		return seirLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SI createSI() {
		SIImpl si = new SIImpl();
		return si;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIInfector createSIInfector() {
		SIInfectorImpl siInfector = new SIInfectorImpl();
		return siInfector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SILabel createSILabel() {
		SILabelImpl siLabel = new SILabelImpl();
		return siLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SILabelValue createSILabelValue() {
		SILabelValueImpl siLabelValue = new SILabelValueImpl();
		return siLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIR createSIR() {
		SIRImpl sir = new SIRImpl();
		return sir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIRLabel createSIRLabel() {
		SIRLabelImpl sirLabel = new SIRLabelImpl();
		return sirLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIRLabelValue createSIRLabelValue() {
		SIRLabelValueImpl sirLabelValue = new SIRLabelValueImpl();
		return sirLabelValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticSEIRDiseaseModel createStochasticSEIRDiseaseModel() {
		StochasticSEIRDiseaseModelImpl stochasticSEIRDiseaseModel = new StochasticSEIRDiseaseModelImpl();
		return stochasticSEIRDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticSIDiseaseModel createStochasticSIDiseaseModel() {
		StochasticSIDiseaseModelImpl stochasticSIDiseaseModel = new StochasticSIDiseaseModelImpl();
		return stochasticSIDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticSIRDiseaseModel createStochasticSIRDiseaseModel() {
		StochasticSIRDiseaseModelImpl stochasticSIRDiseaseModel = new StochasticSIRDiseaseModelImpl();
		return stochasticSIRDiseaseModel;
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIRInoculator createSIRInoculator() {
		SIRInoculatorImpl sirInoculator = new SIRInoculatorImpl();
		return sirInoculator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticPoissonSIDiseaseModel createStochasticPoissonSIDiseaseModel() {
		StochasticPoissonSIDiseaseModelImpl stochasticPoissonSIDiseaseModel = new StochasticPoissonSIDiseaseModelImpl();
		return stochasticPoissonSIDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticPoissonSIRDiseaseModel createStochasticPoissonSIRDiseaseModel() {
		StochasticPoissonSIRDiseaseModelImpl stochasticPoissonSIRDiseaseModel = new StochasticPoissonSIRDiseaseModelImpl();
		return stochasticPoissonSIRDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StochasticPoissonSEIRDiseaseModel createStochasticPoissonSEIRDiseaseModel() {
		StochasticPoissonSEIRDiseaseModelImpl stochasticPoissonSEIRDiseaseModel = new StochasticPoissonSEIRDiseaseModelImpl();
		return stochasticPoissonSEIRDiseaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfectorInoculatorCollection createInfectorInoculatorCollection() {
		InfectorInoculatorCollectionImpl infectorInoculatorCollection = new InfectorInoculatorCollectionImpl();
		return infectorInoculatorCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardDiseaseInitializer createStandardDiseaseInitializer() {
		StandardDiseaseInitializerImpl standardDiseaseInitializer = new StandardDiseaseInitializerImpl();
		return standardDiseaseInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDataSourceDiseaseInitializer createExternalDataSourceDiseaseInitializer() {
		ExternalDataSourceDiseaseInitializerImpl externalDataSourceDiseaseInitializer = new ExternalDataSourceDiseaseInitializerImpl();
		return externalDataSourceDiseaseInitializer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return URI.createURI(initialValue);
	} // createURIFromString

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return instanceValue.toString();
	} // convertURIToString

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Random createRandomFromString(EDataType eDataType, String initialValue) {
		return new Random(Long.parseLong(initialValue));
	} // createRandomFromString

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRandomToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardPackage getStandardPackage() {
		return (StandardPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StandardPackage getPackage() {
		return StandardPackage.eINSTANCE;
	}

} //StandardFactoryImpl
