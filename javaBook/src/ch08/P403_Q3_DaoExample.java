package ch08;

public class P403_Q3_DaoExample {

	public static void dbWork(P403_Q3_DataAccessObject dao){
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {

		dbWork(new P403_Q3_OracleDao());
		dbWork(new P403_Q3_MySqlDao());
	}

}
