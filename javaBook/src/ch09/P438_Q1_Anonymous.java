package ch09;

public class P438_Q1_Anonymous {

	P438_Q1_Worker field = new P438_Q1_Worker(){
		
		@Override
		public void start(){
			System.out.println("�������� �մϴ�.");
		}
	};
	
	void method1(){
		P438_Q1_Worker localVar = new P438_Q1_Worker(){
			
			@Override
			public void start(){
				System.out.println("������ �մϴ�.");
			}
		};
				
		localVar.start();
	}
	
	void method2(P438_Q1_Worker worker){
		worker.start();
	}
}
