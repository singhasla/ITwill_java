package ch07;

public class P330_Parent {

	public String nation;
	
	public P330_Parent() {
		this("¥Î«—πŒ±π");
		System.out.println("Parent() call");
	}
	
	public P330_Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
