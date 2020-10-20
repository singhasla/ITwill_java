package ch12;

import java.util.Date;

public class Test_TimerEx {

	public static void main(String[] args) {

		System.out.println("메인 시작");
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=1;i<=10;i++) {
					Date date = new Date();
					
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(date);
				}
			}
		});
		
		t.start();
		
		System.out.println("메인 종료");
	}

}
