package ch07_1;

import ch07.P300_A;

public class P301_C {

	public P301_C() {
		P300_A a = new P300_A();
		
		a.field1 = 1;
		//a.field2 = 1;	default필드 접근 불가
		//a.field3 = 1;	private필드 접근 불가
		
		a.method1();
		//a.method2();	default메소드 접근 불가
		//a.method3();	private메소드 접근 불가
	}
}
