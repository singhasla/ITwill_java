package ch04;

public class P138_IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A입니다");
		}else if(score>=80) {
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B입니다");
		}else if(score>=70){
			System.out.println("점수가 70~79니다");
			System.out.println("등급은 C입니다");
		}else{
			System.out.println("점수가 70 미만입니다");
			System.out.println("등급은 D입니다");
		}
	}

}
