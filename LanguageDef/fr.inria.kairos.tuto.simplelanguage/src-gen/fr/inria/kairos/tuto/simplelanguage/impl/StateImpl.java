/**
 */
package fr.inria.kairos.tuto.simplelanguage.impl;

import fr.inria.kairos.tuto.simplelanguage.Event;
import fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage;
import fr.inria.kairos.tuto.simplelanguage.State;
import fr.inria.kairos.tuto.simplelanguage.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.impl.StateImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.impl.StateImpl#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.impl.StateImpl#getOutputEvent <em>Output Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NamedElementImpl implements State {
	/**
	 * The cached value of the '{@link #getOwnedVariables() <em>Owned Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> ownedVariables;

	/**
	 * The cached value of the '{@link #getInputEvent() <em>Input Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvent()
	 * @generated
	 * @ordered
	 */
	protected Event inputEvent;

	/**
	 * The cached value of the '{@link #getOutputEvent() <em>Output Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEvent()
	 * @generated
	 * @ordered
	 */
	protected Event outputEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplelanguagePackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentEList<Variable>(Variable.class, this,
					SimplelanguagePackage.STATE__OWNED_VARIABLES);
		}
		return ownedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getInputEvent() {
		if (inputEvent != null && inputEvent.eIsProxy()) {
			InternalEObject oldInputEvent = (InternalEObject) inputEvent;
			inputEvent = (Event) eResolveProxy(oldInputEvent);
			if (inputEvent != oldInputEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplelanguagePackage.STATE__INPUT_EVENT,
							oldInputEvent, inputEvent));
			}
		}
		return inputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetInputEvent() {
		return inputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputEvent(Event newInputEvent, NotificationChain msgs) {
		Event oldInputEvent = inputEvent;
		inputEvent = newInputEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplelanguagePackage.STATE__INPUT_EVENT, oldInputEvent, newInputEvent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEvent(Event newInputEvent) {
		if (newInputEvent != inputEvent) {
			NotificationChain msgs = null;
			if (inputEvent != null)
				msgs = ((InternalEObject) inputEvent).eInverseRemove(this, SimplelanguagePackage.EVENT__TARGET_STATE,
						Event.class, msgs);
			if (newInputEvent != null)
				msgs = ((InternalEObject) newInputEvent).eInverseAdd(this, SimplelanguagePackage.EVENT__TARGET_STATE,
						Event.class, msgs);
			msgs = basicSetInputEvent(newInputEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplelanguagePackage.STATE__INPUT_EVENT,
					newInputEvent, newInputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getOutputEvent() {
		if (outputEvent != null && outputEvent.eIsProxy()) {
			InternalEObject oldOutputEvent = (InternalEObject) outputEvent;
			outputEvent = (Event) eResolveProxy(oldOutputEvent);
			if (outputEvent != oldOutputEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplelanguagePackage.STATE__OUTPUT_EVENT,
							oldOutputEvent, outputEvent));
			}
		}
		return outputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetOutputEvent() {
		return outputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputEvent(Event newOutputEvent, NotificationChain msgs) {
		Event oldOutputEvent = outputEvent;
		outputEvent = newOutputEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SimplelanguagePackage.STATE__OUTPUT_EVENT, oldOutputEvent, newOutputEvent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputEvent(Event newOutputEvent) {
		if (newOutputEvent != outputEvent) {
			NotificationChain msgs = null;
			if (outputEvent != null)
				msgs = ((InternalEObject) outputEvent).eInverseRemove(this, SimplelanguagePackage.EVENT__SOURCE_STATE,
						Event.class, msgs);
			if (newOutputEvent != null)
				msgs = ((InternalEObject) newOutputEvent).eInverseAdd(this, SimplelanguagePackage.EVENT__SOURCE_STATE,
						Event.class, msgs);
			msgs = basicSetOutputEvent(newOutputEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplelanguagePackage.STATE__OUTPUT_EVENT,
					newOutputEvent, newOutputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplelanguagePackage.STATE__INPUT_EVENT:
			if (inputEvent != null)
				msgs = ((InternalEObject) inputEvent).eInverseRemove(this, SimplelanguagePackage.EVENT__TARGET_STATE,
						Event.class, msgs);
			return basicSetInputEvent((Event) otherEnd, msgs);
		case SimplelanguagePackage.STATE__OUTPUT_EVENT:
			if (outputEvent != null)
				msgs = ((InternalEObject) outputEvent).eInverseRemove(this, SimplelanguagePackage.EVENT__SOURCE_STATE,
						Event.class, msgs);
			return basicSetOutputEvent((Event) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplelanguagePackage.STATE__OWNED_VARIABLES:
			return ((InternalEList<?>) getOwnedVariables()).basicRemove(otherEnd, msgs);
		case SimplelanguagePackage.STATE__INPUT_EVENT:
			return basicSetInputEvent(null, msgs);
		case SimplelanguagePackage.STATE__OUTPUT_EVENT:
			return basicSetOutputEvent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SimplelanguagePackage.STATE__OWNED_VARIABLES:
			return getOwnedVariables();
		case SimplelanguagePackage.STATE__INPUT_EVENT:
			if (resolve)
				return getInputEvent();
			return basicGetInputEvent();
		case SimplelanguagePackage.STATE__OUTPUT_EVENT:
			if (resolve)
				return getOutputEvent();
			return basicGetOutputEvent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SimplelanguagePackage.STATE__OWNED_VARIABLES:
			getOwnedVariables().clear();
			getOwnedVariables().addAll((Collection<? extends Variable>) newValue);
			return;
		case SimplelanguagePackage.STATE__INPUT_EVENT:
			setInputEvent((Event) newValue);
			return;
		case SimplelanguagePackage.STATE__OUTPUT_EVENT:
			setOutputEvent((Event) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SimplelanguagePackage.STATE__OWNED_VARIABLES:
			getOwnedVariables().clear();
			return;
		case SimplelanguagePackage.STATE__INPUT_EVENT:
			setInputEvent((Event) null);
			return;
		case SimplelanguagePackage.STATE__OUTPUT_EVENT:
			setOutputEvent((Event) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SimplelanguagePackage.STATE__OWNED_VARIABLES:
			return ownedVariables != null && !ownedVariables.isEmpty();
		case SimplelanguagePackage.STATE__INPUT_EVENT:
			return inputEvent != null;
		case SimplelanguagePackage.STATE__OUTPUT_EVENT:
			return outputEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
