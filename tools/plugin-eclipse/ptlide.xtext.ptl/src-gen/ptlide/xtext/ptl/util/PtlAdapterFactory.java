/**
 * <copyright>
 * </copyright>
 *
 */
package ptlide.xtext.ptl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ptlide.xtext.ptl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ptlide.xtext.ptl.PtlPackage
 * @generated
 */
public class PtlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PtlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PtlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PtlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PtlSwitch<Adapter> modelSwitch =
    new PtlSwitch<Adapter>()
    {
      @Override
      public Adapter caseProtocol(Protocol object)
      {
        return createProtocolAdapter();
      }
      @Override
      public Adapter caseTransitions(Transitions object)
      {
        return createTransitionsAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseTransitionType(TransitionType object)
      {
        return createTransitionTypeAdapter();
      }
      @Override
      public Adapter caseTimeout(Timeout object)
      {
        return createTimeoutAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseMapFromTo(MapFromTo object)
      {
        return createMapFromToAdapter();
      }
      @Override
      public Adapter caseTrigger(Trigger object)
      {
        return createTriggerAdapter();
      }
      @Override
      public Adapter casePattern(Pattern object)
      {
        return createPatternAdapter();
      }
      @Override
      public Adapter caseContent(Content object)
      {
        return createContentAdapter();
      }
      @Override
      public Adapter caseOccurrence(Occurrence object)
      {
        return createOccurrenceAdapter();
      }
      @Override
      public Adapter caseDuty(Duty object)
      {
        return createDutyAdapter();
      }
      @Override
      public Adapter caseDutyType(DutyType object)
      {
        return createDutyTypeAdapter();
      }
      @Override
      public Adapter caseParticipantOccurrence(ParticipantOccurrence object)
      {
        return createParticipantOccurrenceAdapter();
      }
      @Override
      public Adapter caseStates(States object)
      {
        return createStatesAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseStateId(StateId object)
      {
        return createStateIdAdapter();
      }
      @Override
      public Adapter caseStateType(StateType object)
      {
        return createStateTypeAdapter();
      }
      @Override
      public Adapter caseParticipants(Participants object)
      {
        return createParticipantsAdapter();
      }
      @Override
      public Adapter caseParticipant(Participant object)
      {
        return createParticipantAdapter();
      }
      @Override
      public Adapter caseParticipantId(ParticipantId object)
      {
        return createParticipantIdAdapter();
      }
      @Override
      public Adapter caseParticipantDescription(ParticipantDescription object)
      {
        return createParticipantDescriptionAdapter();
      }
      @Override
      public Adapter caseParticipantCardinality(ParticipantCardinality object)
      {
        return createParticipantCardinalityAdapter();
      }
      @Override
      public Adapter caseParticipantCardinalityMinMax(ParticipantCardinalityMinMax object)
      {
        return createParticipantCardinalityMinMaxAdapter();
      }
      @Override
      public Adapter caseParticipantCardinalityMin(ParticipantCardinalityMin object)
      {
        return createParticipantCardinalityMinAdapter();
      }
      @Override
      public Adapter caseParticipantCardinalityMax(ParticipantCardinalityMax object)
      {
        return createParticipantCardinalityMaxAdapter();
      }
      @Override
      public Adapter caseParticipantCardinalityAll(ParticipantCardinalityAll object)
      {
        return createParticipantCardinalityAllAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseRole(Role object)
      {
        return createRoleAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseGoals(Goals object)
      {
        return createGoalsAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Protocol
   * @generated
   */
  public Adapter createProtocolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Transitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Transitions
   * @generated
   */
  public Adapter createTransitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.TransitionType <em>Transition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.TransitionType
   * @generated
   */
  public Adapter createTransitionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Timeout <em>Timeout</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Timeout
   * @generated
   */
  public Adapter createTimeoutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.MapFromTo <em>Map From To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.MapFromTo
   * @generated
   */
  public Adapter createMapFromToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Trigger
   * @generated
   */
  public Adapter createTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Pattern
   * @generated
   */
  public Adapter createPatternAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Content
   * @generated
   */
  public Adapter createContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Occurrence <em>Occurrence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Occurrence
   * @generated
   */
  public Adapter createOccurrenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Duty <em>Duty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Duty
   * @generated
   */
  public Adapter createDutyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.DutyType <em>Duty Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.DutyType
   * @generated
   */
  public Adapter createDutyTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.ParticipantOccurrence <em>Participant Occurrence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.ParticipantOccurrence
   * @generated
   */
  public Adapter createParticipantOccurrenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.States
   * @generated
   */
  public Adapter createStatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.StateId <em>State Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.StateId
   * @generated
   */
  public Adapter createStateIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.StateType
   * @generated
   */
  public Adapter createStateTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Participants <em>Participants</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Participants
   * @generated
   */
  public Adapter createParticipantsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Participant
   * @generated
   */
  public Adapter createParticipantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.ParticipantId <em>Participant Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.ParticipantId
   * @generated
   */
  public Adapter createParticipantIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.ParticipantDescription <em>Participant Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.ParticipantDescription
   * @generated
   */
  public Adapter createParticipantDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.ParticipantCardinality <em>Participant Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.ParticipantCardinality
   * @generated
   */
  public Adapter createParticipantCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.ParticipantCardinalityMinMax <em>Participant Cardinality Min Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMinMax
   * @generated
   */
  public Adapter createParticipantCardinalityMinMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.ParticipantCardinalityMin <em>Participant Cardinality Min</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMin
   * @generated
   */
  public Adapter createParticipantCardinalityMinAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.ParticipantCardinalityMax <em>Participant Cardinality Max</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.ParticipantCardinalityMax
   * @generated
   */
  public Adapter createParticipantCardinalityMaxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.ParticipantCardinalityAll <em>Participant Cardinality All</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.ParticipantCardinalityAll
   * @generated
   */
  public Adapter createParticipantCardinalityAllAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Role
   * @generated
   */
  public Adapter createRoleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Goals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Goals
   * @generated
   */
  public Adapter createGoalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ptlide.xtext.ptl.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ptlide.xtext.ptl.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PtlAdapterFactory
