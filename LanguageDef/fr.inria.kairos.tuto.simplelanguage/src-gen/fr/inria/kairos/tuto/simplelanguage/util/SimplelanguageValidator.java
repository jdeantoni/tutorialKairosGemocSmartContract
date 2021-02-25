/**
 */
package fr.inria.kairos.tuto.simplelanguage.util;

import fr.inria.kairos.tuto.simplelanguage.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.inria.kairos.tuto.simplelanguage.SimplelanguagePackage
 * @generated
 */
public class SimplelanguageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimplelanguageValidator INSTANCE = new SimplelanguageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.inria.kairos.tuto.simplelanguage";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplelanguageValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SimplelanguagePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SimplelanguagePackage.SMART_CONTRACT:
			return validateSmartContract((SmartContract) value, diagnostics, context);
		case SimplelanguagePackage.EVENT:
			return validateEvent((Event) value, diagnostics, context);
		case SimplelanguagePackage.FUNCTION:
			return validateFunction((Function) value, diagnostics, context);
		case SimplelanguagePackage.STATE:
			return validateState((State) value, diagnostics, context);
		case SimplelanguagePackage.VARIABLE:
			return validateVariable((Variable) value, diagnostics, context);
		case SimplelanguagePackage.INTEGER_VARIABLE:
			return validateIntegerVariable((IntegerVariable) value, diagnostics, context);
		case SimplelanguagePackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmartContract(SmartContract smartContract, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(smartContract, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(smartContract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(smartContract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(smartContract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(smartContract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(smartContract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(smartContract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(smartContract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(smartContract, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_namesAreLong(smartContract, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_namesAreLong(event, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_namesAreLong(function, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_namesAreLong(state, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_namesAreLong(variable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerVariable(IntegerVariable integerVariable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerVariable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(integerVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(integerVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(integerVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(integerVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(integerVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(integerVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(integerVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(integerVariable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_namesAreLong(integerVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateNamedElement_namesAreLong(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the namesAreLong constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String NAMED_ELEMENT__NAMES_ARE_LONG__EEXPRESSION = "\n" + "\t\t\tself.name.size() > 3 ";

	/**
	 * Validates the namesAreLong constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement_namesAreLong(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(SimplelanguagePackage.Literals.NAMED_ELEMENT, namedElement, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "namesAreLong",
				NAMED_ELEMENT__NAMES_ARE_LONG__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SimplelanguageValidator
