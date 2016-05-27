/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ptlide.xtext.ptl.Protocol#getName <em>Name</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Protocol#getDescription <em>Description</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Protocol#getGoals <em>Goals</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Protocol#getParticipants <em>Participants</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Protocol#getStates <em>States</em>}</li>
 *   <li>{@link ptlide.xtext.ptl.Protocol#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ptlide.xtext.ptl.PtlPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends EObject
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
   * @see ptlide.xtext.ptl.PtlPackage#getProtocol_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Protocol#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(Description)
   * @see ptlide.xtext.ptl.PtlPackage#getProtocol_Description()
   * @model containment="true"
   * @generated
   */
  Description getDescription();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Protocol#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(Description value);

  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goals</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference.
   * @see #setGoals(Goals)
   * @see ptlide.xtext.ptl.PtlPackage#getProtocol_Goals()
   * @model containment="true"
   * @generated
   */
  Goals getGoals();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Protocol#getGoals <em>Goals</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goals</em>' containment reference.
   * @see #getGoals()
   * @generated
   */
  void setGoals(Goals value);

  /**
   * Returns the value of the '<em><b>Participants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Participants</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Participants</em>' containment reference.
   * @see #setParticipants(Participants)
   * @see ptlide.xtext.ptl.PtlPackage#getProtocol_Participants()
   * @model containment="true"
   * @generated
   */
  Participants getParticipants();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Protocol#getParticipants <em>Participants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Participants</em>' containment reference.
   * @see #getParticipants()
   * @generated
   */
  void setParticipants(Participants value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference.
   * @see #setStates(States)
   * @see ptlide.xtext.ptl.PtlPackage#getProtocol_States()
   * @model containment="true"
   * @generated
   */
  States getStates();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Protocol#getStates <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>States</em>' containment reference.
   * @see #getStates()
   * @generated
   */
  void setStates(States value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference.
   * @see #setTransitions(Transitions)
   * @see ptlide.xtext.ptl.PtlPackage#getProtocol_Transitions()
   * @model containment="true"
   * @generated
   */
  Transitions getTransitions();

  /**
   * Sets the value of the '{@link ptlide.xtext.ptl.Protocol#getTransitions <em>Transitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transitions</em>' containment reference.
   * @see #getTransitions()
   * @generated
   */
  void setTransitions(Transitions value);

} // Protocol
