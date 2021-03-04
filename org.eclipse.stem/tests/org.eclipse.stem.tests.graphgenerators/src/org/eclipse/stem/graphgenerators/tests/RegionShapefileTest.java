/**
 */
package org.eclipse.stem.graphgenerators.tests;

import junit.textui.TestRunner;

import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.RegionShapefile;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Region Shapefile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegionShapefileTest extends ShapefileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegionShapefileTest.class);
	}

	/**
	 * Constructs a new Region Shapefile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionShapefileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Region Shapefile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RegionShapefile getFixture() {
		return (RegionShapefile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphgeneratorsFactory.eINSTANCE.createRegionShapefile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RegionShapefileTest
