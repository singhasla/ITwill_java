package test1;

public class Test1 {

	public static void main(String[] args) { //���� �޼���
		
		System.out.println("�̽���");
		////////////////////////////////////////////////////////////////////
		
		int count = 100; //��������� ���ÿ� �� ����, --> '�ʱⰪ'�̶�� ��
		count = (int)200.0;
		System.out.println(count);
		
		short data1 = 20;
		count = data1;			//�ڵ� ����ȯ
		
		long longData = count;	//�ڵ� ����ȯ
		
		System.out.println(count);
		System.out.println(longData);
		
		///////////////////////////////////////////////////////////////////
		
		double area;
		area = 0.0;
		area = 100;				//�ڵ� ����ȯ(int(�⺻) => double)
		
		float area2;
		area2 = (float)0.0;		//����� ����ȯ(double(�⺻) => float)
		
		char grade;
		grade = 'A';
		grade = (char)count;	//����� ����ȯ(int => char)
		
		
		int text = 'B';
		System.out.println(text);	// A => 65, B => 66
		
		boolean isEqual;
		isEqual = true;
		
		///////////////////////////////////////////////////
		
		int data2 = 100;
		int data3 = 200;
		int data4 = 50;
		
		int max = (data2>data3)?data2:data3;
		max = (max>data4)?max:data4;
		
		int min = (data2<data3)?data2:data3;
		min = (min<data4)?min:data4;
		
		System.out.println(max);
		System.out.println(min);
		

	}

}