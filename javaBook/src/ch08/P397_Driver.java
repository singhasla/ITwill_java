package ch08;

public class P397_Driver {

	public void drive(P395_Vehicle vehicle) {

		if(vehicle instanceof P395_Bus) {
			P395_Bus bus = (P395_Bus)vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
		
	}

}
