package ch07;

public class P347_DriverExample {

	public static void main(String[] args) {

		P346_Driver driver = new P346_Driver();
		
		P347_Bus bus = new P347_Bus();
		P347_Taxi taxi = new P347_Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
