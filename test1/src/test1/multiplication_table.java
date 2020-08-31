package test1;

public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
//				total = i * j;
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println("");
//			total = 2 * i;
//			System.out.println("2 X " + i + " = " + total);
		}
	}

}
