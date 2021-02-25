/**
 */
package fr.inria.kairos.tuto.simplelanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.SmartContract#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.SmartContract#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.SmartContract#getOwnedFunctions <em>Owned Functions</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.SmartContract#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getSmartContract()
 * @model
 * @generated
 */
public interface SmartContract extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.tuto.simplelanguage.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Events</em>' containment reference list.
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getSmartContract_OwnedEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getOwnedEvents();

	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.tuto.simplelanguage.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getSmartContract_OwnedStates()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Owned Functions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.tuto.simplelanguage.Function}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Functions</em>' containment reference list.
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getSmartContract_OwnedFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getOwnedFunctions();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getSmartContract_InitialState()
	 * @model
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.simplelanguage.SmartContract#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

} // SmartContract
