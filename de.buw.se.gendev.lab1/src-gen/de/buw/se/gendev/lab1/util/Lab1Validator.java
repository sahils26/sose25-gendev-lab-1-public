/**
 */
package de.buw.se.gendev.lab1.util;

import de.buw.se.gendev.lab1.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Package
 * @generated
 */
public class Lab1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Lab1Validator INSTANCE = new Lab1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.buw.se.gendev.lab1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Course Titles' of 'Users'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USERS__UNIQUE_COURSE_TITLES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Null Username' of 'Users'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USERS__NOT_NULL_USERNAME = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Age Above18' of 'Users'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USERS__AGE_ABOVE18 = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Quiz In ALesson' of 'Courses'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COURSES__HAS_QUIZ_IN_ALESSON = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Duration' of 'Courses'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COURSES__POSITIVE_DURATION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Title' of 'Certificates'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERTIFICATES__VALID_TITLE = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

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
	public Lab1Validator() {
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
		return Lab1Package.eINSTANCE;
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
		case Lab1Package.USERS:
			return validateUsers((Users) value, diagnostics, context);
		case Lab1Package.COURSES:
			return validateCourses((Courses) value, diagnostics, context);
		case Lab1Package.LESSONS:
			return validateLessons((Lessons) value, diagnostics, context);
		case Lab1Package.QUIZZES:
			return validateQuizzes((Quizzes) value, diagnostics, context);
		case Lab1Package.CERTIFICATES:
			return validateCertificates((Certificates) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsers(Users users, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(users, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUsers_uniqueCourseTitles(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUsers_notNullUsername(users, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUsers_ageAbove18(users, diagnostics, context);
		return result;
	}

	/**
	 * Validates the notNullUsername constraint of '<em>Users</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsers_notNullUsername(Users users, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return users.notNullUsername(diagnostics, context);
	}

	/**
	 * Validates the ageAbove18 constraint of '<em>Users</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsers_ageAbove18(Users users, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return users.ageAbove18(diagnostics, context);
	}

	/**
	 * Validates the uniqueCourseTitles constraint of '<em>Users</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsers_uniqueCourseTitles(Users users, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return users.uniqueCourseTitles(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourses(Courses courses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courses, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCourses_positiveDuration(courses, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCourses_hasQuizInALesson(courses, diagnostics, context);
		return result;
	}

	/**
	 * Validates the positiveDuration constraint of '<em>Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourses_positiveDuration(Courses courses, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return courses.positiveDuration(diagnostics, context);
	}

	/**
	 * Validates the hasQuizInALesson constraint of '<em>Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourses_hasQuizInALesson(Courses courses, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return courses.hasQuizInALesson(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLessons(Lessons lessons, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lessons, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizzes(Quizzes quizzes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quizzes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificates(Certificates certificates, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(certificates, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(certificates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(certificates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(certificates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(certificates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(certificates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(certificates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(certificates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(certificates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCertificates_validTitle(certificates, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validTitle constraint of '<em>Certificates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificates_validTitle(Certificates certificates, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return certificates.validTitle(diagnostics, context);
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

} //Lab1Validator
