package ch04;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��(x,y)�� ��ǥ�� �Է��Ͻÿ�");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int first_dot_x = 50;
		int first_dot_y = 50;
		
		int second_dot_x = 100;
		int second_dot_y = 100;
		
		if(x>=first_dot_x && x<=second_dot_x) {
			if(y>=first_dot_y && y<=second_dot_y) {
				System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�");
			}
		}else {
			System.out.println("�簢�� �ȿ� ���� �����ϴ�");
		}
	
	}

}
