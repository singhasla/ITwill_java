package ch04;

public class P138_IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 75;
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�");
			System.out.println("����� A�Դϴ�");
		}else if(score>=80) {
			System.out.println("������ 80~89�Դϴ�");
			System.out.println("����� B�Դϴ�");
		}else if(score>=70){
			System.out.println("������ 70~79�ϴ�");
			System.out.println("����� C�Դϴ�");
		}else{
			System.out.println("������ 70 �̸��Դϴ�");
			System.out.println("����� D�Դϴ�");
		}
	}

}
