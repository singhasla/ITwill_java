package ch12;

public class P535_User1 extends Thread {

	private P534_Calculator cal;

	public void setCal(P534_Calculator cal) {
		this.setName("User1");
		this.cal = cal;
	}

	public void run() {
		cal.setMemory(100);
	}
	
	
}
