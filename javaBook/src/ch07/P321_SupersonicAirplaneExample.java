package ch07;

public class P321_SupersonicAirplaneExample {

	public static void main(String[] args) {

		P320_SupersonicAirplane sa = new P320_SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = P320_SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = P320_SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
