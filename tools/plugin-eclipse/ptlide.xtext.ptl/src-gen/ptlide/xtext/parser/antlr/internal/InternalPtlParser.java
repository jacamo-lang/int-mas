package ptlide.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ptlide.xtext.services.PtlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPtlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER", "RULE_STRING", "RULE_ID_WITH_STARTING_LCLETTER", "RULE_INTEGER_NUMBER", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'{'", "'}'", "':'", "'-'", "'#'", "';'", "'--'", "'->'", "'['", "']'", "'protocol'", "'description'", "'goals'", "'participants'", "'agent'", "'artifact'", "'max'", "'min'", "'states'", "'initial'", "'final'", "'transitions'", "'timeout'", "'message'", "'action'", "'event'", "'trigger'", "'import'", "'mapping'", "'all'", "'+'"
    };
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ID_WITH_STARTING_LCLETTER=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=8;
    public static final int RULE_INTEGER=4;
    public static final int RULE_INTEGER_NUMBER=7;

    // delegates
    // delegators


        public InternalPtlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPtlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPtlParser.tokenNames; }
    public String getGrammarFileName() { return "../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g"; }



     	private PtlGrammarAccess grammarAccess;
     	
        public InternalPtlParser(TokenStream input, PtlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Protocol";	
       	}
       	
       	@Override
       	protected PtlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProtocol"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:67:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:68:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:69:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol75);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:76:1: ruleProtocol returns [EObject current=null] : ( ruleTK_PROTOCOL ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_goals_4_0= ruleGoals ) ) ( (lv_participants_5_0= ruleParticipants ) ) ( (lv_states_6_0= ruleStates ) ) ( (lv_transitions_7_0= ruleTransitions ) ) otherlv_8= '}' ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_description_3_0 = null;

        EObject lv_goals_4_0 = null;

        EObject lv_participants_5_0 = null;

        EObject lv_states_6_0 = null;

        EObject lv_transitions_7_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:79:28: ( ( ruleTK_PROTOCOL ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_goals_4_0= ruleGoals ) ) ( (lv_participants_5_0= ruleParticipants ) ) ( (lv_states_6_0= ruleStates ) ) ( (lv_transitions_7_0= ruleTransitions ) ) otherlv_8= '}' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:80:1: ( ruleTK_PROTOCOL ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_goals_4_0= ruleGoals ) ) ( (lv_participants_5_0= ruleParticipants ) ) ( (lv_states_6_0= ruleStates ) ) ( (lv_transitions_7_0= ruleTransitions ) ) otherlv_8= '}' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:80:1: ( ruleTK_PROTOCOL ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_goals_4_0= ruleGoals ) ) ( (lv_participants_5_0= ruleParticipants ) ) ( (lv_states_6_0= ruleStates ) ) ( (lv_transitions_7_0= ruleTransitions ) ) otherlv_8= '}' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:81:5: ruleTK_PROTOCOL ( (lv_name_1_0= ruleID ) ) otherlv_2= '{' ( (lv_description_3_0= ruleDescription ) ) ( (lv_goals_4_0= ruleGoals ) ) ( (lv_participants_5_0= ruleParticipants ) ) ( (lv_states_6_0= ruleStates ) ) ( (lv_transitions_7_0= ruleTransitions ) ) otherlv_8= '}'
            {
             
                    newCompositeNode(grammarAccess.getProtocolAccess().getTK_PROTOCOLParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTK_PROTOCOL_in_ruleProtocol126);
            ruleTK_PROTOCOL();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:88:1: ( (lv_name_1_0= ruleID ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:89:1: (lv_name_1_0= ruleID )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:89:1: (lv_name_1_0= ruleID )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:90:3: lv_name_1_0= ruleID
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getNameIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleProtocol146);
            lv_name_1_0=ruleID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleProtocol158); 

                	newLeafNode(otherlv_2, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_2());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:110:1: ( (lv_description_3_0= ruleDescription ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:111:1: (lv_description_3_0= ruleDescription )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:111:1: (lv_description_3_0= ruleDescription )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:112:3: lv_description_3_0= ruleDescription
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDescription_in_ruleProtocol179);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	        }
                   		set(
                   			current, 
                   			"description",
                    		lv_description_3_0, 
                    		"Description");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:128:2: ( (lv_goals_4_0= ruleGoals ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:129:1: (lv_goals_4_0= ruleGoals )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:129:1: (lv_goals_4_0= ruleGoals )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:130:3: lv_goals_4_0= ruleGoals
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getGoalsGoalsParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleGoals_in_ruleProtocol200);
            lv_goals_4_0=ruleGoals();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	        }
                   		set(
                   			current, 
                   			"goals",
                    		lv_goals_4_0, 
                    		"Goals");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:146:2: ( (lv_participants_5_0= ruleParticipants ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:147:1: (lv_participants_5_0= ruleParticipants )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:147:1: (lv_participants_5_0= ruleParticipants )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:148:3: lv_participants_5_0= ruleParticipants
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getParticipantsParticipantsParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipants_in_ruleProtocol221);
            lv_participants_5_0=ruleParticipants();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	        }
                   		set(
                   			current, 
                   			"participants",
                    		lv_participants_5_0, 
                    		"Participants");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:164:2: ( (lv_states_6_0= ruleStates ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:165:1: (lv_states_6_0= ruleStates )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:165:1: (lv_states_6_0= ruleStates )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:166:3: lv_states_6_0= ruleStates
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getStatesStatesParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStates_in_ruleProtocol242);
            lv_states_6_0=ruleStates();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	        }
                   		set(
                   			current, 
                   			"states",
                    		lv_states_6_0, 
                    		"States");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:182:2: ( (lv_transitions_7_0= ruleTransitions ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:183:1: (lv_transitions_7_0= ruleTransitions )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:183:1: (lv_transitions_7_0= ruleTransitions )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:184:3: lv_transitions_7_0= ruleTransitions
            {
             
            	        newCompositeNode(grammarAccess.getProtocolAccess().getTransitionsTransitionsParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTransitions_in_ruleProtocol263);
            lv_transitions_7_0=ruleTransitions();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProtocolRule());
            	        }
                   		set(
                   			current, 
                   			"transitions",
                    		lv_transitions_7_0, 
                    		"Transitions");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleProtocol275); 

                	newLeafNode(otherlv_8, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleTransitions"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:212:1: entryRuleTransitions returns [EObject current=null] : iv_ruleTransitions= ruleTransitions EOF ;
    public final EObject entryRuleTransitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitions = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:213:2: (iv_ruleTransitions= ruleTransitions EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:214:2: iv_ruleTransitions= ruleTransitions EOF
            {
             newCompositeNode(grammarAccess.getTransitionsRule()); 
            pushFollow(FOLLOW_ruleTransitions_in_entryRuleTransitions311);
            iv_ruleTransitions=ruleTransitions();

            state._fsp--;

             current =iv_ruleTransitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitions321); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitions"


    // $ANTLR start "ruleTransitions"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:221:1: ruleTransitions returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_TRANSITIONS ) ) otherlv_1= ':' ( (lv_transitions_2_0= ruleTransition ) )+ ) ;
    public final EObject ruleTransitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_transitions_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:224:28: ( ( ( (lv_name_0_0= ruleTK_TRANSITIONS ) ) otherlv_1= ':' ( (lv_transitions_2_0= ruleTransition ) )+ ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:225:1: ( ( (lv_name_0_0= ruleTK_TRANSITIONS ) ) otherlv_1= ':' ( (lv_transitions_2_0= ruleTransition ) )+ )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:225:1: ( ( (lv_name_0_0= ruleTK_TRANSITIONS ) ) otherlv_1= ':' ( (lv_transitions_2_0= ruleTransition ) )+ )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:225:2: ( (lv_name_0_0= ruleTK_TRANSITIONS ) ) otherlv_1= ':' ( (lv_transitions_2_0= ruleTransition ) )+
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:225:2: ( (lv_name_0_0= ruleTK_TRANSITIONS ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:226:1: (lv_name_0_0= ruleTK_TRANSITIONS )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:226:1: (lv_name_0_0= ruleTK_TRANSITIONS )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:227:3: lv_name_0_0= ruleTK_TRANSITIONS
            {
             
            	        newCompositeNode(grammarAccess.getTransitionsAccess().getNameTK_TRANSITIONSParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_TRANSITIONS_in_ruleTransitions367);
            lv_name_0_0=ruleTK_TRANSITIONS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionsRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_TRANSITIONS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleTransitions379); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionsAccess().getColonKeyword_1());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:247:1: ( (lv_transitions_2_0= ruleTransition ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID_WITH_STARTING_LCLETTER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:248:1: (lv_transitions_2_0= ruleTransition )
            	    {
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:248:1: (lv_transitions_2_0= ruleTransition )
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:249:3: lv_transitions_2_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionsAccess().getTransitionsTransitionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleTransitions400);
            	    lv_transitions_2_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransitionsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_2_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitions"


    // $ANTLR start "entryRuleTransition"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:273:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:274:2: (iv_ruleTransition= ruleTransition EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:275:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition437);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:282:1: ruleTransition returns [EObject current=null] : ( ( (lv_sourceState_0_0= ruleStateId ) ) otherlv_1= '-' ( (lv_destinationState_2_0= ruleStateId ) ) otherlv_3= '#' ( (lv_type_4_0= ruleTransitionType ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_sourceState_0_0 = null;

        EObject lv_destinationState_2_0 = null;

        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:285:28: ( ( ( (lv_sourceState_0_0= ruleStateId ) ) otherlv_1= '-' ( (lv_destinationState_2_0= ruleStateId ) ) otherlv_3= '#' ( (lv_type_4_0= ruleTransitionType ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:286:1: ( ( (lv_sourceState_0_0= ruleStateId ) ) otherlv_1= '-' ( (lv_destinationState_2_0= ruleStateId ) ) otherlv_3= '#' ( (lv_type_4_0= ruleTransitionType ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:286:1: ( ( (lv_sourceState_0_0= ruleStateId ) ) otherlv_1= '-' ( (lv_destinationState_2_0= ruleStateId ) ) otherlv_3= '#' ( (lv_type_4_0= ruleTransitionType ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:286:2: ( (lv_sourceState_0_0= ruleStateId ) ) otherlv_1= '-' ( (lv_destinationState_2_0= ruleStateId ) ) otherlv_3= '#' ( (lv_type_4_0= ruleTransitionType ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:286:2: ( (lv_sourceState_0_0= ruleStateId ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:287:1: (lv_sourceState_0_0= ruleStateId )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:287:1: (lv_sourceState_0_0= ruleStateId )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:288:3: lv_sourceState_0_0= ruleStateId
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateStateIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStateId_in_ruleTransition493);
            lv_sourceState_0_0=ruleStateId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"sourceState",
                    		lv_sourceState_0_0, 
                    		"StateId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTransition505); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusKeyword_1());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:308:1: ( (lv_destinationState_2_0= ruleStateId ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:309:1: (lv_destinationState_2_0= ruleStateId )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:309:1: (lv_destinationState_2_0= ruleStateId )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:310:3: lv_destinationState_2_0= ruleStateId
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getDestinationStateStateIdParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateId_in_ruleTransition526);
            lv_destinationState_2_0=ruleStateId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"destinationState",
                    		lv_destinationState_2_0, 
                    		"StateId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTransition538); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getNumberSignKeyword_3());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:330:1: ( (lv_type_4_0= ruleTransitionType ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:331:1: (lv_type_4_0= ruleTransitionType )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:331:1: (lv_type_4_0= ruleTransitionType )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:332:3: lv_type_4_0= ruleTransitionType
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTransitionType_in_ruleTransition559);
            lv_type_4_0=ruleTransitionType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"TransitionType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTransitionType"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:356:1: entryRuleTransitionType returns [EObject current=null] : iv_ruleTransitionType= ruleTransitionType EOF ;
    public final EObject entryRuleTransitionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionType = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:357:2: (iv_ruleTransitionType= ruleTransitionType EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:358:2: iv_ruleTransitionType= ruleTransitionType EOF
            {
             newCompositeNode(grammarAccess.getTransitionTypeRule()); 
            pushFollow(FOLLOW_ruleTransitionType_in_entryRuleTransitionType595);
            iv_ruleTransitionType=ruleTransitionType();

            state._fsp--;

             current =iv_ruleTransitionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionType605); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionType"


    // $ANTLR start "ruleTransitionType"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:365:1: ruleTransitionType returns [EObject current=null] : ( ( (lv_type_0_0= ruleOccurrence ) ) | ( (lv_type_1_0= ruleTimeout ) ) | ( (lv_type_2_0= ruleImport ) ) ) ;
    public final EObject ruleTransitionType() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:368:28: ( ( ( (lv_type_0_0= ruleOccurrence ) ) | ( (lv_type_1_0= ruleTimeout ) ) | ( (lv_type_2_0= ruleImport ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:369:1: ( ( (lv_type_0_0= ruleOccurrence ) ) | ( (lv_type_1_0= ruleTimeout ) ) | ( (lv_type_2_0= ruleImport ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:369:1: ( ( (lv_type_0_0= ruleOccurrence ) ) | ( (lv_type_1_0= ruleTimeout ) ) | ( (lv_type_2_0= ruleImport ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID_WITH_STARTING_LCLETTER:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:369:2: ( (lv_type_0_0= ruleOccurrence ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:369:2: ( (lv_type_0_0= ruleOccurrence ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:370:1: (lv_type_0_0= ruleOccurrence )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:370:1: (lv_type_0_0= ruleOccurrence )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:371:3: lv_type_0_0= ruleOccurrence
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionTypeAccess().getTypeOccurrenceParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOccurrence_in_ruleTransitionType651);
                    lv_type_0_0=ruleOccurrence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"Occurrence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:388:6: ( (lv_type_1_0= ruleTimeout ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:388:6: ( (lv_type_1_0= ruleTimeout ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:389:1: (lv_type_1_0= ruleTimeout )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:389:1: (lv_type_1_0= ruleTimeout )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:390:3: lv_type_1_0= ruleTimeout
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionTypeAccess().getTypeTimeoutParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeout_in_ruleTransitionType678);
                    lv_type_1_0=ruleTimeout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"Timeout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:407:6: ( (lv_type_2_0= ruleImport ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:407:6: ( (lv_type_2_0= ruleImport ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:408:1: (lv_type_2_0= ruleImport )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:408:1: (lv_type_2_0= ruleImport )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:409:3: lv_type_2_0= ruleImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionTypeAccess().getTypeImportParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImport_in_ruleTransitionType705);
                    lv_type_2_0=ruleImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"Import");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionType"


    // $ANTLR start "entryRuleTimeout"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:433:1: entryRuleTimeout returns [EObject current=null] : iv_ruleTimeout= ruleTimeout EOF ;
    public final EObject entryRuleTimeout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeout = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:434:2: (iv_ruleTimeout= ruleTimeout EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:435:2: iv_ruleTimeout= ruleTimeout EOF
            {
             newCompositeNode(grammarAccess.getTimeoutRule()); 
            pushFollow(FOLLOW_ruleTimeout_in_entryRuleTimeout741);
            iv_ruleTimeout=ruleTimeout();

            state._fsp--;

             current =iv_ruleTimeout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeout751); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeout"


    // $ANTLR start "ruleTimeout"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:442:1: ruleTimeout returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_TIMEOUT ) ) ( (lv_timeout_1_0= RULE_INTEGER ) ) otherlv_2= ';' ) ;
    public final EObject ruleTimeout() throws RecognitionException {
        EObject current = null;

        Token lv_timeout_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:445:28: ( ( ( (lv_name_0_0= ruleTK_TIMEOUT ) ) ( (lv_timeout_1_0= RULE_INTEGER ) ) otherlv_2= ';' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:446:1: ( ( (lv_name_0_0= ruleTK_TIMEOUT ) ) ( (lv_timeout_1_0= RULE_INTEGER ) ) otherlv_2= ';' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:446:1: ( ( (lv_name_0_0= ruleTK_TIMEOUT ) ) ( (lv_timeout_1_0= RULE_INTEGER ) ) otherlv_2= ';' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:446:2: ( (lv_name_0_0= ruleTK_TIMEOUT ) ) ( (lv_timeout_1_0= RULE_INTEGER ) ) otherlv_2= ';'
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:446:2: ( (lv_name_0_0= ruleTK_TIMEOUT ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:447:1: (lv_name_0_0= ruleTK_TIMEOUT )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:447:1: (lv_name_0_0= ruleTK_TIMEOUT )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:448:3: lv_name_0_0= ruleTK_TIMEOUT
            {
             
            	        newCompositeNode(grammarAccess.getTimeoutAccess().getNameTK_TIMEOUTParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_TIMEOUT_in_ruleTimeout797);
            lv_name_0_0=ruleTK_TIMEOUT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeoutRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_TIMEOUT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:464:2: ( (lv_timeout_1_0= RULE_INTEGER ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:465:1: (lv_timeout_1_0= RULE_INTEGER )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:465:1: (lv_timeout_1_0= RULE_INTEGER )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:466:3: lv_timeout_1_0= RULE_INTEGER
            {
            lv_timeout_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleTimeout814); 

            			newLeafNode(lv_timeout_1_0, grammarAccess.getTimeoutAccess().getTimeoutINTEGERTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTimeoutRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"timeout",
                    		lv_timeout_1_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTimeout831); 

                	newLeafNode(otherlv_2, grammarAccess.getTimeoutAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeout"


    // $ANTLR start "entryRuleImport"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:494:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:495:2: (iv_ruleImport= ruleImport EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:496:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport867);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:503:1: ruleImport returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_IMPORT ) ) ( (lv_file_1_0= RULE_STRING ) ) ( (lv_mapping_2_0= ruleMapping ) )? otherlv_3= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_file_1_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_mapping_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:506:28: ( ( ( (lv_name_0_0= ruleTK_IMPORT ) ) ( (lv_file_1_0= RULE_STRING ) ) ( (lv_mapping_2_0= ruleMapping ) )? otherlv_3= ';' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:507:1: ( ( (lv_name_0_0= ruleTK_IMPORT ) ) ( (lv_file_1_0= RULE_STRING ) ) ( (lv_mapping_2_0= ruleMapping ) )? otherlv_3= ';' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:507:1: ( ( (lv_name_0_0= ruleTK_IMPORT ) ) ( (lv_file_1_0= RULE_STRING ) ) ( (lv_mapping_2_0= ruleMapping ) )? otherlv_3= ';' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:507:2: ( (lv_name_0_0= ruleTK_IMPORT ) ) ( (lv_file_1_0= RULE_STRING ) ) ( (lv_mapping_2_0= ruleMapping ) )? otherlv_3= ';'
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:507:2: ( (lv_name_0_0= ruleTK_IMPORT ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:508:1: (lv_name_0_0= ruleTK_IMPORT )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:508:1: (lv_name_0_0= ruleTK_IMPORT )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:509:3: lv_name_0_0= ruleTK_IMPORT
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getNameTK_IMPORTParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_IMPORT_in_ruleImport923);
            lv_name_0_0=ruleTK_IMPORT();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_IMPORT");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:525:2: ( (lv_file_1_0= RULE_STRING ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:526:1: (lv_file_1_0= RULE_STRING )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:526:1: (lv_file_1_0= RULE_STRING )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:527:3: lv_file_1_0= RULE_STRING
            {
            lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport940); 

            			newLeafNode(lv_file_1_0, grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"file",
                    		lv_file_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:543:2: ( (lv_mapping_2_0= ruleMapping ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:544:1: (lv_mapping_2_0= ruleMapping )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:544:1: (lv_mapping_2_0= ruleMapping )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:545:3: lv_mapping_2_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getImportAccess().getMappingMappingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleImport966);
                    lv_mapping_2_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImportRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_2_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleImport979); 

                	newLeafNode(otherlv_3, grammarAccess.getImportAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleMapping"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:573:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:574:2: (iv_ruleMapping= ruleMapping EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:575:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping1015);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping1025); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:582:1: ruleMapping returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_MAPPING ) ) otherlv_1= '{' ( (lv_maps_2_0= ruleMapFromTo ) )+ otherlv_3= '}' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_maps_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:585:28: ( ( ( (lv_name_0_0= ruleTK_MAPPING ) ) otherlv_1= '{' ( (lv_maps_2_0= ruleMapFromTo ) )+ otherlv_3= '}' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:586:1: ( ( (lv_name_0_0= ruleTK_MAPPING ) ) otherlv_1= '{' ( (lv_maps_2_0= ruleMapFromTo ) )+ otherlv_3= '}' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:586:1: ( ( (lv_name_0_0= ruleTK_MAPPING ) ) otherlv_1= '{' ( (lv_maps_2_0= ruleMapFromTo ) )+ otherlv_3= '}' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:586:2: ( (lv_name_0_0= ruleTK_MAPPING ) ) otherlv_1= '{' ( (lv_maps_2_0= ruleMapFromTo ) )+ otherlv_3= '}'
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:586:2: ( (lv_name_0_0= ruleTK_MAPPING ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:587:1: (lv_name_0_0= ruleTK_MAPPING )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:587:1: (lv_name_0_0= ruleTK_MAPPING )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:588:3: lv_name_0_0= ruleTK_MAPPING
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getNameTK_MAPPINGParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_MAPPING_in_ruleMapping1071);
            lv_name_0_0=ruleTK_MAPPING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_MAPPING");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleMapping1083); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:608:1: ( (lv_maps_2_0= ruleMapFromTo ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID_WITH_STARTING_LCLETTER) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:609:1: (lv_maps_2_0= ruleMapFromTo )
            	    {
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:609:1: (lv_maps_2_0= ruleMapFromTo )
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:610:3: lv_maps_2_0= ruleMapFromTo
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingAccess().getMapsMapFromToParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapFromTo_in_ruleMapping1104);
            	    lv_maps_2_0=ruleMapFromTo();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"maps",
            	            		lv_maps_2_0, 
            	            		"MapFromTo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleMapping1117); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMapFromTo"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:638:1: entryRuleMapFromTo returns [EObject current=null] : iv_ruleMapFromTo= ruleMapFromTo EOF ;
    public final EObject entryRuleMapFromTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapFromTo = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:639:2: (iv_ruleMapFromTo= ruleMapFromTo EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:640:2: iv_ruleMapFromTo= ruleMapFromTo EOF
            {
             newCompositeNode(grammarAccess.getMapFromToRule()); 
            pushFollow(FOLLOW_ruleMapFromTo_in_entryRuleMapFromTo1153);
            iv_ruleMapFromTo=ruleMapFromTo();

            state._fsp--;

             current =iv_ruleMapFromTo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapFromTo1163); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapFromTo"


    // $ANTLR start "ruleMapFromTo"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:647:1: ruleMapFromTo returns [EObject current=null] : ( ( (lv_from_0_0= ruleParticipantId ) ) ( (lv_to_1_0= ruleParticipantId ) ) otherlv_2= ';' ) ;
    public final EObject ruleMapFromTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_1_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:650:28: ( ( ( (lv_from_0_0= ruleParticipantId ) ) ( (lv_to_1_0= ruleParticipantId ) ) otherlv_2= ';' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:651:1: ( ( (lv_from_0_0= ruleParticipantId ) ) ( (lv_to_1_0= ruleParticipantId ) ) otherlv_2= ';' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:651:1: ( ( (lv_from_0_0= ruleParticipantId ) ) ( (lv_to_1_0= ruleParticipantId ) ) otherlv_2= ';' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:651:2: ( (lv_from_0_0= ruleParticipantId ) ) ( (lv_to_1_0= ruleParticipantId ) ) otherlv_2= ';'
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:651:2: ( (lv_from_0_0= ruleParticipantId ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:652:1: (lv_from_0_0= ruleParticipantId )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:652:1: (lv_from_0_0= ruleParticipantId )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:653:3: lv_from_0_0= ruleParticipantId
            {
             
            	        newCompositeNode(grammarAccess.getMapFromToAccess().getFromParticipantIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipantId_in_ruleMapFromTo1209);
            lv_from_0_0=ruleParticipantId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapFromToRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_0_0, 
                    		"ParticipantId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:669:2: ( (lv_to_1_0= ruleParticipantId ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:670:1: (lv_to_1_0= ruleParticipantId )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:670:1: (lv_to_1_0= ruleParticipantId )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:671:3: lv_to_1_0= ruleParticipantId
            {
             
            	        newCompositeNode(grammarAccess.getMapFromToAccess().getToParticipantIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipantId_in_ruleMapFromTo1230);
            lv_to_1_0=ruleParticipantId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapFromToRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_1_0, 
                    		"ParticipantId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleMapFromTo1242); 

                	newLeafNode(otherlv_2, grammarAccess.getMapFromToAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapFromTo"


    // $ANTLR start "entryRuleTrigger"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:699:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:700:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:701:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger1278);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger1288); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:708:1: ruleTrigger returns [EObject current=null] : ( () ( ( ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )? ) | ( (lv_content_3_0= ruleContent ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_pattern_1_0 = null;

        EObject lv_content_2_0 = null;

        EObject lv_content_3_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:711:28: ( ( () ( ( ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )? ) | ( (lv_content_3_0= ruleContent ) ) ) otherlv_4= ';' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:712:1: ( () ( ( ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )? ) | ( (lv_content_3_0= ruleContent ) ) ) otherlv_4= ';' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:712:1: ( () ( ( ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )? ) | ( (lv_content_3_0= ruleContent ) ) ) otherlv_4= ';' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:712:2: () ( ( ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )? ) | ( (lv_content_3_0= ruleContent ) ) ) otherlv_4= ';'
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:712:2: ()
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:713:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTriggerAccess().getTriggerAction_0(),
                        current);
                

            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:718:2: ( ( ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )? ) | ( (lv_content_3_0= ruleContent ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:718:3: ( ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )? )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:718:3: ( ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )? )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:718:4: ( (lv_pattern_1_0= rulePattern ) ) ( (lv_content_2_0= ruleContent ) )?
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:718:4: ( (lv_pattern_1_0= rulePattern ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:719:1: (lv_pattern_1_0= rulePattern )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:719:1: (lv_pattern_1_0= rulePattern )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:720:3: lv_pattern_1_0= rulePattern
                    {
                     
                    	        newCompositeNode(grammarAccess.getTriggerAccess().getPatternPatternParserRuleCall_1_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePattern_in_ruleTrigger1345);
                    lv_pattern_1_0=rulePattern();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"pattern",
                            		lv_pattern_1_0, 
                            		"Pattern");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:736:2: ( (lv_content_2_0= ruleContent ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==13) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:737:1: (lv_content_2_0= ruleContent )
                            {
                            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:737:1: (lv_content_2_0= ruleContent )
                            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:738:3: lv_content_2_0= ruleContent
                            {
                             
                            	        newCompositeNode(grammarAccess.getTriggerAccess().getContentContentParserRuleCall_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContent_in_ruleTrigger1366);
                            lv_content_2_0=ruleContent();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTriggerRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"content",
                                    		lv_content_2_0, 
                                    		"Content");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:755:6: ( (lv_content_3_0= ruleContent ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:755:6: ( (lv_content_3_0= ruleContent ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:756:1: (lv_content_3_0= ruleContent )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:756:1: (lv_content_3_0= ruleContent )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:757:3: lv_content_3_0= ruleContent
                    {
                     
                    	        newCompositeNode(grammarAccess.getTriggerAccess().getContentContentParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContent_in_ruleTrigger1395);
                    lv_content_3_0=ruleContent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTriggerRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_3_0, 
                            		"Content");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleTrigger1408); 

                	newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRulePattern"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:785:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:786:2: (iv_rulePattern= rulePattern EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:787:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern1444);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern1454); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:794:1: rulePattern returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_TRIGGER ) ) ( (lv_pattern_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token lv_pattern_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:797:28: ( ( ( (lv_name_0_0= ruleTK_TRIGGER ) ) ( (lv_pattern_1_0= RULE_STRING ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:798:1: ( ( (lv_name_0_0= ruleTK_TRIGGER ) ) ( (lv_pattern_1_0= RULE_STRING ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:798:1: ( ( (lv_name_0_0= ruleTK_TRIGGER ) ) ( (lv_pattern_1_0= RULE_STRING ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:798:2: ( (lv_name_0_0= ruleTK_TRIGGER ) ) ( (lv_pattern_1_0= RULE_STRING ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:798:2: ( (lv_name_0_0= ruleTK_TRIGGER ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:799:1: (lv_name_0_0= ruleTK_TRIGGER )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:799:1: (lv_name_0_0= ruleTK_TRIGGER )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:800:3: lv_name_0_0= ruleTK_TRIGGER
            {
             
            	        newCompositeNode(grammarAccess.getPatternAccess().getNameTK_TRIGGERParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_TRIGGER_in_rulePattern1500);
            lv_name_0_0=ruleTK_TRIGGER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPatternRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_TRIGGER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:816:2: ( (lv_pattern_1_0= RULE_STRING ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:817:1: (lv_pattern_1_0= RULE_STRING )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:817:1: (lv_pattern_1_0= RULE_STRING )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:818:3: lv_pattern_1_0= RULE_STRING
            {
            lv_pattern_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePattern1517); 

            			newLeafNode(lv_pattern_1_0, grammarAccess.getPatternAccess().getPatternSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPatternRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pattern",
                    		lv_pattern_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleContent"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:842:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:843:2: (iv_ruleContent= ruleContent EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:844:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent1558);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent1568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:851:1: ruleContent returns [EObject current=null] : (otherlv_0= ':' ( (lv_content_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:854:28: ( (otherlv_0= ':' ( (lv_content_1_0= RULE_STRING ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:855:1: (otherlv_0= ':' ( (lv_content_1_0= RULE_STRING ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:855:1: (otherlv_0= ':' ( (lv_content_1_0= RULE_STRING ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:855:3: otherlv_0= ':' ( (lv_content_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleContent1605); 

                	newLeafNode(otherlv_0, grammarAccess.getContentAccess().getColonKeyword_0());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:859:1: ( (lv_content_1_0= RULE_STRING ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:860:1: (lv_content_1_0= RULE_STRING )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:860:1: (lv_content_1_0= RULE_STRING )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:861:3: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContent1622); 

            			newLeafNode(lv_content_1_0, grammarAccess.getContentAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleOccurrence"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:885:1: entryRuleOccurrence returns [EObject current=null] : iv_ruleOccurrence= ruleOccurrence EOF ;
    public final EObject entryRuleOccurrence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurrence = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:886:2: (iv_ruleOccurrence= ruleOccurrence EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:887:2: iv_ruleOccurrence= ruleOccurrence EOF
            {
             newCompositeNode(grammarAccess.getOccurrenceRule()); 
            pushFollow(FOLLOW_ruleOccurrence_in_entryRuleOccurrence1663);
            iv_ruleOccurrence=ruleOccurrence();

            state._fsp--;

             current =iv_ruleOccurrence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOccurrence1673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurrence"


    // $ANTLR start "ruleOccurrence"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:894:1: ruleOccurrence returns [EObject current=null] : ( ( (lv_participantSource_0_0= ruleParticipantOccurrence ) ) otherlv_1= '--' ( (lv_duty_2_0= ruleDuty ) ) otherlv_3= '->' ( (lv_participantDestination_4_0= ruleParticipantOccurrence ) ) ( ( (lv_trigger_5_0= ruleTrigger ) )+ | otherlv_6= ';' ) ) ;
    public final EObject ruleOccurrence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_participantSource_0_0 = null;

        EObject lv_duty_2_0 = null;

        EObject lv_participantDestination_4_0 = null;

        EObject lv_trigger_5_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:897:28: ( ( ( (lv_participantSource_0_0= ruleParticipantOccurrence ) ) otherlv_1= '--' ( (lv_duty_2_0= ruleDuty ) ) otherlv_3= '->' ( (lv_participantDestination_4_0= ruleParticipantOccurrence ) ) ( ( (lv_trigger_5_0= ruleTrigger ) )+ | otherlv_6= ';' ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:898:1: ( ( (lv_participantSource_0_0= ruleParticipantOccurrence ) ) otherlv_1= '--' ( (lv_duty_2_0= ruleDuty ) ) otherlv_3= '->' ( (lv_participantDestination_4_0= ruleParticipantOccurrence ) ) ( ( (lv_trigger_5_0= ruleTrigger ) )+ | otherlv_6= ';' ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:898:1: ( ( (lv_participantSource_0_0= ruleParticipantOccurrence ) ) otherlv_1= '--' ( (lv_duty_2_0= ruleDuty ) ) otherlv_3= '->' ( (lv_participantDestination_4_0= ruleParticipantOccurrence ) ) ( ( (lv_trigger_5_0= ruleTrigger ) )+ | otherlv_6= ';' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:898:2: ( (lv_participantSource_0_0= ruleParticipantOccurrence ) ) otherlv_1= '--' ( (lv_duty_2_0= ruleDuty ) ) otherlv_3= '->' ( (lv_participantDestination_4_0= ruleParticipantOccurrence ) ) ( ( (lv_trigger_5_0= ruleTrigger ) )+ | otherlv_6= ';' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:898:2: ( (lv_participantSource_0_0= ruleParticipantOccurrence ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:899:1: (lv_participantSource_0_0= ruleParticipantOccurrence )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:899:1: (lv_participantSource_0_0= ruleParticipantOccurrence )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:900:3: lv_participantSource_0_0= ruleParticipantOccurrence
            {
             
            	        newCompositeNode(grammarAccess.getOccurrenceAccess().getParticipantSourceParticipantOccurrenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipantOccurrence_in_ruleOccurrence1719);
            lv_participantSource_0_0=ruleParticipantOccurrence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOccurrenceRule());
            	        }
                   		set(
                   			current, 
                   			"participantSource",
                    		lv_participantSource_0_0, 
                    		"ParticipantOccurrence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleOccurrence1731); 

                	newLeafNode(otherlv_1, grammarAccess.getOccurrenceAccess().getHyphenMinusHyphenMinusKeyword_1());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:920:1: ( (lv_duty_2_0= ruleDuty ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:921:1: (lv_duty_2_0= ruleDuty )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:921:1: (lv_duty_2_0= ruleDuty )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:922:3: lv_duty_2_0= ruleDuty
            {
             
            	        newCompositeNode(grammarAccess.getOccurrenceAccess().getDutyDutyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDuty_in_ruleOccurrence1752);
            lv_duty_2_0=ruleDuty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOccurrenceRule());
            	        }
                   		set(
                   			current, 
                   			"duty",
                    		lv_duty_2_0, 
                    		"Duty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleOccurrence1764); 

                	newLeafNode(otherlv_3, grammarAccess.getOccurrenceAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:942:1: ( (lv_participantDestination_4_0= ruleParticipantOccurrence ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:943:1: (lv_participantDestination_4_0= ruleParticipantOccurrence )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:943:1: (lv_participantDestination_4_0= ruleParticipantOccurrence )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:944:3: lv_participantDestination_4_0= ruleParticipantOccurrence
            {
             
            	        newCompositeNode(grammarAccess.getOccurrenceAccess().getParticipantDestinationParticipantOccurrenceParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipantOccurrence_in_ruleOccurrence1785);
            lv_participantDestination_4_0=ruleParticipantOccurrence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOccurrenceRule());
            	        }
                   		set(
                   			current, 
                   			"participantDestination",
                    		lv_participantDestination_4_0, 
                    		"ParticipantOccurrence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:960:2: ( ( (lv_trigger_5_0= ruleTrigger ) )+ | otherlv_6= ';' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13||LA8_0==37) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:960:3: ( (lv_trigger_5_0= ruleTrigger ) )+
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:960:3: ( (lv_trigger_5_0= ruleTrigger ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13||LA7_0==37) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:961:1: (lv_trigger_5_0= ruleTrigger )
                    	    {
                    	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:961:1: (lv_trigger_5_0= ruleTrigger )
                    	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:962:3: lv_trigger_5_0= ruleTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOccurrenceAccess().getTriggerTriggerParserRuleCall_5_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTrigger_in_ruleOccurrence1807);
                    	    lv_trigger_5_0=ruleTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOccurrenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"trigger",
                    	            		lv_trigger_5_0, 
                    	            		"Trigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:979:7: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleOccurrence1826); 

                        	newLeafNode(otherlv_6, grammarAccess.getOccurrenceAccess().getSemicolonKeyword_5_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurrence"


    // $ANTLR start "entryRuleDuty"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:991:1: entryRuleDuty returns [EObject current=null] : iv_ruleDuty= ruleDuty EOF ;
    public final EObject entryRuleDuty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuty = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:992:2: (iv_ruleDuty= ruleDuty EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:993:2: iv_ruleDuty= ruleDuty EOF
            {
             newCompositeNode(grammarAccess.getDutyRule()); 
            pushFollow(FOLLOW_ruleDuty_in_entryRuleDuty1863);
            iv_ruleDuty=ruleDuty();

            state._fsp--;

             current =iv_ruleDuty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuty1873); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDuty"


    // $ANTLR start "ruleDuty"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1000:1: ruleDuty returns [EObject current=null] : ( ( (lv_dutytype_0_0= ruleDutyType ) ) ( (lv_duty_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDuty() throws RecognitionException {
        EObject current = null;

        Token lv_duty_1_0=null;
        EObject lv_dutytype_0_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1003:28: ( ( ( (lv_dutytype_0_0= ruleDutyType ) ) ( (lv_duty_1_0= RULE_STRING ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1004:1: ( ( (lv_dutytype_0_0= ruleDutyType ) ) ( (lv_duty_1_0= RULE_STRING ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1004:1: ( ( (lv_dutytype_0_0= ruleDutyType ) ) ( (lv_duty_1_0= RULE_STRING ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1004:2: ( (lv_dutytype_0_0= ruleDutyType ) ) ( (lv_duty_1_0= RULE_STRING ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1004:2: ( (lv_dutytype_0_0= ruleDutyType ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1005:1: (lv_dutytype_0_0= ruleDutyType )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1005:1: (lv_dutytype_0_0= ruleDutyType )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1006:3: lv_dutytype_0_0= ruleDutyType
            {
             
            	        newCompositeNode(grammarAccess.getDutyAccess().getDutytypeDutyTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDutyType_in_ruleDuty1919);
            lv_dutytype_0_0=ruleDutyType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDutyRule());
            	        }
                   		set(
                   			current, 
                   			"dutytype",
                    		lv_dutytype_0_0, 
                    		"DutyType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1022:2: ( (lv_duty_1_0= RULE_STRING ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1023:1: (lv_duty_1_0= RULE_STRING )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1023:1: (lv_duty_1_0= RULE_STRING )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1024:3: lv_duty_1_0= RULE_STRING
            {
            lv_duty_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDuty1936); 

            			newLeafNode(lv_duty_1_0, grammarAccess.getDutyAccess().getDutySTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDutyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"duty",
                    		lv_duty_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuty"


    // $ANTLR start "entryRuleDutyType"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1048:1: entryRuleDutyType returns [EObject current=null] : iv_ruleDutyType= ruleDutyType EOF ;
    public final EObject entryRuleDutyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDutyType = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1049:2: (iv_ruleDutyType= ruleDutyType EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1050:2: iv_ruleDutyType= ruleDutyType EOF
            {
             newCompositeNode(grammarAccess.getDutyTypeRule()); 
            pushFollow(FOLLOW_ruleDutyType_in_entryRuleDutyType1977);
            iv_ruleDutyType=ruleDutyType();

            state._fsp--;

             current =iv_ruleDutyType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDutyType1987); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDutyType"


    // $ANTLR start "ruleDutyType"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1057:1: ruleDutyType returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleTK_EVENT ) ) | ( (lv_name_2_0= ruleTK_ACTION ) ) | ( ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']' ) ) ) ;
    public final EObject ruleDutyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_performative_5_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1060:28: ( ( () ( ( (lv_name_1_0= ruleTK_EVENT ) ) | ( (lv_name_2_0= ruleTK_ACTION ) ) | ( ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']' ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1061:1: ( () ( ( (lv_name_1_0= ruleTK_EVENT ) ) | ( (lv_name_2_0= ruleTK_ACTION ) ) | ( ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']' ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1061:1: ( () ( ( (lv_name_1_0= ruleTK_EVENT ) ) | ( (lv_name_2_0= ruleTK_ACTION ) ) | ( ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']' ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1061:2: () ( ( (lv_name_1_0= ruleTK_EVENT ) ) | ( (lv_name_2_0= ruleTK_ACTION ) ) | ( ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']' ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1061:2: ()
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1062:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDutyTypeAccess().getDutyTypeAction_0(),
                        current);
                

            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1067:2: ( ( (lv_name_1_0= ruleTK_EVENT ) ) | ( (lv_name_2_0= ruleTK_ACTION ) ) | ( ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1067:3: ( (lv_name_1_0= ruleTK_EVENT ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1067:3: ( (lv_name_1_0= ruleTK_EVENT ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1068:1: (lv_name_1_0= ruleTK_EVENT )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1068:1: (lv_name_1_0= ruleTK_EVENT )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1069:3: lv_name_1_0= ruleTK_EVENT
                    {
                     
                    	        newCompositeNode(grammarAccess.getDutyTypeAccess().getNameTK_EVENTParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_EVENT_in_ruleDutyType2043);
                    lv_name_1_0=ruleTK_EVENT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDutyTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"TK_EVENT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1086:6: ( (lv_name_2_0= ruleTK_ACTION ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1086:6: ( (lv_name_2_0= ruleTK_ACTION ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1087:1: (lv_name_2_0= ruleTK_ACTION )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1087:1: (lv_name_2_0= ruleTK_ACTION )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1088:3: lv_name_2_0= ruleTK_ACTION
                    {
                     
                    	        newCompositeNode(grammarAccess.getDutyTypeAccess().getNameTK_ACTIONParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_ACTION_in_ruleDutyType2070);
                    lv_name_2_0=ruleTK_ACTION();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDutyTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"TK_ACTION");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1105:6: ( ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']' )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1105:6: ( ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']' )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1105:7: ( (lv_name_3_0= ruleTK_MESSAGE ) ) otherlv_4= '[' ( (lv_performative_5_0= ruleID ) ) otherlv_6= ']'
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1105:7: ( (lv_name_3_0= ruleTK_MESSAGE ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1106:1: (lv_name_3_0= ruleTK_MESSAGE )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1106:1: (lv_name_3_0= ruleTK_MESSAGE )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1107:3: lv_name_3_0= ruleTK_MESSAGE
                    {
                     
                    	        newCompositeNode(grammarAccess.getDutyTypeAccess().getNameTK_MESSAGEParserRuleCall_1_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_MESSAGE_in_ruleDutyType2098);
                    lv_name_3_0=ruleTK_MESSAGE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDutyTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"TK_MESSAGE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleDutyType2110); 

                        	newLeafNode(otherlv_4, grammarAccess.getDutyTypeAccess().getLeftSquareBracketKeyword_1_2_1());
                        
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1127:1: ( (lv_performative_5_0= ruleID ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1128:1: (lv_performative_5_0= ruleID )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1128:1: (lv_performative_5_0= ruleID )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1129:3: lv_performative_5_0= ruleID
                    {
                     
                    	        newCompositeNode(grammarAccess.getDutyTypeAccess().getPerformativeIDParserRuleCall_1_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleID_in_ruleDutyType2131);
                    lv_performative_5_0=ruleID();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDutyTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"performative",
                            		lv_performative_5_0, 
                            		"ID");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleDutyType2143); 

                        	newLeafNode(otherlv_6, grammarAccess.getDutyTypeAccess().getRightSquareBracketKeyword_1_2_3());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDutyType"


    // $ANTLR start "entryRuleParticipantOccurrence"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1157:1: entryRuleParticipantOccurrence returns [EObject current=null] : iv_ruleParticipantOccurrence= ruleParticipantOccurrence EOF ;
    public final EObject entryRuleParticipantOccurrence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantOccurrence = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1158:2: (iv_ruleParticipantOccurrence= ruleParticipantOccurrence EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1159:2: iv_ruleParticipantOccurrence= ruleParticipantOccurrence EOF
            {
             newCompositeNode(grammarAccess.getParticipantOccurrenceRule()); 
            pushFollow(FOLLOW_ruleParticipantOccurrence_in_entryRuleParticipantOccurrence2181);
            iv_ruleParticipantOccurrence=ruleParticipantOccurrence();

            state._fsp--;

             current =iv_ruleParticipantOccurrence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantOccurrence2191); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantOccurrence"


    // $ANTLR start "ruleParticipantOccurrence"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1166:1: ruleParticipantOccurrence returns [EObject current=null] : ( ( (lv_participantSource_0_0= ruleParticipantId ) ) (otherlv_1= '[' ( (lv_cardinality_2_0= RULE_INTEGER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleParticipantOccurrence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_cardinality_2_0=null;
        Token otherlv_3=null;
        EObject lv_participantSource_0_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1169:28: ( ( ( (lv_participantSource_0_0= ruleParticipantId ) ) (otherlv_1= '[' ( (lv_cardinality_2_0= RULE_INTEGER ) ) otherlv_3= ']' )? ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1170:1: ( ( (lv_participantSource_0_0= ruleParticipantId ) ) (otherlv_1= '[' ( (lv_cardinality_2_0= RULE_INTEGER ) ) otherlv_3= ']' )? )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1170:1: ( ( (lv_participantSource_0_0= ruleParticipantId ) ) (otherlv_1= '[' ( (lv_cardinality_2_0= RULE_INTEGER ) ) otherlv_3= ']' )? )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1170:2: ( (lv_participantSource_0_0= ruleParticipantId ) ) (otherlv_1= '[' ( (lv_cardinality_2_0= RULE_INTEGER ) ) otherlv_3= ']' )?
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1170:2: ( (lv_participantSource_0_0= ruleParticipantId ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1171:1: (lv_participantSource_0_0= ruleParticipantId )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1171:1: (lv_participantSource_0_0= ruleParticipantId )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1172:3: lv_participantSource_0_0= ruleParticipantId
            {
             
            	        newCompositeNode(grammarAccess.getParticipantOccurrenceAccess().getParticipantSourceParticipantIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipantId_in_ruleParticipantOccurrence2237);
            lv_participantSource_0_0=ruleParticipantId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantOccurrenceRule());
            	        }
                   		set(
                   			current, 
                   			"participantSource",
                    		lv_participantSource_0_0, 
                    		"ParticipantId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1188:2: (otherlv_1= '[' ( (lv_cardinality_2_0= RULE_INTEGER ) ) otherlv_3= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1188:4: otherlv_1= '[' ( (lv_cardinality_2_0= RULE_INTEGER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleParticipantOccurrence2250); 

                        	newLeafNode(otherlv_1, grammarAccess.getParticipantOccurrenceAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1192:1: ( (lv_cardinality_2_0= RULE_INTEGER ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1193:1: (lv_cardinality_2_0= RULE_INTEGER )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1193:1: (lv_cardinality_2_0= RULE_INTEGER )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1194:3: lv_cardinality_2_0= RULE_INTEGER
                    {
                    lv_cardinality_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleParticipantOccurrence2267); 

                    			newLeafNode(lv_cardinality_2_0, grammarAccess.getParticipantOccurrenceAccess().getCardinalityINTEGERTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParticipantOccurrenceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_2_0, 
                            		"INTEGER");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleParticipantOccurrence2284); 

                        	newLeafNode(otherlv_3, grammarAccess.getParticipantOccurrenceAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantOccurrence"


    // $ANTLR start "entryRuleStates"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1222:1: entryRuleStates returns [EObject current=null] : iv_ruleStates= ruleStates EOF ;
    public final EObject entryRuleStates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStates = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1223:2: (iv_ruleStates= ruleStates EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1224:2: iv_ruleStates= ruleStates EOF
            {
             newCompositeNode(grammarAccess.getStatesRule()); 
            pushFollow(FOLLOW_ruleStates_in_entryRuleStates2322);
            iv_ruleStates=ruleStates();

            state._fsp--;

             current =iv_ruleStates; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStates2332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStates"


    // $ANTLR start "ruleStates"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1231:1: ruleStates returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_STATES ) ) otherlv_1= ':' ( (lv_states_2_0= ruleState ) )+ ) ;
    public final EObject ruleStates() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_states_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1234:28: ( ( ( (lv_name_0_0= ruleTK_STATES ) ) otherlv_1= ':' ( (lv_states_2_0= ruleState ) )+ ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1235:1: ( ( (lv_name_0_0= ruleTK_STATES ) ) otherlv_1= ':' ( (lv_states_2_0= ruleState ) )+ )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1235:1: ( ( (lv_name_0_0= ruleTK_STATES ) ) otherlv_1= ':' ( (lv_states_2_0= ruleState ) )+ )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1235:2: ( (lv_name_0_0= ruleTK_STATES ) ) otherlv_1= ':' ( (lv_states_2_0= ruleState ) )+
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1235:2: ( (lv_name_0_0= ruleTK_STATES ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1236:1: (lv_name_0_0= ruleTK_STATES )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1236:1: (lv_name_0_0= ruleTK_STATES )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1237:3: lv_name_0_0= ruleTK_STATES
            {
             
            	        newCompositeNode(grammarAccess.getStatesAccess().getNameTK_STATESParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_STATES_in_ruleStates2378);
            lv_name_0_0=ruleTK_STATES();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStatesRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_STATES");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleStates2390); 

                	newLeafNode(otherlv_1, grammarAccess.getStatesAccess().getColonKeyword_1());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1257:1: ( (lv_states_2_0= ruleState ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID_WITH_STARTING_LCLETTER) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1258:1: (lv_states_2_0= ruleState )
            	    {
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1258:1: (lv_states_2_0= ruleState )
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1259:3: lv_states_2_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStates2411);
            	    lv_states_2_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_2_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStates"


    // $ANTLR start "entryRuleState"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1283:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1284:2: (iv_ruleState= ruleState EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1285:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState2448);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState2458); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1292:1: ruleState returns [EObject current=null] : ( ( (lv_id_0_0= ruleStateId ) ) ( (lv_type_1_0= ruleStateType ) ) otherlv_2= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_id_0_0 = null;

        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1295:28: ( ( ( (lv_id_0_0= ruleStateId ) ) ( (lv_type_1_0= ruleStateType ) ) otherlv_2= ';' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1296:1: ( ( (lv_id_0_0= ruleStateId ) ) ( (lv_type_1_0= ruleStateType ) ) otherlv_2= ';' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1296:1: ( ( (lv_id_0_0= ruleStateId ) ) ( (lv_type_1_0= ruleStateType ) ) otherlv_2= ';' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1296:2: ( (lv_id_0_0= ruleStateId ) ) ( (lv_type_1_0= ruleStateType ) ) otherlv_2= ';'
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1296:2: ( (lv_id_0_0= ruleStateId ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1297:1: (lv_id_0_0= ruleStateId )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1297:1: (lv_id_0_0= ruleStateId )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1298:3: lv_id_0_0= ruleStateId
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getIdStateIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStateId_in_ruleState2504);
            lv_id_0_0=ruleStateId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"StateId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1314:2: ( (lv_type_1_0= ruleStateType ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1315:1: (lv_type_1_0= ruleStateType )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1315:1: (lv_type_1_0= ruleStateType )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1316:3: lv_type_1_0= ruleStateType
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateType_in_ruleState2525);
            lv_type_1_0=ruleStateType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"StateType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleState2537); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateId"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1344:1: entryRuleStateId returns [EObject current=null] : iv_ruleStateId= ruleStateId EOF ;
    public final EObject entryRuleStateId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateId = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1345:2: (iv_ruleStateId= ruleStateId EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1346:2: iv_ruleStateId= ruleStateId EOF
            {
             newCompositeNode(grammarAccess.getStateIdRule()); 
            pushFollow(FOLLOW_ruleStateId_in_entryRuleStateId2573);
            iv_ruleStateId=ruleStateId();

            state._fsp--;

             current =iv_ruleStateId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateId2583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateId"


    // $ANTLR start "ruleStateId"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1353:1: ruleStateId returns [EObject current=null] : ( (lv_name_0_0= ruleID ) ) ;
    public final EObject ruleStateId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1356:28: ( ( (lv_name_0_0= ruleID ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1357:1: ( (lv_name_0_0= ruleID ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1357:1: ( (lv_name_0_0= ruleID ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1358:1: (lv_name_0_0= ruleID )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1358:1: (lv_name_0_0= ruleID )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1359:3: lv_name_0_0= ruleID
            {
             
            	        newCompositeNode(grammarAccess.getStateIdAccess().getNameIDParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleStateId2628);
            lv_name_0_0=ruleID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateIdRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateId"


    // $ANTLR start "entryRuleStateType"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1383:1: entryRuleStateType returns [EObject current=null] : iv_ruleStateType= ruleStateType EOF ;
    public final EObject entryRuleStateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateType = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1384:2: (iv_ruleStateType= ruleStateType EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1385:2: iv_ruleStateType= ruleStateType EOF
            {
             newCompositeNode(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType2663);
            iv_ruleStateType=ruleStateType();

            state._fsp--;

             current =iv_ruleStateType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType2673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateType"


    // $ANTLR start "ruleStateType"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1392:1: ruleStateType returns [EObject current=null] : ( () ( ( (lv_initial_1_0= ruleTK_INITIAL ) ) | ( (lv_final_2_0= ruleTK_FINAL ) ) )? ) ;
    public final EObject ruleStateType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_initial_1_0 = null;

        AntlrDatatypeRuleToken lv_final_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1395:28: ( ( () ( ( (lv_initial_1_0= ruleTK_INITIAL ) ) | ( (lv_final_2_0= ruleTK_FINAL ) ) )? ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1396:1: ( () ( ( (lv_initial_1_0= ruleTK_INITIAL ) ) | ( (lv_final_2_0= ruleTK_FINAL ) ) )? )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1396:1: ( () ( ( (lv_initial_1_0= ruleTK_INITIAL ) ) | ( (lv_final_2_0= ruleTK_FINAL ) ) )? )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1396:2: () ( ( (lv_initial_1_0= ruleTK_INITIAL ) ) | ( (lv_final_2_0= ruleTK_FINAL ) ) )?
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1396:2: ()
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1397:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateTypeAccess().getStateTypeAction_0(),
                        current);
                

            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1402:2: ( ( (lv_initial_1_0= ruleTK_INITIAL ) ) | ( (lv_final_2_0= ruleTK_FINAL ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1402:3: ( (lv_initial_1_0= ruleTK_INITIAL ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1402:3: ( (lv_initial_1_0= ruleTK_INITIAL ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1403:1: (lv_initial_1_0= ruleTK_INITIAL )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1403:1: (lv_initial_1_0= ruleTK_INITIAL )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1404:3: lv_initial_1_0= ruleTK_INITIAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateTypeAccess().getInitialTK_INITIALParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_INITIAL_in_ruleStateType2729);
                    lv_initial_1_0=ruleTK_INITIAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"initial",
                            		lv_initial_1_0, 
                            		"TK_INITIAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1421:6: ( (lv_final_2_0= ruleTK_FINAL ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1421:6: ( (lv_final_2_0= ruleTK_FINAL ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1422:1: (lv_final_2_0= ruleTK_FINAL )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1422:1: (lv_final_2_0= ruleTK_FINAL )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1423:3: lv_final_2_0= ruleTK_FINAL
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateTypeAccess().getFinalTK_FINALParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_FINAL_in_ruleStateType2756);
                    lv_final_2_0=ruleTK_FINAL();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"final",
                            		lv_final_2_0, 
                            		"TK_FINAL");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateType"


    // $ANTLR start "entryRuleParticipants"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1447:1: entryRuleParticipants returns [EObject current=null] : iv_ruleParticipants= ruleParticipants EOF ;
    public final EObject entryRuleParticipants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipants = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1448:2: (iv_ruleParticipants= ruleParticipants EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1449:2: iv_ruleParticipants= ruleParticipants EOF
            {
             newCompositeNode(grammarAccess.getParticipantsRule()); 
            pushFollow(FOLLOW_ruleParticipants_in_entryRuleParticipants2794);
            iv_ruleParticipants=ruleParticipants();

            state._fsp--;

             current =iv_ruleParticipants; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipants2804); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipants"


    // $ANTLR start "ruleParticipants"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1456:1: ruleParticipants returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_PARTICIPANTS ) ) otherlv_1= ':' ( (lv_participants_2_0= ruleParticipant ) )+ ) ;
    public final EObject ruleParticipants() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_participants_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1459:28: ( ( ( (lv_name_0_0= ruleTK_PARTICIPANTS ) ) otherlv_1= ':' ( (lv_participants_2_0= ruleParticipant ) )+ ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1460:1: ( ( (lv_name_0_0= ruleTK_PARTICIPANTS ) ) otherlv_1= ':' ( (lv_participants_2_0= ruleParticipant ) )+ )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1460:1: ( ( (lv_name_0_0= ruleTK_PARTICIPANTS ) ) otherlv_1= ':' ( (lv_participants_2_0= ruleParticipant ) )+ )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1460:2: ( (lv_name_0_0= ruleTK_PARTICIPANTS ) ) otherlv_1= ':' ( (lv_participants_2_0= ruleParticipant ) )+
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1460:2: ( (lv_name_0_0= ruleTK_PARTICIPANTS ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1461:1: (lv_name_0_0= ruleTK_PARTICIPANTS )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1461:1: (lv_name_0_0= ruleTK_PARTICIPANTS )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1462:3: lv_name_0_0= ruleTK_PARTICIPANTS
            {
             
            	        newCompositeNode(grammarAccess.getParticipantsAccess().getNameTK_PARTICIPANTSParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_PARTICIPANTS_in_ruleParticipants2850);
            lv_name_0_0=ruleTK_PARTICIPANTS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantsRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_PARTICIPANTS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleParticipants2862); 

                	newLeafNode(otherlv_1, grammarAccess.getParticipantsAccess().getColonKeyword_1());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1482:1: ( (lv_participants_2_0= ruleParticipant ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID_WITH_STARTING_LCLETTER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1483:1: (lv_participants_2_0= ruleParticipant )
            	    {
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1483:1: (lv_participants_2_0= ruleParticipant )
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1484:3: lv_participants_2_0= ruleParticipant
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParticipantsAccess().getParticipantsParticipantParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParticipant_in_ruleParticipants2883);
            	    lv_participants_2_0=ruleParticipant();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParticipantsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"participants",
            	            		lv_participants_2_0, 
            	            		"Participant");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipants"


    // $ANTLR start "entryRuleParticipant"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1508:1: entryRuleParticipant returns [EObject current=null] : iv_ruleParticipant= ruleParticipant EOF ;
    public final EObject entryRuleParticipant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipant = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1509:2: (iv_ruleParticipant= ruleParticipant EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1510:2: iv_ruleParticipant= ruleParticipant EOF
            {
             newCompositeNode(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant2920);
            iv_ruleParticipant=ruleParticipant();

            state._fsp--;

             current =iv_ruleParticipant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant2930); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1517:1: ruleParticipant returns [EObject current=null] : ( ( (lv_name_0_0= ruleParticipantId ) ) ( (lv_participantDescription_1_0= ruleParticipantDescription ) ) otherlv_2= ';' ) ;
    public final EObject ruleParticipant() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_name_0_0 = null;

        EObject lv_participantDescription_1_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1520:28: ( ( ( (lv_name_0_0= ruleParticipantId ) ) ( (lv_participantDescription_1_0= ruleParticipantDescription ) ) otherlv_2= ';' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1521:1: ( ( (lv_name_0_0= ruleParticipantId ) ) ( (lv_participantDescription_1_0= ruleParticipantDescription ) ) otherlv_2= ';' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1521:1: ( ( (lv_name_0_0= ruleParticipantId ) ) ( (lv_participantDescription_1_0= ruleParticipantDescription ) ) otherlv_2= ';' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1521:2: ( (lv_name_0_0= ruleParticipantId ) ) ( (lv_participantDescription_1_0= ruleParticipantDescription ) ) otherlv_2= ';'
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1521:2: ( (lv_name_0_0= ruleParticipantId ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1522:1: (lv_name_0_0= ruleParticipantId )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1522:1: (lv_name_0_0= ruleParticipantId )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1523:3: lv_name_0_0= ruleParticipantId
            {
             
            	        newCompositeNode(grammarAccess.getParticipantAccess().getNameParticipantIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipantId_in_ruleParticipant2976);
            lv_name_0_0=ruleParticipantId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ParticipantId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1539:2: ( (lv_participantDescription_1_0= ruleParticipantDescription ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1540:1: (lv_participantDescription_1_0= ruleParticipantDescription )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1540:1: (lv_participantDescription_1_0= ruleParticipantDescription )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1541:3: lv_participantDescription_1_0= ruleParticipantDescription
            {
             
            	        newCompositeNode(grammarAccess.getParticipantAccess().getParticipantDescriptionParticipantDescriptionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipantDescription_in_ruleParticipant2997);
            lv_participantDescription_1_0=ruleParticipantDescription();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantRule());
            	        }
                   		set(
                   			current, 
                   			"participantDescription",
                    		lv_participantDescription_1_0, 
                    		"ParticipantDescription");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleParticipant3009); 

                	newLeafNode(otherlv_2, grammarAccess.getParticipantAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleParticipantId"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1569:1: entryRuleParticipantId returns [EObject current=null] : iv_ruleParticipantId= ruleParticipantId EOF ;
    public final EObject entryRuleParticipantId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantId = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1570:2: (iv_ruleParticipantId= ruleParticipantId EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1571:2: iv_ruleParticipantId= ruleParticipantId EOF
            {
             newCompositeNode(grammarAccess.getParticipantIdRule()); 
            pushFollow(FOLLOW_ruleParticipantId_in_entryRuleParticipantId3045);
            iv_ruleParticipantId=ruleParticipantId();

            state._fsp--;

             current =iv_ruleParticipantId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantId3055); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantId"


    // $ANTLR start "ruleParticipantId"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1578:1: ruleParticipantId returns [EObject current=null] : ( (lv_name_0_0= ruleID ) ) ;
    public final EObject ruleParticipantId() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1581:28: ( ( (lv_name_0_0= ruleID ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1582:1: ( (lv_name_0_0= ruleID ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1582:1: ( (lv_name_0_0= ruleID ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1583:1: (lv_name_0_0= ruleID )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1583:1: (lv_name_0_0= ruleID )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1584:3: lv_name_0_0= ruleID
            {
             
            	        newCompositeNode(grammarAccess.getParticipantIdAccess().getNameIDParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleID_in_ruleParticipantId3100);
            lv_name_0_0=ruleID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantIdRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantId"


    // $ANTLR start "entryRuleParticipantDescription"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1608:1: entryRuleParticipantDescription returns [EObject current=null] : iv_ruleParticipantDescription= ruleParticipantDescription EOF ;
    public final EObject entryRuleParticipantDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantDescription = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1609:2: (iv_ruleParticipantDescription= ruleParticipantDescription EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1610:2: iv_ruleParticipantDescription= ruleParticipantDescription EOF
            {
             newCompositeNode(grammarAccess.getParticipantDescriptionRule()); 
            pushFollow(FOLLOW_ruleParticipantDescription_in_entryRuleParticipantDescription3135);
            iv_ruleParticipantDescription=ruleParticipantDescription();

            state._fsp--;

             current =iv_ruleParticipantDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantDescription3145); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantDescription"


    // $ANTLR start "ruleParticipantDescription"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1617:1: ruleParticipantDescription returns [EObject current=null] : ( ( ( ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) ) ) | ( ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) ) ) ) ( (lv_card_4_0= ruleParticipantCardinality ) ) ) ;
    public final EObject ruleParticipantDescription() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_kind_0_0 = null;

        EObject lv_role_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_card_4_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1620:28: ( ( ( ( ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) ) ) | ( ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) ) ) ) ( (lv_card_4_0= ruleParticipantCardinality ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1621:1: ( ( ( ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) ) ) | ( ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) ) ) ) ( (lv_card_4_0= ruleParticipantCardinality ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1621:1: ( ( ( ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) ) ) | ( ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) ) ) ) ( (lv_card_4_0= ruleParticipantCardinality ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1621:2: ( ( ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) ) ) | ( ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) ) ) ) ( (lv_card_4_0= ruleParticipantCardinality ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1621:2: ( ( ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) ) ) | ( ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1621:3: ( ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1621:3: ( ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1621:4: ( (lv_kind_0_0= ruleTK_AGENT ) ) ( (lv_role_1_0= ruleRole ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1621:4: ( (lv_kind_0_0= ruleTK_AGENT ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1622:1: (lv_kind_0_0= ruleTK_AGENT )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1622:1: (lv_kind_0_0= ruleTK_AGENT )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1623:3: lv_kind_0_0= ruleTK_AGENT
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantDescriptionAccess().getKindTK_AGENTParserRuleCall_0_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_AGENT_in_ruleParticipantDescription3193);
                    lv_kind_0_0=ruleTK_AGENT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"kind",
                            		lv_kind_0_0, 
                            		"TK_AGENT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1639:2: ( (lv_role_1_0= ruleRole ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1640:1: (lv_role_1_0= ruleRole )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1640:1: (lv_role_1_0= ruleRole )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1641:3: lv_role_1_0= ruleRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantDescriptionAccess().getRoleRoleParserRuleCall_0_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRole_in_ruleParticipantDescription3214);
                    lv_role_1_0=ruleRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"role",
                            		lv_role_1_0, 
                            		"Role");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1658:6: ( ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1658:6: ( ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1658:7: ( (lv_kind_2_0= ruleTK_ARTIFACT ) ) ( (lv_type_3_0= ruleType ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1658:7: ( (lv_kind_2_0= ruleTK_ARTIFACT ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1659:1: (lv_kind_2_0= ruleTK_ARTIFACT )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1659:1: (lv_kind_2_0= ruleTK_ARTIFACT )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1660:3: lv_kind_2_0= ruleTK_ARTIFACT
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantDescriptionAccess().getKindTK_ARTIFACTParserRuleCall_0_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_ARTIFACT_in_ruleParticipantDescription3243);
                    lv_kind_2_0=ruleTK_ARTIFACT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"kind",
                            		lv_kind_2_0, 
                            		"TK_ARTIFACT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1676:2: ( (lv_type_3_0= ruleType ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1677:1: (lv_type_3_0= ruleType )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1677:1: (lv_type_3_0= ruleType )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1678:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantDescriptionAccess().getTypeTypeParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleParticipantDescription3264);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1694:4: ( (lv_card_4_0= ruleParticipantCardinality ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1695:1: (lv_card_4_0= ruleParticipantCardinality )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1695:1: (lv_card_4_0= ruleParticipantCardinality )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1696:3: lv_card_4_0= ruleParticipantCardinality
            {
             
            	        newCompositeNode(grammarAccess.getParticipantDescriptionAccess().getCardParticipantCardinalityParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParticipantCardinality_in_ruleParticipantDescription3287);
            lv_card_4_0=ruleParticipantCardinality();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantDescriptionRule());
            	        }
                   		set(
                   			current, 
                   			"card",
                    		lv_card_4_0, 
                    		"ParticipantCardinality");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantDescription"


    // $ANTLR start "entryRuleParticipantCardinality"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1720:1: entryRuleParticipantCardinality returns [EObject current=null] : iv_ruleParticipantCardinality= ruleParticipantCardinality EOF ;
    public final EObject entryRuleParticipantCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantCardinality = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1721:2: (iv_ruleParticipantCardinality= ruleParticipantCardinality EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1722:2: iv_ruleParticipantCardinality= ruleParticipantCardinality EOF
            {
             newCompositeNode(grammarAccess.getParticipantCardinalityRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinality_in_entryRuleParticipantCardinality3323);
            iv_ruleParticipantCardinality=ruleParticipantCardinality();

            state._fsp--;

             current =iv_ruleParticipantCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinality3333); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantCardinality"


    // $ANTLR start "ruleParticipantCardinality"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1729:1: ruleParticipantCardinality returns [EObject current=null] : ( ( () ( (lv_cardAll_1_0= ruleParticipantCardinalityAll ) ) ) | ( (lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax ) ) ) ;
    public final EObject ruleParticipantCardinality() throws RecognitionException {
        EObject current = null;

        EObject lv_cardAll_1_0 = null;

        EObject lv_cardMinMax_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1732:28: ( ( ( () ( (lv_cardAll_1_0= ruleParticipantCardinalityAll ) ) ) | ( (lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1733:1: ( ( () ( (lv_cardAll_1_0= ruleParticipantCardinalityAll ) ) ) | ( (lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1733:1: ( ( () ( (lv_cardAll_1_0= ruleParticipantCardinalityAll ) ) ) | ( (lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            else if ( (LA15_0==EOF||LA15_0==16||(LA15_0>=27 && LA15_0<=28)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1733:2: ( () ( (lv_cardAll_1_0= ruleParticipantCardinalityAll ) ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1733:2: ( () ( (lv_cardAll_1_0= ruleParticipantCardinalityAll ) ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1733:3: () ( (lv_cardAll_1_0= ruleParticipantCardinalityAll ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1733:3: ()
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1734:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getParticipantCardinalityAccess().getParticipantCardinalityAction_0_0(),
                                current);
                        

                    }

                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1739:2: ( (lv_cardAll_1_0= ruleParticipantCardinalityAll ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1740:1: (lv_cardAll_1_0= ruleParticipantCardinalityAll )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1740:1: (lv_cardAll_1_0= ruleParticipantCardinalityAll )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1741:3: lv_cardAll_1_0= ruleParticipantCardinalityAll
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantCardinalityAccess().getCardAllParticipantCardinalityAllParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParticipantCardinalityAll_in_ruleParticipantCardinality3389);
                    lv_cardAll_1_0=ruleParticipantCardinalityAll();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantCardinalityRule());
                    	        }
                           		set(
                           			current, 
                           			"cardAll",
                            		lv_cardAll_1_0, 
                            		"ParticipantCardinalityAll");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1758:6: ( (lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1758:6: ( (lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1759:1: (lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1759:1: (lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1760:3: lv_cardMinMax_2_0= ruleParticipantCardinalityMinMax
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantCardinalityAccess().getCardMinMaxParticipantCardinalityMinMaxParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParticipantCardinalityMinMax_in_ruleParticipantCardinality3417);
                    lv_cardMinMax_2_0=ruleParticipantCardinalityMinMax();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantCardinalityRule());
                    	        }
                           		set(
                           			current, 
                           			"cardMinMax",
                            		lv_cardMinMax_2_0, 
                            		"ParticipantCardinalityMinMax");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantCardinality"


    // $ANTLR start "entryRuleParticipantCardinalityMinMax"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1784:1: entryRuleParticipantCardinalityMinMax returns [EObject current=null] : iv_ruleParticipantCardinalityMinMax= ruleParticipantCardinalityMinMax EOF ;
    public final EObject entryRuleParticipantCardinalityMinMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantCardinalityMinMax = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1785:2: (iv_ruleParticipantCardinalityMinMax= ruleParticipantCardinalityMinMax EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1786:2: iv_ruleParticipantCardinalityMinMax= ruleParticipantCardinalityMinMax EOF
            {
             newCompositeNode(grammarAccess.getParticipantCardinalityMinMaxRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMinMax_in_entryRuleParticipantCardinalityMinMax3453);
            iv_ruleParticipantCardinalityMinMax=ruleParticipantCardinalityMinMax();

            state._fsp--;

             current =iv_ruleParticipantCardinalityMinMax; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinalityMinMax3463); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantCardinalityMinMax"


    // $ANTLR start "ruleParticipantCardinalityMinMax"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1793:1: ruleParticipantCardinalityMinMax returns [EObject current=null] : ( () ( (lv_min_1_0= ruleParticipantCardinalityMin ) )? ( (lv_max_2_0= ruleParticipantCardinalityMax ) )? ) ;
    public final EObject ruleParticipantCardinalityMinMax() throws RecognitionException {
        EObject current = null;

        EObject lv_min_1_0 = null;

        EObject lv_max_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1796:28: ( ( () ( (lv_min_1_0= ruleParticipantCardinalityMin ) )? ( (lv_max_2_0= ruleParticipantCardinalityMax ) )? ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1797:1: ( () ( (lv_min_1_0= ruleParticipantCardinalityMin ) )? ( (lv_max_2_0= ruleParticipantCardinalityMax ) )? )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1797:1: ( () ( (lv_min_1_0= ruleParticipantCardinalityMin ) )? ( (lv_max_2_0= ruleParticipantCardinalityMax ) )? )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1797:2: () ( (lv_min_1_0= ruleParticipantCardinalityMin ) )? ( (lv_max_2_0= ruleParticipantCardinalityMax ) )?
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1797:2: ()
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1798:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParticipantCardinalityMinMaxAccess().getParticipantCardinalityMinMaxAction_0(),
                        current);
                

            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1803:2: ( (lv_min_1_0= ruleParticipantCardinalityMin ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1804:1: (lv_min_1_0= ruleParticipantCardinalityMin )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1804:1: (lv_min_1_0= ruleParticipantCardinalityMin )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1805:3: lv_min_1_0= ruleParticipantCardinalityMin
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantCardinalityMinMaxAccess().getMinParticipantCardinalityMinParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParticipantCardinalityMin_in_ruleParticipantCardinalityMinMax3518);
                    lv_min_1_0=ruleParticipantCardinalityMin();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantCardinalityMinMaxRule());
                    	        }
                           		set(
                           			current, 
                           			"min",
                            		lv_min_1_0, 
                            		"ParticipantCardinalityMin");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1821:3: ( (lv_max_2_0= ruleParticipantCardinalityMax ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1822:1: (lv_max_2_0= ruleParticipantCardinalityMax )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1822:1: (lv_max_2_0= ruleParticipantCardinalityMax )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1823:3: lv_max_2_0= ruleParticipantCardinalityMax
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantCardinalityMinMaxAccess().getMaxParticipantCardinalityMaxParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParticipantCardinalityMax_in_ruleParticipantCardinalityMinMax3540);
                    lv_max_2_0=ruleParticipantCardinalityMax();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantCardinalityMinMaxRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_2_0, 
                            		"ParticipantCardinalityMax");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantCardinalityMinMax"


    // $ANTLR start "entryRuleParticipantCardinalityMin"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1847:1: entryRuleParticipantCardinalityMin returns [EObject current=null] : iv_ruleParticipantCardinalityMin= ruleParticipantCardinalityMin EOF ;
    public final EObject entryRuleParticipantCardinalityMin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantCardinalityMin = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1848:2: (iv_ruleParticipantCardinalityMin= ruleParticipantCardinalityMin EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1849:2: iv_ruleParticipantCardinalityMin= ruleParticipantCardinalityMin EOF
            {
             newCompositeNode(grammarAccess.getParticipantCardinalityMinRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMin_in_entryRuleParticipantCardinalityMin3577);
            iv_ruleParticipantCardinalityMin=ruleParticipantCardinalityMin();

            state._fsp--;

             current =iv_ruleParticipantCardinalityMin; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinalityMin3587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantCardinalityMin"


    // $ANTLR start "ruleParticipantCardinalityMin"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1856:1: ruleParticipantCardinalityMin returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_MIN ) ) ( (lv_min_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleParticipantCardinalityMin() throws RecognitionException {
        EObject current = null;

        Token lv_min_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1859:28: ( ( ( (lv_name_0_0= ruleTK_MIN ) ) ( (lv_min_1_0= RULE_INTEGER ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1860:1: ( ( (lv_name_0_0= ruleTK_MIN ) ) ( (lv_min_1_0= RULE_INTEGER ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1860:1: ( ( (lv_name_0_0= ruleTK_MIN ) ) ( (lv_min_1_0= RULE_INTEGER ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1860:2: ( (lv_name_0_0= ruleTK_MIN ) ) ( (lv_min_1_0= RULE_INTEGER ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1860:2: ( (lv_name_0_0= ruleTK_MIN ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1861:1: (lv_name_0_0= ruleTK_MIN )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1861:1: (lv_name_0_0= ruleTK_MIN )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1862:3: lv_name_0_0= ruleTK_MIN
            {
             
            	        newCompositeNode(grammarAccess.getParticipantCardinalityMinAccess().getNameTK_MINParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_MIN_in_ruleParticipantCardinalityMin3633);
            lv_name_0_0=ruleTK_MIN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantCardinalityMinRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_MIN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1878:2: ( (lv_min_1_0= RULE_INTEGER ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1879:1: (lv_min_1_0= RULE_INTEGER )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1879:1: (lv_min_1_0= RULE_INTEGER )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1880:3: lv_min_1_0= RULE_INTEGER
            {
            lv_min_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleParticipantCardinalityMin3650); 

            			newLeafNode(lv_min_1_0, grammarAccess.getParticipantCardinalityMinAccess().getMinINTEGERTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getParticipantCardinalityMinRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"min",
                    		lv_min_1_0, 
                    		"INTEGER");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantCardinalityMin"


    // $ANTLR start "entryRuleParticipantCardinalityMax"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1904:1: entryRuleParticipantCardinalityMax returns [EObject current=null] : iv_ruleParticipantCardinalityMax= ruleParticipantCardinalityMax EOF ;
    public final EObject entryRuleParticipantCardinalityMax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantCardinalityMax = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1905:2: (iv_ruleParticipantCardinalityMax= ruleParticipantCardinalityMax EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1906:2: iv_ruleParticipantCardinalityMax= ruleParticipantCardinalityMax EOF
            {
             newCompositeNode(grammarAccess.getParticipantCardinalityMaxRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMax_in_entryRuleParticipantCardinalityMax3691);
            iv_ruleParticipantCardinalityMax=ruleParticipantCardinalityMax();

            state._fsp--;

             current =iv_ruleParticipantCardinalityMax; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinalityMax3701); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantCardinalityMax"


    // $ANTLR start "ruleParticipantCardinalityMax"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1913:1: ruleParticipantCardinalityMax returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_MAX ) ) ( ( (lv_max_1_0= RULE_INTEGER ) ) | ( (lv_max2_2_0= ruleTK_PLUS ) ) ) ) ;
    public final EObject ruleParticipantCardinalityMax() throws RecognitionException {
        EObject current = null;

        Token lv_max_1_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_max2_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1916:28: ( ( ( (lv_name_0_0= ruleTK_MAX ) ) ( ( (lv_max_1_0= RULE_INTEGER ) ) | ( (lv_max2_2_0= ruleTK_PLUS ) ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1917:1: ( ( (lv_name_0_0= ruleTK_MAX ) ) ( ( (lv_max_1_0= RULE_INTEGER ) ) | ( (lv_max2_2_0= ruleTK_PLUS ) ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1917:1: ( ( (lv_name_0_0= ruleTK_MAX ) ) ( ( (lv_max_1_0= RULE_INTEGER ) ) | ( (lv_max2_2_0= ruleTK_PLUS ) ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1917:2: ( (lv_name_0_0= ruleTK_MAX ) ) ( ( (lv_max_1_0= RULE_INTEGER ) ) | ( (lv_max2_2_0= ruleTK_PLUS ) ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1917:2: ( (lv_name_0_0= ruleTK_MAX ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1918:1: (lv_name_0_0= ruleTK_MAX )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1918:1: (lv_name_0_0= ruleTK_MAX )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1919:3: lv_name_0_0= ruleTK_MAX
            {
             
            	        newCompositeNode(grammarAccess.getParticipantCardinalityMaxAccess().getNameTK_MAXParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_MAX_in_ruleParticipantCardinalityMax3747);
            lv_name_0_0=ruleTK_MAX();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantCardinalityMaxRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_MAX");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1935:2: ( ( (lv_max_1_0= RULE_INTEGER ) ) | ( (lv_max2_2_0= ruleTK_PLUS ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INTEGER) ) {
                alt18=1;
            }
            else if ( (LA18_0==41) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1935:3: ( (lv_max_1_0= RULE_INTEGER ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1935:3: ( (lv_max_1_0= RULE_INTEGER ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1936:1: (lv_max_1_0= RULE_INTEGER )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1936:1: (lv_max_1_0= RULE_INTEGER )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1937:3: lv_max_1_0= RULE_INTEGER
                    {
                    lv_max_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleParticipantCardinalityMax3765); 

                    			newLeafNode(lv_max_1_0, grammarAccess.getParticipantCardinalityMaxAccess().getMaxINTEGERTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParticipantCardinalityMaxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"max",
                            		lv_max_1_0, 
                            		"INTEGER");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1954:6: ( (lv_max2_2_0= ruleTK_PLUS ) )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1954:6: ( (lv_max2_2_0= ruleTK_PLUS ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1955:1: (lv_max2_2_0= ruleTK_PLUS )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1955:1: (lv_max2_2_0= ruleTK_PLUS )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1956:3: lv_max2_2_0= ruleTK_PLUS
                    {
                     
                    	        newCompositeNode(grammarAccess.getParticipantCardinalityMaxAccess().getMax2TK_PLUSParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_PLUS_in_ruleParticipantCardinalityMax3797);
                    lv_max2_2_0=ruleTK_PLUS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParticipantCardinalityMaxRule());
                    	        }
                           		set(
                           			current, 
                           			"max2",
                            		lv_max2_2_0, 
                            		"TK_PLUS");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantCardinalityMax"


    // $ANTLR start "entryRuleParticipantCardinalityAll"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1980:1: entryRuleParticipantCardinalityAll returns [EObject current=null] : iv_ruleParticipantCardinalityAll= ruleParticipantCardinalityAll EOF ;
    public final EObject entryRuleParticipantCardinalityAll() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantCardinalityAll = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1981:2: (iv_ruleParticipantCardinalityAll= ruleParticipantCardinalityAll EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1982:2: iv_ruleParticipantCardinalityAll= ruleParticipantCardinalityAll EOF
            {
             newCompositeNode(grammarAccess.getParticipantCardinalityAllRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityAll_in_entryRuleParticipantCardinalityAll3834);
            iv_ruleParticipantCardinalityAll=ruleParticipantCardinalityAll();

            state._fsp--;

             current =iv_ruleParticipantCardinalityAll; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinalityAll3844); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantCardinalityAll"


    // $ANTLR start "ruleParticipantCardinalityAll"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1989:1: ruleParticipantCardinalityAll returns [EObject current=null] : ( (lv_name_0_0= ruleTK_ALL ) ) ;
    public final EObject ruleParticipantCardinalityAll() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1992:28: ( ( (lv_name_0_0= ruleTK_ALL ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1993:1: ( (lv_name_0_0= ruleTK_ALL ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1993:1: ( (lv_name_0_0= ruleTK_ALL ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1994:1: (lv_name_0_0= ruleTK_ALL )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1994:1: (lv_name_0_0= ruleTK_ALL )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:1995:3: lv_name_0_0= ruleTK_ALL
            {
             
            	        newCompositeNode(grammarAccess.getParticipantCardinalityAllAccess().getNameTK_ALLParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_ALL_in_ruleParticipantCardinalityAll3889);
            lv_name_0_0=ruleTK_ALL();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParticipantCardinalityAllRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_ALL");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantCardinalityAll"


    // $ANTLR start "entryRuleType"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2019:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2020:2: (iv_ruleType= ruleType EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2021:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType3924);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType3934); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2028:1: ruleType returns [EObject current=null] : ( (lv_type_0_0= RULE_STRING ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2031:28: ( ( (lv_type_0_0= RULE_STRING ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2032:1: ( (lv_type_0_0= RULE_STRING ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2032:1: ( (lv_type_0_0= RULE_STRING ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2033:1: (lv_type_0_0= RULE_STRING )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2033:1: (lv_type_0_0= RULE_STRING )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2034:3: lv_type_0_0= RULE_STRING
            {
            lv_type_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleType3975); 

            			newLeafNode(lv_type_0_0, grammarAccess.getTypeAccess().getTypeSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRole"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2058:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2059:2: (iv_ruleRole= ruleRole EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2060:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole4015);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole4025); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2067:1: ruleRole returns [EObject current=null] : ( (lv_role_0_0= RULE_STRING ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token lv_role_0_0=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2070:28: ( ( (lv_role_0_0= RULE_STRING ) ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2071:1: ( (lv_role_0_0= RULE_STRING ) )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2071:1: ( (lv_role_0_0= RULE_STRING ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2072:1: (lv_role_0_0= RULE_STRING )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2072:1: (lv_role_0_0= RULE_STRING )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2073:3: lv_role_0_0= RULE_STRING
            {
            lv_role_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRole4066); 

            			newLeafNode(lv_role_0_0, grammarAccess.getRoleAccess().getRoleSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"role",
                    		lv_role_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleDescription"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2097:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2098:2: (iv_ruleDescription= ruleDescription EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2099:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription4106);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription4116); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2106:1: ruleDescription returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleTK_DESCRIPTION ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ';' )? ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2109:28: ( ( () ( ( (lv_name_1_0= ruleTK_DESCRIPTION ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ';' )? ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2110:1: ( () ( ( (lv_name_1_0= ruleTK_DESCRIPTION ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ';' )? )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2110:1: ( () ( ( (lv_name_1_0= ruleTK_DESCRIPTION ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ';' )? )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2110:2: () ( ( (lv_name_1_0= ruleTK_DESCRIPTION ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ';' )?
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2110:2: ()
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2111:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
                        current);
                

            }

            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2116:2: ( ( (lv_name_1_0= ruleTK_DESCRIPTION ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2116:3: ( (lv_name_1_0= ruleTK_DESCRIPTION ) ) otherlv_2= ':' ( (lv_description_3_0= RULE_STRING ) ) otherlv_4= ';'
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2116:3: ( (lv_name_1_0= ruleTK_DESCRIPTION ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2117:1: (lv_name_1_0= ruleTK_DESCRIPTION )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2117:1: (lv_name_1_0= ruleTK_DESCRIPTION )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2118:3: lv_name_1_0= ruleTK_DESCRIPTION
                    {
                     
                    	        newCompositeNode(grammarAccess.getDescriptionAccess().getNameTK_DESCRIPTIONParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTK_DESCRIPTION_in_ruleDescription4172);
                    lv_name_1_0=ruleTK_DESCRIPTION();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDescriptionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"TK_DESCRIPTION");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDescription4184); 

                        	newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getColonKeyword_1_1());
                        
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2138:1: ( (lv_description_3_0= RULE_STRING ) )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2139:1: (lv_description_3_0= RULE_STRING )
                    {
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2139:1: (lv_description_3_0= RULE_STRING )
                    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2140:3: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription4201); 

                    			newLeafNode(lv_description_3_0, grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDescriptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_3_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleDescription4218); 

                        	newLeafNode(otherlv_4, grammarAccess.getDescriptionAccess().getSemicolonKeyword_1_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleGoals"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2168:1: entryRuleGoals returns [EObject current=null] : iv_ruleGoals= ruleGoals EOF ;
    public final EObject entryRuleGoals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoals = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2169:2: (iv_ruleGoals= ruleGoals EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2170:2: iv_ruleGoals= ruleGoals EOF
            {
             newCompositeNode(grammarAccess.getGoalsRule()); 
            pushFollow(FOLLOW_ruleGoals_in_entryRuleGoals4256);
            iv_ruleGoals=ruleGoals();

            state._fsp--;

             current =iv_ruleGoals; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoals4266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoals"


    // $ANTLR start "ruleGoals"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2177:1: ruleGoals returns [EObject current=null] : ( ( (lv_name_0_0= ruleTK_GOALS ) ) otherlv_1= ':' ( (lv_goals_2_0= ruleGoal ) )+ ) ;
    public final EObject ruleGoals() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_goals_2_0 = null;


         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2180:28: ( ( ( (lv_name_0_0= ruleTK_GOALS ) ) otherlv_1= ':' ( (lv_goals_2_0= ruleGoal ) )+ ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2181:1: ( ( (lv_name_0_0= ruleTK_GOALS ) ) otherlv_1= ':' ( (lv_goals_2_0= ruleGoal ) )+ )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2181:1: ( ( (lv_name_0_0= ruleTK_GOALS ) ) otherlv_1= ':' ( (lv_goals_2_0= ruleGoal ) )+ )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2181:2: ( (lv_name_0_0= ruleTK_GOALS ) ) otherlv_1= ':' ( (lv_goals_2_0= ruleGoal ) )+
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2181:2: ( (lv_name_0_0= ruleTK_GOALS ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2182:1: (lv_name_0_0= ruleTK_GOALS )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2182:1: (lv_name_0_0= ruleTK_GOALS )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2183:3: lv_name_0_0= ruleTK_GOALS
            {
             
            	        newCompositeNode(grammarAccess.getGoalsAccess().getNameTK_GOALSParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTK_GOALS_in_ruleGoals4312);
            lv_name_0_0=ruleTK_GOALS();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGoalsRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"TK_GOALS");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleGoals4324); 

                	newLeafNode(otherlv_1, grammarAccess.getGoalsAccess().getColonKeyword_1());
                
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2203:1: ( (lv_goals_2_0= ruleGoal ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_STRING) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2204:1: (lv_goals_2_0= ruleGoal )
            	    {
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2204:1: (lv_goals_2_0= ruleGoal )
            	    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2205:3: lv_goals_2_0= ruleGoal
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalsAccess().getGoalsGoalParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGoal_in_ruleGoals4345);
            	    lv_goals_2_0=ruleGoal();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"goals",
            	            		lv_goals_2_0, 
            	            		"Goal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoals"


    // $ANTLR start "entryRuleGoal"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2229:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2230:2: (iv_ruleGoal= ruleGoal EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2231:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal4382);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal4392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2238:1: ruleGoal returns [EObject current=null] : ( ( (lv_goal_0_0= RULE_STRING ) ) otherlv_1= ';' ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token lv_goal_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2241:28: ( ( ( (lv_goal_0_0= RULE_STRING ) ) otherlv_1= ';' ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2242:1: ( ( (lv_goal_0_0= RULE_STRING ) ) otherlv_1= ';' )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2242:1: ( ( (lv_goal_0_0= RULE_STRING ) ) otherlv_1= ';' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2242:2: ( (lv_goal_0_0= RULE_STRING ) ) otherlv_1= ';'
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2242:2: ( (lv_goal_0_0= RULE_STRING ) )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2243:1: (lv_goal_0_0= RULE_STRING )
            {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2243:1: (lv_goal_0_0= RULE_STRING )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2244:3: lv_goal_0_0= RULE_STRING
            {
            lv_goal_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal4434); 

            			newLeafNode(lv_goal_0_0, grammarAccess.getGoalAccess().getGoalSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"goal",
                    		lv_goal_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleGoal4451); 

                	newLeafNode(otherlv_1, grammarAccess.getGoalAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleTK_PROTOCOL"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2272:1: entryRuleTK_PROTOCOL returns [String current=null] : iv_ruleTK_PROTOCOL= ruleTK_PROTOCOL EOF ;
    public final String entryRuleTK_PROTOCOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_PROTOCOL = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2273:2: (iv_ruleTK_PROTOCOL= ruleTK_PROTOCOL EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2274:2: iv_ruleTK_PROTOCOL= ruleTK_PROTOCOL EOF
            {
             newCompositeNode(grammarAccess.getTK_PROTOCOLRule()); 
            pushFollow(FOLLOW_ruleTK_PROTOCOL_in_entryRuleTK_PROTOCOL4488);
            iv_ruleTK_PROTOCOL=ruleTK_PROTOCOL();

            state._fsp--;

             current =iv_ruleTK_PROTOCOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_PROTOCOL4499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_PROTOCOL"


    // $ANTLR start "ruleTK_PROTOCOL"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2281:1: ruleTK_PROTOCOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'protocol' ;
    public final AntlrDatatypeRuleToken ruleTK_PROTOCOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2284:28: (kw= 'protocol' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2286:2: kw= 'protocol'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleTK_PROTOCOL4536); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_PROTOCOLAccess().getProtocolKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_PROTOCOL"


    // $ANTLR start "entryRuleTK_DESCRIPTION"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2299:1: entryRuleTK_DESCRIPTION returns [String current=null] : iv_ruleTK_DESCRIPTION= ruleTK_DESCRIPTION EOF ;
    public final String entryRuleTK_DESCRIPTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_DESCRIPTION = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2300:2: (iv_ruleTK_DESCRIPTION= ruleTK_DESCRIPTION EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2301:2: iv_ruleTK_DESCRIPTION= ruleTK_DESCRIPTION EOF
            {
             newCompositeNode(grammarAccess.getTK_DESCRIPTIONRule()); 
            pushFollow(FOLLOW_ruleTK_DESCRIPTION_in_entryRuleTK_DESCRIPTION4576);
            iv_ruleTK_DESCRIPTION=ruleTK_DESCRIPTION();

            state._fsp--;

             current =iv_ruleTK_DESCRIPTION.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_DESCRIPTION4587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_DESCRIPTION"


    // $ANTLR start "ruleTK_DESCRIPTION"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2308:1: ruleTK_DESCRIPTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'description' ;
    public final AntlrDatatypeRuleToken ruleTK_DESCRIPTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2311:28: (kw= 'description' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2313:2: kw= 'description'
            {
            kw=(Token)match(input,22,FOLLOW_22_in_ruleTK_DESCRIPTION4624); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_DESCRIPTIONAccess().getDescriptionKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_DESCRIPTION"


    // $ANTLR start "entryRuleTK_GOALS"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2326:1: entryRuleTK_GOALS returns [String current=null] : iv_ruleTK_GOALS= ruleTK_GOALS EOF ;
    public final String entryRuleTK_GOALS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_GOALS = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2327:2: (iv_ruleTK_GOALS= ruleTK_GOALS EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2328:2: iv_ruleTK_GOALS= ruleTK_GOALS EOF
            {
             newCompositeNode(grammarAccess.getTK_GOALSRule()); 
            pushFollow(FOLLOW_ruleTK_GOALS_in_entryRuleTK_GOALS4664);
            iv_ruleTK_GOALS=ruleTK_GOALS();

            state._fsp--;

             current =iv_ruleTK_GOALS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_GOALS4675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_GOALS"


    // $ANTLR start "ruleTK_GOALS"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2335:1: ruleTK_GOALS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'goals' ;
    public final AntlrDatatypeRuleToken ruleTK_GOALS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2338:28: (kw= 'goals' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2340:2: kw= 'goals'
            {
            kw=(Token)match(input,23,FOLLOW_23_in_ruleTK_GOALS4712); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_GOALSAccess().getGoalsKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_GOALS"


    // $ANTLR start "entryRuleTK_PARTICIPANTS"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2353:1: entryRuleTK_PARTICIPANTS returns [String current=null] : iv_ruleTK_PARTICIPANTS= ruleTK_PARTICIPANTS EOF ;
    public final String entryRuleTK_PARTICIPANTS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_PARTICIPANTS = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2354:2: (iv_ruleTK_PARTICIPANTS= ruleTK_PARTICIPANTS EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2355:2: iv_ruleTK_PARTICIPANTS= ruleTK_PARTICIPANTS EOF
            {
             newCompositeNode(grammarAccess.getTK_PARTICIPANTSRule()); 
            pushFollow(FOLLOW_ruleTK_PARTICIPANTS_in_entryRuleTK_PARTICIPANTS4752);
            iv_ruleTK_PARTICIPANTS=ruleTK_PARTICIPANTS();

            state._fsp--;

             current =iv_ruleTK_PARTICIPANTS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_PARTICIPANTS4763); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_PARTICIPANTS"


    // $ANTLR start "ruleTK_PARTICIPANTS"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2362:1: ruleTK_PARTICIPANTS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'participants' ;
    public final AntlrDatatypeRuleToken ruleTK_PARTICIPANTS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2365:28: (kw= 'participants' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2367:2: kw= 'participants'
            {
            kw=(Token)match(input,24,FOLLOW_24_in_ruleTK_PARTICIPANTS4800); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_PARTICIPANTSAccess().getParticipantsKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_PARTICIPANTS"


    // $ANTLR start "entryRuleTK_AGENT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2380:1: entryRuleTK_AGENT returns [String current=null] : iv_ruleTK_AGENT= ruleTK_AGENT EOF ;
    public final String entryRuleTK_AGENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_AGENT = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2381:2: (iv_ruleTK_AGENT= ruleTK_AGENT EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2382:2: iv_ruleTK_AGENT= ruleTK_AGENT EOF
            {
             newCompositeNode(grammarAccess.getTK_AGENTRule()); 
            pushFollow(FOLLOW_ruleTK_AGENT_in_entryRuleTK_AGENT4840);
            iv_ruleTK_AGENT=ruleTK_AGENT();

            state._fsp--;

             current =iv_ruleTK_AGENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_AGENT4851); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_AGENT"


    // $ANTLR start "ruleTK_AGENT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2389:1: ruleTK_AGENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'agent' ;
    public final AntlrDatatypeRuleToken ruleTK_AGENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2392:28: (kw= 'agent' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2394:2: kw= 'agent'
            {
            kw=(Token)match(input,25,FOLLOW_25_in_ruleTK_AGENT4888); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_AGENTAccess().getAgentKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_AGENT"


    // $ANTLR start "entryRuleTK_ARTIFACT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2407:1: entryRuleTK_ARTIFACT returns [String current=null] : iv_ruleTK_ARTIFACT= ruleTK_ARTIFACT EOF ;
    public final String entryRuleTK_ARTIFACT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_ARTIFACT = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2408:2: (iv_ruleTK_ARTIFACT= ruleTK_ARTIFACT EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2409:2: iv_ruleTK_ARTIFACT= ruleTK_ARTIFACT EOF
            {
             newCompositeNode(grammarAccess.getTK_ARTIFACTRule()); 
            pushFollow(FOLLOW_ruleTK_ARTIFACT_in_entryRuleTK_ARTIFACT4928);
            iv_ruleTK_ARTIFACT=ruleTK_ARTIFACT();

            state._fsp--;

             current =iv_ruleTK_ARTIFACT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_ARTIFACT4939); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_ARTIFACT"


    // $ANTLR start "ruleTK_ARTIFACT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2416:1: ruleTK_ARTIFACT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'artifact' ;
    public final AntlrDatatypeRuleToken ruleTK_ARTIFACT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2419:28: (kw= 'artifact' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2421:2: kw= 'artifact'
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleTK_ARTIFACT4976); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_ARTIFACTAccess().getArtifactKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_ARTIFACT"


    // $ANTLR start "entryRuleTK_MAX"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2434:1: entryRuleTK_MAX returns [String current=null] : iv_ruleTK_MAX= ruleTK_MAX EOF ;
    public final String entryRuleTK_MAX() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_MAX = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2435:2: (iv_ruleTK_MAX= ruleTK_MAX EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2436:2: iv_ruleTK_MAX= ruleTK_MAX EOF
            {
             newCompositeNode(grammarAccess.getTK_MAXRule()); 
            pushFollow(FOLLOW_ruleTK_MAX_in_entryRuleTK_MAX5016);
            iv_ruleTK_MAX=ruleTK_MAX();

            state._fsp--;

             current =iv_ruleTK_MAX.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MAX5027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_MAX"


    // $ANTLR start "ruleTK_MAX"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2443:1: ruleTK_MAX returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'max' ;
    public final AntlrDatatypeRuleToken ruleTK_MAX() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2446:28: (kw= 'max' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2448:2: kw= 'max'
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleTK_MAX5064); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_MAXAccess().getMaxKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_MAX"


    // $ANTLR start "entryRuleTK_MIN"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2461:1: entryRuleTK_MIN returns [String current=null] : iv_ruleTK_MIN= ruleTK_MIN EOF ;
    public final String entryRuleTK_MIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_MIN = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2462:2: (iv_ruleTK_MIN= ruleTK_MIN EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2463:2: iv_ruleTK_MIN= ruleTK_MIN EOF
            {
             newCompositeNode(grammarAccess.getTK_MINRule()); 
            pushFollow(FOLLOW_ruleTK_MIN_in_entryRuleTK_MIN5104);
            iv_ruleTK_MIN=ruleTK_MIN();

            state._fsp--;

             current =iv_ruleTK_MIN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MIN5115); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_MIN"


    // $ANTLR start "ruleTK_MIN"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2470:1: ruleTK_MIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'min' ;
    public final AntlrDatatypeRuleToken ruleTK_MIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2473:28: (kw= 'min' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2475:2: kw= 'min'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleTK_MIN5152); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_MINAccess().getMinKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_MIN"


    // $ANTLR start "entryRuleTK_STATES"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2488:1: entryRuleTK_STATES returns [String current=null] : iv_ruleTK_STATES= ruleTK_STATES EOF ;
    public final String entryRuleTK_STATES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_STATES = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2489:2: (iv_ruleTK_STATES= ruleTK_STATES EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2490:2: iv_ruleTK_STATES= ruleTK_STATES EOF
            {
             newCompositeNode(grammarAccess.getTK_STATESRule()); 
            pushFollow(FOLLOW_ruleTK_STATES_in_entryRuleTK_STATES5192);
            iv_ruleTK_STATES=ruleTK_STATES();

            state._fsp--;

             current =iv_ruleTK_STATES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_STATES5203); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_STATES"


    // $ANTLR start "ruleTK_STATES"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2497:1: ruleTK_STATES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'states' ;
    public final AntlrDatatypeRuleToken ruleTK_STATES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2500:28: (kw= 'states' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2502:2: kw= 'states'
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleTK_STATES5240); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_STATESAccess().getStatesKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_STATES"


    // $ANTLR start "entryRuleTK_INITIAL"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2515:1: entryRuleTK_INITIAL returns [String current=null] : iv_ruleTK_INITIAL= ruleTK_INITIAL EOF ;
    public final String entryRuleTK_INITIAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_INITIAL = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2516:2: (iv_ruleTK_INITIAL= ruleTK_INITIAL EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2517:2: iv_ruleTK_INITIAL= ruleTK_INITIAL EOF
            {
             newCompositeNode(grammarAccess.getTK_INITIALRule()); 
            pushFollow(FOLLOW_ruleTK_INITIAL_in_entryRuleTK_INITIAL5280);
            iv_ruleTK_INITIAL=ruleTK_INITIAL();

            state._fsp--;

             current =iv_ruleTK_INITIAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_INITIAL5291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_INITIAL"


    // $ANTLR start "ruleTK_INITIAL"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2524:1: ruleTK_INITIAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'initial' ;
    public final AntlrDatatypeRuleToken ruleTK_INITIAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2527:28: (kw= 'initial' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2529:2: kw= 'initial'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleTK_INITIAL5328); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_INITIALAccess().getInitialKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_INITIAL"


    // $ANTLR start "entryRuleTK_FINAL"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2542:1: entryRuleTK_FINAL returns [String current=null] : iv_ruleTK_FINAL= ruleTK_FINAL EOF ;
    public final String entryRuleTK_FINAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_FINAL = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2543:2: (iv_ruleTK_FINAL= ruleTK_FINAL EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2544:2: iv_ruleTK_FINAL= ruleTK_FINAL EOF
            {
             newCompositeNode(grammarAccess.getTK_FINALRule()); 
            pushFollow(FOLLOW_ruleTK_FINAL_in_entryRuleTK_FINAL5368);
            iv_ruleTK_FINAL=ruleTK_FINAL();

            state._fsp--;

             current =iv_ruleTK_FINAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_FINAL5379); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_FINAL"


    // $ANTLR start "ruleTK_FINAL"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2551:1: ruleTK_FINAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'final' ;
    public final AntlrDatatypeRuleToken ruleTK_FINAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2554:28: (kw= 'final' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2556:2: kw= 'final'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleTK_FINAL5416); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_FINALAccess().getFinalKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_FINAL"


    // $ANTLR start "entryRuleTK_TRANSITIONS"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2569:1: entryRuleTK_TRANSITIONS returns [String current=null] : iv_ruleTK_TRANSITIONS= ruleTK_TRANSITIONS EOF ;
    public final String entryRuleTK_TRANSITIONS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_TRANSITIONS = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2570:2: (iv_ruleTK_TRANSITIONS= ruleTK_TRANSITIONS EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2571:2: iv_ruleTK_TRANSITIONS= ruleTK_TRANSITIONS EOF
            {
             newCompositeNode(grammarAccess.getTK_TRANSITIONSRule()); 
            pushFollow(FOLLOW_ruleTK_TRANSITIONS_in_entryRuleTK_TRANSITIONS5456);
            iv_ruleTK_TRANSITIONS=ruleTK_TRANSITIONS();

            state._fsp--;

             current =iv_ruleTK_TRANSITIONS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_TRANSITIONS5467); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_TRANSITIONS"


    // $ANTLR start "ruleTK_TRANSITIONS"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2578:1: ruleTK_TRANSITIONS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'transitions' ;
    public final AntlrDatatypeRuleToken ruleTK_TRANSITIONS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2581:28: (kw= 'transitions' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2583:2: kw= 'transitions'
            {
            kw=(Token)match(input,32,FOLLOW_32_in_ruleTK_TRANSITIONS5504); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_TRANSITIONSAccess().getTransitionsKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_TRANSITIONS"


    // $ANTLR start "entryRuleTK_TIMEOUT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2596:1: entryRuleTK_TIMEOUT returns [String current=null] : iv_ruleTK_TIMEOUT= ruleTK_TIMEOUT EOF ;
    public final String entryRuleTK_TIMEOUT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_TIMEOUT = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2597:2: (iv_ruleTK_TIMEOUT= ruleTK_TIMEOUT EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2598:2: iv_ruleTK_TIMEOUT= ruleTK_TIMEOUT EOF
            {
             newCompositeNode(grammarAccess.getTK_TIMEOUTRule()); 
            pushFollow(FOLLOW_ruleTK_TIMEOUT_in_entryRuleTK_TIMEOUT5544);
            iv_ruleTK_TIMEOUT=ruleTK_TIMEOUT();

            state._fsp--;

             current =iv_ruleTK_TIMEOUT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_TIMEOUT5555); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_TIMEOUT"


    // $ANTLR start "ruleTK_TIMEOUT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2605:1: ruleTK_TIMEOUT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'timeout' ;
    public final AntlrDatatypeRuleToken ruleTK_TIMEOUT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2608:28: (kw= 'timeout' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2610:2: kw= 'timeout'
            {
            kw=(Token)match(input,33,FOLLOW_33_in_ruleTK_TIMEOUT5592); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_TIMEOUTAccess().getTimeoutKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_TIMEOUT"


    // $ANTLR start "entryRuleTK_MESSAGE"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2623:1: entryRuleTK_MESSAGE returns [String current=null] : iv_ruleTK_MESSAGE= ruleTK_MESSAGE EOF ;
    public final String entryRuleTK_MESSAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_MESSAGE = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2624:2: (iv_ruleTK_MESSAGE= ruleTK_MESSAGE EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2625:2: iv_ruleTK_MESSAGE= ruleTK_MESSAGE EOF
            {
             newCompositeNode(grammarAccess.getTK_MESSAGERule()); 
            pushFollow(FOLLOW_ruleTK_MESSAGE_in_entryRuleTK_MESSAGE5632);
            iv_ruleTK_MESSAGE=ruleTK_MESSAGE();

            state._fsp--;

             current =iv_ruleTK_MESSAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MESSAGE5643); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_MESSAGE"


    // $ANTLR start "ruleTK_MESSAGE"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2632:1: ruleTK_MESSAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'message' ;
    public final AntlrDatatypeRuleToken ruleTK_MESSAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2635:28: (kw= 'message' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2637:2: kw= 'message'
            {
            kw=(Token)match(input,34,FOLLOW_34_in_ruleTK_MESSAGE5680); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_MESSAGEAccess().getMessageKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_MESSAGE"


    // $ANTLR start "entryRuleTK_ACTION"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2650:1: entryRuleTK_ACTION returns [String current=null] : iv_ruleTK_ACTION= ruleTK_ACTION EOF ;
    public final String entryRuleTK_ACTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_ACTION = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2651:2: (iv_ruleTK_ACTION= ruleTK_ACTION EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2652:2: iv_ruleTK_ACTION= ruleTK_ACTION EOF
            {
             newCompositeNode(grammarAccess.getTK_ACTIONRule()); 
            pushFollow(FOLLOW_ruleTK_ACTION_in_entryRuleTK_ACTION5720);
            iv_ruleTK_ACTION=ruleTK_ACTION();

            state._fsp--;

             current =iv_ruleTK_ACTION.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_ACTION5731); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_ACTION"


    // $ANTLR start "ruleTK_ACTION"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2659:1: ruleTK_ACTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'action' ;
    public final AntlrDatatypeRuleToken ruleTK_ACTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2662:28: (kw= 'action' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2664:2: kw= 'action'
            {
            kw=(Token)match(input,35,FOLLOW_35_in_ruleTK_ACTION5768); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_ACTIONAccess().getActionKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_ACTION"


    // $ANTLR start "entryRuleTK_EVENT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2677:1: entryRuleTK_EVENT returns [String current=null] : iv_ruleTK_EVENT= ruleTK_EVENT EOF ;
    public final String entryRuleTK_EVENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_EVENT = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2678:2: (iv_ruleTK_EVENT= ruleTK_EVENT EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2679:2: iv_ruleTK_EVENT= ruleTK_EVENT EOF
            {
             newCompositeNode(grammarAccess.getTK_EVENTRule()); 
            pushFollow(FOLLOW_ruleTK_EVENT_in_entryRuleTK_EVENT5808);
            iv_ruleTK_EVENT=ruleTK_EVENT();

            state._fsp--;

             current =iv_ruleTK_EVENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_EVENT5819); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_EVENT"


    // $ANTLR start "ruleTK_EVENT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2686:1: ruleTK_EVENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'event' ;
    public final AntlrDatatypeRuleToken ruleTK_EVENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2689:28: (kw= 'event' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2691:2: kw= 'event'
            {
            kw=(Token)match(input,36,FOLLOW_36_in_ruleTK_EVENT5856); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_EVENTAccess().getEventKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_EVENT"


    // $ANTLR start "entryRuleTK_TRIGGER"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2704:1: entryRuleTK_TRIGGER returns [String current=null] : iv_ruleTK_TRIGGER= ruleTK_TRIGGER EOF ;
    public final String entryRuleTK_TRIGGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_TRIGGER = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2705:2: (iv_ruleTK_TRIGGER= ruleTK_TRIGGER EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2706:2: iv_ruleTK_TRIGGER= ruleTK_TRIGGER EOF
            {
             newCompositeNode(grammarAccess.getTK_TRIGGERRule()); 
            pushFollow(FOLLOW_ruleTK_TRIGGER_in_entryRuleTK_TRIGGER5896);
            iv_ruleTK_TRIGGER=ruleTK_TRIGGER();

            state._fsp--;

             current =iv_ruleTK_TRIGGER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_TRIGGER5907); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_TRIGGER"


    // $ANTLR start "ruleTK_TRIGGER"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2713:1: ruleTK_TRIGGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'trigger' ;
    public final AntlrDatatypeRuleToken ruleTK_TRIGGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2716:28: (kw= 'trigger' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2718:2: kw= 'trigger'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleTK_TRIGGER5944); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_TRIGGERAccess().getTriggerKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_TRIGGER"


    // $ANTLR start "entryRuleTK_IMPORT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2731:1: entryRuleTK_IMPORT returns [String current=null] : iv_ruleTK_IMPORT= ruleTK_IMPORT EOF ;
    public final String entryRuleTK_IMPORT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_IMPORT = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2732:2: (iv_ruleTK_IMPORT= ruleTK_IMPORT EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2733:2: iv_ruleTK_IMPORT= ruleTK_IMPORT EOF
            {
             newCompositeNode(grammarAccess.getTK_IMPORTRule()); 
            pushFollow(FOLLOW_ruleTK_IMPORT_in_entryRuleTK_IMPORT5984);
            iv_ruleTK_IMPORT=ruleTK_IMPORT();

            state._fsp--;

             current =iv_ruleTK_IMPORT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_IMPORT5995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_IMPORT"


    // $ANTLR start "ruleTK_IMPORT"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2740:1: ruleTK_IMPORT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'import' ;
    public final AntlrDatatypeRuleToken ruleTK_IMPORT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2743:28: (kw= 'import' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2745:2: kw= 'import'
            {
            kw=(Token)match(input,38,FOLLOW_38_in_ruleTK_IMPORT6032); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_IMPORTAccess().getImportKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_IMPORT"


    // $ANTLR start "entryRuleTK_MAPPING"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2758:1: entryRuleTK_MAPPING returns [String current=null] : iv_ruleTK_MAPPING= ruleTK_MAPPING EOF ;
    public final String entryRuleTK_MAPPING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_MAPPING = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2759:2: (iv_ruleTK_MAPPING= ruleTK_MAPPING EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2760:2: iv_ruleTK_MAPPING= ruleTK_MAPPING EOF
            {
             newCompositeNode(grammarAccess.getTK_MAPPINGRule()); 
            pushFollow(FOLLOW_ruleTK_MAPPING_in_entryRuleTK_MAPPING6072);
            iv_ruleTK_MAPPING=ruleTK_MAPPING();

            state._fsp--;

             current =iv_ruleTK_MAPPING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MAPPING6083); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_MAPPING"


    // $ANTLR start "ruleTK_MAPPING"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2767:1: ruleTK_MAPPING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'mapping' ;
    public final AntlrDatatypeRuleToken ruleTK_MAPPING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2770:28: (kw= 'mapping' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2772:2: kw= 'mapping'
            {
            kw=(Token)match(input,39,FOLLOW_39_in_ruleTK_MAPPING6120); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_MAPPINGAccess().getMappingKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_MAPPING"


    // $ANTLR start "entryRuleTK_ALL"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2785:1: entryRuleTK_ALL returns [String current=null] : iv_ruleTK_ALL= ruleTK_ALL EOF ;
    public final String entryRuleTK_ALL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_ALL = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2786:2: (iv_ruleTK_ALL= ruleTK_ALL EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2787:2: iv_ruleTK_ALL= ruleTK_ALL EOF
            {
             newCompositeNode(grammarAccess.getTK_ALLRule()); 
            pushFollow(FOLLOW_ruleTK_ALL_in_entryRuleTK_ALL6160);
            iv_ruleTK_ALL=ruleTK_ALL();

            state._fsp--;

             current =iv_ruleTK_ALL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_ALL6171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_ALL"


    // $ANTLR start "ruleTK_ALL"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2794:1: ruleTK_ALL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'all' ;
    public final AntlrDatatypeRuleToken ruleTK_ALL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2797:28: (kw= 'all' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2799:2: kw= 'all'
            {
            kw=(Token)match(input,40,FOLLOW_40_in_ruleTK_ALL6208); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_ALLAccess().getAllKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_ALL"


    // $ANTLR start "entryRuleTK_PLUS"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2812:1: entryRuleTK_PLUS returns [String current=null] : iv_ruleTK_PLUS= ruleTK_PLUS EOF ;
    public final String entryRuleTK_PLUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTK_PLUS = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2813:2: (iv_ruleTK_PLUS= ruleTK_PLUS EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2814:2: iv_ruleTK_PLUS= ruleTK_PLUS EOF
            {
             newCompositeNode(grammarAccess.getTK_PLUSRule()); 
            pushFollow(FOLLOW_ruleTK_PLUS_in_entryRuleTK_PLUS6248);
            iv_ruleTK_PLUS=ruleTK_PLUS();

            state._fsp--;

             current =iv_ruleTK_PLUS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_PLUS6259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTK_PLUS"


    // $ANTLR start "ruleTK_PLUS"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2821:1: ruleTK_PLUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken ruleTK_PLUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2824:28: (kw= '+' )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2826:2: kw= '+'
            {
            kw=(Token)match(input,41,FOLLOW_41_in_ruleTK_PLUS6296); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getTK_PLUSAccess().getPlusSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTK_PLUS"


    // $ANTLR start "entryRuleID"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2839:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2840:2: (iv_ruleID= ruleID EOF )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2841:2: iv_ruleID= ruleID EOF
            {
             newCompositeNode(grammarAccess.getIDRule()); 
            pushFollow(FOLLOW_ruleID_in_entryRuleID6336);
            iv_ruleID=ruleID();

            state._fsp--;

             current =iv_ruleID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleID6347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2848:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_WITH_STARTING_LCLETTER_0= RULE_ID_WITH_STARTING_LCLETTER ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_WITH_STARTING_LCLETTER_0=null;

         enterRule(); 
            
        try {
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2851:28: (this_ID_WITH_STARTING_LCLETTER_0= RULE_ID_WITH_STARTING_LCLETTER )
            // ../ptlide.xtext.ptl/src-gen/ptlide/xtext/parser/antlr/internal/InternalPtl.g:2852:5: this_ID_WITH_STARTING_LCLETTER_0= RULE_ID_WITH_STARTING_LCLETTER
            {
            this_ID_WITH_STARTING_LCLETTER_0=(Token)match(input,RULE_ID_WITH_STARTING_LCLETTER,FOLLOW_RULE_ID_WITH_STARTING_LCLETTER_in_ruleID6386); 

            		current.merge(this_ID_WITH_STARTING_LCLETTER_0);
                
             
                newLeafNode(this_ID_WITH_STARTING_LCLETTER_0, grammarAccess.getIDAccess().getID_WITH_STARTING_LCLETTERTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleID"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PROTOCOL_in_ruleProtocol126 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleID_in_ruleProtocol146 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleProtocol158 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleProtocol179 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleGoals_in_ruleProtocol200 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleParticipants_in_ruleProtocol221 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleStates_in_ruleProtocol242 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleTransitions_in_ruleProtocol263 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProtocol275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitions_in_entryRuleTransitions311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitions321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRANSITIONS_in_ruleTransitions367 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTransitions379 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTransitions400 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateId_in_ruleTransition493 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransition505 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleStateId_in_ruleTransition526 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTransition538 = new BitSet(new long[]{0x0000004200000040L});
    public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_entryRuleTransitionType595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionType605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOccurrence_in_ruleTransitionType651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeout_in_ruleTransitionType678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleTransitionType705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeout_in_entryRuleTimeout741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeout751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TIMEOUT_in_ruleTimeout797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleTimeout814 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTimeout831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_IMPORT_in_ruleImport923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport940 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleImport966 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImport979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MAPPING_in_ruleMapping1071 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleMapping1083 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleMapFromTo_in_ruleMapping1104 = new BitSet(new long[]{0x0000000000001040L});
    public static final BitSet FOLLOW_12_in_ruleMapping1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFromTo_in_entryRuleMapFromTo1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapFromTo1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_ruleMapFromTo1209 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleParticipantId_in_ruleMapFromTo1230 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapFromTo1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_ruleTrigger1345 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_ruleContent_in_ruleTrigger1366 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleContent_in_ruleTrigger1395 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTrigger1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRIGGER_in_rulePattern1500 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePattern1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent1558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleContent1605 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContent1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOccurrence_in_entryRuleOccurrence1663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOccurrence1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantOccurrence_in_ruleOccurrence1719 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleOccurrence1731 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleDuty_in_ruleOccurrence1752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOccurrence1764 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleParticipantOccurrence_in_ruleOccurrence1785 = new BitSet(new long[]{0x0000002000012000L});
    public static final BitSet FOLLOW_ruleTrigger_in_ruleOccurrence1807 = new BitSet(new long[]{0x0000002000002002L});
    public static final BitSet FOLLOW_16_in_ruleOccurrence1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuty_in_entryRuleDuty1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuty1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDutyType_in_ruleDuty1919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDuty1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDutyType_in_entryRuleDutyType1977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDutyType1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_EVENT_in_ruleDutyType2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ACTION_in_ruleDutyType2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MESSAGE_in_ruleDutyType2098 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDutyType2110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleID_in_ruleDutyType2131 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDutyType2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantOccurrence_in_entryRuleParticipantOccurrence2181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantOccurrence2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_ruleParticipantOccurrence2237 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleParticipantOccurrence2250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleParticipantOccurrence2267 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleParticipantOccurrence2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_entryRuleStates2322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStates2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_STATES_in_ruleStates2378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStates2390 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleState_in_ruleStates2411 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState2448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateId_in_ruleState2504 = new BitSet(new long[]{0x00000000C0010000L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState2525 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleState2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateId_in_entryRuleStateId2573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateId2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleStateId2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType2663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_INITIAL_in_ruleStateType2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_FINAL_in_ruleStateType2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipants_in_entryRuleParticipants2794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipants2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PARTICIPANTS_in_ruleParticipants2850 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleParticipants2862 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleParticipant_in_ruleParticipants2883 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant2920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_ruleParticipant2976 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleParticipantDescription_in_ruleParticipant2997 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleParticipant3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_entryRuleParticipantId3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantId3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_ruleParticipantId3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantDescription_in_entryRuleParticipantDescription3135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantDescription3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_AGENT_in_ruleParticipantDescription3193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRole_in_ruleParticipantDescription3214 = new BitSet(new long[]{0x0000010018000000L});
    public static final BitSet FOLLOW_ruleTK_ARTIFACT_in_ruleParticipantDescription3243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleParticipantDescription3264 = new BitSet(new long[]{0x0000010018000000L});
    public static final BitSet FOLLOW_ruleParticipantCardinality_in_ruleParticipantDescription3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinality_in_entryRuleParticipantCardinality3323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinality3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityAll_in_ruleParticipantCardinality3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMinMax_in_ruleParticipantCardinality3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMinMax_in_entryRuleParticipantCardinalityMinMax3453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinalityMinMax3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMin_in_ruleParticipantCardinalityMinMax3518 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMax_in_ruleParticipantCardinalityMinMax3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMin_in_entryRuleParticipantCardinalityMin3577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinalityMin3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MIN_in_ruleParticipantCardinalityMin3633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleParticipantCardinalityMin3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMax_in_entryRuleParticipantCardinalityMax3691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinalityMax3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MAX_in_ruleParticipantCardinalityMax3747 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleParticipantCardinalityMax3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PLUS_in_ruleParticipantCardinalityMax3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityAll_in_entryRuleParticipantCardinalityAll3834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinalityAll3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ALL_in_ruleParticipantCardinalityAll3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType3924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleType3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole4015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRole4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription4106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_DESCRIPTION_in_ruleDescription4172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDescription4184 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription4201 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDescription4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoals_in_entryRuleGoals4256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoals4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_GOALS_in_ruleGoals4312 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGoals4324 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleGoals4345 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal4382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal4434 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGoal4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PROTOCOL_in_entryRuleTK_PROTOCOL4488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_PROTOCOL4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTK_PROTOCOL4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_DESCRIPTION_in_entryRuleTK_DESCRIPTION4576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_DESCRIPTION4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTK_DESCRIPTION4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_GOALS_in_entryRuleTK_GOALS4664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_GOALS4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTK_GOALS4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PARTICIPANTS_in_entryRuleTK_PARTICIPANTS4752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_PARTICIPANTS4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTK_PARTICIPANTS4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_AGENT_in_entryRuleTK_AGENT4840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_AGENT4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTK_AGENT4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ARTIFACT_in_entryRuleTK_ARTIFACT4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_ARTIFACT4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTK_ARTIFACT4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MAX_in_entryRuleTK_MAX5016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MAX5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTK_MAX5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MIN_in_entryRuleTK_MIN5104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MIN5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTK_MIN5152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_STATES_in_entryRuleTK_STATES5192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_STATES5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTK_STATES5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_INITIAL_in_entryRuleTK_INITIAL5280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_INITIAL5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTK_INITIAL5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_FINAL_in_entryRuleTK_FINAL5368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_FINAL5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTK_FINAL5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRANSITIONS_in_entryRuleTK_TRANSITIONS5456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_TRANSITIONS5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTK_TRANSITIONS5504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TIMEOUT_in_entryRuleTK_TIMEOUT5544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_TIMEOUT5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleTK_TIMEOUT5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MESSAGE_in_entryRuleTK_MESSAGE5632 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MESSAGE5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTK_MESSAGE5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ACTION_in_entryRuleTK_ACTION5720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_ACTION5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTK_ACTION5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_EVENT_in_entryRuleTK_EVENT5808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_EVENT5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTK_EVENT5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRIGGER_in_entryRuleTK_TRIGGER5896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_TRIGGER5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTK_TRIGGER5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_IMPORT_in_entryRuleTK_IMPORT5984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_IMPORT5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTK_IMPORT6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MAPPING_in_entryRuleTK_MAPPING6072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MAPPING6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTK_MAPPING6120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ALL_in_entryRuleTK_ALL6160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_ALL6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTK_ALL6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PLUS_in_entryRuleTK_PLUS6248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_PLUS6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTK_PLUS6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_entryRuleID6336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleID6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_WITH_STARTING_LCLETTER_in_ruleID6386 = new BitSet(new long[]{0x0000000000000002L});

}