package A시험문제연습하기;

import java.util.ArrayList;

public class Test14 {
	public static void main(String[] args) {

		//ArrayList를 이용하여 저장 하고 출력하는 내용을 코딩하시오
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		
		for(String s : list)
		System.out.println(s);

	}
}
