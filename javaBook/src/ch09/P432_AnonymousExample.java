package ch09;

public class P432_AnonymousExample {

	public static void main(String[] args) {

		P431_Anonymous anony = new P431_Anonymous();
		
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		
		//�͸� ��ü ���� ���� ���
		anony.method1();
		
		//�͸� ��ü �Ű��� ���
		anony.method2(
				new P431_RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("SmartTv�� �մϴ�.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("SmartTv�� ���ϴ�.");
					}
				}
		);
	}

}
