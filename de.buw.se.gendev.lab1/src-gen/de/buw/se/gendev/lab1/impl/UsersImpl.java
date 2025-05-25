/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Certificates;
import de.buw.se.gendev.lab1.Courses;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Lab1Tables;
import de.buw.se.gendev.lab1.Users;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Users</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.UsersImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.UsersImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.UsersImpl#getEnrolledCourses <em>Enrolled Courses</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.UsersImpl#getOwnsCertificate <em>Owns Certificate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsersImpl extends MinimalEObjectImpl.Container implements Users {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnrolledCourses() <em>Enrolled Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Courses> enrolledCourses;

	/**
	 * The cached value of the '{@link #getOwnsCertificate() <em>Owns Certificate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnsCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<Certificates> ownsCertificate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.USERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.USERS__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.USERS__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Courses> getEnrolledCourses() {
		if (enrolledCourses == null) {
			enrolledCourses = new EObjectContainmentEList<Courses>(Courses.class, this,
					Lab1Package.USERS__ENROLLED_COURSES);
		}
		return enrolledCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Certificates> getOwnsCertificate() {
		if (ownsCertificate == null) {
			ownsCertificate = new EObjectContainmentEList<Certificates>(Certificates.class, this,
					Lab1Package.USERS__OWNS_CERTIFICATE);
		}
		return ownsCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueCourseTitles(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Users::uniqueCourseTitles";
		try {
			/**
			 *
			 * inv uniqueCourseTitles:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.enrolledCourses->isUnique(title)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Lab1Package.Literals.USERS___UNIQUE_COURSE_TITLES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Lab1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Courses> enrolledCourses = this.getEnrolledCourses();
					final /*@NonInvalid*/ OrderedSetValue BOXED_enrolledCourses = idResolver
							.createOrderedSetOfAll(Lab1Tables.ORD_CLSSid_Courses, enrolledCourses);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Lab1Tables.ORD_CLSSid_Courses);
					Iterator<Object> ITERATOR__1 = BOXED_enrolledCourses.iterator();
					/*@Thrown*/ boolean result;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							result = true;
							break;
						}
						/*@NonInvalid*/ Courses _1 = (Courses) ITERATOR__1.next();
						/**
						 * title
						 */
						final /*@NonInvalid*/ String title = _1.getTitle();
						//
						if (accumulator.includes(title) == ValueUtil.TRUE_VALUE) {
							result = false;
							break; // Abort after second find
						} else {
							accumulator.add(title);
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Lab1Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean notNullUsername(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Users::notNullUsername";
		try {
			/**
			 *
			 * inv notNullUsername:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = not username.oclIsUndefined() and username <> ''
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Lab1Package.Literals.USERS___NOT_NULL_USERNAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Lab1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String username_0 = this.getUsername();
					final /*@NonInvalid*/ boolean oclIsUndefined = username_0 == null;
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsUndefined) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsUndefined) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (not == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean ne = !Lab1Tables.STR_.equals(username_0);
						if (!ne) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (not == null) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Lab1Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.USERS__ENROLLED_COURSES:
			return ((InternalEList<?>) getEnrolledCourses()).basicRemove(otherEnd, msgs);
		case Lab1Package.USERS__OWNS_CERTIFICATE:
			return ((InternalEList<?>) getOwnsCertificate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Lab1Package.USERS__USERNAME:
			return getUsername();
		case Lab1Package.USERS__EMAIL:
			return getEmail();
		case Lab1Package.USERS__ENROLLED_COURSES:
			return getEnrolledCourses();
		case Lab1Package.USERS__OWNS_CERTIFICATE:
			return getOwnsCertificate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab1Package.USERS__USERNAME:
			setUsername((String) newValue);
			return;
		case Lab1Package.USERS__EMAIL:
			setEmail((String) newValue);
			return;
		case Lab1Package.USERS__ENROLLED_COURSES:
			getEnrolledCourses().clear();
			getEnrolledCourses().addAll((Collection<? extends Courses>) newValue);
			return;
		case Lab1Package.USERS__OWNS_CERTIFICATE:
			getOwnsCertificate().clear();
			getOwnsCertificate().addAll((Collection<? extends Certificates>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Lab1Package.USERS__USERNAME:
			setUsername(USERNAME_EDEFAULT);
			return;
		case Lab1Package.USERS__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case Lab1Package.USERS__ENROLLED_COURSES:
			getEnrolledCourses().clear();
			return;
		case Lab1Package.USERS__OWNS_CERTIFICATE:
			getOwnsCertificate().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Lab1Package.USERS__USERNAME:
			return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
		case Lab1Package.USERS__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case Lab1Package.USERS__ENROLLED_COURSES:
			return enrolledCourses != null && !enrolledCourses.isEmpty();
		case Lab1Package.USERS__OWNS_CERTIFICATE:
			return ownsCertificate != null && !ownsCertificate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Lab1Package.USERS___UNIQUE_COURSE_TITLES__DIAGNOSTICCHAIN_MAP:
			return uniqueCourseTitles((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Lab1Package.USERS___NOT_NULL_USERNAME__DIAGNOSTICCHAIN_MAP:
			return notNullUsername((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (username: ");
		result.append(username);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //UsersImpl
