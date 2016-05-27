/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.ParticipantDescription#getKind <em>Kind</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantDescription#getRole <em>Role</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantDescription#getType <em>Type</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.ParticipantDescription#getCard <em>Card</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getParticipantDescription()
 * @model
 * @generated
 */
public interface ParticipantDescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see #setKind(String)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantDescription_Kind()
   * @model
   * @generated
   */
  String getKind();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantDescription#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see #getKind()
   * @generated
   */
  void setKind(String value);

  /**
   * Returns the value of the '<em><b>Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' containment reference.
   * @see #setRole(Role)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantDescription_Role()
   * @model containment="true"
   * @generated
   */
  Role getRole();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantDescription#getRole <em>Role</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' containment reference.
   * @see #getRole()
   * @generated
   */
  void setRole(Role value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantDescription_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantDescription#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Card</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Card</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Card</em>' containment reference.
   * @see #setCard(ParticipantCardinality)
   * @see ptlide.xtext.ptl.PtlPackage#getParticipantDescription_Card()
   * @model containment="true"
   * @generated
   */
  ParticipantCardinality getCard();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.ParticipantDescription#getCard <em>Card</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card</em>' containment reference.
   * @see #getCard()
   * @generated
   */
  void setCard(ParticipantCardinality value);

} // ParticipantDescription
