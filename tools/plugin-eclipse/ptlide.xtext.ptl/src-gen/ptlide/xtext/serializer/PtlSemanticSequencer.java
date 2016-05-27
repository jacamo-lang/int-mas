package ptlide.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ptlide.xtext.ptl.Content;
import ptlide.xtext.ptl.Description;
import ptlide.xtext.ptl.Duty;
import ptlide.xtext.ptl.DutyType;
import ptlide.xtext.ptl.Goal;
import ptlide.xtext.ptl.Goals;
import ptlide.xtext.ptl.Import;
import ptlide.xtext.ptl.MapFromTo;
import ptlide.xtext.ptl.Mapping;
import ptlide.xtext.ptl.Occurrence;
import ptlide.xtext.ptl.Participant;
import ptlide.xtext.ptl.ParticipantCardinality;
import ptlide.xtext.ptl.ParticipantCardinalityAll;
import ptlide.xtext.ptl.ParticipantCardinalityMax;
import ptlide.xtext.ptl.ParticipantCardinalityMin;
import ptlide.xtext.ptl.ParticipantCardinalityMinMax;
import ptlide.xtext.ptl.ParticipantDescription;
import ptlide.xtext.ptl.ParticipantId;
import ptlide.xtext.ptl.ParticipantOccurrence;
import ptlide.xtext.ptl.Participants;
import ptlide.xtext.ptl.Pattern;
import ptlide.xtext.ptl.Protocol;
import ptlide.xtext.ptl.PtlPackage;
import ptlide.xtext.ptl.Role;
import ptlide.xtext.ptl.State;
import ptlide.xtext.ptl.StateId;
import ptlide.xtext.ptl.StateType;
import ptlide.xtext.ptl.States;
import ptlide.xtext.ptl.Timeout;
import ptlide.xtext.ptl.Transition;
import ptlide.xtext.ptl.TransitionType;
import ptlide.xtext.ptl.Transitions;
import ptlide.xtext.ptl.Trigger;
import ptlide.xtext.ptl.Type;
import ptlide.xtext.services.PtlGrammarAccess;

