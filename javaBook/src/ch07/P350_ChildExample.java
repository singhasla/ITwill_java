package ch07;

public class P350_ChildExample {

	public static void main(String[] args) {

		P349_Parent parent = new P349_Child();		//�ڵ� Ÿ�� ��ȯ
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2"; //�Ұ���
		 * parent.method3();		//�Ұ���
		 */
		
		P349_Child child = (P349_Child) parent;		//���� Ÿ�� ��ȯ
		child.field2 = "yyy";		//����
		child.method3();			//����
	}

}
