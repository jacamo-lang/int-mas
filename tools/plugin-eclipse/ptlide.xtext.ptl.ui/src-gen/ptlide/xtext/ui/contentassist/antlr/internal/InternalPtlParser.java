package ptlide.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import ptlide.xtext.services.PtlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPtlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID_WITH_STARTING_LCLETTER", "RULE_INTEGER", "RULE_STRING", "RULE_INTEGER_NUMBER", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'protocol'", "'description'", "'goals'", "'participants'", "'agent'", "'artifact'", "'max'", "'min'", "'states'", "'initial'", "'final'", "'transitions'", "'timeout'", "'message'", "'action'", "'event'", "'trigger'", "'import'", "'mapping'", "'all'", "'+'", "';'", "'{'", "'}'", "':'", "'-'", "'#'", "'--'", "'->'", "'['", "']'"
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
    public static final int RULE_ID_WITH_STARTING_LCLETTER=4;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
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
    public static final int RULE_INTEGER=5;
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
    public String getGrammarFileName() { return "../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g"; }


     
     	private PtlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PtlGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleProtocol"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:60:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:61:1: ( ruleProtocol EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:62:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol61);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:69:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:73:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:74:1: ( ( rule__Protocol__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:74:1: ( ( rule__Protocol__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:75:1: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:76:1: ( rule__Protocol__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:76:2: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0_in_ruleProtocol94);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleTransitions"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:88:1: entryRuleTransitions : ruleTransitions EOF ;
    public final void entryRuleTransitions() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:89:1: ( ruleTransitions EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:90:1: ruleTransitions EOF
            {
             before(grammarAccess.getTransitionsRule()); 
            pushFollow(FOLLOW_ruleTransitions_in_entryRuleTransitions121);
            ruleTransitions();

            state._fsp--;

             after(grammarAccess.getTransitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitions128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitions"


    // $ANTLR start "ruleTransitions"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:97:1: ruleTransitions : ( ( rule__Transitions__Group__0 ) ) ;
    public final void ruleTransitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:101:2: ( ( ( rule__Transitions__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:102:1: ( ( rule__Transitions__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:102:1: ( ( rule__Transitions__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:103:1: ( rule__Transitions__Group__0 )
            {
             before(grammarAccess.getTransitionsAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:104:1: ( rule__Transitions__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:104:2: rule__Transitions__Group__0
            {
            pushFollow(FOLLOW_rule__Transitions__Group__0_in_ruleTransitions154);
            rule__Transitions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitions"


    // $ANTLR start "entryRuleTransition"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:116:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:117:1: ( ruleTransition EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:118:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition181);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:125:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:129:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:130:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:130:1: ( ( rule__Transition__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:131:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:132:1: ( rule__Transition__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:132:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition214);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTransitionType"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:144:1: entryRuleTransitionType : ruleTransitionType EOF ;
    public final void entryRuleTransitionType() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:145:1: ( ruleTransitionType EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:146:1: ruleTransitionType EOF
            {
             before(grammarAccess.getTransitionTypeRule()); 
            pushFollow(FOLLOW_ruleTransitionType_in_entryRuleTransitionType241);
            ruleTransitionType();

            state._fsp--;

             after(grammarAccess.getTransitionTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransitionType"


    // $ANTLR start "ruleTransitionType"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:153:1: ruleTransitionType : ( ( rule__TransitionType__Alternatives ) ) ;
    public final void ruleTransitionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:157:2: ( ( ( rule__TransitionType__Alternatives ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:158:1: ( ( rule__TransitionType__Alternatives ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:158:1: ( ( rule__TransitionType__Alternatives ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:159:1: ( rule__TransitionType__Alternatives )
            {
             before(grammarAccess.getTransitionTypeAccess().getAlternatives()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:160:1: ( rule__TransitionType__Alternatives )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:160:2: rule__TransitionType__Alternatives
            {
            pushFollow(FOLLOW_rule__TransitionType__Alternatives_in_ruleTransitionType274);
            rule__TransitionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransitionType"


    // $ANTLR start "entryRuleTimeout"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:172:1: entryRuleTimeout : ruleTimeout EOF ;
    public final void entryRuleTimeout() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:173:1: ( ruleTimeout EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:174:1: ruleTimeout EOF
            {
             before(grammarAccess.getTimeoutRule()); 
            pushFollow(FOLLOW_ruleTimeout_in_entryRuleTimeout301);
            ruleTimeout();

            state._fsp--;

             after(grammarAccess.getTimeoutRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeout308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeout"


    // $ANTLR start "ruleTimeout"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:181:1: ruleTimeout : ( ( rule__Timeout__Group__0 ) ) ;
    public final void ruleTimeout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:185:2: ( ( ( rule__Timeout__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:186:1: ( ( rule__Timeout__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:186:1: ( ( rule__Timeout__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:187:1: ( rule__Timeout__Group__0 )
            {
             before(grammarAccess.getTimeoutAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:188:1: ( rule__Timeout__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:188:2: rule__Timeout__Group__0
            {
            pushFollow(FOLLOW_rule__Timeout__Group__0_in_ruleTimeout334);
            rule__Timeout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeout"


    // $ANTLR start "entryRuleImport"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:200:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:201:1: ( ruleImport EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:202:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport361);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:209:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:213:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:214:1: ( ( rule__Import__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:214:1: ( ( rule__Import__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:215:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:216:1: ( rule__Import__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:216:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport394);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleMapping"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:228:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:229:1: ( ruleMapping EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:230:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping421);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:237:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:241:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:242:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:242:1: ( ( rule__Mapping__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:243:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:244:1: ( rule__Mapping__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:244:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping454);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleMapFromTo"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:256:1: entryRuleMapFromTo : ruleMapFromTo EOF ;
    public final void entryRuleMapFromTo() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:257:1: ( ruleMapFromTo EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:258:1: ruleMapFromTo EOF
            {
             before(grammarAccess.getMapFromToRule()); 
            pushFollow(FOLLOW_ruleMapFromTo_in_entryRuleMapFromTo481);
            ruleMapFromTo();

            state._fsp--;

             after(grammarAccess.getMapFromToRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapFromTo488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapFromTo"


    // $ANTLR start "ruleMapFromTo"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:265:1: ruleMapFromTo : ( ( rule__MapFromTo__Group__0 ) ) ;
    public final void ruleMapFromTo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:269:2: ( ( ( rule__MapFromTo__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:270:1: ( ( rule__MapFromTo__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:270:1: ( ( rule__MapFromTo__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:271:1: ( rule__MapFromTo__Group__0 )
            {
             before(grammarAccess.getMapFromToAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:272:1: ( rule__MapFromTo__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:272:2: rule__MapFromTo__Group__0
            {
            pushFollow(FOLLOW_rule__MapFromTo__Group__0_in_ruleMapFromTo514);
            rule__MapFromTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapFromToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapFromTo"


    // $ANTLR start "entryRuleTrigger"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:284:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:285:1: ( ruleTrigger EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:286:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger541);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:293:1: ruleTrigger : ( ( rule__Trigger__Group__0 ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:297:2: ( ( ( rule__Trigger__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:298:1: ( ( rule__Trigger__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:298:1: ( ( rule__Trigger__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:299:1: ( rule__Trigger__Group__0 )
            {
             before(grammarAccess.getTriggerAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:300:1: ( rule__Trigger__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:300:2: rule__Trigger__Group__0
            {
            pushFollow(FOLLOW_rule__Trigger__Group__0_in_ruleTrigger574);
            rule__Trigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRulePattern"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:312:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:313:1: ( rulePattern EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:314:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern601);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:321:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:325:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:326:1: ( ( rule__Pattern__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:326:1: ( ( rule__Pattern__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:327:1: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:328:1: ( rule__Pattern__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:328:2: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0_in_rulePattern634);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleContent"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:340:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:341:1: ( ruleContent EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:342:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent661);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:349:1: ruleContent : ( ( rule__Content__Group__0 ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:353:2: ( ( ( rule__Content__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:354:1: ( ( rule__Content__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:354:1: ( ( rule__Content__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:355:1: ( rule__Content__Group__0 )
            {
             before(grammarAccess.getContentAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:356:1: ( rule__Content__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:356:2: rule__Content__Group__0
            {
            pushFollow(FOLLOW_rule__Content__Group__0_in_ruleContent694);
            rule__Content__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleOccurrence"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:368:1: entryRuleOccurrence : ruleOccurrence EOF ;
    public final void entryRuleOccurrence() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:369:1: ( ruleOccurrence EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:370:1: ruleOccurrence EOF
            {
             before(grammarAccess.getOccurrenceRule()); 
            pushFollow(FOLLOW_ruleOccurrence_in_entryRuleOccurrence721);
            ruleOccurrence();

            state._fsp--;

             after(grammarAccess.getOccurrenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOccurrence728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOccurrence"


    // $ANTLR start "ruleOccurrence"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:377:1: ruleOccurrence : ( ( rule__Occurrence__Group__0 ) ) ;
    public final void ruleOccurrence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:381:2: ( ( ( rule__Occurrence__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:382:1: ( ( rule__Occurrence__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:382:1: ( ( rule__Occurrence__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:383:1: ( rule__Occurrence__Group__0 )
            {
             before(grammarAccess.getOccurrenceAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:384:1: ( rule__Occurrence__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:384:2: rule__Occurrence__Group__0
            {
            pushFollow(FOLLOW_rule__Occurrence__Group__0_in_ruleOccurrence754);
            rule__Occurrence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOccurrenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOccurrence"


    // $ANTLR start "entryRuleDuty"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:396:1: entryRuleDuty : ruleDuty EOF ;
    public final void entryRuleDuty() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:397:1: ( ruleDuty EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:398:1: ruleDuty EOF
            {
             before(grammarAccess.getDutyRule()); 
            pushFollow(FOLLOW_ruleDuty_in_entryRuleDuty781);
            ruleDuty();

            state._fsp--;

             after(grammarAccess.getDutyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDuty788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDuty"


    // $ANTLR start "ruleDuty"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:405:1: ruleDuty : ( ( rule__Duty__Group__0 ) ) ;
    public final void ruleDuty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:409:2: ( ( ( rule__Duty__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:410:1: ( ( rule__Duty__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:410:1: ( ( rule__Duty__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:411:1: ( rule__Duty__Group__0 )
            {
             before(grammarAccess.getDutyAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:412:1: ( rule__Duty__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:412:2: rule__Duty__Group__0
            {
            pushFollow(FOLLOW_rule__Duty__Group__0_in_ruleDuty814);
            rule__Duty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDutyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuty"


    // $ANTLR start "entryRuleDutyType"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:424:1: entryRuleDutyType : ruleDutyType EOF ;
    public final void entryRuleDutyType() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:425:1: ( ruleDutyType EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:426:1: ruleDutyType EOF
            {
             before(grammarAccess.getDutyTypeRule()); 
            pushFollow(FOLLOW_ruleDutyType_in_entryRuleDutyType841);
            ruleDutyType();

            state._fsp--;

             after(grammarAccess.getDutyTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDutyType848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDutyType"


    // $ANTLR start "ruleDutyType"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:433:1: ruleDutyType : ( ( rule__DutyType__Group__0 ) ) ;
    public final void ruleDutyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:437:2: ( ( ( rule__DutyType__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:438:1: ( ( rule__DutyType__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:438:1: ( ( rule__DutyType__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:439:1: ( rule__DutyType__Group__0 )
            {
             before(grammarAccess.getDutyTypeAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:440:1: ( rule__DutyType__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:440:2: rule__DutyType__Group__0
            {
            pushFollow(FOLLOW_rule__DutyType__Group__0_in_ruleDutyType874);
            rule__DutyType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDutyTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDutyType"


    // $ANTLR start "entryRuleParticipantOccurrence"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:452:1: entryRuleParticipantOccurrence : ruleParticipantOccurrence EOF ;
    public final void entryRuleParticipantOccurrence() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:453:1: ( ruleParticipantOccurrence EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:454:1: ruleParticipantOccurrence EOF
            {
             before(grammarAccess.getParticipantOccurrenceRule()); 
            pushFollow(FOLLOW_ruleParticipantOccurrence_in_entryRuleParticipantOccurrence901);
            ruleParticipantOccurrence();

            state._fsp--;

             after(grammarAccess.getParticipantOccurrenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantOccurrence908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantOccurrence"


    // $ANTLR start "ruleParticipantOccurrence"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:461:1: ruleParticipantOccurrence : ( ( rule__ParticipantOccurrence__Group__0 ) ) ;
    public final void ruleParticipantOccurrence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:465:2: ( ( ( rule__ParticipantOccurrence__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:466:1: ( ( rule__ParticipantOccurrence__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:466:1: ( ( rule__ParticipantOccurrence__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:467:1: ( rule__ParticipantOccurrence__Group__0 )
            {
             before(grammarAccess.getParticipantOccurrenceAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:468:1: ( rule__ParticipantOccurrence__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:468:2: rule__ParticipantOccurrence__Group__0
            {
            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group__0_in_ruleParticipantOccurrence934);
            rule__ParticipantOccurrence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantOccurrenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantOccurrence"


    // $ANTLR start "entryRuleStates"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:480:1: entryRuleStates : ruleStates EOF ;
    public final void entryRuleStates() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:481:1: ( ruleStates EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:482:1: ruleStates EOF
            {
             before(grammarAccess.getStatesRule()); 
            pushFollow(FOLLOW_ruleStates_in_entryRuleStates961);
            ruleStates();

            state._fsp--;

             after(grammarAccess.getStatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStates968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStates"


    // $ANTLR start "ruleStates"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:489:1: ruleStates : ( ( rule__States__Group__0 ) ) ;
    public final void ruleStates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:493:2: ( ( ( rule__States__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:494:1: ( ( rule__States__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:494:1: ( ( rule__States__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:495:1: ( rule__States__Group__0 )
            {
             before(grammarAccess.getStatesAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:496:1: ( rule__States__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:496:2: rule__States__Group__0
            {
            pushFollow(FOLLOW_rule__States__Group__0_in_ruleStates994);
            rule__States__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStates"


    // $ANTLR start "entryRuleState"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:508:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:509:1: ( ruleState EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:510:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1021);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:517:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:521:2: ( ( ( rule__State__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:522:1: ( ( rule__State__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:522:1: ( ( rule__State__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:523:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:524:1: ( rule__State__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:524:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState1054);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateId"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:536:1: entryRuleStateId : ruleStateId EOF ;
    public final void entryRuleStateId() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:537:1: ( ruleStateId EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:538:1: ruleStateId EOF
            {
             before(grammarAccess.getStateIdRule()); 
            pushFollow(FOLLOW_ruleStateId_in_entryRuleStateId1081);
            ruleStateId();

            state._fsp--;

             after(grammarAccess.getStateIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateId1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateId"


    // $ANTLR start "ruleStateId"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:545:1: ruleStateId : ( ( rule__StateId__NameAssignment ) ) ;
    public final void ruleStateId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:549:2: ( ( ( rule__StateId__NameAssignment ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:550:1: ( ( rule__StateId__NameAssignment ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:550:1: ( ( rule__StateId__NameAssignment ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:551:1: ( rule__StateId__NameAssignment )
            {
             before(grammarAccess.getStateIdAccess().getNameAssignment()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:552:1: ( rule__StateId__NameAssignment )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:552:2: rule__StateId__NameAssignment
            {
            pushFollow(FOLLOW_rule__StateId__NameAssignment_in_ruleStateId1114);
            rule__StateId__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateIdAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateId"


    // $ANTLR start "entryRuleStateType"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:564:1: entryRuleStateType : ruleStateType EOF ;
    public final void entryRuleStateType() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:565:1: ( ruleStateType EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:566:1: ruleStateType EOF
            {
             before(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_ruleStateType_in_entryRuleStateType1141);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getStateTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateType1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateType"


    // $ANTLR start "ruleStateType"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:573:1: ruleStateType : ( ( rule__StateType__Group__0 ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:577:2: ( ( ( rule__StateType__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:578:1: ( ( rule__StateType__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:578:1: ( ( rule__StateType__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:579:1: ( rule__StateType__Group__0 )
            {
             before(grammarAccess.getStateTypeAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:580:1: ( rule__StateType__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:580:2: rule__StateType__Group__0
            {
            pushFollow(FOLLOW_rule__StateType__Group__0_in_ruleStateType1174);
            rule__StateType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateType"


    // $ANTLR start "entryRuleParticipants"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:592:1: entryRuleParticipants : ruleParticipants EOF ;
    public final void entryRuleParticipants() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:593:1: ( ruleParticipants EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:594:1: ruleParticipants EOF
            {
             before(grammarAccess.getParticipantsRule()); 
            pushFollow(FOLLOW_ruleParticipants_in_entryRuleParticipants1201);
            ruleParticipants();

            state._fsp--;

             after(grammarAccess.getParticipantsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipants1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipants"


    // $ANTLR start "ruleParticipants"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:601:1: ruleParticipants : ( ( rule__Participants__Group__0 ) ) ;
    public final void ruleParticipants() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:605:2: ( ( ( rule__Participants__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:606:1: ( ( rule__Participants__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:606:1: ( ( rule__Participants__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:607:1: ( rule__Participants__Group__0 )
            {
             before(grammarAccess.getParticipantsAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:608:1: ( rule__Participants__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:608:2: rule__Participants__Group__0
            {
            pushFollow(FOLLOW_rule__Participants__Group__0_in_ruleParticipants1234);
            rule__Participants__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipants"


    // $ANTLR start "entryRuleParticipant"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:620:1: entryRuleParticipant : ruleParticipant EOF ;
    public final void entryRuleParticipant() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:621:1: ( ruleParticipant EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:622:1: ruleParticipant EOF
            {
             before(grammarAccess.getParticipantRule()); 
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant1261);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getParticipantRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:629:1: ruleParticipant : ( ( rule__Participant__Group__0 ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:633:2: ( ( ( rule__Participant__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:634:1: ( ( rule__Participant__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:634:1: ( ( rule__Participant__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:635:1: ( rule__Participant__Group__0 )
            {
             before(grammarAccess.getParticipantAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:636:1: ( rule__Participant__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:636:2: rule__Participant__Group__0
            {
            pushFollow(FOLLOW_rule__Participant__Group__0_in_ruleParticipant1294);
            rule__Participant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleParticipantId"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:648:1: entryRuleParticipantId : ruleParticipantId EOF ;
    public final void entryRuleParticipantId() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:649:1: ( ruleParticipantId EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:650:1: ruleParticipantId EOF
            {
             before(grammarAccess.getParticipantIdRule()); 
            pushFollow(FOLLOW_ruleParticipantId_in_entryRuleParticipantId1321);
            ruleParticipantId();

            state._fsp--;

             after(grammarAccess.getParticipantIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantId1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantId"


    // $ANTLR start "ruleParticipantId"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:657:1: ruleParticipantId : ( ( rule__ParticipantId__NameAssignment ) ) ;
    public final void ruleParticipantId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:661:2: ( ( ( rule__ParticipantId__NameAssignment ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:662:1: ( ( rule__ParticipantId__NameAssignment ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:662:1: ( ( rule__ParticipantId__NameAssignment ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:663:1: ( rule__ParticipantId__NameAssignment )
            {
             before(grammarAccess.getParticipantIdAccess().getNameAssignment()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:664:1: ( rule__ParticipantId__NameAssignment )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:664:2: rule__ParticipantId__NameAssignment
            {
            pushFollow(FOLLOW_rule__ParticipantId__NameAssignment_in_ruleParticipantId1354);
            rule__ParticipantId__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParticipantIdAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantId"


    // $ANTLR start "entryRuleParticipantDescription"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:676:1: entryRuleParticipantDescription : ruleParticipantDescription EOF ;
    public final void entryRuleParticipantDescription() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:677:1: ( ruleParticipantDescription EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:678:1: ruleParticipantDescription EOF
            {
             before(grammarAccess.getParticipantDescriptionRule()); 
            pushFollow(FOLLOW_ruleParticipantDescription_in_entryRuleParticipantDescription1381);
            ruleParticipantDescription();

            state._fsp--;

             after(grammarAccess.getParticipantDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantDescription1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantDescription"


    // $ANTLR start "ruleParticipantDescription"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:685:1: ruleParticipantDescription : ( ( rule__ParticipantDescription__Group__0 ) ) ;
    public final void ruleParticipantDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:689:2: ( ( ( rule__ParticipantDescription__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:690:1: ( ( rule__ParticipantDescription__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:690:1: ( ( rule__ParticipantDescription__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:691:1: ( rule__ParticipantDescription__Group__0 )
            {
             before(grammarAccess.getParticipantDescriptionAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:692:1: ( rule__ParticipantDescription__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:692:2: rule__ParticipantDescription__Group__0
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__Group__0_in_ruleParticipantDescription1414);
            rule__ParticipantDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantDescription"


    // $ANTLR start "entryRuleParticipantCardinality"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:704:1: entryRuleParticipantCardinality : ruleParticipantCardinality EOF ;
    public final void entryRuleParticipantCardinality() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:705:1: ( ruleParticipantCardinality EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:706:1: ruleParticipantCardinality EOF
            {
             before(grammarAccess.getParticipantCardinalityRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinality_in_entryRuleParticipantCardinality1441);
            ruleParticipantCardinality();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinality1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantCardinality"


    // $ANTLR start "ruleParticipantCardinality"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:713:1: ruleParticipantCardinality : ( ( rule__ParticipantCardinality__Alternatives ) ) ;
    public final void ruleParticipantCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:717:2: ( ( ( rule__ParticipantCardinality__Alternatives ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:718:1: ( ( rule__ParticipantCardinality__Alternatives ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:718:1: ( ( rule__ParticipantCardinality__Alternatives ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:719:1: ( rule__ParticipantCardinality__Alternatives )
            {
             before(grammarAccess.getParticipantCardinalityAccess().getAlternatives()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:720:1: ( rule__ParticipantCardinality__Alternatives )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:720:2: rule__ParticipantCardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__ParticipantCardinality__Alternatives_in_ruleParticipantCardinality1474);
            rule__ParticipantCardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantCardinality"


    // $ANTLR start "entryRuleParticipantCardinalityMinMax"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:732:1: entryRuleParticipantCardinalityMinMax : ruleParticipantCardinalityMinMax EOF ;
    public final void entryRuleParticipantCardinalityMinMax() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:733:1: ( ruleParticipantCardinalityMinMax EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:734:1: ruleParticipantCardinalityMinMax EOF
            {
             before(grammarAccess.getParticipantCardinalityMinMaxRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMinMax_in_entryRuleParticipantCardinalityMinMax1501);
            ruleParticipantCardinalityMinMax();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityMinMaxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinalityMinMax1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantCardinalityMinMax"


    // $ANTLR start "ruleParticipantCardinalityMinMax"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:741:1: ruleParticipantCardinalityMinMax : ( ( rule__ParticipantCardinalityMinMax__Group__0 ) ) ;
    public final void ruleParticipantCardinalityMinMax() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:745:2: ( ( ( rule__ParticipantCardinalityMinMax__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:746:1: ( ( rule__ParticipantCardinalityMinMax__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:746:1: ( ( rule__ParticipantCardinalityMinMax__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:747:1: ( rule__ParticipantCardinalityMinMax__Group__0 )
            {
             before(grammarAccess.getParticipantCardinalityMinMaxAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:748:1: ( rule__ParticipantCardinalityMinMax__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:748:2: rule__ParticipantCardinalityMinMax__Group__0
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMinMax__Group__0_in_ruleParticipantCardinalityMinMax1534);
            rule__ParticipantCardinalityMinMax__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityMinMaxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantCardinalityMinMax"


    // $ANTLR start "entryRuleParticipantCardinalityMin"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:760:1: entryRuleParticipantCardinalityMin : ruleParticipantCardinalityMin EOF ;
    public final void entryRuleParticipantCardinalityMin() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:761:1: ( ruleParticipantCardinalityMin EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:762:1: ruleParticipantCardinalityMin EOF
            {
             before(grammarAccess.getParticipantCardinalityMinRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMin_in_entryRuleParticipantCardinalityMin1561);
            ruleParticipantCardinalityMin();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityMinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinalityMin1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantCardinalityMin"


    // $ANTLR start "ruleParticipantCardinalityMin"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:769:1: ruleParticipantCardinalityMin : ( ( rule__ParticipantCardinalityMin__Group__0 ) ) ;
    public final void ruleParticipantCardinalityMin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:773:2: ( ( ( rule__ParticipantCardinalityMin__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:774:1: ( ( rule__ParticipantCardinalityMin__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:774:1: ( ( rule__ParticipantCardinalityMin__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:775:1: ( rule__ParticipantCardinalityMin__Group__0 )
            {
             before(grammarAccess.getParticipantCardinalityMinAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:776:1: ( rule__ParticipantCardinalityMin__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:776:2: rule__ParticipantCardinalityMin__Group__0
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMin__Group__0_in_ruleParticipantCardinalityMin1594);
            rule__ParticipantCardinalityMin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityMinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantCardinalityMin"


    // $ANTLR start "entryRuleParticipantCardinalityMax"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:788:1: entryRuleParticipantCardinalityMax : ruleParticipantCardinalityMax EOF ;
    public final void entryRuleParticipantCardinalityMax() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:789:1: ( ruleParticipantCardinalityMax EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:790:1: ruleParticipantCardinalityMax EOF
            {
             before(grammarAccess.getParticipantCardinalityMaxRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMax_in_entryRuleParticipantCardinalityMax1621);
            ruleParticipantCardinalityMax();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityMaxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinalityMax1628); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantCardinalityMax"


    // $ANTLR start "ruleParticipantCardinalityMax"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:797:1: ruleParticipantCardinalityMax : ( ( rule__ParticipantCardinalityMax__Group__0 ) ) ;
    public final void ruleParticipantCardinalityMax() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:801:2: ( ( ( rule__ParticipantCardinalityMax__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:802:1: ( ( rule__ParticipantCardinalityMax__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:802:1: ( ( rule__ParticipantCardinalityMax__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:803:1: ( rule__ParticipantCardinalityMax__Group__0 )
            {
             before(grammarAccess.getParticipantCardinalityMaxAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:804:1: ( rule__ParticipantCardinalityMax__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:804:2: rule__ParticipantCardinalityMax__Group__0
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMax__Group__0_in_ruleParticipantCardinalityMax1654);
            rule__ParticipantCardinalityMax__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityMaxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantCardinalityMax"


    // $ANTLR start "entryRuleParticipantCardinalityAll"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:816:1: entryRuleParticipantCardinalityAll : ruleParticipantCardinalityAll EOF ;
    public final void entryRuleParticipantCardinalityAll() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:817:1: ( ruleParticipantCardinalityAll EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:818:1: ruleParticipantCardinalityAll EOF
            {
             before(grammarAccess.getParticipantCardinalityAllRule()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityAll_in_entryRuleParticipantCardinalityAll1681);
            ruleParticipantCardinalityAll();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityAllRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipantCardinalityAll1688); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParticipantCardinalityAll"


    // $ANTLR start "ruleParticipantCardinalityAll"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:825:1: ruleParticipantCardinalityAll : ( ( rule__ParticipantCardinalityAll__NameAssignment ) ) ;
    public final void ruleParticipantCardinalityAll() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:829:2: ( ( ( rule__ParticipantCardinalityAll__NameAssignment ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:830:1: ( ( rule__ParticipantCardinalityAll__NameAssignment ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:830:1: ( ( rule__ParticipantCardinalityAll__NameAssignment ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:831:1: ( rule__ParticipantCardinalityAll__NameAssignment )
            {
             before(grammarAccess.getParticipantCardinalityAllAccess().getNameAssignment()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:832:1: ( rule__ParticipantCardinalityAll__NameAssignment )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:832:2: rule__ParticipantCardinalityAll__NameAssignment
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityAll__NameAssignment_in_ruleParticipantCardinalityAll1714);
            rule__ParticipantCardinalityAll__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityAllAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParticipantCardinalityAll"


    // $ANTLR start "entryRuleType"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:844:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:845:1: ( ruleType EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:846:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1741);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1748); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:853:1: ruleType : ( ( rule__Type__TypeAssignment ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:857:2: ( ( ( rule__Type__TypeAssignment ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:858:1: ( ( rule__Type__TypeAssignment ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:858:1: ( ( rule__Type__TypeAssignment ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:859:1: ( rule__Type__TypeAssignment )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:860:1: ( rule__Type__TypeAssignment )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:860:2: rule__Type__TypeAssignment
            {
            pushFollow(FOLLOW_rule__Type__TypeAssignment_in_ruleType1774);
            rule__Type__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRole"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:872:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:873:1: ( ruleRole EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:874:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1801);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1808); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:881:1: ruleRole : ( ( rule__Role__RoleAssignment ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:885:2: ( ( ( rule__Role__RoleAssignment ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:886:1: ( ( rule__Role__RoleAssignment ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:886:1: ( ( rule__Role__RoleAssignment ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:887:1: ( rule__Role__RoleAssignment )
            {
             before(grammarAccess.getRoleAccess().getRoleAssignment()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:888:1: ( rule__Role__RoleAssignment )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:888:2: rule__Role__RoleAssignment
            {
            pushFollow(FOLLOW_rule__Role__RoleAssignment_in_ruleRole1834);
            rule__Role__RoleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getRoleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleDescription"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:900:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:901:1: ( ruleDescription EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:902:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription1861);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription1868); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:909:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:913:2: ( ( ( rule__Description__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:914:1: ( ( rule__Description__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:914:1: ( ( rule__Description__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:915:1: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:916:1: ( rule__Description__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:916:2: rule__Description__Group__0
            {
            pushFollow(FOLLOW_rule__Description__Group__0_in_ruleDescription1894);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleGoals"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:928:1: entryRuleGoals : ruleGoals EOF ;
    public final void entryRuleGoals() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:929:1: ( ruleGoals EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:930:1: ruleGoals EOF
            {
             before(grammarAccess.getGoalsRule()); 
            pushFollow(FOLLOW_ruleGoals_in_entryRuleGoals1921);
            ruleGoals();

            state._fsp--;

             after(grammarAccess.getGoalsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoals1928); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoals"


    // $ANTLR start "ruleGoals"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:937:1: ruleGoals : ( ( rule__Goals__Group__0 ) ) ;
    public final void ruleGoals() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:941:2: ( ( ( rule__Goals__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:942:1: ( ( rule__Goals__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:942:1: ( ( rule__Goals__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:943:1: ( rule__Goals__Group__0 )
            {
             before(grammarAccess.getGoalsAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:944:1: ( rule__Goals__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:944:2: rule__Goals__Group__0
            {
            pushFollow(FOLLOW_rule__Goals__Group__0_in_ruleGoals1954);
            rule__Goals__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoals"


    // $ANTLR start "entryRuleGoal"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:956:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:957:1: ( ruleGoal EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:958:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1981);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1988); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:965:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:969:2: ( ( ( rule__Goal__Group__0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:970:1: ( ( rule__Goal__Group__0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:970:1: ( ( rule__Goal__Group__0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:971:1: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:972:1: ( rule__Goal__Group__0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:972:2: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_rule__Goal__Group__0_in_ruleGoal2014);
            rule__Goal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleTK_PROTOCOL"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:984:1: entryRuleTK_PROTOCOL : ruleTK_PROTOCOL EOF ;
    public final void entryRuleTK_PROTOCOL() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:985:1: ( ruleTK_PROTOCOL EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:986:1: ruleTK_PROTOCOL EOF
            {
             before(grammarAccess.getTK_PROTOCOLRule()); 
            pushFollow(FOLLOW_ruleTK_PROTOCOL_in_entryRuleTK_PROTOCOL2041);
            ruleTK_PROTOCOL();

            state._fsp--;

             after(grammarAccess.getTK_PROTOCOLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_PROTOCOL2048); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_PROTOCOL"


    // $ANTLR start "ruleTK_PROTOCOL"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:993:1: ruleTK_PROTOCOL : ( 'protocol' ) ;
    public final void ruleTK_PROTOCOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:997:2: ( ( 'protocol' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:998:1: ( 'protocol' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:998:1: ( 'protocol' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:999:1: 'protocol'
            {
             before(grammarAccess.getTK_PROTOCOLAccess().getProtocolKeyword()); 
            match(input,11,FOLLOW_11_in_ruleTK_PROTOCOL2075); 
             after(grammarAccess.getTK_PROTOCOLAccess().getProtocolKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_PROTOCOL"


    // $ANTLR start "entryRuleTK_DESCRIPTION"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1014:1: entryRuleTK_DESCRIPTION : ruleTK_DESCRIPTION EOF ;
    public final void entryRuleTK_DESCRIPTION() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1015:1: ( ruleTK_DESCRIPTION EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1016:1: ruleTK_DESCRIPTION EOF
            {
             before(grammarAccess.getTK_DESCRIPTIONRule()); 
            pushFollow(FOLLOW_ruleTK_DESCRIPTION_in_entryRuleTK_DESCRIPTION2103);
            ruleTK_DESCRIPTION();

            state._fsp--;

             after(grammarAccess.getTK_DESCRIPTIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_DESCRIPTION2110); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_DESCRIPTION"


    // $ANTLR start "ruleTK_DESCRIPTION"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1023:1: ruleTK_DESCRIPTION : ( 'description' ) ;
    public final void ruleTK_DESCRIPTION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1027:2: ( ( 'description' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1028:1: ( 'description' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1028:1: ( 'description' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1029:1: 'description'
            {
             before(grammarAccess.getTK_DESCRIPTIONAccess().getDescriptionKeyword()); 
            match(input,12,FOLLOW_12_in_ruleTK_DESCRIPTION2137); 
             after(grammarAccess.getTK_DESCRIPTIONAccess().getDescriptionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_DESCRIPTION"


    // $ANTLR start "entryRuleTK_GOALS"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1044:1: entryRuleTK_GOALS : ruleTK_GOALS EOF ;
    public final void entryRuleTK_GOALS() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1045:1: ( ruleTK_GOALS EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1046:1: ruleTK_GOALS EOF
            {
             before(grammarAccess.getTK_GOALSRule()); 
            pushFollow(FOLLOW_ruleTK_GOALS_in_entryRuleTK_GOALS2165);
            ruleTK_GOALS();

            state._fsp--;

             after(grammarAccess.getTK_GOALSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_GOALS2172); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_GOALS"


    // $ANTLR start "ruleTK_GOALS"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1053:1: ruleTK_GOALS : ( 'goals' ) ;
    public final void ruleTK_GOALS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1057:2: ( ( 'goals' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1058:1: ( 'goals' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1058:1: ( 'goals' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1059:1: 'goals'
            {
             before(grammarAccess.getTK_GOALSAccess().getGoalsKeyword()); 
            match(input,13,FOLLOW_13_in_ruleTK_GOALS2199); 
             after(grammarAccess.getTK_GOALSAccess().getGoalsKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_GOALS"


    // $ANTLR start "entryRuleTK_PARTICIPANTS"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1074:1: entryRuleTK_PARTICIPANTS : ruleTK_PARTICIPANTS EOF ;
    public final void entryRuleTK_PARTICIPANTS() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1075:1: ( ruleTK_PARTICIPANTS EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1076:1: ruleTK_PARTICIPANTS EOF
            {
             before(grammarAccess.getTK_PARTICIPANTSRule()); 
            pushFollow(FOLLOW_ruleTK_PARTICIPANTS_in_entryRuleTK_PARTICIPANTS2227);
            ruleTK_PARTICIPANTS();

            state._fsp--;

             after(grammarAccess.getTK_PARTICIPANTSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_PARTICIPANTS2234); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_PARTICIPANTS"


    // $ANTLR start "ruleTK_PARTICIPANTS"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1083:1: ruleTK_PARTICIPANTS : ( 'participants' ) ;
    public final void ruleTK_PARTICIPANTS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1087:2: ( ( 'participants' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1088:1: ( 'participants' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1088:1: ( 'participants' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1089:1: 'participants'
            {
             before(grammarAccess.getTK_PARTICIPANTSAccess().getParticipantsKeyword()); 
            match(input,14,FOLLOW_14_in_ruleTK_PARTICIPANTS2261); 
             after(grammarAccess.getTK_PARTICIPANTSAccess().getParticipantsKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_PARTICIPANTS"


    // $ANTLR start "entryRuleTK_AGENT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1104:1: entryRuleTK_AGENT : ruleTK_AGENT EOF ;
    public final void entryRuleTK_AGENT() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1105:1: ( ruleTK_AGENT EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1106:1: ruleTK_AGENT EOF
            {
             before(grammarAccess.getTK_AGENTRule()); 
            pushFollow(FOLLOW_ruleTK_AGENT_in_entryRuleTK_AGENT2289);
            ruleTK_AGENT();

            state._fsp--;

             after(grammarAccess.getTK_AGENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_AGENT2296); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_AGENT"


    // $ANTLR start "ruleTK_AGENT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1113:1: ruleTK_AGENT : ( 'agent' ) ;
    public final void ruleTK_AGENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1117:2: ( ( 'agent' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1118:1: ( 'agent' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1118:1: ( 'agent' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1119:1: 'agent'
            {
             before(grammarAccess.getTK_AGENTAccess().getAgentKeyword()); 
            match(input,15,FOLLOW_15_in_ruleTK_AGENT2323); 
             after(grammarAccess.getTK_AGENTAccess().getAgentKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_AGENT"


    // $ANTLR start "entryRuleTK_ARTIFACT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1134:1: entryRuleTK_ARTIFACT : ruleTK_ARTIFACT EOF ;
    public final void entryRuleTK_ARTIFACT() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1135:1: ( ruleTK_ARTIFACT EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1136:1: ruleTK_ARTIFACT EOF
            {
             before(grammarAccess.getTK_ARTIFACTRule()); 
            pushFollow(FOLLOW_ruleTK_ARTIFACT_in_entryRuleTK_ARTIFACT2351);
            ruleTK_ARTIFACT();

            state._fsp--;

             after(grammarAccess.getTK_ARTIFACTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_ARTIFACT2358); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_ARTIFACT"


    // $ANTLR start "ruleTK_ARTIFACT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1143:1: ruleTK_ARTIFACT : ( 'artifact' ) ;
    public final void ruleTK_ARTIFACT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1147:2: ( ( 'artifact' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1148:1: ( 'artifact' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1148:1: ( 'artifact' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1149:1: 'artifact'
            {
             before(grammarAccess.getTK_ARTIFACTAccess().getArtifactKeyword()); 
            match(input,16,FOLLOW_16_in_ruleTK_ARTIFACT2385); 
             after(grammarAccess.getTK_ARTIFACTAccess().getArtifactKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_ARTIFACT"


    // $ANTLR start "entryRuleTK_MAX"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1164:1: entryRuleTK_MAX : ruleTK_MAX EOF ;
    public final void entryRuleTK_MAX() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1165:1: ( ruleTK_MAX EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1166:1: ruleTK_MAX EOF
            {
             before(grammarAccess.getTK_MAXRule()); 
            pushFollow(FOLLOW_ruleTK_MAX_in_entryRuleTK_MAX2413);
            ruleTK_MAX();

            state._fsp--;

             after(grammarAccess.getTK_MAXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MAX2420); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_MAX"


    // $ANTLR start "ruleTK_MAX"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1173:1: ruleTK_MAX : ( 'max' ) ;
    public final void ruleTK_MAX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1177:2: ( ( 'max' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1178:1: ( 'max' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1178:1: ( 'max' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1179:1: 'max'
            {
             before(grammarAccess.getTK_MAXAccess().getMaxKeyword()); 
            match(input,17,FOLLOW_17_in_ruleTK_MAX2447); 
             after(grammarAccess.getTK_MAXAccess().getMaxKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_MAX"


    // $ANTLR start "entryRuleTK_MIN"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1194:1: entryRuleTK_MIN : ruleTK_MIN EOF ;
    public final void entryRuleTK_MIN() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1195:1: ( ruleTK_MIN EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1196:1: ruleTK_MIN EOF
            {
             before(grammarAccess.getTK_MINRule()); 
            pushFollow(FOLLOW_ruleTK_MIN_in_entryRuleTK_MIN2475);
            ruleTK_MIN();

            state._fsp--;

             after(grammarAccess.getTK_MINRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MIN2482); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_MIN"


    // $ANTLR start "ruleTK_MIN"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1203:1: ruleTK_MIN : ( 'min' ) ;
    public final void ruleTK_MIN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1207:2: ( ( 'min' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1208:1: ( 'min' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1208:1: ( 'min' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1209:1: 'min'
            {
             before(grammarAccess.getTK_MINAccess().getMinKeyword()); 
            match(input,18,FOLLOW_18_in_ruleTK_MIN2509); 
             after(grammarAccess.getTK_MINAccess().getMinKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_MIN"


    // $ANTLR start "entryRuleTK_STATES"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1224:1: entryRuleTK_STATES : ruleTK_STATES EOF ;
    public final void entryRuleTK_STATES() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1225:1: ( ruleTK_STATES EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1226:1: ruleTK_STATES EOF
            {
             before(grammarAccess.getTK_STATESRule()); 
            pushFollow(FOLLOW_ruleTK_STATES_in_entryRuleTK_STATES2537);
            ruleTK_STATES();

            state._fsp--;

             after(grammarAccess.getTK_STATESRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_STATES2544); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_STATES"


    // $ANTLR start "ruleTK_STATES"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1233:1: ruleTK_STATES : ( 'states' ) ;
    public final void ruleTK_STATES() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1237:2: ( ( 'states' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1238:1: ( 'states' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1238:1: ( 'states' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1239:1: 'states'
            {
             before(grammarAccess.getTK_STATESAccess().getStatesKeyword()); 
            match(input,19,FOLLOW_19_in_ruleTK_STATES2571); 
             after(grammarAccess.getTK_STATESAccess().getStatesKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_STATES"


    // $ANTLR start "entryRuleTK_INITIAL"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1254:1: entryRuleTK_INITIAL : ruleTK_INITIAL EOF ;
    public final void entryRuleTK_INITIAL() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1255:1: ( ruleTK_INITIAL EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1256:1: ruleTK_INITIAL EOF
            {
             before(grammarAccess.getTK_INITIALRule()); 
            pushFollow(FOLLOW_ruleTK_INITIAL_in_entryRuleTK_INITIAL2599);
            ruleTK_INITIAL();

            state._fsp--;

             after(grammarAccess.getTK_INITIALRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_INITIAL2606); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_INITIAL"


    // $ANTLR start "ruleTK_INITIAL"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1263:1: ruleTK_INITIAL : ( 'initial' ) ;
    public final void ruleTK_INITIAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1267:2: ( ( 'initial' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1268:1: ( 'initial' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1268:1: ( 'initial' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1269:1: 'initial'
            {
             before(grammarAccess.getTK_INITIALAccess().getInitialKeyword()); 
            match(input,20,FOLLOW_20_in_ruleTK_INITIAL2633); 
             after(grammarAccess.getTK_INITIALAccess().getInitialKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_INITIAL"


    // $ANTLR start "entryRuleTK_FINAL"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1284:1: entryRuleTK_FINAL : ruleTK_FINAL EOF ;
    public final void entryRuleTK_FINAL() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1285:1: ( ruleTK_FINAL EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1286:1: ruleTK_FINAL EOF
            {
             before(grammarAccess.getTK_FINALRule()); 
            pushFollow(FOLLOW_ruleTK_FINAL_in_entryRuleTK_FINAL2661);
            ruleTK_FINAL();

            state._fsp--;

             after(grammarAccess.getTK_FINALRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_FINAL2668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_FINAL"


    // $ANTLR start "ruleTK_FINAL"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1293:1: ruleTK_FINAL : ( 'final' ) ;
    public final void ruleTK_FINAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1297:2: ( ( 'final' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1298:1: ( 'final' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1298:1: ( 'final' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1299:1: 'final'
            {
             before(grammarAccess.getTK_FINALAccess().getFinalKeyword()); 
            match(input,21,FOLLOW_21_in_ruleTK_FINAL2695); 
             after(grammarAccess.getTK_FINALAccess().getFinalKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_FINAL"


    // $ANTLR start "entryRuleTK_TRANSITIONS"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1314:1: entryRuleTK_TRANSITIONS : ruleTK_TRANSITIONS EOF ;
    public final void entryRuleTK_TRANSITIONS() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1315:1: ( ruleTK_TRANSITIONS EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1316:1: ruleTK_TRANSITIONS EOF
            {
             before(grammarAccess.getTK_TRANSITIONSRule()); 
            pushFollow(FOLLOW_ruleTK_TRANSITIONS_in_entryRuleTK_TRANSITIONS2723);
            ruleTK_TRANSITIONS();

            state._fsp--;

             after(grammarAccess.getTK_TRANSITIONSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_TRANSITIONS2730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_TRANSITIONS"


    // $ANTLR start "ruleTK_TRANSITIONS"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1323:1: ruleTK_TRANSITIONS : ( 'transitions' ) ;
    public final void ruleTK_TRANSITIONS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1327:2: ( ( 'transitions' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1328:1: ( 'transitions' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1328:1: ( 'transitions' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1329:1: 'transitions'
            {
             before(grammarAccess.getTK_TRANSITIONSAccess().getTransitionsKeyword()); 
            match(input,22,FOLLOW_22_in_ruleTK_TRANSITIONS2757); 
             after(grammarAccess.getTK_TRANSITIONSAccess().getTransitionsKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_TRANSITIONS"


    // $ANTLR start "entryRuleTK_TIMEOUT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1344:1: entryRuleTK_TIMEOUT : ruleTK_TIMEOUT EOF ;
    public final void entryRuleTK_TIMEOUT() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1345:1: ( ruleTK_TIMEOUT EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1346:1: ruleTK_TIMEOUT EOF
            {
             before(grammarAccess.getTK_TIMEOUTRule()); 
            pushFollow(FOLLOW_ruleTK_TIMEOUT_in_entryRuleTK_TIMEOUT2785);
            ruleTK_TIMEOUT();

            state._fsp--;

             after(grammarAccess.getTK_TIMEOUTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_TIMEOUT2792); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_TIMEOUT"


    // $ANTLR start "ruleTK_TIMEOUT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1353:1: ruleTK_TIMEOUT : ( 'timeout' ) ;
    public final void ruleTK_TIMEOUT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1357:2: ( ( 'timeout' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1358:1: ( 'timeout' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1358:1: ( 'timeout' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1359:1: 'timeout'
            {
             before(grammarAccess.getTK_TIMEOUTAccess().getTimeoutKeyword()); 
            match(input,23,FOLLOW_23_in_ruleTK_TIMEOUT2819); 
             after(grammarAccess.getTK_TIMEOUTAccess().getTimeoutKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_TIMEOUT"


    // $ANTLR start "entryRuleTK_MESSAGE"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1374:1: entryRuleTK_MESSAGE : ruleTK_MESSAGE EOF ;
    public final void entryRuleTK_MESSAGE() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1375:1: ( ruleTK_MESSAGE EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1376:1: ruleTK_MESSAGE EOF
            {
             before(grammarAccess.getTK_MESSAGERule()); 
            pushFollow(FOLLOW_ruleTK_MESSAGE_in_entryRuleTK_MESSAGE2847);
            ruleTK_MESSAGE();

            state._fsp--;

             after(grammarAccess.getTK_MESSAGERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MESSAGE2854); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_MESSAGE"


    // $ANTLR start "ruleTK_MESSAGE"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1383:1: ruleTK_MESSAGE : ( 'message' ) ;
    public final void ruleTK_MESSAGE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1387:2: ( ( 'message' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1388:1: ( 'message' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1388:1: ( 'message' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1389:1: 'message'
            {
             before(grammarAccess.getTK_MESSAGEAccess().getMessageKeyword()); 
            match(input,24,FOLLOW_24_in_ruleTK_MESSAGE2881); 
             after(grammarAccess.getTK_MESSAGEAccess().getMessageKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_MESSAGE"


    // $ANTLR start "entryRuleTK_ACTION"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1404:1: entryRuleTK_ACTION : ruleTK_ACTION EOF ;
    public final void entryRuleTK_ACTION() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1405:1: ( ruleTK_ACTION EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1406:1: ruleTK_ACTION EOF
            {
             before(grammarAccess.getTK_ACTIONRule()); 
            pushFollow(FOLLOW_ruleTK_ACTION_in_entryRuleTK_ACTION2909);
            ruleTK_ACTION();

            state._fsp--;

             after(grammarAccess.getTK_ACTIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_ACTION2916); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_ACTION"


    // $ANTLR start "ruleTK_ACTION"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1413:1: ruleTK_ACTION : ( 'action' ) ;
    public final void ruleTK_ACTION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1417:2: ( ( 'action' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1418:1: ( 'action' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1418:1: ( 'action' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1419:1: 'action'
            {
             before(grammarAccess.getTK_ACTIONAccess().getActionKeyword()); 
            match(input,25,FOLLOW_25_in_ruleTK_ACTION2943); 
             after(grammarAccess.getTK_ACTIONAccess().getActionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_ACTION"


    // $ANTLR start "entryRuleTK_EVENT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1434:1: entryRuleTK_EVENT : ruleTK_EVENT EOF ;
    public final void entryRuleTK_EVENT() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1435:1: ( ruleTK_EVENT EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1436:1: ruleTK_EVENT EOF
            {
             before(grammarAccess.getTK_EVENTRule()); 
            pushFollow(FOLLOW_ruleTK_EVENT_in_entryRuleTK_EVENT2971);
            ruleTK_EVENT();

            state._fsp--;

             after(grammarAccess.getTK_EVENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_EVENT2978); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_EVENT"


    // $ANTLR start "ruleTK_EVENT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1443:1: ruleTK_EVENT : ( 'event' ) ;
    public final void ruleTK_EVENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1447:2: ( ( 'event' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1448:1: ( 'event' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1448:1: ( 'event' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1449:1: 'event'
            {
             before(grammarAccess.getTK_EVENTAccess().getEventKeyword()); 
            match(input,26,FOLLOW_26_in_ruleTK_EVENT3005); 
             after(grammarAccess.getTK_EVENTAccess().getEventKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_EVENT"


    // $ANTLR start "entryRuleTK_TRIGGER"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1464:1: entryRuleTK_TRIGGER : ruleTK_TRIGGER EOF ;
    public final void entryRuleTK_TRIGGER() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1465:1: ( ruleTK_TRIGGER EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1466:1: ruleTK_TRIGGER EOF
            {
             before(grammarAccess.getTK_TRIGGERRule()); 
            pushFollow(FOLLOW_ruleTK_TRIGGER_in_entryRuleTK_TRIGGER3033);
            ruleTK_TRIGGER();

            state._fsp--;

             after(grammarAccess.getTK_TRIGGERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_TRIGGER3040); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_TRIGGER"


    // $ANTLR start "ruleTK_TRIGGER"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1473:1: ruleTK_TRIGGER : ( 'trigger' ) ;
    public final void ruleTK_TRIGGER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1477:2: ( ( 'trigger' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1478:1: ( 'trigger' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1478:1: ( 'trigger' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1479:1: 'trigger'
            {
             before(grammarAccess.getTK_TRIGGERAccess().getTriggerKeyword()); 
            match(input,27,FOLLOW_27_in_ruleTK_TRIGGER3067); 
             after(grammarAccess.getTK_TRIGGERAccess().getTriggerKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_TRIGGER"


    // $ANTLR start "entryRuleTK_IMPORT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1494:1: entryRuleTK_IMPORT : ruleTK_IMPORT EOF ;
    public final void entryRuleTK_IMPORT() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1495:1: ( ruleTK_IMPORT EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1496:1: ruleTK_IMPORT EOF
            {
             before(grammarAccess.getTK_IMPORTRule()); 
            pushFollow(FOLLOW_ruleTK_IMPORT_in_entryRuleTK_IMPORT3095);
            ruleTK_IMPORT();

            state._fsp--;

             after(grammarAccess.getTK_IMPORTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_IMPORT3102); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_IMPORT"


    // $ANTLR start "ruleTK_IMPORT"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1503:1: ruleTK_IMPORT : ( 'import' ) ;
    public final void ruleTK_IMPORT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1507:2: ( ( 'import' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1508:1: ( 'import' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1508:1: ( 'import' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1509:1: 'import'
            {
             before(grammarAccess.getTK_IMPORTAccess().getImportKeyword()); 
            match(input,28,FOLLOW_28_in_ruleTK_IMPORT3129); 
             after(grammarAccess.getTK_IMPORTAccess().getImportKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_IMPORT"


    // $ANTLR start "entryRuleTK_MAPPING"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1524:1: entryRuleTK_MAPPING : ruleTK_MAPPING EOF ;
    public final void entryRuleTK_MAPPING() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1525:1: ( ruleTK_MAPPING EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1526:1: ruleTK_MAPPING EOF
            {
             before(grammarAccess.getTK_MAPPINGRule()); 
            pushFollow(FOLLOW_ruleTK_MAPPING_in_entryRuleTK_MAPPING3157);
            ruleTK_MAPPING();

            state._fsp--;

             after(grammarAccess.getTK_MAPPINGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_MAPPING3164); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_MAPPING"


    // $ANTLR start "ruleTK_MAPPING"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1533:1: ruleTK_MAPPING : ( 'mapping' ) ;
    public final void ruleTK_MAPPING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1537:2: ( ( 'mapping' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1538:1: ( 'mapping' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1538:1: ( 'mapping' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1539:1: 'mapping'
            {
             before(grammarAccess.getTK_MAPPINGAccess().getMappingKeyword()); 
            match(input,29,FOLLOW_29_in_ruleTK_MAPPING3191); 
             after(grammarAccess.getTK_MAPPINGAccess().getMappingKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_MAPPING"


    // $ANTLR start "entryRuleTK_ALL"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1554:1: entryRuleTK_ALL : ruleTK_ALL EOF ;
    public final void entryRuleTK_ALL() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1555:1: ( ruleTK_ALL EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1556:1: ruleTK_ALL EOF
            {
             before(grammarAccess.getTK_ALLRule()); 
            pushFollow(FOLLOW_ruleTK_ALL_in_entryRuleTK_ALL3219);
            ruleTK_ALL();

            state._fsp--;

             after(grammarAccess.getTK_ALLRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_ALL3226); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_ALL"


    // $ANTLR start "ruleTK_ALL"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1563:1: ruleTK_ALL : ( 'all' ) ;
    public final void ruleTK_ALL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1567:2: ( ( 'all' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1568:1: ( 'all' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1568:1: ( 'all' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1569:1: 'all'
            {
             before(grammarAccess.getTK_ALLAccess().getAllKeyword()); 
            match(input,30,FOLLOW_30_in_ruleTK_ALL3253); 
             after(grammarAccess.getTK_ALLAccess().getAllKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_ALL"


    // $ANTLR start "entryRuleTK_PLUS"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1584:1: entryRuleTK_PLUS : ruleTK_PLUS EOF ;
    public final void entryRuleTK_PLUS() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1585:1: ( ruleTK_PLUS EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1586:1: ruleTK_PLUS EOF
            {
             before(grammarAccess.getTK_PLUSRule()); 
            pushFollow(FOLLOW_ruleTK_PLUS_in_entryRuleTK_PLUS3281);
            ruleTK_PLUS();

            state._fsp--;

             after(grammarAccess.getTK_PLUSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTK_PLUS3288); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTK_PLUS"


    // $ANTLR start "ruleTK_PLUS"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1593:1: ruleTK_PLUS : ( '+' ) ;
    public final void ruleTK_PLUS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1597:2: ( ( '+' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1598:1: ( '+' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1598:1: ( '+' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1599:1: '+'
            {
             before(grammarAccess.getTK_PLUSAccess().getPlusSignKeyword()); 
            match(input,31,FOLLOW_31_in_ruleTK_PLUS3315); 
             after(grammarAccess.getTK_PLUSAccess().getPlusSignKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTK_PLUS"


    // $ANTLR start "entryRuleID"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1614:1: entryRuleID : ruleID EOF ;
    public final void entryRuleID() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1615:1: ( ruleID EOF )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1616:1: ruleID EOF
            {
             before(grammarAccess.getIDRule()); 
            pushFollow(FOLLOW_ruleID_in_entryRuleID3343);
            ruleID();

            state._fsp--;

             after(grammarAccess.getIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleID3350); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1623:1: ruleID : ( RULE_ID_WITH_STARTING_LCLETTER ) ;
    public final void ruleID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1627:2: ( ( RULE_ID_WITH_STARTING_LCLETTER ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1628:1: ( RULE_ID_WITH_STARTING_LCLETTER )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1628:1: ( RULE_ID_WITH_STARTING_LCLETTER )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1629:1: RULE_ID_WITH_STARTING_LCLETTER
            {
             before(grammarAccess.getIDAccess().getID_WITH_STARTING_LCLETTERTerminalRuleCall()); 
            match(input,RULE_ID_WITH_STARTING_LCLETTER,FOLLOW_RULE_ID_WITH_STARTING_LCLETTER_in_ruleID3376); 
             after(grammarAccess.getIDAccess().getID_WITH_STARTING_LCLETTERTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleID"


    // $ANTLR start "rule__TransitionType__Alternatives"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1642:1: rule__TransitionType__Alternatives : ( ( ( rule__TransitionType__TypeAssignment_0 ) ) | ( ( rule__TransitionType__TypeAssignment_1 ) ) | ( ( rule__TransitionType__TypeAssignment_2 ) ) );
    public final void rule__TransitionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1646:1: ( ( ( rule__TransitionType__TypeAssignment_0 ) ) | ( ( rule__TransitionType__TypeAssignment_1 ) ) | ( ( rule__TransitionType__TypeAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ID_WITH_STARTING_LCLETTER:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1647:1: ( ( rule__TransitionType__TypeAssignment_0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1647:1: ( ( rule__TransitionType__TypeAssignment_0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1648:1: ( rule__TransitionType__TypeAssignment_0 )
                    {
                     before(grammarAccess.getTransitionTypeAccess().getTypeAssignment_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1649:1: ( rule__TransitionType__TypeAssignment_0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1649:2: rule__TransitionType__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TransitionType__TypeAssignment_0_in_rule__TransitionType__Alternatives3411);
                    rule__TransitionType__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionTypeAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1653:6: ( ( rule__TransitionType__TypeAssignment_1 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1653:6: ( ( rule__TransitionType__TypeAssignment_1 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1654:1: ( rule__TransitionType__TypeAssignment_1 )
                    {
                     before(grammarAccess.getTransitionTypeAccess().getTypeAssignment_1()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1655:1: ( rule__TransitionType__TypeAssignment_1 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1655:2: rule__TransitionType__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TransitionType__TypeAssignment_1_in_rule__TransitionType__Alternatives3429);
                    rule__TransitionType__TypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionTypeAccess().getTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1659:6: ( ( rule__TransitionType__TypeAssignment_2 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1659:6: ( ( rule__TransitionType__TypeAssignment_2 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1660:1: ( rule__TransitionType__TypeAssignment_2 )
                    {
                     before(grammarAccess.getTransitionTypeAccess().getTypeAssignment_2()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1661:1: ( rule__TransitionType__TypeAssignment_2 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1661:2: rule__TransitionType__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TransitionType__TypeAssignment_2_in_rule__TransitionType__Alternatives3447);
                    rule__TransitionType__TypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionTypeAccess().getTypeAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionType__Alternatives"


    // $ANTLR start "rule__Trigger__Alternatives_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1670:1: rule__Trigger__Alternatives_1 : ( ( ( rule__Trigger__Group_1_0__0 ) ) | ( ( rule__Trigger__ContentAssignment_1_1 ) ) );
    public final void rule__Trigger__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1674:1: ( ( ( rule__Trigger__Group_1_0__0 ) ) | ( ( rule__Trigger__ContentAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1675:1: ( ( rule__Trigger__Group_1_0__0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1675:1: ( ( rule__Trigger__Group_1_0__0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1676:1: ( rule__Trigger__Group_1_0__0 )
                    {
                     before(grammarAccess.getTriggerAccess().getGroup_1_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1677:1: ( rule__Trigger__Group_1_0__0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1677:2: rule__Trigger__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Trigger__Group_1_0__0_in_rule__Trigger__Alternatives_13480);
                    rule__Trigger__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTriggerAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1681:6: ( ( rule__Trigger__ContentAssignment_1_1 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1681:6: ( ( rule__Trigger__ContentAssignment_1_1 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1682:1: ( rule__Trigger__ContentAssignment_1_1 )
                    {
                     before(grammarAccess.getTriggerAccess().getContentAssignment_1_1()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1683:1: ( rule__Trigger__ContentAssignment_1_1 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1683:2: rule__Trigger__ContentAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Trigger__ContentAssignment_1_1_in_rule__Trigger__Alternatives_13498);
                    rule__Trigger__ContentAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTriggerAccess().getContentAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Alternatives_1"


    // $ANTLR start "rule__Occurrence__Alternatives_5"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1692:1: rule__Occurrence__Alternatives_5 : ( ( ( ( rule__Occurrence__TriggerAssignment_5_0 ) ) ( ( rule__Occurrence__TriggerAssignment_5_0 )* ) ) | ( ';' ) );
    public final void rule__Occurrence__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1696:1: ( ( ( ( rule__Occurrence__TriggerAssignment_5_0 ) ) ( ( rule__Occurrence__TriggerAssignment_5_0 )* ) ) | ( ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27||LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1697:1: ( ( ( rule__Occurrence__TriggerAssignment_5_0 ) ) ( ( rule__Occurrence__TriggerAssignment_5_0 )* ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1697:1: ( ( ( rule__Occurrence__TriggerAssignment_5_0 ) ) ( ( rule__Occurrence__TriggerAssignment_5_0 )* ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1698:1: ( ( rule__Occurrence__TriggerAssignment_5_0 ) ) ( ( rule__Occurrence__TriggerAssignment_5_0 )* )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1698:1: ( ( rule__Occurrence__TriggerAssignment_5_0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1699:1: ( rule__Occurrence__TriggerAssignment_5_0 )
                    {
                     before(grammarAccess.getOccurrenceAccess().getTriggerAssignment_5_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1700:1: ( rule__Occurrence__TriggerAssignment_5_0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1700:2: rule__Occurrence__TriggerAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Occurrence__TriggerAssignment_5_0_in_rule__Occurrence__Alternatives_53533);
                    rule__Occurrence__TriggerAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOccurrenceAccess().getTriggerAssignment_5_0()); 

                    }

                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1703:1: ( ( rule__Occurrence__TriggerAssignment_5_0 )* )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1704:1: ( rule__Occurrence__TriggerAssignment_5_0 )*
                    {
                     before(grammarAccess.getOccurrenceAccess().getTriggerAssignment_5_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1705:1: ( rule__Occurrence__TriggerAssignment_5_0 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==27||LA3_0==35) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1705:2: rule__Occurrence__TriggerAssignment_5_0
                    	    {
                    	    pushFollow(FOLLOW_rule__Occurrence__TriggerAssignment_5_0_in_rule__Occurrence__Alternatives_53545);
                    	    rule__Occurrence__TriggerAssignment_5_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getOccurrenceAccess().getTriggerAssignment_5_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1710:6: ( ';' )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1710:6: ( ';' )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1711:1: ';'
                    {
                     before(grammarAccess.getOccurrenceAccess().getSemicolonKeyword_5_1()); 
                    match(input,32,FOLLOW_32_in_rule__Occurrence__Alternatives_53567); 
                     after(grammarAccess.getOccurrenceAccess().getSemicolonKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Alternatives_5"


    // $ANTLR start "rule__DutyType__Alternatives_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1723:1: rule__DutyType__Alternatives_1 : ( ( ( rule__DutyType__NameAssignment_1_0 ) ) | ( ( rule__DutyType__NameAssignment_1_1 ) ) | ( ( rule__DutyType__Group_1_2__0 ) ) );
    public final void rule__DutyType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1727:1: ( ( ( rule__DutyType__NameAssignment_1_0 ) ) | ( ( rule__DutyType__NameAssignment_1_1 ) ) | ( ( rule__DutyType__Group_1_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1728:1: ( ( rule__DutyType__NameAssignment_1_0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1728:1: ( ( rule__DutyType__NameAssignment_1_0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1729:1: ( rule__DutyType__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getDutyTypeAccess().getNameAssignment_1_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1730:1: ( rule__DutyType__NameAssignment_1_0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1730:2: rule__DutyType__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__DutyType__NameAssignment_1_0_in_rule__DutyType__Alternatives_13601);
                    rule__DutyType__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDutyTypeAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1734:6: ( ( rule__DutyType__NameAssignment_1_1 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1734:6: ( ( rule__DutyType__NameAssignment_1_1 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1735:1: ( rule__DutyType__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getDutyTypeAccess().getNameAssignment_1_1()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1736:1: ( rule__DutyType__NameAssignment_1_1 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1736:2: rule__DutyType__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__DutyType__NameAssignment_1_1_in_rule__DutyType__Alternatives_13619);
                    rule__DutyType__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDutyTypeAccess().getNameAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1740:6: ( ( rule__DutyType__Group_1_2__0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1740:6: ( ( rule__DutyType__Group_1_2__0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1741:1: ( rule__DutyType__Group_1_2__0 )
                    {
                     before(grammarAccess.getDutyTypeAccess().getGroup_1_2()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1742:1: ( rule__DutyType__Group_1_2__0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1742:2: rule__DutyType__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__DutyType__Group_1_2__0_in_rule__DutyType__Alternatives_13637);
                    rule__DutyType__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDutyTypeAccess().getGroup_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Alternatives_1"


    // $ANTLR start "rule__StateType__Alternatives_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1751:1: rule__StateType__Alternatives_1 : ( ( ( rule__StateType__InitialAssignment_1_0 ) ) | ( ( rule__StateType__FinalAssignment_1_1 ) ) );
    public final void rule__StateType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1755:1: ( ( ( rule__StateType__InitialAssignment_1_0 ) ) | ( ( rule__StateType__FinalAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1756:1: ( ( rule__StateType__InitialAssignment_1_0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1756:1: ( ( rule__StateType__InitialAssignment_1_0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1757:1: ( rule__StateType__InitialAssignment_1_0 )
                    {
                     before(grammarAccess.getStateTypeAccess().getInitialAssignment_1_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1758:1: ( rule__StateType__InitialAssignment_1_0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1758:2: rule__StateType__InitialAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__StateType__InitialAssignment_1_0_in_rule__StateType__Alternatives_13670);
                    rule__StateType__InitialAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateTypeAccess().getInitialAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1762:6: ( ( rule__StateType__FinalAssignment_1_1 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1762:6: ( ( rule__StateType__FinalAssignment_1_1 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1763:1: ( rule__StateType__FinalAssignment_1_1 )
                    {
                     before(grammarAccess.getStateTypeAccess().getFinalAssignment_1_1()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1764:1: ( rule__StateType__FinalAssignment_1_1 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1764:2: rule__StateType__FinalAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__StateType__FinalAssignment_1_1_in_rule__StateType__Alternatives_13688);
                    rule__StateType__FinalAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateTypeAccess().getFinalAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__Alternatives_1"


    // $ANTLR start "rule__ParticipantDescription__Alternatives_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1773:1: rule__ParticipantDescription__Alternatives_0 : ( ( ( rule__ParticipantDescription__Group_0_0__0 ) ) | ( ( rule__ParticipantDescription__Group_0_1__0 ) ) );
    public final void rule__ParticipantDescription__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1777:1: ( ( ( rule__ParticipantDescription__Group_0_0__0 ) ) | ( ( rule__ParticipantDescription__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1778:1: ( ( rule__ParticipantDescription__Group_0_0__0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1778:1: ( ( rule__ParticipantDescription__Group_0_0__0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1779:1: ( rule__ParticipantDescription__Group_0_0__0 )
                    {
                     before(grammarAccess.getParticipantDescriptionAccess().getGroup_0_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1780:1: ( rule__ParticipantDescription__Group_0_0__0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1780:2: rule__ParticipantDescription__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__ParticipantDescription__Group_0_0__0_in_rule__ParticipantDescription__Alternatives_03721);
                    rule__ParticipantDescription__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParticipantDescriptionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1784:6: ( ( rule__ParticipantDescription__Group_0_1__0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1784:6: ( ( rule__ParticipantDescription__Group_0_1__0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1785:1: ( rule__ParticipantDescription__Group_0_1__0 )
                    {
                     before(grammarAccess.getParticipantDescriptionAccess().getGroup_0_1()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1786:1: ( rule__ParticipantDescription__Group_0_1__0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1786:2: rule__ParticipantDescription__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__ParticipantDescription__Group_0_1__0_in_rule__ParticipantDescription__Alternatives_03739);
                    rule__ParticipantDescription__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParticipantDescriptionAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Alternatives_0"


    // $ANTLR start "rule__ParticipantCardinality__Alternatives"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1795:1: rule__ParticipantCardinality__Alternatives : ( ( ( rule__ParticipantCardinality__Group_0__0 ) ) | ( ( rule__ParticipantCardinality__CardMinMaxAssignment_1 ) ) );
    public final void rule__ParticipantCardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1799:1: ( ( ( rule__ParticipantCardinality__Group_0__0 ) ) | ( ( rule__ParticipantCardinality__CardMinMaxAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            else if ( (LA8_0==EOF||(LA8_0>=17 && LA8_0<=18)||LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1800:1: ( ( rule__ParticipantCardinality__Group_0__0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1800:1: ( ( rule__ParticipantCardinality__Group_0__0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1801:1: ( rule__ParticipantCardinality__Group_0__0 )
                    {
                     before(grammarAccess.getParticipantCardinalityAccess().getGroup_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1802:1: ( rule__ParticipantCardinality__Group_0__0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1802:2: rule__ParticipantCardinality__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ParticipantCardinality__Group_0__0_in_rule__ParticipantCardinality__Alternatives3772);
                    rule__ParticipantCardinality__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParticipantCardinalityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1806:6: ( ( rule__ParticipantCardinality__CardMinMaxAssignment_1 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1806:6: ( ( rule__ParticipantCardinality__CardMinMaxAssignment_1 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1807:1: ( rule__ParticipantCardinality__CardMinMaxAssignment_1 )
                    {
                     before(grammarAccess.getParticipantCardinalityAccess().getCardMinMaxAssignment_1()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1808:1: ( rule__ParticipantCardinality__CardMinMaxAssignment_1 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1808:2: rule__ParticipantCardinality__CardMinMaxAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ParticipantCardinality__CardMinMaxAssignment_1_in_rule__ParticipantCardinality__Alternatives3790);
                    rule__ParticipantCardinality__CardMinMaxAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParticipantCardinalityAccess().getCardMinMaxAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinality__Alternatives"


    // $ANTLR start "rule__ParticipantCardinalityMax__Alternatives_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1817:1: rule__ParticipantCardinalityMax__Alternatives_1 : ( ( ( rule__ParticipantCardinalityMax__MaxAssignment_1_0 ) ) | ( ( rule__ParticipantCardinalityMax__Max2Assignment_1_1 ) ) );
    public final void rule__ParticipantCardinalityMax__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1821:1: ( ( ( rule__ParticipantCardinalityMax__MaxAssignment_1_0 ) ) | ( ( rule__ParticipantCardinalityMax__Max2Assignment_1_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INTEGER) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1822:1: ( ( rule__ParticipantCardinalityMax__MaxAssignment_1_0 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1822:1: ( ( rule__ParticipantCardinalityMax__MaxAssignment_1_0 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1823:1: ( rule__ParticipantCardinalityMax__MaxAssignment_1_0 )
                    {
                     before(grammarAccess.getParticipantCardinalityMaxAccess().getMaxAssignment_1_0()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1824:1: ( rule__ParticipantCardinalityMax__MaxAssignment_1_0 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1824:2: rule__ParticipantCardinalityMax__MaxAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__ParticipantCardinalityMax__MaxAssignment_1_0_in_rule__ParticipantCardinalityMax__Alternatives_13823);
                    rule__ParticipantCardinalityMax__MaxAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParticipantCardinalityMaxAccess().getMaxAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1828:6: ( ( rule__ParticipantCardinalityMax__Max2Assignment_1_1 ) )
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1828:6: ( ( rule__ParticipantCardinalityMax__Max2Assignment_1_1 ) )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1829:1: ( rule__ParticipantCardinalityMax__Max2Assignment_1_1 )
                    {
                     before(grammarAccess.getParticipantCardinalityMaxAccess().getMax2Assignment_1_1()); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1830:1: ( rule__ParticipantCardinalityMax__Max2Assignment_1_1 )
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1830:2: rule__ParticipantCardinalityMax__Max2Assignment_1_1
                    {
                    pushFollow(FOLLOW_rule__ParticipantCardinalityMax__Max2Assignment_1_1_in_rule__ParticipantCardinalityMax__Alternatives_13841);
                    rule__ParticipantCardinalityMax__Max2Assignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParticipantCardinalityMaxAccess().getMax2Assignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMax__Alternatives_1"


    // $ANTLR start "rule__Protocol__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1841:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1845:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1846:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__03872);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__03875);
            rule__Protocol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1853:1: rule__Protocol__Group__0__Impl : ( ruleTK_PROTOCOL ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1857:1: ( ( ruleTK_PROTOCOL ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1858:1: ( ruleTK_PROTOCOL )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1858:1: ( ruleTK_PROTOCOL )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1859:1: ruleTK_PROTOCOL
            {
             before(grammarAccess.getProtocolAccess().getTK_PROTOCOLParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTK_PROTOCOL_in_rule__Protocol__Group__0__Impl3902);
            ruleTK_PROTOCOL();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getTK_PROTOCOLParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1870:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1874:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1875:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__13931);
            rule__Protocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__13934);
            rule__Protocol__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1882:1: rule__Protocol__Group__1__Impl : ( ( rule__Protocol__NameAssignment_1 ) ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1886:1: ( ( ( rule__Protocol__NameAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1887:1: ( ( rule__Protocol__NameAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1887:1: ( ( rule__Protocol__NameAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1888:1: ( rule__Protocol__NameAssignment_1 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1889:1: ( rule__Protocol__NameAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1889:2: rule__Protocol__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Protocol__NameAssignment_1_in_rule__Protocol__Group__1__Impl3961);
            rule__Protocol__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1899:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl rule__Protocol__Group__3 ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1903:1: ( rule__Protocol__Group__2__Impl rule__Protocol__Group__3 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1904:2: rule__Protocol__Group__2__Impl rule__Protocol__Group__3
            {
            pushFollow(FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__23991);
            rule__Protocol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__23994);
            rule__Protocol__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2"


    // $ANTLR start "rule__Protocol__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1911:1: rule__Protocol__Group__2__Impl : ( '{' ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1915:1: ( ( '{' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1916:1: ( '{' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1916:1: ( '{' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1917:1: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__Protocol__Group__2__Impl4022); 
             after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2__Impl"


    // $ANTLR start "rule__Protocol__Group__3"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1930:1: rule__Protocol__Group__3 : rule__Protocol__Group__3__Impl rule__Protocol__Group__4 ;
    public final void rule__Protocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1934:1: ( rule__Protocol__Group__3__Impl rule__Protocol__Group__4 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1935:2: rule__Protocol__Group__3__Impl rule__Protocol__Group__4
            {
            pushFollow(FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__34053);
            rule__Protocol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__34056);
            rule__Protocol__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3"


    // $ANTLR start "rule__Protocol__Group__3__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1942:1: rule__Protocol__Group__3__Impl : ( ( rule__Protocol__DescriptionAssignment_3 ) ) ;
    public final void rule__Protocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1946:1: ( ( ( rule__Protocol__DescriptionAssignment_3 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1947:1: ( ( rule__Protocol__DescriptionAssignment_3 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1947:1: ( ( rule__Protocol__DescriptionAssignment_3 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1948:1: ( rule__Protocol__DescriptionAssignment_3 )
            {
             before(grammarAccess.getProtocolAccess().getDescriptionAssignment_3()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1949:1: ( rule__Protocol__DescriptionAssignment_3 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1949:2: rule__Protocol__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_rule__Protocol__DescriptionAssignment_3_in_rule__Protocol__Group__3__Impl4083);
            rule__Protocol__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group__4"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1959:1: rule__Protocol__Group__4 : rule__Protocol__Group__4__Impl rule__Protocol__Group__5 ;
    public final void rule__Protocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1963:1: ( rule__Protocol__Group__4__Impl rule__Protocol__Group__5 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1964:2: rule__Protocol__Group__4__Impl rule__Protocol__Group__5
            {
            pushFollow(FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__44113);
            rule__Protocol__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__44116);
            rule__Protocol__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4"


    // $ANTLR start "rule__Protocol__Group__4__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1971:1: rule__Protocol__Group__4__Impl : ( ( rule__Protocol__GoalsAssignment_4 ) ) ;
    public final void rule__Protocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1975:1: ( ( ( rule__Protocol__GoalsAssignment_4 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1976:1: ( ( rule__Protocol__GoalsAssignment_4 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1976:1: ( ( rule__Protocol__GoalsAssignment_4 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1977:1: ( rule__Protocol__GoalsAssignment_4 )
            {
             before(grammarAccess.getProtocolAccess().getGoalsAssignment_4()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1978:1: ( rule__Protocol__GoalsAssignment_4 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1978:2: rule__Protocol__GoalsAssignment_4
            {
            pushFollow(FOLLOW_rule__Protocol__GoalsAssignment_4_in_rule__Protocol__Group__4__Impl4143);
            rule__Protocol__GoalsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGoalsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__4__Impl"


    // $ANTLR start "rule__Protocol__Group__5"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1988:1: rule__Protocol__Group__5 : rule__Protocol__Group__5__Impl rule__Protocol__Group__6 ;
    public final void rule__Protocol__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1992:1: ( rule__Protocol__Group__5__Impl rule__Protocol__Group__6 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1993:2: rule__Protocol__Group__5__Impl rule__Protocol__Group__6
            {
            pushFollow(FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__54173);
            rule__Protocol__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__6_in_rule__Protocol__Group__54176);
            rule__Protocol__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5"


    // $ANTLR start "rule__Protocol__Group__5__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2000:1: rule__Protocol__Group__5__Impl : ( ( rule__Protocol__ParticipantsAssignment_5 ) ) ;
    public final void rule__Protocol__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2004:1: ( ( ( rule__Protocol__ParticipantsAssignment_5 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2005:1: ( ( rule__Protocol__ParticipantsAssignment_5 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2005:1: ( ( rule__Protocol__ParticipantsAssignment_5 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2006:1: ( rule__Protocol__ParticipantsAssignment_5 )
            {
             before(grammarAccess.getProtocolAccess().getParticipantsAssignment_5()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2007:1: ( rule__Protocol__ParticipantsAssignment_5 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2007:2: rule__Protocol__ParticipantsAssignment_5
            {
            pushFollow(FOLLOW_rule__Protocol__ParticipantsAssignment_5_in_rule__Protocol__Group__5__Impl4203);
            rule__Protocol__ParticipantsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getParticipantsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__5__Impl"


    // $ANTLR start "rule__Protocol__Group__6"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2017:1: rule__Protocol__Group__6 : rule__Protocol__Group__6__Impl rule__Protocol__Group__7 ;
    public final void rule__Protocol__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2021:1: ( rule__Protocol__Group__6__Impl rule__Protocol__Group__7 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2022:2: rule__Protocol__Group__6__Impl rule__Protocol__Group__7
            {
            pushFollow(FOLLOW_rule__Protocol__Group__6__Impl_in_rule__Protocol__Group__64233);
            rule__Protocol__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__7_in_rule__Protocol__Group__64236);
            rule__Protocol__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__6"


    // $ANTLR start "rule__Protocol__Group__6__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2029:1: rule__Protocol__Group__6__Impl : ( ( rule__Protocol__StatesAssignment_6 ) ) ;
    public final void rule__Protocol__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2033:1: ( ( ( rule__Protocol__StatesAssignment_6 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2034:1: ( ( rule__Protocol__StatesAssignment_6 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2034:1: ( ( rule__Protocol__StatesAssignment_6 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2035:1: ( rule__Protocol__StatesAssignment_6 )
            {
             before(grammarAccess.getProtocolAccess().getStatesAssignment_6()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2036:1: ( rule__Protocol__StatesAssignment_6 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2036:2: rule__Protocol__StatesAssignment_6
            {
            pushFollow(FOLLOW_rule__Protocol__StatesAssignment_6_in_rule__Protocol__Group__6__Impl4263);
            rule__Protocol__StatesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getStatesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__6__Impl"


    // $ANTLR start "rule__Protocol__Group__7"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2046:1: rule__Protocol__Group__7 : rule__Protocol__Group__7__Impl rule__Protocol__Group__8 ;
    public final void rule__Protocol__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2050:1: ( rule__Protocol__Group__7__Impl rule__Protocol__Group__8 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2051:2: rule__Protocol__Group__7__Impl rule__Protocol__Group__8
            {
            pushFollow(FOLLOW_rule__Protocol__Group__7__Impl_in_rule__Protocol__Group__74293);
            rule__Protocol__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protocol__Group__8_in_rule__Protocol__Group__74296);
            rule__Protocol__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__7"


    // $ANTLR start "rule__Protocol__Group__7__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2058:1: rule__Protocol__Group__7__Impl : ( ( rule__Protocol__TransitionsAssignment_7 ) ) ;
    public final void rule__Protocol__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2062:1: ( ( ( rule__Protocol__TransitionsAssignment_7 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2063:1: ( ( rule__Protocol__TransitionsAssignment_7 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2063:1: ( ( rule__Protocol__TransitionsAssignment_7 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2064:1: ( rule__Protocol__TransitionsAssignment_7 )
            {
             before(grammarAccess.getProtocolAccess().getTransitionsAssignment_7()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2065:1: ( rule__Protocol__TransitionsAssignment_7 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2065:2: rule__Protocol__TransitionsAssignment_7
            {
            pushFollow(FOLLOW_rule__Protocol__TransitionsAssignment_7_in_rule__Protocol__Group__7__Impl4323);
            rule__Protocol__TransitionsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getTransitionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__7__Impl"


    // $ANTLR start "rule__Protocol__Group__8"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2075:1: rule__Protocol__Group__8 : rule__Protocol__Group__8__Impl ;
    public final void rule__Protocol__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2079:1: ( rule__Protocol__Group__8__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2080:2: rule__Protocol__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Protocol__Group__8__Impl_in_rule__Protocol__Group__84353);
            rule__Protocol__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__8"


    // $ANTLR start "rule__Protocol__Group__8__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2086:1: rule__Protocol__Group__8__Impl : ( '}' ) ;
    public final void rule__Protocol__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2090:1: ( ( '}' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2091:1: ( '}' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2091:1: ( '}' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2092:1: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8()); 
            match(input,34,FOLLOW_34_in_rule__Protocol__Group__8__Impl4381); 
             after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__8__Impl"


    // $ANTLR start "rule__Transitions__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2123:1: rule__Transitions__Group__0 : rule__Transitions__Group__0__Impl rule__Transitions__Group__1 ;
    public final void rule__Transitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2127:1: ( rule__Transitions__Group__0__Impl rule__Transitions__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2128:2: rule__Transitions__Group__0__Impl rule__Transitions__Group__1
            {
            pushFollow(FOLLOW_rule__Transitions__Group__0__Impl_in_rule__Transitions__Group__04430);
            rule__Transitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transitions__Group__1_in_rule__Transitions__Group__04433);
            rule__Transitions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transitions__Group__0"


    // $ANTLR start "rule__Transitions__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2135:1: rule__Transitions__Group__0__Impl : ( ( rule__Transitions__NameAssignment_0 ) ) ;
    public final void rule__Transitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2139:1: ( ( ( rule__Transitions__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2140:1: ( ( rule__Transitions__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2140:1: ( ( rule__Transitions__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2141:1: ( rule__Transitions__NameAssignment_0 )
            {
             before(grammarAccess.getTransitionsAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2142:1: ( rule__Transitions__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2142:2: rule__Transitions__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Transitions__NameAssignment_0_in_rule__Transitions__Group__0__Impl4460);
            rule__Transitions__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transitions__Group__0__Impl"


    // $ANTLR start "rule__Transitions__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2152:1: rule__Transitions__Group__1 : rule__Transitions__Group__1__Impl rule__Transitions__Group__2 ;
    public final void rule__Transitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2156:1: ( rule__Transitions__Group__1__Impl rule__Transitions__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2157:2: rule__Transitions__Group__1__Impl rule__Transitions__Group__2
            {
            pushFollow(FOLLOW_rule__Transitions__Group__1__Impl_in_rule__Transitions__Group__14490);
            rule__Transitions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transitions__Group__2_in_rule__Transitions__Group__14493);
            rule__Transitions__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transitions__Group__1"


    // $ANTLR start "rule__Transitions__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2164:1: rule__Transitions__Group__1__Impl : ( ':' ) ;
    public final void rule__Transitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2168:1: ( ( ':' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2169:1: ( ':' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2169:1: ( ':' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2170:1: ':'
            {
             before(grammarAccess.getTransitionsAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Transitions__Group__1__Impl4521); 
             after(grammarAccess.getTransitionsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transitions__Group__1__Impl"


    // $ANTLR start "rule__Transitions__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2183:1: rule__Transitions__Group__2 : rule__Transitions__Group__2__Impl ;
    public final void rule__Transitions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2187:1: ( rule__Transitions__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2188:2: rule__Transitions__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transitions__Group__2__Impl_in_rule__Transitions__Group__24552);
            rule__Transitions__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transitions__Group__2"


    // $ANTLR start "rule__Transitions__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2194:1: rule__Transitions__Group__2__Impl : ( ( ( rule__Transitions__TransitionsAssignment_2 ) ) ( ( rule__Transitions__TransitionsAssignment_2 )* ) ) ;
    public final void rule__Transitions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2198:1: ( ( ( ( rule__Transitions__TransitionsAssignment_2 ) ) ( ( rule__Transitions__TransitionsAssignment_2 )* ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2199:1: ( ( ( rule__Transitions__TransitionsAssignment_2 ) ) ( ( rule__Transitions__TransitionsAssignment_2 )* ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2199:1: ( ( ( rule__Transitions__TransitionsAssignment_2 ) ) ( ( rule__Transitions__TransitionsAssignment_2 )* ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2200:1: ( ( rule__Transitions__TransitionsAssignment_2 ) ) ( ( rule__Transitions__TransitionsAssignment_2 )* )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2200:1: ( ( rule__Transitions__TransitionsAssignment_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2201:1: ( rule__Transitions__TransitionsAssignment_2 )
            {
             before(grammarAccess.getTransitionsAccess().getTransitionsAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2202:1: ( rule__Transitions__TransitionsAssignment_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2202:2: rule__Transitions__TransitionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Transitions__TransitionsAssignment_2_in_rule__Transitions__Group__2__Impl4581);
            rule__Transitions__TransitionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionsAccess().getTransitionsAssignment_2()); 

            }

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2205:1: ( ( rule__Transitions__TransitionsAssignment_2 )* )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2206:1: ( rule__Transitions__TransitionsAssignment_2 )*
            {
             before(grammarAccess.getTransitionsAccess().getTransitionsAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2207:1: ( rule__Transitions__TransitionsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID_WITH_STARTING_LCLETTER) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2207:2: rule__Transitions__TransitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Transitions__TransitionsAssignment_2_in_rule__Transitions__Group__2__Impl4593);
            	    rule__Transitions__TransitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTransitionsAccess().getTransitionsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transitions__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2224:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2228:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2229:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__04632);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__04635);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2236:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__SourceStateAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2240:1: ( ( ( rule__Transition__SourceStateAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2241:1: ( ( rule__Transition__SourceStateAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2241:1: ( ( rule__Transition__SourceStateAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2242:1: ( rule__Transition__SourceStateAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2243:1: ( rule__Transition__SourceStateAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2243:2: rule__Transition__SourceStateAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__SourceStateAssignment_0_in_rule__Transition__Group__0__Impl4662);
            rule__Transition__SourceStateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceStateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2253:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2257:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2258:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__14692);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__14695);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2265:1: rule__Transition__Group__1__Impl : ( '-' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2269:1: ( ( '-' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2270:1: ( '-' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2270:1: ( '-' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2271:1: '-'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__Transition__Group__1__Impl4723); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2284:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2288:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2289:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__24754);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__24757);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2296:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__DestinationStateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2300:1: ( ( ( rule__Transition__DestinationStateAssignment_2 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2301:1: ( ( rule__Transition__DestinationStateAssignment_2 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2301:1: ( ( rule__Transition__DestinationStateAssignment_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2302:1: ( rule__Transition__DestinationStateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getDestinationStateAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2303:1: ( rule__Transition__DestinationStateAssignment_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2303:2: rule__Transition__DestinationStateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__DestinationStateAssignment_2_in_rule__Transition__Group__2__Impl4784);
            rule__Transition__DestinationStateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getDestinationStateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2313:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2317:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2318:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__34814);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__34817);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2325:1: rule__Transition__Group__3__Impl : ( '#' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2329:1: ( ( '#' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2330:1: ( '#' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2330:1: ( '#' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2331:1: '#'
            {
             before(grammarAccess.getTransitionAccess().getNumberSignKeyword_3()); 
            match(input,37,FOLLOW_37_in_rule__Transition__Group__3__Impl4845); 
             after(grammarAccess.getTransitionAccess().getNumberSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2344:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2348:1: ( rule__Transition__Group__4__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2349:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__44876);
            rule__Transition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2355:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__TypeAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2359:1: ( ( ( rule__Transition__TypeAssignment_4 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2360:1: ( ( rule__Transition__TypeAssignment_4 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2360:1: ( ( rule__Transition__TypeAssignment_4 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2361:1: ( rule__Transition__TypeAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getTypeAssignment_4()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2362:1: ( rule__Transition__TypeAssignment_4 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2362:2: rule__Transition__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__Transition__TypeAssignment_4_in_rule__Transition__Group__4__Impl4903);
            rule__Transition__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Timeout__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2382:1: rule__Timeout__Group__0 : rule__Timeout__Group__0__Impl rule__Timeout__Group__1 ;
    public final void rule__Timeout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2386:1: ( rule__Timeout__Group__0__Impl rule__Timeout__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2387:2: rule__Timeout__Group__0__Impl rule__Timeout__Group__1
            {
            pushFollow(FOLLOW_rule__Timeout__Group__0__Impl_in_rule__Timeout__Group__04943);
            rule__Timeout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timeout__Group__1_in_rule__Timeout__Group__04946);
            rule__Timeout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timeout__Group__0"


    // $ANTLR start "rule__Timeout__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2394:1: rule__Timeout__Group__0__Impl : ( ( rule__Timeout__NameAssignment_0 ) ) ;
    public final void rule__Timeout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2398:1: ( ( ( rule__Timeout__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2399:1: ( ( rule__Timeout__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2399:1: ( ( rule__Timeout__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2400:1: ( rule__Timeout__NameAssignment_0 )
            {
             before(grammarAccess.getTimeoutAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2401:1: ( rule__Timeout__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2401:2: rule__Timeout__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Timeout__NameAssignment_0_in_rule__Timeout__Group__0__Impl4973);
            rule__Timeout__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeoutAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timeout__Group__0__Impl"


    // $ANTLR start "rule__Timeout__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2411:1: rule__Timeout__Group__1 : rule__Timeout__Group__1__Impl rule__Timeout__Group__2 ;
    public final void rule__Timeout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2415:1: ( rule__Timeout__Group__1__Impl rule__Timeout__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2416:2: rule__Timeout__Group__1__Impl rule__Timeout__Group__2
            {
            pushFollow(FOLLOW_rule__Timeout__Group__1__Impl_in_rule__Timeout__Group__15003);
            rule__Timeout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Timeout__Group__2_in_rule__Timeout__Group__15006);
            rule__Timeout__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timeout__Group__1"


    // $ANTLR start "rule__Timeout__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2423:1: rule__Timeout__Group__1__Impl : ( ( rule__Timeout__TimeoutAssignment_1 ) ) ;
    public final void rule__Timeout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2427:1: ( ( ( rule__Timeout__TimeoutAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2428:1: ( ( rule__Timeout__TimeoutAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2428:1: ( ( rule__Timeout__TimeoutAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2429:1: ( rule__Timeout__TimeoutAssignment_1 )
            {
             before(grammarAccess.getTimeoutAccess().getTimeoutAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2430:1: ( rule__Timeout__TimeoutAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2430:2: rule__Timeout__TimeoutAssignment_1
            {
            pushFollow(FOLLOW_rule__Timeout__TimeoutAssignment_1_in_rule__Timeout__Group__1__Impl5033);
            rule__Timeout__TimeoutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeoutAccess().getTimeoutAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timeout__Group__1__Impl"


    // $ANTLR start "rule__Timeout__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2440:1: rule__Timeout__Group__2 : rule__Timeout__Group__2__Impl ;
    public final void rule__Timeout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2444:1: ( rule__Timeout__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2445:2: rule__Timeout__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Timeout__Group__2__Impl_in_rule__Timeout__Group__25063);
            rule__Timeout__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timeout__Group__2"


    // $ANTLR start "rule__Timeout__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2451:1: rule__Timeout__Group__2__Impl : ( ';' ) ;
    public final void rule__Timeout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2455:1: ( ( ';' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2456:1: ( ';' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2456:1: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2457:1: ';'
            {
             before(grammarAccess.getTimeoutAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Timeout__Group__2__Impl5091); 
             after(grammarAccess.getTimeoutAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timeout__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2476:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2480:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2481:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05128);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05131);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2488:1: rule__Import__Group__0__Impl : ( ( rule__Import__NameAssignment_0 ) ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2492:1: ( ( ( rule__Import__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2493:1: ( ( rule__Import__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2493:1: ( ( rule__Import__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2494:1: ( rule__Import__NameAssignment_0 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2495:1: ( rule__Import__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2495:2: rule__Import__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Import__NameAssignment_0_in_rule__Import__Group__0__Impl5158);
            rule__Import__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2505:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2509:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2510:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15188);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__15191);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2517:1: rule__Import__Group__1__Impl : ( ( rule__Import__FileAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2521:1: ( ( ( rule__Import__FileAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2522:1: ( ( rule__Import__FileAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2522:1: ( ( rule__Import__FileAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2523:1: ( rule__Import__FileAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getFileAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2524:1: ( rule__Import__FileAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2524:2: rule__Import__FileAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__FileAssignment_1_in_rule__Import__Group__1__Impl5218);
            rule__Import__FileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getFileAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2534:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2538:1: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2539:2: rule__Import__Group__2__Impl rule__Import__Group__3
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__25248);
            rule__Import__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__3_in_rule__Import__Group__25251);
            rule__Import__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2546:1: rule__Import__Group__2__Impl : ( ( rule__Import__MappingAssignment_2 )? ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2550:1: ( ( ( rule__Import__MappingAssignment_2 )? ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2551:1: ( ( rule__Import__MappingAssignment_2 )? )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2551:1: ( ( rule__Import__MappingAssignment_2 )? )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2552:1: ( rule__Import__MappingAssignment_2 )?
            {
             before(grammarAccess.getImportAccess().getMappingAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2553:1: ( rule__Import__MappingAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2553:2: rule__Import__MappingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Import__MappingAssignment_2_in_rule__Import__Group__2__Impl5278);
                    rule__Import__MappingAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImportAccess().getMappingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__3"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2563:1: rule__Import__Group__3 : rule__Import__Group__3__Impl ;
    public final void rule__Import__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2567:1: ( rule__Import__Group__3__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2568:2: rule__Import__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__35309);
            rule__Import__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3"


    // $ANTLR start "rule__Import__Group__3__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2574:1: rule__Import__Group__3__Impl : ( ';' ) ;
    public final void rule__Import__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2578:1: ( ( ';' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2579:1: ( ';' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2579:1: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2580:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Import__Group__3__Impl5337); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2601:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2605:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2606:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__05376);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__05379);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2613:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__NameAssignment_0 ) ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2617:1: ( ( ( rule__Mapping__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2618:1: ( ( rule__Mapping__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2618:1: ( ( rule__Mapping__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2619:1: ( rule__Mapping__NameAssignment_0 )
            {
             before(grammarAccess.getMappingAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2620:1: ( rule__Mapping__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2620:2: rule__Mapping__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Mapping__NameAssignment_0_in_rule__Mapping__Group__0__Impl5406);
            rule__Mapping__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2630:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2634:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2635:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__15436);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__15439);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2642:1: rule__Mapping__Group__1__Impl : ( '{' ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2646:1: ( ( '{' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2647:1: ( '{' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2647:1: ( '{' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2648:1: '{'
            {
             before(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Mapping__Group__1__Impl5467); 
             after(grammarAccess.getMappingAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2661:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2665:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2666:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__25498);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__25501);
            rule__Mapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2673:1: rule__Mapping__Group__2__Impl : ( ( ( rule__Mapping__MapsAssignment_2 ) ) ( ( rule__Mapping__MapsAssignment_2 )* ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2677:1: ( ( ( ( rule__Mapping__MapsAssignment_2 ) ) ( ( rule__Mapping__MapsAssignment_2 )* ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2678:1: ( ( ( rule__Mapping__MapsAssignment_2 ) ) ( ( rule__Mapping__MapsAssignment_2 )* ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2678:1: ( ( ( rule__Mapping__MapsAssignment_2 ) ) ( ( rule__Mapping__MapsAssignment_2 )* ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2679:1: ( ( rule__Mapping__MapsAssignment_2 ) ) ( ( rule__Mapping__MapsAssignment_2 )* )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2679:1: ( ( rule__Mapping__MapsAssignment_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2680:1: ( rule__Mapping__MapsAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getMapsAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2681:1: ( rule__Mapping__MapsAssignment_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2681:2: rule__Mapping__MapsAssignment_2
            {
            pushFollow(FOLLOW_rule__Mapping__MapsAssignment_2_in_rule__Mapping__Group__2__Impl5530);
            rule__Mapping__MapsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getMapsAssignment_2()); 

            }

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2684:1: ( ( rule__Mapping__MapsAssignment_2 )* )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2685:1: ( rule__Mapping__MapsAssignment_2 )*
            {
             before(grammarAccess.getMappingAccess().getMapsAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2686:1: ( rule__Mapping__MapsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID_WITH_STARTING_LCLETTER) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2686:2: rule__Mapping__MapsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Mapping__MapsAssignment_2_in_rule__Mapping__Group__2__Impl5542);
            	    rule__Mapping__MapsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMappingAccess().getMapsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2697:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2701:1: ( rule__Mapping__Group__3__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2702:2: rule__Mapping__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__35575);
            rule__Mapping__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2708:1: rule__Mapping__Group__3__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2712:1: ( ( '}' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2713:1: ( '}' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2713:1: ( '}' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2714:1: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__Mapping__Group__3__Impl5603); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__MapFromTo__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2735:1: rule__MapFromTo__Group__0 : rule__MapFromTo__Group__0__Impl rule__MapFromTo__Group__1 ;
    public final void rule__MapFromTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2739:1: ( rule__MapFromTo__Group__0__Impl rule__MapFromTo__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2740:2: rule__MapFromTo__Group__0__Impl rule__MapFromTo__Group__1
            {
            pushFollow(FOLLOW_rule__MapFromTo__Group__0__Impl_in_rule__MapFromTo__Group__05642);
            rule__MapFromTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapFromTo__Group__1_in_rule__MapFromTo__Group__05645);
            rule__MapFromTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFromTo__Group__0"


    // $ANTLR start "rule__MapFromTo__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2747:1: rule__MapFromTo__Group__0__Impl : ( ( rule__MapFromTo__FromAssignment_0 ) ) ;
    public final void rule__MapFromTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2751:1: ( ( ( rule__MapFromTo__FromAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2752:1: ( ( rule__MapFromTo__FromAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2752:1: ( ( rule__MapFromTo__FromAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2753:1: ( rule__MapFromTo__FromAssignment_0 )
            {
             before(grammarAccess.getMapFromToAccess().getFromAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2754:1: ( rule__MapFromTo__FromAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2754:2: rule__MapFromTo__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__MapFromTo__FromAssignment_0_in_rule__MapFromTo__Group__0__Impl5672);
            rule__MapFromTo__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMapFromToAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFromTo__Group__0__Impl"


    // $ANTLR start "rule__MapFromTo__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2764:1: rule__MapFromTo__Group__1 : rule__MapFromTo__Group__1__Impl rule__MapFromTo__Group__2 ;
    public final void rule__MapFromTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2768:1: ( rule__MapFromTo__Group__1__Impl rule__MapFromTo__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2769:2: rule__MapFromTo__Group__1__Impl rule__MapFromTo__Group__2
            {
            pushFollow(FOLLOW_rule__MapFromTo__Group__1__Impl_in_rule__MapFromTo__Group__15702);
            rule__MapFromTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapFromTo__Group__2_in_rule__MapFromTo__Group__15705);
            rule__MapFromTo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFromTo__Group__1"


    // $ANTLR start "rule__MapFromTo__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2776:1: rule__MapFromTo__Group__1__Impl : ( ( rule__MapFromTo__ToAssignment_1 ) ) ;
    public final void rule__MapFromTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2780:1: ( ( ( rule__MapFromTo__ToAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2781:1: ( ( rule__MapFromTo__ToAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2781:1: ( ( rule__MapFromTo__ToAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2782:1: ( rule__MapFromTo__ToAssignment_1 )
            {
             before(grammarAccess.getMapFromToAccess().getToAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2783:1: ( rule__MapFromTo__ToAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2783:2: rule__MapFromTo__ToAssignment_1
            {
            pushFollow(FOLLOW_rule__MapFromTo__ToAssignment_1_in_rule__MapFromTo__Group__1__Impl5732);
            rule__MapFromTo__ToAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapFromToAccess().getToAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFromTo__Group__1__Impl"


    // $ANTLR start "rule__MapFromTo__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2793:1: rule__MapFromTo__Group__2 : rule__MapFromTo__Group__2__Impl ;
    public final void rule__MapFromTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2797:1: ( rule__MapFromTo__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2798:2: rule__MapFromTo__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MapFromTo__Group__2__Impl_in_rule__MapFromTo__Group__25762);
            rule__MapFromTo__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFromTo__Group__2"


    // $ANTLR start "rule__MapFromTo__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2804:1: rule__MapFromTo__Group__2__Impl : ( ';' ) ;
    public final void rule__MapFromTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2808:1: ( ( ';' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2809:1: ( ';' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2809:1: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2810:1: ';'
            {
             before(grammarAccess.getMapFromToAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__MapFromTo__Group__2__Impl5790); 
             after(grammarAccess.getMapFromToAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFromTo__Group__2__Impl"


    // $ANTLR start "rule__Trigger__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2829:1: rule__Trigger__Group__0 : rule__Trigger__Group__0__Impl rule__Trigger__Group__1 ;
    public final void rule__Trigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2833:1: ( rule__Trigger__Group__0__Impl rule__Trigger__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2834:2: rule__Trigger__Group__0__Impl rule__Trigger__Group__1
            {
            pushFollow(FOLLOW_rule__Trigger__Group__0__Impl_in_rule__Trigger__Group__05827);
            rule__Trigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group__1_in_rule__Trigger__Group__05830);
            rule__Trigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__0"


    // $ANTLR start "rule__Trigger__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2841:1: rule__Trigger__Group__0__Impl : ( () ) ;
    public final void rule__Trigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2845:1: ( ( () ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2846:1: ( () )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2846:1: ( () )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2847:1: ()
            {
             before(grammarAccess.getTriggerAccess().getTriggerAction_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2848:1: ()
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2850:1: 
            {
            }

             after(grammarAccess.getTriggerAccess().getTriggerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__0__Impl"


    // $ANTLR start "rule__Trigger__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2860:1: rule__Trigger__Group__1 : rule__Trigger__Group__1__Impl rule__Trigger__Group__2 ;
    public final void rule__Trigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2864:1: ( rule__Trigger__Group__1__Impl rule__Trigger__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2865:2: rule__Trigger__Group__1__Impl rule__Trigger__Group__2
            {
            pushFollow(FOLLOW_rule__Trigger__Group__1__Impl_in_rule__Trigger__Group__15888);
            rule__Trigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group__2_in_rule__Trigger__Group__15891);
            rule__Trigger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__1"


    // $ANTLR start "rule__Trigger__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2872:1: rule__Trigger__Group__1__Impl : ( ( rule__Trigger__Alternatives_1 ) ) ;
    public final void rule__Trigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2876:1: ( ( ( rule__Trigger__Alternatives_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2877:1: ( ( rule__Trigger__Alternatives_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2877:1: ( ( rule__Trigger__Alternatives_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2878:1: ( rule__Trigger__Alternatives_1 )
            {
             before(grammarAccess.getTriggerAccess().getAlternatives_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2879:1: ( rule__Trigger__Alternatives_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2879:2: rule__Trigger__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Trigger__Alternatives_1_in_rule__Trigger__Group__1__Impl5918);
            rule__Trigger__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__1__Impl"


    // $ANTLR start "rule__Trigger__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2889:1: rule__Trigger__Group__2 : rule__Trigger__Group__2__Impl ;
    public final void rule__Trigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2893:1: ( rule__Trigger__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2894:2: rule__Trigger__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Trigger__Group__2__Impl_in_rule__Trigger__Group__25948);
            rule__Trigger__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__2"


    // $ANTLR start "rule__Trigger__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2900:1: rule__Trigger__Group__2__Impl : ( ';' ) ;
    public final void rule__Trigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2904:1: ( ( ';' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2905:1: ( ';' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2905:1: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2906:1: ';'
            {
             before(grammarAccess.getTriggerAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Trigger__Group__2__Impl5976); 
             after(grammarAccess.getTriggerAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group__2__Impl"


    // $ANTLR start "rule__Trigger__Group_1_0__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2925:1: rule__Trigger__Group_1_0__0 : rule__Trigger__Group_1_0__0__Impl rule__Trigger__Group_1_0__1 ;
    public final void rule__Trigger__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2929:1: ( rule__Trigger__Group_1_0__0__Impl rule__Trigger__Group_1_0__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2930:2: rule__Trigger__Group_1_0__0__Impl rule__Trigger__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Trigger__Group_1_0__0__Impl_in_rule__Trigger__Group_1_0__06013);
            rule__Trigger__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trigger__Group_1_0__1_in_rule__Trigger__Group_1_0__06016);
            rule__Trigger__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1_0__0"


    // $ANTLR start "rule__Trigger__Group_1_0__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2937:1: rule__Trigger__Group_1_0__0__Impl : ( ( rule__Trigger__PatternAssignment_1_0_0 ) ) ;
    public final void rule__Trigger__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2941:1: ( ( ( rule__Trigger__PatternAssignment_1_0_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2942:1: ( ( rule__Trigger__PatternAssignment_1_0_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2942:1: ( ( rule__Trigger__PatternAssignment_1_0_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2943:1: ( rule__Trigger__PatternAssignment_1_0_0 )
            {
             before(grammarAccess.getTriggerAccess().getPatternAssignment_1_0_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2944:1: ( rule__Trigger__PatternAssignment_1_0_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2944:2: rule__Trigger__PatternAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__Trigger__PatternAssignment_1_0_0_in_rule__Trigger__Group_1_0__0__Impl6043);
            rule__Trigger__PatternAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getPatternAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1_0__0__Impl"


    // $ANTLR start "rule__Trigger__Group_1_0__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2954:1: rule__Trigger__Group_1_0__1 : rule__Trigger__Group_1_0__1__Impl ;
    public final void rule__Trigger__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2958:1: ( rule__Trigger__Group_1_0__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2959:2: rule__Trigger__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Trigger__Group_1_0__1__Impl_in_rule__Trigger__Group_1_0__16073);
            rule__Trigger__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1_0__1"


    // $ANTLR start "rule__Trigger__Group_1_0__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2965:1: rule__Trigger__Group_1_0__1__Impl : ( ( rule__Trigger__ContentAssignment_1_0_1 )? ) ;
    public final void rule__Trigger__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2969:1: ( ( ( rule__Trigger__ContentAssignment_1_0_1 )? ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2970:1: ( ( rule__Trigger__ContentAssignment_1_0_1 )? )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2970:1: ( ( rule__Trigger__ContentAssignment_1_0_1 )? )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2971:1: ( rule__Trigger__ContentAssignment_1_0_1 )?
            {
             before(grammarAccess.getTriggerAccess().getContentAssignment_1_0_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2972:1: ( rule__Trigger__ContentAssignment_1_0_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2972:2: rule__Trigger__ContentAssignment_1_0_1
                    {
                    pushFollow(FOLLOW_rule__Trigger__ContentAssignment_1_0_1_in_rule__Trigger__Group_1_0__1__Impl6100);
                    rule__Trigger__ContentAssignment_1_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerAccess().getContentAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Group_1_0__1__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2986:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2990:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2991:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__06135);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__06138);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:2998:1: rule__Pattern__Group__0__Impl : ( ( rule__Pattern__NameAssignment_0 ) ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3002:1: ( ( ( rule__Pattern__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3003:1: ( ( rule__Pattern__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3003:1: ( ( rule__Pattern__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3004:1: ( rule__Pattern__NameAssignment_0 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3005:1: ( rule__Pattern__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3005:2: rule__Pattern__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Pattern__NameAssignment_0_in_rule__Pattern__Group__0__Impl6165);
            rule__Pattern__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3015:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3019:1: ( rule__Pattern__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3020:2: rule__Pattern__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__16195);
            rule__Pattern__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3026:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__PatternAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3030:1: ( ( ( rule__Pattern__PatternAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3031:1: ( ( rule__Pattern__PatternAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3031:1: ( ( rule__Pattern__PatternAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3032:1: ( rule__Pattern__PatternAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getPatternAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3033:1: ( rule__Pattern__PatternAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3033:2: rule__Pattern__PatternAssignment_1
            {
            pushFollow(FOLLOW_rule__Pattern__PatternAssignment_1_in_rule__Pattern__Group__1__Impl6222);
            rule__Pattern__PatternAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getPatternAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Content__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3047:1: rule__Content__Group__0 : rule__Content__Group__0__Impl rule__Content__Group__1 ;
    public final void rule__Content__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3051:1: ( rule__Content__Group__0__Impl rule__Content__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3052:2: rule__Content__Group__0__Impl rule__Content__Group__1
            {
            pushFollow(FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__06256);
            rule__Content__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Content__Group__1_in_rule__Content__Group__06259);
            rule__Content__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0"


    // $ANTLR start "rule__Content__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3059:1: rule__Content__Group__0__Impl : ( ':' ) ;
    public final void rule__Content__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3063:1: ( ( ':' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3064:1: ( ':' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3064:1: ( ':' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3065:1: ':'
            {
             before(grammarAccess.getContentAccess().getColonKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Content__Group__0__Impl6287); 
             after(grammarAccess.getContentAccess().getColonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__0__Impl"


    // $ANTLR start "rule__Content__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3078:1: rule__Content__Group__1 : rule__Content__Group__1__Impl ;
    public final void rule__Content__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3082:1: ( rule__Content__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3083:2: rule__Content__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__16318);
            rule__Content__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1"


    // $ANTLR start "rule__Content__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3089:1: rule__Content__Group__1__Impl : ( ( rule__Content__ContentAssignment_1 ) ) ;
    public final void rule__Content__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3093:1: ( ( ( rule__Content__ContentAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3094:1: ( ( rule__Content__ContentAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3094:1: ( ( rule__Content__ContentAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3095:1: ( rule__Content__ContentAssignment_1 )
            {
             before(grammarAccess.getContentAccess().getContentAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3096:1: ( rule__Content__ContentAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3096:2: rule__Content__ContentAssignment_1
            {
            pushFollow(FOLLOW_rule__Content__ContentAssignment_1_in_rule__Content__Group__1__Impl6345);
            rule__Content__ContentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getContentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__Group__1__Impl"


    // $ANTLR start "rule__Occurrence__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3110:1: rule__Occurrence__Group__0 : rule__Occurrence__Group__0__Impl rule__Occurrence__Group__1 ;
    public final void rule__Occurrence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3114:1: ( rule__Occurrence__Group__0__Impl rule__Occurrence__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3115:2: rule__Occurrence__Group__0__Impl rule__Occurrence__Group__1
            {
            pushFollow(FOLLOW_rule__Occurrence__Group__0__Impl_in_rule__Occurrence__Group__06379);
            rule__Occurrence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Occurrence__Group__1_in_rule__Occurrence__Group__06382);
            rule__Occurrence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__0"


    // $ANTLR start "rule__Occurrence__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3122:1: rule__Occurrence__Group__0__Impl : ( ( rule__Occurrence__ParticipantSourceAssignment_0 ) ) ;
    public final void rule__Occurrence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3126:1: ( ( ( rule__Occurrence__ParticipantSourceAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3127:1: ( ( rule__Occurrence__ParticipantSourceAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3127:1: ( ( rule__Occurrence__ParticipantSourceAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3128:1: ( rule__Occurrence__ParticipantSourceAssignment_0 )
            {
             before(grammarAccess.getOccurrenceAccess().getParticipantSourceAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3129:1: ( rule__Occurrence__ParticipantSourceAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3129:2: rule__Occurrence__ParticipantSourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Occurrence__ParticipantSourceAssignment_0_in_rule__Occurrence__Group__0__Impl6409);
            rule__Occurrence__ParticipantSourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOccurrenceAccess().getParticipantSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__0__Impl"


    // $ANTLR start "rule__Occurrence__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3139:1: rule__Occurrence__Group__1 : rule__Occurrence__Group__1__Impl rule__Occurrence__Group__2 ;
    public final void rule__Occurrence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3143:1: ( rule__Occurrence__Group__1__Impl rule__Occurrence__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3144:2: rule__Occurrence__Group__1__Impl rule__Occurrence__Group__2
            {
            pushFollow(FOLLOW_rule__Occurrence__Group__1__Impl_in_rule__Occurrence__Group__16439);
            rule__Occurrence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Occurrence__Group__2_in_rule__Occurrence__Group__16442);
            rule__Occurrence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__1"


    // $ANTLR start "rule__Occurrence__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3151:1: rule__Occurrence__Group__1__Impl : ( '--' ) ;
    public final void rule__Occurrence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3155:1: ( ( '--' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3156:1: ( '--' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3156:1: ( '--' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3157:1: '--'
            {
             before(grammarAccess.getOccurrenceAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__Occurrence__Group__1__Impl6470); 
             after(grammarAccess.getOccurrenceAccess().getHyphenMinusHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__1__Impl"


    // $ANTLR start "rule__Occurrence__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3170:1: rule__Occurrence__Group__2 : rule__Occurrence__Group__2__Impl rule__Occurrence__Group__3 ;
    public final void rule__Occurrence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3174:1: ( rule__Occurrence__Group__2__Impl rule__Occurrence__Group__3 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3175:2: rule__Occurrence__Group__2__Impl rule__Occurrence__Group__3
            {
            pushFollow(FOLLOW_rule__Occurrence__Group__2__Impl_in_rule__Occurrence__Group__26501);
            rule__Occurrence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Occurrence__Group__3_in_rule__Occurrence__Group__26504);
            rule__Occurrence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__2"


    // $ANTLR start "rule__Occurrence__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3182:1: rule__Occurrence__Group__2__Impl : ( ( rule__Occurrence__DutyAssignment_2 ) ) ;
    public final void rule__Occurrence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3186:1: ( ( ( rule__Occurrence__DutyAssignment_2 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3187:1: ( ( rule__Occurrence__DutyAssignment_2 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3187:1: ( ( rule__Occurrence__DutyAssignment_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3188:1: ( rule__Occurrence__DutyAssignment_2 )
            {
             before(grammarAccess.getOccurrenceAccess().getDutyAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3189:1: ( rule__Occurrence__DutyAssignment_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3189:2: rule__Occurrence__DutyAssignment_2
            {
            pushFollow(FOLLOW_rule__Occurrence__DutyAssignment_2_in_rule__Occurrence__Group__2__Impl6531);
            rule__Occurrence__DutyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOccurrenceAccess().getDutyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__2__Impl"


    // $ANTLR start "rule__Occurrence__Group__3"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3199:1: rule__Occurrence__Group__3 : rule__Occurrence__Group__3__Impl rule__Occurrence__Group__4 ;
    public final void rule__Occurrence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3203:1: ( rule__Occurrence__Group__3__Impl rule__Occurrence__Group__4 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3204:2: rule__Occurrence__Group__3__Impl rule__Occurrence__Group__4
            {
            pushFollow(FOLLOW_rule__Occurrence__Group__3__Impl_in_rule__Occurrence__Group__36561);
            rule__Occurrence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Occurrence__Group__4_in_rule__Occurrence__Group__36564);
            rule__Occurrence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__3"


    // $ANTLR start "rule__Occurrence__Group__3__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3211:1: rule__Occurrence__Group__3__Impl : ( '->' ) ;
    public final void rule__Occurrence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3215:1: ( ( '->' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3216:1: ( '->' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3216:1: ( '->' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3217:1: '->'
            {
             before(grammarAccess.getOccurrenceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__Occurrence__Group__3__Impl6592); 
             after(grammarAccess.getOccurrenceAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__3__Impl"


    // $ANTLR start "rule__Occurrence__Group__4"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3230:1: rule__Occurrence__Group__4 : rule__Occurrence__Group__4__Impl rule__Occurrence__Group__5 ;
    public final void rule__Occurrence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3234:1: ( rule__Occurrence__Group__4__Impl rule__Occurrence__Group__5 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3235:2: rule__Occurrence__Group__4__Impl rule__Occurrence__Group__5
            {
            pushFollow(FOLLOW_rule__Occurrence__Group__4__Impl_in_rule__Occurrence__Group__46623);
            rule__Occurrence__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Occurrence__Group__5_in_rule__Occurrence__Group__46626);
            rule__Occurrence__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__4"


    // $ANTLR start "rule__Occurrence__Group__4__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3242:1: rule__Occurrence__Group__4__Impl : ( ( rule__Occurrence__ParticipantDestinationAssignment_4 ) ) ;
    public final void rule__Occurrence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3246:1: ( ( ( rule__Occurrence__ParticipantDestinationAssignment_4 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3247:1: ( ( rule__Occurrence__ParticipantDestinationAssignment_4 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3247:1: ( ( rule__Occurrence__ParticipantDestinationAssignment_4 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3248:1: ( rule__Occurrence__ParticipantDestinationAssignment_4 )
            {
             before(grammarAccess.getOccurrenceAccess().getParticipantDestinationAssignment_4()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3249:1: ( rule__Occurrence__ParticipantDestinationAssignment_4 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3249:2: rule__Occurrence__ParticipantDestinationAssignment_4
            {
            pushFollow(FOLLOW_rule__Occurrence__ParticipantDestinationAssignment_4_in_rule__Occurrence__Group__4__Impl6653);
            rule__Occurrence__ParticipantDestinationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOccurrenceAccess().getParticipantDestinationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__4__Impl"


    // $ANTLR start "rule__Occurrence__Group__5"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3259:1: rule__Occurrence__Group__5 : rule__Occurrence__Group__5__Impl ;
    public final void rule__Occurrence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3263:1: ( rule__Occurrence__Group__5__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3264:2: rule__Occurrence__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Occurrence__Group__5__Impl_in_rule__Occurrence__Group__56683);
            rule__Occurrence__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__5"


    // $ANTLR start "rule__Occurrence__Group__5__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3270:1: rule__Occurrence__Group__5__Impl : ( ( rule__Occurrence__Alternatives_5 ) ) ;
    public final void rule__Occurrence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3274:1: ( ( ( rule__Occurrence__Alternatives_5 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3275:1: ( ( rule__Occurrence__Alternatives_5 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3275:1: ( ( rule__Occurrence__Alternatives_5 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3276:1: ( rule__Occurrence__Alternatives_5 )
            {
             before(grammarAccess.getOccurrenceAccess().getAlternatives_5()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3277:1: ( rule__Occurrence__Alternatives_5 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3277:2: rule__Occurrence__Alternatives_5
            {
            pushFollow(FOLLOW_rule__Occurrence__Alternatives_5_in_rule__Occurrence__Group__5__Impl6710);
            rule__Occurrence__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getOccurrenceAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__Group__5__Impl"


    // $ANTLR start "rule__Duty__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3299:1: rule__Duty__Group__0 : rule__Duty__Group__0__Impl rule__Duty__Group__1 ;
    public final void rule__Duty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3303:1: ( rule__Duty__Group__0__Impl rule__Duty__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3304:2: rule__Duty__Group__0__Impl rule__Duty__Group__1
            {
            pushFollow(FOLLOW_rule__Duty__Group__0__Impl_in_rule__Duty__Group__06752);
            rule__Duty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Duty__Group__1_in_rule__Duty__Group__06755);
            rule__Duty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duty__Group__0"


    // $ANTLR start "rule__Duty__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3311:1: rule__Duty__Group__0__Impl : ( ( rule__Duty__DutytypeAssignment_0 ) ) ;
    public final void rule__Duty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3315:1: ( ( ( rule__Duty__DutytypeAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3316:1: ( ( rule__Duty__DutytypeAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3316:1: ( ( rule__Duty__DutytypeAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3317:1: ( rule__Duty__DutytypeAssignment_0 )
            {
             before(grammarAccess.getDutyAccess().getDutytypeAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3318:1: ( rule__Duty__DutytypeAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3318:2: rule__Duty__DutytypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Duty__DutytypeAssignment_0_in_rule__Duty__Group__0__Impl6782);
            rule__Duty__DutytypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDutyAccess().getDutytypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duty__Group__0__Impl"


    // $ANTLR start "rule__Duty__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3328:1: rule__Duty__Group__1 : rule__Duty__Group__1__Impl ;
    public final void rule__Duty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3332:1: ( rule__Duty__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3333:2: rule__Duty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Duty__Group__1__Impl_in_rule__Duty__Group__16812);
            rule__Duty__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duty__Group__1"


    // $ANTLR start "rule__Duty__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3339:1: rule__Duty__Group__1__Impl : ( ( rule__Duty__DutyAssignment_1 ) ) ;
    public final void rule__Duty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3343:1: ( ( ( rule__Duty__DutyAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3344:1: ( ( rule__Duty__DutyAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3344:1: ( ( rule__Duty__DutyAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3345:1: ( rule__Duty__DutyAssignment_1 )
            {
             before(grammarAccess.getDutyAccess().getDutyAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3346:1: ( rule__Duty__DutyAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3346:2: rule__Duty__DutyAssignment_1
            {
            pushFollow(FOLLOW_rule__Duty__DutyAssignment_1_in_rule__Duty__Group__1__Impl6839);
            rule__Duty__DutyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDutyAccess().getDutyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duty__Group__1__Impl"


    // $ANTLR start "rule__DutyType__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3360:1: rule__DutyType__Group__0 : rule__DutyType__Group__0__Impl rule__DutyType__Group__1 ;
    public final void rule__DutyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3364:1: ( rule__DutyType__Group__0__Impl rule__DutyType__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3365:2: rule__DutyType__Group__0__Impl rule__DutyType__Group__1
            {
            pushFollow(FOLLOW_rule__DutyType__Group__0__Impl_in_rule__DutyType__Group__06873);
            rule__DutyType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DutyType__Group__1_in_rule__DutyType__Group__06876);
            rule__DutyType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group__0"


    // $ANTLR start "rule__DutyType__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3372:1: rule__DutyType__Group__0__Impl : ( () ) ;
    public final void rule__DutyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3376:1: ( ( () ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3377:1: ( () )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3377:1: ( () )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3378:1: ()
            {
             before(grammarAccess.getDutyTypeAccess().getDutyTypeAction_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3379:1: ()
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3381:1: 
            {
            }

             after(grammarAccess.getDutyTypeAccess().getDutyTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group__0__Impl"


    // $ANTLR start "rule__DutyType__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3391:1: rule__DutyType__Group__1 : rule__DutyType__Group__1__Impl ;
    public final void rule__DutyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3395:1: ( rule__DutyType__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3396:2: rule__DutyType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DutyType__Group__1__Impl_in_rule__DutyType__Group__16934);
            rule__DutyType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group__1"


    // $ANTLR start "rule__DutyType__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3402:1: rule__DutyType__Group__1__Impl : ( ( rule__DutyType__Alternatives_1 ) ) ;
    public final void rule__DutyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3406:1: ( ( ( rule__DutyType__Alternatives_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3407:1: ( ( rule__DutyType__Alternatives_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3407:1: ( ( rule__DutyType__Alternatives_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3408:1: ( rule__DutyType__Alternatives_1 )
            {
             before(grammarAccess.getDutyTypeAccess().getAlternatives_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3409:1: ( rule__DutyType__Alternatives_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3409:2: rule__DutyType__Alternatives_1
            {
            pushFollow(FOLLOW_rule__DutyType__Alternatives_1_in_rule__DutyType__Group__1__Impl6961);
            rule__DutyType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDutyTypeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group__1__Impl"


    // $ANTLR start "rule__DutyType__Group_1_2__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3423:1: rule__DutyType__Group_1_2__0 : rule__DutyType__Group_1_2__0__Impl rule__DutyType__Group_1_2__1 ;
    public final void rule__DutyType__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3427:1: ( rule__DutyType__Group_1_2__0__Impl rule__DutyType__Group_1_2__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3428:2: rule__DutyType__Group_1_2__0__Impl rule__DutyType__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__DutyType__Group_1_2__0__Impl_in_rule__DutyType__Group_1_2__06995);
            rule__DutyType__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DutyType__Group_1_2__1_in_rule__DutyType__Group_1_2__06998);
            rule__DutyType__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group_1_2__0"


    // $ANTLR start "rule__DutyType__Group_1_2__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3435:1: rule__DutyType__Group_1_2__0__Impl : ( ( rule__DutyType__NameAssignment_1_2_0 ) ) ;
    public final void rule__DutyType__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3439:1: ( ( ( rule__DutyType__NameAssignment_1_2_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3440:1: ( ( rule__DutyType__NameAssignment_1_2_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3440:1: ( ( rule__DutyType__NameAssignment_1_2_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3441:1: ( rule__DutyType__NameAssignment_1_2_0 )
            {
             before(grammarAccess.getDutyTypeAccess().getNameAssignment_1_2_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3442:1: ( rule__DutyType__NameAssignment_1_2_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3442:2: rule__DutyType__NameAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__DutyType__NameAssignment_1_2_0_in_rule__DutyType__Group_1_2__0__Impl7025);
            rule__DutyType__NameAssignment_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDutyTypeAccess().getNameAssignment_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group_1_2__0__Impl"


    // $ANTLR start "rule__DutyType__Group_1_2__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3452:1: rule__DutyType__Group_1_2__1 : rule__DutyType__Group_1_2__1__Impl rule__DutyType__Group_1_2__2 ;
    public final void rule__DutyType__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3456:1: ( rule__DutyType__Group_1_2__1__Impl rule__DutyType__Group_1_2__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3457:2: rule__DutyType__Group_1_2__1__Impl rule__DutyType__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__DutyType__Group_1_2__1__Impl_in_rule__DutyType__Group_1_2__17055);
            rule__DutyType__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DutyType__Group_1_2__2_in_rule__DutyType__Group_1_2__17058);
            rule__DutyType__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group_1_2__1"


    // $ANTLR start "rule__DutyType__Group_1_2__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3464:1: rule__DutyType__Group_1_2__1__Impl : ( '[' ) ;
    public final void rule__DutyType__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3468:1: ( ( '[' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3469:1: ( '[' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3469:1: ( '[' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3470:1: '['
            {
             before(grammarAccess.getDutyTypeAccess().getLeftSquareBracketKeyword_1_2_1()); 
            match(input,40,FOLLOW_40_in_rule__DutyType__Group_1_2__1__Impl7086); 
             after(grammarAccess.getDutyTypeAccess().getLeftSquareBracketKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group_1_2__1__Impl"


    // $ANTLR start "rule__DutyType__Group_1_2__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3483:1: rule__DutyType__Group_1_2__2 : rule__DutyType__Group_1_2__2__Impl rule__DutyType__Group_1_2__3 ;
    public final void rule__DutyType__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3487:1: ( rule__DutyType__Group_1_2__2__Impl rule__DutyType__Group_1_2__3 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3488:2: rule__DutyType__Group_1_2__2__Impl rule__DutyType__Group_1_2__3
            {
            pushFollow(FOLLOW_rule__DutyType__Group_1_2__2__Impl_in_rule__DutyType__Group_1_2__27117);
            rule__DutyType__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DutyType__Group_1_2__3_in_rule__DutyType__Group_1_2__27120);
            rule__DutyType__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group_1_2__2"


    // $ANTLR start "rule__DutyType__Group_1_2__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3495:1: rule__DutyType__Group_1_2__2__Impl : ( ( rule__DutyType__PerformativeAssignment_1_2_2 ) ) ;
    public final void rule__DutyType__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3499:1: ( ( ( rule__DutyType__PerformativeAssignment_1_2_2 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3500:1: ( ( rule__DutyType__PerformativeAssignment_1_2_2 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3500:1: ( ( rule__DutyType__PerformativeAssignment_1_2_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3501:1: ( rule__DutyType__PerformativeAssignment_1_2_2 )
            {
             before(grammarAccess.getDutyTypeAccess().getPerformativeAssignment_1_2_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3502:1: ( rule__DutyType__PerformativeAssignment_1_2_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3502:2: rule__DutyType__PerformativeAssignment_1_2_2
            {
            pushFollow(FOLLOW_rule__DutyType__PerformativeAssignment_1_2_2_in_rule__DutyType__Group_1_2__2__Impl7147);
            rule__DutyType__PerformativeAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDutyTypeAccess().getPerformativeAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group_1_2__2__Impl"


    // $ANTLR start "rule__DutyType__Group_1_2__3"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3512:1: rule__DutyType__Group_1_2__3 : rule__DutyType__Group_1_2__3__Impl ;
    public final void rule__DutyType__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3516:1: ( rule__DutyType__Group_1_2__3__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3517:2: rule__DutyType__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_rule__DutyType__Group_1_2__3__Impl_in_rule__DutyType__Group_1_2__37177);
            rule__DutyType__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group_1_2__3"


    // $ANTLR start "rule__DutyType__Group_1_2__3__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3523:1: rule__DutyType__Group_1_2__3__Impl : ( ']' ) ;
    public final void rule__DutyType__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3527:1: ( ( ']' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3528:1: ( ']' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3528:1: ( ']' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3529:1: ']'
            {
             before(grammarAccess.getDutyTypeAccess().getRightSquareBracketKeyword_1_2_3()); 
            match(input,41,FOLLOW_41_in_rule__DutyType__Group_1_2__3__Impl7205); 
             after(grammarAccess.getDutyTypeAccess().getRightSquareBracketKeyword_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__Group_1_2__3__Impl"


    // $ANTLR start "rule__ParticipantOccurrence__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3550:1: rule__ParticipantOccurrence__Group__0 : rule__ParticipantOccurrence__Group__0__Impl rule__ParticipantOccurrence__Group__1 ;
    public final void rule__ParticipantOccurrence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3554:1: ( rule__ParticipantOccurrence__Group__0__Impl rule__ParticipantOccurrence__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3555:2: rule__ParticipantOccurrence__Group__0__Impl rule__ParticipantOccurrence__Group__1
            {
            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group__0__Impl_in_rule__ParticipantOccurrence__Group__07244);
            rule__ParticipantOccurrence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group__1_in_rule__ParticipantOccurrence__Group__07247);
            rule__ParticipantOccurrence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group__0"


    // $ANTLR start "rule__ParticipantOccurrence__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3562:1: rule__ParticipantOccurrence__Group__0__Impl : ( ( rule__ParticipantOccurrence__ParticipantSourceAssignment_0 ) ) ;
    public final void rule__ParticipantOccurrence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3566:1: ( ( ( rule__ParticipantOccurrence__ParticipantSourceAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3567:1: ( ( rule__ParticipantOccurrence__ParticipantSourceAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3567:1: ( ( rule__ParticipantOccurrence__ParticipantSourceAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3568:1: ( rule__ParticipantOccurrence__ParticipantSourceAssignment_0 )
            {
             before(grammarAccess.getParticipantOccurrenceAccess().getParticipantSourceAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3569:1: ( rule__ParticipantOccurrence__ParticipantSourceAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3569:2: rule__ParticipantOccurrence__ParticipantSourceAssignment_0
            {
            pushFollow(FOLLOW_rule__ParticipantOccurrence__ParticipantSourceAssignment_0_in_rule__ParticipantOccurrence__Group__0__Impl7274);
            rule__ParticipantOccurrence__ParticipantSourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantOccurrenceAccess().getParticipantSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group__0__Impl"


    // $ANTLR start "rule__ParticipantOccurrence__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3579:1: rule__ParticipantOccurrence__Group__1 : rule__ParticipantOccurrence__Group__1__Impl ;
    public final void rule__ParticipantOccurrence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3583:1: ( rule__ParticipantOccurrence__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3584:2: rule__ParticipantOccurrence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group__1__Impl_in_rule__ParticipantOccurrence__Group__17304);
            rule__ParticipantOccurrence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group__1"


    // $ANTLR start "rule__ParticipantOccurrence__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3590:1: rule__ParticipantOccurrence__Group__1__Impl : ( ( rule__ParticipantOccurrence__Group_1__0 )? ) ;
    public final void rule__ParticipantOccurrence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3594:1: ( ( ( rule__ParticipantOccurrence__Group_1__0 )? ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3595:1: ( ( rule__ParticipantOccurrence__Group_1__0 )? )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3595:1: ( ( rule__ParticipantOccurrence__Group_1__0 )? )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3596:1: ( rule__ParticipantOccurrence__Group_1__0 )?
            {
             before(grammarAccess.getParticipantOccurrenceAccess().getGroup_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3597:1: ( rule__ParticipantOccurrence__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3597:2: rule__ParticipantOccurrence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ParticipantOccurrence__Group_1__0_in_rule__ParticipantOccurrence__Group__1__Impl7331);
                    rule__ParticipantOccurrence__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParticipantOccurrenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group__1__Impl"


    // $ANTLR start "rule__ParticipantOccurrence__Group_1__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3611:1: rule__ParticipantOccurrence__Group_1__0 : rule__ParticipantOccurrence__Group_1__0__Impl rule__ParticipantOccurrence__Group_1__1 ;
    public final void rule__ParticipantOccurrence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3615:1: ( rule__ParticipantOccurrence__Group_1__0__Impl rule__ParticipantOccurrence__Group_1__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3616:2: rule__ParticipantOccurrence__Group_1__0__Impl rule__ParticipantOccurrence__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group_1__0__Impl_in_rule__ParticipantOccurrence__Group_1__07366);
            rule__ParticipantOccurrence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group_1__1_in_rule__ParticipantOccurrence__Group_1__07369);
            rule__ParticipantOccurrence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group_1__0"


    // $ANTLR start "rule__ParticipantOccurrence__Group_1__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3623:1: rule__ParticipantOccurrence__Group_1__0__Impl : ( '[' ) ;
    public final void rule__ParticipantOccurrence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3627:1: ( ( '[' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3628:1: ( '[' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3628:1: ( '[' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3629:1: '['
            {
             before(grammarAccess.getParticipantOccurrenceAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__ParticipantOccurrence__Group_1__0__Impl7397); 
             after(grammarAccess.getParticipantOccurrenceAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group_1__0__Impl"


    // $ANTLR start "rule__ParticipantOccurrence__Group_1__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3642:1: rule__ParticipantOccurrence__Group_1__1 : rule__ParticipantOccurrence__Group_1__1__Impl rule__ParticipantOccurrence__Group_1__2 ;
    public final void rule__ParticipantOccurrence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3646:1: ( rule__ParticipantOccurrence__Group_1__1__Impl rule__ParticipantOccurrence__Group_1__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3647:2: rule__ParticipantOccurrence__Group_1__1__Impl rule__ParticipantOccurrence__Group_1__2
            {
            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group_1__1__Impl_in_rule__ParticipantOccurrence__Group_1__17428);
            rule__ParticipantOccurrence__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group_1__2_in_rule__ParticipantOccurrence__Group_1__17431);
            rule__ParticipantOccurrence__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group_1__1"


    // $ANTLR start "rule__ParticipantOccurrence__Group_1__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3654:1: rule__ParticipantOccurrence__Group_1__1__Impl : ( ( rule__ParticipantOccurrence__CardinalityAssignment_1_1 ) ) ;
    public final void rule__ParticipantOccurrence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3658:1: ( ( ( rule__ParticipantOccurrence__CardinalityAssignment_1_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3659:1: ( ( rule__ParticipantOccurrence__CardinalityAssignment_1_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3659:1: ( ( rule__ParticipantOccurrence__CardinalityAssignment_1_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3660:1: ( rule__ParticipantOccurrence__CardinalityAssignment_1_1 )
            {
             before(grammarAccess.getParticipantOccurrenceAccess().getCardinalityAssignment_1_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3661:1: ( rule__ParticipantOccurrence__CardinalityAssignment_1_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3661:2: rule__ParticipantOccurrence__CardinalityAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParticipantOccurrence__CardinalityAssignment_1_1_in_rule__ParticipantOccurrence__Group_1__1__Impl7458);
            rule__ParticipantOccurrence__CardinalityAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantOccurrenceAccess().getCardinalityAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group_1__1__Impl"


    // $ANTLR start "rule__ParticipantOccurrence__Group_1__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3671:1: rule__ParticipantOccurrence__Group_1__2 : rule__ParticipantOccurrence__Group_1__2__Impl ;
    public final void rule__ParticipantOccurrence__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3675:1: ( rule__ParticipantOccurrence__Group_1__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3676:2: rule__ParticipantOccurrence__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantOccurrence__Group_1__2__Impl_in_rule__ParticipantOccurrence__Group_1__27488);
            rule__ParticipantOccurrence__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group_1__2"


    // $ANTLR start "rule__ParticipantOccurrence__Group_1__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3682:1: rule__ParticipantOccurrence__Group_1__2__Impl : ( ']' ) ;
    public final void rule__ParticipantOccurrence__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3686:1: ( ( ']' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3687:1: ( ']' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3687:1: ( ']' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3688:1: ']'
            {
             before(grammarAccess.getParticipantOccurrenceAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,41,FOLLOW_41_in_rule__ParticipantOccurrence__Group_1__2__Impl7516); 
             after(grammarAccess.getParticipantOccurrenceAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__Group_1__2__Impl"


    // $ANTLR start "rule__States__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3707:1: rule__States__Group__0 : rule__States__Group__0__Impl rule__States__Group__1 ;
    public final void rule__States__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3711:1: ( rule__States__Group__0__Impl rule__States__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3712:2: rule__States__Group__0__Impl rule__States__Group__1
            {
            pushFollow(FOLLOW_rule__States__Group__0__Impl_in_rule__States__Group__07553);
            rule__States__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__States__Group__1_in_rule__States__Group__07556);
            rule__States__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__0"


    // $ANTLR start "rule__States__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3719:1: rule__States__Group__0__Impl : ( ( rule__States__NameAssignment_0 ) ) ;
    public final void rule__States__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3723:1: ( ( ( rule__States__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3724:1: ( ( rule__States__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3724:1: ( ( rule__States__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3725:1: ( rule__States__NameAssignment_0 )
            {
             before(grammarAccess.getStatesAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3726:1: ( rule__States__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3726:2: rule__States__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__States__NameAssignment_0_in_rule__States__Group__0__Impl7583);
            rule__States__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__0__Impl"


    // $ANTLR start "rule__States__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3736:1: rule__States__Group__1 : rule__States__Group__1__Impl rule__States__Group__2 ;
    public final void rule__States__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3740:1: ( rule__States__Group__1__Impl rule__States__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3741:2: rule__States__Group__1__Impl rule__States__Group__2
            {
            pushFollow(FOLLOW_rule__States__Group__1__Impl_in_rule__States__Group__17613);
            rule__States__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__States__Group__2_in_rule__States__Group__17616);
            rule__States__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__1"


    // $ANTLR start "rule__States__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3748:1: rule__States__Group__1__Impl : ( ':' ) ;
    public final void rule__States__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3752:1: ( ( ':' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3753:1: ( ':' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3753:1: ( ':' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3754:1: ':'
            {
             before(grammarAccess.getStatesAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__States__Group__1__Impl7644); 
             after(grammarAccess.getStatesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__1__Impl"


    // $ANTLR start "rule__States__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3767:1: rule__States__Group__2 : rule__States__Group__2__Impl ;
    public final void rule__States__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3771:1: ( rule__States__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3772:2: rule__States__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__States__Group__2__Impl_in_rule__States__Group__27675);
            rule__States__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__2"


    // $ANTLR start "rule__States__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3778:1: rule__States__Group__2__Impl : ( ( ( rule__States__StatesAssignment_2 ) ) ( ( rule__States__StatesAssignment_2 )* ) ) ;
    public final void rule__States__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3782:1: ( ( ( ( rule__States__StatesAssignment_2 ) ) ( ( rule__States__StatesAssignment_2 )* ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3783:1: ( ( ( rule__States__StatesAssignment_2 ) ) ( ( rule__States__StatesAssignment_2 )* ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3783:1: ( ( ( rule__States__StatesAssignment_2 ) ) ( ( rule__States__StatesAssignment_2 )* ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3784:1: ( ( rule__States__StatesAssignment_2 ) ) ( ( rule__States__StatesAssignment_2 )* )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3784:1: ( ( rule__States__StatesAssignment_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3785:1: ( rule__States__StatesAssignment_2 )
            {
             before(grammarAccess.getStatesAccess().getStatesAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3786:1: ( rule__States__StatesAssignment_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3786:2: rule__States__StatesAssignment_2
            {
            pushFollow(FOLLOW_rule__States__StatesAssignment_2_in_rule__States__Group__2__Impl7704);
            rule__States__StatesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatesAccess().getStatesAssignment_2()); 

            }

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3789:1: ( ( rule__States__StatesAssignment_2 )* )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3790:1: ( rule__States__StatesAssignment_2 )*
            {
             before(grammarAccess.getStatesAccess().getStatesAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3791:1: ( rule__States__StatesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID_WITH_STARTING_LCLETTER) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3791:2: rule__States__StatesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__States__StatesAssignment_2_in_rule__States__Group__2__Impl7716);
            	    rule__States__StatesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStatesAccess().getStatesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__Group__2__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3808:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3812:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3813:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__07755);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__07758);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3820:1: rule__State__Group__0__Impl : ( ( rule__State__IdAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3824:1: ( ( ( rule__State__IdAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3825:1: ( ( rule__State__IdAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3825:1: ( ( rule__State__IdAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3826:1: ( rule__State__IdAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getIdAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3827:1: ( rule__State__IdAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3827:2: rule__State__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__State__IdAssignment_0_in_rule__State__Group__0__Impl7785);
            rule__State__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3837:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3841:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3842:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__17815);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__17818);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3849:1: rule__State__Group__1__Impl : ( ( rule__State__TypeAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3853:1: ( ( ( rule__State__TypeAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3854:1: ( ( rule__State__TypeAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3854:1: ( ( rule__State__TypeAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3855:1: ( rule__State__TypeAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getTypeAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3856:1: ( rule__State__TypeAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3856:2: rule__State__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__State__TypeAssignment_1_in_rule__State__Group__1__Impl7845);
            rule__State__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3866:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3870:1: ( rule__State__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3871:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__27875);
            rule__State__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3877:1: rule__State__Group__2__Impl : ( ';' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3881:1: ( ( ';' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3882:1: ( ';' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3882:1: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3883:1: ';'
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__State__Group__2__Impl7903); 
             after(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__StateType__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3902:1: rule__StateType__Group__0 : rule__StateType__Group__0__Impl rule__StateType__Group__1 ;
    public final void rule__StateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3906:1: ( rule__StateType__Group__0__Impl rule__StateType__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3907:2: rule__StateType__Group__0__Impl rule__StateType__Group__1
            {
            pushFollow(FOLLOW_rule__StateType__Group__0__Impl_in_rule__StateType__Group__07940);
            rule__StateType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__07943);
            rule__StateType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__Group__0"


    // $ANTLR start "rule__StateType__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3914:1: rule__StateType__Group__0__Impl : ( () ) ;
    public final void rule__StateType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3918:1: ( ( () ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3919:1: ( () )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3919:1: ( () )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3920:1: ()
            {
             before(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3921:1: ()
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3923:1: 
            {
            }

             after(grammarAccess.getStateTypeAccess().getStateTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__Group__0__Impl"


    // $ANTLR start "rule__StateType__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3933:1: rule__StateType__Group__1 : rule__StateType__Group__1__Impl ;
    public final void rule__StateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3937:1: ( rule__StateType__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3938:2: rule__StateType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StateType__Group__1__Impl_in_rule__StateType__Group__18001);
            rule__StateType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__Group__1"


    // $ANTLR start "rule__StateType__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3944:1: rule__StateType__Group__1__Impl : ( ( rule__StateType__Alternatives_1 )? ) ;
    public final void rule__StateType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3948:1: ( ( ( rule__StateType__Alternatives_1 )? ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3949:1: ( ( rule__StateType__Alternatives_1 )? )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3949:1: ( ( rule__StateType__Alternatives_1 )? )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3950:1: ( rule__StateType__Alternatives_1 )?
            {
             before(grammarAccess.getStateTypeAccess().getAlternatives_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3951:1: ( rule__StateType__Alternatives_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=20 && LA16_0<=21)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3951:2: rule__StateType__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__StateType__Alternatives_1_in_rule__StateType__Group__1__Impl8028);
                    rule__StateType__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateTypeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__Group__1__Impl"


    // $ANTLR start "rule__Participants__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3965:1: rule__Participants__Group__0 : rule__Participants__Group__0__Impl rule__Participants__Group__1 ;
    public final void rule__Participants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3969:1: ( rule__Participants__Group__0__Impl rule__Participants__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3970:2: rule__Participants__Group__0__Impl rule__Participants__Group__1
            {
            pushFollow(FOLLOW_rule__Participants__Group__0__Impl_in_rule__Participants__Group__08063);
            rule__Participants__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Participants__Group__1_in_rule__Participants__Group__08066);
            rule__Participants__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participants__Group__0"


    // $ANTLR start "rule__Participants__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3977:1: rule__Participants__Group__0__Impl : ( ( rule__Participants__NameAssignment_0 ) ) ;
    public final void rule__Participants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3981:1: ( ( ( rule__Participants__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3982:1: ( ( rule__Participants__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3982:1: ( ( rule__Participants__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3983:1: ( rule__Participants__NameAssignment_0 )
            {
             before(grammarAccess.getParticipantsAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3984:1: ( rule__Participants__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3984:2: rule__Participants__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Participants__NameAssignment_0_in_rule__Participants__Group__0__Impl8093);
            rule__Participants__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participants__Group__0__Impl"


    // $ANTLR start "rule__Participants__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3994:1: rule__Participants__Group__1 : rule__Participants__Group__1__Impl rule__Participants__Group__2 ;
    public final void rule__Participants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3998:1: ( rule__Participants__Group__1__Impl rule__Participants__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:3999:2: rule__Participants__Group__1__Impl rule__Participants__Group__2
            {
            pushFollow(FOLLOW_rule__Participants__Group__1__Impl_in_rule__Participants__Group__18123);
            rule__Participants__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Participants__Group__2_in_rule__Participants__Group__18126);
            rule__Participants__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participants__Group__1"


    // $ANTLR start "rule__Participants__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4006:1: rule__Participants__Group__1__Impl : ( ':' ) ;
    public final void rule__Participants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4010:1: ( ( ':' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4011:1: ( ':' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4011:1: ( ':' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4012:1: ':'
            {
             before(grammarAccess.getParticipantsAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Participants__Group__1__Impl8154); 
             after(grammarAccess.getParticipantsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participants__Group__1__Impl"


    // $ANTLR start "rule__Participants__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4025:1: rule__Participants__Group__2 : rule__Participants__Group__2__Impl ;
    public final void rule__Participants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4029:1: ( rule__Participants__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4030:2: rule__Participants__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Participants__Group__2__Impl_in_rule__Participants__Group__28185);
            rule__Participants__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participants__Group__2"


    // $ANTLR start "rule__Participants__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4036:1: rule__Participants__Group__2__Impl : ( ( ( rule__Participants__ParticipantsAssignment_2 ) ) ( ( rule__Participants__ParticipantsAssignment_2 )* ) ) ;
    public final void rule__Participants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4040:1: ( ( ( ( rule__Participants__ParticipantsAssignment_2 ) ) ( ( rule__Participants__ParticipantsAssignment_2 )* ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4041:1: ( ( ( rule__Participants__ParticipantsAssignment_2 ) ) ( ( rule__Participants__ParticipantsAssignment_2 )* ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4041:1: ( ( ( rule__Participants__ParticipantsAssignment_2 ) ) ( ( rule__Participants__ParticipantsAssignment_2 )* ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4042:1: ( ( rule__Participants__ParticipantsAssignment_2 ) ) ( ( rule__Participants__ParticipantsAssignment_2 )* )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4042:1: ( ( rule__Participants__ParticipantsAssignment_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4043:1: ( rule__Participants__ParticipantsAssignment_2 )
            {
             before(grammarAccess.getParticipantsAccess().getParticipantsAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4044:1: ( rule__Participants__ParticipantsAssignment_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4044:2: rule__Participants__ParticipantsAssignment_2
            {
            pushFollow(FOLLOW_rule__Participants__ParticipantsAssignment_2_in_rule__Participants__Group__2__Impl8214);
            rule__Participants__ParticipantsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParticipantsAccess().getParticipantsAssignment_2()); 

            }

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4047:1: ( ( rule__Participants__ParticipantsAssignment_2 )* )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4048:1: ( rule__Participants__ParticipantsAssignment_2 )*
            {
             before(grammarAccess.getParticipantsAccess().getParticipantsAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4049:1: ( rule__Participants__ParticipantsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID_WITH_STARTING_LCLETTER) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4049:2: rule__Participants__ParticipantsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Participants__ParticipantsAssignment_2_in_rule__Participants__Group__2__Impl8226);
            	    rule__Participants__ParticipantsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getParticipantsAccess().getParticipantsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participants__Group__2__Impl"


    // $ANTLR start "rule__Participant__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4066:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4070:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4071:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
            {
            pushFollow(FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__08265);
            rule__Participant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__08268);
            rule__Participant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__0"


    // $ANTLR start "rule__Participant__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4078:1: rule__Participant__Group__0__Impl : ( ( rule__Participant__NameAssignment_0 ) ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4082:1: ( ( ( rule__Participant__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4083:1: ( ( rule__Participant__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4083:1: ( ( rule__Participant__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4084:1: ( rule__Participant__NameAssignment_0 )
            {
             before(grammarAccess.getParticipantAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4085:1: ( rule__Participant__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4085:2: rule__Participant__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Participant__NameAssignment_0_in_rule__Participant__Group__0__Impl8295);
            rule__Participant__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__0__Impl"


    // $ANTLR start "rule__Participant__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4095:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4099:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4100:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
            {
            pushFollow(FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__18325);
            rule__Participant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__18328);
            rule__Participant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__1"


    // $ANTLR start "rule__Participant__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4107:1: rule__Participant__Group__1__Impl : ( ( rule__Participant__ParticipantDescriptionAssignment_1 ) ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4111:1: ( ( ( rule__Participant__ParticipantDescriptionAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4112:1: ( ( rule__Participant__ParticipantDescriptionAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4112:1: ( ( rule__Participant__ParticipantDescriptionAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4113:1: ( rule__Participant__ParticipantDescriptionAssignment_1 )
            {
             before(grammarAccess.getParticipantAccess().getParticipantDescriptionAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4114:1: ( rule__Participant__ParticipantDescriptionAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4114:2: rule__Participant__ParticipantDescriptionAssignment_1
            {
            pushFollow(FOLLOW_rule__Participant__ParticipantDescriptionAssignment_1_in_rule__Participant__Group__1__Impl8355);
            rule__Participant__ParticipantDescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantAccess().getParticipantDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__1__Impl"


    // $ANTLR start "rule__Participant__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4124:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4128:1: ( rule__Participant__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4129:2: rule__Participant__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__28385);
            rule__Participant__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__2"


    // $ANTLR start "rule__Participant__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4135:1: rule__Participant__Group__2__Impl : ( ';' ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4139:1: ( ( ';' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4140:1: ( ';' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4140:1: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4141:1: ';'
            {
             before(grammarAccess.getParticipantAccess().getSemicolonKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Participant__Group__2__Impl8413); 
             after(grammarAccess.getParticipantAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__Group__2__Impl"


    // $ANTLR start "rule__ParticipantDescription__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4160:1: rule__ParticipantDescription__Group__0 : rule__ParticipantDescription__Group__0__Impl rule__ParticipantDescription__Group__1 ;
    public final void rule__ParticipantDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4164:1: ( rule__ParticipantDescription__Group__0__Impl rule__ParticipantDescription__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4165:2: rule__ParticipantDescription__Group__0__Impl rule__ParticipantDescription__Group__1
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__Group__0__Impl_in_rule__ParticipantDescription__Group__08450);
            rule__ParticipantDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantDescription__Group__1_in_rule__ParticipantDescription__Group__08453);
            rule__ParticipantDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group__0"


    // $ANTLR start "rule__ParticipantDescription__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4172:1: rule__ParticipantDescription__Group__0__Impl : ( ( rule__ParticipantDescription__Alternatives_0 ) ) ;
    public final void rule__ParticipantDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4176:1: ( ( ( rule__ParticipantDescription__Alternatives_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4177:1: ( ( rule__ParticipantDescription__Alternatives_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4177:1: ( ( rule__ParticipantDescription__Alternatives_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4178:1: ( rule__ParticipantDescription__Alternatives_0 )
            {
             before(grammarAccess.getParticipantDescriptionAccess().getAlternatives_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4179:1: ( rule__ParticipantDescription__Alternatives_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4179:2: rule__ParticipantDescription__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__Alternatives_0_in_rule__ParticipantDescription__Group__0__Impl8480);
            rule__ParticipantDescription__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDescriptionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group__0__Impl"


    // $ANTLR start "rule__ParticipantDescription__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4189:1: rule__ParticipantDescription__Group__1 : rule__ParticipantDescription__Group__1__Impl ;
    public final void rule__ParticipantDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4193:1: ( rule__ParticipantDescription__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4194:2: rule__ParticipantDescription__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__Group__1__Impl_in_rule__ParticipantDescription__Group__18510);
            rule__ParticipantDescription__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group__1"


    // $ANTLR start "rule__ParticipantDescription__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4200:1: rule__ParticipantDescription__Group__1__Impl : ( ( rule__ParticipantDescription__CardAssignment_1 ) ) ;
    public final void rule__ParticipantDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4204:1: ( ( ( rule__ParticipantDescription__CardAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4205:1: ( ( rule__ParticipantDescription__CardAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4205:1: ( ( rule__ParticipantDescription__CardAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4206:1: ( rule__ParticipantDescription__CardAssignment_1 )
            {
             before(grammarAccess.getParticipantDescriptionAccess().getCardAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4207:1: ( rule__ParticipantDescription__CardAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4207:2: rule__ParticipantDescription__CardAssignment_1
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__CardAssignment_1_in_rule__ParticipantDescription__Group__1__Impl8537);
            rule__ParticipantDescription__CardAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDescriptionAccess().getCardAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group__1__Impl"


    // $ANTLR start "rule__ParticipantDescription__Group_0_0__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4221:1: rule__ParticipantDescription__Group_0_0__0 : rule__ParticipantDescription__Group_0_0__0__Impl rule__ParticipantDescription__Group_0_0__1 ;
    public final void rule__ParticipantDescription__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4225:1: ( rule__ParticipantDescription__Group_0_0__0__Impl rule__ParticipantDescription__Group_0_0__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4226:2: rule__ParticipantDescription__Group_0_0__0__Impl rule__ParticipantDescription__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__Group_0_0__0__Impl_in_rule__ParticipantDescription__Group_0_0__08571);
            rule__ParticipantDescription__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantDescription__Group_0_0__1_in_rule__ParticipantDescription__Group_0_0__08574);
            rule__ParticipantDescription__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group_0_0__0"


    // $ANTLR start "rule__ParticipantDescription__Group_0_0__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4233:1: rule__ParticipantDescription__Group_0_0__0__Impl : ( ( rule__ParticipantDescription__KindAssignment_0_0_0 ) ) ;
    public final void rule__ParticipantDescription__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4237:1: ( ( ( rule__ParticipantDescription__KindAssignment_0_0_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4238:1: ( ( rule__ParticipantDescription__KindAssignment_0_0_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4238:1: ( ( rule__ParticipantDescription__KindAssignment_0_0_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4239:1: ( rule__ParticipantDescription__KindAssignment_0_0_0 )
            {
             before(grammarAccess.getParticipantDescriptionAccess().getKindAssignment_0_0_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4240:1: ( rule__ParticipantDescription__KindAssignment_0_0_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4240:2: rule__ParticipantDescription__KindAssignment_0_0_0
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__KindAssignment_0_0_0_in_rule__ParticipantDescription__Group_0_0__0__Impl8601);
            rule__ParticipantDescription__KindAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDescriptionAccess().getKindAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group_0_0__0__Impl"


    // $ANTLR start "rule__ParticipantDescription__Group_0_0__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4250:1: rule__ParticipantDescription__Group_0_0__1 : rule__ParticipantDescription__Group_0_0__1__Impl ;
    public final void rule__ParticipantDescription__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4254:1: ( rule__ParticipantDescription__Group_0_0__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4255:2: rule__ParticipantDescription__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__Group_0_0__1__Impl_in_rule__ParticipantDescription__Group_0_0__18631);
            rule__ParticipantDescription__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group_0_0__1"


    // $ANTLR start "rule__ParticipantDescription__Group_0_0__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4261:1: rule__ParticipantDescription__Group_0_0__1__Impl : ( ( rule__ParticipantDescription__RoleAssignment_0_0_1 ) ) ;
    public final void rule__ParticipantDescription__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4265:1: ( ( ( rule__ParticipantDescription__RoleAssignment_0_0_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4266:1: ( ( rule__ParticipantDescription__RoleAssignment_0_0_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4266:1: ( ( rule__ParticipantDescription__RoleAssignment_0_0_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4267:1: ( rule__ParticipantDescription__RoleAssignment_0_0_1 )
            {
             before(grammarAccess.getParticipantDescriptionAccess().getRoleAssignment_0_0_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4268:1: ( rule__ParticipantDescription__RoleAssignment_0_0_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4268:2: rule__ParticipantDescription__RoleAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__RoleAssignment_0_0_1_in_rule__ParticipantDescription__Group_0_0__1__Impl8658);
            rule__ParticipantDescription__RoleAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDescriptionAccess().getRoleAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group_0_0__1__Impl"


    // $ANTLR start "rule__ParticipantDescription__Group_0_1__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4282:1: rule__ParticipantDescription__Group_0_1__0 : rule__ParticipantDescription__Group_0_1__0__Impl rule__ParticipantDescription__Group_0_1__1 ;
    public final void rule__ParticipantDescription__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4286:1: ( rule__ParticipantDescription__Group_0_1__0__Impl rule__ParticipantDescription__Group_0_1__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4287:2: rule__ParticipantDescription__Group_0_1__0__Impl rule__ParticipantDescription__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__Group_0_1__0__Impl_in_rule__ParticipantDescription__Group_0_1__08692);
            rule__ParticipantDescription__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantDescription__Group_0_1__1_in_rule__ParticipantDescription__Group_0_1__08695);
            rule__ParticipantDescription__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group_0_1__0"


    // $ANTLR start "rule__ParticipantDescription__Group_0_1__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4294:1: rule__ParticipantDescription__Group_0_1__0__Impl : ( ( rule__ParticipantDescription__KindAssignment_0_1_0 ) ) ;
    public final void rule__ParticipantDescription__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4298:1: ( ( ( rule__ParticipantDescription__KindAssignment_0_1_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4299:1: ( ( rule__ParticipantDescription__KindAssignment_0_1_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4299:1: ( ( rule__ParticipantDescription__KindAssignment_0_1_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4300:1: ( rule__ParticipantDescription__KindAssignment_0_1_0 )
            {
             before(grammarAccess.getParticipantDescriptionAccess().getKindAssignment_0_1_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4301:1: ( rule__ParticipantDescription__KindAssignment_0_1_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4301:2: rule__ParticipantDescription__KindAssignment_0_1_0
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__KindAssignment_0_1_0_in_rule__ParticipantDescription__Group_0_1__0__Impl8722);
            rule__ParticipantDescription__KindAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDescriptionAccess().getKindAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group_0_1__0__Impl"


    // $ANTLR start "rule__ParticipantDescription__Group_0_1__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4311:1: rule__ParticipantDescription__Group_0_1__1 : rule__ParticipantDescription__Group_0_1__1__Impl ;
    public final void rule__ParticipantDescription__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4315:1: ( rule__ParticipantDescription__Group_0_1__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4316:2: rule__ParticipantDescription__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__Group_0_1__1__Impl_in_rule__ParticipantDescription__Group_0_1__18752);
            rule__ParticipantDescription__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group_0_1__1"


    // $ANTLR start "rule__ParticipantDescription__Group_0_1__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4322:1: rule__ParticipantDescription__Group_0_1__1__Impl : ( ( rule__ParticipantDescription__TypeAssignment_0_1_1 ) ) ;
    public final void rule__ParticipantDescription__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4326:1: ( ( ( rule__ParticipantDescription__TypeAssignment_0_1_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4327:1: ( ( rule__ParticipantDescription__TypeAssignment_0_1_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4327:1: ( ( rule__ParticipantDescription__TypeAssignment_0_1_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4328:1: ( rule__ParticipantDescription__TypeAssignment_0_1_1 )
            {
             before(grammarAccess.getParticipantDescriptionAccess().getTypeAssignment_0_1_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4329:1: ( rule__ParticipantDescription__TypeAssignment_0_1_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4329:2: rule__ParticipantDescription__TypeAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__ParticipantDescription__TypeAssignment_0_1_1_in_rule__ParticipantDescription__Group_0_1__1__Impl8779);
            rule__ParticipantDescription__TypeAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantDescriptionAccess().getTypeAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__Group_0_1__1__Impl"


    // $ANTLR start "rule__ParticipantCardinality__Group_0__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4343:1: rule__ParticipantCardinality__Group_0__0 : rule__ParticipantCardinality__Group_0__0__Impl rule__ParticipantCardinality__Group_0__1 ;
    public final void rule__ParticipantCardinality__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4347:1: ( rule__ParticipantCardinality__Group_0__0__Impl rule__ParticipantCardinality__Group_0__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4348:2: rule__ParticipantCardinality__Group_0__0__Impl rule__ParticipantCardinality__Group_0__1
            {
            pushFollow(FOLLOW_rule__ParticipantCardinality__Group_0__0__Impl_in_rule__ParticipantCardinality__Group_0__08813);
            rule__ParticipantCardinality__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantCardinality__Group_0__1_in_rule__ParticipantCardinality__Group_0__08816);
            rule__ParticipantCardinality__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinality__Group_0__0"


    // $ANTLR start "rule__ParticipantCardinality__Group_0__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4355:1: rule__ParticipantCardinality__Group_0__0__Impl : ( () ) ;
    public final void rule__ParticipantCardinality__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4359:1: ( ( () ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4360:1: ( () )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4360:1: ( () )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4361:1: ()
            {
             before(grammarAccess.getParticipantCardinalityAccess().getParticipantCardinalityAction_0_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4362:1: ()
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4364:1: 
            {
            }

             after(grammarAccess.getParticipantCardinalityAccess().getParticipantCardinalityAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinality__Group_0__0__Impl"


    // $ANTLR start "rule__ParticipantCardinality__Group_0__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4374:1: rule__ParticipantCardinality__Group_0__1 : rule__ParticipantCardinality__Group_0__1__Impl ;
    public final void rule__ParticipantCardinality__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4378:1: ( rule__ParticipantCardinality__Group_0__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4379:2: rule__ParticipantCardinality__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantCardinality__Group_0__1__Impl_in_rule__ParticipantCardinality__Group_0__18874);
            rule__ParticipantCardinality__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinality__Group_0__1"


    // $ANTLR start "rule__ParticipantCardinality__Group_0__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4385:1: rule__ParticipantCardinality__Group_0__1__Impl : ( ( rule__ParticipantCardinality__CardAllAssignment_0_1 ) ) ;
    public final void rule__ParticipantCardinality__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4389:1: ( ( ( rule__ParticipantCardinality__CardAllAssignment_0_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4390:1: ( ( rule__ParticipantCardinality__CardAllAssignment_0_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4390:1: ( ( rule__ParticipantCardinality__CardAllAssignment_0_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4391:1: ( rule__ParticipantCardinality__CardAllAssignment_0_1 )
            {
             before(grammarAccess.getParticipantCardinalityAccess().getCardAllAssignment_0_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4392:1: ( rule__ParticipantCardinality__CardAllAssignment_0_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4392:2: rule__ParticipantCardinality__CardAllAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ParticipantCardinality__CardAllAssignment_0_1_in_rule__ParticipantCardinality__Group_0__1__Impl8901);
            rule__ParticipantCardinality__CardAllAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityAccess().getCardAllAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinality__Group_0__1__Impl"


    // $ANTLR start "rule__ParticipantCardinalityMinMax__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4406:1: rule__ParticipantCardinalityMinMax__Group__0 : rule__ParticipantCardinalityMinMax__Group__0__Impl rule__ParticipantCardinalityMinMax__Group__1 ;
    public final void rule__ParticipantCardinalityMinMax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4410:1: ( rule__ParticipantCardinalityMinMax__Group__0__Impl rule__ParticipantCardinalityMinMax__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4411:2: rule__ParticipantCardinalityMinMax__Group__0__Impl rule__ParticipantCardinalityMinMax__Group__1
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMinMax__Group__0__Impl_in_rule__ParticipantCardinalityMinMax__Group__08935);
            rule__ParticipantCardinalityMinMax__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantCardinalityMinMax__Group__1_in_rule__ParticipantCardinalityMinMax__Group__08938);
            rule__ParticipantCardinalityMinMax__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMinMax__Group__0"


    // $ANTLR start "rule__ParticipantCardinalityMinMax__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4418:1: rule__ParticipantCardinalityMinMax__Group__0__Impl : ( () ) ;
    public final void rule__ParticipantCardinalityMinMax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4422:1: ( ( () ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4423:1: ( () )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4423:1: ( () )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4424:1: ()
            {
             before(grammarAccess.getParticipantCardinalityMinMaxAccess().getParticipantCardinalityMinMaxAction_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4425:1: ()
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4427:1: 
            {
            }

             after(grammarAccess.getParticipantCardinalityMinMaxAccess().getParticipantCardinalityMinMaxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMinMax__Group__0__Impl"


    // $ANTLR start "rule__ParticipantCardinalityMinMax__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4437:1: rule__ParticipantCardinalityMinMax__Group__1 : rule__ParticipantCardinalityMinMax__Group__1__Impl rule__ParticipantCardinalityMinMax__Group__2 ;
    public final void rule__ParticipantCardinalityMinMax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4441:1: ( rule__ParticipantCardinalityMinMax__Group__1__Impl rule__ParticipantCardinalityMinMax__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4442:2: rule__ParticipantCardinalityMinMax__Group__1__Impl rule__ParticipantCardinalityMinMax__Group__2
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMinMax__Group__1__Impl_in_rule__ParticipantCardinalityMinMax__Group__18996);
            rule__ParticipantCardinalityMinMax__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantCardinalityMinMax__Group__2_in_rule__ParticipantCardinalityMinMax__Group__18999);
            rule__ParticipantCardinalityMinMax__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMinMax__Group__1"


    // $ANTLR start "rule__ParticipantCardinalityMinMax__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4449:1: rule__ParticipantCardinalityMinMax__Group__1__Impl : ( ( rule__ParticipantCardinalityMinMax__MinAssignment_1 )? ) ;
    public final void rule__ParticipantCardinalityMinMax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4453:1: ( ( ( rule__ParticipantCardinalityMinMax__MinAssignment_1 )? ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4454:1: ( ( rule__ParticipantCardinalityMinMax__MinAssignment_1 )? )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4454:1: ( ( rule__ParticipantCardinalityMinMax__MinAssignment_1 )? )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4455:1: ( rule__ParticipantCardinalityMinMax__MinAssignment_1 )?
            {
             before(grammarAccess.getParticipantCardinalityMinMaxAccess().getMinAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4456:1: ( rule__ParticipantCardinalityMinMax__MinAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4456:2: rule__ParticipantCardinalityMinMax__MinAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ParticipantCardinalityMinMax__MinAssignment_1_in_rule__ParticipantCardinalityMinMax__Group__1__Impl9026);
                    rule__ParticipantCardinalityMinMax__MinAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParticipantCardinalityMinMaxAccess().getMinAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMinMax__Group__1__Impl"


    // $ANTLR start "rule__ParticipantCardinalityMinMax__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4466:1: rule__ParticipantCardinalityMinMax__Group__2 : rule__ParticipantCardinalityMinMax__Group__2__Impl ;
    public final void rule__ParticipantCardinalityMinMax__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4470:1: ( rule__ParticipantCardinalityMinMax__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4471:2: rule__ParticipantCardinalityMinMax__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMinMax__Group__2__Impl_in_rule__ParticipantCardinalityMinMax__Group__29057);
            rule__ParticipantCardinalityMinMax__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMinMax__Group__2"


    // $ANTLR start "rule__ParticipantCardinalityMinMax__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4477:1: rule__ParticipantCardinalityMinMax__Group__2__Impl : ( ( rule__ParticipantCardinalityMinMax__MaxAssignment_2 )? ) ;
    public final void rule__ParticipantCardinalityMinMax__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4481:1: ( ( ( rule__ParticipantCardinalityMinMax__MaxAssignment_2 )? ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4482:1: ( ( rule__ParticipantCardinalityMinMax__MaxAssignment_2 )? )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4482:1: ( ( rule__ParticipantCardinalityMinMax__MaxAssignment_2 )? )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4483:1: ( rule__ParticipantCardinalityMinMax__MaxAssignment_2 )?
            {
             before(grammarAccess.getParticipantCardinalityMinMaxAccess().getMaxAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4484:1: ( rule__ParticipantCardinalityMinMax__MaxAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4484:2: rule__ParticipantCardinalityMinMax__MaxAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParticipantCardinalityMinMax__MaxAssignment_2_in_rule__ParticipantCardinalityMinMax__Group__2__Impl9084);
                    rule__ParticipantCardinalityMinMax__MaxAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParticipantCardinalityMinMaxAccess().getMaxAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMinMax__Group__2__Impl"


    // $ANTLR start "rule__ParticipantCardinalityMin__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4500:1: rule__ParticipantCardinalityMin__Group__0 : rule__ParticipantCardinalityMin__Group__0__Impl rule__ParticipantCardinalityMin__Group__1 ;
    public final void rule__ParticipantCardinalityMin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4504:1: ( rule__ParticipantCardinalityMin__Group__0__Impl rule__ParticipantCardinalityMin__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4505:2: rule__ParticipantCardinalityMin__Group__0__Impl rule__ParticipantCardinalityMin__Group__1
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMin__Group__0__Impl_in_rule__ParticipantCardinalityMin__Group__09121);
            rule__ParticipantCardinalityMin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantCardinalityMin__Group__1_in_rule__ParticipantCardinalityMin__Group__09124);
            rule__ParticipantCardinalityMin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMin__Group__0"


    // $ANTLR start "rule__ParticipantCardinalityMin__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4512:1: rule__ParticipantCardinalityMin__Group__0__Impl : ( ( rule__ParticipantCardinalityMin__NameAssignment_0 ) ) ;
    public final void rule__ParticipantCardinalityMin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4516:1: ( ( ( rule__ParticipantCardinalityMin__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4517:1: ( ( rule__ParticipantCardinalityMin__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4517:1: ( ( rule__ParticipantCardinalityMin__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4518:1: ( rule__ParticipantCardinalityMin__NameAssignment_0 )
            {
             before(grammarAccess.getParticipantCardinalityMinAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4519:1: ( rule__ParticipantCardinalityMin__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4519:2: rule__ParticipantCardinalityMin__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMin__NameAssignment_0_in_rule__ParticipantCardinalityMin__Group__0__Impl9151);
            rule__ParticipantCardinalityMin__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityMinAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMin__Group__0__Impl"


    // $ANTLR start "rule__ParticipantCardinalityMin__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4529:1: rule__ParticipantCardinalityMin__Group__1 : rule__ParticipantCardinalityMin__Group__1__Impl ;
    public final void rule__ParticipantCardinalityMin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4533:1: ( rule__ParticipantCardinalityMin__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4534:2: rule__ParticipantCardinalityMin__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMin__Group__1__Impl_in_rule__ParticipantCardinalityMin__Group__19181);
            rule__ParticipantCardinalityMin__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMin__Group__1"


    // $ANTLR start "rule__ParticipantCardinalityMin__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4540:1: rule__ParticipantCardinalityMin__Group__1__Impl : ( ( rule__ParticipantCardinalityMin__MinAssignment_1 ) ) ;
    public final void rule__ParticipantCardinalityMin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4544:1: ( ( ( rule__ParticipantCardinalityMin__MinAssignment_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4545:1: ( ( rule__ParticipantCardinalityMin__MinAssignment_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4545:1: ( ( rule__ParticipantCardinalityMin__MinAssignment_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4546:1: ( rule__ParticipantCardinalityMin__MinAssignment_1 )
            {
             before(grammarAccess.getParticipantCardinalityMinAccess().getMinAssignment_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4547:1: ( rule__ParticipantCardinalityMin__MinAssignment_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4547:2: rule__ParticipantCardinalityMin__MinAssignment_1
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMin__MinAssignment_1_in_rule__ParticipantCardinalityMin__Group__1__Impl9208);
            rule__ParticipantCardinalityMin__MinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityMinAccess().getMinAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMin__Group__1__Impl"


    // $ANTLR start "rule__ParticipantCardinalityMax__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4561:1: rule__ParticipantCardinalityMax__Group__0 : rule__ParticipantCardinalityMax__Group__0__Impl rule__ParticipantCardinalityMax__Group__1 ;
    public final void rule__ParticipantCardinalityMax__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4565:1: ( rule__ParticipantCardinalityMax__Group__0__Impl rule__ParticipantCardinalityMax__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4566:2: rule__ParticipantCardinalityMax__Group__0__Impl rule__ParticipantCardinalityMax__Group__1
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMax__Group__0__Impl_in_rule__ParticipantCardinalityMax__Group__09242);
            rule__ParticipantCardinalityMax__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParticipantCardinalityMax__Group__1_in_rule__ParticipantCardinalityMax__Group__09245);
            rule__ParticipantCardinalityMax__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMax__Group__0"


    // $ANTLR start "rule__ParticipantCardinalityMax__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4573:1: rule__ParticipantCardinalityMax__Group__0__Impl : ( ( rule__ParticipantCardinalityMax__NameAssignment_0 ) ) ;
    public final void rule__ParticipantCardinalityMax__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4577:1: ( ( ( rule__ParticipantCardinalityMax__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4578:1: ( ( rule__ParticipantCardinalityMax__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4578:1: ( ( rule__ParticipantCardinalityMax__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4579:1: ( rule__ParticipantCardinalityMax__NameAssignment_0 )
            {
             before(grammarAccess.getParticipantCardinalityMaxAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4580:1: ( rule__ParticipantCardinalityMax__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4580:2: rule__ParticipantCardinalityMax__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMax__NameAssignment_0_in_rule__ParticipantCardinalityMax__Group__0__Impl9272);
            rule__ParticipantCardinalityMax__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityMaxAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMax__Group__0__Impl"


    // $ANTLR start "rule__ParticipantCardinalityMax__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4590:1: rule__ParticipantCardinalityMax__Group__1 : rule__ParticipantCardinalityMax__Group__1__Impl ;
    public final void rule__ParticipantCardinalityMax__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4594:1: ( rule__ParticipantCardinalityMax__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4595:2: rule__ParticipantCardinalityMax__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMax__Group__1__Impl_in_rule__ParticipantCardinalityMax__Group__19302);
            rule__ParticipantCardinalityMax__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMax__Group__1"


    // $ANTLR start "rule__ParticipantCardinalityMax__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4601:1: rule__ParticipantCardinalityMax__Group__1__Impl : ( ( rule__ParticipantCardinalityMax__Alternatives_1 ) ) ;
    public final void rule__ParticipantCardinalityMax__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4605:1: ( ( ( rule__ParticipantCardinalityMax__Alternatives_1 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4606:1: ( ( rule__ParticipantCardinalityMax__Alternatives_1 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4606:1: ( ( rule__ParticipantCardinalityMax__Alternatives_1 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4607:1: ( rule__ParticipantCardinalityMax__Alternatives_1 )
            {
             before(grammarAccess.getParticipantCardinalityMaxAccess().getAlternatives_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4608:1: ( rule__ParticipantCardinalityMax__Alternatives_1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4608:2: rule__ParticipantCardinalityMax__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ParticipantCardinalityMax__Alternatives_1_in_rule__ParticipantCardinalityMax__Group__1__Impl9329);
            rule__ParticipantCardinalityMax__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getParticipantCardinalityMaxAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMax__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4622:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4626:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4627:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__09363);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group__1_in_rule__Description__Group__09366);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4634:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4638:1: ( ( () ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4639:1: ( () )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4639:1: ( () )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4640:1: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4641:1: ()
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4643:1: 
            {
            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4653:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4657:1: ( rule__Description__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4658:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__19424);
            rule__Description__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4664:1: rule__Description__Group__1__Impl : ( ( rule__Description__Group_1__0 )? ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4668:1: ( ( ( rule__Description__Group_1__0 )? ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4669:1: ( ( rule__Description__Group_1__0 )? )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4669:1: ( ( rule__Description__Group_1__0 )? )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4670:1: ( rule__Description__Group_1__0 )?
            {
             before(grammarAccess.getDescriptionAccess().getGroup_1()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4671:1: ( rule__Description__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4671:2: rule__Description__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Description__Group_1__0_in_rule__Description__Group__1__Impl9451);
                    rule__Description__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDescriptionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group_1__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4685:1: rule__Description__Group_1__0 : rule__Description__Group_1__0__Impl rule__Description__Group_1__1 ;
    public final void rule__Description__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4689:1: ( rule__Description__Group_1__0__Impl rule__Description__Group_1__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4690:2: rule__Description__Group_1__0__Impl rule__Description__Group_1__1
            {
            pushFollow(FOLLOW_rule__Description__Group_1__0__Impl_in_rule__Description__Group_1__09486);
            rule__Description__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group_1__1_in_rule__Description__Group_1__09489);
            rule__Description__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__0"


    // $ANTLR start "rule__Description__Group_1__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4697:1: rule__Description__Group_1__0__Impl : ( ( rule__Description__NameAssignment_1_0 ) ) ;
    public final void rule__Description__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4701:1: ( ( ( rule__Description__NameAssignment_1_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4702:1: ( ( rule__Description__NameAssignment_1_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4702:1: ( ( rule__Description__NameAssignment_1_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4703:1: ( rule__Description__NameAssignment_1_0 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4704:1: ( rule__Description__NameAssignment_1_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4704:2: rule__Description__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Description__NameAssignment_1_0_in_rule__Description__Group_1__0__Impl9516);
            rule__Description__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__0__Impl"


    // $ANTLR start "rule__Description__Group_1__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4714:1: rule__Description__Group_1__1 : rule__Description__Group_1__1__Impl rule__Description__Group_1__2 ;
    public final void rule__Description__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4718:1: ( rule__Description__Group_1__1__Impl rule__Description__Group_1__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4719:2: rule__Description__Group_1__1__Impl rule__Description__Group_1__2
            {
            pushFollow(FOLLOW_rule__Description__Group_1__1__Impl_in_rule__Description__Group_1__19546);
            rule__Description__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group_1__2_in_rule__Description__Group_1__19549);
            rule__Description__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__1"


    // $ANTLR start "rule__Description__Group_1__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4726:1: rule__Description__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Description__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4730:1: ( ( ':' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4731:1: ( ':' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4731:1: ( ':' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4732:1: ':'
            {
             before(grammarAccess.getDescriptionAccess().getColonKeyword_1_1()); 
            match(input,35,FOLLOW_35_in_rule__Description__Group_1__1__Impl9577); 
             after(grammarAccess.getDescriptionAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__1__Impl"


    // $ANTLR start "rule__Description__Group_1__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4745:1: rule__Description__Group_1__2 : rule__Description__Group_1__2__Impl rule__Description__Group_1__3 ;
    public final void rule__Description__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4749:1: ( rule__Description__Group_1__2__Impl rule__Description__Group_1__3 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4750:2: rule__Description__Group_1__2__Impl rule__Description__Group_1__3
            {
            pushFollow(FOLLOW_rule__Description__Group_1__2__Impl_in_rule__Description__Group_1__29608);
            rule__Description__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Description__Group_1__3_in_rule__Description__Group_1__29611);
            rule__Description__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__2"


    // $ANTLR start "rule__Description__Group_1__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4757:1: rule__Description__Group_1__2__Impl : ( ( rule__Description__DescriptionAssignment_1_2 ) ) ;
    public final void rule__Description__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4761:1: ( ( ( rule__Description__DescriptionAssignment_1_2 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4762:1: ( ( rule__Description__DescriptionAssignment_1_2 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4762:1: ( ( rule__Description__DescriptionAssignment_1_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4763:1: ( rule__Description__DescriptionAssignment_1_2 )
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4764:1: ( rule__Description__DescriptionAssignment_1_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4764:2: rule__Description__DescriptionAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Description__DescriptionAssignment_1_2_in_rule__Description__Group_1__2__Impl9638);
            rule__Description__DescriptionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__2__Impl"


    // $ANTLR start "rule__Description__Group_1__3"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4774:1: rule__Description__Group_1__3 : rule__Description__Group_1__3__Impl ;
    public final void rule__Description__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4778:1: ( rule__Description__Group_1__3__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4779:2: rule__Description__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Description__Group_1__3__Impl_in_rule__Description__Group_1__39668);
            rule__Description__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__3"


    // $ANTLR start "rule__Description__Group_1__3__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4785:1: rule__Description__Group_1__3__Impl : ( ';' ) ;
    public final void rule__Description__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4789:1: ( ( ';' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4790:1: ( ';' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4790:1: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4791:1: ';'
            {
             before(grammarAccess.getDescriptionAccess().getSemicolonKeyword_1_3()); 
            match(input,32,FOLLOW_32_in_rule__Description__Group_1__3__Impl9696); 
             after(grammarAccess.getDescriptionAccess().getSemicolonKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_1__3__Impl"


    // $ANTLR start "rule__Goals__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4812:1: rule__Goals__Group__0 : rule__Goals__Group__0__Impl rule__Goals__Group__1 ;
    public final void rule__Goals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4816:1: ( rule__Goals__Group__0__Impl rule__Goals__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4817:2: rule__Goals__Group__0__Impl rule__Goals__Group__1
            {
            pushFollow(FOLLOW_rule__Goals__Group__0__Impl_in_rule__Goals__Group__09735);
            rule__Goals__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goals__Group__1_in_rule__Goals__Group__09738);
            rule__Goals__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__0"


    // $ANTLR start "rule__Goals__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4824:1: rule__Goals__Group__0__Impl : ( ( rule__Goals__NameAssignment_0 ) ) ;
    public final void rule__Goals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4828:1: ( ( ( rule__Goals__NameAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4829:1: ( ( rule__Goals__NameAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4829:1: ( ( rule__Goals__NameAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4830:1: ( rule__Goals__NameAssignment_0 )
            {
             before(grammarAccess.getGoalsAccess().getNameAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4831:1: ( rule__Goals__NameAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4831:2: rule__Goals__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Goals__NameAssignment_0_in_rule__Goals__Group__0__Impl9765);
            rule__Goals__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__0__Impl"


    // $ANTLR start "rule__Goals__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4841:1: rule__Goals__Group__1 : rule__Goals__Group__1__Impl rule__Goals__Group__2 ;
    public final void rule__Goals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4845:1: ( rule__Goals__Group__1__Impl rule__Goals__Group__2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4846:2: rule__Goals__Group__1__Impl rule__Goals__Group__2
            {
            pushFollow(FOLLOW_rule__Goals__Group__1__Impl_in_rule__Goals__Group__19795);
            rule__Goals__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goals__Group__2_in_rule__Goals__Group__19798);
            rule__Goals__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__1"


    // $ANTLR start "rule__Goals__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4853:1: rule__Goals__Group__1__Impl : ( ':' ) ;
    public final void rule__Goals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4857:1: ( ( ':' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4858:1: ( ':' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4858:1: ( ':' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4859:1: ':'
            {
             before(grammarAccess.getGoalsAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__Goals__Group__1__Impl9826); 
             after(grammarAccess.getGoalsAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__1__Impl"


    // $ANTLR start "rule__Goals__Group__2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4872:1: rule__Goals__Group__2 : rule__Goals__Group__2__Impl ;
    public final void rule__Goals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4876:1: ( rule__Goals__Group__2__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4877:2: rule__Goals__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Goals__Group__2__Impl_in_rule__Goals__Group__29857);
            rule__Goals__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__2"


    // $ANTLR start "rule__Goals__Group__2__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4883:1: rule__Goals__Group__2__Impl : ( ( ( rule__Goals__GoalsAssignment_2 ) ) ( ( rule__Goals__GoalsAssignment_2 )* ) ) ;
    public final void rule__Goals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4887:1: ( ( ( ( rule__Goals__GoalsAssignment_2 ) ) ( ( rule__Goals__GoalsAssignment_2 )* ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4888:1: ( ( ( rule__Goals__GoalsAssignment_2 ) ) ( ( rule__Goals__GoalsAssignment_2 )* ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4888:1: ( ( ( rule__Goals__GoalsAssignment_2 ) ) ( ( rule__Goals__GoalsAssignment_2 )* ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4889:1: ( ( rule__Goals__GoalsAssignment_2 ) ) ( ( rule__Goals__GoalsAssignment_2 )* )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4889:1: ( ( rule__Goals__GoalsAssignment_2 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4890:1: ( rule__Goals__GoalsAssignment_2 )
            {
             before(grammarAccess.getGoalsAccess().getGoalsAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4891:1: ( rule__Goals__GoalsAssignment_2 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4891:2: rule__Goals__GoalsAssignment_2
            {
            pushFollow(FOLLOW_rule__Goals__GoalsAssignment_2_in_rule__Goals__Group__2__Impl9886);
            rule__Goals__GoalsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGoalsAccess().getGoalsAssignment_2()); 

            }

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4894:1: ( ( rule__Goals__GoalsAssignment_2 )* )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4895:1: ( rule__Goals__GoalsAssignment_2 )*
            {
             before(grammarAccess.getGoalsAccess().getGoalsAssignment_2()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4896:1: ( rule__Goals__GoalsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4896:2: rule__Goals__GoalsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Goals__GoalsAssignment_2_in_rule__Goals__Group__2__Impl9898);
            	    rule__Goals__GoalsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getGoalsAccess().getGoalsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__Group__2__Impl"


    // $ANTLR start "rule__Goal__Group__0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4913:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4917:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4918:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__09937);
            rule__Goal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__09940);
            rule__Goal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__0"


    // $ANTLR start "rule__Goal__Group__0__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4925:1: rule__Goal__Group__0__Impl : ( ( rule__Goal__GoalAssignment_0 ) ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4929:1: ( ( ( rule__Goal__GoalAssignment_0 ) ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4930:1: ( ( rule__Goal__GoalAssignment_0 ) )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4930:1: ( ( rule__Goal__GoalAssignment_0 ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4931:1: ( rule__Goal__GoalAssignment_0 )
            {
             before(grammarAccess.getGoalAccess().getGoalAssignment_0()); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4932:1: ( rule__Goal__GoalAssignment_0 )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4932:2: rule__Goal__GoalAssignment_0
            {
            pushFollow(FOLLOW_rule__Goal__GoalAssignment_0_in_rule__Goal__Group__0__Impl9967);
            rule__Goal__GoalAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGoalAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__0__Impl"


    // $ANTLR start "rule__Goal__Group__1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4942:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4946:1: ( rule__Goal__Group__1__Impl )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4947:2: rule__Goal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__19997);
            rule__Goal__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__1"


    // $ANTLR start "rule__Goal__Group__1__Impl"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4953:1: rule__Goal__Group__1__Impl : ( ';' ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4957:1: ( ( ';' ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4958:1: ( ';' )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4958:1: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4959:1: ';'
            {
             before(grammarAccess.getGoalAccess().getSemicolonKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Goal__Group__1__Impl10025); 
             after(grammarAccess.getGoalAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__Group__1__Impl"


    // $ANTLR start "rule__Protocol__NameAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4977:1: rule__Protocol__NameAssignment_1 : ( ruleID ) ;
    public final void rule__Protocol__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4981:1: ( ( ruleID ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4982:1: ( ruleID )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4982:1: ( ruleID )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4983:1: ruleID
            {
             before(grammarAccess.getProtocolAccess().getNameIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleID_in_rule__Protocol__NameAssignment_110065);
            ruleID();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getNameIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__NameAssignment_1"


    // $ANTLR start "rule__Protocol__DescriptionAssignment_3"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4992:1: rule__Protocol__DescriptionAssignment_3 : ( ruleDescription ) ;
    public final void rule__Protocol__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4996:1: ( ( ruleDescription ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4997:1: ( ruleDescription )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4997:1: ( ruleDescription )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:4998:1: ruleDescription
            {
             before(grammarAccess.getProtocolAccess().getDescriptionDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__Protocol__DescriptionAssignment_310096);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getDescriptionDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__DescriptionAssignment_3"


    // $ANTLR start "rule__Protocol__GoalsAssignment_4"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5007:1: rule__Protocol__GoalsAssignment_4 : ( ruleGoals ) ;
    public final void rule__Protocol__GoalsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5011:1: ( ( ruleGoals ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5012:1: ( ruleGoals )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5012:1: ( ruleGoals )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5013:1: ruleGoals
            {
             before(grammarAccess.getProtocolAccess().getGoalsGoalsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleGoals_in_rule__Protocol__GoalsAssignment_410127);
            ruleGoals();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getGoalsGoalsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__GoalsAssignment_4"


    // $ANTLR start "rule__Protocol__ParticipantsAssignment_5"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5022:1: rule__Protocol__ParticipantsAssignment_5 : ( ruleParticipants ) ;
    public final void rule__Protocol__ParticipantsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5026:1: ( ( ruleParticipants ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5027:1: ( ruleParticipants )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5027:1: ( ruleParticipants )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5028:1: ruleParticipants
            {
             before(grammarAccess.getProtocolAccess().getParticipantsParticipantsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleParticipants_in_rule__Protocol__ParticipantsAssignment_510158);
            ruleParticipants();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getParticipantsParticipantsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__ParticipantsAssignment_5"


    // $ANTLR start "rule__Protocol__StatesAssignment_6"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5037:1: rule__Protocol__StatesAssignment_6 : ( ruleStates ) ;
    public final void rule__Protocol__StatesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5041:1: ( ( ruleStates ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5042:1: ( ruleStates )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5042:1: ( ruleStates )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5043:1: ruleStates
            {
             before(grammarAccess.getProtocolAccess().getStatesStatesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStates_in_rule__Protocol__StatesAssignment_610189);
            ruleStates();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getStatesStatesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__StatesAssignment_6"


    // $ANTLR start "rule__Protocol__TransitionsAssignment_7"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5052:1: rule__Protocol__TransitionsAssignment_7 : ( ruleTransitions ) ;
    public final void rule__Protocol__TransitionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5056:1: ( ( ruleTransitions ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5057:1: ( ruleTransitions )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5057:1: ( ruleTransitions )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5058:1: ruleTransitions
            {
             before(grammarAccess.getProtocolAccess().getTransitionsTransitionsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleTransitions_in_rule__Protocol__TransitionsAssignment_710220);
            ruleTransitions();

            state._fsp--;

             after(grammarAccess.getProtocolAccess().getTransitionsTransitionsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__TransitionsAssignment_7"


    // $ANTLR start "rule__Transitions__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5067:1: rule__Transitions__NameAssignment_0 : ( ruleTK_TRANSITIONS ) ;
    public final void rule__Transitions__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5071:1: ( ( ruleTK_TRANSITIONS ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5072:1: ( ruleTK_TRANSITIONS )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5072:1: ( ruleTK_TRANSITIONS )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5073:1: ruleTK_TRANSITIONS
            {
             before(grammarAccess.getTransitionsAccess().getNameTK_TRANSITIONSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_TRANSITIONS_in_rule__Transitions__NameAssignment_010251);
            ruleTK_TRANSITIONS();

            state._fsp--;

             after(grammarAccess.getTransitionsAccess().getNameTK_TRANSITIONSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transitions__NameAssignment_0"


    // $ANTLR start "rule__Transitions__TransitionsAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5082:1: rule__Transitions__TransitionsAssignment_2 : ( ruleTransition ) ;
    public final void rule__Transitions__TransitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5086:1: ( ( ruleTransition ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5087:1: ( ruleTransition )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5087:1: ( ruleTransition )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5088:1: ruleTransition
            {
             before(grammarAccess.getTransitionsAccess().getTransitionsTransitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__Transitions__TransitionsAssignment_210282);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionsAccess().getTransitionsTransitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transitions__TransitionsAssignment_2"


    // $ANTLR start "rule__Transition__SourceStateAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5097:1: rule__Transition__SourceStateAssignment_0 : ( ruleStateId ) ;
    public final void rule__Transition__SourceStateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5101:1: ( ( ruleStateId ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5102:1: ( ruleStateId )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5102:1: ( ruleStateId )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5103:1: ruleStateId
            {
             before(grammarAccess.getTransitionAccess().getSourceStateStateIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStateId_in_rule__Transition__SourceStateAssignment_010313);
            ruleStateId();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceStateStateIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceStateAssignment_0"


    // $ANTLR start "rule__Transition__DestinationStateAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5112:1: rule__Transition__DestinationStateAssignment_2 : ( ruleStateId ) ;
    public final void rule__Transition__DestinationStateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5116:1: ( ( ruleStateId ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5117:1: ( ruleStateId )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5117:1: ( ruleStateId )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5118:1: ruleStateId
            {
             before(grammarAccess.getTransitionAccess().getDestinationStateStateIdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateId_in_rule__Transition__DestinationStateAssignment_210344);
            ruleStateId();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getDestinationStateStateIdParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__DestinationStateAssignment_2"


    // $ANTLR start "rule__Transition__TypeAssignment_4"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5127:1: rule__Transition__TypeAssignment_4 : ( ruleTransitionType ) ;
    public final void rule__Transition__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5131:1: ( ( ruleTransitionType ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5132:1: ( ruleTransitionType )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5132:1: ( ruleTransitionType )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5133:1: ruleTransitionType
            {
             before(grammarAccess.getTransitionAccess().getTypeTransitionTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTransitionType_in_rule__Transition__TypeAssignment_410375);
            ruleTransitionType();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTypeTransitionTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TypeAssignment_4"


    // $ANTLR start "rule__TransitionType__TypeAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5142:1: rule__TransitionType__TypeAssignment_0 : ( ruleOccurrence ) ;
    public final void rule__TransitionType__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5146:1: ( ( ruleOccurrence ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5147:1: ( ruleOccurrence )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5147:1: ( ruleOccurrence )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5148:1: ruleOccurrence
            {
             before(grammarAccess.getTransitionTypeAccess().getTypeOccurrenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleOccurrence_in_rule__TransitionType__TypeAssignment_010406);
            ruleOccurrence();

            state._fsp--;

             after(grammarAccess.getTransitionTypeAccess().getTypeOccurrenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionType__TypeAssignment_0"


    // $ANTLR start "rule__TransitionType__TypeAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5157:1: rule__TransitionType__TypeAssignment_1 : ( ruleTimeout ) ;
    public final void rule__TransitionType__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5161:1: ( ( ruleTimeout ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5162:1: ( ruleTimeout )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5162:1: ( ruleTimeout )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5163:1: ruleTimeout
            {
             before(grammarAccess.getTransitionTypeAccess().getTypeTimeoutParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeout_in_rule__TransitionType__TypeAssignment_110437);
            ruleTimeout();

            state._fsp--;

             after(grammarAccess.getTransitionTypeAccess().getTypeTimeoutParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionType__TypeAssignment_1"


    // $ANTLR start "rule__TransitionType__TypeAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5172:1: rule__TransitionType__TypeAssignment_2 : ( ruleImport ) ;
    public final void rule__TransitionType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5176:1: ( ( ruleImport ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5177:1: ( ruleImport )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5177:1: ( ruleImport )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5178:1: ruleImport
            {
             before(grammarAccess.getTransitionTypeAccess().getTypeImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__TransitionType__TypeAssignment_210468);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getTransitionTypeAccess().getTypeImportParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransitionType__TypeAssignment_2"


    // $ANTLR start "rule__Timeout__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5187:1: rule__Timeout__NameAssignment_0 : ( ruleTK_TIMEOUT ) ;
    public final void rule__Timeout__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5191:1: ( ( ruleTK_TIMEOUT ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5192:1: ( ruleTK_TIMEOUT )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5192:1: ( ruleTK_TIMEOUT )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5193:1: ruleTK_TIMEOUT
            {
             before(grammarAccess.getTimeoutAccess().getNameTK_TIMEOUTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_TIMEOUT_in_rule__Timeout__NameAssignment_010499);
            ruleTK_TIMEOUT();

            state._fsp--;

             after(grammarAccess.getTimeoutAccess().getNameTK_TIMEOUTParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timeout__NameAssignment_0"


    // $ANTLR start "rule__Timeout__TimeoutAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5202:1: rule__Timeout__TimeoutAssignment_1 : ( RULE_INTEGER ) ;
    public final void rule__Timeout__TimeoutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5206:1: ( ( RULE_INTEGER ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5207:1: ( RULE_INTEGER )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5207:1: ( RULE_INTEGER )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5208:1: RULE_INTEGER
            {
             before(grammarAccess.getTimeoutAccess().getTimeoutINTEGERTerminalRuleCall_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Timeout__TimeoutAssignment_110530); 
             after(grammarAccess.getTimeoutAccess().getTimeoutINTEGERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Timeout__TimeoutAssignment_1"


    // $ANTLR start "rule__Import__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5217:1: rule__Import__NameAssignment_0 : ( ruleTK_IMPORT ) ;
    public final void rule__Import__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5221:1: ( ( ruleTK_IMPORT ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5222:1: ( ruleTK_IMPORT )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5222:1: ( ruleTK_IMPORT )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5223:1: ruleTK_IMPORT
            {
             before(grammarAccess.getImportAccess().getNameTK_IMPORTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_IMPORT_in_rule__Import__NameAssignment_010561);
            ruleTK_IMPORT();

            state._fsp--;

             after(grammarAccess.getImportAccess().getNameTK_IMPORTParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__NameAssignment_0"


    // $ANTLR start "rule__Import__FileAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5232:1: rule__Import__FileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5236:1: ( ( RULE_STRING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5237:1: ( RULE_STRING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5237:1: ( RULE_STRING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5238:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__FileAssignment_110592); 
             after(grammarAccess.getImportAccess().getFileSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__FileAssignment_1"


    // $ANTLR start "rule__Import__MappingAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5247:1: rule__Import__MappingAssignment_2 : ( ruleMapping ) ;
    public final void rule__Import__MappingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5251:1: ( ( ruleMapping ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5252:1: ( ruleMapping )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5252:1: ( ruleMapping )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5253:1: ruleMapping
            {
             before(grammarAccess.getImportAccess().getMappingMappingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Import__MappingAssignment_210623);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getImportAccess().getMappingMappingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__MappingAssignment_2"


    // $ANTLR start "rule__Mapping__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5262:1: rule__Mapping__NameAssignment_0 : ( ruleTK_MAPPING ) ;
    public final void rule__Mapping__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5266:1: ( ( ruleTK_MAPPING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5267:1: ( ruleTK_MAPPING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5267:1: ( ruleTK_MAPPING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5268:1: ruleTK_MAPPING
            {
             before(grammarAccess.getMappingAccess().getNameTK_MAPPINGParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_MAPPING_in_rule__Mapping__NameAssignment_010654);
            ruleTK_MAPPING();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getNameTK_MAPPINGParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__NameAssignment_0"


    // $ANTLR start "rule__Mapping__MapsAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5277:1: rule__Mapping__MapsAssignment_2 : ( ruleMapFromTo ) ;
    public final void rule__Mapping__MapsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5281:1: ( ( ruleMapFromTo ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5282:1: ( ruleMapFromTo )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5282:1: ( ruleMapFromTo )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5283:1: ruleMapFromTo
            {
             before(grammarAccess.getMappingAccess().getMapsMapFromToParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMapFromTo_in_rule__Mapping__MapsAssignment_210685);
            ruleMapFromTo();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getMapsMapFromToParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__MapsAssignment_2"


    // $ANTLR start "rule__MapFromTo__FromAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5292:1: rule__MapFromTo__FromAssignment_0 : ( ruleParticipantId ) ;
    public final void rule__MapFromTo__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5296:1: ( ( ruleParticipantId ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5297:1: ( ruleParticipantId )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5297:1: ( ruleParticipantId )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5298:1: ruleParticipantId
            {
             before(grammarAccess.getMapFromToAccess().getFromParticipantIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParticipantId_in_rule__MapFromTo__FromAssignment_010716);
            ruleParticipantId();

            state._fsp--;

             after(grammarAccess.getMapFromToAccess().getFromParticipantIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFromTo__FromAssignment_0"


    // $ANTLR start "rule__MapFromTo__ToAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5307:1: rule__MapFromTo__ToAssignment_1 : ( ruleParticipantId ) ;
    public final void rule__MapFromTo__ToAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5311:1: ( ( ruleParticipantId ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5312:1: ( ruleParticipantId )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5312:1: ( ruleParticipantId )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5313:1: ruleParticipantId
            {
             before(grammarAccess.getMapFromToAccess().getToParticipantIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParticipantId_in_rule__MapFromTo__ToAssignment_110747);
            ruleParticipantId();

            state._fsp--;

             after(grammarAccess.getMapFromToAccess().getToParticipantIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapFromTo__ToAssignment_1"


    // $ANTLR start "rule__Trigger__PatternAssignment_1_0_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5322:1: rule__Trigger__PatternAssignment_1_0_0 : ( rulePattern ) ;
    public final void rule__Trigger__PatternAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5326:1: ( ( rulePattern ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5327:1: ( rulePattern )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5327:1: ( rulePattern )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5328:1: rulePattern
            {
             before(grammarAccess.getTriggerAccess().getPatternPatternParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_rulePattern_in_rule__Trigger__PatternAssignment_1_0_010778);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getPatternPatternParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__PatternAssignment_1_0_0"


    // $ANTLR start "rule__Trigger__ContentAssignment_1_0_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5337:1: rule__Trigger__ContentAssignment_1_0_1 : ( ruleContent ) ;
    public final void rule__Trigger__ContentAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5341:1: ( ( ruleContent ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5342:1: ( ruleContent )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5342:1: ( ruleContent )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5343:1: ruleContent
            {
             before(grammarAccess.getTriggerAccess().getContentContentParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleContent_in_rule__Trigger__ContentAssignment_1_0_110809);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getContentContentParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__ContentAssignment_1_0_1"


    // $ANTLR start "rule__Trigger__ContentAssignment_1_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5352:1: rule__Trigger__ContentAssignment_1_1 : ( ruleContent ) ;
    public final void rule__Trigger__ContentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5356:1: ( ( ruleContent ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5357:1: ( ruleContent )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5357:1: ( ruleContent )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5358:1: ruleContent
            {
             before(grammarAccess.getTriggerAccess().getContentContentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleContent_in_rule__Trigger__ContentAssignment_1_110840);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getTriggerAccess().getContentContentParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__ContentAssignment_1_1"


    // $ANTLR start "rule__Pattern__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5367:1: rule__Pattern__NameAssignment_0 : ( ruleTK_TRIGGER ) ;
    public final void rule__Pattern__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5371:1: ( ( ruleTK_TRIGGER ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5372:1: ( ruleTK_TRIGGER )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5372:1: ( ruleTK_TRIGGER )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5373:1: ruleTK_TRIGGER
            {
             before(grammarAccess.getPatternAccess().getNameTK_TRIGGERParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_TRIGGER_in_rule__Pattern__NameAssignment_010871);
            ruleTK_TRIGGER();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getNameTK_TRIGGERParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_0"


    // $ANTLR start "rule__Pattern__PatternAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5382:1: rule__Pattern__PatternAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Pattern__PatternAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5386:1: ( ( RULE_STRING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5387:1: ( RULE_STRING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5387:1: ( RULE_STRING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5388:1: RULE_STRING
            {
             before(grammarAccess.getPatternAccess().getPatternSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Pattern__PatternAssignment_110902); 
             after(grammarAccess.getPatternAccess().getPatternSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__PatternAssignment_1"


    // $ANTLR start "rule__Content__ContentAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5397:1: rule__Content__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Content__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5401:1: ( ( RULE_STRING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5402:1: ( RULE_STRING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5402:1: ( RULE_STRING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5403:1: RULE_STRING
            {
             before(grammarAccess.getContentAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Content__ContentAssignment_110933); 
             after(grammarAccess.getContentAccess().getContentSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Content__ContentAssignment_1"


    // $ANTLR start "rule__Occurrence__ParticipantSourceAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5412:1: rule__Occurrence__ParticipantSourceAssignment_0 : ( ruleParticipantOccurrence ) ;
    public final void rule__Occurrence__ParticipantSourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5416:1: ( ( ruleParticipantOccurrence ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5417:1: ( ruleParticipantOccurrence )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5417:1: ( ruleParticipantOccurrence )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5418:1: ruleParticipantOccurrence
            {
             before(grammarAccess.getOccurrenceAccess().getParticipantSourceParticipantOccurrenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParticipantOccurrence_in_rule__Occurrence__ParticipantSourceAssignment_010964);
            ruleParticipantOccurrence();

            state._fsp--;

             after(grammarAccess.getOccurrenceAccess().getParticipantSourceParticipantOccurrenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__ParticipantSourceAssignment_0"


    // $ANTLR start "rule__Occurrence__DutyAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5427:1: rule__Occurrence__DutyAssignment_2 : ( ruleDuty ) ;
    public final void rule__Occurrence__DutyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5431:1: ( ( ruleDuty ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5432:1: ( ruleDuty )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5432:1: ( ruleDuty )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5433:1: ruleDuty
            {
             before(grammarAccess.getOccurrenceAccess().getDutyDutyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDuty_in_rule__Occurrence__DutyAssignment_210995);
            ruleDuty();

            state._fsp--;

             after(grammarAccess.getOccurrenceAccess().getDutyDutyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__DutyAssignment_2"


    // $ANTLR start "rule__Occurrence__ParticipantDestinationAssignment_4"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5442:1: rule__Occurrence__ParticipantDestinationAssignment_4 : ( ruleParticipantOccurrence ) ;
    public final void rule__Occurrence__ParticipantDestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5446:1: ( ( ruleParticipantOccurrence ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5447:1: ( ruleParticipantOccurrence )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5447:1: ( ruleParticipantOccurrence )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5448:1: ruleParticipantOccurrence
            {
             before(grammarAccess.getOccurrenceAccess().getParticipantDestinationParticipantOccurrenceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParticipantOccurrence_in_rule__Occurrence__ParticipantDestinationAssignment_411026);
            ruleParticipantOccurrence();

            state._fsp--;

             after(grammarAccess.getOccurrenceAccess().getParticipantDestinationParticipantOccurrenceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__ParticipantDestinationAssignment_4"


    // $ANTLR start "rule__Occurrence__TriggerAssignment_5_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5457:1: rule__Occurrence__TriggerAssignment_5_0 : ( ruleTrigger ) ;
    public final void rule__Occurrence__TriggerAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5461:1: ( ( ruleTrigger ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5462:1: ( ruleTrigger )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5462:1: ( ruleTrigger )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5463:1: ruleTrigger
            {
             before(grammarAccess.getOccurrenceAccess().getTriggerTriggerParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleTrigger_in_rule__Occurrence__TriggerAssignment_5_011057);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getOccurrenceAccess().getTriggerTriggerParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Occurrence__TriggerAssignment_5_0"


    // $ANTLR start "rule__Duty__DutytypeAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5472:1: rule__Duty__DutytypeAssignment_0 : ( ruleDutyType ) ;
    public final void rule__Duty__DutytypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5476:1: ( ( ruleDutyType ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5477:1: ( ruleDutyType )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5477:1: ( ruleDutyType )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5478:1: ruleDutyType
            {
             before(grammarAccess.getDutyAccess().getDutytypeDutyTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDutyType_in_rule__Duty__DutytypeAssignment_011088);
            ruleDutyType();

            state._fsp--;

             after(grammarAccess.getDutyAccess().getDutytypeDutyTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duty__DutytypeAssignment_0"


    // $ANTLR start "rule__Duty__DutyAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5487:1: rule__Duty__DutyAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Duty__DutyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5491:1: ( ( RULE_STRING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5492:1: ( RULE_STRING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5492:1: ( RULE_STRING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5493:1: RULE_STRING
            {
             before(grammarAccess.getDutyAccess().getDutySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Duty__DutyAssignment_111119); 
             after(grammarAccess.getDutyAccess().getDutySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duty__DutyAssignment_1"


    // $ANTLR start "rule__DutyType__NameAssignment_1_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5502:1: rule__DutyType__NameAssignment_1_0 : ( ruleTK_EVENT ) ;
    public final void rule__DutyType__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5506:1: ( ( ruleTK_EVENT ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5507:1: ( ruleTK_EVENT )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5507:1: ( ruleTK_EVENT )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5508:1: ruleTK_EVENT
            {
             before(grammarAccess.getDutyTypeAccess().getNameTK_EVENTParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTK_EVENT_in_rule__DutyType__NameAssignment_1_011150);
            ruleTK_EVENT();

            state._fsp--;

             after(grammarAccess.getDutyTypeAccess().getNameTK_EVENTParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__NameAssignment_1_0"


    // $ANTLR start "rule__DutyType__NameAssignment_1_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5517:1: rule__DutyType__NameAssignment_1_1 : ( ruleTK_ACTION ) ;
    public final void rule__DutyType__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5521:1: ( ( ruleTK_ACTION ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5522:1: ( ruleTK_ACTION )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5522:1: ( ruleTK_ACTION )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5523:1: ruleTK_ACTION
            {
             before(grammarAccess.getDutyTypeAccess().getNameTK_ACTIONParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTK_ACTION_in_rule__DutyType__NameAssignment_1_111181);
            ruleTK_ACTION();

            state._fsp--;

             after(grammarAccess.getDutyTypeAccess().getNameTK_ACTIONParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__NameAssignment_1_1"


    // $ANTLR start "rule__DutyType__NameAssignment_1_2_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5532:1: rule__DutyType__NameAssignment_1_2_0 : ( ruleTK_MESSAGE ) ;
    public final void rule__DutyType__NameAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5536:1: ( ( ruleTK_MESSAGE ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5537:1: ( ruleTK_MESSAGE )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5537:1: ( ruleTK_MESSAGE )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5538:1: ruleTK_MESSAGE
            {
             before(grammarAccess.getDutyTypeAccess().getNameTK_MESSAGEParserRuleCall_1_2_0_0()); 
            pushFollow(FOLLOW_ruleTK_MESSAGE_in_rule__DutyType__NameAssignment_1_2_011212);
            ruleTK_MESSAGE();

            state._fsp--;

             after(grammarAccess.getDutyTypeAccess().getNameTK_MESSAGEParserRuleCall_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__NameAssignment_1_2_0"


    // $ANTLR start "rule__DutyType__PerformativeAssignment_1_2_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5547:1: rule__DutyType__PerformativeAssignment_1_2_2 : ( ruleID ) ;
    public final void rule__DutyType__PerformativeAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5551:1: ( ( ruleID ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5552:1: ( ruleID )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5552:1: ( ruleID )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5553:1: ruleID
            {
             before(grammarAccess.getDutyTypeAccess().getPerformativeIDParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_ruleID_in_rule__DutyType__PerformativeAssignment_1_2_211243);
            ruleID();

            state._fsp--;

             after(grammarAccess.getDutyTypeAccess().getPerformativeIDParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DutyType__PerformativeAssignment_1_2_2"


    // $ANTLR start "rule__ParticipantOccurrence__ParticipantSourceAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5562:1: rule__ParticipantOccurrence__ParticipantSourceAssignment_0 : ( ruleParticipantId ) ;
    public final void rule__ParticipantOccurrence__ParticipantSourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5566:1: ( ( ruleParticipantId ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5567:1: ( ruleParticipantId )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5567:1: ( ruleParticipantId )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5568:1: ruleParticipantId
            {
             before(grammarAccess.getParticipantOccurrenceAccess().getParticipantSourceParticipantIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParticipantId_in_rule__ParticipantOccurrence__ParticipantSourceAssignment_011274);
            ruleParticipantId();

            state._fsp--;

             after(grammarAccess.getParticipantOccurrenceAccess().getParticipantSourceParticipantIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__ParticipantSourceAssignment_0"


    // $ANTLR start "rule__ParticipantOccurrence__CardinalityAssignment_1_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5577:1: rule__ParticipantOccurrence__CardinalityAssignment_1_1 : ( RULE_INTEGER ) ;
    public final void rule__ParticipantOccurrence__CardinalityAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5581:1: ( ( RULE_INTEGER ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5582:1: ( RULE_INTEGER )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5582:1: ( RULE_INTEGER )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5583:1: RULE_INTEGER
            {
             before(grammarAccess.getParticipantOccurrenceAccess().getCardinalityINTEGERTerminalRuleCall_1_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__ParticipantOccurrence__CardinalityAssignment_1_111305); 
             after(grammarAccess.getParticipantOccurrenceAccess().getCardinalityINTEGERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantOccurrence__CardinalityAssignment_1_1"


    // $ANTLR start "rule__States__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5592:1: rule__States__NameAssignment_0 : ( ruleTK_STATES ) ;
    public final void rule__States__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5596:1: ( ( ruleTK_STATES ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5597:1: ( ruleTK_STATES )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5597:1: ( ruleTK_STATES )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5598:1: ruleTK_STATES
            {
             before(grammarAccess.getStatesAccess().getNameTK_STATESParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_STATES_in_rule__States__NameAssignment_011336);
            ruleTK_STATES();

            state._fsp--;

             after(grammarAccess.getStatesAccess().getNameTK_STATESParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__NameAssignment_0"


    // $ANTLR start "rule__States__StatesAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5607:1: rule__States__StatesAssignment_2 : ( ruleState ) ;
    public final void rule__States__StatesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5611:1: ( ( ruleState ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5612:1: ( ruleState )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5612:1: ( ruleState )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5613:1: ruleState
            {
             before(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__States__StatesAssignment_211367);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatesAccess().getStatesStateParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__States__StatesAssignment_2"


    // $ANTLR start "rule__State__IdAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5622:1: rule__State__IdAssignment_0 : ( ruleStateId ) ;
    public final void rule__State__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5626:1: ( ( ruleStateId ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5627:1: ( ruleStateId )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5627:1: ( ruleStateId )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5628:1: ruleStateId
            {
             before(grammarAccess.getStateAccess().getIdStateIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStateId_in_rule__State__IdAssignment_011398);
            ruleStateId();

            state._fsp--;

             after(grammarAccess.getStateAccess().getIdStateIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__IdAssignment_0"


    // $ANTLR start "rule__State__TypeAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5637:1: rule__State__TypeAssignment_1 : ( ruleStateType ) ;
    public final void rule__State__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5641:1: ( ( ruleStateType ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5642:1: ( ruleStateType )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5642:1: ( ruleStateType )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5643:1: ruleStateType
            {
             before(grammarAccess.getStateAccess().getTypeStateTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStateType_in_rule__State__TypeAssignment_111429);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTypeStateTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TypeAssignment_1"


    // $ANTLR start "rule__StateId__NameAssignment"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5652:1: rule__StateId__NameAssignment : ( ruleID ) ;
    public final void rule__StateId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5656:1: ( ( ruleID ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5657:1: ( ruleID )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5657:1: ( ruleID )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5658:1: ruleID
            {
             before(grammarAccess.getStateIdAccess().getNameIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleID_in_rule__StateId__NameAssignment11460);
            ruleID();

            state._fsp--;

             after(grammarAccess.getStateIdAccess().getNameIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateId__NameAssignment"


    // $ANTLR start "rule__StateType__InitialAssignment_1_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5667:1: rule__StateType__InitialAssignment_1_0 : ( ruleTK_INITIAL ) ;
    public final void rule__StateType__InitialAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5671:1: ( ( ruleTK_INITIAL ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5672:1: ( ruleTK_INITIAL )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5672:1: ( ruleTK_INITIAL )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5673:1: ruleTK_INITIAL
            {
             before(grammarAccess.getStateTypeAccess().getInitialTK_INITIALParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTK_INITIAL_in_rule__StateType__InitialAssignment_1_011491);
            ruleTK_INITIAL();

            state._fsp--;

             after(grammarAccess.getStateTypeAccess().getInitialTK_INITIALParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__InitialAssignment_1_0"


    // $ANTLR start "rule__StateType__FinalAssignment_1_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5682:1: rule__StateType__FinalAssignment_1_1 : ( ruleTK_FINAL ) ;
    public final void rule__StateType__FinalAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5686:1: ( ( ruleTK_FINAL ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5687:1: ( ruleTK_FINAL )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5687:1: ( ruleTK_FINAL )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5688:1: ruleTK_FINAL
            {
             before(grammarAccess.getStateTypeAccess().getFinalTK_FINALParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTK_FINAL_in_rule__StateType__FinalAssignment_1_111522);
            ruleTK_FINAL();

            state._fsp--;

             after(grammarAccess.getStateTypeAccess().getFinalTK_FINALParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__FinalAssignment_1_1"


    // $ANTLR start "rule__Participants__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5697:1: rule__Participants__NameAssignment_0 : ( ruleTK_PARTICIPANTS ) ;
    public final void rule__Participants__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5701:1: ( ( ruleTK_PARTICIPANTS ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5702:1: ( ruleTK_PARTICIPANTS )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5702:1: ( ruleTK_PARTICIPANTS )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5703:1: ruleTK_PARTICIPANTS
            {
             before(grammarAccess.getParticipantsAccess().getNameTK_PARTICIPANTSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_PARTICIPANTS_in_rule__Participants__NameAssignment_011553);
            ruleTK_PARTICIPANTS();

            state._fsp--;

             after(grammarAccess.getParticipantsAccess().getNameTK_PARTICIPANTSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participants__NameAssignment_0"


    // $ANTLR start "rule__Participants__ParticipantsAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5712:1: rule__Participants__ParticipantsAssignment_2 : ( ruleParticipant ) ;
    public final void rule__Participants__ParticipantsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5716:1: ( ( ruleParticipant ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5717:1: ( ruleParticipant )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5717:1: ( ruleParticipant )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5718:1: ruleParticipant
            {
             before(grammarAccess.getParticipantsAccess().getParticipantsParticipantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParticipant_in_rule__Participants__ParticipantsAssignment_211584);
            ruleParticipant();

            state._fsp--;

             after(grammarAccess.getParticipantsAccess().getParticipantsParticipantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participants__ParticipantsAssignment_2"


    // $ANTLR start "rule__Participant__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5727:1: rule__Participant__NameAssignment_0 : ( ruleParticipantId ) ;
    public final void rule__Participant__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5731:1: ( ( ruleParticipantId ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5732:1: ( ruleParticipantId )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5732:1: ( ruleParticipantId )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5733:1: ruleParticipantId
            {
             before(grammarAccess.getParticipantAccess().getNameParticipantIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleParticipantId_in_rule__Participant__NameAssignment_011615);
            ruleParticipantId();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getNameParticipantIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__NameAssignment_0"


    // $ANTLR start "rule__Participant__ParticipantDescriptionAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5742:1: rule__Participant__ParticipantDescriptionAssignment_1 : ( ruleParticipantDescription ) ;
    public final void rule__Participant__ParticipantDescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5746:1: ( ( ruleParticipantDescription ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5747:1: ( ruleParticipantDescription )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5747:1: ( ruleParticipantDescription )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5748:1: ruleParticipantDescription
            {
             before(grammarAccess.getParticipantAccess().getParticipantDescriptionParticipantDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParticipantDescription_in_rule__Participant__ParticipantDescriptionAssignment_111646);
            ruleParticipantDescription();

            state._fsp--;

             after(grammarAccess.getParticipantAccess().getParticipantDescriptionParticipantDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Participant__ParticipantDescriptionAssignment_1"


    // $ANTLR start "rule__ParticipantId__NameAssignment"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5757:1: rule__ParticipantId__NameAssignment : ( ruleID ) ;
    public final void rule__ParticipantId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5761:1: ( ( ruleID ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5762:1: ( ruleID )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5762:1: ( ruleID )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5763:1: ruleID
            {
             before(grammarAccess.getParticipantIdAccess().getNameIDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleID_in_rule__ParticipantId__NameAssignment11677);
            ruleID();

            state._fsp--;

             after(grammarAccess.getParticipantIdAccess().getNameIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantId__NameAssignment"


    // $ANTLR start "rule__ParticipantDescription__KindAssignment_0_0_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5772:1: rule__ParticipantDescription__KindAssignment_0_0_0 : ( ruleTK_AGENT ) ;
    public final void rule__ParticipantDescription__KindAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5776:1: ( ( ruleTK_AGENT ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5777:1: ( ruleTK_AGENT )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5777:1: ( ruleTK_AGENT )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5778:1: ruleTK_AGENT
            {
             before(grammarAccess.getParticipantDescriptionAccess().getKindTK_AGENTParserRuleCall_0_0_0_0()); 
            pushFollow(FOLLOW_ruleTK_AGENT_in_rule__ParticipantDescription__KindAssignment_0_0_011708);
            ruleTK_AGENT();

            state._fsp--;

             after(grammarAccess.getParticipantDescriptionAccess().getKindTK_AGENTParserRuleCall_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__KindAssignment_0_0_0"


    // $ANTLR start "rule__ParticipantDescription__RoleAssignment_0_0_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5787:1: rule__ParticipantDescription__RoleAssignment_0_0_1 : ( ruleRole ) ;
    public final void rule__ParticipantDescription__RoleAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5791:1: ( ( ruleRole ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5792:1: ( ruleRole )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5792:1: ( ruleRole )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5793:1: ruleRole
            {
             before(grammarAccess.getParticipantDescriptionAccess().getRoleRoleParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__ParticipantDescription__RoleAssignment_0_0_111739);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getParticipantDescriptionAccess().getRoleRoleParserRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__RoleAssignment_0_0_1"


    // $ANTLR start "rule__ParticipantDescription__KindAssignment_0_1_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5802:1: rule__ParticipantDescription__KindAssignment_0_1_0 : ( ruleTK_ARTIFACT ) ;
    public final void rule__ParticipantDescription__KindAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5806:1: ( ( ruleTK_ARTIFACT ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5807:1: ( ruleTK_ARTIFACT )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5807:1: ( ruleTK_ARTIFACT )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5808:1: ruleTK_ARTIFACT
            {
             before(grammarAccess.getParticipantDescriptionAccess().getKindTK_ARTIFACTParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleTK_ARTIFACT_in_rule__ParticipantDescription__KindAssignment_0_1_011770);
            ruleTK_ARTIFACT();

            state._fsp--;

             after(grammarAccess.getParticipantDescriptionAccess().getKindTK_ARTIFACTParserRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__KindAssignment_0_1_0"


    // $ANTLR start "rule__ParticipantDescription__TypeAssignment_0_1_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5817:1: rule__ParticipantDescription__TypeAssignment_0_1_1 : ( ruleType ) ;
    public final void rule__ParticipantDescription__TypeAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5821:1: ( ( ruleType ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5822:1: ( ruleType )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5822:1: ( ruleType )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5823:1: ruleType
            {
             before(grammarAccess.getParticipantDescriptionAccess().getTypeTypeParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__ParticipantDescription__TypeAssignment_0_1_111801);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParticipantDescriptionAccess().getTypeTypeParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__TypeAssignment_0_1_1"


    // $ANTLR start "rule__ParticipantDescription__CardAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5832:1: rule__ParticipantDescription__CardAssignment_1 : ( ruleParticipantCardinality ) ;
    public final void rule__ParticipantDescription__CardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5836:1: ( ( ruleParticipantCardinality ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5837:1: ( ruleParticipantCardinality )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5837:1: ( ruleParticipantCardinality )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5838:1: ruleParticipantCardinality
            {
             before(grammarAccess.getParticipantDescriptionAccess().getCardParticipantCardinalityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParticipantCardinality_in_rule__ParticipantDescription__CardAssignment_111832);
            ruleParticipantCardinality();

            state._fsp--;

             after(grammarAccess.getParticipantDescriptionAccess().getCardParticipantCardinalityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantDescription__CardAssignment_1"


    // $ANTLR start "rule__ParticipantCardinality__CardAllAssignment_0_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5847:1: rule__ParticipantCardinality__CardAllAssignment_0_1 : ( ruleParticipantCardinalityAll ) ;
    public final void rule__ParticipantCardinality__CardAllAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5851:1: ( ( ruleParticipantCardinalityAll ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5852:1: ( ruleParticipantCardinalityAll )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5852:1: ( ruleParticipantCardinalityAll )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5853:1: ruleParticipantCardinalityAll
            {
             before(grammarAccess.getParticipantCardinalityAccess().getCardAllParticipantCardinalityAllParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityAll_in_rule__ParticipantCardinality__CardAllAssignment_0_111863);
            ruleParticipantCardinalityAll();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityAccess().getCardAllParticipantCardinalityAllParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinality__CardAllAssignment_0_1"


    // $ANTLR start "rule__ParticipantCardinality__CardMinMaxAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5862:1: rule__ParticipantCardinality__CardMinMaxAssignment_1 : ( ruleParticipantCardinalityMinMax ) ;
    public final void rule__ParticipantCardinality__CardMinMaxAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5866:1: ( ( ruleParticipantCardinalityMinMax ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5867:1: ( ruleParticipantCardinalityMinMax )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5867:1: ( ruleParticipantCardinalityMinMax )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5868:1: ruleParticipantCardinalityMinMax
            {
             before(grammarAccess.getParticipantCardinalityAccess().getCardMinMaxParticipantCardinalityMinMaxParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMinMax_in_rule__ParticipantCardinality__CardMinMaxAssignment_111894);
            ruleParticipantCardinalityMinMax();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityAccess().getCardMinMaxParticipantCardinalityMinMaxParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinality__CardMinMaxAssignment_1"


    // $ANTLR start "rule__ParticipantCardinalityMinMax__MinAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5877:1: rule__ParticipantCardinalityMinMax__MinAssignment_1 : ( ruleParticipantCardinalityMin ) ;
    public final void rule__ParticipantCardinalityMinMax__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5881:1: ( ( ruleParticipantCardinalityMin ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5882:1: ( ruleParticipantCardinalityMin )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5882:1: ( ruleParticipantCardinalityMin )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5883:1: ruleParticipantCardinalityMin
            {
             before(grammarAccess.getParticipantCardinalityMinMaxAccess().getMinParticipantCardinalityMinParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMin_in_rule__ParticipantCardinalityMinMax__MinAssignment_111925);
            ruleParticipantCardinalityMin();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityMinMaxAccess().getMinParticipantCardinalityMinParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMinMax__MinAssignment_1"


    // $ANTLR start "rule__ParticipantCardinalityMinMax__MaxAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5892:1: rule__ParticipantCardinalityMinMax__MaxAssignment_2 : ( ruleParticipantCardinalityMax ) ;
    public final void rule__ParticipantCardinalityMinMax__MaxAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5896:1: ( ( ruleParticipantCardinalityMax ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5897:1: ( ruleParticipantCardinalityMax )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5897:1: ( ruleParticipantCardinalityMax )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5898:1: ruleParticipantCardinalityMax
            {
             before(grammarAccess.getParticipantCardinalityMinMaxAccess().getMaxParticipantCardinalityMaxParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParticipantCardinalityMax_in_rule__ParticipantCardinalityMinMax__MaxAssignment_211956);
            ruleParticipantCardinalityMax();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityMinMaxAccess().getMaxParticipantCardinalityMaxParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMinMax__MaxAssignment_2"


    // $ANTLR start "rule__ParticipantCardinalityMin__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5907:1: rule__ParticipantCardinalityMin__NameAssignment_0 : ( ruleTK_MIN ) ;
    public final void rule__ParticipantCardinalityMin__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5911:1: ( ( ruleTK_MIN ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5912:1: ( ruleTK_MIN )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5912:1: ( ruleTK_MIN )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5913:1: ruleTK_MIN
            {
             before(grammarAccess.getParticipantCardinalityMinAccess().getNameTK_MINParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_MIN_in_rule__ParticipantCardinalityMin__NameAssignment_011987);
            ruleTK_MIN();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityMinAccess().getNameTK_MINParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMin__NameAssignment_0"


    // $ANTLR start "rule__ParticipantCardinalityMin__MinAssignment_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5922:1: rule__ParticipantCardinalityMin__MinAssignment_1 : ( RULE_INTEGER ) ;
    public final void rule__ParticipantCardinalityMin__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5926:1: ( ( RULE_INTEGER ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5927:1: ( RULE_INTEGER )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5927:1: ( RULE_INTEGER )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5928:1: RULE_INTEGER
            {
             before(grammarAccess.getParticipantCardinalityMinAccess().getMinINTEGERTerminalRuleCall_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__ParticipantCardinalityMin__MinAssignment_112018); 
             after(grammarAccess.getParticipantCardinalityMinAccess().getMinINTEGERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMin__MinAssignment_1"


    // $ANTLR start "rule__ParticipantCardinalityMax__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5937:1: rule__ParticipantCardinalityMax__NameAssignment_0 : ( ruleTK_MAX ) ;
    public final void rule__ParticipantCardinalityMax__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5941:1: ( ( ruleTK_MAX ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5942:1: ( ruleTK_MAX )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5942:1: ( ruleTK_MAX )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5943:1: ruleTK_MAX
            {
             before(grammarAccess.getParticipantCardinalityMaxAccess().getNameTK_MAXParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_MAX_in_rule__ParticipantCardinalityMax__NameAssignment_012049);
            ruleTK_MAX();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityMaxAccess().getNameTK_MAXParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMax__NameAssignment_0"


    // $ANTLR start "rule__ParticipantCardinalityMax__MaxAssignment_1_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5952:1: rule__ParticipantCardinalityMax__MaxAssignment_1_0 : ( RULE_INTEGER ) ;
    public final void rule__ParticipantCardinalityMax__MaxAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5956:1: ( ( RULE_INTEGER ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5957:1: ( RULE_INTEGER )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5957:1: ( RULE_INTEGER )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5958:1: RULE_INTEGER
            {
             before(grammarAccess.getParticipantCardinalityMaxAccess().getMaxINTEGERTerminalRuleCall_1_0_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__ParticipantCardinalityMax__MaxAssignment_1_012080); 
             after(grammarAccess.getParticipantCardinalityMaxAccess().getMaxINTEGERTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMax__MaxAssignment_1_0"


    // $ANTLR start "rule__ParticipantCardinalityMax__Max2Assignment_1_1"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5967:1: rule__ParticipantCardinalityMax__Max2Assignment_1_1 : ( ruleTK_PLUS ) ;
    public final void rule__ParticipantCardinalityMax__Max2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5971:1: ( ( ruleTK_PLUS ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5972:1: ( ruleTK_PLUS )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5972:1: ( ruleTK_PLUS )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5973:1: ruleTK_PLUS
            {
             before(grammarAccess.getParticipantCardinalityMaxAccess().getMax2TK_PLUSParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTK_PLUS_in_rule__ParticipantCardinalityMax__Max2Assignment_1_112111);
            ruleTK_PLUS();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityMaxAccess().getMax2TK_PLUSParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityMax__Max2Assignment_1_1"


    // $ANTLR start "rule__ParticipantCardinalityAll__NameAssignment"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5982:1: rule__ParticipantCardinalityAll__NameAssignment : ( ruleTK_ALL ) ;
    public final void rule__ParticipantCardinalityAll__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5986:1: ( ( ruleTK_ALL ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5987:1: ( ruleTK_ALL )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5987:1: ( ruleTK_ALL )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5988:1: ruleTK_ALL
            {
             before(grammarAccess.getParticipantCardinalityAllAccess().getNameTK_ALLParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTK_ALL_in_rule__ParticipantCardinalityAll__NameAssignment12142);
            ruleTK_ALL();

            state._fsp--;

             after(grammarAccess.getParticipantCardinalityAllAccess().getNameTK_ALLParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParticipantCardinalityAll__NameAssignment"


    // $ANTLR start "rule__Type__TypeAssignment"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:5997:1: rule__Type__TypeAssignment : ( RULE_STRING ) ;
    public final void rule__Type__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6001:1: ( ( RULE_STRING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6002:1: ( RULE_STRING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6002:1: ( RULE_STRING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6003:1: RULE_STRING
            {
             before(grammarAccess.getTypeAccess().getTypeSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Type__TypeAssignment12173); 
             after(grammarAccess.getTypeAccess().getTypeSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment"


    // $ANTLR start "rule__Role__RoleAssignment"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6012:1: rule__Role__RoleAssignment : ( RULE_STRING ) ;
    public final void rule__Role__RoleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6016:1: ( ( RULE_STRING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6017:1: ( RULE_STRING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6017:1: ( RULE_STRING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6018:1: RULE_STRING
            {
             before(grammarAccess.getRoleAccess().getRoleSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Role__RoleAssignment12204); 
             after(grammarAccess.getRoleAccess().getRoleSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__RoleAssignment"


    // $ANTLR start "rule__Description__NameAssignment_1_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6027:1: rule__Description__NameAssignment_1_0 : ( ruleTK_DESCRIPTION ) ;
    public final void rule__Description__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6031:1: ( ( ruleTK_DESCRIPTION ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6032:1: ( ruleTK_DESCRIPTION )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6032:1: ( ruleTK_DESCRIPTION )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6033:1: ruleTK_DESCRIPTION
            {
             before(grammarAccess.getDescriptionAccess().getNameTK_DESCRIPTIONParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleTK_DESCRIPTION_in_rule__Description__NameAssignment_1_012235);
            ruleTK_DESCRIPTION();

            state._fsp--;

             after(grammarAccess.getDescriptionAccess().getNameTK_DESCRIPTIONParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__NameAssignment_1_0"


    // $ANTLR start "rule__Description__DescriptionAssignment_1_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6042:1: rule__Description__DescriptionAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__Description__DescriptionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6046:1: ( ( RULE_STRING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6047:1: ( RULE_STRING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6047:1: ( RULE_STRING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6048:1: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Description__DescriptionAssignment_1_212266); 
             after(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__DescriptionAssignment_1_2"


    // $ANTLR start "rule__Goals__NameAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6057:1: rule__Goals__NameAssignment_0 : ( ruleTK_GOALS ) ;
    public final void rule__Goals__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6061:1: ( ( ruleTK_GOALS ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6062:1: ( ruleTK_GOALS )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6062:1: ( ruleTK_GOALS )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6063:1: ruleTK_GOALS
            {
             before(grammarAccess.getGoalsAccess().getNameTK_GOALSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTK_GOALS_in_rule__Goals__NameAssignment_012297);
            ruleTK_GOALS();

            state._fsp--;

             after(grammarAccess.getGoalsAccess().getNameTK_GOALSParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__NameAssignment_0"


    // $ANTLR start "rule__Goals__GoalsAssignment_2"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6072:1: rule__Goals__GoalsAssignment_2 : ( ruleGoal ) ;
    public final void rule__Goals__GoalsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6076:1: ( ( ruleGoal ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6077:1: ( ruleGoal )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6077:1: ( ruleGoal )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6078:1: ruleGoal
            {
             before(grammarAccess.getGoalsAccess().getGoalsGoalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGoal_in_rule__Goals__GoalsAssignment_212328);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalsAccess().getGoalsGoalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goals__GoalsAssignment_2"


    // $ANTLR start "rule__Goal__GoalAssignment_0"
    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6087:1: rule__Goal__GoalAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Goal__GoalAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6091:1: ( ( RULE_STRING ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6092:1: ( RULE_STRING )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6092:1: ( RULE_STRING )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6093:1: RULE_STRING
            {
             before(grammarAccess.getGoalAccess().getGoalSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Goal__GoalAssignment_012359); 
             after(grammarAccess.getGoalAccess().getGoalSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Goal__GoalAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0_in_ruleProtocol94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitions_in_entryRuleTransitions121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitions128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transitions__Group__0_in_ruleTransitions154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_entryRuleTransitionType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionType__Alternatives_in_ruleTransitionType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeout_in_entryRuleTimeout301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeout308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timeout__Group__0_in_ruleTimeout334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFromTo_in_entryRuleMapFromTo481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapFromTo488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFromTo__Group__0_in_ruleMapFromTo514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__0_in_ruleTrigger574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0_in_rulePattern634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0_in_ruleContent694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOccurrence_in_entryRuleOccurrence721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOccurrence728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__0_in_ruleOccurrence754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuty_in_entryRuleDuty781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDuty788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duty__Group__0_in_ruleDuty814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDutyType_in_entryRuleDutyType841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDutyType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Group__0_in_ruleDutyType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantOccurrence_in_entryRuleParticipantOccurrence901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantOccurrence908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group__0_in_ruleParticipantOccurrence934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_entryRuleStates961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStates968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__0_in_ruleStates994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateId_in_entryRuleStateId1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateId1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateId__NameAssignment_in_ruleStateId1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_entryRuleStateType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__0_in_ruleStateType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipants_in_entryRuleParticipants1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipants1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participants__Group__0_in_ruleParticipants1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__0_in_ruleParticipant1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_entryRuleParticipantId1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantId1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantId__NameAssignment_in_ruleParticipantId1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantDescription_in_entryRuleParticipantDescription1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantDescription1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group__0_in_ruleParticipantDescription1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinality_in_entryRuleParticipantCardinality1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinality1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinality__Alternatives_in_ruleParticipantCardinality1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMinMax_in_entryRuleParticipantCardinalityMinMax1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinalityMinMax1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMinMax__Group__0_in_ruleParticipantCardinalityMinMax1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMin_in_entryRuleParticipantCardinalityMin1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinalityMin1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMin__Group__0_in_ruleParticipantCardinalityMin1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMax_in_entryRuleParticipantCardinalityMax1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinalityMax1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMax__Group__0_in_ruleParticipantCardinalityMax1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityAll_in_entryRuleParticipantCardinalityAll1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipantCardinalityAll1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityAll__NameAssignment_in_ruleParticipantCardinalityAll1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypeAssignment_in_ruleType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__RoleAssignment_in_ruleRole1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0_in_ruleDescription1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoals_in_entryRuleGoals1921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoals1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goals__Group__0_in_ruleGoals1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__0_in_ruleGoal2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PROTOCOL_in_entryRuleTK_PROTOCOL2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_PROTOCOL2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTK_PROTOCOL2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_DESCRIPTION_in_entryRuleTK_DESCRIPTION2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_DESCRIPTION2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTK_DESCRIPTION2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_GOALS_in_entryRuleTK_GOALS2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_GOALS2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTK_GOALS2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PARTICIPANTS_in_entryRuleTK_PARTICIPANTS2227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_PARTICIPANTS2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTK_PARTICIPANTS2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_AGENT_in_entryRuleTK_AGENT2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_AGENT2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTK_AGENT2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ARTIFACT_in_entryRuleTK_ARTIFACT2351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_ARTIFACT2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTK_ARTIFACT2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MAX_in_entryRuleTK_MAX2413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MAX2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTK_MAX2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MIN_in_entryRuleTK_MIN2475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MIN2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTK_MIN2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_STATES_in_entryRuleTK_STATES2537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_STATES2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTK_STATES2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_INITIAL_in_entryRuleTK_INITIAL2599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_INITIAL2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTK_INITIAL2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_FINAL_in_entryRuleTK_FINAL2661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_FINAL2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTK_FINAL2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRANSITIONS_in_entryRuleTK_TRANSITIONS2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_TRANSITIONS2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTK_TRANSITIONS2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TIMEOUT_in_entryRuleTK_TIMEOUT2785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_TIMEOUT2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTK_TIMEOUT2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MESSAGE_in_entryRuleTK_MESSAGE2847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MESSAGE2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTK_MESSAGE2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ACTION_in_entryRuleTK_ACTION2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_ACTION2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTK_ACTION2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_EVENT_in_entryRuleTK_EVENT2971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_EVENT2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTK_EVENT3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRIGGER_in_entryRuleTK_TRIGGER3033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_TRIGGER3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTK_TRIGGER3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_IMPORT_in_entryRuleTK_IMPORT3095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_IMPORT3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleTK_IMPORT3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MAPPING_in_entryRuleTK_MAPPING3157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_MAPPING3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTK_MAPPING3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ALL_in_entryRuleTK_ALL3219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_ALL3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTK_ALL3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PLUS_in_entryRuleTK_PLUS3281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTK_PLUS3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTK_PLUS3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_entryRuleID3343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleID3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_WITH_STARTING_LCLETTER_in_ruleID3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionType__TypeAssignment_0_in_rule__TransitionType__Alternatives3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionType__TypeAssignment_1_in_rule__TransitionType__Alternatives3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionType__TypeAssignment_2_in_rule__TransitionType__Alternatives3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1_0__0_in_rule__Trigger__Alternatives_13480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__ContentAssignment_1_1_in_rule__Trigger__Alternatives_13498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__TriggerAssignment_5_0_in_rule__Occurrence__Alternatives_53533 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_rule__Occurrence__TriggerAssignment_5_0_in_rule__Occurrence__Alternatives_53545 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_32_in_rule__Occurrence__Alternatives_53567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__NameAssignment_1_0_in_rule__DutyType__Alternatives_13601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__NameAssignment_1_1_in_rule__DutyType__Alternatives_13619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Group_1_2__0_in_rule__DutyType__Alternatives_13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__InitialAssignment_1_0_in_rule__StateType__Alternatives_13670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__FinalAssignment_1_1_in_rule__StateType__Alternatives_13688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group_0_0__0_in_rule__ParticipantDescription__Alternatives_03721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group_0_1__0_in_rule__ParticipantDescription__Alternatives_03739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinality__Group_0__0_in_rule__ParticipantCardinality__Alternatives3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinality__CardMinMaxAssignment_1_in_rule__ParticipantCardinality__Alternatives3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMax__MaxAssignment_1_0_in_rule__ParticipantCardinalityMax__Alternatives_13823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMax__Max2Assignment_1_1_in_rule__ParticipantCardinalityMax__Alternatives_13841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__0__Impl_in_rule__Protocol__Group__03872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1_in_rule__Protocol__Group__03875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PROTOCOL_in_rule__Protocol__Group__0__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__1__Impl_in_rule__Protocol__Group__13931 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2_in_rule__Protocol__Group__13934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__NameAssignment_1_in_rule__Protocol__Group__1__Impl3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__2__Impl_in_rule__Protocol__Group__23991 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3_in_rule__Protocol__Group__23994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Protocol__Group__2__Impl4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__3__Impl_in_rule__Protocol__Group__34053 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4_in_rule__Protocol__Group__34056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__DescriptionAssignment_3_in_rule__Protocol__Group__3__Impl4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__4__Impl_in_rule__Protocol__Group__44113 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5_in_rule__Protocol__Group__44116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__GoalsAssignment_4_in_rule__Protocol__Group__4__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__5__Impl_in_rule__Protocol__Group__54173 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__6_in_rule__Protocol__Group__54176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__ParticipantsAssignment_5_in_rule__Protocol__Group__5__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__6__Impl_in_rule__Protocol__Group__64233 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__7_in_rule__Protocol__Group__64236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__StatesAssignment_6_in_rule__Protocol__Group__6__Impl4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__7__Impl_in_rule__Protocol__Group__74293 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Protocol__Group__8_in_rule__Protocol__Group__74296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__TransitionsAssignment_7_in_rule__Protocol__Group__7__Impl4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protocol__Group__8__Impl_in_rule__Protocol__Group__84353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Protocol__Group__8__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transitions__Group__0__Impl_in_rule__Transitions__Group__04430 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Transitions__Group__1_in_rule__Transitions__Group__04433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transitions__NameAssignment_0_in_rule__Transitions__Group__0__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transitions__Group__1__Impl_in_rule__Transitions__Group__14490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transitions__Group__2_in_rule__Transitions__Group__14493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Transitions__Group__1__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transitions__Group__2__Impl_in_rule__Transitions__Group__24552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transitions__TransitionsAssignment_2_in_rule__Transitions__Group__2__Impl4581 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Transitions__TransitionsAssignment_2_in_rule__Transitions__Group__2__Impl4593 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__04632 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__SourceStateAssignment_0_in_rule__Transition__Group__0__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__14692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__14695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Transition__Group__1__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__24754 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__24757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__DestinationStateAssignment_2_in_rule__Transition__Group__2__Impl4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__34814 = new BitSet(new long[]{0x0000000010800010L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__34817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Transition__Group__3__Impl4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__44876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TypeAssignment_4_in_rule__Transition__Group__4__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timeout__Group__0__Impl_in_rule__Timeout__Group__04943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Timeout__Group__1_in_rule__Timeout__Group__04946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timeout__NameAssignment_0_in_rule__Timeout__Group__0__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timeout__Group__1__Impl_in_rule__Timeout__Group__15003 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Timeout__Group__2_in_rule__Timeout__Group__15006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timeout__TimeoutAssignment_1_in_rule__Timeout__Group__1__Impl5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Timeout__Group__2__Impl_in_rule__Timeout__Group__25063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Timeout__Group__2__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__NameAssignment_0_in_rule__Import__Group__0__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15188 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__15191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__FileAssignment_1_in_rule__Import__Group__1__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__25248 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__Import__Group__3_in_rule__Import__Group__25251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__MappingAssignment_2_in_rule__Import__Group__2__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__3__Impl_in_rule__Import__Group__35309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Import__Group__3__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__05376 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__05379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__NameAssignment_0_in_rule__Mapping__Group__0__Impl5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__15436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__15439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Mapping__Group__1__Impl5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__25498 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3_in_rule__Mapping__Group__25501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__MapsAssignment_2_in_rule__Mapping__Group__2__Impl5530 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Mapping__MapsAssignment_2_in_rule__Mapping__Group__2__Impl5542 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Mapping__Group__3__Impl_in_rule__Mapping__Group__35575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Mapping__Group__3__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFromTo__Group__0__Impl_in_rule__MapFromTo__Group__05642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MapFromTo__Group__1_in_rule__MapFromTo__Group__05645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFromTo__FromAssignment_0_in_rule__MapFromTo__Group__0__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFromTo__Group__1__Impl_in_rule__MapFromTo__Group__15702 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MapFromTo__Group__2_in_rule__MapFromTo__Group__15705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFromTo__ToAssignment_1_in_rule__MapFromTo__Group__1__Impl5732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapFromTo__Group__2__Impl_in_rule__MapFromTo__Group__25762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__MapFromTo__Group__2__Impl5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__0__Impl_in_rule__Trigger__Group__05827 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_rule__Trigger__Group__1_in_rule__Trigger__Group__05830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__1__Impl_in_rule__Trigger__Group__15888 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Trigger__Group__2_in_rule__Trigger__Group__15891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Alternatives_1_in_rule__Trigger__Group__1__Impl5918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group__2__Impl_in_rule__Trigger__Group__25948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Trigger__Group__2__Impl5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1_0__0__Impl_in_rule__Trigger__Group_1_0__06013 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1_0__1_in_rule__Trigger__Group_1_0__06016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__PatternAssignment_1_0_0_in_rule__Trigger__Group_1_0__0__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Group_1_0__1__Impl_in_rule__Trigger__Group_1_0__16073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__ContentAssignment_1_0_1_in_rule__Trigger__Group_1_0__1__Impl6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__0__Impl_in_rule__Pattern__Group__06135 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1_in_rule__Pattern__Group__06138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__NameAssignment_0_in_rule__Pattern__Group__0__Impl6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__Group__1__Impl_in_rule__Pattern__Group__16195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pattern__PatternAssignment_1_in_rule__Pattern__Group__1__Impl6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__0__Impl_in_rule__Content__Group__06256 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Content__Group__1_in_rule__Content__Group__06259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Content__Group__0__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__Group__1__Impl_in_rule__Content__Group__16318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Content__ContentAssignment_1_in_rule__Content__Group__1__Impl6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__0__Impl_in_rule__Occurrence__Group__06379 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__1_in_rule__Occurrence__Group__06382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__ParticipantSourceAssignment_0_in_rule__Occurrence__Group__0__Impl6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__1__Impl_in_rule__Occurrence__Group__16439 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__2_in_rule__Occurrence__Group__16442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Occurrence__Group__1__Impl6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__2__Impl_in_rule__Occurrence__Group__26501 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__3_in_rule__Occurrence__Group__26504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__DutyAssignment_2_in_rule__Occurrence__Group__2__Impl6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__3__Impl_in_rule__Occurrence__Group__36561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__4_in_rule__Occurrence__Group__36564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Occurrence__Group__3__Impl6592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__4__Impl_in_rule__Occurrence__Group__46623 = new BitSet(new long[]{0x0000000908000000L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__5_in_rule__Occurrence__Group__46626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__ParticipantDestinationAssignment_4_in_rule__Occurrence__Group__4__Impl6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__Group__5__Impl_in_rule__Occurrence__Group__56683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Occurrence__Alternatives_5_in_rule__Occurrence__Group__5__Impl6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duty__Group__0__Impl_in_rule__Duty__Group__06752 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Duty__Group__1_in_rule__Duty__Group__06755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duty__DutytypeAssignment_0_in_rule__Duty__Group__0__Impl6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duty__Group__1__Impl_in_rule__Duty__Group__16812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Duty__DutyAssignment_1_in_rule__Duty__Group__1__Impl6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Group__0__Impl_in_rule__DutyType__Group__06873 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_rule__DutyType__Group__1_in_rule__DutyType__Group__06876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Group__1__Impl_in_rule__DutyType__Group__16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Alternatives_1_in_rule__DutyType__Group__1__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Group_1_2__0__Impl_in_rule__DutyType__Group_1_2__06995 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DutyType__Group_1_2__1_in_rule__DutyType__Group_1_2__06998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__NameAssignment_1_2_0_in_rule__DutyType__Group_1_2__0__Impl7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Group_1_2__1__Impl_in_rule__DutyType__Group_1_2__17055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DutyType__Group_1_2__2_in_rule__DutyType__Group_1_2__17058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DutyType__Group_1_2__1__Impl7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Group_1_2__2__Impl_in_rule__DutyType__Group_1_2__27117 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DutyType__Group_1_2__3_in_rule__DutyType__Group_1_2__27120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__PerformativeAssignment_1_2_2_in_rule__DutyType__Group_1_2__2__Impl7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DutyType__Group_1_2__3__Impl_in_rule__DutyType__Group_1_2__37177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__DutyType__Group_1_2__3__Impl7205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group__0__Impl_in_rule__ParticipantOccurrence__Group__07244 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group__1_in_rule__ParticipantOccurrence__Group__07247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__ParticipantSourceAssignment_0_in_rule__ParticipantOccurrence__Group__0__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group__1__Impl_in_rule__ParticipantOccurrence__Group__17304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group_1__0_in_rule__ParticipantOccurrence__Group__1__Impl7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group_1__0__Impl_in_rule__ParticipantOccurrence__Group_1__07366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group_1__1_in_rule__ParticipantOccurrence__Group_1__07369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ParticipantOccurrence__Group_1__0__Impl7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group_1__1__Impl_in_rule__ParticipantOccurrence__Group_1__17428 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group_1__2_in_rule__ParticipantOccurrence__Group_1__17431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__CardinalityAssignment_1_1_in_rule__ParticipantOccurrence__Group_1__1__Impl7458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantOccurrence__Group_1__2__Impl_in_rule__ParticipantOccurrence__Group_1__27488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ParticipantOccurrence__Group_1__2__Impl7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__0__Impl_in_rule__States__Group__07553 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__States__Group__1_in_rule__States__Group__07556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__NameAssignment_0_in_rule__States__Group__0__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__1__Impl_in_rule__States__Group__17613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__States__Group__2_in_rule__States__Group__17616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__States__Group__1__Impl7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__Group__2__Impl_in_rule__States__Group__27675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__States__StatesAssignment_2_in_rule__States__Group__2__Impl7704 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__States__StatesAssignment_2_in_rule__States__Group__2__Impl7716 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__07755 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__07758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IdAssignment_0_in_rule__State__Group__0__Impl7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__17815 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__17818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TypeAssignment_1_in_rule__State__Group__1__Impl7845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__27875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__State__Group__2__Impl7903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__0__Impl_in_rule__StateType__Group__07940 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__StateType__Group__1_in_rule__StateType__Group__07943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Group__1__Impl_in_rule__StateType__Group__18001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_1_in_rule__StateType__Group__1__Impl8028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participants__Group__0__Impl_in_rule__Participants__Group__08063 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Participants__Group__1_in_rule__Participants__Group__08066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participants__NameAssignment_0_in_rule__Participants__Group__0__Impl8093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participants__Group__1__Impl_in_rule__Participants__Group__18123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Participants__Group__2_in_rule__Participants__Group__18126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Participants__Group__1__Impl8154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participants__Group__2__Impl_in_rule__Participants__Group__28185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participants__ParticipantsAssignment_2_in_rule__Participants__Group__2__Impl8214 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Participants__ParticipantsAssignment_2_in_rule__Participants__Group__2__Impl8226 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__08265 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__08268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__NameAssignment_0_in_rule__Participant__Group__0__Impl8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__18325 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__18328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__ParticipantDescriptionAssignment_1_in_rule__Participant__Group__1__Impl8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__28385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Participant__Group__2__Impl8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group__0__Impl_in_rule__ParticipantDescription__Group__08450 = new BitSet(new long[]{0x0000000040060000L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group__1_in_rule__ParticipantDescription__Group__08453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Alternatives_0_in_rule__ParticipantDescription__Group__0__Impl8480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group__1__Impl_in_rule__ParticipantDescription__Group__18510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__CardAssignment_1_in_rule__ParticipantDescription__Group__1__Impl8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group_0_0__0__Impl_in_rule__ParticipantDescription__Group_0_0__08571 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group_0_0__1_in_rule__ParticipantDescription__Group_0_0__08574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__KindAssignment_0_0_0_in_rule__ParticipantDescription__Group_0_0__0__Impl8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group_0_0__1__Impl_in_rule__ParticipantDescription__Group_0_0__18631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__RoleAssignment_0_0_1_in_rule__ParticipantDescription__Group_0_0__1__Impl8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group_0_1__0__Impl_in_rule__ParticipantDescription__Group_0_1__08692 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group_0_1__1_in_rule__ParticipantDescription__Group_0_1__08695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__KindAssignment_0_1_0_in_rule__ParticipantDescription__Group_0_1__0__Impl8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__Group_0_1__1__Impl_in_rule__ParticipantDescription__Group_0_1__18752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantDescription__TypeAssignment_0_1_1_in_rule__ParticipantDescription__Group_0_1__1__Impl8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinality__Group_0__0__Impl_in_rule__ParticipantCardinality__Group_0__08813 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ParticipantCardinality__Group_0__1_in_rule__ParticipantCardinality__Group_0__08816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinality__Group_0__1__Impl_in_rule__ParticipantCardinality__Group_0__18874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinality__CardAllAssignment_0_1_in_rule__ParticipantCardinality__Group_0__1__Impl8901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMinMax__Group__0__Impl_in_rule__ParticipantCardinalityMinMax__Group__08935 = new BitSet(new long[]{0x0000000040060000L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMinMax__Group__1_in_rule__ParticipantCardinalityMinMax__Group__08938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMinMax__Group__1__Impl_in_rule__ParticipantCardinalityMinMax__Group__18996 = new BitSet(new long[]{0x0000000040060000L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMinMax__Group__2_in_rule__ParticipantCardinalityMinMax__Group__18999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMinMax__MinAssignment_1_in_rule__ParticipantCardinalityMinMax__Group__1__Impl9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMinMax__Group__2__Impl_in_rule__ParticipantCardinalityMinMax__Group__29057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMinMax__MaxAssignment_2_in_rule__ParticipantCardinalityMinMax__Group__2__Impl9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMin__Group__0__Impl_in_rule__ParticipantCardinalityMin__Group__09121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMin__Group__1_in_rule__ParticipantCardinalityMin__Group__09124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMin__NameAssignment_0_in_rule__ParticipantCardinalityMin__Group__0__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMin__Group__1__Impl_in_rule__ParticipantCardinalityMin__Group__19181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMin__MinAssignment_1_in_rule__ParticipantCardinalityMin__Group__1__Impl9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMax__Group__0__Impl_in_rule__ParticipantCardinalityMax__Group__09242 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMax__Group__1_in_rule__ParticipantCardinalityMax__Group__09245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMax__NameAssignment_0_in_rule__ParticipantCardinalityMax__Group__0__Impl9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMax__Group__1__Impl_in_rule__ParticipantCardinalityMax__Group__19302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParticipantCardinalityMax__Alternatives_1_in_rule__ParticipantCardinalityMax__Group__1__Impl9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__0__Impl_in_rule__Description__Group__09363 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Description__Group__1_in_rule__Description__Group__09366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group__1__Impl_in_rule__Description__Group__19424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group_1__0_in_rule__Description__Group__1__Impl9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group_1__0__Impl_in_rule__Description__Group_1__09486 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Description__Group_1__1_in_rule__Description__Group_1__09489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__NameAssignment_1_0_in_rule__Description__Group_1__0__Impl9516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group_1__1__Impl_in_rule__Description__Group_1__19546 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Description__Group_1__2_in_rule__Description__Group_1__19549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Description__Group_1__1__Impl9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group_1__2__Impl_in_rule__Description__Group_1__29608 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Description__Group_1__3_in_rule__Description__Group_1__29611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__DescriptionAssignment_1_2_in_rule__Description__Group_1__2__Impl9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Description__Group_1__3__Impl_in_rule__Description__Group_1__39668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Description__Group_1__3__Impl9696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goals__Group__0__Impl_in_rule__Goals__Group__09735 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Goals__Group__1_in_rule__Goals__Group__09738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goals__NameAssignment_0_in_rule__Goals__Group__0__Impl9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goals__Group__1__Impl_in_rule__Goals__Group__19795 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Goals__Group__2_in_rule__Goals__Group__19798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Goals__Group__1__Impl9826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goals__Group__2__Impl_in_rule__Goals__Group__29857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goals__GoalsAssignment_2_in_rule__Goals__Group__2__Impl9886 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Goals__GoalsAssignment_2_in_rule__Goals__Group__2__Impl9898 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Goal__Group__0__Impl_in_rule__Goal__Group__09937 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__09940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__GoalAssignment_0_in_rule__Goal__Group__0__Impl9967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__1__Impl_in_rule__Goal__Group__19997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Goal__Group__1__Impl10025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__Protocol__NameAssignment_110065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__Protocol__DescriptionAssignment_310096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoals_in_rule__Protocol__GoalsAssignment_410127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipants_in_rule__Protocol__ParticipantsAssignment_510158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStates_in_rule__Protocol__StatesAssignment_610189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitions_in_rule__Protocol__TransitionsAssignment_710220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRANSITIONS_in_rule__Transitions__NameAssignment_010251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Transitions__TransitionsAssignment_210282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateId_in_rule__Transition__SourceStateAssignment_010313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateId_in_rule__Transition__DestinationStateAssignment_210344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionType_in_rule__Transition__TypeAssignment_410375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOccurrence_in_rule__TransitionType__TypeAssignment_010406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeout_in_rule__TransitionType__TypeAssignment_110437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__TransitionType__TypeAssignment_210468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TIMEOUT_in_rule__Timeout__NameAssignment_010499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Timeout__TimeoutAssignment_110530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_IMPORT_in_rule__Import__NameAssignment_010561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__FileAssignment_110592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Import__MappingAssignment_210623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MAPPING_in_rule__Mapping__NameAssignment_010654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapFromTo_in_rule__Mapping__MapsAssignment_210685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_rule__MapFromTo__FromAssignment_010716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_rule__MapFromTo__ToAssignment_110747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_rule__Trigger__PatternAssignment_1_0_010778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__Trigger__ContentAssignment_1_0_110809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_rule__Trigger__ContentAssignment_1_110840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_TRIGGER_in_rule__Pattern__NameAssignment_010871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Pattern__PatternAssignment_110902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Content__ContentAssignment_110933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantOccurrence_in_rule__Occurrence__ParticipantSourceAssignment_010964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDuty_in_rule__Occurrence__DutyAssignment_210995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantOccurrence_in_rule__Occurrence__ParticipantDestinationAssignment_411026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_rule__Occurrence__TriggerAssignment_5_011057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDutyType_in_rule__Duty__DutytypeAssignment_011088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Duty__DutyAssignment_111119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_EVENT_in_rule__DutyType__NameAssignment_1_011150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ACTION_in_rule__DutyType__NameAssignment_1_111181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MESSAGE_in_rule__DutyType__NameAssignment_1_2_011212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__DutyType__PerformativeAssignment_1_2_211243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_rule__ParticipantOccurrence__ParticipantSourceAssignment_011274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__ParticipantOccurrence__CardinalityAssignment_1_111305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_STATES_in_rule__States__NameAssignment_011336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__States__StatesAssignment_211367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateId_in_rule__State__IdAssignment_011398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__TypeAssignment_111429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__StateId__NameAssignment11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_INITIAL_in_rule__StateType__InitialAssignment_1_011491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_FINAL_in_rule__StateType__FinalAssignment_1_111522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PARTICIPANTS_in_rule__Participants__NameAssignment_011553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_rule__Participants__ParticipantsAssignment_211584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantId_in_rule__Participant__NameAssignment_011615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantDescription_in_rule__Participant__ParticipantDescriptionAssignment_111646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleID_in_rule__ParticipantId__NameAssignment11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_AGENT_in_rule__ParticipantDescription__KindAssignment_0_0_011708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__ParticipantDescription__RoleAssignment_0_0_111739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ARTIFACT_in_rule__ParticipantDescription__KindAssignment_0_1_011770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__ParticipantDescription__TypeAssignment_0_1_111801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinality_in_rule__ParticipantDescription__CardAssignment_111832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityAll_in_rule__ParticipantCardinality__CardAllAssignment_0_111863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMinMax_in_rule__ParticipantCardinality__CardMinMaxAssignment_111894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMin_in_rule__ParticipantCardinalityMinMax__MinAssignment_111925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipantCardinalityMax_in_rule__ParticipantCardinalityMinMax__MaxAssignment_211956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MIN_in_rule__ParticipantCardinalityMin__NameAssignment_011987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__ParticipantCardinalityMin__MinAssignment_112018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_MAX_in_rule__ParticipantCardinalityMax__NameAssignment_012049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__ParticipantCardinalityMax__MaxAssignment_1_012080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_PLUS_in_rule__ParticipantCardinalityMax__Max2Assignment_1_112111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_ALL_in_rule__ParticipantCardinalityAll__NameAssignment12142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Type__TypeAssignment12173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Role__RoleAssignment12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_DESCRIPTION_in_rule__Description__NameAssignment_1_012235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Description__DescriptionAssignment_1_212266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTK_GOALS_in_rule__Goals__NameAssignment_012297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__Goals__GoalsAssignment_212328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Goal__GoalAssignment_012359 = new BitSet(new long[]{0x0000000000000002L});

}