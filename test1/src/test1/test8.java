package test1;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int data = sc.nextInt();

		if (data % 3 == 0) {
			System.out.println("�Է°��� 3�� ����̴�");
		} else {
			System.out.println("�Է°��� 3�� ����� �ƴϴ�");
		}
	}

}
