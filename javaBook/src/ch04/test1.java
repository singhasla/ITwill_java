package ch04;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
		}else if(score >=70) {
			grade = 'C';
		}else if(score >=60) {
			grade = 'D';
		}else 
			grade = 'F';
			
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println(grade + "��� �� ���Ͽ����ϴ�");
			break;
		case 'C':
		case 'D':
			System.out.println(grade + "��� �� �� ��� �ϼ���");
			break;
		case 'F':
			System.out.println(grade + "��� ���� �б⿡ �ٽ� �����ϼ���");
			break;
		}
		
	}

}
