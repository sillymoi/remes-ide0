/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.uppaal.impl;

import hr.fer.rasip.uppaal.InitType;
import hr.fer.rasip.uppaal.LocationType;
import hr.fer.rasip.uppaal.NameType;
import hr.fer.rasip.uppaal.ParameterType;
import hr.fer.rasip.uppaal.TemplateType;
import hr.fer.rasip.uppaal.TransitionType;
import hr.fer.rasip.uppaal.UppaalPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hr.fer.rasip.uppaal.impl.TemplateTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.TemplateTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.TemplateTypeImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.TemplateTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.TemplateTypeImpl#getInit <em>Init</em>}</li>
 *   <li>{@link hr.fer.rasip.uppaal.impl.TemplateTypeImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateTypeImpl extends EObjectImpl implements TemplateType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameType name;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected ParameterType parameter;

	/**
	 * The default value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String declaration = DECLARATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList location;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected InitType init;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList transition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return UppaalPackage.Literals.TEMPLATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameType newName, NotificationChain msgs) {
		NameType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalPackage.TEMPLATE_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NameType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.TEMPLATE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.TEMPLATE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.TEMPLATE_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(ParameterType newParameter, NotificationChain msgs) {
		ParameterType oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalPackage.TEMPLATE_TYPE__PARAMETER, oldParameter, newParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(ParameterType newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.TEMPLATE_TYPE__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.TEMPLATE_TYPE__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.TEMPLATE_TYPE__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(String newDeclaration) {
		String oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.TEMPLATE_TYPE__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList(LocationType.class, this, UppaalPackage.TEMPLATE_TYPE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitType getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(InitType newInit, NotificationChain msgs) {
		InitType oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UppaalPackage.TEMPLATE_TYPE__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(InitType newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.TEMPLATE_TYPE__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UppaalPackage.TEMPLATE_TYPE__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UppaalPackage.TEMPLATE_TYPE__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList(TransitionType.class, this, UppaalPackage.TEMPLATE_TYPE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UppaalPackage.TEMPLATE_TYPE__NAME:
				return basicSetName(null, msgs);
			case UppaalPackage.TEMPLATE_TYPE__PARAMETER:
				return basicSetParameter(null, msgs);
			case UppaalPackage.TEMPLATE_TYPE__LOCATION:
				return ((InternalEList)getLocation()).basicRemove(otherEnd, msgs);
			case UppaalPackage.TEMPLATE_TYPE__INIT:
				return basicSetInit(null, msgs);
			case UppaalPackage.TEMPLATE_TYPE__TRANSITION:
				return ((InternalEList)getTransition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UppaalPackage.TEMPLATE_TYPE__NAME:
				return getName();
			case UppaalPackage.TEMPLATE_TYPE__PARAMETER:
				return getParameter();
			case UppaalPackage.TEMPLATE_TYPE__DECLARATION:
				return getDeclaration();
			case UppaalPackage.TEMPLATE_TYPE__LOCATION:
				return getLocation();
			case UppaalPackage.TEMPLATE_TYPE__INIT:
				return getInit();
			case UppaalPackage.TEMPLATE_TYPE__TRANSITION:
				return getTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UppaalPackage.TEMPLATE_TYPE__NAME:
				setName((NameType)newValue);
				return;
			case UppaalPackage.TEMPLATE_TYPE__PARAMETER:
				setParameter((ParameterType)newValue);
				return;
			case UppaalPackage.TEMPLATE_TYPE__DECLARATION:
				setDeclaration((String)newValue);
				return;
			case UppaalPackage.TEMPLATE_TYPE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection)newValue);
				return;
			case UppaalPackage.TEMPLATE_TYPE__INIT:
				setInit((InitType)newValue);
				return;
			case UppaalPackage.TEMPLATE_TYPE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case UppaalPackage.TEMPLATE_TYPE__NAME:
				setName((NameType)null);
				return;
			case UppaalPackage.TEMPLATE_TYPE__PARAMETER:
				setParameter((ParameterType)null);
				return;
			case UppaalPackage.TEMPLATE_TYPE__DECLARATION:
				setDeclaration(DECLARATION_EDEFAULT);
				return;
			case UppaalPackage.TEMPLATE_TYPE__LOCATION:
				getLocation().clear();
				return;
			case UppaalPackage.TEMPLATE_TYPE__INIT:
				setInit((InitType)null);
				return;
			case UppaalPackage.TEMPLATE_TYPE__TRANSITION:
				getTransition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UppaalPackage.TEMPLATE_TYPE__NAME:
				return name != null;
			case UppaalPackage.TEMPLATE_TYPE__PARAMETER:
				return parameter != null;
			case UppaalPackage.TEMPLATE_TYPE__DECLARATION:
				return DECLARATION_EDEFAULT == null ? declaration != null : !DECLARATION_EDEFAULT.equals(declaration);
			case UppaalPackage.TEMPLATE_TYPE__LOCATION:
				return location != null && !location.isEmpty();
			case UppaalPackage.TEMPLATE_TYPE__INIT:
				return init != null;
			case UppaalPackage.TEMPLATE_TYPE__TRANSITION:
				return transition != null && !transition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (declaration: ");
		result.append(declaration);
		result.append(')');
		return result.toString();
	}

} //TemplateTypeImpl
