/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Certificates;
import de.buw.se.gendev.lab1.Courses;
import de.buw.se.gendev.lab1.Lab1Factory;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Lessons;
import de.buw.se.gendev.lab1.Quizzes;
import de.buw.se.gendev.lab1.Users;

import de.buw.se.gendev.lab1.util.Lab1Validator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab1PackageImpl extends EPackageImpl implements Lab1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coursesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessonsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quizzesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificatesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.buw.se.gendev.lab1.Lab1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lab1PackageImpl() {
		super(eNS_URI, Lab1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Lab1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lab1Package init() {
		if (isInited)
			return (Lab1Package) EPackage.Registry.INSTANCE.getEPackage(Lab1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredLab1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Lab1PackageImpl theLab1Package = registeredLab1Package instanceof Lab1PackageImpl
				? (Lab1PackageImpl) registeredLab1Package
				: new Lab1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLab1Package.createPackageContents();

		// Initialize created meta-data
		theLab1Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theLab1Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Lab1Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theLab1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lab1Package.eNS_URI, theLab1Package);
		return theLab1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsers() {
		return usersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsers_Username() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsers_Email() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsers_Age() {
		return (EAttribute) usersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsers_EnrolledCourses() {
		return (EReference) usersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUsers_OwnsCertificate() {
		return (EReference) usersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsers__UniqueCourseTitles__DiagnosticChain_Map() {
		return usersEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsers__NotNullUsername__DiagnosticChain_Map() {
		return usersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUsers__AgeAbove18__DiagnosticChain_Map() {
		return usersEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourses() {
		return coursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourses_Title() {
		return (EAttribute) coursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourses_Duration() {
		return (EAttribute) coursesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourses_HasLessons() {
		return (EReference) coursesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCourses__HasQuizInALesson__DiagnosticChain_Map() {
		return coursesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCourses__PositiveDuration__DiagnosticChain_Map() {
		return coursesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessons() {
		return lessonsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLessons_Topic() {
		return (EAttribute) lessonsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLessons_Order() {
		return (EAttribute) lessonsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLessons_IncludesQuiz() {
		return (EReference) lessonsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuizzes() {
		return quizzesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuizzes_Title() {
		return (EAttribute) quizzesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificates() {
		return certificatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificates_IssuedDate() {
		return (EAttribute) certificatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCertificates__ValidTitle__DiagnosticChain_Map() {
		return certificatesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Factory getLab1Factory() {
		return (Lab1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		usersEClass = createEClass(USERS);
		createEAttribute(usersEClass, USERS__USERNAME);
		createEAttribute(usersEClass, USERS__EMAIL);
		createEAttribute(usersEClass, USERS__AGE);
		createEReference(usersEClass, USERS__ENROLLED_COURSES);
		createEReference(usersEClass, USERS__OWNS_CERTIFICATE);
		createEOperation(usersEClass, USERS___NOT_NULL_USERNAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(usersEClass, USERS___AGE_ABOVE18__DIAGNOSTICCHAIN_MAP);
		createEOperation(usersEClass, USERS___UNIQUE_COURSE_TITLES__DIAGNOSTICCHAIN_MAP);

		coursesEClass = createEClass(COURSES);
		createEAttribute(coursesEClass, COURSES__TITLE);
		createEAttribute(coursesEClass, COURSES__DURATION);
		createEReference(coursesEClass, COURSES__HAS_LESSONS);
		createEOperation(coursesEClass, COURSES___HAS_QUIZ_IN_ALESSON__DIAGNOSTICCHAIN_MAP);
		createEOperation(coursesEClass, COURSES___POSITIVE_DURATION__DIAGNOSTICCHAIN_MAP);

		lessonsEClass = createEClass(LESSONS);
		createEAttribute(lessonsEClass, LESSONS__TOPIC);
		createEAttribute(lessonsEClass, LESSONS__ORDER);
		createEReference(lessonsEClass, LESSONS__INCLUDES_QUIZ);

		quizzesEClass = createEClass(QUIZZES);
		createEAttribute(quizzesEClass, QUIZZES__TITLE);

		certificatesEClass = createEClass(CERTIFICATES);
		createEAttribute(certificatesEClass, CERTIFICATES__ISSUED_DATE);
		createEOperation(certificatesEClass, CERTIFICATES___VALID_TITLE__DIAGNOSTICCHAIN_MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		certificatesEClass.getESuperTypes().add(this.getQuizzes());

		// Initialize classes, features, and operations; add parameters
		initEClass(usersEClass, Users.class, "Users", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsers_Username(), ecorePackage.getEString(), "username", null, 0, 1, Users.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsers_Email(), ecorePackage.getEString(), "email", null, 0, 1, Users.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUsers_Age(), ecorePackage.getEInt(), "age", null, 1, 1, Users.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsers_EnrolledCourses(), this.getCourses(), null, "enrolledCourses", null, 0, -1, Users.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsers_OwnsCertificate(), this.getCertificates(), null, "ownsCertificate", null, 0, -1,
				Users.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getUsers__NotNullUsername__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"notNullUsername", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsers__AgeAbove18__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ageAbove18", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUsers__UniqueCourseTitles__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"uniqueCourseTitles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coursesEClass, Courses.class, "Courses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourses_Title(), ecorePackage.getEString(), "title", null, 0, 1, Courses.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourses_Duration(), ecorePackage.getEInt(), "duration", null, 1, 1, Courses.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourses_HasLessons(), this.getLessons(), null, "hasLessons", null, 0, -1, Courses.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCourses__HasQuizInALesson__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"hasQuizInALesson", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCourses__PositiveDuration__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"positiveDuration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lessonsEClass, Lessons.class, "Lessons", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLessons_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, Lessons.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLessons_Order(), ecorePackage.getEInt(), "order", null, 1, 1, Lessons.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLessons_IncludesQuiz(), this.getQuizzes(), null, "includesQuiz", null, 0, 1, Lessons.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quizzesEClass, Quizzes.class, "Quizzes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuizzes_Title(), ecorePackage.getEString(), "title", null, 0, 1, Quizzes.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificatesEClass, Certificates.class, "Certificates", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificates_IssuedDate(), ecorePackage.getEString(), "issuedDate", null, 0, 1,
				Certificates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCertificates__ValidTitle__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"validTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(usersEClass, source, new String[] { "constraints", "uniqueCourseTitles" });
		addAnnotation(coursesEClass, source, new String[] { "constraints", "positiveDuration" });
		addAnnotation(certificatesEClass, source, new String[] { "constraints", "validTitle" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getUsers__NotNullUsername__DiagnosticChain_Map(), source,
				new String[] { "body", "not username.oclIsUndefined() and username <> \'\'" });
		addAnnotation(getUsers__AgeAbove18__DiagnosticChain_Map(), source, new String[] { "body", "age > 18" });
		addAnnotation(getUsers__UniqueCourseTitles__DiagnosticChain_Map(), source,
				new String[] { "body", "self.enrolledCourses->isUnique(title)" });
		addAnnotation(getCourses__HasQuizInALesson__DiagnosticChain_Map(), source,
				new String[] { "body", "hasLessons->exists(l | l.includesQuiz <> null)" });
		addAnnotation(getCourses__PositiveDuration__DiagnosticChain_Map(), source,
				new String[] { "body", "duration > 0" });
		addAnnotation(getCertificates__ValidTitle__DiagnosticChain_Map(), source,
				new String[] { "body", "not title.oclIsUndefined() and title <> \'\'" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation(getCourses_HasLessons(), source, new String[] { "nullFree", "false" });
	}

} //Lab1PackageImpl
