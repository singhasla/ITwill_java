package ch07;

public class P336_Child extends P336_Parent{
	
	int age;
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}

}
