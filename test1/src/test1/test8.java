package test1;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int data = sc.nextInt();

		if (data % 3 == 0) {
			System.out.println("입력값이 3의 배수이다");
		} else {
			System.out.println("입력값이 3의 배수가 아니다");
		}
	}

}
