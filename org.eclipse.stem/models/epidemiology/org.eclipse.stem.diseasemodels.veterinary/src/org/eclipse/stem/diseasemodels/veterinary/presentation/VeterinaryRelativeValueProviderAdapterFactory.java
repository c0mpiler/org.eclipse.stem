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
package org.eclipse.stem.diseasemodels.veterinary.presentation;

import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;

import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;

import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;

import org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelRelativeValueProvider;
import org.eclipse.stem.diseasemodels.standard.provider.StandardRelativeValueProviderAdapterFactory.DiseaseModelLabelValueRelativeValueProvider;

import org.eclipse.stem.diseasemodels.veterinary.provider.VeterinaryItemProviderAdapterFactory;

import org.eclipse.stem.diseasemodels.veterinary.util.VeterinaryAdapterFactory;

import org.eclipse.stem.ui.populationmodels.adapters.StandardRelativeValueProviderAdapterFactory.PopulationModelLabelValueRelativeValueProvider;
import org.eclipse.stem.ui.populationmodels.adapters.StandardRelativeValueProviderAdapterFactory.StandardPopulationModelLabelRelativeValueProvider;
import org.eclipse.ui.IStartup;

/**
 * @generated
 */
public class VeterinaryRelativeValueProviderAdapterFactory extends
		VeterinaryAdapterFactory 
		implements IStartup, RelativeValueProviderAdapterFactory {
	
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
	private static VeterinaryItemProviderAdapterFactory itemProviderFactory;	
	
	
	/**
	 * @generated
	 */
	public VeterinaryRelativeValueProviderAdapterFactory() {
		super();
		RelativeValueProviderAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @generated
	 */
	public void earlyStartup() {
		new VeterinaryRelativeValueProviderAdapterFactory();
	}

	/**
	 * @see org.eclipse.emf.edit.provider.IChangeNotifier#addListener(org.eclipse.emf.edit.provider.INotifyChangedListener)
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	} // addListener

	/**
	 * @see org.eclipse.emf.edit.provider.IChangeNotifier#fireNotifyChanged(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);
		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	} // fireNotifyChanged

	/**
	 * @see org.eclipse.emf.edit.provider.IChangeNotifier#removeListener(org.eclipse.emf.edit.provider.INotifyChangedListener)
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	} // removeListener

	/**
	 * @see org.eclipse.emf.edit.provider.ComposeableAdapterFactory#getRootAdapterFactory()
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	} // getRootAdapterFactory

	/**
	 * @see org.eclipse.emf.edit.provider.ComposeableAdapterFactory#setParentAdapterFactory(org.eclipse.emf.edit.provider.ComposedAdapterFactory)
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	} // setParentAdapterFactory

	/**
	 * This disposes all of the item providers created by this factory.
	 * 
	 * @see org.eclipse.emf.edit.provider.IDisposable#dispose()
	 * @generated
	 */
	public void dispose() {
		// Nothing
	} // dispose

	/**
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return super.isFactoryForType(type)
				|| type == RelativeValueProvider.class;
	}

	/**
	 * @return the instance of the Relative Value Provider Adapter Factory
	 * @generated
	 */
	private static RelativeValueProviderAdapterFactory getRelativeValueProviderAdapterFactory() {
		return RelativeValueProviderAdapterFactory.INSTANCE;
	}

	/**
	 * @return the instance of the Standard Item Provider factory.
	 * @generated
	 */
	private static VeterinaryItemProviderAdapterFactory getItemProviderFactory() {
		if (itemProviderFactory == null) {
			itemProviderFactory = new VeterinaryItemProviderAdapterFactory();
		}
		return itemProviderFactory;
	}

	/**
	 * @generated
	 */
	@Override
	public Adapter createSimpleVeterinaryDiseaseLabelAdapter() {
		return new SimpleVeterinaryDiseaseLabelRelativeValueProviderAdapter();
	}
	
 
	/**
	 * @generated
	 */
	@Override
	public Adapter createContaminatedUnitsLabelAdapter() {
		return new ContaminatedUnitsLabelRelativeValueProviderAdapter();
	}

	/**
	 * @generated
	 */
	@Override
	public Adapter createSimpleVeterinaryDiseaseLabelValueAdapter() {
		return new SimpleVeterinaryDiseaseLabelValueRelativeValueProviderAdapter();
	}
	

	/**
	 * @generated
	 */
	@Override
	public Adapter createContaminatedUnitsLabelValueAdapter() {
		return new ContaminatedUnitsLabelValueRelativeValueProviderAdapter();
	}


	/**
	 * @generated
	 */
	public static class SimpleVeterinaryDiseaseLabelRelativeValueProviderAdapter 
		extends DiseaseModelLabelRelativeValueProvider {
	
		/**
		 * @generated
		 */
		private IntegrationLabelValue getCurrentLabelValue() {
			return (IntegrationLabelValue)((IntegrationLabel)getTarget()).getCurrentValue();
		}

		/**
		 * @generated
		 */
		private RelativeValueProvider getCurrentLabelValueRelativeValueProvider() {
			return (RelativeValueProvider)getRelativeValueProviderAdapterFactory()
				.adapt(getCurrentLabelValue(), RelativeValueProvider.class);
		} 

		/**
		 * @generated
		 */
		@Override
		public List<IItemPropertyDescriptor> getProperties() {
			return getCurrentLabelValueRelativeValueProvider().getProperties();
		}

		/**
		 * @generated
		 */
		@Override
		public double getRelativeValue(final EStructuralFeature feature) {
			return getCurrentLabelValueRelativeValueProvider().getRelativeValue(feature);
		}
  
  		/**
		 * @generated
		 */
		@Override
		public double getDenominator(final EStructuralFeature feature) {
			return ((DiseaseModelLabelValue)getCurrentLabelValue()).getPopulationCount();
		}  
	}


	/**
	 * @generated
	 */
	public static class ContaminatedUnitsLabelRelativeValueProviderAdapter 
		extends StandardPopulationModelLabelRelativeValueProvider {
	
		/**
		 * @generated
		 */
		private IntegrationLabelValue getCurrentLabelValue() {
			return (IntegrationLabelValue)((IntegrationLabel)getTarget()).getCurrentValue();
		}

		/**
		 * @generated
		 */
		private RelativeValueProvider getCurrentLabelValueRelativeValueProvider() {
			return (RelativeValueProvider)getRelativeValueProviderAdapterFactory()
				.adapt(getCurrentLabelValue(), RelativeValueProvider.class);
		} 

		/**
		 * @generated
		 */
		@Override
		public List<IItemPropertyDescriptor> getProperties() {
			return getCurrentLabelValueRelativeValueProvider().getProperties();
		}

		/**
		 * @generated
		 */
		@Override
		public double getRelativeValue(final EStructuralFeature feature) {
			return super.getRelativeValue(feature);
		}
  
  		/**
		 * @generated
		 */
		@Override
		public double getDenominator(final EStructuralFeature feature) {
			//return 1.0;
			return super.getDenominator(feature);
		}
	}


	/**
	 * @generated
	 */
	public static class SimpleVeterinaryDiseaseLabelValueRelativeValueProviderAdapter 
		extends DiseaseModelLabelValueRelativeValueProvider {

		/**
		 * @generated
		 */
		@Override
		public List<IItemPropertyDescriptor> getProperties() {
			final IItemPropertySource propertySource = (IItemPropertySource)getItemProviderFactory()
					.adapt(getTarget(), PropertySource.class);

			final List<IItemPropertyDescriptor> properties = new ArrayList<IItemPropertyDescriptor>();
			for (IItemPropertyDescriptor descriptor : propertySource.getPropertyDescriptors(null)) {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				if (!(feature instanceof EReference)) {
					properties.add(descriptor);
				}
			}
			return properties;
		}

		/**
		 * @generated
		 */
		@Override
		public double getRelativeValue(final EStructuralFeature feature) {
			final IntegrationLabelValue labelValue = (IntegrationLabelValue)getTarget();
			final double stateCount = labelValue.eGetDouble(feature.getFeatureID());
			final double denominator = getDenominator(feature);
			if (denominator <= 0.0) {
				return 0.0;
			}
			return stateCount / denominator;
		}
		
		/**
		 * @generated
		 */
		@Override
		public double getDenominator(final EStructuralFeature feature) {
			return ((DiseaseModelLabelValue)getTarget()).getPopulationCount();
		}
	}


	/**
	 * @generated
	 */
	public static class ContaminatedUnitsLabelValueRelativeValueProviderAdapter 
		extends PopulationModelLabelValueRelativeValueProvider {

		/**
		 * @generated
		 */
		@Override
		public List<IItemPropertyDescriptor> getProperties() {
			final IItemPropertySource propertySource = (IItemPropertySource)getItemProviderFactory()
					.adapt(getTarget(), PropertySource.class);

			final List<IItemPropertyDescriptor> properties = new ArrayList<IItemPropertyDescriptor>();
			for (IItemPropertyDescriptor descriptor : propertySource.getPropertyDescriptors(null)) {
				final EStructuralFeature feature = (EStructuralFeature) descriptor
						.getFeature(null);
				if (!(feature instanceof EReference)) {
					properties.add(descriptor);
				}
			}
			return properties;
		}

		/**
		 * @generated
		 */
		@Override
		public double getRelativeValue(final EStructuralFeature feature) {
			return super.getRelativeValue(feature);
		}
  
  		/**
		 * @generated
		 */
		@Override
		public double getDenominator(final EStructuralFeature feature) {
			//return 1.0;
			return super.getDenominator(feature);
		}
	}

}