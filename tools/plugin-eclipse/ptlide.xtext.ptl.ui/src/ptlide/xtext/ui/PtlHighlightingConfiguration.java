package ptlide.xtext.ui;

import static org.eclipse.swt.SWT.NORMAL;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class PtlHighlightingConfiguration implements IHighlightingConfiguration {
	// provide an id string for the highlighting calculator
	public static final String COMMENT_SINGLE = "Comment (single line)"; //Orange
	public static final String COMMENT_MULTI = "Comment (multi line)"; //Dark orange
	public static final String STRING = "String"; //Pink
	public static final String NUMBER = "Number"; //Red
	public static final String SYMBOL = "Symbol"; //Blue (= : ; # { })
	public static final String RESERVED_WORD = "Reserved word"; //Purple
	public static final String KEYWORD = "Keyword"; //Blue
	public static final String PREDEFINED_PARAM = "Predefined param"; //Light purple

	public static final String[] ALL_STRINGS = { COMMENT_SINGLE , COMMENT_MULTI , STRING , NUMBER , SYMBOL , RESERVED_WORD , KEYWORD, PREDEFINED_PARAM };
	
	public static Set<String> ALL_KEYWORDS = new HashSet<String>();
	public static Set<String> ALL_SYMBOLS = new HashSet<String>();
	public static Set<String> ALL_RESERVED_WORDS = new HashSet<String>();
	public static Set<String> ALL_PREDEFINED_PARAMS = new HashSet<String>();
	
	{
		ALL_KEYWORDS.add("protocol");
		ALL_KEYWORDS.add("description");
		ALL_KEYWORDS.add("goals");
		ALL_KEYWORDS.add("participants");
		ALL_KEYWORDS.add("states");
		ALL_KEYWORDS.add("transitions");

		ALL_RESERVED_WORDS.add("timeout");
		ALL_RESERVED_WORDS.add("import");
		ALL_RESERVED_WORDS.add("mapping");
		ALL_RESERVED_WORDS.add("trigger");
		ALL_RESERVED_WORDS.add("max");
		ALL_RESERVED_WORDS.add("min");
		ALL_RESERVED_WORDS.add("event");
		ALL_RESERVED_WORDS.add("action");
		ALL_RESERVED_WORDS.add("message");

		ALL_SYMBOLS.add("{");
		ALL_SYMBOLS.add("}");
		ALL_SYMBOLS.add(":");
		ALL_SYMBOLS.add(";");
		ALL_SYMBOLS.add(",");
		ALL_SYMBOLS.add("->");
		ALL_SYMBOLS.add("-");
		ALL_SYMBOLS.add("--");
		ALL_SYMBOLS.add("#");
		ALL_SYMBOLS.add("[");
		ALL_SYMBOLS.add("]");
		
		ALL_PREDEFINED_PARAMS.add("all");
		ALL_PREDEFINED_PARAMS.add("+");
		ALL_PREDEFINED_PARAMS.add("agent");
		ALL_PREDEFINED_PARAMS.add("artifact");
		ALL_PREDEFINED_PARAMS.add("initial");
		ALL_PREDEFINED_PARAMS.add("final");
		ALL_PREDEFINED_PARAMS.add("tell");
		ALL_PREDEFINED_PARAMS.add("untell");
		ALL_PREDEFINED_PARAMS.add("achieve");
		ALL_PREDEFINED_PARAMS.add("unachieve");
		ALL_PREDEFINED_PARAMS.add("askOne");
		ALL_PREDEFINED_PARAMS.add("askAll");
		ALL_PREDEFINED_PARAMS.add("tellHow");
		ALL_PREDEFINED_PARAMS.add("untellHow");
		ALL_PREDEFINED_PARAMS.add("askHow");
		
	}
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		addType( acceptor, STRING, 255, 0, 204, NORMAL );
		addType( acceptor, COMMENT_SINGLE, 255, 132, 0, NORMAL );
		addType( acceptor, COMMENT_MULTI, 204, 0, 0, NORMAL );
		addType( acceptor, NUMBER, 255, 0, 0, NORMAL );
		addType( acceptor, SYMBOL, 0, 0, 255, NORMAL );
		addType( acceptor, RESERVED_WORD, 0, 139, 0, NORMAL );
		addType( acceptor, KEYWORD, 0, 0, 255, NORMAL );
		addType( acceptor, PREDEFINED_PARAM, 139, 69, 19, NORMAL );
	}
	
	public void addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style) {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(r, g, b));
		textStyle.setStyle(style);
		acceptor.acceptDefaultHighlighting(s, s, textStyle);
	}

}
