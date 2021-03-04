// AbstractRelativeValueColorProviderAdapterFactory.java
package org.eclipse.stem.ui.adapters.color;

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

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.stem.ui.Activator;
import org.eclipse.swt.widgets.Composite;

/**
 * This is an abstract class that Relative Value Color Provider Adapter Factories should extend.
 * It holds the common information for all color providers and has few abstract methods
 * that the concrete class should override.
 */
public abstract class AbstractRelativeValueColorProviderAdapterFactory 
	extends AbstractColorProviderAdapterFactory {
	
	/**
	 * This is the properties composite that will be contributed to the view
	 */
	protected Composite propertiesComposite;
	/**
	 * A list of {@link PropertySelectionListener}s to be notified about
	 * property selection events
	 */
	private final List<PropertySelectionListener> propertySelectionListeners = new CopyOnWriteArrayList<PropertySelectionListener>();
	/**
	 * The currently selected {@link ItemPropertyDescriptor}
	 */
	protected ItemPropertyDescriptor selectedProperty = null;
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.AbstractColorProviderAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return type == RelativeValueColorProvider.class;
	} // isFactoryForType
	
	/**
	 * @see org.eclipse.stem.core.graph.util.GraphAdapterFactory#createGraphAdapter()
	 */
	@Override
	public Adapter createGraphAdapter() {		
		return createNodeAdapter();
	} // createGraphAdapter

	/**
	 * @see org.eclipse.emf.edit.provider.ComposeableAdapterFactory#getRootAdapterFactory()
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		// TODO Auto-generated method stub
		return null;
	} // getRootAdapterFactory

	/**
	 * @see org.eclipse.emf.edit.provider.ComposeableAdapterFactory#setParentAdapterFactory(org.eclipse.emf.edit.provider.ComposedAdapterFactory)
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parent) {
		// TODO Auto-generated method stub
	} // setParentAdapterFactory
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.IColorProviderAdapterFactory#createColorsLegendComposite(org.eclipse.swt.widgets.Composite, int)
	 */
	public abstract Composite createColorsLegendComposite(Composite parent, int style);
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.IColorProviderAdapterFactory#getPropertiesComposite()
	 */
	public Composite getPropertiesComposite() {
		return propertiesComposite;
	} // getPropertiesComposite
	
	protected String getPreferenceValue(final String prefId) {
		final IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		return preferenceStore.getString(prefId);
	} // getPreferenceValue
	
	/**
	 * This interface is implemented by classes that wish to be notified
	 * whenever a property is selected in this widget.
	 */
	public interface PropertySelectionListener {
		/**
		 * @param selectedProperty
		 */
		void propertySelected(ItemPropertyDescriptor selectedProperty);
	} // PropertySelectionListener
	
	/**
	 * @param listener
	 */
	public void addPropertySelectionListener(
			final PropertySelectionListener listener) {
		propertySelectionListeners.add(listener);
	} // addPropertySelectionListener

	/**
	 * @param listener
	 */
	public void removePropertySelectionListener(
			final PropertySelectionListener listener) {
		propertySelectionListeners.remove(listener);
	} // removePropertySelectionListener

	/**
	 * @param selectedProperty
	 */
	public void firePropertySelectionListener(ItemPropertyDescriptor selectedProperty) {
		for (final PropertySelectionListener listener : propertySelectionListeners) {
			listener.propertySelected(selectedProperty);
		} // for each PropertySelectionListener
	} // firePropertySelectionEvent
	
} // AbstractRelativeValueColorProviderAdapterFactory