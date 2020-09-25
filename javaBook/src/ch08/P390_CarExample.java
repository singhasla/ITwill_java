package ch08;

public class P390_CarExample {

	public static void main(String[] args) {

		P390_Car myCar = new P390_Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new P389_KumhoTire();
		myCar.frontRightTire = new P389_KumhoTire();
		
		myCar.run();
	}

}
