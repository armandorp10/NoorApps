/**
 */
package noorApps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link noorApps.Entidad#getName <em>Name</em>}</li>
 *   <li>{@link noorApps.Entidad#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link noorApps.Entidad#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link noorApps.Entidad#getDetalles <em>Detalles</em>}</li>
 * </ul>
 *
 * @see noorApps.NoorAppsPackage#getEntidad()
 * @model
 * @generated
 */
public interface Entidad extends EObject {
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
	 * @see noorApps.NoorAppsPackage#getEntidad_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link noorApps.Entidad#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Atributo</b></em>' containment reference list.
	 * The list contents are of type {@link noorApps.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo</em>' containment reference list.
	 * @see noorApps.NoorAppsPackage#getEntidad_Atributo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Atributo> getAtributo();

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see noorApps.NoorAppsPackage#getEntidad_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link noorApps.Entidad#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Detalles</b></em>' reference list.
	 * The list contents are of type {@link noorApps.Detalle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detalles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detalles</em>' reference list.
	 * @see noorApps.NoorAppsPackage#getEntidad_Detalles()
	 * @model
	 * @generated
	 */
	EList<Detalle> getDetalles();

} // Entidad
