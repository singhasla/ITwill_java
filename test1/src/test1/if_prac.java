package test1;

import java.util.Scanner;

public class if_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("0���� 100������ ������ �Է��ϼ���.");

		int score = sc.nextInt();

		// A 90~100 / B 80~ / C 70~ / D 60~ / F
		while (score < 0 || score > 100) {
			System.out.println("������ 0 ~ 100 ���̷� �ٽ� �Է��� �ּ���.");
			score = sc.nextInt();

			while (score >= 0 && score <= 100) {

				if (score >= 90) {
					System.out.println("A");
				} else if (score >= 80) {
					System.out.println("B");
				} else if (score >= 70) {
					System.out.println("C");
				} else if (score >= 60) {
					System.out.println("D");
				} else {
					System.out.println("F");
				}

				if (score == 101) {
					break;
				}
				score = sc.nextInt();
			}
		}
	}
}
