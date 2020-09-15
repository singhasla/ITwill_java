package ch06;

public class P246_Q4_BoardExample {

	public static void main(String[] args) {
		
		P245_Q3_Board board1 = new P245_Q3_Board("a", "aa");
		P245_Q3_Board board2 = new P245_Q3_Board("b", "bb", "bbb");
		P245_Q3_Board board3 = new P245_Q3_Board("c", "cc", "ccc", "cccc");
		P245_Q3_Board board4 = new P245_Q3_Board("d", "dd", "ddd", "dddd", 0);

		System.out.println(board1);
		System.out.println(board2);
		System.out.println(board3);
		System.out.println(board4);
	}

}
