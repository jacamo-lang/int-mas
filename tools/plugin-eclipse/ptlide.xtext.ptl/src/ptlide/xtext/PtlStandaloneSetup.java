
package ptlide.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PtlStandaloneSetup extends PtlStandaloneSetupGenerated{

	public static void doSetup() {
		new PtlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

