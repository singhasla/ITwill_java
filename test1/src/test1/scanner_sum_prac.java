package test1;

import java.util.Scanner;

public class scanner_sum_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " ��° ������ �Է��� �ּ���.");
			total = total + sc.nextInt();
			
			System.out.println("�� �հ�� " + total);
		}
		//System.out.println("�� �հ�� " + total);

	}

}
