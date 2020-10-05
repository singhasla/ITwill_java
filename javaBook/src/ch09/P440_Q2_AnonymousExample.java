package ch09;

public class P440_Q2_AnonymousExample {

	public static void main(String[] args) {

		P439_Q2_Anonymous anony = new P439_Q2_Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
				new P439_Q2_Vehicle() {
					
					@Override
					public void run() {
						System.out.println("트럭이 달립니다.");
					}
				}
		);
	}

}
