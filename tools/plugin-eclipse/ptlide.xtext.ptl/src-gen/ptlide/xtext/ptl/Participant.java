/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.Participant#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Participant#getParticipantDescription <em>Participant Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(ParticipantId)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipant_Name()
   * @model containment="true"
   * @generated
   */
  ParticipantId getName();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Participant#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(ParticipantId value);

  /**
   * Returns the value of the '<em><b>Participant Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participant Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participant Description</em>' containment reference.
   * @see #setParticipantDescription(ParticipantDescription)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipant_ParticipantDescription()
   * @model containment="true"
   * @generated
   */
  ParticipantDescription getParticipantDescription();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Participant#getParticipantDescription <em>Participant Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Participant Description</em>' containment reference.
   * @see #getParticipantDescription()
   * @generated
   */
  void setParticipantDescription(ParticipantDescription value);

} // Participant
