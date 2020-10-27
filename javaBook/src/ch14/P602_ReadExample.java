package ch14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class P602_ReadExample {

	public static void main(String[] args) throws Exception{

		InputStream is = new FileInputStream("c:/temp/test3.db");

		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer, 2, 3);
		if(readByteNum != -1) {
		
			for(int i=0;i<buffer.length; i++) {
				System.out.println("buffer["+i+"]:"+buffer[i]);
			}
		}

		is.close();
	}

}
