/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ptlide.xtext.ptl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtlFactoryImpl extends EFactoryImpl implements PtlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PtlFactory init()
  {
    try
    {
      PtlFactory thePtlFactory = (PtlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.ptlide/Ptl"); 
      if (thePtlFactory != null)
      {
        return thePtlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PtlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PtlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PtlPackage.PROTOCOL: return createProtocol();
      case PtlPackage.TRANSITIONS: return createTransitions();
      case PtlPackage.TRANSITION: return createTransition();
      case PtlPackage.TRANSITION_TYPE: return createTransitionType();
      case PtlPackage.TIMEOUT: return createTimeout();
      case PtlPackage.IMPORT: return createImport();
      case PtlPackage.MAPPING: return createMapping();
      case PtlPackage.MAP_FROM_TO: return createMapFromTo();
      case PtlPackage.TRIGGER: return createTrigger();
      case PtlPackage.PATTERN: return createPattern();
      case PtlPackage.CONTENT: return createContent();
      case PtlPackage.OCCURRENCE: return createOccurrence();
      case PtlPackage.DUTY: return createDuty();
      case PtlPackage.DUTY_TYPE: return createDutyType();
      case PtlPackage.PARTICIPANT_OCCURRENCE: return createParticipantOccurrence();
      case PtlPackage.STATES: return createStates();
      case PtlPackage.STATE: return createState();
      case PtlPackage.STATE_ID: return createStateId();
      case PtlPackage.STATE_TYPE: return createStateType();
      case PtlPackage.PARTICIPANTS: return createParticipants();
      case PtlPackage.PARTICIPANT: return createParticipant();
      case PtlPackage.PARTICIPANT_ID: return createParticipantId();
      case PtlPackage.PARTICIPANT_DESCRIPTION: return createParticipantDescription();
      case PtlPackage.PARTICIPANT_CARDINALITY: return createParticipantCardinality();
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX: return createParticipantCardinalityMinMax();
      case PtlPackage.PARTICIPANT_CARDINALITY_MIN: return createParticipantCardinalityMin();
      case PtlPackage.PARTICIPANT_CARDINALITY_MAX: return createParticipantCardinalityMax();
      case PtlPackage.PARTICIPANT_CARDINALITY_ALL: return createParticipantCardinalityAll();
      case PtlPackage.TYPE: return createType();
      case PtlPackage.ROLE: return createRole();
      case PtlPackage.DESCRIPTION: return createDescription();
      case PtlPackage.GOALS: return createGoals();
      case PtlPackage.GOAL: return createGoal();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transitions createTransitions()
  {
    TransitionsImpl transitions = new TransitionsImpl();
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionType createTransitionType()
  {
    TransitionTypeImpl transitionType = new TransitionTypeImpl();
    return transitionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Timeout createTimeout()
  {
    TimeoutImpl timeout = new TimeoutImpl();
    return timeout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapFromTo createMapFromTo()
  {
    MapFromToImpl mapFromTo = new MapFromToImpl();
    return mapFromTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger createTrigger()
  {
    TriggerImpl trigger = new TriggerImpl();
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Occurrence createOccurrence()
  {
    OccurrenceImpl occurrence = new OccurrenceImpl();
    return occurrence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Duty createDuty()
  {
    DutyImpl duty = new DutyImpl();
    return duty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DutyType createDutyType()
  {
    DutyTypeImpl dutyType = new DutyTypeImpl();
    return dutyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantOccurrence createParticipantOccurrence()
  {
    ParticipantOccurrenceImpl participantOccurrence = new ParticipantOccurrenceImpl();
    return participantOccurrence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States createStates()
  {
    StatesImpl states = new StatesImpl();
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateId createStateId()
  {
    StateIdImpl stateId = new StateIdImpl();
    return stateId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateType createStateType()
  {
    StateTypeImpl stateType = new StateTypeImpl();
    return stateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participants createParticipants()
  {
    ParticipantsImpl participants = new ParticipantsImpl();
    return participants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant createParticipant()
  {
    ParticipantImpl participant = new ParticipantImpl();
    return participant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantId createParticipantId()
  {
    ParticipantIdImpl participantId = new ParticipantIdImpl();
    return participantId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantDescription createParticipantDescription()
  {
    ParticipantDescriptionImpl participantDescription = new ParticipantDescriptionImpl();
    return participantDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinality createParticipantCardinality()
  {
    ParticipantCardinalityImpl participantCardinality = new ParticipantCardinalityImpl();
    return participantCardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinalityMinMax createParticipantCardinalityMinMax()
  {
    ParticipantCardinalityMinMaxImpl participantCardinalityMinMax = new ParticipantCardinalityMinMaxImpl();
    return participantCardinalityMinMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinalityMin createParticipantCardinalityMin()
  {
    ParticipantCardinalityMinImpl participantCardinalityMin = new ParticipantCardinalityMinImpl();
    return participantCardinalityMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinalityMax createParticipantCardinalityMax()
  {
    ParticipantCardinalityMaxImpl participantCardinalityMax = new ParticipantCardinalityMaxImpl();
    return participantCardinalityMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantCardinalityAll createParticipantCardinalityAll()
  {
    ParticipantCardinalityAllImpl participantCardinalityAll = new ParticipantCardinalityAllImpl();
    return participantCardinalityAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goals createGoals()
  {
    GoalsImpl goals = new GoalsImpl();
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PtlPackage getPtlPackage()
  {
    return (PtlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PtlPackage getPackage()
  {
    return PtlPackage.eINSTANCE;
  }

} //PtlFactoryImpl
