package ch14;

import java.io.FileWriter;
import java.io.Writer;

public class P606_WriteExample {

	public static void main(String[] args) throws Exception{

		Writer writer = new FileWriter("c:/temp/test9.txt");
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
				
		writer.write(array, 1, 3);
		
		writer.flush();
		writer.close();
	}

}
