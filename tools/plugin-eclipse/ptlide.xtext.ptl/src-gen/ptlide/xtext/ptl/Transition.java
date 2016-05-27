/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.Transition#getSourceState <em>Source State</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Transition#getDestinationState <em>Destination State</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Transition#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Source State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source State</em>' containment reference.
   * @see #setSourceState(StateId)
   * @see ptlide.xtext.ptl.PtlPackage#getTransition_SourceState()
   * @model containment="true"
   * @generated
   */
  StateId getSourceState();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Transition#getSourceState <em>Source State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source State</em>' containment reference.
   * @see #getSourceState()
   * @generated
   */
  void setSourceState(StateId value);

  /**
   * Returns the value of the '<em><b>Destination State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination State</em>' containment reference.
   * @see #setDestinationState(StateId)
   * @see ptlide.xtext.ptl.PtlPackage#getTransition_DestinationState()
   * @model containment="true"
   * @generated
   */
  StateId getDestinationState();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Transition#getDestinationState <em>Destination State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination State</em>' containment reference.
   * @see #getDestinationState()
   * @generated
   */
  void setDestinationState(StateId value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TransitionType)
   * @see ptlide.xtext.ptl.PtlPackage#getTransition_Type()
   * @model containment="true"
   * @generated
   */
  TransitionType getType();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Transition#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TransitionType value);

} // Transition
