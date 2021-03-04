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
package org.eclipse.stem.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.Platform;

/**
 * Support class that implements internal handlers for dynamic switching
 * of the current NL in use by STEM.  
 *
 */
public class NLS
{
	// Move to resource bundle
	private static final String PROPERTY_COMMENT_MESSAGE = "Edited by STEM NLS Switcher";
	private static final String NULL_PROPERTY_FILE_MESSAGE = "Cannot determine path for OSGi configuration file.  Verify the osgi.configuration.area system property is set.";
	
	/**
	 * represents the locale coded in plugin.properties
	 */
	public static final String DEFAULT_LOCALE = "en"; // $NON-NLS$

	/**
	 * System property to persist the original (first-start) NL
	 */
	public static final String SYSTEM_LOCALE_PROPERTY = "stem.system.nl"; // $NON-NLS$
	
	/**
	 * System property to persist new locale
	 */
	public static final String OSGI_RUNTIME_LOCALE_PROPERTY = "osgi.nl"; // $NON-NLS$
	
	/**
	 * OSGi Configuration Path Property (System property)
	 */
	public static final String OSGI_RUNTIME_CONFIG_PATH_PROPERTY = "osgi.configuration.area";
	
	/**
	 * OSGi Configuration File Name
	 */
	public static final String OSGI_RUNTIME_CONFIG_FILE_NAME = "config.ini";
	
	/**
	 * Current locale 
	 */
	private static String CURRENT_LOCALE = null;
	
	/**
	 * System locale
	 */
	private static String SYSTEM_LOCALE = null;
	
	/**
	 * Locales available to the system
	 */
	private static Collection<String> AVAILABLE_LOCALES = null;
	
	private NLS()
	{
		
	}
	
	/**
	 * @return The default locale
	 */
	public static String getDefaultLocale()
	{
		return DEFAULT_LOCALE;
	}
	
	/**
	 * Returns all super-locales for the given locale
	 * @param locale Locale to break down
	 * @return The super-locale fragments
	 */
	private static List<String> getLocaleFragments(String locale)
	{
		String[] localeFragments = locale.split("_");
		List<String> possibleLocales = new ArrayList<String>();
		StringBuilder fragment = new StringBuilder();
		fragment.append(localeFragments[0]);
		possibleLocales.add(fragment.toString());
		if (localeFragments.length > 1) {
			for (int i=1; i<localeFragments.length; i++) {
				fragment.append("_");
				fragment.append(localeFragments[i]);
				possibleLocales.add(fragment.toString());
			}
		}
		
		Collections.reverse(possibleLocales);
		
		return possibleLocales;
	}
	
	/**
	 * @return The current locale
	 */
	public static String getCurrentLocale()
	{
		if (CURRENT_LOCALE == null) {
			String platformLocale = Platform.getNL();
			
			List<String> fragments = getLocaleFragments(platformLocale);
			Collection<String> locales = getAvailableLocales();
			
			for (String fragment : fragments) {
				if (locales.contains(fragment)) {
					CURRENT_LOCALE = fragment;
					break;
				}
			}
			
			if (CURRENT_LOCALE == null) {
				CURRENT_LOCALE = getDefaultLocale();
			}
		}

		return CURRENT_LOCALE;
	}
	
	/**
	 * Gets the system locale.  If your system's locale is a supported STEM 
	 * locale, then it returns that.  Otherwise, it returns the default locale.
	 * @return The locale for the system
	 */
	public static String getSystemLocale()
	{
		if (SYSTEM_LOCALE == null) {
		
			String systemLocale = System.getProperty(SYSTEM_LOCALE_PROPERTY);
			if (systemLocale == null) {
				systemLocale = Platform.getNL();
			}

			if (systemLocale != null) {
			
				List<String> fragments = getLocaleFragments(systemLocale);
				Collection<String> locales = getAvailableLocales();
				
				for (String fragment : fragments) {
					if (locales.contains(fragment)) {
						SYSTEM_LOCALE = fragment;
						break;
					}
				}
				
			}
			
			if (SYSTEM_LOCALE == null) {
				SYSTEM_LOCALE = getDefaultLocale();
			}
		}
		
		return SYSTEM_LOCALE;
	}
	
