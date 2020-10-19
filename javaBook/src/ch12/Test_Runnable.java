package ch12;

public class Test_Runnable {

	public static void main(String[] args) {

		System.out.println("메인스레드 시작");
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i=0; i<=100; i++) {
					System.out.println("Go_"+i);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<=100; i++) {
					System.out.println("Come_"+i);
				}
			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println("메인스레드 종료");
	}

}
