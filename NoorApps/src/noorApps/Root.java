/**
 */
package noorApps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link noorApps.Root#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link noorApps.Root#getNombre <em>Nombre</em>}</li>
 *   <li>{@link noorApps.Root#getNavBarColorHex <em>Nav Bar Color Hex</em>}</li>
 *   <li>{@link noorApps.Root#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link noorApps.Root#getFloatingButtonColor <em>Floating Button Color</em>}</li>
 *   <li>{@link noorApps.Root#getDetalles <em>Detalles</em>}</li>
 * </ul>
 *
 * @see noorApps.NoorAppsPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidad</b></em>' containment reference list.
	 * The list contents are of type {@link noorApps.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad</em>' containment reference list.
	 * @see noorApps.NoorAppsPackage#getRoot_Entidad()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidad> getEntidad();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see noorApps.NoorAppsPackage#getRoot_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link noorApps.Root#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Nav Bar Color Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nav Bar Color Hex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nav Bar Color Hex</em>' attribute.
	 * @see #setNavBarColorHex(String)
	 * @see noorApps.NoorAppsPackage#getRoot_NavBarColorHex()
	 * @model
	 * @generated
	 */
	String getNavBarColorHex();

	/**
	 * Sets the value of the '{@link noorApps.Root#getNavBarColorHex <em>Nav Bar Color Hex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nav Bar Color Hex</em>' attribute.
	 * @see #getNavBarColorHex()
	 * @generated
	 */
	void setNavBarColorHex(String value);

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #setTextColor(String)
	 * @see noorApps.NoorAppsPackage#getRoot_TextColor()
	 * @model
	 * @generated
	 */
	String getTextColor();

	/**
	 * Sets the value of the '{@link noorApps.Root#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(String value);

	/**
	 * Returns the value of the '<em><b>Floating Button Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating Button Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Button Color</em>' attribute.
	 * @see #setFloatingButtonColor(String)
	 * @see noorApps.NoorAppsPackage#getRoot_FloatingButtonColor()
	 * @model
	 * @generated
	 */
	String getFloatingButtonColor();

	/**
	 * Sets the value of the '{@link noorApps.Root#getFloatingButtonColor <em>Floating Button Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Button Color</em>' attribute.
	 * @see #getFloatingButtonColor()
	 * @generated
	 */
	void setFloatingButtonColor(String value);

	/**
	 * Returns the value of the '<em><b>Detalles</b></em>' containment reference list.
	 * The list contents are of type {@link noorApps.Detalle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detalles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detalles</em>' containment reference list.
	 * @see noorApps.NoorAppsPackage#getRoot_Detalles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Detalle> getDetalles();

} // Root
