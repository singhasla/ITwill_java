package ch07;

public class P319_ComputerExample {

	public static void main(String[] args) {

		int r = 10;
		
		P318_Calculator calculator = new P318_Calculator();
		System.out.println("�� ���� : " + calculator.areaCircle(r));
		System.out.println();
		
		P318_Computer computer = new P318_Computer();
		System.out.println("�� ���� : " + computer.areaCircle(r));
	}

}
