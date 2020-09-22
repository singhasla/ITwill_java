package ch07;

public class P343_CarExample {

	public static void main(String[] args) {

		P341_Car car = new P341_Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();
		
		
		switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new P342_HKTire("�տ���",15);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new P342_KHTire("�տ�����",13);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new P342_HKTire("�ڿ���",14);
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new P342_KHTire("�ڿ�����",17);
				break;
		}
		
		System.out.println("--------------------------------");
		
		}
	}

}
