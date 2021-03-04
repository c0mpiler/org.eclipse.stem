// StandardRelativeValueProviderAdapterFactory.java
package org.eclipse.stem.populationmodels.standard.provider;

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
import org.eclipse.stem.populationmodels.standard.PopulationModelLabel;
import org.eclipse.stem.populationmodels.standard.PopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.StandardPopulationModelLabelValue;
import org.eclipse.stem.populationmodels.standard.util.StandardAdapterFactory;


/**
 * This class is a factory for this model that creates
 * {@link RelativeValueProvider}'s for classes in the model.
 */
public class StandardRelativeValueProviderAdapterFactory extends
		StandardAdapterFactory implements RelativeValueProviderAdapterFactory {

	// dynamically track and update the denominator
	// protected static final Map<EStructuralFeature,Double> dynamicDenominatorMap = new HashMap<EStructuralFeature,Double>();
	protected static final double DENOMINATOR = 1.0;
	
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
	private static StandardItemProviderAdapterFactory itemProviderFactory;

	/**
	 * Constructor
	 */
	public StandardRelativeValueProviderAdapterFactory() {
		super();
		RelativeValueProviderAdapterFactory.INSTANCE.addAdapterFactory(this);
	} // StandardRelativeValueProviderAdapterFactory

	/**
	 * This method is called by the {@link StandardSwitch} instance in the
	 * parent {@link StandardAdapterFactory} for all cases for classes derived
	 * from {@link PopulationModelLabel} (e.g., {@link SILabel}, {@link SIRLabel},
	 * {@link SEIRLabel}).
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.util.StandardAdapterFactory#createPopulationModelLabelAdapter()
	 */
	@Override
	public Adapter createPopulationModelLabelAdapter() {
		// It seems that you can't have singleton adapters that provide
		// behavioral extensions without explicitly setting the target
		// each time it is adapted
		return new PopulationModelLabelRelativeValueProvider();
	} // createPopulationModelLabelAdapter

	/**
	 * This method is called by the {@link StandardSwitch} instance in the
	 * parent {@link StandardAdapterFactory} for all cases for classes derived
	 * from {@link PopulationModelLabelValue} (e.g., {@link SILabelValue},
	 * {@link SIRLabelValue}, {@link SEIRLabelValue}).
	 * 
	 * @see org.eclipse.stem.diseasemodels.standard.util.StandardAdapterFactory#createPopulationModelLabelValueAdapter()
	 */
	@Override
	public Adapter createPopulationModelLabelValueAdapter() {
		// It seems that you can't have singleton adapters that provide
		// behavioral extensions without explicitly setting the target
		// each time it is adapted
		return new PopulationModelLabelValueRelativeValueProvider();
	} // createPopulationModelLabelValueAdapter

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
	private static RelativeValueProviderAdapterFactory getRelativeValueProviderAdapterFactory() {
		return RelativeValueProviderAdapterFactory.INSTANCE;
	} // getRelativeValueProviderAdapterFactory

	/**
	 * @return the instance of the Standard Item Provider factory.
	 */
	private static StandardItemProviderAdapterFactory getItemProviderFactory() {
		if (itemProviderFactory == null) {
			itemProviderFactory = new StandardItemProviderAdapterFactory();
		}
		return itemProviderFactory;
	} // getItemProviderFactory

	/**
	 * This class is a Relative Value Provider for PopulationModelLabel instances.
	 * It provides a collection of the properties that can have relative values
	 * and will compute the value between 0.0 and 1.0 for any of those
	 * properties.
	 * 
	 * @see PopulationModelLabelValueRelativeValueProvider
	 */
	public static class PopulationModelLabelRelativeValueProvider extends
			RelativeValueProviderAdapter implements RelativeValueProvider {

		/**
		 * @see org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter#getProperties()
		 */
		@Override
		public List<IItemPropertyDescriptor> getProperties() {
			final PopulationModelLabel dml = (PopulationModelLabel) getTarget();
			final RelativeValueProvider rvp = (RelativeValueProvider) getRelativeValueProviderAdapterFactory()
					.adapt(dml.getCurrentValue(), RelativeValueProvider.class);
			return rvp.getProperties();
		} // getProperties

		/**
		 * @see org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter#getRelativeValue(org.eclipse.emf.ecore.EStructuralFeature)
		 */
		@Override
		public double getRelativeValue(EStructuralFeature feature) {
			final PopulationModelLabel dml = (PopulationModelLabel) getTarget();
			final RelativeValueProvider rvp = (RelativeValueProvider) getRelativeValueProviderAdapterFactory()
					.adapt(dml.getCurrentValue(), RelativeValueProvider.class);
			return rvp.getRelativeValue(feature);
		} // getRelativeValue
		
		/**
		 * this helper method returns the absolute total population.
		 * It is required whenever we need to switch between relative and absolute values
		 * @return the total current population count (absolute)
		 */
		public double getDenominator(final EStructuralFeature feature) {
//			if(dynamicDenominatorMap.containsKey(feature)) {
//				return dynamicDenominatorMap.get(feature).doubleValue();
//			} else {
//				dynamicDenominatorMap.put(feature, Double.valueOf(1.0));
//				return 1.0;
//			}
			return DENOMINATOR;
		}
		
		
		

	} // PopulationModelLabelRelativeValueProvider

	/**
	 * This class is a Relative Value Provider for PopulationModelLabelValue
	 * instances. It provides a collection of the properties that can have
	 * relative values and will compute the value between 0.0 and 1.0 for any of
	 * those properties.
	 * <p>
	 * The {@link PopulationModelLabelValueRelativeValueProvider} instance that we
	 * create here filters out the properties that are not relative and can
	 * reflectively compute the relative value, with respect to the population
	 * count for the disease model label value, for the remaining properties. If
	 * a new sub-class of {@link PopulationModelLabelValue} is introduced that has
	 * other non-relative properties, they would not be filtered out by this
	 * {@link RelativeValueProvider} so a corresponding sub-class of
	 * {@link PopulationModelLabelValueRelativeValueProvider} would need to be
	 * defined that implemented {@link RelativeValueProvider#getProperties()}
	 * such that it first called its super-class
	 * <code>super.getProperties</code> (i.e.,
	 * {@link PopulationModelLabelValueRelativeValueProvider#getProperties()}) to
	 * get the list of filtered properties. Then, it would need to remove any
	 * non-relative properties that it knows about from that list.
	 * <p>
	 * There would probably be no need for the new class to override
	 * {@link PopulationModelLabelValueRelativeValueProvider#getRelativeValue(EStructuralFeature)}
	 * as the relative values are computed such that the new property values are
	 * obtained reflexively, so they should be found. This assumes that the new
	 * values are relative to the population count (i.e.,
	 * {@link PopulationModelLabelValue#getPopulationCount()}). If they're
	 * relative to some other value then an override would be necessary.
	 */
	public static class PopulationModelLabelValueRelativeValueProvider extends
			RelativeValueProviderAdapter implements RelativeValueProvider {

		/**
		 * @see org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter#getProperties()
		 */
		@Override
		public List<IItemPropertyDescriptor> getProperties() {
			final List<IItemPropertyDescriptor> retValue = new ArrayList<IItemPropertyDescriptor>();
			final StandardItemProviderAdapterFactory itemProviderFactory = getItemProviderFactory();
			final PopulationModelLabelValue dmlv = (PopulationModelLabelValue) getTarget();
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
				// final int featureId = feature.getFeatureID();
				
				
				// new
//				if (!(featureId == StandardPackage.SI_LABEL_VALUE__DISEASE_DEATHS 
//						|| featureId == StandardPackage.DISEASE_MODEL_LABEL_VALUE__POPULATION_COUNT)) {
					// Yes
					retValue.add(descriptor);
//				} // if has relative value
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
			final StandardPopulationModelLabelValue dmlv = (StandardPopulationModelLabelValue) getTarget();
			
			final double populationCount = dmlv.getCount();
			
//			if(dynamicDenominatorMap.containsKey(feature)) {
//				double oldVal = dynamicDenominatorMap.get(feature).doubleValue();
//				if(oldVal < populationCount) dynamicDenominatorMap.put(feature, Double.valueOf(populationCount));
//			} else {
//				dynamicDenominatorMap.put(feature, Double.valueOf(populationCount));
//			}
//			double denom = dynamicDenominatorMap.get(feature).doubleValue();
//			final double retVal = populationCount/denom;
			final double retVal = populationCount/DENOMINATOR;
			return retVal;
		} // getRelativeValue
		
		/**
		 * TODO may want to model the denominator for a population
		 * @return the denominator or scale used to normalize the relative value
		 */
		public double getDenominator(final EStructuralFeature feature) {
//			if(dynamicDenominatorMap.containsKey(feature)) {
//				return dynamicDenominatorMap.get(feature).doubleValue();
//			} else {
//				dynamicDenominatorMap.put(feature, Double.valueOf(1.0));
//				return 1.0;
//			}
			return DENOMINATOR;
		}
		
	} // PopulationModelLabelValueRelativeValueProvider
} // StandardRelativeValueProviderAdapterFactory
