package test1;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		String season = sc.next();

		switch (season) {
		case "spring":
			System.out.println("�����ϴ�");
			break;
		case "summer":
			System.out.println("����");
			break;
		case "fall":
			System.out.println("�ҽ��ϴ�");
			break;
		case "winter":
			System.out.println("���");
			break;

		default:
			System.out.println("���� �ʴ� �Է°��Դϴ�");
		}
	}

}
