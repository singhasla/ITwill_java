package ch07;

public class P337_ChildExample {

	public static void main(String[] args) {

		P336_Child child = new P336_Child();
		
		P336_Parent parent = child;	//자동 타입 변환
		parent.method1();
		parent.method2();		//재정의된 메소드가 호출됨
		//parent.method3();		//호출 불가능
		
		
		//////////////////////////////////////////////////
		//parent.age = 9;		//호출 불가능
	}

}
