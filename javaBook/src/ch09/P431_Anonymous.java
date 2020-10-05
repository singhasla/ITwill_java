package ch09;

public class P431_Anonymous {

	//필드 초기값으로 대입
	P431_RemoteControl field = new P431_RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void method1(){
		//로컬 변수값으로 대입
		P431_RemoteControl localVar = new P431_RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};		
		
		//로컬 변수 사용
		localVar.turnOn();
	}
	
	void method2(P431_RemoteControl rc){
		rc.turnOn();
	}
}
