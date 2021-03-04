/**
 */
package org.eclipse.stem.interventions.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.stem.interventions.InterventionsFactory;
import org.eclipse.stem.interventions.PeriodicControlGraphGenerator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Periodic Control Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PeriodicControlGraphGeneratorTest extends TestCase {

	/**
	 * The fixture for this Periodic Control Graph Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicControlGraphGenerator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PeriodicControlGraphGeneratorTest.class);
	}

	/**
	 * Constructs a new Periodic Control Graph Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicControlGraphGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Periodic Control Graph Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PeriodicControlGraphGenerator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Periodic Control Graph Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicControlGraphGenerator getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InterventionsFactory.eINSTANCE.createPeriodicControlGraphGenerator());
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

} //PeriodicControlGraphGeneratorTest
