package ch03;

public class P123_LogicalOperatiorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("�빮�ڱ���");
		}
		
		if((charCode>=97) & (charCode<=122)) {
			System.out.println("�ҹ��ڱ���");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0~9 ���ڱ���");
		}
		
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}

		if((value%2==0) || (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}
	
		//////////////////////////////////////////////
		
		int a = 10;
		int b = 20;
		System.out.println( (a+=10)>15 | (b-=10)>15 );	//�������� true�̶� �������� ������
		System.out.println("a = " + a + ", b = " + b);	//b���� ���
		
		a = 10;
		b = 20;
		System.out.println( (a+=10)>15 || (b-=10)>15 );	//�������� true�̹Ƿ� �ٷ� true ���
		System.out.println("a = " + a + ", b = " + b);	//b�� ������
	}

}
