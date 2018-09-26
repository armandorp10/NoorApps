/**
 */
package noorApps.impl;

import java.util.Collection;

import noorApps.Detalle;
import noorApps.Entidad;
import noorApps.NoorAppsPackage;
import noorApps.Root;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link noorApps.impl.RootImpl#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link noorApps.impl.RootImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link noorApps.impl.RootImpl#getNavBarColorHex <em>Nav Bar Color Hex</em>}</li>
 *   <li>{@link noorApps.impl.RootImpl#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link noorApps.impl.RootImpl#getFloatingButtonColor <em>Floating Button Color</em>}</li>
 *   <li>{@link noorApps.impl.RootImpl#getDetalles <em>Detalles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getEntidad() <em>Entidad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidad()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidad;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNavBarColorHex() <em>Nav Bar Color Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavBarColorHex()
	 * @generated
	 * @ordered
	 */
	protected static final String NAV_BAR_COLOR_HEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNavBarColorHex() <em>Nav Bar Color Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavBarColorHex()
	 * @generated
	 * @ordered
	 */
	protected String navBarColorHex = NAV_BAR_COLOR_HEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextColor() <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextColor()
	 * @generated
	 * @ordered
	 */
	protected String textColor = TEXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatingButtonColor() <em>Floating Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingButtonColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_BUTTON_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatingButtonColor() <em>Floating Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingButtonColor()
	 * @generated
	 * @ordered
	 */
	protected String floatingButtonColor = FLOATING_BUTTON_COLOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetalles() <em>Detalles</em>}' containment reference list.
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
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NoorAppsPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidad() {
		if (entidad == null) {
			entidad = new EObjectContainmentEList<Entidad>(Entidad.class, this, NoorAppsPackage.ROOT__ENTIDAD);
		}
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ROOT__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNavBarColorHex() {
		return navBarColorHex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavBarColorHex(String newNavBarColorHex) {
		String oldNavBarColorHex = navBarColorHex;
		navBarColorHex = newNavBarColorHex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ROOT__NAV_BAR_COLOR_HEX, oldNavBarColorHex, navBarColorHex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextColor() {
		return textColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextColor(String newTextColor) {
		String oldTextColor = textColor;
		textColor = newTextColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ROOT__TEXT_COLOR, oldTextColor, textColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloatingButtonColor() {
		return floatingButtonColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingButtonColor(String newFloatingButtonColor) {
		String oldFloatingButtonColor = floatingButtonColor;
		floatingButtonColor = newFloatingButtonColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ROOT__FLOATING_BUTTON_COLOR, oldFloatingButtonColor, floatingButtonColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Detalle> getDetalles() {
		if (detalles == null) {
			detalles = new EObjectContainmentEList<Detalle>(Detalle.class, this, NoorAppsPackage.ROOT__DETALLES);
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
			case NoorAppsPackage.ROOT__ENTIDAD:
				return ((InternalEList<?>)getEntidad()).basicRemove(otherEnd, msgs);
			case NoorAppsPackage.ROOT__DETALLES:
				return ((InternalEList<?>)getDetalles()).basicRemove(otherEnd, msgs);
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
			case NoorAppsPackage.ROOT__ENTIDAD:
				return getEntidad();
			case NoorAppsPackage.ROOT__NOMBRE:
				return getNombre();
			case NoorAppsPackage.ROOT__NAV_BAR_COLOR_HEX:
				return getNavBarColorHex();
			case NoorAppsPackage.ROOT__TEXT_COLOR:
				return getTextColor();
			case NoorAppsPackage.ROOT__FLOATING_BUTTON_COLOR:
				return getFloatingButtonColor();
			case NoorAppsPackage.ROOT__DETALLES:
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
			case NoorAppsPackage.ROOT__ENTIDAD:
				getEntidad().clear();
				getEntidad().addAll((Collection<? extends Entidad>)newValue);
				return;
			case NoorAppsPackage.ROOT__NOMBRE:
				setNombre((String)newValue);
				return;
			case NoorAppsPackage.ROOT__NAV_BAR_COLOR_HEX:
				setNavBarColorHex((String)newValue);
				return;
			case NoorAppsPackage.ROOT__TEXT_COLOR:
				setTextColor((String)newValue);
				return;
			case NoorAppsPackage.ROOT__FLOATING_BUTTON_COLOR:
				setFloatingButtonColor((String)newValue);
				return;
			case NoorAppsPackage.ROOT__DETALLES:
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
			case NoorAppsPackage.ROOT__ENTIDAD:
				getEntidad().clear();
				return;
			case NoorAppsPackage.ROOT__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case NoorAppsPackage.ROOT__NAV_BAR_COLOR_HEX:
				setNavBarColorHex(NAV_BAR_COLOR_HEX_EDEFAULT);
				return;
			case NoorAppsPackage.ROOT__TEXT_COLOR:
				setTextColor(TEXT_COLOR_EDEFAULT);
				return;
			case NoorAppsPackage.ROOT__FLOATING_BUTTON_COLOR:
				setFloatingButtonColor(FLOATING_BUTTON_COLOR_EDEFAULT);
				return;
			case NoorAppsPackage.ROOT__DETALLES:
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
			case NoorAppsPackage.ROOT__ENTIDAD:
				return entidad != null && !entidad.isEmpty();
			case NoorAppsPackage.ROOT__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case NoorAppsPackage.ROOT__NAV_BAR_COLOR_HEX:
				return NAV_BAR_COLOR_HEX_EDEFAULT == null ? navBarColorHex != null : !NAV_BAR_COLOR_HEX_EDEFAULT.equals(navBarColorHex);
			case NoorAppsPackage.ROOT__TEXT_COLOR:
				return TEXT_COLOR_EDEFAULT == null ? textColor != null : !TEXT_COLOR_EDEFAULT.equals(textColor);
			case NoorAppsPackage.ROOT__FLOATING_BUTTON_COLOR:
				return FLOATING_BUTTON_COLOR_EDEFAULT == null ? floatingButtonColor != null : !FLOATING_BUTTON_COLOR_EDEFAULT.equals(floatingButtonColor);
			case NoorAppsPackage.ROOT__DETALLES:
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", navBarColorHex: ");
		result.append(navBarColorHex);
		result.append(", textColor: ");
		result.append(textColor);
		result.append(", floatingButtonColor: ");
		result.append(floatingButtonColor);
		result.append(')');
		return result.toString();
	}

} //RootImpl
