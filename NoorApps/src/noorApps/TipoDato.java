/**
 */
package noorApps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Dato</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see noorApps.NoorAppsPackage#getTipoDato()
 * @model
 * @generated
 */
public enum TipoDato implements Enumerator {
	/**
	 * The '<em><b>Boleano</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLEANO_VALUE
	 * @generated
	 * @ordered
	 */
	BOLEANO(0, "boleano", "boleano"),

	/**
	 * The '<em><b>Cadena</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CADENA_VALUE
	 * @generated
	 * @ordered
	 */
	CADENA(1, "cadena", "cadena"),

	/**
	 * The '<em><b>Numero</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERO_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERO(2, "numero", "numero"),

	/**
	 * The '<em><b>Fecha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FECHA_VALUE
	 * @generated
	 * @ordered
	 */
	FECHA(3, "fecha", "fecha");

	/**
	 * The '<em><b>Boleano</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boleano</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOLEANO
	 * @model name="boleano"
	 * @generated
	 * @ordered
	 */
	public static final int BOLEANO_VALUE = 0;

	/**
	 * The '<em><b>Cadena</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cadena</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CADENA
	 * @model name="cadena"
	 * @generated
	 * @ordered
	 */
	public static final int CADENA_VALUE = 1;

	/**
	 * The '<em><b>Numero</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numero</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERO
	 * @model name="numero"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERO_VALUE = 2;

	/**
	 * The '<em><b>Fecha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fecha</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FECHA
	 * @model name="fecha"
	 * @generated
	 * @ordered
	 */
	public static final int FECHA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tipo Dato</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoDato[] VALUES_ARRAY =
		new TipoDato[] {
			BOLEANO,
			CADENA,
			NUMERO,
			FECHA,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Dato</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoDato> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDato get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDato result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDato getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoDato result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Dato</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoDato get(int value) {
		switch (value) {
			case BOLEANO_VALUE: return BOLEANO;
			case CADENA_VALUE: return CADENA;
			case NUMERO_VALUE: return NUMERO;
			case FECHA_VALUE: return FECHA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoDato(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TipoDato
