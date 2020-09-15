package ch06;

public class P262_CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car5 myCar = new Car5();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}

}
