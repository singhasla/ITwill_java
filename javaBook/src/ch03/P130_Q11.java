package ch03;

import java.util.Scanner;

public class P130_Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strpassword = scanner.nextLine();
		int password = Integer.parseInt(strpassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else{
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		}else{
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}

	}

}
