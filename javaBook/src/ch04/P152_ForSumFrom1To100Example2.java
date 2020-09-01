package ch04;

public class P152_ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i = 0;
		
		for(i=1;i<=100;i++)
			sum += i;
		
		System.out.println("1~" + (i-1) + " гу : " + sum);
	}

}
