package ch09;

public class P439_Q2_Anonymous {

	P439_Q2_Vehicle field = new P439_Q2_Vehicle() {
		
		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
		}
		
	};
	
	void method1(){
		P439_Q2_Vehicle localVar = new P439_Q2_Vehicle() {
			
			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");		
			}
		};
		
		localVar.run();
		
	}
	
	void method2(P439_Q2_Vehicle v){
		v.run();
	}
}
