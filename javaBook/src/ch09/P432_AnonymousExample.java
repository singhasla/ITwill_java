package ch09;

public class P432_AnonymousExample {

	public static void main(String[] args) {

		P431_Anonymous anony = new P431_Anonymous();
		
		//익명 개체 필드 사용
		anony.field.turnOn();
		
		//익명 개체 로컬 변수 사용
		anony.method1();
		
		//익명 개체 매개값 사용
		anony.method2(
				new P431_RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("SmartTv를 켭니다.");
					}
					
					@Override
					public void turnOff() {
						System.out.println("SmartTv를 끕니다.");
					}
				}
		);
	}

}
