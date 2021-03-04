/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv.presentation;

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
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.IntegrationLabelValue;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.polioopvipv.provider.PolioOpvIpvItemProviderAdapterFactory;
import org.eclipse.stem.diseasemodels.polioopvipv.util.PolioOpvIpvAdapterFactory;
import org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue;
import org.eclipse.ui.IStartup;

/**
 * @generated
 */
public class PolioOpvIpvRelativeValueProviderAdapterFactory extends
		PolioOpvIpvAdapterFactory 
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
	private static PolioOpvIpvItemProviderAdapterFactory itemProviderFactory;	
	
	
	/**
	 * @generated
	 */
	public PolioOpvIpvRelativeValueProviderAdapterFactory() {
		super();
		RelativeValueProviderAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @generated
	 */
	public void earlyStartup() {
		new PolioOpvIpvRelativeValueProviderAdapterFactory();
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
	private static PolioOpvIpvItemProviderAdapterFactory getItemProviderFactory() {
		if (itemProviderFactory == null) {
			itemProviderFactory = new PolioOpvIpvItemProviderAdapterFactory();
		}
		return itemProviderFactory;
	}

	/**
	 * @generated
	 */
	@Override
	public Adapter createPolioOpvIpvLabelAdapter() {
		return new PolioOpvIpvLabelRelativeValueProviderAdapter();
	}
	
 
	/**
	 * @generated
	 */
	@Override
	public Adapter createPolioOpvIpvLabelValueAdapter() {
		return new PolioOpvIpvLabelValueRelativeValueProviderAdapter();
	}
	


	/**
	 * @generated
	 */
	public static class PolioOpvIpvLabelRelativeValueProviderAdapter 
		extends RelativeValueProviderAdapter 
		implements RelativeValueProvider {
	
		/**
		 * @generated
		 */
		private IntegrationLabelValue getCurrentLabelValue() {
			return (IntegrationLabelValue)((IntegrationLabel)getTarget()).getCurrentValue();
		}

		/**
		 * @generated
		 */
		private RelativeValueProvider getCurrentRelativeValueProvider() {
			return (RelativeValueProvider)getRelativeValueProviderAdapterFactory()
				.adapt(getCurrentLabelValue(), RelativeValueProvider.class);
		} 

		/**
		 * @generated
		 */
		@Override
		public List<IItemPropertyDescriptor> getProperties() {
			return getCurrentRelativeValueProvider().getProperties();
		}

		/**
		 * @generated
		 */
		@Override
		public double getRelativeValue(final EStructuralFeature feature) {
			return getCurrentRelativeValueProvider().getRelativeValue(feature);
		}
		
		/**
		 * @generated
		 */
		@Override
		public double getDenominator(final EStructuralFeature feature) {
			DiseaseModelLabelValue labelValue = (DiseaseModelLabelValue)getCurrentLabelValue();
			return labelValue.getPopulationCount();
		}	
	}

	/**
	 * @generated
	 */
	public static class PolioOpvIpvLabelValueRelativeValueProviderAdapter 
		extends RelativeValueProviderAdapter 
		implements RelativeValueProvider {

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
			DiseaseModelLabelValue labelValue = (DiseaseModelLabelValue)getTarget();
			return labelValue.getPopulationCount();
		}	
	}

}