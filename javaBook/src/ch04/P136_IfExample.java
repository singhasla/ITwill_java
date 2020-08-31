package ch04;

public class P136_IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		}
		
		if(score<90)
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B입니다");	//if문과 상관없는 실행문

	}

}
