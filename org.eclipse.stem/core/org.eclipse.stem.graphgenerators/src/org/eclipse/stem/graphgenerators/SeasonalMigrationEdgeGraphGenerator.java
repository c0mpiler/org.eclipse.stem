/**
 */
package org.eclipse.stem.graphgenerators;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seasonal Migration Edge Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getLocationA <em>Location A</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getLocationB <em>Location B</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getMigrationRate <em>Migration Rate</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getPopulation <em>Population</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getToleranceAngleA <em>Tolerance Angle A</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getToleranceAngleB <em>Tolerance Angle B</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getSeasonalMigrationEdgeGraphGenerator()
 * @model
 * @generated
 */
public interface SeasonalMigrationEdgeGraphGenerator extends GraphGenerator {
	/**
	 * Returns the value of the '<em><b>Location A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location A</em>' attribute.
	 * @see #setLocationA(URI)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getSeasonalMigrationEdgeGraphGenerator_LocationA()
	 * @model dataType="org.eclipse.stem.core.common.URI"
	 * @generated
	 */
	URI getLocationA();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getLocationA <em>Location A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location A</em>' attribute.
	 * @see #getLocationA()
	 * @generated
	 */
	void setLocationA(URI value);

	/**
	 * Returns the value of the '<em><b>Location B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location B</em>' attribute.
	 * @see #setLocationB(URI)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getSeasonalMigrationEdgeGraphGenerator_LocationB()
	 * @model dataType="org.eclipse.stem.core.common.URI"
	 * @generated
	 */
	URI getLocationB();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getLocationB <em>Location B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location B</em>' attribute.
	 * @see #getLocationB()
	 * @generated
	 */
	void setLocationB(URI value);

	/**
	 * Returns the value of the '<em><b>Migration Rate</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migration Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migration Rate</em>' attribute.
	 * @see #setMigrationRate(double)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getSeasonalMigrationEdgeGraphGenerator_MigrationRate()
	 * @model default="0.1"
	 * @generated
	 */
	double getMigrationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getMigrationRate <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migration Rate</em>' attribute.
	 * @see #getMigrationRate()
	 * @generated
	 */
	void setMigrationRate(double value);

	/**
	 * Returns the value of the '<em><b>Population</b></em>' attribute.
	 * The default value is <code>"human"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population</em>' attribute.
	 * @see #setPopulation(String)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getSeasonalMigrationEdgeGraphGenerator_Population()
	 * @model default="human"
	 * @generated
	 */
	String getPopulation();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getPopulation <em>Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population</em>' attribute.
	 * @see #getPopulation()
	 * @generated
	 */
	void setPopulation(String value);

	/**
	 * Returns the value of the '<em><b>Tolerance Angle A</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance Angle A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance Angle A</em>' attribute.
	 * @see #setToleranceAngleA(double)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleA()
	 * @model default="15"
	 * @generated
	 */
	double getToleranceAngleA();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getToleranceAngleA <em>Tolerance Angle A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance Angle A</em>' attribute.
	 * @see #getToleranceAngleA()
	 * @generated
	 */
	void setToleranceAngleA(double value);

	/**
	 * Returns the value of the '<em><b>Tolerance Angle B</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tolerance Angle B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tolerance Angle B</em>' attribute.
	 * @see #setToleranceAngleB(double)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getSeasonalMigrationEdgeGraphGenerator_ToleranceAngleB()
	 * @model default="15"
	 * @generated
	 */
	double getToleranceAngleB();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator#getToleranceAngleB <em>Tolerance Angle B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tolerance Angle B</em>' attribute.
	 * @see #getToleranceAngleB()
	 * @generated
	 */
	void setToleranceAngleB(double value);

	// Not EMF modeled
	/** 
	 * get the project
	 * @return
	 */
	public IProject getProject();
	
	/** 
	 * set the project
	 * @param p
	 */
	public void setProject(IProject p);
} // SeasonalMigrationEdgeGraphGenerator
