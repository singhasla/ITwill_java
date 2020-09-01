package ch04;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("년도를 입력하세요");
		int year = sc.nextInt();

		if (year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else if (year % 100 == 0) {
			System.out.println("평년입니다.");
		} else if (year % 4 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}
}
