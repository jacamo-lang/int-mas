package ptlide.xtext.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import ptlide.xtext.ptl.Participant;

public class PtlDeclarativeQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
    QualifiedName qualifiedName(Participant e) {
    	Package p = (Package) e.eContainer();
    	return QualifiedName.create(p.getName(), e.getName().getName());
    }
}
