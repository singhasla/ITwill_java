package test1;

import java.util.Scanner;

public class switch_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("level�� �Է��ϼ���.");
		String level = sc.next();

		switch (level) {
		case "manage":
			System.out.println("�");
			break;
		case "member":
			System.out.println("�۾���");
			break;
		case "guest":
			System.out.println("�Խ��Ǻ���");
			break;
		default:
			System.out.println("�ٽ� �Է��ϼ���");
		}
	}

}
