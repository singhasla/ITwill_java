package ch07;

public class P352_InstanceofExample {

	public static void method1(P351_Parent parent) {
	
		if(parent instanceof P351_Child) {
			P351_Child child = (P351_Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	
	public static void method2(P351_Parent parent) {
		P351_Child child = (P351_Child) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public class A1 {

	}
	
	public class B1 extends A1{

	}
	
	public class C1 {

	}
	
	public static void main(String[] args) {

		A1 a = new B1();	//��ĳ����
		C1 c = new C1();
		B1 b = new B1();
		
		
		P351_Parent parentA = new P351_Child();
		method1(parentA);
		method2(parentA);
		
		P351_Parent parentB = new P351_Parent();
		method1(parentB);
		method2(parentB);	//���ܹ߻�
		
		
		if( a instanceof A1 ) {System.out.println("��1");}
		else {System.out.println("����");}
		if( c instanceof A1 ) {System.out.println("��2");}
		else {System.out.println("����");}
		if( a instanceof B1 ) {System.out.println("��3");}
		else {System.out.println("����");}
		if( b instanceof A1 ) {System.out.println("��4");}
		else {System.out.println("����");}
		
		
	}

}
