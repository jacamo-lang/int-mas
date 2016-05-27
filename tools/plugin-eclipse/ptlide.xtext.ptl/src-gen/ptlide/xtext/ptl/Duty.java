/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.Duty#getDutytype <em>Dutytype</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Duty#getDuty <em>Duty</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getDuty()
 * @model
 * @generated
 */
public interface Duty extends EObject
{
  /**
   * Returns the value of the '<em><b>Dutytype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dutytype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dutytype</em>' containment reference.
   * @see #setDutytype(DutyType)
   * @see ptlide.xtext.ptl.PtlPackage#getDuty_Dutytype()
   * @model containment="true"
   * @generated
   */
  DutyType getDutytype();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Duty#getDutytype <em>Dutytype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dutytype</em>' containment reference.
   * @see #getDutytype()
   * @generated
   */
  void setDutytype(DutyType value);

  /**
   * Returns the value of the '<em><b>Duty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duty</em>' attribute.
   * @see #setDuty(String)
   * @see ptlide.xtext.ptl.PtlPackage#getDuty_Duty()
   * @model
   * @generated
   */
  String getDuty();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Duty#getDuty <em>Duty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duty</em>' attribute.
   * @see #getDuty()
   * @generated
   */
  void setDuty(String value);

} // Duty
