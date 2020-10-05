package ch09;

public class P428_AnonymousExample {

	public static void main(String[] args) {

		P428_Anonymous anony = new P428_Anonymous();
		
		//�͸� ��ü �ʵ� ���
		anony.field.wake();
		
		//�͸� ��ü ���� ���� ���
		anony.method1();
		
		//�͸� ��ü �Ű��� ���
		anony.method2(

				new P427_Person(){
					void study(){
						System.out.println("�����մϴ�.");
					}
					
					@Override
					void wake(){
						System.out.println("8�ÿ� �Ͼ�ϴ�.");
						study();
					}
				}
		);
		
	}

}