package ��񿬰�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCEx1 {

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

			//
			String sql = "insert into member(id_name,pw_name) values(?,password(?))";
			PreparedStatement pstmt1 = con.prepareStatement(sql);
			pstmt1.setString(1, "kim3");
			pstmt1.setString(2, "1234");
			int rowCnt = pstmt1.executeUpdate();
			System.out.println("�Է� �Ϸ�");

			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("DB���� ����");
		}

	}

}
