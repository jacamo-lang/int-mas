/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ptlide.xtext.ptl.PtlFactory
 * @model kind="package"
 * @generated
 */
public interface PtlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ptl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.ptlide/Ptl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ptl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PtlPackage eINSTANCE = ptlide.xtext.ptl.impl.PtlPackageImpl.init();

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ProtocolImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__GOALS = 2;

  /**
   * The feature id for the '<em><b>Participants</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__PARTICIPANTS = 3;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__STATES = 4;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__TRANSITIONS = 5;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.TransitionsImpl <em>Transitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.TransitionsImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTransitions()
   * @generated
   */
  int TRANSITIONS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS__NAME = 0;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS__TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>Transitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.TransitionImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 2;

  /**
   * The feature id for the '<em><b>Source State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE_STATE = 0;

  /**
   * The feature id for the '<em><b>Destination State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__DESTINATION_STATE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TYPE = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.TransitionTypeImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTransitionType()
   * @generated
   */
  int TRANSITION_TYPE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Transition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.TimeoutImpl <em>Timeout</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.TimeoutImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTimeout()
   * @generated
   */
  int TIMEOUT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOUT__NAME = 0;

  /**
   * The feature id for the '<em><b>Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOUT__TIMEOUT = 1;

  /**
   * The number of structural features of the '<em>Timeout</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMEOUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ImportImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 0;

  /**
   * The feature id for the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__FILE = 1;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__MAPPING = 2;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.MappingImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Maps</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__MAPS = 1;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.MapFromToImpl <em>Map From To</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.MapFromToImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getMapFromTo()
   * @generated
   */
  int MAP_FROM_TO = 7;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FROM_TO__FROM = 0;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FROM_TO__TO = 1;

  /**
   * The number of structural features of the '<em>Map From To</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_FROM_TO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.TriggerImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 8;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__PATTERN = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__CONTENT = 1;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.PatternImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__NAME = 0;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__PATTERN = 1;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ContentImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 10;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.OccurrenceImpl <em>Occurrence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.OccurrenceImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getOccurrence()
   * @generated
   */
  int OCCURRENCE = 11;

  /**
   * The feature id for the '<em><b>Participant Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCURRENCE__PARTICIPANT_SOURCE = 0;

  /**
   * The feature id for the '<em><b>Duty</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCURRENCE__DUTY = 1;

  /**
   * The feature id for the '<em><b>Participant Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCURRENCE__PARTICIPANT_DESTINATION = 2;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCURRENCE__TRIGGER = 3;

  /**
   * The number of structural features of the '<em>Occurrence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCCURRENCE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.DutyImpl <em>Duty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.DutyImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getDuty()
   * @generated
   */
  int DUTY = 12;

  /**
   * The feature id for the '<em><b>Dutytype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY__DUTYTYPE = 0;

  /**
   * The feature id for the '<em><b>Duty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY__DUTY = 1;

  /**
   * The number of structural features of the '<em>Duty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.DutyTypeImpl <em>Duty Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.DutyTypeImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getDutyType()
   * @generated
   */
  int DUTY_TYPE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Performative</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_TYPE__PERFORMATIVE = 1;

  /**
   * The number of structural features of the '<em>Duty Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUTY_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantOccurrenceImpl <em>Participant Occurrence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantOccurrenceImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantOccurrence()
   * @generated
   */
  int PARTICIPANT_OCCURRENCE = 14;

  /**
   * The feature id for the '<em><b>Participant Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE = 0;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_OCCURRENCE__CARDINALITY = 1;

  /**
   * The number of structural features of the '<em>Participant Occurrence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_OCCURRENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.StatesImpl <em>States</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.StatesImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getStates()
   * @generated
   */
  int STATES = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__NAME = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__STATES = 1;

  /**
   * The number of structural features of the '<em>States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.StateImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getState()
   * @generated
   */
  int STATE = 16;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ID = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TYPE = 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.StateIdImpl <em>State Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.StateIdImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getStateId()
   * @generated
   */
  int STATE_ID = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>State Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.StateTypeImpl <em>State Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.StateTypeImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 18;

  /**
   * The feature id for the '<em><b>Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE__INITIAL = 0;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE__FINAL = 1;

  /**
   * The number of structural features of the '<em>State Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantsImpl <em>Participants</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantsImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipants()
   * @generated
   */
  int PARTICIPANTS = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANTS__NAME = 0;

  /**
   * The feature id for the '<em><b>Participants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANTS__PARTICIPANTS = 1;

  /**
   * The number of structural features of the '<em>Participants</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANTS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantImpl <em>Participant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipant()
   * @generated
   */
  int PARTICIPANT = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__NAME = 0;

  /**
   * The feature id for the '<em><b>Participant Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__PARTICIPANT_DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Participant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantIdImpl <em>Participant Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantIdImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantId()
   * @generated
   */
  int PARTICIPANT_ID = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>Participant Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantDescriptionImpl <em>Participant Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantDescriptionImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantDescription()
   * @generated
   */
  int PARTICIPANT_DESCRIPTION = 22;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_DESCRIPTION__KIND = 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_DESCRIPTION__ROLE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_DESCRIPTION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Card</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_DESCRIPTION__CARD = 3;

  /**
   * The number of structural features of the '<em>Participant Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_DESCRIPTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityImpl <em>Participant Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantCardinalityImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinality()
   * @generated
   */
  int PARTICIPANT_CARDINALITY = 23;

  /**
   * The feature id for the '<em><b>Card All</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY__CARD_ALL = 0;

  /**
   * The feature id for the '<em><b>Card Min Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY__CARD_MIN_MAX = 1;

  /**
   * The number of structural features of the '<em>Participant Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMinMaxImpl <em>Participant Cardinality Min Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantCardinalityMinMaxImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinalityMinMax()
   * @generated
   */
  int PARTICIPANT_CARDINALITY_MIN_MAX = 24;

  /**
   * The feature id for the '<em><b>Min</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MIN_MAX__MIN = 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MIN_MAX__MAX = 1;

  /**
   * The number of structural features of the '<em>Participant Cardinality Min Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MIN_MAX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMinImpl <em>Participant Cardinality Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantCardinalityMinImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinalityMin()
   * @generated
   */
  int PARTICIPANT_CARDINALITY_MIN = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MIN__NAME = 0;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MIN__MIN = 1;

  /**
   * The number of structural features of the '<em>Participant Cardinality Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMaxImpl <em>Participant Cardinality Max</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantCardinalityMaxImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinalityMax()
   * @generated
   */
  int PARTICIPANT_CARDINALITY_MAX = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MAX__NAME = 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MAX__MAX = 1;

  /**
   * The feature id for the '<em><b>Max2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MAX__MAX2 = 2;

  /**
   * The number of structural features of the '<em>Participant Cardinality Max</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_MAX_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityAllImpl <em>Participant Cardinality All</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.ParticipantCardinalityAllImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinalityAll()
   * @generated
   */
  int PARTICIPANT_CARDINALITY_ALL = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_ALL__NAME = 0;

  /**
   * The number of structural features of the '<em>Participant Cardinality All</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_CARDINALITY_ALL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.TypeImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getType()
   * @generated
   */
  int TYPE = 28;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.RoleImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getRole()
   * @generated
   */
  int ROLE = 29;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__ROLE = 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.DescriptionImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.GoalsImpl <em>Goals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.GoalsImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getGoals()
   * @generated
   */
  int GOALS = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__NAME = 0;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__GOALS = 1;

  /**
   * The number of structural features of the '<em>Goals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link ptlide.xtext.ptl.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ptlide.xtext.ptl.impl.GoalImpl
   * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 32;

  /**
   * The feature id for the '<em><b>Goal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__GOAL = 0;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see ptlide.xtext.ptl.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Protocol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Protocol#getName()
   * @see #getProtocol()
   * @generated
   */
  EAttribute getProtocol_Name();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Protocol#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see ptlide.xtext.ptl.Protocol#getDescription()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Description();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Protocol#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Goals</em>'.
   * @see ptlide.xtext.ptl.Protocol#getGoals()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Goals();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Protocol#getParticipants <em>Participants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Participants</em>'.
   * @see ptlide.xtext.ptl.Protocol#getParticipants()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Participants();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Protocol#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>States</em>'.
   * @see ptlide.xtext.ptl.Protocol#getStates()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_States();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Protocol#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transitions</em>'.
   * @see ptlide.xtext.ptl.Protocol#getTransitions()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Transitions();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Transitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transitions</em>'.
   * @see ptlide.xtext.ptl.Transitions
   * @generated
   */
  EClass getTransitions();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Transitions#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Transitions#getName()
   * @see #getTransitions()
   * @generated
   */
  EAttribute getTransitions_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ptlide.xtext.ptl.Transitions#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see ptlide.xtext.ptl.Transitions#getTransitions()
   * @see #getTransitions()
   * @generated
   */
  EReference getTransitions_Transitions();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see ptlide.xtext.ptl.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Transition#getSourceState <em>Source State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source State</em>'.
   * @see ptlide.xtext.ptl.Transition#getSourceState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_SourceState();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Transition#getDestinationState <em>Destination State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination State</em>'.
   * @see ptlide.xtext.ptl.Transition#getDestinationState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_DestinationState();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Transition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ptlide.xtext.ptl.Transition#getType()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Type();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Type</em>'.
   * @see ptlide.xtext.ptl.TransitionType
   * @generated
   */
  EClass getTransitionType();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.TransitionType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ptlide.xtext.ptl.TransitionType#getType()
   * @see #getTransitionType()
   * @generated
   */
  EReference getTransitionType_Type();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Timeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Timeout</em>'.
   * @see ptlide.xtext.ptl.Timeout
   * @generated
   */
  EClass getTimeout();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Timeout#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Timeout#getName()
   * @see #getTimeout()
   * @generated
   */
  EAttribute getTimeout_Name();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Timeout#getTimeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Timeout</em>'.
   * @see ptlide.xtext.ptl.Timeout#getTimeout()
   * @see #getTimeout()
   * @generated
   */
  EAttribute getTimeout_Timeout();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see ptlide.xtext.ptl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Import#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see ptlide.xtext.ptl.Import#getFile()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_File();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Import#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see ptlide.xtext.ptl.Import#getMapping()
   * @see #getImport()
   * @generated
   */
  EReference getImport_Mapping();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see ptlide.xtext.ptl.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Mapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Mapping#getName()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ptlide.xtext.ptl.Mapping#getMaps <em>Maps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Maps</em>'.
   * @see ptlide.xtext.ptl.Mapping#getMaps()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Maps();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.MapFromTo <em>Map From To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map From To</em>'.
   * @see ptlide.xtext.ptl.MapFromTo
   * @generated
   */
  EClass getMapFromTo();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.MapFromTo#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see ptlide.xtext.ptl.MapFromTo#getFrom()
   * @see #getMapFromTo()
   * @generated
   */
  EReference getMapFromTo_From();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.MapFromTo#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see ptlide.xtext.ptl.MapFromTo#getTo()
   * @see #getMapFromTo()
   * @generated
   */
  EReference getMapFromTo_To();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see ptlide.xtext.ptl.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Trigger#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see ptlide.xtext.ptl.Trigger#getPattern()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Pattern();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Trigger#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see ptlide.xtext.ptl.Trigger#getContent()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Content();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see ptlide.xtext.ptl.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Pattern#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Pattern#getName()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Name();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Pattern#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pattern</em>'.
   * @see ptlide.xtext.ptl.Pattern#getPattern()
   * @see #getPattern()
   * @generated
   */
  EAttribute getPattern_Pattern();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see ptlide.xtext.ptl.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Content#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see ptlide.xtext.ptl.Content#getContent()
   * @see #getContent()
   * @generated
   */
  EAttribute getContent_Content();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Occurrence <em>Occurrence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Occurrence</em>'.
   * @see ptlide.xtext.ptl.Occurrence
   * @generated
   */
  EClass getOccurrence();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Occurrence#getParticipantSource <em>Participant Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Participant Source</em>'.
   * @see ptlide.xtext.ptl.Occurrence#getParticipantSource()
   * @see #getOccurrence()
   * @generated
   */
  EReference getOccurrence_ParticipantSource();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Occurrence#getDuty <em>Duty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Duty</em>'.
   * @see ptlide.xtext.ptl.Occurrence#getDuty()
   * @see #getOccurrence()
   * @generated
   */
  EReference getOccurrence_Duty();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Occurrence#getParticipantDestination <em>Participant Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Participant Destination</em>'.
   * @see ptlide.xtext.ptl.Occurrence#getParticipantDestination()
   * @see #getOccurrence()
   * @generated
   */
  EReference getOccurrence_ParticipantDestination();

  /**
   * Returns the meta object for the containment reference list '{@link ptlide.xtext.ptl.Occurrence#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Trigger</em>'.
   * @see ptlide.xtext.ptl.Occurrence#getTrigger()
   * @see #getOccurrence()
   * @generated
   */
  EReference getOccurrence_Trigger();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Duty <em>Duty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duty</em>'.
   * @see ptlide.xtext.ptl.Duty
   * @generated
   */
  EClass getDuty();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Duty#getDutytype <em>Dutytype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dutytype</em>'.
   * @see ptlide.xtext.ptl.Duty#getDutytype()
   * @see #getDuty()
   * @generated
   */
  EReference getDuty_Dutytype();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Duty#getDuty <em>Duty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duty</em>'.
   * @see ptlide.xtext.ptl.Duty#getDuty()
   * @see #getDuty()
   * @generated
   */
  EAttribute getDuty_Duty();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.DutyType <em>Duty Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Duty Type</em>'.
   * @see ptlide.xtext.ptl.DutyType
   * @generated
   */
  EClass getDutyType();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.DutyType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.DutyType#getName()
   * @see #getDutyType()
   * @generated
   */
  EAttribute getDutyType_Name();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.DutyType#getPerformative <em>Performative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Performative</em>'.
   * @see ptlide.xtext.ptl.DutyType#getPerformative()
   * @see #getDutyType()
   * @generated
   */
  EAttribute getDutyType_Performative();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.ParticipantOccurrence <em>Participant Occurrence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant Occurrence</em>'.
   * @see ptlide.xtext.ptl.ParticipantOccurrence
   * @generated
   */
  EClass getParticipantOccurrence();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.ParticipantOccurrence#getParticipantSource <em>Participant Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Participant Source</em>'.
   * @see ptlide.xtext.ptl.ParticipantOccurrence#getParticipantSource()
   * @see #getParticipantOccurrence()
   * @generated
   */
  EReference getParticipantOccurrence_ParticipantSource();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantOccurrence#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see ptlide.xtext.ptl.ParticipantOccurrence#getCardinality()
   * @see #getParticipantOccurrence()
   * @generated
   */
  EAttribute getParticipantOccurrence_Cardinality();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States</em>'.
   * @see ptlide.xtext.ptl.States
   * @generated
   */
  EClass getStates();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.States#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.States#getName()
   * @see #getStates()
   * @generated
   */
  EAttribute getStates_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ptlide.xtext.ptl.States#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see ptlide.xtext.ptl.States#getStates()
   * @see #getStates()
   * @generated
   */
  EReference getStates_States();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see ptlide.xtext.ptl.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.State#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see ptlide.xtext.ptl.State#getId()
   * @see #getState()
   * @generated
   */
  EReference getState_Id();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.State#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ptlide.xtext.ptl.State#getType()
   * @see #getState()
   * @generated
   */
  EReference getState_Type();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.StateId <em>State Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Id</em>'.
   * @see ptlide.xtext.ptl.StateId
   * @generated
   */
  EClass getStateId();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.StateId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.StateId#getName()
   * @see #getStateId()
   * @generated
   */
  EAttribute getStateId_Name();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Type</em>'.
   * @see ptlide.xtext.ptl.StateType
   * @generated
   */
  EClass getStateType();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.StateType#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial</em>'.
   * @see ptlide.xtext.ptl.StateType#getInitial()
   * @see #getStateType()
   * @generated
   */
  EAttribute getStateType_Initial();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.StateType#getFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see ptlide.xtext.ptl.StateType#getFinal()
   * @see #getStateType()
   * @generated
   */
  EAttribute getStateType_Final();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Participants <em>Participants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participants</em>'.
   * @see ptlide.xtext.ptl.Participants
   * @generated
   */
  EClass getParticipants();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Participants#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Participants#getName()
   * @see #getParticipants()
   * @generated
   */
  EAttribute getParticipants_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ptlide.xtext.ptl.Participants#getParticipants <em>Participants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Participants</em>'.
   * @see ptlide.xtext.ptl.Participants#getParticipants()
   * @see #getParticipants()
   * @generated
   */
  EReference getParticipants_Participants();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant</em>'.
   * @see ptlide.xtext.ptl.Participant
   * @generated
   */
  EClass getParticipant();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Participant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Participant#getName()
   * @see #getParticipant()
   * @generated
   */
  EReference getParticipant_Name();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.Participant#getParticipantDescription <em>Participant Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Participant Description</em>'.
   * @see ptlide.xtext.ptl.Participant#getParticipantDescription()
   * @see #getParticipant()
   * @generated
   */
  EReference getParticipant_ParticipantDescription();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.ParticipantId <em>Participant Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant Id</em>'.
   * @see ptlide.xtext.ptl.ParticipantId
   * @generated
   */
  EClass getParticipantId();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.ParticipantId#getName()
   * @see #getParticipantId()
   * @generated
   */
  EAttribute getParticipantId_Name();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.ParticipantDescription <em>Participant Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant Description</em>'.
   * @see ptlide.xtext.ptl.ParticipantDescription
   * @generated
   */
  EClass getParticipantDescription();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantDescription#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see ptlide.xtext.ptl.ParticipantDescription#getKind()
   * @see #getParticipantDescription()
   * @generated
   */
  EAttribute getParticipantDescription_Kind();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.ParticipantDescription#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Role</em>'.
   * @see ptlide.xtext.ptl.ParticipantDescription#getRole()
   * @see #getParticipantDescription()
   * @generated
   */
  EReference getParticipantDescription_Role();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.ParticipantDescription#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see ptlide.xtext.ptl.ParticipantDescription#getType()
   * @see #getParticipantDescription()
   * @generated
   */
  EReference getParticipantDescription_Type();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.ParticipantDescription#getCard <em>Card</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Card</em>'.
   * @see ptlide.xtext.ptl.ParticipantDescription#getCard()
   * @see #getParticipantDescription()
   * @generated
   */
  EReference getParticipantDescription_Card();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.ParticipantCardinality <em>Participant Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant Cardinality</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinality
   * @generated
   */
  EClass getParticipantCardinality();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.ParticipantCardinality#getCardAll <em>Card All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Card All</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinality#getCardAll()
   * @see #getParticipantCardinality()
   * @generated
   */
  EReference getParticipantCardinality_CardAll();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.ParticipantCardinality#getCardMinMax <em>Card Min Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Card Min Max</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinality#getCardMinMax()
   * @see #getParticipantCardinality()
   * @generated
   */
  EReference getParticipantCardinality_CardMinMax();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.ParticipantCardinalityMinMax <em>Participant Cardinality Min Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant Cardinality Min Max</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMinMax
   * @generated
   */
  EClass getParticipantCardinalityMinMax();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.ParticipantCardinalityMinMax#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMinMax#getMin()
   * @see #getParticipantCardinalityMinMax()
   * @generated
   */
  EReference getParticipantCardinalityMinMax_Min();

  /**
   * Returns the meta object for the containment reference '{@link ptlide.xtext.ptl.ParticipantCardinalityMinMax#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMinMax#getMax()
   * @see #getParticipantCardinalityMinMax()
   * @generated
   */
  EReference getParticipantCardinalityMinMax_Max();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.ParticipantCardinalityMin <em>Participant Cardinality Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant Cardinality Min</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMin
   * @generated
   */
  EClass getParticipantCardinalityMin();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantCardinalityMin#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMin#getName()
   * @see #getParticipantCardinalityMin()
   * @generated
   */
  EAttribute getParticipantCardinalityMin_Name();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantCardinalityMin#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMin#getMin()
   * @see #getParticipantCardinalityMin()
   * @generated
   */
  EAttribute getParticipantCardinalityMin_Min();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.ParticipantCardinalityMax <em>Participant Cardinality Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant Cardinality Max</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMax
   * @generated
   */
  EClass getParticipantCardinalityMax();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMax#getName()
   * @see #getParticipantCardinalityMax()
   * @generated
   */
  EAttribute getParticipantCardinalityMax_Name();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMax#getMax()
   * @see #getParticipantCardinalityMax()
   * @generated
   */
  EAttribute getParticipantCardinalityMax_Max();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantCardinalityMax#getMax2 <em>Max2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max2</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMax#getMax2()
   * @see #getParticipantCardinalityMax()
   * @generated
   */
  EAttribute getParticipantCardinalityMax_Max2();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.ParticipantCardinalityAll <em>Participant Cardinality All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant Cardinality All</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityAll
   * @generated
   */
  EClass getParticipantCardinalityAll();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.ParticipantCardinalityAll#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.ParticipantCardinalityAll#getName()
   * @see #getParticipantCardinalityAll()
   * @generated
   */
  EAttribute getParticipantCardinalityAll_Name();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see ptlide.xtext.ptl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Type#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see ptlide.xtext.ptl.Type#getType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Type();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see ptlide.xtext.ptl.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Role#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see ptlide.xtext.ptl.Role#getRole()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Role();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see ptlide.xtext.ptl.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Description#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Description#getName()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Name();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Description#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see ptlide.xtext.ptl.Description#getDescription()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Description();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Goals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goals</em>'.
   * @see ptlide.xtext.ptl.Goals
   * @generated
   */
  EClass getGoals();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Goals#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ptlide.xtext.ptl.Goals#getName()
   * @see #getGoals()
   * @generated
   */
  EAttribute getGoals_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ptlide.xtext.ptl.Goals#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see ptlide.xtext.ptl.Goals#getGoals()
   * @see #getGoals()
   * @generated
   */
  EReference getGoals_Goals();

  /**
   * Returns the meta object for class '{@link ptlide.xtext.ptl.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see ptlide.xtext.ptl.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the attribute '{@link ptlide.xtext.ptl.Goal#getGoal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Goal</em>'.
   * @see ptlide.xtext.ptl.Goal#getGoal()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Goal();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PtlFactory getPtlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ProtocolImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__DESCRIPTION = eINSTANCE.getProtocol_Description();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__GOALS = eINSTANCE.getProtocol_Goals();

    /**
     * The meta object literal for the '<em><b>Participants</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__PARTICIPANTS = eINSTANCE.getProtocol_Participants();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__STATES = eINSTANCE.getProtocol_States();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__TRANSITIONS = eINSTANCE.getProtocol_Transitions();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.TransitionsImpl <em>Transitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.TransitionsImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTransitions()
     * @generated
     */
    EClass TRANSITIONS = eINSTANCE.getTransitions();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITIONS__NAME = eINSTANCE.getTransitions_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITIONS__TRANSITIONS = eINSTANCE.getTransitions_Transitions();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.TransitionImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Source State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE_STATE = eINSTANCE.getTransition_SourceState();

    /**
     * The meta object literal for the '<em><b>Destination State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__DESTINATION_STATE = eINSTANCE.getTransition_DestinationState();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TYPE = eINSTANCE.getTransition_Type();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.TransitionTypeImpl <em>Transition Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.TransitionTypeImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTransitionType()
     * @generated
     */
    EClass TRANSITION_TYPE = eINSTANCE.getTransitionType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_TYPE__TYPE = eINSTANCE.getTransitionType_Type();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.TimeoutImpl <em>Timeout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.TimeoutImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTimeout()
     * @generated
     */
    EClass TIMEOUT = eINSTANCE.getTimeout();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMEOUT__NAME = eINSTANCE.getTimeout_Name();

    /**
     * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TIMEOUT__TIMEOUT = eINSTANCE.getTimeout_Timeout();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ImportImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

    /**
     * The meta object literal for the '<em><b>File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__FILE = eINSTANCE.getImport_File();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__MAPPING = eINSTANCE.getImport_Mapping();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.MappingImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__NAME = eINSTANCE.getMapping_Name();

    /**
     * The meta object literal for the '<em><b>Maps</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__MAPS = eINSTANCE.getMapping_Maps();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.MapFromToImpl <em>Map From To</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.MapFromToImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getMapFromTo()
     * @generated
     */
    EClass MAP_FROM_TO = eINSTANCE.getMapFromTo();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_FROM_TO__FROM = eINSTANCE.getMapFromTo_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_FROM_TO__TO = eINSTANCE.getMapFromTo_To();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.TriggerImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__PATTERN = eINSTANCE.getTrigger_Pattern();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__CONTENT = eINSTANCE.getTrigger_Content();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.PatternImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATTERN__PATTERN = eINSTANCE.getPattern_Pattern();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ContentImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT__CONTENT = eINSTANCE.getContent_Content();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.OccurrenceImpl <em>Occurrence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.OccurrenceImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getOccurrence()
     * @generated
     */
    EClass OCCURRENCE = eINSTANCE.getOccurrence();

    /**
     * The meta object literal for the '<em><b>Participant Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCCURRENCE__PARTICIPANT_SOURCE = eINSTANCE.getOccurrence_ParticipantSource();

    /**
     * The meta object literal for the '<em><b>Duty</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCCURRENCE__DUTY = eINSTANCE.getOccurrence_Duty();

    /**
     * The meta object literal for the '<em><b>Participant Destination</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCCURRENCE__PARTICIPANT_DESTINATION = eINSTANCE.getOccurrence_ParticipantDestination();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OCCURRENCE__TRIGGER = eINSTANCE.getOccurrence_Trigger();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.DutyImpl <em>Duty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.DutyImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getDuty()
     * @generated
     */
    EClass DUTY = eINSTANCE.getDuty();

    /**
     * The meta object literal for the '<em><b>Dutytype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUTY__DUTYTYPE = eINSTANCE.getDuty_Dutytype();

    /**
     * The meta object literal for the '<em><b>Duty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUTY__DUTY = eINSTANCE.getDuty_Duty();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.DutyTypeImpl <em>Duty Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.DutyTypeImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getDutyType()
     * @generated
     */
    EClass DUTY_TYPE = eINSTANCE.getDutyType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUTY_TYPE__NAME = eINSTANCE.getDutyType_Name();

    /**
     * The meta object literal for the '<em><b>Performative</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DUTY_TYPE__PERFORMATIVE = eINSTANCE.getDutyType_Performative();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantOccurrenceImpl <em>Participant Occurrence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantOccurrenceImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantOccurrence()
     * @generated
     */
    EClass PARTICIPANT_OCCURRENCE = eINSTANCE.getParticipantOccurrence();

    /**
     * The meta object literal for the '<em><b>Participant Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT_OCCURRENCE__PARTICIPANT_SOURCE = eINSTANCE.getParticipantOccurrence_ParticipantSource();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_OCCURRENCE__CARDINALITY = eINSTANCE.getParticipantOccurrence_Cardinality();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.StatesImpl <em>States</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.StatesImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getStates()
     * @generated
     */
    EClass STATES = eINSTANCE.getStates();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATES__NAME = eINSTANCE.getStates_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__STATES = eINSTANCE.getStates_States();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.StateImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ID = eINSTANCE.getState_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TYPE = eINSTANCE.getState_Type();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.StateIdImpl <em>State Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.StateIdImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getStateId()
     * @generated
     */
    EClass STATE_ID = eINSTANCE.getStateId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_ID__NAME = eINSTANCE.getStateId_Name();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.StateTypeImpl <em>State Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.StateTypeImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getStateType()
     * @generated
     */
    EClass STATE_TYPE = eINSTANCE.getStateType();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_TYPE__INITIAL = eINSTANCE.getStateType_Initial();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_TYPE__FINAL = eINSTANCE.getStateType_Final();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantsImpl <em>Participants</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantsImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipants()
     * @generated
     */
    EClass PARTICIPANTS = eINSTANCE.getParticipants();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANTS__NAME = eINSTANCE.getParticipants_Name();

    /**
     * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANTS__PARTICIPANTS = eINSTANCE.getParticipants_Participants();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantImpl <em>Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipant()
     * @generated
     */
    EClass PARTICIPANT = eINSTANCE.getParticipant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

    /**
     * The meta object literal for the '<em><b>Participant Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT__PARTICIPANT_DESCRIPTION = eINSTANCE.getParticipant_ParticipantDescription();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantIdImpl <em>Participant Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantIdImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantId()
     * @generated
     */
    EClass PARTICIPANT_ID = eINSTANCE.getParticipantId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_ID__NAME = eINSTANCE.getParticipantId_Name();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantDescriptionImpl <em>Participant Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantDescriptionImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantDescription()
     * @generated
     */
    EClass PARTICIPANT_DESCRIPTION = eINSTANCE.getParticipantDescription();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_DESCRIPTION__KIND = eINSTANCE.getParticipantDescription_Kind();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT_DESCRIPTION__ROLE = eINSTANCE.getParticipantDescription_Role();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT_DESCRIPTION__TYPE = eINSTANCE.getParticipantDescription_Type();

    /**
     * The meta object literal for the '<em><b>Card</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT_DESCRIPTION__CARD = eINSTANCE.getParticipantDescription_Card();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityImpl <em>Participant Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantCardinalityImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinality()
     * @generated
     */
    EClass PARTICIPANT_CARDINALITY = eINSTANCE.getParticipantCardinality();

    /**
     * The meta object literal for the '<em><b>Card All</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT_CARDINALITY__CARD_ALL = eINSTANCE.getParticipantCardinality_CardAll();

    /**
     * The meta object literal for the '<em><b>Card Min Max</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT_CARDINALITY__CARD_MIN_MAX = eINSTANCE.getParticipantCardinality_CardMinMax();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMinMaxImpl <em>Participant Cardinality Min Max</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantCardinalityMinMaxImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinalityMinMax()
     * @generated
     */
    EClass PARTICIPANT_CARDINALITY_MIN_MAX = eINSTANCE.getParticipantCardinalityMinMax();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT_CARDINALITY_MIN_MAX__MIN = eINSTANCE.getParticipantCardinalityMinMax_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT_CARDINALITY_MIN_MAX__MAX = eINSTANCE.getParticipantCardinalityMinMax_Max();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMinImpl <em>Participant Cardinality Min</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantCardinalityMinImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinalityMin()
     * @generated
     */
    EClass PARTICIPANT_CARDINALITY_MIN = eINSTANCE.getParticipantCardinalityMin();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_CARDINALITY_MIN__NAME = eINSTANCE.getParticipantCardinalityMin_Name();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_CARDINALITY_MIN__MIN = eINSTANCE.getParticipantCardinalityMin_Min();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityMaxImpl <em>Participant Cardinality Max</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantCardinalityMaxImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinalityMax()
     * @generated
     */
    EClass PARTICIPANT_CARDINALITY_MAX = eINSTANCE.getParticipantCardinalityMax();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_CARDINALITY_MAX__NAME = eINSTANCE.getParticipantCardinalityMax_Name();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_CARDINALITY_MAX__MAX = eINSTANCE.getParticipantCardinalityMax_Max();

    /**
     * The meta object literal for the '<em><b>Max2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_CARDINALITY_MAX__MAX2 = eINSTANCE.getParticipantCardinalityMax_Max2();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.ParticipantCardinalityAllImpl <em>Participant Cardinality All</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.ParticipantCardinalityAllImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getParticipantCardinalityAll()
     * @generated
     */
    EClass PARTICIPANT_CARDINALITY_ALL = eINSTANCE.getParticipantCardinalityAll();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_CARDINALITY_ALL__NAME = eINSTANCE.getParticipantCardinalityAll_Name();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.TypeImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.RoleImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__ROLE = eINSTANCE.getRole_Role();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.DescriptionImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__NAME = eINSTANCE.getDescription_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__DESCRIPTION = eINSTANCE.getDescription_Description();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.GoalsImpl <em>Goals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.GoalsImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getGoals()
     * @generated
     */
    EClass GOALS = eINSTANCE.getGoals();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOALS__NAME = eINSTANCE.getGoals_Name();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOALS__GOALS = eINSTANCE.getGoals_Goals();

    /**
     * The meta object literal for the '{@link ptlide.xtext.ptl.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ptlide.xtext.ptl.impl.GoalImpl
     * @see ptlide.xtext.ptl.impl.PtlPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__GOAL = eINSTANCE.getGoal_Goal();

  }

} //PtlPackage
