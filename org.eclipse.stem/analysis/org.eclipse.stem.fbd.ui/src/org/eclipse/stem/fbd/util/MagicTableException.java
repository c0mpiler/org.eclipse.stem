package org.eclipse.stem.fbd.util;

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
 * General Exception class for {@link MagicTable} errors.
 */
public class MagicTableException extends Exception {

    private static final long serialVersionUID = -7173883923664211501L;

    /**
     * Constructor with error message.
     * 
     * @param string
     *            error message
     */
    public MagicTableException(final String string) {
        super(string);
    }
}