package test1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double PI = 3.141592; // 상수 선언 방법

		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하시오");
		int radius = sc.nextInt();

		double area = radius * radius * PI;
		System.out.println("원의 면적 : ");
		System.out.println(area);
	}

}
