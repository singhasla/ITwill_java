package test1;

import java.util.Scanner;

public class array_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		// int array = new int[5];

		for (int i = 0; i < array.length; i++) {

			System.out.println((i + 1) + "��° ���ڸ� �Է����ּ���.");
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < array.length; j++) {

			System.out.println((j + 1) + "��° ���ڴ� " + array[j]);
		}

		// �Է¹��� ���� �� �ִ밪, �ּҰ��� ����max�� �����Ͽ� ���
		int max = array[0];
		int min = array[0];
		for (int k = 0; k < array.length; k++) {
			// �ִ밪
			if (array[k] > max) {
				max = array[k];
			}

			// �ּҰ�
			if (array[k] < min) {
				min = array[k];
			}

		}
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
	}

}
