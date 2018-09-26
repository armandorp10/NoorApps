/**
 */
package noorApps.impl;

import noorApps.Detalle;
import noorApps.Entidad;
import noorApps.NoorAppsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detalle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link noorApps.impl.DetalleImpl#isEsFuerte <em>Es Fuerte</em>}</li>
 *   <li>{@link noorApps.impl.DetalleImpl#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link noorApps.impl.DetalleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetalleImpl extends MinimalEObjectImpl.Container implements Detalle {
	/**
	 * The default value of the '{@link #isEsFuerte() <em>Es Fuerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsFuerte()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_FUERTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsFuerte() <em>Es Fuerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsFuerte()
	 * @generated
	 * @ordered
	 */
	protected boolean esFuerte = ES_FUERTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntidad() <em>Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidad()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidad;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetalleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NoorAppsPackage.Literals.DETALLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsFuerte() {
		return esFuerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsFuerte(boolean newEsFuerte) {
		boolean oldEsFuerte = esFuerte;
		esFuerte = newEsFuerte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.DETALLE__ES_FUERTE, oldEsFuerte, esFuerte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEntidad() {
		if (entidad != null && entidad.eIsProxy()) {
			InternalEObject oldEntidad = (InternalEObject)entidad;
			entidad = (Entidad)eResolveProxy(oldEntidad);
			if (entidad != oldEntidad) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NoorAppsPackage.DETALLE__ENTIDAD, oldEntidad, entidad));
			}
		}
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidad() {
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidad(Entidad newEntidad) {
		Entidad oldEntidad = entidad;
		entidad = newEntidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.DETALLE__ENTIDAD, oldEntidad, entidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.DETALLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NoorAppsPackage.DETALLE__ES_FUERTE:
				return isEsFuerte();
			case NoorAppsPackage.DETALLE__ENTIDAD:
				if (resolve) return getEntidad();
				return basicGetEntidad();
			case NoorAppsPackage.DETALLE__NAME:
				return getName();
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
			case NoorAppsPackage.DETALLE__ES_FUERTE:
				setEsFuerte((Boolean)newValue);
				return;
			case NoorAppsPackage.DETALLE__ENTIDAD:
				setEntidad((Entidad)newValue);
				return;
			case NoorAppsPackage.DETALLE__NAME:
				setName((String)newValue);
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
			case NoorAppsPackage.DETALLE__ES_FUERTE:
				setEsFuerte(ES_FUERTE_EDEFAULT);
				return;
			case NoorAppsPackage.DETALLE__ENTIDAD:
				setEntidad((Entidad)null);
				return;
			case NoorAppsPackage.DETALLE__NAME:
				setName(NAME_EDEFAULT);
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
			case NoorAppsPackage.DETALLE__ES_FUERTE:
				return esFuerte != ES_FUERTE_EDEFAULT;
			case NoorAppsPackage.DETALLE__ENTIDAD:
				return entidad != null;
			case NoorAppsPackage.DETALLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (esFuerte: ");
		result.append(esFuerte);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DetalleImpl
