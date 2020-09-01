package ch04;

public class P153_ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2;i<=9;i++) {
			System.out.println("*** "+ i + "´Ü ***");
			for(int j=1;j<=9;j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
		}
	}

}
