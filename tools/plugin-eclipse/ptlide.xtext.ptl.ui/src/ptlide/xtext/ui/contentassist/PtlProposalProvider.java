/*
* generated by Xtext
*/
package ptlide.xtext.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.inject.Inject;

import ptlide.xtext.ui.contentassist.AbstractPtlProposalProvider;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class PtlProposalProvider extends AbstractPtlProposalProvider {
	@Inject private PluginImageHelper imageHelper;
	
	/*
	public void completeParticipantId_Name(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		acceptor.accept(createCompletionProposal("aaaa", "New EnumName", null, context));
		
		System.out.println("aaaaaaaa");
		
	}*/
	/*
	public void complete_ParticipantId(EObject model, Assignment assignment,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		System.out.println("bbbb");
	}	*/
}
