package ch08;

public class P403_Q3_MySqlDao implements P403_Q3_DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에서 삽입");		
	}

	@Override
	public void update() {
		System.out.println("MySql DB에서 수정");		
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");		
	}
}
