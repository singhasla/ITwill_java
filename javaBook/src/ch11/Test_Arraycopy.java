package ch11;

public class Test_Arraycopy {

	public static void main(String[] args) {

		String [] strs1 = new String [30];
		
		for(int i=0; i<strs1.length; i++)
			strs1[i] = "abc";
		
		String [] strs2 = new String [10];
		System.arraycopy(strs1, 0, strs2, 0, 10);
		
		for(int i=0; i<strs2.length; i++) {
			System.out.println("strs2" + "["+i+"]"+ "=" + strs2[i]);
		}
	}

}
