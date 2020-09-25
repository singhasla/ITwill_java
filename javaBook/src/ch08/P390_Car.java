package ch08;

public class P390_Car {

	P389_Tire frontLeftTire = new P389_HankookTire();
	P389_Tire frontRightTire = new P389_HankookTire();
	P389_Tire backLeftTire = new P389_HankookTire();
	P389_Tire backRightTire = new P389_HankookTire();
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
