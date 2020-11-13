package 디비연결;
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
			// 1. 드라이버로드
			Class.forName(DRIVER);
			// 2. 디비연결
			Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("연결되었습니다.");
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("DB연결 오류");
		}

	}

}
