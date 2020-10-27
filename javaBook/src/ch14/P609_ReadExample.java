package ch14;

import java.io.FileReader;
import java.io.Reader;

public class P609_ReadExample {

	public static void main(String[] args) throws Exception{

		Reader reader = new FileReader("c:/temp/test7.txt");

		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.println((char)data);
		}

		reader.close();
	}

}
