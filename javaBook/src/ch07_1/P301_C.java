package ch07_1;

import ch07.P300_A;

public class P301_C {

	public P301_C() {
		P300_A a = new P300_A();
		
		a.field1 = 1;
		//a.field2 = 1;	default�ʵ� ���� �Ұ�
		//a.field3 = 1;	private�ʵ� ���� �Ұ�
		
		a.method1();
		//a.method2();	default�޼ҵ� ���� �Ұ�
		//a.method3();	private�޼ҵ� ���� �Ұ�
	}
}
