package test1;

import java.util.Scanner;

public class switch_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("level을 입력하세요.");
		String level = sc.next();

		switch (level) {
		case "manage":
			System.out.println("운영");
			break;
		case "member":
			System.out.println("글쓰기");
			break;
		case "guest":
			System.out.println("게시판보기");
			break;
		default:
			System.out.println("다시 입력하세요");
		}
	}

}
