package ch02;

import java.util.Scanner;

public class P99_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ��:");
		String strNum1 = scanner.next();
		
		System.out.print("�ι�° ��:");
		String strNum2 = scanner.next();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);;
		int result = num1 + num2 ;
		System.out.println("���� ���:"+result);

	}

}
