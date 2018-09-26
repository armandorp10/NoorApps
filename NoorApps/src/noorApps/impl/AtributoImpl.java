/**
 */
package noorApps.impl;

import noorApps.Atributo;
import noorApps.NoorAppsPackage;
import noorApps.TipoDato;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link noorApps.impl.AtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link noorApps.impl.AtributoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link noorApps.impl.AtributoImpl#isEsVisible <em>Es Visible</em>}</li>
 *   <li>{@link noorApps.impl.AtributoImpl#isEsEditable <em>Es Editable</em>}</li>
 *   <li>{@link noorApps.impl.AtributoImpl#isEsRequerido <em>Es Requerido</em>}</li>
 *   <li>{@link noorApps.impl.AtributoImpl#isEsTitulo <em>Es Titulo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_EDEFAULT = TipoDato.BOLEANO;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsVisible() <em>Es Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsVisible() <em>Es Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean esVisible = ES_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsEditable() <em>Es Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsEditable() <em>Es Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean esEditable = ES_EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsRequerido() <em>Es Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsRequerido()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_REQUERIDO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsRequerido() <em>Es Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsRequerido()
	 * @generated
	 * @ordered
	 */
	protected boolean esRequerido = ES_REQUERIDO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsTitulo() <em>Es Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_TITULO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsTitulo() <em>Es Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsTitulo()
	 * @generated
	 * @ordered
	 */
	protected boolean esTitulo = ES_TITULO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NoorAppsPackage.Literals.ATRIBUTO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoDato newTipo) {
		TipoDato oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ATRIBUTO__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsVisible() {
		return esVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsVisible(boolean newEsVisible) {
		boolean oldEsVisible = esVisible;
		esVisible = newEsVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ATRIBUTO__ES_VISIBLE, oldEsVisible, esVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsEditable() {
		return esEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsEditable(boolean newEsEditable) {
		boolean oldEsEditable = esEditable;
		esEditable = newEsEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ATRIBUTO__ES_EDITABLE, oldEsEditable, esEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsRequerido() {
		return esRequerido;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsRequerido(boolean newEsRequerido) {
		boolean oldEsRequerido = esRequerido;
		esRequerido = newEsRequerido;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ATRIBUTO__ES_REQUERIDO, oldEsRequerido, esRequerido));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsTitulo() {
		return esTitulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsTitulo(boolean newEsTitulo) {
		boolean oldEsTitulo = esTitulo;
		esTitulo = newEsTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NoorAppsPackage.ATRIBUTO__ES_TITULO, oldEsTitulo, esTitulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NoorAppsPackage.ATRIBUTO__NOMBRE:
				return getNombre();
			case NoorAppsPackage.ATRIBUTO__TIPO:
				return getTipo();
			case NoorAppsPackage.ATRIBUTO__ES_VISIBLE:
				return isEsVisible();
			case NoorAppsPackage.ATRIBUTO__ES_EDITABLE:
				return isEsEditable();
			case NoorAppsPackage.ATRIBUTO__ES_REQUERIDO:
				return isEsRequerido();
			case NoorAppsPackage.ATRIBUTO__ES_TITULO:
				return isEsTitulo();
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
			case NoorAppsPackage.ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case NoorAppsPackage.ATRIBUTO__TIPO:
				setTipo((TipoDato)newValue);
				return;
			case NoorAppsPackage.ATRIBUTO__ES_VISIBLE:
				setEsVisible((Boolean)newValue);
				return;
			case NoorAppsPackage.ATRIBUTO__ES_EDITABLE:
				setEsEditable((Boolean)newValue);
				return;
			case NoorAppsPackage.ATRIBUTO__ES_REQUERIDO:
				setEsRequerido((Boolean)newValue);
				return;
			case NoorAppsPackage.ATRIBUTO__ES_TITULO:
				setEsTitulo((Boolean)newValue);
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
			case NoorAppsPackage.ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case NoorAppsPackage.ATRIBUTO__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case NoorAppsPackage.ATRIBUTO__ES_VISIBLE:
				setEsVisible(ES_VISIBLE_EDEFAULT);
				return;
			case NoorAppsPackage.ATRIBUTO__ES_EDITABLE:
				setEsEditable(ES_EDITABLE_EDEFAULT);
				return;
			case NoorAppsPackage.ATRIBUTO__ES_REQUERIDO:
				setEsRequerido(ES_REQUERIDO_EDEFAULT);
				return;
			case NoorAppsPackage.ATRIBUTO__ES_TITULO:
				setEsTitulo(ES_TITULO_EDEFAULT);
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
			case NoorAppsPackage.ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case NoorAppsPackage.ATRIBUTO__TIPO:
				return tipo != TIPO_EDEFAULT;
			case NoorAppsPackage.ATRIBUTO__ES_VISIBLE:
				return esVisible != ES_VISIBLE_EDEFAULT;
			case NoorAppsPackage.ATRIBUTO__ES_EDITABLE:
				return esEditable != ES_EDITABLE_EDEFAULT;
			case NoorAppsPackage.ATRIBUTO__ES_REQUERIDO:
				return esRequerido != ES_REQUERIDO_EDEFAULT;
			case NoorAppsPackage.ATRIBUTO__ES_TITULO:
				return esTitulo != ES_TITULO_EDEFAULT;
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", esVisible: ");
		result.append(esVisible);
		result.append(", esEditable: ");
		result.append(esEditable);
		result.append(", esRequerido: ");
		result.append(esRequerido);
		result.append(", esTitulo: ");
		result.append(esTitulo);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
