// CArtAgO artifact code for project alarmPtl

package artifacts;

import java.util.Random;

import cartago.*;

public class Machine extends Artifact {
	private boolean on = false;
	private boolean busy = false;
	int total = 0;
	
	@OPERATION
	void turnOn() {
		total = 0;
		on = true;
	}
	
	@OPERATION
	void turnOff() {
		on = false;
	}	
	
	@GUARD
	boolean notBusy(int i){
		return !busy;
	}
	
	@OPERATION
	void produce(int i) {
		busy = true;
		total += i;
		busy = false;
		Random random = new Random();
		if (random.nextInt(100) < 30) {
			signal("alarm");
		} else {
			signal(getOpUserId(), "ok");
		}
	}
}

