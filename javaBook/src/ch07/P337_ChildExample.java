package ch07;

public class P337_ChildExample {

	public static void main(String[] args) {

		P336_Child child = new P336_Child();
		
		P336_Parent parent = child;	//�ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();		//�����ǵ� �޼ҵ尡 ȣ���
		//parent.method3();		//ȣ�� �Ұ���
		
		
		//////////////////////////////////////////////////
		//parent.age = 9;		//ȣ�� �Ұ���
	}

}
