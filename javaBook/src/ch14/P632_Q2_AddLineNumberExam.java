package ch14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class P632_Q2_AddLineNumberExam {

	public static void main(String[] args) throws Exception{

		String filePath = "src/ch14/P632_Q2_AddLineNumberExam.java";
		
		FileReader fr = new FileReader(filePath);
		FileWriter fw = new FileWriter("C:/Users/ITWILL/Desktop/test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int number=0;
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			
			System.out.println(++number +":  "+data);
			bw.write(number +":  "+data+"\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
