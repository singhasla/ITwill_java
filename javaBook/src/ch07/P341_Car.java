package ch07;

public class P341_Car {

	//필드
	P340_Tire frontLeftTire = new P340_Tire("앞왼쪽", 6);
	P340_Tire frontRightTire = new P340_Tire("앞오른쪽", 2);
	P340_Tire backLeftTire = new P340_Tire("뒤왼쪽", 3);
	P340_Tire backRightTire = new P340_Tire("뒤오른쪽", 4);
	
	//생성자
	
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false){stop(); return 1;}
		if(frontRightTire.roll()==false){stop(); return 2;}
		if(backLeftTire.roll()==false){stop(); return 3;}
		if(backRightTire.roll()==false){stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
