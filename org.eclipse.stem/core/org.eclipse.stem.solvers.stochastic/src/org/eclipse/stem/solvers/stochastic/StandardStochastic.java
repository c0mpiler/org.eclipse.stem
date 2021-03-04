/**
 */
package org.eclipse.stem.solvers.stochastic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Stochastic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.stem.solvers.stochastic.StandardStochastic#getSeed <em>Seed</em>}</li>
 *   <li>{@link org.eclipse.stem.solvers.stochastic.StandardStochastic#isRandomizeSeed <em>Randomize Seed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.stem.solvers.stochastic.StochasticPackage#getStandardStochastic()
 * @model
 * @generated
 */
public interface StandardStochastic extends Stochastic {

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute.
	 * The default value is <code>"17"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #setSeed(long)
	 * @see org.eclipse.stem.solvers.stochastic.StochasticPackage#getStandardStochastic_Seed()
	 * @model default="17"
	 * @generated
	 */
	long getSeed();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.solvers.stochastic.StandardStochastic#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(long value);

	/**
	 * Returns the value of the '<em><b>Randomize Seed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Randomize Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Randomize Seed</em>' attribute.
	 * @see #setRandomizeSeed(boolean)
	 * @see org.eclipse.stem.solvers.stochastic.StochasticPackage#getStandardStochastic_RandomizeSeed()
	 * @model default="false"
	 * @generated
	 */
	boolean isRandomizeSeed();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.solvers.stochastic.StandardStochastic#isRandomizeSeed <em>Randomize Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Randomize Seed</em>' attribute.
	 * @see #isRandomizeSeed()
	 * @generated
	 */
	void setRandomizeSeed(boolean value);
} // StandardStochastic
