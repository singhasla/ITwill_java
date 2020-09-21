package ch07;

public class P316_Student extends P315_People{

	int studentNo;
	
	public P316_Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
