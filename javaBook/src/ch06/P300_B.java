package ch06;

public class P300_B {

	public P300_B() {
		P300_A a = new P300_A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1; private�ʵ� ���� �Ұ�
		
		a.method1();
		a.method2();
		//a.method3(); private�޼ҵ� ���ٺҰ�
	}
}
