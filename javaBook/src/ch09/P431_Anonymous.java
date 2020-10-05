package ch09;

public class P431_Anonymous {

	//�ʵ� �ʱⰪ���� ����
	P431_RemoteControl field = new P431_RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1(){
		//���� ���������� ����
		P431_RemoteControl localVar = new P431_RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio�� �մϴ�.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio�� ���ϴ�.");
			}
		};		
		
		//���� ���� ���
		localVar.turnOn();
	}
	
	void method2(P431_RemoteControl rc){
		rc.turnOn();
	}
}
