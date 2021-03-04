/**
 * <copyright>
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
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.stem.diseasemodels.polioopvipv;

import org.eclipse.stem.diseasemodels.standard.SEIRLabelValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getSopv <em>Sopv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEopv <em>Eopv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getVopv <em>Vopv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getPopv <em>Popv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getPw <em>Pw</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getSipv <em>Sipv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEipv_w <em>Eipv w</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getCipv_w <em>Cipv w</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEipv_opv <em>Eipv opv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getCipv_opv <em>Cipv opv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_opv <em>Incidence opv</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_ipv_w <em>Incidence ipv w</em>}</li>
 *   <li>{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_ipv_opv <em>Incidence ipv opv</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue()
 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
 * @generated
 */
public interface PolioOpvIpvLabelValue extends SEIRLabelValue {
	/**
	 * Returns the value of the '<em><b>Sopv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sopv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sopv</em>' attribute.
	 * @see #setSopv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Sopv()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getSopv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getSopv <em>Sopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sopv</em>' attribute.
	 * @see #getSopv()
	 * @generated
	 */
	void setSopv(double value);

	/**
	 * Returns the value of the '<em><b>Eopv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eopv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eopv</em>' attribute.
	 * @see #setEopv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Eopv()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getEopv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEopv <em>Eopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eopv</em>' attribute.
	 * @see #getEopv()
	 * @generated
	 */
	void setEopv(double value);

	/**
	 * Returns the value of the '<em><b>Vopv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vopv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vopv</em>' attribute.
	 * @see #setVopv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Vopv()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getVopv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getVopv <em>Vopv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vopv</em>' attribute.
	 * @see #getVopv()
	 * @generated
	 */
	void setVopv(double value);

	/**
	 * Returns the value of the '<em><b>Popv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Popv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Popv</em>' attribute.
	 * @see #setPopv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Popv()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getPopv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getPopv <em>Popv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Popv</em>' attribute.
	 * @see #getPopv()
	 * @generated
	 */
	void setPopv(double value);

	/**
	 * Returns the value of the '<em><b>Pw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pw</em>' attribute.
	 * @see #setPw(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Pw()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getPw();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getPw <em>Pw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pw</em>' attribute.
	 * @see #getPw()
	 * @generated
	 */
	void setPw(double value);

	/**
	 * Returns the value of the '<em><b>Sipv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sipv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sipv</em>' attribute.
	 * @see #setSipv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Sipv()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getSipv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getSipv <em>Sipv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sipv</em>' attribute.
	 * @see #getSipv()
	 * @generated
	 */
	void setSipv(double value);

	/**
	 * Returns the value of the '<em><b>Eipv w</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eipv w</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eipv w</em>' attribute.
	 * @see #setEipv_w(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Eipv_w()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getEipv_w();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEipv_w <em>Eipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eipv w</em>' attribute.
	 * @see #getEipv_w()
	 * @generated
	 */
	void setEipv_w(double value);

	/**
	 * Returns the value of the '<em><b>Cipv w</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cipv w</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipv w</em>' attribute.
	 * @see #setCipv_w(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Cipv_w()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getCipv_w();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getCipv_w <em>Cipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipv w</em>' attribute.
	 * @see #getCipv_w()
	 * @generated
	 */
	void setCipv_w(double value);

	/**
	 * Returns the value of the '<em><b>Eipv opv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eipv opv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eipv opv</em>' attribute.
	 * @see #setEipv_opv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Eipv_opv()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getEipv_opv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getEipv_opv <em>Eipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eipv opv</em>' attribute.
	 * @see #getEipv_opv()
	 * @generated
	 */
	void setEipv_opv(double value);

	/**
	 * Returns the value of the '<em><b>Cipv opv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cipv opv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cipv opv</em>' attribute.
	 * @see #setCipv_opv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Cipv_opv()
	 * @model annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getCipv_opv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getCipv_opv <em>Cipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cipv opv</em>' attribute.
	 * @see #getCipv_opv()
	 * @generated
	 */
	void setCipv_opv(double value);

	/**
	 * Returns the value of the '<em><b>Incidence opv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence opv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence opv</em>' attribute.
	 * @see #setIncidence_opv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Incidence_opv()
	 * @model annotation="org.eclipse.stem.model.compartmentType type='Incidence'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getIncidence_opv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_opv <em>Incidence opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence opv</em>' attribute.
	 * @see #getIncidence_opv()
	 * @generated
	 */
	void setIncidence_opv(double value);

	/**
	 * Returns the value of the '<em><b>Incidence ipv w</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence ipv w</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence ipv w</em>' attribute.
	 * @see #setIncidence_ipv_w(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Incidence_ipv_w()
	 * @model annotation="org.eclipse.stem.model.compartmentType type='Incidence'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getIncidence_ipv_w();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_ipv_w <em>Incidence ipv w</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence ipv w</em>' attribute.
	 * @see #getIncidence_ipv_w()
	 * @generated
	 */
	void setIncidence_ipv_w(double value);

	/**
	 * Returns the value of the '<em><b>Incidence ipv opv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence ipv opv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence ipv opv</em>' attribute.
	 * @see #setIncidence_ipv_opv(double)
	 * @see org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvPackage#getPolioOpvIpvLabelValue_Incidence_ipv_opv()
	 * @model annotation="org.eclipse.stem.model.compartmentType type='Incidence'"
	 *        annotation="org.eclipse.stem.model.generated version='1.0'"
	 * @generated
	 */
	double getIncidence_ipv_opv();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.diseasemodels.polioopvipv.PolioOpvIpvLabelValue#getIncidence_ipv_opv <em>Incidence ipv opv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence ipv opv</em>' attribute.
	 * @see #getIncidence_ipv_opv()
	 * @generated
	 */
	void setIncidence_ipv_opv(double value);


} // PolioOpvIpvLabelValue
