package ch14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class P618_CharConvertStreamExam {

	public static void main(String[] args) throws Exception{

		write("���� ��ȯ ��Ʈ���� ����մϴ�.");
		String data = read();
		System.out.println(data);
		
	}
	
	public static void write(String str) throws Exception{
		FileOutputStream fos = new FileOutputStream("c:/temp/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception{

		FileInputStream fis = new FileInputStream("C:/Users/ITWILL/Desktop/test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		
		reader.close();
		
		String data = new String(buffer, 0, readCharNum);
		
		return data;
	}
}
