/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Cardinality Min Max</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinalityMinMax#getMin <em>Min</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinalityMinMax#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMinMax()
 * @model
 * @generated
 */
public interface ParticipantCardinalityMinMax extends EObject
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' containment reference.
   * @see #setMin(ParticipantCardinalityMin)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMinMax_Min()
   * @model containment="true"
   * @generated
   */
  ParticipantCardinalityMin getMin();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinalityMinMax#getMin <em>Min</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' containment reference.
   * @see #getMin()
   * @generated
   */
  void setMin(ParticipantCardinalityMin value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(ParticipantCardinalityMax)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinalityMinMax_Max()
   * @model containment="true"
   * @generated
   */
  ParticipantCardinalityMax getMax();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinalityMinMax#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(ParticipantCardinalityMax value);

} // ParticipantCardinalityMinMax
