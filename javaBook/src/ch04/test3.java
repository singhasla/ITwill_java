package ch04;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("�⵵�� �Է��ϼ���");
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		} else if (year % 100 == 0) {
			System.out.println("����Դϴ�.");
		} else if (year % 4 == 0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
}
