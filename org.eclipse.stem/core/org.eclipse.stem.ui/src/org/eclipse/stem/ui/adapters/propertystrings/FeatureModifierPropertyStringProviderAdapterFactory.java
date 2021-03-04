package org.eclipse.stem.ui.adapters.propertystrings;

/******************************************************************************
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.stem.core.modifier.util.ModifierAdapterFactory;

/**
 * This class is used to NLS'd strings for Label properties.
 */
public class FeatureModifierPropertyStringProviderAdapterFactory extends
		ModifierAdapterFactory implements PropertyStringProviderAdapterFactory {

	PropertyStringProviderAdapter adapter = null;

	/**
	 * Default Constructor
	 */
	public FeatureModifierPropertyStringProviderAdapterFactory() {
		super();
		PropertyStringProviderAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @see org.eclipse.emf.common.notify.impl.AdapterFactoryImpl#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return type == PropertyStringProvider.class
				|| super.isFactoryForType(type);
	}

//	/**
//	 * @see org.eclipse.stem.definitions.labels.util.LabelsAdapterFactory#createAreaLabelAdapter()
//	 */
//	@Override
//	public Adapter createAreaLabelAdapter() {
//		// Have we created one before?
//		if (adapter == null) {
//			// No
//			adapter = new LabelsPropertyStringProviderAdapter();
//		} // if we didn't create one before
//		return adapter;
//	}

	
	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.DoubleNOPModifier <em>Double NOP Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.DoubleNOPModifier
	 * @generated NOT
	 */
	public Adapter createDoubleNOPModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.DoubleRangeModifier <em>Double Range Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.DoubleRangeModifier
	 * @generated NOT
	 */
	public Adapter createDoubleRangeModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.DoubleSequenceModifier <em>Double Sequence Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.DoubleSequenceModifier
	 * @generated NOT
	 */
	public Adapter createDoubleSequenceModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.FeatureModifier <em>Feature Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.FeatureModifier
	 * @generated NOT
	 */
	public Adapter createFeatureModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.IntegerNOPModifier <em>Integer NOP Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.IntegerNOPModifier
	 * @generated NOT
	 */
	public Adapter createIntegerNOPModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.IntegerRangeModifier <em>Integer Range Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.IntegerRangeModifier
	 * @generated NOT
	 */
	public Adapter createIntegerRangeModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.IntegerSequenceModifier <em>Integer Sequence Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.IntegerSequenceModifier
	 * @generated NOT
	 */
	public Adapter createIntegerSequenceModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.LongNOPModifier <em>Long NOP Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.LongNOPModifier
	 * @generated NOT
	 */
	public Adapter createLongNOPModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.LongRangeModifier <em>Long Range Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.LongRangeModifier
	 * @generated NOT
	 */
	public Adapter createLongRangeModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.LongSequenceModifier <em>Long Sequence Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.LongSequenceModifier
	 * @generated NOT
	 */
	public Adapter createLongSequenceModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.Modifier
	 * @generated NOT
	 */
	public Adapter createModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.NOPModifier <em>NOP Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.NOPModifier
	 * @generated NOT
	 */
	public Adapter createNOPModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.RangeModifier <em>Range Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.RangeModifier
	 * @generated NOT
	 */
	public Adapter createRangeModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.STEMTimeNOPModifier <em>STEM Time NOP Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.STEMTimeNOPModifier
	 * @generated NOT
	 */
	public Adapter createSTEMTimeNOPModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.STEMTimeRangeModifier <em>STEM Time Range Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.STEMTimeRangeModifier
	 * @generated NOT
	 */
	public Adapter createSTEMTimeRangeModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.STEMTimeSequenceModifier <em>STEM Time Sequence Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.STEMTimeSequenceModifier
	 * @generated NOT
	 */
	public Adapter createSTEMTimeSequenceModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.SequenceModifier <em>Sequence Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.SequenceModifier
	 * @generated NOT
	 */
	public Adapter createSequenceModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.StringNOPModifier <em>String NOP Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.StringNOPModifier
	 * @generated NOT
	 */
	public Adapter createStringNOPModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.StringSequenceModifier <em>String Sequence Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.StringSequenceModifier
	 * @generated NOT
	 */
	public Adapter createStringSequenceModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.Modifiable <em>Modifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.Modifiable
	 * @generated NOT
	 */
	public Adapter createModifiableAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.SingleValueModifier <em>Single Value Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.SingleValueModifier
	 * @generated NOT
	 */
	public Adapter createSingleValueModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.DoubleModifier <em>Double Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.DoubleModifier
	 * @generated NOT
	 */
	public Adapter createDoubleModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.IntegerModifier <em>Integer Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.IntegerModifier
	 * @generated NOT
	 */
	public Adapter createIntegerModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.LongModifier <em>Long Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.LongModifier
	 * @generated NOT
	 */
	public Adapter createLongModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.modifier.STEMTimeModifier <em>STEM Time Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.modifier.STEMTimeModifier
	 * @generated NOT
	 */
	public Adapter createSTEMTimeModifierAdapter() {
		if (adapter == null) {
			adapter = new FeatureModifierPropertyStringProviderAdapter();
		}
		return adapter;
	}

	/*
	 * This class represents
	 */
	public static class FeatureModifierPropertyStringProviderAdapter extends
			PropertyStringProviderAdapter {

		/**
		 * @param descriptor
		 * @return the NLS'd name of the property to display to the user
		 */
		public String getPropertyName(IItemPropertyDescriptor descriptor) {
			return Messages.getString(((EStructuralFeature) descriptor
					.getFeature(null)).getName());
		} // getPropertyName

		/**
		 * @param descriptor
		 * @return the NLS'd tool tip text that describes the property
		 */
		public String getPropertyToolTip(IItemPropertyDescriptor descriptor) {
			final EStructuralFeature feature = (EStructuralFeature) descriptor
					.getFeature(null);
			return Messages.getString(feature.getName() + TT_SUFFIX);
		} // getPropertyToolTip

		/**
		 * @param descriptor
		 * @return the NLS'd text that represents the units of the property
		 */
		public String getPropertyUnits(IItemPropertyDescriptor descriptor) {
			final EStructuralFeature feature = (EStructuralFeature) descriptor
					.getFeature(null);
			return Messages.getString(feature.getName() + UNIT_SUFFIX);
		} // getPropertyUnits

	} // LabelsPropertyStringProviderAdapter
} // LabelsPropertyStringProviderAdapterFactory
