package ch06;

public class Test {

	public static void main(String[] args) {
	
		Person p;			//���� ����
		p = new Person();	//��ü ����
		
		p.address ="�λ�";
		p.age = 10;
		p.sn = "9001231111111";
		p.name = "ȫ�浿";
		
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
