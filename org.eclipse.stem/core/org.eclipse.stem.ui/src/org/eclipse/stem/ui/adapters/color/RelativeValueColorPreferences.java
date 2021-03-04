// RelativeValueColorPreferences.java
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

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.stem.ui.preferences.MapsColorsPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;

/**
 * This class holds the preferences contribution to the main preferences page for all relative
 * value color providers.
 */
public class RelativeValueColorPreferences 
	implements IPreferencesContributer {
	
	/**
	 * The {@link MapsColorsPreferencePage} the this preferences have been added to
	 */
	protected MapsColorsPreferencePage preferencesPage;
	
	/**
	 * The preferences field editor for foreground color of zero relative value
	 */
	public static final String FOREGROUND_COLOR_ZERO_RELATIVE_VALUE_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorzero";

	/**
	 * The preferences field editor for foreground color of range 1
	 */
	public static final String FOREGROUND_COLOR_RANGE_1_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange1";

	/**
	 * The preferences field editor for foreground color of range 2
	 */
	public static final String FOREGROUND_COLOR_RANGE_2_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange2";

	/**
	 * The preferences field editor for foreground color of range 3
	 */
	public static final String FOREGROUND_COLOR_RANGE_3_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange3";

	/**
	 * The preferences field editor for foreground color of range 4
	 */
	public static final String FOREGROUND_COLOR_RANGE_4_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange4";
	/**
	 * The preferences field editor for foreground color of range 5
	 */
	public static final String FOREGROUND_COLOR_RANGE_5_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange5";
	/**
	 * The preferences field editor for foreground color of range 6
	 */
	public static final String FOREGROUND_COLOR_RANGE_6_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange6";
	/**
	 * The preferences field editor for foreground color of range 7
	 */
	public static final String FOREGROUND_COLOR_RANGE_7_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange7";
	/**
	 * The preferences field editor for foreground color of range 8
	 */
	public static final String FOREGROUND_COLOR_RANGE_8_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange8";
	/**
	 * The preferences field editor for foreground color of range 9
	 */
	public static final String FOREGROUND_COLOR_RANGE_9_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange9";
	/**
	 * The preferences field editor for foreground color of range 10
	 */
	public static final String FOREGROUND_COLOR_RANGE_10_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolorrange10";
	
	/**
	 * The preferences field editor for foreground color of maximum relative value
	 */
	public static final String FOREGROUND_COLOR_MAXIMUM_RELATIVE_VALUE_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.foregroundcolormaximum";

	/**
	 * The preferences field editor for alpha composite
	 */
	public static final String USE_ALPHA_COMPOSITE_ID = "org.eclipse.stem.ui.views.geographic.map.preferences.usealphacomposite";

	/**
	 * The default color for preferences field editor for zero relative value (0.0)
	 */
	public static final String FOREGROUND_COLOR_ZERO_RELATIVE_VALUE_DEFAULT_RGB_STRING = "255,255,255"; 			//Black

	/**
	 * The default color for preferences field editor for foreground color of range 1
	 */
	public static final String FOREGROUND_COLOR_RANGE_1_DEFAULT_RGB_STRING = "231,231,231";					//gray

	/**
	 * The default color for preferences field editor for foreground color of range 2
	 */
	public static final String FOREGROUND_COLOR_RANGE_2_DEFAULT_RGB_STRING = "255,255,192"; 					//yelow pale pale pale

	/**	
	 * The default color for preferences field editor for foreground color of range 3
	 */
	public static final String FOREGROUND_COLOR_RANGE_3_DEFAULT_RGB_STRING = "255,255,128"; 					//yelow pale pale

	/**
	 * The default color for preferences field editor for foreground color of range 4
	 */
	public static final String FOREGROUND_COLOR_RANGE_4_DEFAULT_RGB_STRING = "255,255,64"; 					//Yellow pale

	/**
	 * The default color for preferences field editor for foreground color of range 5
	 */
	public static final String FOREGROUND_COLOR_RANGE_5_DEFAULT_RGB_STRING = "255,255,0";						//Yellow

	/**
	 * The default color for preferences field editor for foreground color of range 6
	 */
	public static final String FOREGROUND_COLOR_RANGE_6_DEFAULT_RGB_STRING = "255,223,0";					//Orange-yellow

	/**
	 * The default color for preferences field editor for foreground color of range 7
	 */
	public static final String FOREGROUND_COLOR_RANGE_7_DEFAULT_RGB_STRING = "255,192,0";					//Orange
	
	/**
	 * The default color for preferences field editor for foreground color of range 8
	 */
	public static final String FOREGROUND_COLOR_RANGE_8_DEFAULT_RGB_STRING = "255,128,0";					//Orange-red
	
	/**
	 * The default color for preferences field editor for foreground color of range 9
	 */
	public static final String FOREGROUND_COLOR_RANGE_9_DEFAULT_RGB_STRING = "255,96,0";						//RED-orange
	
	/**
	 * The default color for preferences field editor for foreground color of range 10
	 */
	public static final String FOREGROUND_COLOR_RANGE_10_DEFAULT_RGB_STRING = "255,64,0";					//Red-RED-orange
	
	/**
	 * The default color for preferences field editor for maximum relative value (1.0)
	 */
	public static final String FOREGROUND_COLOR_MAXIMUM_RELATIVE_VALUE_DEFAULT_RGB_STRING = "255,0,0";	//Red

	/**
	 * The group that groups field editors from this preferences contributer
	 */
	private Group relativeValuesPrefGroup;	

	/**
	 * The alpha composite boolean field editor
	 */
	 static BooleanFieldEditor useAlphaCompositeBooleanFieldEditor;

	 /**
	 * The color field editor for zero relative value
	 */
	 static ColorFieldEditor zeroColorFieldEditor;

	 /**
	 * The color field editor for range 1
	 */
	 static ColorFieldEditor range1ColorFieldEditor;

	 /**
	 * The color field editor for range 2
	 */
	 static ColorFieldEditor range2ColorFieldEditor;

	 /**
	 * The color field editor for range 3
	 */
	 static ColorFieldEditor range3ColorFieldEditor;

	 /**
	 * The color field editor for range 4
	 */
	 static ColorFieldEditor range4ColorFieldEditor;

	 /**
	 * The color field editor for range 5
	 */
	 static ColorFieldEditor range5ColorFieldEditor;
	 
	 /**
	 * The color field editor for range 6
	 */
	static ColorFieldEditor range6ColorFieldEditor;
	/**
	 * The color field editor for range 7
	 */
	static ColorFieldEditor range7ColorFieldEditor;
	/**
	 * The color field editor for range 8
	 */
	static ColorFieldEditor range8ColorFieldEditor;
	/**
	 * The color field editor for range 9
	 */
	static ColorFieldEditor range9ColorFieldEditor;
	/**
	 * The color field editor for range 10
	 */
	static ColorFieldEditor range10ColorFieldEditor;

	 /**
	 * The color field editor for maximum relative value
	 */
	 static ColorFieldEditor maxColorFieldEditor;
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.IPreferencesContributer#createFieldEditors()
	 */
	public void createFieldEditors() {
		relativeValuesPrefGroup = new Group(preferencesPage.getFieldEditorParent(), SWT.SHADOW_ETCHED_IN);
		relativeValuesPrefGroup.setText("Relative Values");
		useAlphaCompositeBooleanFieldEditor = new BooleanFieldEditor(USE_ALPHA_COMPOSITE_ID, "Use 'Alpha Composite' for relative colors", relativeValuesPrefGroup);
		zeroColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_ZERO_RELATIVE_VALUE_ID, "Color for zero relative value (0)", relativeValuesPrefGroup);
		range1ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_1_ID, "Color for relative values (0 - 0.1)", relativeValuesPrefGroup);
		range2ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_2_ID, "Color for relative values (0.1 - 0.2)", relativeValuesPrefGroup);
		range3ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_3_ID, "Color for relative values (0.2 - 0.3)", relativeValuesPrefGroup);
		range4ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_4_ID, "Color for relative values (0.3 - 0.4)", relativeValuesPrefGroup);
		range5ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_5_ID, "Color for relative values (0.4 - 0.5)", relativeValuesPrefGroup);
		range6ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_6_ID, "Color for relative values (0.5 - 0.6)", relativeValuesPrefGroup);
		range7ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_7_ID, "Color for relative values (0.6 - 0.7)", relativeValuesPrefGroup);
		range8ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_8_ID, "Color for relative values (0.7 - 0.8)", relativeValuesPrefGroup);
		range9ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_9_ID, "Color for relative values (0.8 - 0.9)", relativeValuesPrefGroup);
		range10ColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_RANGE_10_ID, "Color for relative values (0.9 - 1)", relativeValuesPrefGroup);

		maxColorFieldEditor = new ColorFieldEditor(FOREGROUND_COLOR_MAXIMUM_RELATIVE_VALUE_ID, "Color for maximum relative value (1.0)", relativeValuesPrefGroup);

		preferencesPage.addField(useAlphaCompositeBooleanFieldEditor);
		preferencesPage.addField(zeroColorFieldEditor);
		preferencesPage.addField(range1ColorFieldEditor);
		preferencesPage.addField(range2ColorFieldEditor);
		preferencesPage.addField(range3ColorFieldEditor);
		preferencesPage.addField(range4ColorFieldEditor);
		preferencesPage.addField(range5ColorFieldEditor);
		preferencesPage.addField(range6ColorFieldEditor);
		preferencesPage.addField(range7ColorFieldEditor);
		preferencesPage.addField(range8ColorFieldEditor);
		preferencesPage.addField(range9ColorFieldEditor);
		preferencesPage.addField(range10ColorFieldEditor);
		preferencesPage.addField(maxColorFieldEditor);
	} // createFieldEditors

	/**
	 * @see org.eclipse.stem.ui.adapters.color.IPreferencesContributer#initialize()
	 */
	public void initialize() {
		boolean rangesEnabled = !useAlphaCompositeBooleanFieldEditor.getBooleanValue();
		toggleEnabledRangeColorFileds(rangesEnabled);
	} // initialize

	/**
	 * @see org.eclipse.stem.ui.adapters.color.IPreferencesContributer#performDefaults()
	 */
	public void performDefaults() {
		zeroColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_ZERO_RELATIVE_VALUE_DEFAULT_RGB_STRING));
		range1ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_1_DEFAULT_RGB_STRING));
		range2ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_2_DEFAULT_RGB_STRING));
		range3ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_3_DEFAULT_RGB_STRING));
		range4ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_4_DEFAULT_RGB_STRING));
		range5ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_5_DEFAULT_RGB_STRING));
		range6ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_6_DEFAULT_RGB_STRING));
		range7ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_7_DEFAULT_RGB_STRING));
		range8ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_8_DEFAULT_RGB_STRING));
		range9ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_9_DEFAULT_RGB_STRING));
		range10ColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_RANGE_10_DEFAULT_RGB_STRING));
		
		maxColorFieldEditor.getColorSelector().setColorValue(StringConverter.asRGB(FOREGROUND_COLOR_MAXIMUM_RELATIVE_VALUE_DEFAULT_RGB_STRING));
	} // performDefaults

	/**
	 * @see org.eclipse.stem.ui.adapters.color.IPreferencesContributer#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
	 */
	public void propertyChange(PropertyChangeEvent event) {
		if (event.getSource() == useAlphaCompositeBooleanFieldEditor) {
			boolean rangesEnabled = !useAlphaCompositeBooleanFieldEditor.getBooleanValue();
			toggleEnabledRangeColorFileds(rangesEnabled);
		}
	} // propertyChange
	
	/**
	 * Toggles between enabled and disabled mode of the range color field editors.
	 * @param isEnabled to enable or disable the fields
	 */
	private void toggleEnabledRangeColorFileds(boolean isEnabled) {
		zeroColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range1ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range2ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range3ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range4ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range5ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range6ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range7ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range8ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range9ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		range10ColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
		maxColorFieldEditor.setEnabled(isEnabled, relativeValuesPrefGroup);
	} // toggleEnabledRangeColorFileds
	
	/**
	 * @see org.eclipse.stem.ui.adapters.color.IPreferencesContributer#setPreferencePage(org.eclipse.stem.ui.preferences.MapsColorsPreferencePage)
	 */
	public void setPreferencePage(MapsColorsPreferencePage preferencePage) {
		this.preferencesPage = preferencePage;
	} // setPreferencePage

} // RelativeValueColorPreferences
