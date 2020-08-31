package test1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("시간으로 변경할 초(sec)를 입력하시오");
		int sec = sc.nextInt();

		int hour = sec / 3600;
		int minute = (sec % 3600) / 60;
		int second = sec % 60;

		System.out.print(hour + "시간" + minute + "분" + second + "초");

	}

}
