package ptlide.xtext.ui;


import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import ptlide.xtext.ptl.DutyType;

import static ptlide.xtext.ui.PtlHighlightingConfiguration.*;


public class PtlHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {

		if ( resource == null || resource.getParseResult() == null ) return;
		 
		INode root = resource.getParseResult().getRootNode();
		BidiTreeIterator<INode> it = root.getAsTreeIterable().iterator();
		while (it.hasNext()) {
			INode node = it.next();
			if (node == null) continue;
			
			if (node instanceof HiddenLeafNode && node.getGrammarElement() instanceof TerminalRuleImpl) {
				TerminalRuleImpl ge = (TerminalRuleImpl) node.getGrammarElement();
				
				if (ge.getName().equalsIgnoreCase("SL_COMMENT"))
					setStyle(acceptor, node, COMMENT_SINGLE);
					
				if (ge.getName().equalsIgnoreCase("ML_COMMENT"))
					setStyle(acceptor, node, COMMENT_MULTI);
			} else if (node.getGrammarElement() != null && node.getGrammarElement() instanceof Keyword) {
				Keyword k = (Keyword) node.getGrammarElement();
				if (ALL_KEYWORDS.contains(k.getValue())) {
					setStyle( acceptor, node, KEYWORD);
				} else if (ALL_SYMBOLS.contains(k.getValue())) {
					setStyle( acceptor, node, SYMBOL);
				} else if (ALL_RESERVED_WORDS.contains(k.getValue())) {
					setStyle( acceptor, node, RESERVED_WORD);
				} else if (ALL_PREDEFINED_PARAMS.contains(k.getValue())) {
					setStyle( acceptor, node, PREDEFINED_PARAM);
				} else {
					//System.out.println("" + node.getOffset() + " " + node.getLength() + node.toString() + " ## " + node.getGrammarElement().toString() + " ## " + node.getSemanticElement().toString() + " // ");
				}
			} else if (node instanceof LeafNode && node.getSemanticElement() != null) {
				if (node.getGrammarElement() != null) {
					if (node.getGrammarElement() instanceof RuleCall) {
						RuleCall rc = (RuleCall) node.getGrammarElement();
						
						if (rc.getRule().getName().equals("STRING")) {
							setStyle( acceptor, node, STRING);
						} else if (rc.getRule().getName().equals("INTEGER")) {
							setStyle( acceptor, node, NUMBER);
						} else if (node.getSemanticElement() instanceof DutyType && ALL_PREDEFINED_PARAMS.contains(((DutyType) node.getSemanticElement()).getPerformative()) && node.getText().equals(((DutyType) node.getSemanticElement()).getPerformative())) {
							setStyle( acceptor, node, PREDEFINED_PARAM);
						} else {
							//System.out.println("YY " + node.getOffset() + " " + node.getLength() + node.toString() + " ## " + node.getGrammarElement().toString() + " ## " + node.getSemanticElement().toString() + " // " + rc.getRule().getName());
						}
					} else {
						//System.out.println("XX " + node.getOffset() + " " + node.getLength() + node.toString() + " ## " + node.getGrammarElement().toString() + " ## " + node.getSemanticElement().toString() + " // ");
					}
				}
			} else if (node.getGrammarElement() != null && node.getSemanticElement() != null) {
				//System.out.println("KK " + node.getOffset() + " " + node.getLength() + node.toString() + " ## " + node.getGrammarElement().toString() + " ## " + node.getSemanticElement().toString());
			}
		}
	}
	
	private void setStyle(IHighlightedPositionAcceptor acceptor, INode n, String style) {
		if (n != null) {
			acceptor.addPosition( n.getOffset(), n.getLength(), style );
		}
	}

}
