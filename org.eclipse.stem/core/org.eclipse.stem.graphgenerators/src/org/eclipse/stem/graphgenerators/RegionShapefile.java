/**
 */
package org.eclipse.stem.graphgenerators;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Shapefile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.RegionShapefile#getArea <em>Area</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.RegionShapefile#getAreaUnit <em>Area Unit</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.RegionShapefile#getPopulationNames <em>Population Names</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.RegionShapefile#getPopulationSizes <em>Population Sizes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getRegionShapefile()
 * @model
 * @generated
 */
public interface RegionShapefile extends Shapefile {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getRegionShapefile_Area()
	 * @model
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.RegionShapefile#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

	/**
	 * Returns the value of the '<em><b>Area Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.stem.graphgenerators.AreaUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area Unit</em>' attribute.
	 * @see org.eclipse.stem.graphgenerators.AreaUnit
	 * @see #setAreaUnit(AreaUnit)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getRegionShapefile_AreaUnit()
	 * @model
	 * @generated
	 */
	AreaUnit getAreaUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.RegionShapefile#getAreaUnit <em>Area Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Unit</em>' attribute.
	 * @see org.eclipse.stem.graphgenerators.AreaUnit
	 * @see #getAreaUnit()
	 * @generated
	 */
	void setAreaUnit(AreaUnit value);

	/**
	 * Returns the value of the '<em><b>Population Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Names</em>' attribute list.
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getRegionShapefile_PopulationNames()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPopulationNames();

	/**
	 * Returns the value of the '<em><b>Population Sizes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Sizes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Sizes</em>' attribute list.
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getRegionShapefile_PopulationSizes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPopulationSizes();

} // RegionShapefile
