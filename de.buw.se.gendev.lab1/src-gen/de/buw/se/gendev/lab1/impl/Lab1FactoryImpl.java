/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab1FactoryImpl extends EFactoryImpl implements Lab1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lab1Factory init() {
		try {
			Lab1Factory theLab1Factory = (Lab1Factory) EPackage.Registry.INSTANCE.getEFactory(Lab1Package.eNS_URI);
			if (theLab1Factory != null) {
				return theLab1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lab1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Lab1Package.USERS:
			return createUsers();
		case Lab1Package.COURSES:
			return createCourses();
		case Lab1Package.LESSONS:
			return createLessons();
		case Lab1Package.QUIZZES:
			return createQuizzes();
		case Lab1Package.CERTIFICATES:
			return createCertificates();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Users createUsers() {
		UsersImpl users = new UsersImpl();
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Courses createCourses() {
		CoursesImpl courses = new CoursesImpl();
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lessons createLessons() {
		LessonsImpl lessons = new LessonsImpl();
		return lessons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quizzes createQuizzes() {
		QuizzesImpl quizzes = new QuizzesImpl();
		return quizzes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificates createCertificates() {
		CertificatesImpl certificates = new CertificatesImpl();
		return certificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1Package getLab1Package() {
		return (Lab1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lab1Package getPackage() {
		return Lab1Package.eINSTANCE;
	}

} //Lab1FactoryImpl
