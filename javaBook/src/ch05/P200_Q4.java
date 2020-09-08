package ch05;

public class P200_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.println("max: " + max);
	}

}
