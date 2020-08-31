package test1;

import java.util.Scanner;

public class array_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int array[] = new int[5];
		// int array = new int[5];

		for (int i = 0; i < array.length; i++) {

			System.out.println((i + 1) + "번째 숫자를 입력해주세요.");
			array[i] = sc.nextInt();
		}

		for (int j = 0; j < array.length; j++) {

			System.out.println((j + 1) + "번째 숫자는 " + array[j]);
		}

		// 입력받은 값들 중 최대값, 최소값을 변수max에 저장하여 출력
		int max = array[0];
		int min = array[0];
		for (int k = 0; k < array.length; k++) {
			// 최대값
			if (array[k] > max) {
				max = array[k];
			}

			// 최소값
			if (array[k] < min) {
				min = array[k];
			}

		}
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
	}

}
