package ch03;

import java.util.Scanner;

public class P130_Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵�:");
		String name = scanner.nextLine();
		
		System.out.print("�н�����:");
		String strpassword = scanner.nextLine();
		int password = Integer.parseInt(strpassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("�α��� ����");
			}else{
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			}
		}else{
			System.out.println("�α��� ����:���̵� �������� ����");
		}

	}

}
