/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.ParticipantOccurrence#getParticipantSource <em>Participant Source</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantOccurrence#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getParticipantOccurrence()
 * @model
 * @generated
 */
public interface ParticipantOccurrence extends EObject
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
   * @see #setParticipantSource(ParticipantId)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantOccurrence_ParticipantSource()
   * @model containment="true"
   * @generated
   */
  ParticipantId getParticipantSource();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantOccurrence#getParticipantSource <em>Participant Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Participant Source</em>' containment reference.
   * @see #getParticipantSource()
   * @generated
   */
  void setParticipantSource(ParticipantId value);

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' attribute.
   * @see #setCardinality(int)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantOccurrence_Cardinality()
   * @model
   * @generated
   */
  int getCardinality();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantOccurrence#getCardinality <em>Cardinality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' attribute.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(int value);

} // ParticipantOccurrence
