package A시험문제연습하기;

public class Test16 {

	public static void main(String[] args) {

		Add add = new Add(20, 80);
		
		System.out.println(add.getValue());
	}

}

class Add {
	// 멤버 변수
	int a;
	int b;

	// 생성자
	Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 메소드
	int getValue() {
		return a + b;
	}
}