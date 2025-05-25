/**
 */
package de.buw.se.gendev.lab1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.Certificates#getIssuedDate <em>Issued Date</em>}</li>
 * </ul>
 *
 * @see de.buw.se.gendev.lab1.Lab1Package#getCertificates()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validTitle'"
 * @generated
 */
public interface Certificates extends Quizzes {
	/**
	 * Returns the value of the '<em><b>Issued Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued Date</em>' attribute.
	 * @see #setIssuedDate(String)
	 * @see de.buw.se.gendev.lab1.Lab1Package#getCertificates_IssuedDate()
	 * @model
	 * @generated
	 */
	String getIssuedDate();

	/**
	 * Sets the value of the '{@link de.buw.se.gendev.lab1.Certificates#getIssuedDate <em>Issued Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued Date</em>' attribute.
	 * @see #getIssuedDate()
	 * @generated
	 */
	void setIssuedDate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='not title.oclIsUndefined() and title &lt;&gt; \'\''"
	 * @generated
	 */
	boolean validTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Certificates
