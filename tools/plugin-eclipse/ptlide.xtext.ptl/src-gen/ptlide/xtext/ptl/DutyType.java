/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duty Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.DutyType#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.DutyType#getPerformative <em>Performative</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getDutyType()
 * @model
 * @generated
 */
public interface DutyType extends EObject
{
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
   * @see ptlide.xtext.ptl.PtlPackage#getDutyType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.DutyType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Performative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Performative</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Performative</em>' attribute.
   * @see #setPerformative(String)
   * @see ptlide.xtext.ptl.PtlPackage#getDutyType_Performative()
   * @model
   * @generated
   */
  String getPerformative();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.DutyType#getPerformative <em>Performative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Performative</em>' attribute.
   * @see #getPerformative()
   * @generated
   */
  void setPerformative(String value);

} // DutyType
