/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinality#getCardAll <em>Card All</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantCardinality#getCardMinMax <em>Card Min Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinality()
 * @model
 * @generated
 */
public interface ParticipantCardinality extends EObject
{
  /**
   * Returns the value of the '<em><b>Card All</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Card All</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Card All</em>' containment reference.
   * @see #setCardAll(ParticipantCardinalityAll)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinality_CardAll()
   * @model containment="true"
   * @generated
   */
  ParticipantCardinalityAll getCardAll();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinality#getCardAll <em>Card All</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card All</em>' containment reference.
   * @see #getCardAll()
   * @generated
   */
  void setCardAll(ParticipantCardinalityAll value);

  /**
   * Returns the value of the '<em><b>Card Min Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Card Min Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Card Min Max</em>' containment reference.
   * @see #setCardMinMax(ParticipantCardinalityMinMax)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantCardinality_CardMinMax()
   * @model containment="true"
   * @generated
   */
  ParticipantCardinalityMinMax getCardMinMax();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantCardinality#getCardMinMax <em>Card Min Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card Min Max</em>' containment reference.
   * @see #getCardMinMax()
   * @generated
   */
  void setCardMinMax(ParticipantCardinalityMinMax value);

} // ParticipantCardinality
