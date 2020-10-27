package ch14;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class P596_WriteExample {

	public static void main(String[] args) throws Exception{

		OutputStream os = new FileOutputStream("c:/temp/test2.db");
		
		byte[] array = {10, 20, 30};
		byte[] array2 = "abc".getBytes();
		byte[] array3 = "È«±æµ¿".getBytes();
		os.write(array);
		os.write(array2);
		os.write(array3);
		
		os.write("102030".getBytes());
		os.write("def".getBytes());
		os.write("È«µÎ²²".getBytes());
		
		os.flush();
		os.close();
	}

}
