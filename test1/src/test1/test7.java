package test1;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하시오");
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

		System.out.println("5만원권 " + m50000 + "매");
		System.out.println("1만원권 " + m10000 + "매");
		System.out.println("5천원권 " + m5000 + "매");
		System.out.println("1천원권 " + m1000 + "매");
		System.out.println("  500원 " + m500 + "개");
		System.out.println("  100원 " + m100 + "개");
		System.out.println("   50원 " + m50 + "개");
		System.out.println("   10원 " + m10 + "개");
		System.out.println("    1원 " + m1 + "개");

	}

}
