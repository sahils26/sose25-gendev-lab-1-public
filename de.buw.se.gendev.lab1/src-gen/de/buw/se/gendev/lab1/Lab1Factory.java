/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Package
 * @generated
 */
public interface Lab1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab1Factory eINSTANCE = de.buw.se.gendev.lab1.impl.Lab1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Users</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Users</em>'.
	 * @generated
	 */
	Users createUsers();

	/**
	 * Returns a new object of class '<em>Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Courses</em>'.
	 * @generated
	 */
	Courses createCourses();

	/**
	 * Returns a new object of class '<em>Lessons</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lessons</em>'.
	 * @generated
	 */
	Lessons createLessons();

	/**
	 * Returns a new object of class '<em>Quizzes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quizzes</em>'.
	 * @generated
	 */
	Quizzes createQuizzes();

	/**
	 * Returns a new object of class '<em>Certificates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificates</em>'.
	 * @generated
	 */
	Certificates createCertificates();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Lab1Package getLab1Package();

} //Lab1Factory
