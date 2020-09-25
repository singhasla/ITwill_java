package ch07;

public abstract class P363_Animal {	//추상클래스

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();	//추상메소드
}
