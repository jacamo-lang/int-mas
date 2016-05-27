// CArtAgO artifact code for project shoppingPtl2

package artifacts;

import java.util.HashMap;

import cartago.*;

public class EPT extends Artifact {
	private HashMap<String, String> passwords = new HashMap<String, String>();
	
	void init() {
		passwords.put("ana", "xpto12");
		passwords.put("bob", "alpha333");
		
		System.out.println("EPT on");
	}
	
	@LINK
	void askPassword(String agent) {
		System.out.println("Asking password of " + agent);
		//signal(agent, "askPassword");
		//TODO nao dah pra avisar soh um agente, Ana nunca mexe nesse artefato!
		
		signal("askPassword");
	}
	
	@OPERATION
	void password(String password) {
		if (passwords.containsKey(getOpUserName()) && passwords.get(getOpUserName()).equals(password)) {
			signal("successfull");
		}
		failed("invalid_credentials");
	}
}

