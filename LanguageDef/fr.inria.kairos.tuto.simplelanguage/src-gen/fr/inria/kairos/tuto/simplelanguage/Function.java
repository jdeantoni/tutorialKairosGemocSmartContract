/**
 */
package fr.inria.kairos.tuto.simplelanguage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.Function#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' reference.
	 * @see #setEvent(Event)
	 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage#getFunction_Event()
	 * @model
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link fr.inria.kairos.tuto.simplelanguage.Function#getEvent <em>Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // Function
