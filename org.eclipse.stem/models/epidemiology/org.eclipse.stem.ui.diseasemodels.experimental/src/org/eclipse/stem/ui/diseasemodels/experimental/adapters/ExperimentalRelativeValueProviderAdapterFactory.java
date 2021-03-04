// StandardRelativeValueProviderAdapterFactory.java
package org.eclipse.stem.ui.diseasemodels.experimental.adapters;

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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.experimental.provider.ExperimentalItemProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.experimental.util.ExperimentalAdapterFactory;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.ui.IStartup;

/**
 * This class is a factory for this model that creates
 * {@link RelativeValueProvider}'s for classes in the model.
 */
public class ExperimentalRelativeValueProviderAdapterFactory extends
		ExperimentalAdapterFactory implements RelativeValueProviderAdapterFactory, IStartup {
	
	/**
	 * This keeps track of the root adapter factory that delegates to this
	 * adapter factory.
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement
	 * {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This factory is used to create item providers for the adapted classes.
	 * The item providers are used as property sources to get the properties
	 * that can have relative values.
	 */
	private static ExperimentalItemProviderAdapterFactory itemProviderFactory;

	/**
	 * Constructor
	 */
	public ExperimentalRelativeValueProviderAdapterFactory() {
		super();
		RelativeValueProviderAdapterFactory.INSTANCE.addAdapterFactory(this);
	} // ExperimentalRelativeValueProviderAdapterFactory

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue <em>TB Disease Model Label Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.stem.diseasemodels.experimental.TBDiseaseModelLabelValue
	 * @generated
	 */
	public Adapter createTBDiseaseModelLabelValueAdapter() {
		return new ExperimentalDiseaseModelLabelValueRelativeValueProvider();
	}
	

	
	/**
	 * @see org.eclipse.emf.edit.provider.IChangeNotifier#addListener(org.eclipse.emf.edit.provider.INotifyChangedListener)
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	} // addListener

	/**
	 * @see org.eclipse.emf.edit.provider.IChangeNotifier#fireNotifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);
		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	} // fireNotifyChanged

	/**
	 * @see org.eclipse.emf.edit.provider.IChangeNotifier#removeListener(org.eclipse.emf.edit.provider.INotifyChangedListener)
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	} // removeListener

	/**
	 * @see org.eclipse.emf.edit.provider.ComposeableAdapterFactory#getRootAdapterFactory()
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	} // getRootAdapterFactory

	/**
	 * @see org.eclipse.emf.edit.provider.ComposeableAdapterFactory#setParentAdapterFactory(org.eclipse.emf.edit.provider.ComposedAdapterFactory)
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	} // setParentAdapterFactory

	/**
	 * @see org.eclipse.stem.diseasemodels.standard.util.StandardAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return type == RelativeValueProvider.class
				|| super.isFactoryForType(type);
	} // isFactoryForType

	/**
	 * This disposes all of the item providers created by this factory.
	 * 
	 * @see org.eclipse.emf.edit.provider.IDisposable#dispose()
	 */
	public void dispose() {
		// Nothing
	} // dispose

	/**
	 * @return the instance of the Relative Value Provider Adapter Factory
	 */
	@SuppressWarnings("unused")
	private static RelativeValueProviderAdapterFactory getRelativeValueProviderAdapterFactory() {
		return RelativeValueProviderAdapterFactory.INSTANCE;
	} // getRelativeValueProviderAdapterFactory

	
	public void earlyStartup() {
		// Done
	}
	
	/**
	 * @return the instance of the Standard Item Provider factory.
	 */
	private static ExperimentalItemProviderAdapterFactory getItemProviderFactory() {
		if (itemProviderFactory == null) {
			itemProviderFactory = new ExperimentalItemProviderAdapterFactory();
		}
		return itemProviderFactory;
	} // getItemProviderFactory
	
	public static class ExperimentalDiseaseModelLabelValueRelativeValueProvider extends
	RelativeValueProviderAdapter implements RelativeValueProvider {

		/**
		 * @see org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter#getProperties()
		 */
		@Override
		public List<IItemPropertyDescriptor> getProperties() {
			final List<IItemPropertyDescriptor> retValue = new ArrayList<IItemPropertyDescriptor>();
			final ExperimentalItemProviderAdapterFactory itemProviderFactory = getItemProviderFactory();
			final DiseaseModelLabelValue dmlv = (DiseaseModelLabelValue) getTarget();
			final IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory
					.adapt(dmlv, PropertySource.class);
			final List<IItemPropertyDescriptor> properties = propertySource
					.getPropertyDescriptors(null);
			// The list of property descriptors includes ones that do not have
			// relative values. We filter those out here and return the rest.
			for (IItemPropertyDescriptor descriptor : properties) {
				// Does this property have a relative value?
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				
				if(feature instanceof EReference) continue;
				//final int featureId = feature.getFeatureID();
				
				
				// new
				retValue.add(descriptor);
				// Old
				/*
				if (!(featureId == StandardPackage.DISEASE_MODEL_LABEL_VALUE__BIRTHS
						|| featureId == StandardPackage.DISEASE_MODEL_LABEL_VALUE__DEATHS
						|| featureId == StandardPackage.DISEASE_MODEL_LABEL_VALUE__DISEASE_DEATHS || featureId == StandardPackage.DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT)) {
					// Yes
					retValue.add(descriptor);
				} // if has relative value
				*/
				
			} // for
			return retValue;
		} // getProperties
		
		/**
		 * @see org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider#getRelativeValue(EStructuralFeature)
		 */
		public double getRelativeValue(final EStructuralFeature feature) {
			final DiseaseModelLabelValue dmlv = (DiseaseModelLabelValue) getTarget();
			final double stateCount = ((Double) dmlv.eGet(feature))
					.doubleValue();
			final double populationCount = dmlv.getPopulationCount();
			final double retValue = populationCount <= 0.0 ? 0.0
					: (stateCount / populationCount);
			return retValue;
		} // getRelativeValue
		
		/**
		 * This method returns the denominator or scale used to convert to relative
		 * values in the range 0-1. For example, in an Epidemic Compartment model
		 * the state values are normalized by population.
		 * It is required whenever we need to switch between relative and absolute values
		 * or can be used to create a label showing the maximum scale for any relative value.
		 * @return the denominator or scale used to normalize the relative value
		 */
		public double getDenominator(final EStructuralFeature feature) {
			final DiseaseModelLabelValue dmlv = (DiseaseModelLabelValue) getTarget();
			//final double populationCount = dmlv.getPopulationCount();
			return dmlv.getPopulationCount();
		}
	
	} // DiseaseModelLabelValueRelativeValueProvider
	
} // StandardRelativeValueProviderAdapterFactory
