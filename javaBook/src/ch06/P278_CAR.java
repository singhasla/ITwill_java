package ch06;

public class P278_CAR {

	int speed;
	
	void run() {
		System.out.println(speed + "km/h 으로 달립니다.");
	}
	
	public static void main(String[] args) {
		
		P278_CAR myCar = new P278_CAR();
		myCar.speed = 60;
		myCar.run();
	}

}
