/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.StateType#getInitial <em>Initial</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.StateType#getFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getStateType()
 * @model
 * @generated
 */
public interface StateType extends EObject
{
  /**
   * Returns the value of the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' attribute.
   * @see #setInitial(String)
   * @see ptlide.xtext.ptl.PtlPackage#getStateType_Initial()
   * @model
   * @generated
   */
  String getInitial();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.StateType#getInitial <em>Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' attribute.
   * @see #getInitial()
   * @generated
   */
  void setInitial(String value);

  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(String)
   * @see ptlide.xtext.ptl.PtlPackage#getStateType_Final()
   * @model
   * @generated
   */
  String getFinal();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.StateType#getFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #getFinal()
   * @generated
   */
  void setFinal(String value);

} // StateType
