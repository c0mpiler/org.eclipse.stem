/**
 */
package org.eclipse.stem.graphgenerators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration Shapefile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.MigrationShapefile#getPopulationName <em>Population Name</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.MigrationShapefile#getMigrationRate <em>Migration Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getMigrationShapefile()
 * @model
 * @generated
 */
public interface MigrationShapefile extends Shapefile {
	/**
	 * Returns the value of the '<em><b>Population Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Name</em>' attribute.
	 * @see #setPopulationName(String)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getMigrationShapefile_PopulationName()
	 * @model
	 * @generated
	 */
	String getPopulationName();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.MigrationShapefile#getPopulationName <em>Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Name</em>' attribute.
	 * @see #getPopulationName()
	 * @generated
	 */
	void setPopulationName(String value);

	/**
	 * Returns the value of the '<em><b>Migration Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migration Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migration Rate</em>' attribute.
	 * @see #setMigrationRate(String)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getMigrationShapefile_MigrationRate()
	 * @model
	 * @generated
	 */
	String getMigrationRate();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.MigrationShapefile#getMigrationRate <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Migration Rate</em>' attribute.
	 * @see #getMigrationRate()
	 * @generated
	 */
	void setMigrationRate(String value);

} // MigrationShapefile
