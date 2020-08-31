package test1;

import java.util.Scanner;

public class if_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("0부터 100사이의 점수를 입력하세요.");

		int score = sc.nextInt();

		// A 90~100 / B 80~ / C 70~ / D 60~ / F
		while (score < 0 || score > 100) {
			System.out.println("점수를 0 ~ 100 사이로 다시 입력해 주세요.");
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
