package ch04;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

//		if (num / 10 == 0) {
//			// ���ڸ� �����϶�
//			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
//				System.out.print("�ڼ� ¦");
//			} else {
//				System.out.println("�ڼ� ����");
//			}
//
//		} else if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
//			// 30����, 60����, 90���� �ڸ� ����
//			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
//				System.out.println("�ڼ� ¦¦");
//			} else {
//				System.out.println("�ڼ� ¦");
//			}
//		} else {
//			// 30����,60����,90���밡 �ƴ� ���ڸ� ����
//			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
//				System.out.println("�ڼ� ¦");
//			} else {
//				System.out.println("�ڼ� ����");
//			}
//		}

		int count = 0;
		int digit1 = num%10;
		int digit10 = num/10;

		if(digit1 % 3 == 0 && digit1 !=0) count++;
		if(digit10 % 3 == 0 && digit10 !=0)	count++;
		
		if(count == 2) 
			System.out.println("�ڼ� ¦¦");
		else if(count == 1)
			System.out.println("�ڼ� ¦");
		else
			System.out.println("�ڼ� ����");

	}

}
