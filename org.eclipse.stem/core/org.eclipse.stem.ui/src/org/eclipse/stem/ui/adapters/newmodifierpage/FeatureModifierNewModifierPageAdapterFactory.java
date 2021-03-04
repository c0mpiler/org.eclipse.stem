// LabelsNewModifierPageAdapterFactory.java
package org.eclipse.stem.ui.adapters.newmodifierpage;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.modifier.FeatureModifier;
import org.eclipse.stem.core.modifier.ModifierPackage;
import org.eclipse.stem.core.modifier.util.ModifierAdapterFactory;
import org.eclipse.stem.ui.adapters.newmodifierpage.GraphNewModifierPageAdapterFactory.StaticLabelNewModifierPageAdapter;
import org.eclipse.stem.ui.wizards.NewModifierPage;

/**
 * This class is an {@link NewModifierPageAdapterFactory} that adapts members of
 * the Modifier to {@link NewModifierPage}s.
 */
public class FeatureModifierNewModifierPageAdapterFactory extends ModifierAdapterFactory
		implements NewModifierPageAdapterFactory {

	/**
	 * Default constructor
	 */
	public FeatureModifierNewModifierPageAdapterFactory() {
		super();
		NewModifierPageAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * 
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return type == NewModifierPageAdapter.class
				|| super.isFactoryForType(type);
	}

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
		 return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
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
		return new FeatureModifierNewModifierPageAdapter();
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.lang.Comparable
	 * @generated NOT
	 */
	public Adapter createComparableAdapter() {
		return new FeatureModifierNewModifierPageAdapter();
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.common.SanityChecker <em>Sanity Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.common.SanityChecker
	 * @generated NOT
	 */
	public Adapter createSanityCheckerAdapter() {
		return new FeatureModifierNewModifierPageAdapter();
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.core.common.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.core.common.Identifiable
	 * @generated NOT
	 */
	public Adapter createIdentifiableAdapter() {
		return new FeatureModifierNewModifierPageAdapter();
	}

	/**
	 * 
	 * 
	 */
	public class FeatureModifierNewModifierPageAdapter extends
			StaticLabelNewModifierPageAdapter {

		/**
		 * @see org.eclipse.stem.ui.adapters.newmodifierpage.NewModifierPageAdapter#createNewModifierPage()
		 */
		@Override
		public NewModifierPage createNewModifierPage() {
			return new NewModifierPage((FeatureModifier) getTarget()) {
				@Override
				protected boolean isUserSpecifiedProperty(
						final EStructuralFeature feature) {
					boolean retValue = false;
					final EClass containingClass = feature.getEContainingClass();
					// Is it a disease model property?
					if (containingClass.equals(ModifierPackage.eINSTANCE.getFeatureModifier())
							|| containingClass.getEAllSuperTypes().contains(
									ModifierPackage.eINSTANCE.getFeatureModifier())) {
						
						retValue = super.isModifiableProperty(feature);
						
						retValue = retValue
								&& !feature.equals(ModifierPackage.eINSTANCE
										.getFeatureModifier_FeatureName());
						
						retValue = retValue
								&& !feature.equals(ModifierPackage.eINSTANCE
										.getFeatureModifier_Complete());
						
						retValue = retValue
								&& !feature.equals(ModifierPackage.eINSTANCE
										.getDoubleModifier_OriginalValue());
						
						retValue = retValue
								&& !feature.equals(ModifierPackage.eINSTANCE
										.getDoubleRangeModifier_OriginalValue());
						
						retValue = retValue
								&& !feature.equals(ModifierPackage.eINSTANCE
										.getIntegerModifier_OriginalValue());
						
						retValue = retValue
								&& !feature.equals(ModifierPackage.eINSTANCE
										.getIntegerRangeModifier_OriginalValue());
						
						retValue = retValue
								&& !feature.equals(ModifierPackage.eINSTANCE
										.getLongModifier_OriginalValue());
						
						retValue = retValue
								&& !feature.equals(ModifierPackage.eINSTANCE
										.getLongRangeModifier_OriginalValue());
						
						
					} // if a disease model property
					return retValue;
				} // isUserSpecifiedProperty

				@Override
				protected String getBottomText() {
					return "";
				}

				@Override
				protected boolean isModifiableProperty(
						final EStructuralFeature feature) {
					boolean retValue = super.isModifiableProperty(feature);

					return retValue;
				} // isModifiableProperty
			};
		} // createNewModifierPage
		
	}
} 
