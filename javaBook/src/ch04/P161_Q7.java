package ch04;

import java.util.Scanner;

public class P161_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");

			int money = 0;

			String select = sc.next();

			switch (select) {
			case "1":
				System.out.println("예금액>");
				money = sc.nextInt();
				balance = balance + money;
				break;
			case "2":
				System.out.println("출금액>");
				money = sc.nextInt();
				balance = balance - money;
				break;
			case "3":
				System.out.println(balance);
				break;
			case "4":
				System.out.println("프로그램 종료");
				run = false;
				break;
			}

		}

	}

}
