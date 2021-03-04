// SplashHandler.java
package org.eclipse.stem.ui.splashhandler;

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

import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.splash.BasicSplashHandler;

/**
 * This is based on EclipseSplashHandler
 */
public class SplashHandler extends BasicSplashHandler {

	@Override
	public void init(Shell splash) {
		super.init(splash);
		String progressRectString = "0,386,697,15"; //$NON-NLS-1$
		String messageRectString = "10,350,697,20"; //$NON-NLS-1$
		String buildIdLocString = "500,325"; //$NON-NLS-1$

		String foregroundColorString = null;

		Rectangle progressRect = StringConverter.asRectangle(
				progressRectString, new Rectangle(0, 165, 400, 15));
		setProgressRect(progressRect);

		Rectangle messageRect = StringConverter.asRectangle(messageRectString,
				new Rectangle(10, 150, 390, 50));
		setMessageRect(messageRect);

		final Point buildIdPoint = StringConverter.asPoint(buildIdLocString,
				new Point(322, 190));

		int foregroundColorInteger;
		try {
			foregroundColorInteger = Integer
					.parseInt(foregroundColorString, 16);
		} catch (Exception ex) {
			foregroundColorInteger = 0xD2D7FF; // off white
		}

		setForeground(new RGB((foregroundColorInteger & 0xFF0000) >> 16,
				(foregroundColorInteger & 0xFF00) >> 8,
				foregroundColorInteger & 0xFF));

		final String buildId = getBuildId();

		getContent().addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {
				e.gc.setForeground(getForeground());
				e.gc.drawText(buildId, buildIdPoint.x, buildIdPoint.y, true);
			}
		});
	} // init

	private String getBuildId() {
		return System.getProperty("stem.buildId", "Unknown Build"); //$NON-NLS-1$ //$NON-NLS-2$
	}
} // SplashHandler
