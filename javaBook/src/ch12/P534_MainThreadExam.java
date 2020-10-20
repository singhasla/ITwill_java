package ch12;

public class P534_MainThreadExam {

	public static void main(String[] args) {

		P534_Calculator cal = new P534_Calculator();
		
		P535_User1 user1 = new P535_User1();
		P535_User2 user2 = new P535_User2();
		
		user1.setCal(cal);
		user2.setCal(cal);
		
		user1.start();
		user2.start();
	}

}
