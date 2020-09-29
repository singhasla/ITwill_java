package ch08;

public class P396_VehicleExample {

	public static void main(String[] args) {

		P395_Vehicle vehicle = new P395_Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		
		P395_Bus bus = (P395_Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
