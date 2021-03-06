/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hr.fer.rasip.remes.gum.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.Literal#getText <em>Text</em>}</li>
 *   <li>{@link hr.fer.rasip.remes.gum.expressions.Literal#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Expression {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getLiteral_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.Literal#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see hr.fer.rasip.remes.gum.expressions.ExpressionsPackage#getLiteral_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link hr.fer.rasip.remes.gum.expressions.Literal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // Literal
