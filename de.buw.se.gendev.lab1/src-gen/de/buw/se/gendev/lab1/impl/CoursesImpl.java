/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Courses;
import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Lab1Tables;
import de.buw.se.gendev.lab1.Lessons;

import de.buw.se.gendev.lab1.Quizzes;
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
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Courses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.CoursesImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.CoursesImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.CoursesImpl#getHasLessons <em>Has Lessons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoursesImpl extends MinimalEObjectImpl.Container implements Courses {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasLessons() <em>Has Lessons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLessons()
	 * @generated
	 * @ordered
	 */
	protected EList<Lessons> hasLessons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoursesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.COURSES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COURSES__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.COURSES__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lessons> getHasLessons() {
		if (hasLessons == null) {
			hasLessons = new EObjectContainmentEList<Lessons>(Lessons.class, this, Lab1Package.COURSES__HAS_LESSONS);
		}
		return hasLessons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasQuizInALesson(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Courses::hasQuizInALesson";
		try {
			/**
			 *
			 * inv hasQuizInALesson:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = hasLessons->exists(l | l.includesQuiz <> null)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Lab1Package.Literals.COURSES___HAS_QUIZ_IN_ALESSON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Lab1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Lessons> hasLessons = this.getHasLessons();
					final /*@NonInvalid*/ OrderedSetValue BOXED_hasLessons = idResolver
							.createOrderedSetOfAll(Lab1Tables.ORD_CLSSid_Lessons, hasLessons);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_l = BOXED_hasLessons.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_l.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								result = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Lessons l = (Lessons) ITERATOR_l.next();
						/**
						 * l.includesQuiz <> null
						 */
						/*@Caught*/ Object CAUGHT_ne;
						try {
							if (l == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://www.example.org/lab1\'::Lessons::includesQuiz\'");
							}
							final /*@Thrown*/ Quizzes includesQuiz = l.getIncludesQuiz();
							final /*@Thrown*/ boolean ne = includesQuiz != null;
							CAUGHT_ne = ne;
						} catch (Exception e) {
							CAUGHT_ne = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_ne == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							result = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_ne == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else if (CAUGHT_ne instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_ne; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
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
	public boolean positiveDuration(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Courses::positiveDuration";
		try {
			/**
			 *
			 * inv positiveDuration:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = duration > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Lab1Package.Literals.COURSES___POSITIVE_DURATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Lab1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ int duration = this.getDuration();
				final /*@NonInvalid*/ IntegerValue BOXED_duration = ValueUtil.integerValueOf(duration);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, BOXED_duration, Lab1Tables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Lab1Tables.INT_0)
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
		case Lab1Package.COURSES__HAS_LESSONS:
			return ((InternalEList<?>) getHasLessons()).basicRemove(otherEnd, msgs);
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
		case Lab1Package.COURSES__TITLE:
			return getTitle();
		case Lab1Package.COURSES__DURATION:
			return getDuration();
		case Lab1Package.COURSES__HAS_LESSONS:
			return getHasLessons();
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
		case Lab1Package.COURSES__TITLE:
			setTitle((String) newValue);
			return;
		case Lab1Package.COURSES__DURATION:
			setDuration((Integer) newValue);
			return;
		case Lab1Package.COURSES__HAS_LESSONS:
			getHasLessons().clear();
			getHasLessons().addAll((Collection<? extends Lessons>) newValue);
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
		case Lab1Package.COURSES__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case Lab1Package.COURSES__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case Lab1Package.COURSES__HAS_LESSONS:
			getHasLessons().clear();
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
		case Lab1Package.COURSES__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case Lab1Package.COURSES__DURATION:
			return duration != DURATION_EDEFAULT;
		case Lab1Package.COURSES__HAS_LESSONS:
			return hasLessons != null && !hasLessons.isEmpty();
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
		case Lab1Package.COURSES___HAS_QUIZ_IN_ALESSON__DIAGNOSTICCHAIN_MAP:
			return hasQuizInALesson((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Lab1Package.COURSES___POSITIVE_DURATION__DIAGNOSTICCHAIN_MAP:
			return positiveDuration((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (title: ");
		result.append(title);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //CoursesImpl
