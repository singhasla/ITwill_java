package ch12;

public class P547_PrintThread2 extends Thread{

	public void run() {
		try {
			
			while(true) {
				System.out.println("���� ��");
				
				//Thread.sleep(1);
				if(Thread.interrupted()) {
					break;
				}
			}
			
		} catch (Exception e) {
			
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
