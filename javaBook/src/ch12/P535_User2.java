package ch12;

public class P535_User2 extends Thread {

	private P534_Calculator cal;

	public void setCal(P534_Calculator cal) {
		this.setName("User2");
		this.cal = cal;
	}

	public void run() {
		cal.setMemory(50);
	}
	
	
}
