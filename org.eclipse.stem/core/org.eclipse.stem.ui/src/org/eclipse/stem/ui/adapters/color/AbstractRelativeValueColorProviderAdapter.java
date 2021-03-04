// AbstractRelativeValueColorProviderAdapter.java
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

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter;
import org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.preferences.MapsColorsPreferencePage;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.RGB;

/**
 * This is an abstract class that Relative Value Color Provider Adapter should extend.
 * It holds the common information for all color providers and has few abstract methods
 * that the concrete class should override.
 */
public abstract class AbstractRelativeValueColorProviderAdapter extends ColorProviderAdapter
		implements RelativeValueColorProvider {
	
	/**
	 * Holds the {@link Color} for relative value of 1
	 */
	private STEMColor max_FillColor;
	/**
	 * Holds the {@link Color} for relative values between 0.9 and 1
	 */
	private STEMColor range_09_1_FillColor;
	/**
	 * Holds the {@link Color} for relative values between 0.8 and 0.9
	 */
	private STEMColor range_08_09_FillColor;
	
	/**
	 * Holds the {@link Color} for relative values between 0.7 and 0.8
	 */
	private STEMColor range_07_08_FillColor;
	/**
	 * Holds the {@link Color} for relative values between 0.6 and 0.7
	 */
	private STEMColor range_06_07_FillColor;
	
	/**
	 * Holds the {@link Color} for relative values between 0.5 and 0.6
	 */
	private STEMColor range_05_06_FillColor;
	/**
	 * Holds the {@link Color} for relative values between 0.4 and 0.5
	 */
	private STEMColor range_04_05_FillColor;
	
	/**
	 * Holds the {@link Color} for relative values between 0.3 and 0.4
	 */
	private STEMColor range_03_04_FillColor;
	/**
	 * Holds the {@link Color} for relative values between 0.2 and 0.3
	 */
	private STEMColor range_02_03_FillColor;
	
	/**
	 * Holds the {@link Color} for relative values between 0.1 and 0.2
	 */
	private STEMColor range_01_02_FillColor;
	/**
	 * Holds the {@link Color} for relative values between 0 and 0.1
	 */
	private STEMColor range_0_01_FillColor;
	
	
	
	/**
	 * Holds the {@link Color} for relative values of 0
	 */
	protected STEMColor zero_FillColor;
	/**
	 * Holds the current foreground {@link Color} (the base color for AlphaComposite)
	 */
	protected STEMColor foregroundFillColor;	
	
	protected STEMColor borderColor;	
	
	
	/**
	 * Holds the current alpha value {@link Color} (for AlphaComposite)
	 * default is 255
	 */
	protected int alpha=255;	
	
	/**
	 * Holds the default background {@link Color} (the base color for AlphaComposite)
	 */
	public STEMColor backgroundFillColor;	
	/**
	 * The threshold under which values are considered zero
	 */
	protected final float ZERO_RELATIVE_VALUE_THRESHOLD = 0.000000001f;
	/**
	 * Reference to the selected {@link Decorator}
	 */
	protected Decorator selectedDecorator = null;
	/**
	 * Reference to the selected {@link Decorator}
	 */
	protected String selectedPopulationIdentifier = null;
	/**
	 * Instance of a relative value provider
	 */
	protected RelativeValueProviderAdapter rvp = null;
	/**
	 * Current device
	 */
	protected Device device = null;
	
	/**
	 * Constructor
	 */
	public AbstractRelativeValueColorProviderAdapter() {
		updateColorsFromPreferences();
	} // AbstractRelativeValueColorProviderAdapter
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.ColorProvider#getColor(Device)
	 */
	public STEMColor getColor() {
		return getColor(1.0f, false);
	} // getColor
	
	
	public STEMColor getColor(final float gainFactor, final boolean useLogScaling) {		
		double relativeValue = performGainAndLogScaling(getRelativeValue(), gainFactor, useLogScaling);		
		return getColorForRelativeValue(relativeValue);
	} // getColor
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.RelativeValueColorProvider#getRelativeValue()
	 */
	abstract public float getRelativeValue();
	
	/**
	 * The method returns the {@link Color} that matches the specified relative value.
	 * 
	 * @param relativeValue the relative value
	 * @return the matching {@link Color}
	 */
	public STEMColor getColorForRelativeValue(final double relativeValue) {
		
		STEMColor retValue = new STEMColor();

		updateColorsFromPreferences();
		if (relativeValue == 1) {
			retValue = max_FillColor;
		}
		else if (relativeValue > 0.9) {
			retValue = range_09_1_FillColor;
		} 
		else if (relativeValue > 0.8) {
			retValue = range_08_09_FillColor;
		} 
		else if (relativeValue > 0.7) {
			// Yes
			retValue = range_07_08_FillColor;
		} // if
		else if (relativeValue > 0.6) {
			// Yes
			retValue = range_06_07_FillColor;
		} // if
		else if (relativeValue > 0.5) {
			retValue = range_05_06_FillColor;
		}
		else if (relativeValue > 0.4) {
			retValue = range_04_05_FillColor;
		}
		else if (relativeValue > 0.3) {
			retValue = range_03_04_FillColor;
		}
		else if (relativeValue > 0.2) {
			retValue = range_02_03_FillColor;
		}
		else if (relativeValue > 0.1) {
			retValue = range_01_02_FillColor;
		}
		else if (relativeValue > ZERO_RELATIVE_VALUE_THRESHOLD) {
			retValue = range_0_01_FillColor;
		}
		else if (relativeValue <= ZERO_RELATIVE_VALUE_THRESHOLD) {
			retValue = zero_FillColor;
		}

		return retValue;
	} // getColorForRelativeValue
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.ColorProviderAdapter#isAdapterForType(java.lang.Object)
	 */
	@Override
	public boolean isAdapterForType(Object type) {
		return type == RelativeValueColorProvider.class;
	} // isAdapterForType
	
	/**
	 * The method will convert the RGB string into {@link Color}
	 * @param rgbString the RGB string
	 * @return the matching {@link Color}
	 */ 
	private STEMColor getColorFromString(final String rgbString) {
		
		if (rgbString == null || "".equals(rgbString)) {
			return new STEMColor();
		}
		
		
		RGB rgb = StringConverter.asRGB(rgbString);
		return new STEMColor(rgb.red, rgb.green, rgb.blue);

		
		
//		if (rgbString.equals("")) {
//			return device.getSystemColor(SWT.COLOR_BLACK);
//		}
//		
//		return new Color(device, rgb.red, rgb.green, rgb.blue);
	} // getColorFromString
	
	/**
	 * The method will update the colors fields for the value ranges from the preferences page.
	 */
	protected void updateColorsFromPreferences() {
		final IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		max_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_MAXIMUM_RELATIVE_VALUE_ID));
	
		range_09_1_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_10_ID));
		range_08_09_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_9_ID));
		range_07_08_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_8_ID));
		range_06_07_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_7_ID));
		range_05_06_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_6_ID));
		range_04_05_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_5_ID));
		range_03_04_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_4_ID));
		range_02_03_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_3_ID));
		range_01_02_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_2_ID));
		range_0_01_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_RANGE_1_ID));
		
		zero_FillColor = getColorFromString(preferenceStore.getString(RelativeValueColorPreferences.FOREGROUND_COLOR_ZERO_RELATIVE_VALUE_ID));
		foregroundFillColor = getColorFromString(preferenceStore.getString(MapsColorsPreferencePage.FOREGROUND_COLOR_ID));
		backgroundFillColor = getColorFromString(preferenceStore.getString(MapsColorsPreferencePage.BACKGROUND_COLOR_ID));
		
		borderColor = getColorFromString(preferenceStore.getString(MapsColorsPreferencePage.BORDERS_COLOR_ID));
	} // updateColorsFromPreferences
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.ColorProvider#setSelectedDecorator(org.eclipse.stem.core.model.Decorator)
	 */
	public void setSelectedDecorator(Decorator selectedDecorator) {
		this.selectedDecorator = selectedDecorator;
	} // setSelectedDecorator
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.ColorProvider#setSelectedDecorator(org.eclipse.stem.core.model.Decorator)
	 */
	public void setSelectedPopulationIdentifier(String selectedId) {
		this.selectedPopulationIdentifier = selectedId;
	} // setSelectedDecorator
	
	
	/**
	 * Method will set the target object at the instance of {@link RelativeValueProvider}.
	 * @param target The new target object
	 */
	protected void setRVPTarget(Notifier target) {
		if (rvp == null) {
			rvp = (RelativeValueProviderAdapter)RelativeValueProviderAdapterFactory.INSTANCE.adapt(target, RelativeValueProvider.class);
		}
		else {
			rvp.setTarget(target);
		}
	} // setRVPTarget
	
	
	/**
	 * 
	 * @return the current fill color
	 */
	public STEMColor getBackgroundFillColor() {
		return backgroundFillColor;
	}
	
	/**
	 * 
	 * @return
	 */
	public STEMColor getForegroundFillColor() {
		return foregroundFillColor;
	}

	public STEMColor getBorderColor() {
		return borderColor;
	}

	
	/**
	 * 
	 * @return the current alpha
	 */
	public int getAlpha() {
		return alpha;
	}
	
	/**
	 * @param v
	 * @return
	 */
	protected float performGainAndLogScaling(final float v, float gain, boolean logScaling) {
		double vDouble = v * gain;
		// make sure our linear scale is a fraction between 0.0 and 1.0
		if (vDouble > 1.0) {
			vDouble = 1.0; // saturation
		} else if (v < 0.0) {
			vDouble = 0.0; // should not happen
		}
		
		if (!logScaling) {
			return (float) vDouble;
		}

		// logarithmic color display
		// set scale 1.0 to 100.0
		double vScaled100 = vDouble * 99.0;
		// add 1.0 so we have no zeros
		vScaled100 += 1.0;
		// take the log base 10.0
		double newV = Math.log10(vScaled100);
		// we now have a number between 1 and 2 so divide by 2
		newV /= 2.0;

		return (float) newV;
	} // performLogScaling
	
} // AbstractRelativeValueColorProviderAdapter