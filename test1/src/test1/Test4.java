package test1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하시오");

		String data = sc.next(); // 키보드로부터 사용자가 문자를 입력하면, 받아와주는 명령어
		// int num = sc.nextInt(); // .. 숫자를 ..
		System.out.print("결과값 ");
		System.out.println(data);

	}

}
