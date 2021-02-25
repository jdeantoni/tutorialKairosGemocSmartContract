/**
 */
package fr.inria.kairos.tuto.simplelanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.Event#getTargetState <em>Target State</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.Event#getSourceState <em>Source State</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.kairos.tuto.simplelanguage.State#getInputEvent <em>Input Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getEvent_TargetState()
	 * @see fr.inria.kairos.tuto.simplelanguage.State#getInputEvent
	 * @model opposite="inputEvent"
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.simplelanguage.Event#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

	/**
	 * Returns the value of the '<em><b>Source State</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.inria.kairos.tuto.simplelanguage.State#getOutputEvent <em>Output Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' reference.
	 * @see #setSourceState(State)
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getEvent_SourceState()
	 * @see fr.inria.kairos.tuto.simplelanguage.State#getOutputEvent
	 * @model opposite="outputEvent"
	 * @generated
	 */
	State getSourceState();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.simplelanguage.Event#getSourceState <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' reference.
	 * @see #getSourceState()
	 * @generated
	 */
	void setSourceState(State value);

} // Event
