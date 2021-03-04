/******************************************************************************* 
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Bundesinstitut für Risikobewertung - initial API and implementation 
 *******************************************************************************/

package org.eclipse.stem.tests.grapheditor;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.stem.ui.grapheditor.GraphEditorCanvas;

public class GraphEditorCanvasTest extends TestCase {

	protected GraphEditorCanvas fixture = null;

	public static void main(String[] args) {
		TestRunner.run(GraphEditorCanvasTest.class);
	}

	@Override
	protected void setUp() throws Exception {
		setFixture(createFixture());
	}

	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	protected void setFixture(GraphEditorCanvas fixture) {
		this.fixture = fixture;
	}

	protected GraphEditorCanvas getFixture() {
		return fixture;
	}

	protected static GraphEditorCanvas createFixture() {
		return null;
	}

	public void testGraphCanvas() {
		assertTrue(true);
	}

}
