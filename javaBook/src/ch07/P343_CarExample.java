package ch07;

public class P343_CarExample {

	public static void main(String[] args) {

		P341_Car car = new P341_Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();
		
		
		switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new P342_HKTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new P342_KHTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new P342_HKTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new P342_KHTire("뒤오른쪽",17);
				break;
		}
		
		System.out.println("--------------------------------");
		
		}
	}

}
