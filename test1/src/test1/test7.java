package test1;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �׼��� �Է��Ͻÿ�");
		int money = sc.nextInt();
		// 65377

		int m50000 = money / 50000;
		int m10000 = (money % 50000) / 10000;
		int m5000 = (money % 10000) / 5000;
		int m1000 = (money % 5000) / 1000;
		int m500 = (money % 1000) / 500;
		int m100 = (money % 500) / 100;
		int m50 = (money % 100) / 50;
		int m10 = (money % 50) / 10;
		int m1 = (money % 10) / 1;

		System.out.println("5������ " + m50000 + "��");
		System.out.println("1������ " + m10000 + "��");
		System.out.println("5õ���� " + m5000 + "��");
		System.out.println("1õ���� " + m1000 + "��");
		System.out.println("  500�� " + m500 + "��");
		System.out.println("  100�� " + m100 + "��");
		System.out.println("   50�� " + m50 + "��");
		System.out.println("   10�� " + m10 + "��");
		System.out.println("    1�� " + m1 + "��");

	}

}
