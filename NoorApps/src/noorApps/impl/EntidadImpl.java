/**
 */
package noorApps.impl;

import java.util.Collection;

import noorApps.Atributo;
import noorApps.Detalle;
import noorApps.Entidad;
import noorApps.NoorAppsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link noorApps.impl.EntidadImpl#getName <em>Name</em>}</li>
 *   <li>{@link noorApps.impl.EntidadImpl#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link noorApps.impl.EntidadImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link noorApps.impl.EntidadImpl#getDetalles <em>Detalles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadImpl extends MinimalEObjectImpl.Container implements Entidad {
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
	 * The cached value of the '{@link #getAtributo() <em>Atributo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributo()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributo;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetalles() <em>Detalles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetalles()
	 * @generated
	 * @ordered
	 */
	protected EList<Detalle> detalles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NoorAppsPackage.Literals.ENTIDAD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ENTIDAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributo() {
		if (atributo == null) {
			atributo = new EObjectContainmentEList<Atributo>(Atributo.class, this, NoorAppsPackage.ENTIDAD__ATRIBUTO);
		}
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ENTIDAD__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Detalle> getDetalles() {
		if (detalles == null) {
			detalles = new EObjectResolvingEList<Detalle>(Detalle.class, this, NoorAppsPackage.ENTIDAD__DETALLES);
		}
		return detalles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NoorAppsPackage.ENTIDAD__ATRIBUTO:
				return ((InternalEList<?>)getAtributo()).basicRemove(otherEnd, msgs);
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
			case NoorAppsPackage.ENTIDAD__NAME:
				return getName();
			case NoorAppsPackage.ENTIDAD__ATRIBUTO:
				return getAtributo();
			case NoorAppsPackage.ENTIDAD__DESCRIPCION:
				return getDescripcion();
			case NoorAppsPackage.ENTIDAD__DETALLES:
				return getDetalles();
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
			case NoorAppsPackage.ENTIDAD__NAME:
				setName((String)newValue);
				return;
			case NoorAppsPackage.ENTIDAD__ATRIBUTO:
				getAtributo().clear();
				getAtributo().addAll((Collection<? extends Atributo>)newValue);
				return;
			case NoorAppsPackage.ENTIDAD__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case NoorAppsPackage.ENTIDAD__DETALLES:
				getDetalles().clear();
				getDetalles().addAll((Collection<? extends Detalle>)newValue);
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
			case NoorAppsPackage.ENTIDAD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NoorAppsPackage.ENTIDAD__ATRIBUTO:
				getAtributo().clear();
				return;
			case NoorAppsPackage.ENTIDAD__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case NoorAppsPackage.ENTIDAD__DETALLES:
				getDetalles().clear();
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
			case NoorAppsPackage.ENTIDAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NoorAppsPackage.ENTIDAD__ATRIBUTO:
				return atributo != null && !atributo.isEmpty();
			case NoorAppsPackage.ENTIDAD__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case NoorAppsPackage.ENTIDAD__DETALLES:
				return detalles != null && !detalles.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //EntidadImpl
