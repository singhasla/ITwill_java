package ch13;

import java.util.List;

public class P581_Q7_ListExample {

	public static void main(String[] args) {

		P581_Q7_BoardDao dao = new P581_Q7_BoardDao();
		List<P581_Q7_Board> list = dao.getBoardList();
		for(P581_Q7_Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}
