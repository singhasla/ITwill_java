package ch07;

public class P330_Child extends P330_Parent {

	private String name;
	
	public P330_Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public P330_Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call)");
	}
}
