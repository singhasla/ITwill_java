package ch11;

public class P478_SmartPhone {

	private String company;
	private String os;
	
	public P478_SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return company + ", " + os;
	}
	
	
}
