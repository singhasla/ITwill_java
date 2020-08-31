package test1;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		double avg = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("정수를 입력해주세요");
			int data = sc.nextInt();

			sum += data;
		}

		avg = sum / 5.0;

		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
