package ch11;

public class Test_CircleExample {

	public static void main(String[] args) {

		Test_Circle c1 = new Test_Circle(30, 10, 10);
		Test_Circle c2 = new Test_Circle(20, 10, 10);
		Test_Circle c3 = new Test_Circle(20, 20, 10);
		
		if(c2.equals(c3)) 
			System.out.println("같은 원");
		else
			System.out.println("다른 원 (" + c2 + " / " + c3 + " )");
	}

}
