package ch06;

public class Test {

	public static void main(String[] args) {
	
		Person p;			//변수 선언
		p = new Person();	//객체 생성
		
		p.address ="부산";
		p.age = 10;
		p.sn = "9001231111111";
		p.name = "홍길동";
		
		System.out.println(p.address);
		System.out.println(p.age);
		System.out.println(p.sn);
		System.out.println(p.name);
		
		
		Person per = new Person();
		System.out.println(per.age);
		
		
		int a;
		a = 100;
		
	}

}
