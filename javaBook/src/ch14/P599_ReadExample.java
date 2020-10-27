package ch14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class P599_ReadExample {

	public static void main(String[] args) throws Exception{

		InputStream is = new FileInputStream("c:/temp/test1.db");

		while(true) {
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}

		is.close();
	}

}
