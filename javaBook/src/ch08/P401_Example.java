package ch08;

public class P401_Example {

	public static void main(String[] args) {

		P400_ImplementationC impl = new P400_ImplementationC();
		
		P400_InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		P400_InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		P400_InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
