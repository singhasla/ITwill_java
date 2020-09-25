package ch08;

public class P394_DriverExample {

	public static void main(String[] args) {

		P393_Driver driver = new P393_Driver();
		
		P393_Bus bus = new P393_Bus();
		P393_Taxi taxi = new P393_Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
