package ch09;

public class P438_Q1_AnonymousExample {

	public static void main(String[] args) {

		P438_Q1_Anonymous anony = new P438_Q1_Anonymous();
		anony.field.start();
		anony.method1();
		anony.method2(
				new P438_Q1_Worker(){
					@Override
					public void start() {
						System.out.println("테스트를 합니다.");
					}
				}
		);
	}

}
