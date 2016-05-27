/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.Occurrence#getParticipantSource <em>Participant Source</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Occurrence#getDuty <em>Duty</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Occurrence#getParticipantDestination <em>Participant Destination</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Occurrence#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getOccurrence()
 * @model
 * @generated
 */
public interface Occurrence extends EObject
{
  /**
   * Returns the value of the '<em><b>Participant Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participant Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participant Source</em>' containment reference.
   * @see #setParticipantSource(ParticipantOccurrence)
   * @see ptlide.xtext.ptl.PtlPackage#getOccurrence_ParticipantSource()
   * @model containment="true"
   * @generated
   */
  ParticipantOccurrence getParticipantSource();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Occurrence#getParticipantSource <em>Participant Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Participant Source</em>' containment reference.
   * @see #getParticipantSource()
   * @generated
   */
  void setParticipantSource(ParticipantOccurrence value);

  /**
   * Returns the value of the '<em><b>Duty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duty</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duty</em>' containment reference.
   * @see #setDuty(Duty)
   * @see ptlide.xtext.ptl.PtlPackage#getOccurrence_Duty()
   * @model containment="true"
   * @generated
   */
  Duty getDuty();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Occurrence#getDuty <em>Duty</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duty</em>' containment reference.
   * @see #getDuty()
   * @generated
   */
  void setDuty(Duty value);

  /**
   * Returns the value of the '<em><b>Participant Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participant Destination</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participant Destination</em>' containment reference.
   * @see #setParticipantDestination(ParticipantOccurrence)
   * @see ptlide.xtext.ptl.PtlPackage#getOccurrence_ParticipantDestination()
   * @model containment="true"
   * @generated
   */
  ParticipantOccurrence getParticipantDestination();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Occurrence#getParticipantDestination <em>Participant Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Participant Destination</em>' containment reference.
   * @see #getParticipantDestination()
   * @generated
   */
  void setParticipantDestination(ParticipantOccurrence value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
   * The list contents are of type {@link ptlide.xtext.ptl.Trigger}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference list.
   * @see ptlide.xtext.ptl.PtlPackage#getOccurrence_Trigger()
   * @model containment="true"
   * @generated
   */
  EList<Trigger> getTrigger();

} // Occurrence
