/**
 */
package fr.inria.kairos.tuto.simplelanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.State#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.State#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.State#getOutputEvent <em>Output Event</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getState()
 * @model
 * @generated
 */
public interface State extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.kairos.tuto.simplelanguage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getState_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

	/**
	 * Returns the value of the '<em><b>Input Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.kairos.tuto.simplelanguage.Event#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Event</em>' reference.
	 * @see #setInputEvent(Event)
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getState_InputEvent()
	 * @see fr.inria.kairos.tuto.simplelanguage.Event#getTargetState
	 * @model opposite="targetState"
	 * @generated
	 */
	Event getInputEvent();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.simplelanguage.State#getInputEvent <em>Input Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Event</em>' reference.
	 * @see #getInputEvent()
	 * @generated
	 */
	void setInputEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Output Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.kairos.tuto.simplelanguage.Event#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Event</em>' reference.
	 * @see #setOutputEvent(Event)
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getState_OutputEvent()
	 * @see fr.inria.kairos.tuto.simplelanguage.Event#getSourceState
	 * @model opposite="sourceState"
	 * @generated
	 */
	Event getOutputEvent();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.simplelanguage.State#getOutputEvent <em>Output Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Event</em>' reference.
	 * @see #getOutputEvent()
	 * @generated
	 */
	void setOutputEvent(Event value);

} // State
