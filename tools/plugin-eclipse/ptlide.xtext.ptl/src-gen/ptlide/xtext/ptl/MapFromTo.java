/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map From To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.MapFromTo#getFrom <em>From</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.MapFromTo#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getMapFromTo()
 * @model
 * @generated
 */
public interface MapFromTo extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(ParticipantId)
   * @see ptlide.xtext.ptl.PtlPackage#getMapFromTo_From()
   * @model containment="true"
   * @generated
   */
  ParticipantId getFrom();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.MapFromTo#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(ParticipantId value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(ParticipantId)
   * @see ptlide.xtext.ptl.PtlPackage#getMapFromTo_To()
   * @model containment="true"
   * @generated
   */
  ParticipantId getTo();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.MapFromTo#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(ParticipantId value);

} // MapFromTo
