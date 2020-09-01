package ch04;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

//		if (num / 10 == 0) {
//			// 한자리 숫자일때
//			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
//				System.out.print("박수 짝");
//			} else {
//				System.out.println("박수 없음");
//			}
//
//		} else if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
//			// 30번대, 60번대, 90번대 자리 숫자
//			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
//				System.out.println("박수 짝짝");
//			} else {
//				System.out.println("박수 짝");
//			}
//		} else {
//			// 30번대,60번대,90번대가 아닌 두자리 숫자
//			if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
//				System.out.println("박수 짝");
//			} else {
//				System.out.println("박수 없음");
//			}
//		}

		int count = 0;
		int digit1 = num%10;
		int digit10 = num/10;

		if(digit1 % 3 == 0 && digit1 !=0) count++;
		if(digit10 % 3 == 0 && digit10 !=0)	count++;
		
		if(count == 2) 
			System.out.println("박수 짝짝");
		else if(count == 1)
			System.out.println("박수 짝");
		else
			System.out.println("박수 없음");

	}

}
