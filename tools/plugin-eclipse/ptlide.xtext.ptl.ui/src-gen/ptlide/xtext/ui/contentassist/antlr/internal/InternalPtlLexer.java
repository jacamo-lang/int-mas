package ptlide.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPtlLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ID_WITH_STARTING_LCLETTER=4;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__12=12;
    public static final int T__37=37;
    public static final int T__11=11;
    public static final int T__38=38;
    public static final int T__14=14;
    public static final int T__39=39;
    public static final int T__13=13;
    public static final int RULE_WS=8;
    public static final int RULE_INTEGER=5;
    public static final int RULE_INTEGER_NUMBER=7;

    // delegates
    // delegators

    public InternalPtlLexer() {;} 
    public InternalPtlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPtlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:11:7: ( 'protocol' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:11:9: 'protocol'
            {
            match("protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:12:7: ( 'description' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:12:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:13:7: ( 'goals' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:13:9: 'goals'
            {
            match("goals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:14:7: ( 'participants' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:14:9: 'participants'
            {
            match("participants"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:15:7: ( 'agent' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:15:9: 'agent'
            {
            match("agent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:16:7: ( 'artifact' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:16:9: 'artifact'
            {
            match("artifact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:17:7: ( 'max' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:17:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:18:7: ( 'min' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:18:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:19:7: ( 'states' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:19:9: 'states'
            {
            match("states"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:20:7: ( 'initial' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:20:9: 'initial'
            {
            match("initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:21:7: ( 'final' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:21:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:22:7: ( 'transitions' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:22:9: 'transitions'
            {
            match("transitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:23:7: ( 'timeout' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:23:9: 'timeout'
            {
            match("timeout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:24:7: ( 'message' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:24:9: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:25:7: ( 'action' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:25:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:26:7: ( 'event' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:26:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:27:7: ( 'trigger' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:27:9: 'trigger'
            {
            match("trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:28:7: ( 'import' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:28:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:29:7: ( 'mapping' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:29:9: 'mapping'
            {
            match("mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:30:7: ( 'all' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:30:9: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:31:7: ( '+' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:31:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:32:7: ( ';' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:32:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:33:7: ( '{' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:34:7: ( '}' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:34:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:35:7: ( ':' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:35:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:36:7: ( '-' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:36:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:37:7: ( '#' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:37:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:38:7: ( '--' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:38:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:39:7: ( '->' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:39:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:40:7: ( '[' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:40:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:41:7: ( ']' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:41:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_ID_WITH_STARTING_LCLETTER"
    public final void mRULE_ID_WITH_STARTING_LCLETTER() throws RecognitionException {
        try {
            int _type = RULE_ID_WITH_STARTING_LCLETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6103:32: ( ( '^' )? ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6103:34: ( '^' )? ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6103:34: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6103:34: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6103:54: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID_WITH_STARTING_LCLETTER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6105:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6105:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6105:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6105:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6105:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6107:14: ( RULE_INTEGER_NUMBER )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6107:16: RULE_INTEGER_NUMBER
            {
            mRULE_INTEGER_NUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6109:30: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6109:32: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6109:32: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6109:33: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6109:37: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6109:46: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6109:47: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6111:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6111:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6111:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6113:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6113:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6113:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6113:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6115:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6115:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6115:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6115:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6115:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6115:41: ( '\\r' )? '\\n'
                    {
                    // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6115:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:6115:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    public void mTokens() throws RecognitionException {
        // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID_WITH_STARTING_LCLETTER | RULE_STRING | RULE_INTEGER | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt11=37;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:196: RULE_ID_WITH_STARTING_LCLETTER
                {
                mRULE_ID_WITH_STARTING_LCLETTER(); 

                }
                break;
            case 33 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:227: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:239: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 35 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:252: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:260: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // ../ptlide.xtext.ptl.ui/src-gen/ptlide/xtext/ui/contentassist/antlr/internal/InternalPtl.g:1:276: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\12\24\5\uffff\1\55\10\uffff\22\24\5\uffff\7\24\1\113\1"+
        "\114\1\24\1\116\20\24\2\uffff\1\24\1\uffff\14\24\1\154\1\155\7\24"+
        "\1\165\3\24\1\171\3\24\2\uffff\1\24\1\176\2\24\1\u0081\1\24\1\u0083"+
        "\1\uffff\3\24\1\uffff\4\24\1\uffff\1\u008b\1\u008c\1\uffff\1\u008d"+
        "\1\uffff\1\24\1\u008f\1\u0090\1\u0091\2\24\1\u0094\3\uffff\1\24"+
        "\3\uffff\2\24\1\uffff\5\24\1\u009d\1\u009e\1\u009f\3\uffff";
    static final String DFA11_eofS =
        "\u00a0\uffff";
    static final String DFA11_minS =
        "\1\11\1\141\1\145\1\157\1\143\1\141\1\164\1\155\2\151\1\166\5\uffff"+
        "\1\55\7\uffff\1\52\1\157\1\162\1\163\1\141\1\145\2\164\1\154\1\160"+
        "\1\156\1\163\1\141\1\151\1\160\1\156\1\141\1\155\1\145\5\uffff\2"+
        "\164\1\143\1\154\1\156\2\151\2\60\1\160\1\60\1\163\2\164\1\157\1"+
        "\141\1\156\1\147\1\145\1\156\1\157\1\151\1\162\1\163\1\164\1\146"+
        "\1\157\2\uffff\1\151\1\uffff\1\141\1\145\1\151\1\162\1\154\1\163"+
        "\1\147\1\157\1\164\2\143\1\151\2\60\1\141\2\156\1\147\1\163\1\141"+
        "\1\164\1\60\1\151\1\145\1\165\1\60\1\157\1\151\1\160\2\uffff\1\143"+
        "\1\60\1\147\1\145\1\60\1\154\1\60\1\uffff\1\164\1\162\1\164\1\uffff"+
        "\1\154\1\160\2\164\1\uffff\2\60\1\uffff\1\60\1\uffff\1\151\3\60"+
        "\1\141\1\151\1\60\3\uffff\1\157\3\uffff\1\156\1\157\1\uffff\1\156"+
        "\1\164\1\156\2\163\3\60\3\uffff";
    static final String DFA11_maxS =
        "\1\175\1\162\1\145\1\157\1\162\1\151\1\164\1\156\1\151\1\162\1\166"+
        "\5\uffff\1\76\7\uffff\1\57\1\157\1\162\1\163\1\141\1\145\2\164\1"+
        "\154\1\170\1\156\1\163\1\141\1\151\1\160\1\156\1\151\1\155\1\145"+
        "\5\uffff\2\164\1\143\1\154\1\156\2\151\2\172\1\160\1\172\1\163\2"+
        "\164\1\157\1\141\1\156\1\147\1\145\1\156\1\157\1\151\1\162\1\163"+
        "\1\164\1\146\1\157\2\uffff\1\151\1\uffff\1\141\1\145\1\151\1\162"+
        "\1\154\1\163\1\147\1\157\1\164\2\143\1\151\2\172\1\141\2\156\1\147"+
        "\1\163\1\141\1\164\1\172\1\151\1\145\1\165\1\172\1\157\1\151\1\160"+
        "\2\uffff\1\143\1\172\1\147\1\145\1\172\1\154\1\172\1\uffff\1\164"+
        "\1\162\1\164\1\uffff\1\154\1\160\2\164\1\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\1\151\3\172\1\141\1\151\1\172\3\uffff\1\157\3\uffff\1\156"+
        "\1\157\1\uffff\1\156\1\164\1\156\2\163\3\172\3\uffff";
    static final String DFA11_acceptS =
        "\13\uffff\1\25\1\26\1\27\1\30\1\31\1\uffff\1\33\1\36\1\37\1\40\1"+
        "\41\1\42\1\43\23\uffff\1\34\1\35\1\32\1\44\1\45\33\uffff\1\24\1"+
        "\7\1\uffff\1\10\35\uffff\1\3\1\5\7\uffff\1\13\3\uffff\1\20\4\uffff"+
        "\1\17\2\uffff\1\11\1\uffff\1\22\7\uffff\1\23\1\16\1\12\1\uffff\1"+
        "\21\1\15\1\1\2\uffff\1\6\10\uffff\1\2\1\14\1\4";
    static final String DFA11_specialS =
        "\u00a0\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\27\2\uffff\1\27\22\uffff\1\27\1\uffff\1\25\1\21\7\uffff\1"+
            "\13\1\uffff\1\20\1\uffff\1\30\12\26\1\17\1\14\37\uffff\1\22"+
            "\1\uffff\1\23\2\24\1\uffff\1\4\2\24\1\2\1\12\1\10\1\3\1\24\1"+
            "\7\3\24\1\5\2\24\1\1\2\24\1\6\1\11\6\24\1\15\1\uffff\1\16",
            "\1\32\20\uffff\1\31",
            "\1\33",
            "\1\34",
            "\1\37\3\uffff\1\35\4\uffff\1\40\5\uffff\1\36",
            "\1\41\3\uffff\1\43\3\uffff\1\42",
            "\1\44",
            "\1\46\1\45",
            "\1\47",
            "\1\51\10\uffff\1\50",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "\1\53\20\uffff\1\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56\4\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\71\7\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\7\uffff\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\115",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\1\175",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\177",
            "\1\u0080",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0082",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\u008e",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\u0092",
            "\1\u0093",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "",
            "\1\u0095",
            "",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID_WITH_STARTING_LCLETTER | RULE_STRING | RULE_INTEGER | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );";
        }
    }
 

}