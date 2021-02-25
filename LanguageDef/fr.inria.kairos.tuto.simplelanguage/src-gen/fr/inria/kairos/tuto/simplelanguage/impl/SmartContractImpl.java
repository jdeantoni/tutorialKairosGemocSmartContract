/**
 */
package fr.inria.kairos.tuto.simplelanguage.impl;

import fr.inria.kairos.tuto.simplelanguage.Event;
import fr.inria.kairos.tuto.simplelanguage.Function;
import fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage;
import fr.inria.kairos.tuto.simplelanguage.SmartContract;
import fr.inria.kairos.tuto.simplelanguage.State;

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
 * An implementation of the model object '<em><b>Smart Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.impl.SmartContractImpl#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.impl.SmartContractImpl#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.impl.SmartContractImpl#getOwnedFunctions <em>Owned Functions</em>}</li>
 *   <li>{@link fr.inria.kairos.tuto.simplelanguage.impl.SmartContractImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartContractImpl extends NamedElementImpl implements SmartContract {
	/**
	 * The cached value of the '{@link #getOwnedEvents() <em>Owned Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> ownedEvents;

	/**
	 * The cached value of the '{@link #getOwnedStates() <em>Owned States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> ownedStates;

	/**
	 * The cached value of the '{@link #getOwnedFunctions() <em>Owned Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> ownedFunctions;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplelanguagePackage.Literals.SMART_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getOwnedEvents() {
		if (ownedEvents == null) {
			ownedEvents = new EObjectContainmentEList<Event>(Event.class, this,
					SimplelanguagePackage.SMART_CONTRACT__OWNED_EVENTS);
		}
		return ownedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getOwnedStates() {
		if (ownedStates == null) {
			ownedStates = new EObjectContainmentEList<State>(State.class, this,
					SimplelanguagePackage.SMART_CONTRACT__OWNED_STATES);
		}
		return ownedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getOwnedFunctions() {
		if (ownedFunctions == null) {
			ownedFunctions = new EObjectContainmentEList<Function>(Function.class, this,
					SimplelanguagePackage.SMART_CONTRACT__OWNED_FUNCTIONS);
		}
		return ownedFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject) initialState;
			initialState = (State) eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SimplelanguagePackage.SMART_CONTRACT__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplelanguagePackage.SMART_CONTRACT__INITIAL_STATE,
					oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_EVENTS:
			return ((InternalEList<?>) getOwnedEvents()).basicRemove(otherEnd, msgs);
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_STATES:
			return ((InternalEList<?>) getOwnedStates()).basicRemove(otherEnd, msgs);
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_FUNCTIONS:
			return ((InternalEList<?>) getOwnedFunctions()).basicRemove(otherEnd, msgs);
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
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_EVENTS:
			return getOwnedEvents();
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_STATES:
			return getOwnedStates();
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_FUNCTIONS:
			return getOwnedFunctions();
		case SimplelanguagePackage.SMART_CONTRACT__INITIAL_STATE:
			if (resolve)
				return getInitialState();
			return basicGetInitialState();
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
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_EVENTS:
			getOwnedEvents().clear();
			getOwnedEvents().addAll((Collection<? extends Event>) newValue);
			return;
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_STATES:
			getOwnedStates().clear();
			getOwnedStates().addAll((Collection<? extends State>) newValue);
			return;
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_FUNCTIONS:
			getOwnedFunctions().clear();
			getOwnedFunctions().addAll((Collection<? extends Function>) newValue);
			return;
		case SimplelanguagePackage.SMART_CONTRACT__INITIAL_STATE:
			setInitialState((State) newValue);
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
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_EVENTS:
			getOwnedEvents().clear();
			return;
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_STATES:
			getOwnedStates().clear();
			return;
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_FUNCTIONS:
			getOwnedFunctions().clear();
			return;
		case SimplelanguagePackage.SMART_CONTRACT__INITIAL_STATE:
			setInitialState((State) null);
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
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_EVENTS:
			return ownedEvents != null && !ownedEvents.isEmpty();
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_STATES:
			return ownedStates != null && !ownedStates.isEmpty();
		case SimplelanguagePackage.SMART_CONTRACT__OWNED_FUNCTIONS:
			return ownedFunctions != null && !ownedFunctions.isEmpty();
		case SimplelanguagePackage.SMART_CONTRACT__INITIAL_STATE:
			return initialState != null;
		}
		return super.eIsSet(featureID);
	}

} //SmartContractImpl
