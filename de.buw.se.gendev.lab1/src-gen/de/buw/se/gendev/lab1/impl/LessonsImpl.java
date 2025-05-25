/**
 */
package de.buw.se.gendev.lab1.impl;

import de.buw.se.gendev.lab1.Lab1Package;
import de.buw.se.gendev.lab1.Lessons;
import de.buw.se.gendev.lab1.Quizzes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lessons</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.buw.se.gendev.lab1.impl.LessonsImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.LessonsImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link de.buw.se.gendev.lab1.impl.LessonsImpl#getIncludesQuiz <em>Includes Quiz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LessonsImpl extends MinimalEObjectImpl.Container implements Lessons {
	/**
	 * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected String topic = TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected int order = ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludesQuiz() <em>Includes Quiz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludesQuiz()
	 * @generated
	 * @ordered
	 */
	protected Quizzes includesQuiz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LessonsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab1Package.Literals.LESSONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(String newTopic) {
		String oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.LESSONS__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(int newOrder) {
		int oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.LESSONS__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quizzes getIncludesQuiz() {
		return includesQuiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludesQuiz(Quizzes newIncludesQuiz, NotificationChain msgs) {
		Quizzes oldIncludesQuiz = includesQuiz;
		includesQuiz = newIncludesQuiz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Lab1Package.LESSONS__INCLUDES_QUIZ, oldIncludesQuiz, newIncludesQuiz);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludesQuiz(Quizzes newIncludesQuiz) {
		if (newIncludesQuiz != includesQuiz) {
			NotificationChain msgs = null;
			if (includesQuiz != null)
				msgs = ((InternalEObject) includesQuiz).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Lab1Package.LESSONS__INCLUDES_QUIZ, null, msgs);
			if (newIncludesQuiz != null)
				msgs = ((InternalEObject) newIncludesQuiz).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Lab1Package.LESSONS__INCLUDES_QUIZ, null, msgs);
			msgs = basicSetIncludesQuiz(newIncludesQuiz, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab1Package.LESSONS__INCLUDES_QUIZ, newIncludesQuiz,
					newIncludesQuiz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Lab1Package.LESSONS__INCLUDES_QUIZ:
			return basicSetIncludesQuiz(null, msgs);
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
		case Lab1Package.LESSONS__TOPIC:
			return getTopic();
		case Lab1Package.LESSONS__ORDER:
			return getOrder();
		case Lab1Package.LESSONS__INCLUDES_QUIZ:
			return getIncludesQuiz();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Lab1Package.LESSONS__TOPIC:
			setTopic((String) newValue);
			return;
		case Lab1Package.LESSONS__ORDER:
			setOrder((Integer) newValue);
			return;
		case Lab1Package.LESSONS__INCLUDES_QUIZ:
			setIncludesQuiz((Quizzes) newValue);
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
		case Lab1Package.LESSONS__TOPIC:
			setTopic(TOPIC_EDEFAULT);
			return;
		case Lab1Package.LESSONS__ORDER:
			setOrder(ORDER_EDEFAULT);
			return;
		case Lab1Package.LESSONS__INCLUDES_QUIZ:
			setIncludesQuiz((Quizzes) null);
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
		case Lab1Package.LESSONS__TOPIC:
			return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
		case Lab1Package.LESSONS__ORDER:
			return order != ORDER_EDEFAULT;
		case Lab1Package.LESSONS__INCLUDES_QUIZ:
			return includesQuiz != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (topic: ");
		result.append(topic);
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //LessonsImpl
