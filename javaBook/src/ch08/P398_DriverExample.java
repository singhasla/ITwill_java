package ch08;

public class P398_DriverExample {

	public static void main(String[] args) {

		P397_Driver driver = new P397_Driver();
		
		P395_Bus bus = new P395_Bus();
		P393_Taxi taxi = new P393_Taxi();
		
		driver.drive(bus);
		//driver.drive(taxi);
	}

}
