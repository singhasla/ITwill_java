package test1;

import java.util.Scanner;

public class switch_prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����ڷκ��� ���� �Է¹޾Ƽ�, �� ���� ��ĥ���� �ֳ� ���
		Scanner sc = new Scanner(System.in);

		System.out.println("�˰� ���� ���� �Է��ϼ���.");

		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		default:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		}
	}

}
