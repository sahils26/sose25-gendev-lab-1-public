/**
 */
package de.buw.se.gendev.lab1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Users</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Users#getUsername <em>Username</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Users#getEmail <em>Email</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Users#getAge <em>Age</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Users#getEnrolledCourses <em>Enrolled Courses</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.Users#getOwnsCertificate <em>Owns Certificate</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getUsers()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueCourseTitles'"
 * @generated
 */
public interface Users extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getUsers_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Users#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getUsers_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Users#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getUsers_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Users#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Enrolled Courses</b></em>' containment reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.Courses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled Courses</em>' containment reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getUsers_EnrolledCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Courses> getEnrolledCourses();

	/**
	 * Returns the value of the '<em><b>Owns Certificate</b></em>' containment reference list.
	 * The list contents are of type {@link de.buw.se.gendev.lab1.Certificates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns Certificate</em>' containment reference list.
	 * @see de.buw.se.gendev.lab1.Lab1Package#getUsers_OwnsCertificate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Certificates> getOwnsCertificate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.enrolledCourses-&gt;isUnique(title)'"
	 * @generated
	 */
	boolean uniqueCourseTitles(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not username.oclIsUndefined() and username &lt;&gt; \'\''"
	 * @generated
	 */
	boolean notNullUsername(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='age &gt; 18'"
	 * @generated
	 */
	boolean ageAbove18(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Users
