package test1;

import java.util.Scanner;

public class scanner_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();

		System.out.println("���� : " + age);

		// ���׿�����
		// 15�̻��̸� ���尡��, �̸��̸� ����Ұ�
		String enter = (age >= 15) ? "���尡��" : "����Ұ�";
		System.out.println(enter);

	}

}
