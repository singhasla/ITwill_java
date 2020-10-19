package ch12;

class Gugudan_two extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=9;i++) {
			System.out.println("2" + " * " + i + " = " + 2*i);
		}
	}
}

class Gugudan_four extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=9;i++) {
			System.out.println("4" + " * " + i + " = " + 4*i);
		}
	}
}

class Gugudan_six extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=9;i++) {
			System.out.println("6" + " * " + i + " = " + 6*i);
		}
	}
}

public class Test_Gugudan {

	public static void main(String[] args) {

		System.out.println("메인스레드 시작");
		
		Gugudan_two g2 = new Gugudan_two();
		Gugudan_four g4 = new Gugudan_four();
		Gugudan_six g6 = new Gugudan_six();
		
		g2.start();
		g4.start();
		g6.start();
				
		System.out.println("메인스레드 종료");
	}

}
