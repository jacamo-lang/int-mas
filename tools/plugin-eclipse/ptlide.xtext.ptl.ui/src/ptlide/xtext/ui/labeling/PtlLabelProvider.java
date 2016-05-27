/*
* generated by Xtext
*/
package ptlide.xtext.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider; 

import ptlide.xtext.ptl.Participant;
import ptlide.xtext.ptl.State;
import ptlide.xtext.ptl.Transition;
 
import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class PtlLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public PtlLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	public String text(Object element) {
		
		if (element instanceof State) {
			return ((State) element).getId().getName();
		} else if (element instanceof Participant) {
			return ((Participant) element).getName().getName();
		} else if (element instanceof Transition) {
			return ((Transition) element).getSourceState().getName() + " - " + ((Transition) element).getDestinationState().getName(); 
		}
		
		return (String) super.text(element);
	}
/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}