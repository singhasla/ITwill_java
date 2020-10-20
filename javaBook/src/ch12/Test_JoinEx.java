package ch12;

public class Test_JoinEx extends Thread{

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName() + "����");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i=1;i<=10;i++) {
					System.out.println(Thread.currentThread().getName() + " Go");
					try {Thread.sleep(1000);} catch (InterruptedException e) {
						
					}
				}
			}}, "������1");
		t1.setDaemon(true);
		t1.start();

		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i=1;i<=10;i++) {
					System.out.println(Thread.currentThread().getName() + "Come");
					try {Thread.sleep(1000);} catch (InterruptedException e) {
						
					}
				}
			}}, "������2");
		t2.setDaemon(true);
		t2.start();
		
		
		
		/*
		try {
			t1.join();	//t1 �����尡 ���������� main����
		} catch (InterruptedException e) {
			
		}
		*/
		
		System.out.println(Thread.currentThread().getName() + " ����");
	}

}
