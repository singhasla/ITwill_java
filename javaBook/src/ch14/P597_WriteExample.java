package ch14;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class P597_WriteExample {

	public static void main(String[] args) throws Exception{

		OutputStream os = new FileOutputStream("c:/temp/test3.db");
		
		byte[] array = {10, 20, 30, 40, 50};
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
	}

}
