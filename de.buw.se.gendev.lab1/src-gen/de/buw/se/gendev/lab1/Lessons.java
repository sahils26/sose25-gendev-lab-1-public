/**
 */
package de.buw.se.gendev.lab1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lessons</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Lessons#getTopic <em>Topic</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Lessons#getOrder <em>Order</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Lessons#getIncludesQuiz <em>Includes Quiz</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getLessons()
 * @model
 * @generated
 */
public interface Lessons extends EObject {
	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getLessons_Topic()
	 * @model
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Lessons#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getLessons_Order()
	 * @model required="true"
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Lessons#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Includes Quiz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Quiz</em>' containment reference.
	 * @see #setIncludesQuiz(Quizzes)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getLessons_IncludesQuiz()
	 * @model containment="true"
	 * @generated
	 */
	Quizzes getIncludesQuiz();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Lessons#getIncludesQuiz <em>Includes Quiz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes Quiz</em>' containment reference.
	 * @see #getIncludesQuiz()
	 * @generated
	 */
	void setIncludesQuiz(Quizzes value);

} // Lessons
