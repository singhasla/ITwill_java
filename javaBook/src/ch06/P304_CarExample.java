package ch06;

public class P304_CarExample {

	public static void main(String[] args) {

		P304_Car myCar = new P304_Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}

}
