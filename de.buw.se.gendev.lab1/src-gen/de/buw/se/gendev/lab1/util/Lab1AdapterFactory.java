/**
 */
package de.buw.se.gendev.lab1.util;

import de.buw.se.gendev.lab1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.buw.se.gendev.lab1.Lab1Package
 * @generated
 */
public class Lab1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Lab1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Lab1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lab1Switch<Adapter> modelSwitch = new Lab1Switch<Adapter>() {
		@Override
		public Adapter caseUsers(Users object) {
			return createUsersAdapter();
		}

		@Override
		public Adapter caseCourses(Courses object) {
			return createCoursesAdapter();
		}

		@Override
		public Adapter caseLessons(Lessons object) {
			return createLessonsAdapter();
		}

		@Override
		public Adapter caseQuizzes(Quizzes object) {
			return createQuizzesAdapter();
		}

		@Override
		public Adapter caseCertificates(Certificates object) {
			return createCertificatesAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.buw.se.gendev.lab1.Users <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.buw.se.gendev.lab1.Users
	 * @generated
	 */
	public Adapter createUsersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.buw.se.gendev.lab1.Courses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.buw.se.gendev.lab1.Courses
	 * @generated
	 */
	public Adapter createCoursesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.buw.se.gendev.lab1.Lessons <em>Lessons</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.buw.se.gendev.lab1.Lessons
	 * @generated
	 */
	public Adapter createLessonsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.buw.se.gendev.lab1.Quizzes <em>Quizzes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.buw.se.gendev.lab1.Quizzes
	 * @generated
	 */
	public Adapter createQuizzesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.buw.se.gendev.lab1.Certificates <em>Certificates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.buw.se.gendev.lab1.Certificates
	 * @generated
	 */
	public Adapter createCertificatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Lab1AdapterFactory
