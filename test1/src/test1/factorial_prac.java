package test1;

public class factorial_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mul=1;
		
		for (int fac = 1; fac <= 5; fac++) {
			System.out.println(fac +"¹øÂ° : " + mul + " X " + fac + " = " + (mul*fac));
			mul *= fac;
		}
		 //System.out.println(mul);
	}

}
