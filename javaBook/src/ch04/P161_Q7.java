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
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("����>");

			int money = 0;

			String select = sc.next();

			switch (select) {
			case "1":
				System.out.println("���ݾ�>");
				money = sc.nextInt();
				balance = balance + money;
				break;
			case "2":
				System.out.println("��ݾ�>");
				money = sc.nextInt();
				balance = balance - money;
				break;
			case "3":
				System.out.println(balance);
				break;
			case "4":
				System.out.println("���α׷� ����");
				run = false;
				break;
			}

		}

	}

}
