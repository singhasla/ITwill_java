package ��񿬰�;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnect {

	public static void main(String[] args) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String DBURL = "jdbc:mysql://localhost:3306/javadb?serverTimezone=Asia/Seoul";
		String DBID = "root";
		String DBPW = "1234";
		try {
			// 1. ����̹��ε�
			Class.forName(DRIVER);
			// 2. ��񿬰�
			Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("����Ǿ����ϴ�.");
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("DB���� ����");
		}

	}

}
