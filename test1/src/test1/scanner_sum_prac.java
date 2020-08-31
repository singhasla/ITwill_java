package test1;

import java.util.Scanner;

public class scanner_sum_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " 번째 정수를 입력해 주세요.");
			total = total + sc.nextInt();
			
			System.out.println("총 합계는 " + total);
		}
		//System.out.println("총 합계는 " + total);

	}

}
