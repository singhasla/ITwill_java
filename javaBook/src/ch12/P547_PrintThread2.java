package ch12;

public class P547_PrintThread2 extends Thread{

	public void run() {
		try {
			
			while(true) {
				System.out.println("실행 중");
				
				//Thread.sleep(1);
				if(Thread.interrupted()) {
					break;
				}
			}
			
		} catch (Exception e) {
			
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
