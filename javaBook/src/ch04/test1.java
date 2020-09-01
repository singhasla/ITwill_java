package ch04;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
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
			System.out.println(grade + "등급 참 잘하였습니다");
			break;
		case 'C':
		case 'D':
			System.out.println(grade + "등급 좀 더 노력 하세요");
			break;
		case 'F':
			System.out.println(grade + "등급 다음 학기에 다시 수강하세요");
			break;
		}
		
	}

}
