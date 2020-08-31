package test1;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 입력하세요");
		String season = sc.next();

		switch (season) {
		case "spring":
			System.out.println("따뜻하다");
			break;
		case "summer":
			System.out.println("덥다");
			break;
		case "fall":
			System.out.println("쌀쌀하다");
			break;
		case "winter":
			System.out.println("춥다");
			break;

		default:
			System.out.println("맞지 않는 입력값입니다");
		}
	}

}
