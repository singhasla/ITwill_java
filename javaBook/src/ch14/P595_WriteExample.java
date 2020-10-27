package ch14;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class P595_WriteExample {

	public static void main(String[] args) throws Exception{

		OutputStream os = new FileOutputStream("c:/temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		os.close();
	}

}
