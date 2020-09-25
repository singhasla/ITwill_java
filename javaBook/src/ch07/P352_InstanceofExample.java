package ch07;

public class P352_InstanceofExample {

	public static void method1(P351_Parent parent) {
	
		if(parent instanceof P351_Child) {
			P351_Child child = (P351_Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(P351_Parent parent) {
		P351_Child child = (P351_Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public class A1 {

	}
	
	public class B1 extends A1{

	}
	
	public class C1 {

	}
	
	public static void main(String[] args) {

		A1 a = new B1();	//업캐스팅
		C1 c = new C1();
		B1 b = new B1();
		
		
		P351_Parent parentA = new P351_Child();
		method1(parentA);
		method2(parentA);
		
		P351_Parent parentB = new P351_Parent();
		method1(parentB);
		method2(parentB);	//예외발생
		
		
		if( a instanceof A1 ) {System.out.println("참1");}
		else {System.out.println("거짓");}
		if( c instanceof A1 ) {System.out.println("참2");}
		else {System.out.println("거짓");}
		if( a instanceof B1 ) {System.out.println("참3");}
		else {System.out.println("거짓");}
		if( b instanceof A1 ) {System.out.println("참4");}
		else {System.out.println("거짓");}
		
		
	}

}
