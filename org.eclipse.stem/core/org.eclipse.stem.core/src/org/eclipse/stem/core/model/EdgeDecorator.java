// EdgeDecorator.java
package org.eclipse.stem.core.model;

import org.eclipse.stem.core.graph.Edge;
import org.eclipse.stem.core.graph.Label;
import org.eclipse.stem.core.sequencer.Sequencer;

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

/**
 * An <code>EdgeDecorator</code> is a {@link Decorator} that specifically
 * modifies {@link Edge}s and their {@link Label}s.
 * 
 * @see Edge
 * @see org.eclipse.stem.core.graph.DynamicLabel
 * @see NodeDecorator
 * @see GraphDecorator
 * @see Sequencer
 * 
 * @model
 */
public interface EdgeDecorator extends Decorator {
	// Nothing Yet
} // EdgeDecorator
