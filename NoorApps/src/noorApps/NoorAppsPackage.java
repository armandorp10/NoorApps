/**
 */
package noorApps;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see noorApps.NoorAppsFactory
 * @model kind="package"
 * @generated
 */
public interface NoorAppsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "noorApps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/noorApps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "noorApps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NoorAppsPackage eINSTANCE = noorApps.impl.NoorAppsPackageImpl.init();

	/**
	 * The meta object id for the '{@link noorApps.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noorApps.impl.EntidadImpl
	 * @see noorApps.impl.NoorAppsPackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ATRIBUTO = 1;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__DESCRIPCION = 2;

	/**
	 * The feature id for the '<em><b>Detalles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__DETALLES = 3;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link noorApps.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noorApps.impl.AtributoImpl
	 * @see noorApps.impl.NoorAppsPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Es Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ES_VISIBLE = 2;

	/**
	 * The feature id for the '<em><b>Es Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ES_EDITABLE = 3;

	/**
	 * The feature id for the '<em><b>Es Requerido</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ES_REQUERIDO = 4;

	/**
	 * The feature id for the '<em><b>Es Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ES_TITULO = 5;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link noorApps.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noorApps.impl.RootImpl
	 * @see noorApps.impl.NoorAppsPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 2;

	/**
	 * The feature id for the '<em><b>Entidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ENTIDAD = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Nav Bar Color Hex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAV_BAR_COLOR_HEX = 2;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TEXT_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Floating Button Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__FLOATING_BUTTON_COLOR = 4;

	/**
	 * The feature id for the '<em><b>Detalles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DETALLES = 5;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link noorApps.impl.DetalleImpl <em>Detalle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noorApps.impl.DetalleImpl
	 * @see noorApps.impl.NoorAppsPackageImpl#getDetalle()
	 * @generated
	 */
	int DETALLE = 3;

	/**
	 * The feature id for the '<em><b>Es Fuerte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE__ES_FUERTE = 0;

	/**
	 * The feature id for the '<em><b>Entidad</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE__ENTIDAD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Detalle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Detalle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETALLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link noorApps.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see noorApps.TipoDato
	 * @see noorApps.impl.NoorAppsPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 4;


	/**
	 * Returns the meta object for class '{@link noorApps.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see noorApps.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Entidad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see noorApps.Entidad#getName()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link noorApps.Entidad#getAtributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributo</em>'.
	 * @see noorApps.Entidad#getAtributo()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Atributo();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Entidad#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see noorApps.Entidad#getDescripcion()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Descripcion();

	/**
	 * Returns the meta object for the reference list '{@link noorApps.Entidad#getDetalles <em>Detalles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Detalles</em>'.
	 * @see noorApps.Entidad#getDetalles()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_Detalles();

	/**
	 * Returns the meta object for class '{@link noorApps.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see noorApps.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see noorApps.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Atributo#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see noorApps.Atributo#getTipo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Atributo#isEsVisible <em>Es Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Visible</em>'.
	 * @see noorApps.Atributo#isEsVisible()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_EsVisible();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Atributo#isEsEditable <em>Es Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Editable</em>'.
	 * @see noorApps.Atributo#isEsEditable()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_EsEditable();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Atributo#isEsRequerido <em>Es Requerido</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Requerido</em>'.
	 * @see noorApps.Atributo#isEsRequerido()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_EsRequerido();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Atributo#isEsTitulo <em>Es Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Titulo</em>'.
	 * @see noorApps.Atributo#isEsTitulo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_EsTitulo();

	/**
	 * Returns the meta object for class '{@link noorApps.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see noorApps.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link noorApps.Root#getEntidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidad</em>'.
	 * @see noorApps.Root#getEntidad()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Entidad();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Root#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see noorApps.Root#getNombre()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Root#getNavBarColorHex <em>Nav Bar Color Hex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nav Bar Color Hex</em>'.
	 * @see noorApps.Root#getNavBarColorHex()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_NavBarColorHex();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Root#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see noorApps.Root#getTextColor()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Root#getFloatingButtonColor <em>Floating Button Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floating Button Color</em>'.
	 * @see noorApps.Root#getFloatingButtonColor()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_FloatingButtonColor();

	/**
	 * Returns the meta object for the containment reference list '{@link noorApps.Root#getDetalles <em>Detalles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Detalles</em>'.
	 * @see noorApps.Root#getDetalles()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Detalles();

	/**
	 * Returns the meta object for class '{@link noorApps.Detalle <em>Detalle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detalle</em>'.
	 * @see noorApps.Detalle
	 * @generated
	 */
	EClass getDetalle();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Detalle#isEsFuerte <em>Es Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Fuerte</em>'.
	 * @see noorApps.Detalle#isEsFuerte()
	 * @see #getDetalle()
	 * @generated
	 */
	EAttribute getDetalle_EsFuerte();

	/**
	 * Returns the meta object for the reference '{@link noorApps.Detalle#getEntidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad</em>'.
	 * @see noorApps.Detalle#getEntidad()
	 * @see #getDetalle()
	 * @generated
	 */
	EReference getDetalle_Entidad();

	/**
	 * Returns the meta object for the attribute '{@link noorApps.Detalle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see noorApps.Detalle#getName()
	 * @see #getDetalle()
	 * @generated
	 */
	EAttribute getDetalle_Name();

	/**
	 * Returns the meta object for enum '{@link noorApps.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see noorApps.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NoorAppsFactory getNoorAppsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link noorApps.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noorApps.impl.EntidadImpl
		 * @see noorApps.impl.NoorAppsPackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NAME = eINSTANCE.getEntidad_Name();

		/**
		 * The meta object literal for the '<em><b>Atributo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ATRIBUTO = eINSTANCE.getEntidad_Atributo();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__DESCRIPCION = eINSTANCE.getEntidad_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Detalles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__DETALLES = eINSTANCE.getEntidad_Detalles();

		/**
		 * The meta object literal for the '{@link noorApps.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noorApps.impl.AtributoImpl
		 * @see noorApps.impl.NoorAppsPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

		/**
		 * The meta object literal for the '<em><b>Es Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__ES_VISIBLE = eINSTANCE.getAtributo_EsVisible();

		/**
		 * The meta object literal for the '<em><b>Es Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__ES_EDITABLE = eINSTANCE.getAtributo_EsEditable();

		/**
		 * The meta object literal for the '<em><b>Es Requerido</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__ES_REQUERIDO = eINSTANCE.getAtributo_EsRequerido();

		/**
		 * The meta object literal for the '<em><b>Es Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__ES_TITULO = eINSTANCE.getAtributo_EsTitulo();

		/**
		 * The meta object literal for the '{@link noorApps.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noorApps.impl.RootImpl
		 * @see noorApps.impl.NoorAppsPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Entidad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ENTIDAD = eINSTANCE.getRoot_Entidad();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__NOMBRE = eINSTANCE.getRoot_Nombre();

		/**
		 * The meta object literal for the '<em><b>Nav Bar Color Hex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__NAV_BAR_COLOR_HEX = eINSTANCE.getRoot_NavBarColorHex();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__TEXT_COLOR = eINSTANCE.getRoot_TextColor();

		/**
		 * The meta object literal for the '<em><b>Floating Button Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__FLOATING_BUTTON_COLOR = eINSTANCE.getRoot_FloatingButtonColor();

		/**
		 * The meta object literal for the '<em><b>Detalles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__DETALLES = eINSTANCE.getRoot_Detalles();

		/**
		 * The meta object literal for the '{@link noorApps.impl.DetalleImpl <em>Detalle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noorApps.impl.DetalleImpl
		 * @see noorApps.impl.NoorAppsPackageImpl#getDetalle()
		 * @generated
		 */
		EClass DETALLE = eINSTANCE.getDetalle();

		/**
		 * The meta object literal for the '<em><b>Es Fuerte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE__ES_FUERTE = eINSTANCE.getDetalle_EsFuerte();

		/**
		 * The meta object literal for the '<em><b>Entidad</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETALLE__ENTIDAD = eINSTANCE.getDetalle_Entidad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETALLE__NAME = eINSTANCE.getDetalle_Name();

		/**
		 * The meta object literal for the '{@link noorApps.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see noorApps.TipoDato
		 * @see noorApps.impl.NoorAppsPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

	}

} //NoorAppsPackage
