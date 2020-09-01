package ch04;

import java.util.Random;

public class P161_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			int dice_num1 = (int) (Math.random() * 6) + 1;
			int dice_num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice_num1 + " , " + dice_num2 + ")");

			if (dice_num1 + dice_num2 == 5)
				break;
		}
		System.out.println("프로그램 종료");
	}
}
