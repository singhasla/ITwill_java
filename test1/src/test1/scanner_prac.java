package test1;

import java.util.Scanner;

public class scanner_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();

		System.out.println("나이 : " + age);

		// 삼항연산자
		// 15이상이면 입장가능, 미만이면 입장불가
		String enter = (age >= 15) ? "입장가능" : "입장불가";
		System.out.println(enter);

	}

}
