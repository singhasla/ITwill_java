package ch14;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class P628_ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();
		List<P630_Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(P630_Board board : list) {
			System.out.println(
					board.getBno() + "\t" + board.getTitle() + "\t" + 
							board.getContent() + "\t" + board.getWriter() + "\t" +
				sdf.format(board.getDate())
			);
		}
	}
	
	public static void writeList() throws Exception {
		List<P630_Board> list = new ArrayList<>();
		
		list.add(new P630_Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new P630_Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new P630_Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
	}
	
	public static List<P630_Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<P630_Board> list = (List<P630_Board>) ois.readObject();
		return list;
	}
}
