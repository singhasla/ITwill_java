package ch12;

public class P550_DaemonExample {

	public static void main(String[] args) {

		P550_AutoSaveThread aST = new P550_AutoSaveThread();
		aST.setDaemon(true);
		aST.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}

}
