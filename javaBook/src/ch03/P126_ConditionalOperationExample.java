package ch03;

public class P126_ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score >80) ? 'B':'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
