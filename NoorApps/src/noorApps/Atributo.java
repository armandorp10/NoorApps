/**
 */
package noorApps;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link noorApps.Atributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link noorApps.Atributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link noorApps.Atributo#isEsVisible <em>Es Visible</em>}</li>
 *   <li>{@link noorApps.Atributo#isEsEditable <em>Es Editable</em>}</li>
 *   <li>{@link noorApps.Atributo#isEsRequerido <em>Es Requerido</em>}</li>
 *   <li>{@link noorApps.Atributo#isEsTitulo <em>Es Titulo</em>}</li>
 * </ul>
 *
 * @see noorApps.NoorAppsPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
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
	 * @see noorApps.NoorAppsPackage#getAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link noorApps.Atributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link noorApps.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see noorApps.TipoDato
	 * @see #setTipo(TipoDato)
	 * @see noorApps.NoorAppsPackage#getAtributo_Tipo()
	 * @model
	 * @generated
	 */
	TipoDato getTipo();

	/**
	 * Sets the value of the '{@link noorApps.Atributo#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see noorApps.TipoDato
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Es Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Visible</em>' attribute.
	 * @see #setEsVisible(boolean)
	 * @see noorApps.NoorAppsPackage#getAtributo_EsVisible()
	 * @model
	 * @generated
	 */
	boolean isEsVisible();

	/**
	 * Sets the value of the '{@link noorApps.Atributo#isEsVisible <em>Es Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Visible</em>' attribute.
	 * @see #isEsVisible()
	 * @generated
	 */
	void setEsVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Es Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Editable</em>' attribute.
	 * @see #setEsEditable(boolean)
	 * @see noorApps.NoorAppsPackage#getAtributo_EsEditable()
	 * @model
	 * @generated
	 */
	boolean isEsEditable();

	/**
	 * Sets the value of the '{@link noorApps.Atributo#isEsEditable <em>Es Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Editable</em>' attribute.
	 * @see #isEsEditable()
	 * @generated
	 */
	void setEsEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Es Requerido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Requerido</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Requerido</em>' attribute.
	 * @see #setEsRequerido(boolean)
	 * @see noorApps.NoorAppsPackage#getAtributo_EsRequerido()
	 * @model
	 * @generated
	 */
	boolean isEsRequerido();

	/**
	 * Sets the value of the '{@link noorApps.Atributo#isEsRequerido <em>Es Requerido</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Requerido</em>' attribute.
	 * @see #isEsRequerido()
	 * @generated
	 */
	void setEsRequerido(boolean value);

	/**
	 * Returns the value of the '<em><b>Es Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Titulo</em>' attribute.
	 * @see #setEsTitulo(boolean)
	 * @see noorApps.NoorAppsPackage#getAtributo_EsTitulo()
	 * @model
	 * @generated
	 */
	boolean isEsTitulo();

	/**
	 * Sets the value of the '{@link noorApps.Atributo#isEsTitulo <em>Es Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Titulo</em>' attribute.
	 * @see #isEsTitulo()
	 * @generated
	 */
	void setEsTitulo(boolean value);

} // Atributo
