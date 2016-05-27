/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ptlide.xtext.ptl.PtlPackage
 * @generated
 */
public interface PtlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PtlFactory eINSTANCE = ptlide.xtext.ptl.impl.PtlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol</em>'.
   * @generated
   */
  Protocol createProtocol();

  /**
   * Returns a new object of class '<em>Transitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transitions</em>'.
   * @generated
   */
  Transitions createTransitions();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Transition Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Type</em>'.
   * @generated
   */
  TransitionType createTransitionType();

  /**
   * Returns a new object of class '<em>Timeout</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Timeout</em>'.
   * @generated
   */
  Timeout createTimeout();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Map From To</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map From To</em>'.
   * @generated
   */
  MapFromTo createMapFromTo();

  /**
   * Returns a new object of class '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger</em>'.
   * @generated
   */
  Trigger createTrigger();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content</em>'.
   * @generated
   */
  Content createContent();

  /**
   * Returns a new object of class '<em>Occurrence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Occurrence</em>'.
   * @generated
   */
  Occurrence createOccurrence();

  /**
   * Returns a new object of class '<em>Duty</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Duty</em>'.
   * @generated
   */
  Duty createDuty();

  /**
   * Returns a new object of class '<em>Duty Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Duty Type</em>'.
   * @generated
   */
  DutyType createDutyType();

  /**
   * Returns a new object of class '<em>Participant Occurrence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Occurrence</em>'.
   * @generated
   */
  ParticipantOccurrence createParticipantOccurrence();

  /**
   * Returns a new object of class '<em>States</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>States</em>'.
   * @generated
   */
  States createStates();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>State Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Id</em>'.
   * @generated
   */
  StateId createStateId();

  /**
   * Returns a new object of class '<em>State Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Type</em>'.
   * @generated
   */
  StateType createStateType();

  /**
   * Returns a new object of class '<em>Participants</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participants</em>'.
   * @generated
   */
  Participants createParticipants();

  /**
   * Returns a new object of class '<em>Participant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant</em>'.
   * @generated
   */
  Participant createParticipant();

  /**
   * Returns a new object of class '<em>Participant Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Id</em>'.
   * @generated
   */
  ParticipantId createParticipantId();

  /**
   * Returns a new object of class '<em>Participant Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Description</em>'.
   * @generated
   */
  ParticipantDescription createParticipantDescription();

  /**
   * Returns a new object of class '<em>Participant Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Cardinality</em>'.
   * @generated
   */
  ParticipantCardinality createParticipantCardinality();

  /**
   * Returns a new object of class '<em>Participant Cardinality Min Max</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Cardinality Min Max</em>'.
   * @generated
   */
  ParticipantCardinalityMinMax createParticipantCardinalityMinMax();

  /**
   * Returns a new object of class '<em>Participant Cardinality Min</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Cardinality Min</em>'.
   * @generated
   */
  ParticipantCardinalityMin createParticipantCardinalityMin();

  /**
   * Returns a new object of class '<em>Participant Cardinality Max</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Cardinality Max</em>'.
   * @generated
   */
  ParticipantCardinalityMax createParticipantCardinalityMax();

  /**
   * Returns a new object of class '<em>Participant Cardinality All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Participant Cardinality All</em>'.
   * @generated
   */
  ParticipantCardinalityAll createParticipantCardinalityAll();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  Role createRole();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Goals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goals</em>'.
   * @generated
   */
  Goals createGoals();

  /**
   * Returns a new object of class '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Goal</em>'.
   * @generated
   */
  Goal createGoal();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PtlPackage getPtlPackage();

} //PtlFactory
