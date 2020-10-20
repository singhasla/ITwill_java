package ch13;

import java.util.List;
import java.util.Vector;

public class P561_VectorExample {

	public static void main(String[] args) {

		List<P562_Board> list =new Vector<P562_Board>();
		
		list.add(new P562_Board("����1", "����1", "�۾���1"));
		list.add(new P562_Board("����2", "����2", "�۾���2"));
		list.add(new P562_Board("����3", "����3", "�۾���3"));
		list.add(new P562_Board("����4", "����4", "�۾���4"));
		list.add(new P562_Board("����5", "����5", "�۾���5"));
		
		list.remove(2);
		list.remove(2);
		
		for(int i=0; i<list.size();i++) {
			P562_Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

	}

}
