package test1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double PI = 3.141592; // ��� ���� ���

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �������� �Է��Ͻÿ�");
		int radius = sc.nextInt();

		double area = radius * radius * PI;
		System.out.println("���� ���� : ");
		System.out.println(area);
	}

}
