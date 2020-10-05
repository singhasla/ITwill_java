package ch09;

public class P439_Q2_Anonymous {

	P439_Q2_Vehicle field = new P439_Q2_Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
		
	};
	
	void method1(){
		P439_Q2_Vehicle localVar = new P439_Q2_Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");		
			}
		};
		
		localVar.run();
		
	}
	
	void method2(P439_Q2_Vehicle v){
		v.run();
	}
}
