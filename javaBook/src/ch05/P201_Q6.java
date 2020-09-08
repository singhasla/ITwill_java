package ch05;

import java.util.Scanner;

public class P201_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");

			int selectNo = sc.nextInt();

			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0;i<studentNum;i++) {
					System.out.print("scores["+i+"]>");
					scores[i] = sc.nextInt();					
				}
			}else if(selectNo == 3) {
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]>" + scores[i]);
				}
			}else if(selectNo == 4) {
				int max = scores[0];
				int total = 0;
				double avg = 0;
				
				for(int i=1;i<studentNum;i++) {
					if(scores[i]>max) {
						max = scores[i];
					}
					total += scores[i];
				}
				
				avg = total / studentNum;
				System.out.println("최고 점수: " + total);
				System.out.println("평균 점수: " + avg);
				
			}else if(selectNo == 5) {
				run = false;
			}

		}
		
		System.out.println("프로그램 종료");
	}

}

