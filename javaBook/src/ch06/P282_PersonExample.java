package ch06;

public class P282_PersonExample {

	public static void main(String[] args) {
		P281_Person p1 = new P281_Person("123456-1234567", "È«±æµ¿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "È«»ï¿ø";
		System.out.println(p1.name);
	}

}
