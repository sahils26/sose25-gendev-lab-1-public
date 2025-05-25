/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Lab1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lab1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/lab1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "lab1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab1Package eINSTANCE = de.buw.se.gendev.lab1.impl.Lab1PackageImpl.init();

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.UsersImpl <em>Users</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.UsersImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getUsers()
	 * @generated
	 */
	int USERS = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Enrolled Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__ENROLLED_COURSES = 2;

	/**
	 * The feature id for the '<em><b>Owns Certificate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS__OWNS_CERTIFICATE = 3;

	/**
	 * The number of structural features of the '<em>Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Unique Course Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS___UNIQUE_COURSE_TITLES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Not Null Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS___NOT_NULL_USERNAME__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Users</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USERS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.CoursesImpl <em>Courses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.CoursesImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getCourses()
	 * @generated
	 */
	int COURSES = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Has Lessons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__HAS_LESSONS = 2;

	/**
	 * The number of structural features of the '<em>Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Has Quiz In ALesson</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES___HAS_QUIZ_IN_ALESSON__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Positive Duration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES___POSITIVE_DURATION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.LessonsImpl <em>Lessons</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.LessonsImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getLessons()
	 * @generated
	 */
	int LESSONS = 2;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSONS__TOPIC = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSONS__ORDER = 1;

	/**
	 * The feature id for the '<em><b>Includes Quiz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSONS__INCLUDES_QUIZ = 2;

	/**
	 * The number of structural features of the '<em>Lessons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lessons</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.QuizzesImpl <em>Quizzes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.QuizzesImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getQuizzes()
	 * @generated
	 */
	int QUIZZES = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZZES__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Quizzes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZZES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Quizzes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZZES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.buw.se.gendev.lab1.impl.CertificatesImpl <em>Certificates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.buw.se.gendev.lab1.impl.CertificatesImpl
	 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getCertificates()
	 * @generated
	 */
	int CERTIFICATES = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES__TITLE = QUIZZES__TITLE;

	/**
	 * The feature id for the '<em><b>Issued Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES__ISSUED_DATE = QUIZZES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Certificates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_FEATURE_COUNT = QUIZZES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Valid Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES___VALID_TITLE__DIAGNOSTICCHAIN_MAP = QUIZZES_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Certificates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_OPERATION_COUNT = QUIZZES_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Users <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Users</em>'.
	 * @see de.buw.se.gendev.lab1.Users
	 * @generated
	 */
	EClass getUsers();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Users#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see de.buw.se.gendev.lab1.Users#getUsername()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_Username();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Users#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.buw.se.gendev.lab1.Users#getEmail()
	 * @see #getUsers()
	 * @generated
	 */
	EAttribute getUsers_Email();

	/**
	 * Returns the meta object for the containment reference list '{@link de.buw.se.gendev.lab1.Users#getEnrolledCourses <em>Enrolled Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enrolled Courses</em>'.
	 * @see de.buw.se.gendev.lab1.Users#getEnrolledCourses()
	 * @see #getUsers()
	 * @generated
	 */
	EReference getUsers_EnrolledCourses();

	/**
	 * Returns the meta object for the containment reference list '{@link de.buw.se.gendev.lab1.Users#getOwnsCertificate <em>Owns Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Certificate</em>'.
	 * @see de.buw.se.gendev.lab1.Users#getOwnsCertificate()
	 * @see #getUsers()
	 * @generated
	 */
	EReference getUsers_OwnsCertificate();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.Users#uniqueCourseTitles(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Course Titles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Course Titles</em>' operation.
	 * @see de.buw.se.gendev.lab1.Users#uniqueCourseTitles(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUsers__UniqueCourseTitles__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.Users#notNullUsername(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not Null Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Null Username</em>' operation.
	 * @see de.buw.se.gendev.lab1.Users#notNullUsername(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUsers__NotNullUsername__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Courses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Courses</em>'.
	 * @see de.buw.se.gendev.lab1.Courses
	 * @generated
	 */
	EClass getCourses();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Courses#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.buw.se.gendev.lab1.Courses#getTitle()
	 * @see #getCourses()
	 * @generated
	 */
	EAttribute getCourses_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Courses#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see de.buw.se.gendev.lab1.Courses#getDuration()
	 * @see #getCourses()
	 * @generated
	 */
	EAttribute getCourses_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link de.buw.se.gendev.lab1.Courses#getHasLessons <em>Has Lessons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Lessons</em>'.
	 * @see de.buw.se.gendev.lab1.Courses#getHasLessons()
	 * @see #getCourses()
	 * @generated
	 */
	EReference getCourses_HasLessons();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.Courses#hasQuizInALesson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Has Quiz In ALesson</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Quiz In ALesson</em>' operation.
	 * @see de.buw.se.gendev.lab1.Courses#hasQuizInALesson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourses__HasQuizInALesson__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.Courses#positiveDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Positive Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Positive Duration</em>' operation.
	 * @see de.buw.se.gendev.lab1.Courses#positiveDuration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourses__PositiveDuration__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Lessons <em>Lessons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lessons</em>'.
	 * @see de.buw.se.gendev.lab1.Lessons
	 * @generated
	 */
	EClass getLessons();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Lessons#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see de.buw.se.gendev.lab1.Lessons#getTopic()
	 * @see #getLessons()
	 * @generated
	 */
	EAttribute getLessons_Topic();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Lessons#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see de.buw.se.gendev.lab1.Lessons#getOrder()
	 * @see #getLessons()
	 * @generated
	 */
	EAttribute getLessons_Order();

	/**
	 * Returns the meta object for the containment reference '{@link de.buw.se.gendev.lab1.Lessons#getIncludesQuiz <em>Includes Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Includes Quiz</em>'.
	 * @see de.buw.se.gendev.lab1.Lessons#getIncludesQuiz()
	 * @see #getLessons()
	 * @generated
	 */
	EReference getLessons_IncludesQuiz();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Quizzes <em>Quizzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quizzes</em>'.
	 * @see de.buw.se.gendev.lab1.Quizzes
	 * @generated
	 */
	EClass getQuizzes();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Quizzes#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.buw.se.gendev.lab1.Quizzes#getTitle()
	 * @see #getQuizzes()
	 * @generated
	 */
	EAttribute getQuizzes_Title();

	/**
	 * Returns the meta object for class '{@link de.buw.se.gendev.lab1.Certificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificates</em>'.
	 * @see de.buw.se.gendev.lab1.Certificates
	 * @generated
	 */
	EClass getCertificates();

	/**
	 * Returns the meta object for the attribute '{@link de.buw.se.gendev.lab1.Certificates#getIssuedDate <em>Issued Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issued Date</em>'.
	 * @see de.buw.se.gendev.lab1.Certificates#getIssuedDate()
	 * @see #getCertificates()
	 * @generated
	 */
	EAttribute getCertificates_IssuedDate();

	/**
	 * Returns the meta object for the '{@link de.buw.se.gendev.lab1.Certificates#validTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Title</em>' operation.
	 * @see de.buw.se.gendev.lab1.Certificates#validTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCertificates__ValidTitle__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lab1Factory getLab1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.UsersImpl <em>Users</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.UsersImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getUsers()
		 * @generated
		 */
		EClass USERS = eINSTANCE.getUsers();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__USERNAME = eINSTANCE.getUsers_Username();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USERS__EMAIL = eINSTANCE.getUsers_Email();

		/**
		 * The meta object literal for the '<em><b>Enrolled Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERS__ENROLLED_COURSES = eINSTANCE.getUsers_EnrolledCourses();

		/**
		 * The meta object literal for the '<em><b>Owns Certificate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USERS__OWNS_CERTIFICATE = eINSTANCE.getUsers_OwnsCertificate();

		/**
		 * The meta object literal for the '<em><b>Unique Course Titles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERS___UNIQUE_COURSE_TITLES__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUsers__UniqueCourseTitles__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Not Null Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USERS___NOT_NULL_USERNAME__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getUsers__NotNullUsername__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.CoursesImpl <em>Courses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.CoursesImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getCourses()
		 * @generated
		 */
		EClass COURSES = eINSTANCE.getCourses();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSES__TITLE = eINSTANCE.getCourses_Title();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSES__DURATION = eINSTANCE.getCourses_Duration();

		/**
		 * The meta object literal for the '<em><b>Has Lessons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSES__HAS_LESSONS = eINSTANCE.getCourses_HasLessons();

		/**
		 * The meta object literal for the '<em><b>Has Quiz In ALesson</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSES___HAS_QUIZ_IN_ALESSON__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCourses__HasQuizInALesson__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Positive Duration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSES___POSITIVE_DURATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCourses__PositiveDuration__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.LessonsImpl <em>Lessons</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.LessonsImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getLessons()
		 * @generated
		 */
		EClass LESSONS = eINSTANCE.getLessons();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LESSONS__TOPIC = eINSTANCE.getLessons_Topic();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LESSONS__ORDER = eINSTANCE.getLessons_Order();

		/**
		 * The meta object literal for the '<em><b>Includes Quiz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESSONS__INCLUDES_QUIZ = eINSTANCE.getLessons_IncludesQuiz();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.QuizzesImpl <em>Quizzes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.QuizzesImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getQuizzes()
		 * @generated
		 */
		EClass QUIZZES = eINSTANCE.getQuizzes();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZZES__TITLE = eINSTANCE.getQuizzes_Title();

		/**
		 * The meta object literal for the '{@link de.buw.se.gendev.lab1.impl.CertificatesImpl <em>Certificates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.buw.se.gendev.lab1.impl.CertificatesImpl
		 * @see de.buw.se.gendev.lab1.impl.Lab1PackageImpl#getCertificates()
		 * @generated
		 */
		EClass CERTIFICATES = eINSTANCE.getCertificates();

		/**
		 * The meta object literal for the '<em><b>Issued Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATES__ISSUED_DATE = eINSTANCE.getCertificates_IssuedDate();

		/**
		 * The meta object literal for the '<em><b>Valid Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CERTIFICATES___VALID_TITLE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCertificates__ValidTitle__DiagnosticChain_Map();

	}

} //Lab1Package
