package ch14;

import java.io.FileWriter;
import java.io.Writer;

public class P607_WriteExample {

	public static void main(String[] args) throws Exception{

		Writer writer = new FileWriter("c:/temp/test10.txt");
		
		String str = "ABC";
				
		writer.write(str);
		
		writer.flush();
		writer.close();
	}

}
