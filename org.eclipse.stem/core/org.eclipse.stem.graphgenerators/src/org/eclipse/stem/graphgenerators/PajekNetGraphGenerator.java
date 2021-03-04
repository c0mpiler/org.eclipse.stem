package org.eclipse.stem.graphgenerators;

import org.eclipse.core.resources.IProject;

/*******************************************************************************
* Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors: Armin Weiser, Matthias Filter
* Bundesinstitut für Risikobewertung
* FG 43 - Epidemiologie und Zoonosen
* Diedersdorfer Weg 1, 12277 Berlin
* 
* IBM Corporation - initial API and implementation
*******************************************************************************/

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pajek Net Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getDataFile <em>Data File</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getScalingFactor <em>Scaling Factor</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getNodeSize <em>Node Size</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isUseRegionURI <em>Use Region URI</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isMoveNodesToContainers <em>Move Nodes To Containers</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isUseAbsoluteRates <em>Use Absolute Rates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getPajekNetGraphGenerator()
 * @model
 * @generated
 */
public interface PajekNetGraphGenerator extends GraphGenerator {
	/**
	 * Returns the value of the '<em><b>Data File</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data File</em>' attribute.
	 * @see #setDataFile(String)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getPajekNetGraphGenerator_DataFile()
	 * @model default=""
	 * @generated
	 */
	String getDataFile();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getDataFile <em>Data File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data File</em>' attribute.
	 * @see #getDataFile()
	 * @generated
	 */
	void setDataFile(String value);

	/**
	 * Returns the value of the '<em><b>Scaling Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scaling Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scaling Factor</em>' attribute.
	 * @see #setScalingFactor(double)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getPajekNetGraphGenerator_ScalingFactor()
	 * @model default="1"
	 * @generated
	 */
	double getScalingFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getScalingFactor <em>Scaling Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scaling Factor</em>' attribute.
	 * @see #getScalingFactor()
	 * @generated
	 */
	void setScalingFactor(double value);

	/**
	 * Returns the value of the '<em><b>Node Size</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Size</em>' attribute.
	 * @see #setNodeSize(double)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getPajekNetGraphGenerator_NodeSize()
	 * @model default="0.1"
	 * @generated
	 */
	double getNodeSize();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#getNodeSize <em>Node Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Size</em>' attribute.
	 * @see #getNodeSize()
	 * @generated
	 */
	void setNodeSize(double value);

	/**
	 * Returns the value of the '<em><b>Use Region URI</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Region URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Region URI</em>' attribute.
	 * @see #setUseRegionURI(boolean)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getPajekNetGraphGenerator_UseRegionURI()
	 * @model default="0"
	 * @generated
	 */
	boolean isUseRegionURI();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isUseRegionURI <em>Use Region URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Region URI</em>' attribute.
	 * @see #isUseRegionURI()
	 * @generated
	 */
	void setUseRegionURI(boolean value);
	
	/**
	 * Returns the value of the '<em><b>Move Nodes To Containers</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move Nodes To Containers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Nodes To Containers</em>' attribute.
	 * @see #setMoveNodesToContainers(boolean)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getPajekNetGraphGenerator_MoveNodesToContainers()
	 * @model default="0"
	 * @generated
	 */
	boolean isMoveNodesToContainers();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isMoveNodesToContainers <em>Move Nodes To Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move Nodes To Containers</em>' attribute.
	 * @see #isMoveNodesToContainers()
	 * @generated
	 */
	void setMoveNodesToContainers(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Absolute Rates</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Absolute Rates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Absolute Rates</em>' attribute.
	 * @see #setUseAbsoluteRates(boolean)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getPajekNetGraphGenerator_UseAbsoluteRates()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseAbsoluteRates();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.PajekNetGraphGenerator#isUseAbsoluteRates <em>Use Absolute Rates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Absolute Rates</em>' attribute.
	 * @see #isUseAbsoluteRates()
	 * @generated
	 */
	void setUseAbsoluteRates(boolean value);

	public void setProject(IProject project);
	
	public void setGraphFileName(String fileName);

} // PajekNetGraphGenerator
