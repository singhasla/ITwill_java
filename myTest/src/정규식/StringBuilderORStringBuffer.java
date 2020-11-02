package 정규식;

import java.io.IOException;
import java.util.Scanner;

public class StringBuilderORStringBuffer {

	public static void main(String[] args) throws IOException{

		System.out.println("입력");
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		String line;
		
		while( !(line = sc.nextLine()).equals("x")) {
			sb.append(line +  " ");
		}
		
		System.out.println(sb.toString());
	}

}