	/**
	 * Gets the list of available locales 
	 * @return
	 */
	public synchronized static Collection<String> getAvailableLocales()
	{
		if (AVAILABLE_LOCALES == null) {
			
			List<String> locales = new ArrayList<String>();
			Enumeration<URL> paths = Activator.getDefault().getBundle().findEntries("/", "plugin*.properties", false);
			
			locales.add(DEFAULT_LOCALE);
			
			while (paths.hasMoreElements()) {
				String url = paths.nextElement().toString();
				int firstPart = url.indexOf('_');
				int lastPart = url.lastIndexOf(".properties");
				if (firstPart != -1 && lastPart != -1) {
					String locale = url.substring(firstPart+1, lastPart);
					if (!locales.contains(locale)) {
						locales.add(locale);
					}
				}
			}
			
			Collections.sort(locales);
			
			AVAILABLE_LOCALES = Collections.unmodifiableCollection(locales);
		}
		
		return AVAILABLE_LOCALES;		
	}
	
	/**
	 * Get the human-readable display name for the locale.  Uses the syntax
	 * "locale_[localeName]" to query the plugin.properties file for the 
	 * string.  If this key is not found, then it returns the original string.
	 * @param locale
	 * @return
	 */
	public static String getLocaleDisplayName(String locale)
	{
		final String resourceKeyName = "locale_"+ locale;
		ResourceBundle rb = Platform.getResourceBundle(Activator.getDefault().getBundle());
		
		String displayName = null;
		try {
			displayName = rb.getString(resourceKeyName);
		} catch (Exception e) {
			
		}
		if (displayName == null || "".equals(displayName)) {
			displayName = locale;
		}

		if (resourceKeyName.equals(displayName)) {
			displayName = locale;
		}
		return displayName;
	}
	
	/**
	 * Returns whether the given locale is the 'current' locale
	 * @param locale The locale to check
	 * @return Whether it's the current locale
	 */
	public static boolean isCurrentLocale(String locale)
	{
		return locale.equals(getCurrentLocale());
	}
	
	/**
	 * Returns whether the given locale is the 'default' locale
	 * @param locale The locale to check
	 * @return Whether it's the default locale
	 */
	public static boolean isDefaultLocale(String locale)
	{
		return locale.equals(getSystemLocale());
	}
	
	
	/**
	 * Attempts to persists the newly-selected locale in the OSGi runtime configuration file
	 * before restarting the JVM
	 * @param newLocale the selected locale that 
	 * @throws IOException
	 */
	public static void persistNewLocale(final String newLocale) throws IOException
	{
		Reader reader = null;
		Writer writer = null;
		try {
			File configPropertiesFile = getConfigurationPropertyFile();
			if (configPropertiesFile == null) {
				throw new FileNotFoundException(NULL_PROPERTY_FILE_MESSAGE);
			}
			
			Properties configProps = new Properties();
			reader = new FileReader(configPropertiesFile);
			
			configProps.load(reader);
			configProps.put(SYSTEM_LOCALE_PROPERTY, getSystemLocale());
			configProps.put(OSGI_RUNTIME_LOCALE_PROPERTY, newLocale);
			
			writer = new FileWriter(configPropertiesFile);
			configProps.store(writer, PROPERTY_COMMENT_MESSAGE);
		} finally {
			try { reader.close(); } catch (Throwable t) {}
			try { writer.close(); } catch (Throwable t) {}
		}
	}
	
	/**
	 * @return File for config.ini stored in the @osgi.configuration.area path
	 */
	private static File getConfigurationPropertyFile()
	{
		String path = System.getProperty(OSGI_RUNTIME_CONFIG_PATH_PROPERTY);
		if (path == null) {
			return null;
		}
		return new File(path.replace("file:", ""), OSGI_RUNTIME_CONFIG_FILE_NAME);
	}
}
