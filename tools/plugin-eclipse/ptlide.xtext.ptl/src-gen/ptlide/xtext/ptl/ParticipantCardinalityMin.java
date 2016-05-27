/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Cardinality Min</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinalityMin#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinalityMin#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMin()
 * @model
 * @generated
 */
public interface ParticipantCardinalityMin extends EObject
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
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMin_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinalityMin#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMin_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinalityMin#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

} // ParticipantCardinalityMin
