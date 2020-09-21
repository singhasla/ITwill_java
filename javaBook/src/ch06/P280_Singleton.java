package ch06;

public class P280_Singleton {

	private static P280_Singleton singleton = new P280_Singleton();
	
	private P280_Singleton() {}
	
	static P280_Singleton getInstance() {
		return singleton;
	}
}
