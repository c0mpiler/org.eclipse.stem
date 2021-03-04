// RealTimeSequencer.java
package org.eclipse.stem.core.sequencer;

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
 * A <code>RealTimeSequencer</code> is a <code>SequentialSequencer</code>
 * that always as a starting time equal to the current time. It also sleeps for
 * the time increment of the sequence.
 * 
 * @model
 */
public interface RealTimeSequencer extends SequentialSequencer {

} // RealTimeSequencer
