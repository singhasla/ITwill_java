package ch06;

public class P276_CalculatorExample {

	public static void main(String[] args) {
		
		double result1 = 10 * 10 * P276_Calculator.pi;
		int result2 = P276_Calculator.plus(10, 5);
		int result3 = P276_Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

	}

}
