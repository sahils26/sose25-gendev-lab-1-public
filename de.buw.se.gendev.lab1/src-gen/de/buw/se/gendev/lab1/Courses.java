/**
 */
package de.buw.se.gendev.lab1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Courses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Courses#getTitle <em>Title</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Courses#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Courses#getHasLessons <em>Has Lessons</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getCourses()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveDuration'"
 * @generated
 */
public interface Courses extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getCourses_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Courses#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getCourses_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Courses#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Has Lessons</b></em>' containment reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.Lessons}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Lessons</em>' containment reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getCourses_HasLessons()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Lessons> getHasLessons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='hasLessons-&gt;exists(l | l.includesQuiz &lt;&gt; null)'"
	 * @generated
	 */
	boolean hasQuizInALesson(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='duration &gt; 0'"
	 * @generated
	 */
	boolean positiveDuration(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Courses
