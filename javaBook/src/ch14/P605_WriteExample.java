package ch14;

import java.io.FileWriter;
import java.io.Writer;

public class P605_WriteExample {

	public static void main(String[] args) throws Exception{

		Writer writer = new FileWriter("c:/temp/test8.txt");
		
		char[] array = {'A', 'B', 'C'};
				
		writer.write(array);
		
		writer.flush();
		writer.close();
	}

}
