/**
 */
package noorApps;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detalle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link noorApps.Detalle#isEsFuerte <em>Es Fuerte</em>}</li>
 *   <li>{@link noorApps.Detalle#getEntidad <em>Entidad</em>}</li>
 *   <li>{@link noorApps.Detalle#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see noorApps.NoorAppsPackage#getDetalle()
 * @model
 * @generated
 */
public interface Detalle extends EObject {
	/**
	 * Returns the value of the '<em><b>Es Fuerte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Fuerte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Fuerte</em>' attribute.
	 * @see #setEsFuerte(boolean)
	 * @see noorApps.NoorAppsPackage#getDetalle_EsFuerte()
	 * @model
	 * @generated
	 */
	boolean isEsFuerte();

	/**
	 * Sets the value of the '{@link noorApps.Detalle#isEsFuerte <em>Es Fuerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Fuerte</em>' attribute.
	 * @see #isEsFuerte()
	 * @generated
	 */
	void setEsFuerte(boolean value);

	/**
	 * Returns the value of the '<em><b>Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad</em>' reference.
	 * @see #setEntidad(Entidad)
	 * @see noorApps.NoorAppsPackage#getDetalle_Entidad()
	 * @model required="true"
	 * @generated
	 */
	Entidad getEntidad();

	/**
	 * Sets the value of the '{@link noorApps.Detalle#getEntidad <em>Entidad</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad</em>' reference.
	 * @see #getEntidad()
	 * @generated
	 */
	void setEntidad(Entidad value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see noorApps.NoorAppsPackage#getDetalle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link noorApps.Detalle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Detalle
