package test1;

import java.util.Scanner;

public class switch_prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사용자로부터 달을 입력받아서, 그 달은 며칠까지 있나 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("알고 싶은 달을 입력하세요.");

		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		default:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
		}
	}

}
