package ch13;

import java.util.ArrayList;
import java.util.List;

public class P581_Q7_BoardDao {

		public List<P581_Q7_Board> getBoardList() {
		
			List<P581_Q7_Board> list2 = new ArrayList<P581_Q7_Board>();
			
			list2.add(new P581_Q7_Board("力格1", "郴侩1"));
			list2.add(new P581_Q7_Board("力格2", "郴侩2"));
			list2.add(new P581_Q7_Board("力格3", "郴侩3"));
			
			return list2;
			
		}
	
}
