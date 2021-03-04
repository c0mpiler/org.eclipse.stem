/**
 */
package org.eclipse.stem.graphgenerators.tests;

import junit.textui.TestRunner;

import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.MigrationShapefile;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Migration Shapefile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MigrationShapefileTest extends ShapefileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MigrationShapefileTest.class);
	}

	/**
	 * Constructs a new Migration Shapefile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MigrationShapefileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Migration Shapefile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MigrationShapefile getFixture() {
		return (MigrationShapefile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphgeneratorsFactory.eINSTANCE.createMigrationShapefile());
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

} //MigrationShapefileTest
