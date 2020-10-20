package ch12;

public class P547_InterruptExample {

	public static void main(String[] args) {

		Thread thread = new P547_PrintThread2();
		
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		
		thread.interrupt();
	}

}
