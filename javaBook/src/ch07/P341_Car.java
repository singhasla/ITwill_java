package ch07;

public class P341_Car {

	//�ʵ�
	P340_Tire frontLeftTire = new P340_Tire("�տ���", 6);
	P340_Tire frontRightTire = new P340_Tire("�տ�����", 2);
	P340_Tire backLeftTire = new P340_Tire("�ڿ���", 3);
	P340_Tire backRightTire = new P340_Tire("�ڿ�����", 4);
	
	//������
	
	//�޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false){stop(); return 1;}
		if(frontRightTire.roll()==false){stop(); return 2;}
		if(backLeftTire.roll()==false){stop(); return 3;}
		if(backRightTire.roll()==false){stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