@SuppressWarnings("all")
public class PtlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PtlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PtlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PtlPackage.CONTENT:
				if(context == grammarAccess.getContentRule()) {
					sequence_Content(context, (Content) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.DESCRIPTION:
				if(context == grammarAccess.getDescriptionRule()) {
					sequence_Description(context, (Description) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.DUTY:
				if(context == grammarAccess.getDutyRule()) {
					sequence_Duty(context, (Duty) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.DUTY_TYPE:
				if(context == grammarAccess.getDutyTypeRule()) {
					sequence_DutyType(context, (DutyType) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.GOAL:
				if(context == grammarAccess.getGoalRule()) {
					sequence_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.GOALS:
				if(context == grammarAccess.getGoalsRule()) {
					sequence_Goals(context, (Goals) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.MAP_FROM_TO:
				if(context == grammarAccess.getMapFromToRule()) {
					sequence_MapFromTo(context, (MapFromTo) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.MAPPING:
				if(context == grammarAccess.getMappingRule()) {
					sequence_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.OCCURRENCE:
				if(context == grammarAccess.getOccurrenceRule()) {
					sequence_Occurrence(context, (Occurrence) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT:
				if(context == grammarAccess.getParticipantRule()) {
					sequence_Participant(context, (Participant) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT_CARDINALITY:
				if(context == grammarAccess.getParticipantCardinalityRule()) {
					sequence_ParticipantCardinality(context, (ParticipantCardinality) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT_CARDINALITY_ALL:
				if(context == grammarAccess.getParticipantCardinalityAllRule()) {
					sequence_ParticipantCardinalityAll(context, (ParticipantCardinalityAll) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT_CARDINALITY_MAX:
				if(context == grammarAccess.getParticipantCardinalityMaxRule()) {
					sequence_ParticipantCardinalityMax(context, (ParticipantCardinalityMax) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT_CARDINALITY_MIN:
				if(context == grammarAccess.getParticipantCardinalityMinRule()) {
					sequence_ParticipantCardinalityMin(context, (ParticipantCardinalityMin) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT_CARDINALITY_MIN_MAX:
				if(context == grammarAccess.getParticipantCardinalityMinMaxRule()) {
					sequence_ParticipantCardinalityMinMax(context, (ParticipantCardinalityMinMax) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT_DESCRIPTION:
				if(context == grammarAccess.getParticipantDescriptionRule()) {
					sequence_ParticipantDescription(context, (ParticipantDescription) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT_ID:
				if(context == grammarAccess.getParticipantIdRule()) {
					sequence_ParticipantId(context, (ParticipantId) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANT_OCCURRENCE:
				if(context == grammarAccess.getParticipantOccurrenceRule()) {
					sequence_ParticipantOccurrence(context, (ParticipantOccurrence) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PARTICIPANTS:
				if(context == grammarAccess.getParticipantsRule()) {
					sequence_Participants(context, (Participants) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PATTERN:
				if(context == grammarAccess.getPatternRule()) {
					sequence_Pattern(context, (Pattern) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.PROTOCOL:
				if(context == grammarAccess.getProtocolRule()) {
					sequence_Protocol(context, (Protocol) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.ROLE:
				if(context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.STATE_ID:
				if(context == grammarAccess.getStateIdRule()) {
					sequence_StateId(context, (StateId) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.STATE_TYPE:
				if(context == grammarAccess.getStateTypeRule()) {
					sequence_StateType(context, (StateType) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.STATES:
				if(context == grammarAccess.getStatesRule()) {
					sequence_States(context, (States) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.TIMEOUT:
				if(context == grammarAccess.getTimeoutRule()) {
					sequence_Timeout(context, (Timeout) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.TRANSITION_TYPE:
				if(context == grammarAccess.getTransitionTypeRule()) {
					sequence_TransitionType(context, (TransitionType) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.TRANSITIONS:
				if(context == grammarAccess.getTransitionsRule()) {
					sequence_Transitions(context, (Transitions) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.TRIGGER:
				if(context == grammarAccess.getTriggerRule()) {
					sequence_Trigger(context, (Trigger) semanticObject); 
					return; 
				}
				else break;
			case PtlPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     content=STRING
	 */
	protected void sequence_Content(EObject context, Content semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.CONTENT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.CONTENT__CONTENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContentAccess().getContentSTRINGTerminalRuleCall_1_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=TK_DESCRIPTION description=STRING)?)
	 */
	protected void sequence_Description(EObject context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_EVENT | name=TK_ACTION | (name=TK_MESSAGE performative=ID))
	 */
	protected void sequence_DutyType(EObject context, DutyType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dutytype=DutyType duty=STRING)
	 */
	protected void sequence_Duty(EObject context, Duty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.DUTY__DUTYTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.DUTY__DUTYTYPE));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.DUTY__DUTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.DUTY__DUTY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDutyAccess().getDutytypeDutyTypeParserRuleCall_0_0(), semanticObject.getDutytype());
		feeder.accept(grammarAccess.getDutyAccess().getDutySTRINGTerminalRuleCall_1_0(), semanticObject.getDuty());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     goal=STRING
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.GOAL__GOAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.GOAL__GOAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGoalAccess().getGoalSTRINGTerminalRuleCall_0_0(), semanticObject.getGoal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_GOALS goals+=Goal+)
	 */
	protected void sequence_Goals(EObject context, Goals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_IMPORT file=STRING mapping=Mapping?)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=ParticipantId to=ParticipantId)
	 */
	protected void sequence_MapFromTo(EObject context, MapFromTo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.MAP_FROM_TO__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.MAP_FROM_TO__FROM));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.MAP_FROM_TO__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.MAP_FROM_TO__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMapFromToAccess().getFromParticipantIdParserRuleCall_0_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getMapFromToAccess().getToParticipantIdParserRuleCall_1_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_MAPPING maps+=MapFromTo+)
	 */
	protected void sequence_Mapping(EObject context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (participantSource=ParticipantOccurrence duty=Duty participantDestination=ParticipantOccurrence trigger+=Trigger*)
	 */
	protected void sequence_Occurrence(EObject context, Occurrence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=TK_ALL
	 */
	protected void sequence_ParticipantCardinalityAll(EObject context, ParticipantCardinalityAll semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PARTICIPANT_CARDINALITY_ALL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PARTICIPANT_CARDINALITY_ALL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParticipantCardinalityAllAccess().getNameTK_ALLParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_MAX (max=INTEGER | max2=TK_PLUS))
	 */
	protected void sequence_ParticipantCardinalityMax(EObject context, ParticipantCardinalityMax semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (min=ParticipantCardinalityMin? max=ParticipantCardinalityMax?)
	 */
	protected void sequence_ParticipantCardinalityMinMax(EObject context, ParticipantCardinalityMinMax semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_MIN min=INTEGER)
	 */
	protected void sequence_ParticipantCardinalityMin(EObject context, ParticipantCardinalityMin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PARTICIPANT_CARDINALITY_MIN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PARTICIPANT_CARDINALITY_MIN__NAME));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PARTICIPANT_CARDINALITY_MIN__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PARTICIPANT_CARDINALITY_MIN__MIN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParticipantCardinalityMinAccess().getNameTK_MINParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParticipantCardinalityMinAccess().getMinINTEGERTerminalRuleCall_1_0(), semanticObject.getMin());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     cardAll=ParticipantCardinalityAll
	 */
	protected void sequence_ParticipantCardinality(EObject context, ParticipantCardinality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((kind=TK_AGENT role=Role) | (kind=TK_ARTIFACT type=Type)) card=ParticipantCardinality)
	 */
	protected void sequence_ParticipantDescription(EObject context, ParticipantDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ParticipantId(EObject context, ParticipantId semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PARTICIPANT_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PARTICIPANT_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParticipantIdAccess().getNameIDParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (participantSource=ParticipantId cardinality=INTEGER?)
	 */
	protected void sequence_ParticipantOccurrence(EObject context, ParticipantOccurrence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ParticipantId participantDescription=ParticipantDescription)
	 */
	protected void sequence_Participant(EObject context, Participant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PARTICIPANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PARTICIPANT__NAME));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PARTICIPANT__PARTICIPANT_DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PARTICIPANT__PARTICIPANT_DESCRIPTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParticipantAccess().getNameParticipantIdParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParticipantAccess().getParticipantDescriptionParticipantDescriptionParserRuleCall_1_0(), semanticObject.getParticipantDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_PARTICIPANTS participants+=Participant+)
	 */
	protected void sequence_Participants(EObject context, Participants semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_TRIGGER pattern=STRING)
	 */
	protected void sequence_Pattern(EObject context, Pattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PATTERN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PATTERN__NAME));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PATTERN__PATTERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PATTERN__PATTERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPatternAccess().getNameTK_TRIGGERParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPatternAccess().getPatternSTRINGTerminalRuleCall_1_0(), semanticObject.getPattern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=Description 
	 *         goals=Goals 
	 *         participants=Participants 
	 *         states=States 
	 *         transitions=Transitions
	 *     )
	 */
	protected void sequence_Protocol(EObject context, Protocol semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PROTOCOL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PROTOCOL__NAME));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PROTOCOL__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PROTOCOL__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PROTOCOL__GOALS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PROTOCOL__GOALS));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PROTOCOL__PARTICIPANTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PROTOCOL__PARTICIPANTS));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PROTOCOL__STATES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PROTOCOL__STATES));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.PROTOCOL__TRANSITIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.PROTOCOL__TRANSITIONS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProtocolAccess().getNameIDParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProtocolAccess().getDescriptionDescriptionParserRuleCall_3_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getProtocolAccess().getGoalsGoalsParserRuleCall_4_0(), semanticObject.getGoals());
		feeder.accept(grammarAccess.getProtocolAccess().getParticipantsParticipantsParserRuleCall_5_0(), semanticObject.getParticipants());
		feeder.accept(grammarAccess.getProtocolAccess().getStatesStatesParserRuleCall_6_0(), semanticObject.getStates());
		feeder.accept(grammarAccess.getProtocolAccess().getTransitionsTransitionsParserRuleCall_7_0(), semanticObject.getTransitions());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     role=STRING
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.ROLE__ROLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.ROLE__ROLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRoleAccess().getRoleSTRINGTerminalRuleCall_0(), semanticObject.getRole());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_StateId(EObject context, StateId semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.STATE_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.STATE_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateIdAccess().getNameIDParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((initial=TK_INITIAL | final=TK_FINAL)?)
	 */
	protected void sequence_StateType(EObject context, StateType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=StateId type=StateType)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.STATE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.STATE__ID));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.STATE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.STATE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateAccess().getIdStateIdParserRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getStateAccess().getTypeStateTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_STATES states+=State+)
	 */
	protected void sequence_States(EObject context, States semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_TIMEOUT timeout=INTEGER)
	 */
	protected void sequence_Timeout(EObject context, Timeout semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.TIMEOUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.TIMEOUT__NAME));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.TIMEOUT__TIMEOUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.TIMEOUT__TIMEOUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTimeoutAccess().getNameTK_TIMEOUTParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTimeoutAccess().getTimeoutINTEGERTerminalRuleCall_1_0(), semanticObject.getTimeout());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Occurrence | type=Timeout | type=Import)
	 */
	protected void sequence_TransitionType(EObject context, TransitionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sourceState=StateId destinationState=StateId type=TransitionType)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.TRANSITION__SOURCE_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.TRANSITION__SOURCE_STATE));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.TRANSITION__DESTINATION_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.TRANSITION__DESTINATION_STATE));
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.TRANSITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.TRANSITION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionAccess().getSourceStateStateIdParserRuleCall_0_0(), semanticObject.getSourceState());
		feeder.accept(grammarAccess.getTransitionAccess().getDestinationStateStateIdParserRuleCall_2_0(), semanticObject.getDestinationState());
		feeder.accept(grammarAccess.getTransitionAccess().getTypeTransitionTypeParserRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=TK_TRANSITIONS transitions+=Transition+)
	 */
	protected void sequence_Transitions(EObject context, Transitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((pattern=Pattern content=Content?) | content=Content)
	 */
	protected void sequence_Trigger(EObject context, Trigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=STRING
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PtlPackage.Literals.TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PtlPackage.Literals.TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getTypeSTRINGTerminalRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
}
