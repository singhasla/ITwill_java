package 응용;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class LoginEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public LoginEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu loginMenu = new JMenu("\uB85C\uADF8\uC778/\uC544\uC6C3");
		menuBar.add(loginMenu);

		JMenuItem loginMenuItem = new JMenuItem("\uB85C\uADF8\uC778");
		loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().add(new MyLoginPanel());
				validate();
			}
		});
		loginMenu.add(loginMenuItem);

		JMenuItem logoutMenuItem = new JMenuItem("\uB85C\uADF8\uC544\uC6C3");
		logoutMenuItem.setEnabled(false);
		loginMenu.add(logoutMenuItem);

		JMenuItem exitMenuItem = new JMenuItem("\uC885\uB8CC");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				con.close();
				System.exit(0);
			}
		});
		loginMenu.add(exitMenuItem);

		JMenu studentMgrMenu = new JMenu("\uD559\uC0DD \uAD00\uB9AC");
		studentMgrMenu.setEnabled(false);
		menuBar.add(studentMgrMenu);

		JMenu settingMenu = new JMenu("\uC124\uC815");
		menuBar.add(settingMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		setSize(700, 700);
		setVisible(true);
	}

	class MyLoginPanel extends JPanel {

		JTextField idtxt, pwtxt;
		Connection con;

		MyLoginPanel() {
			idtxt = new JTextField("아이디를 입력하시오");
			add(idtxt);
			pwtxt = new JTextField("비밀번호를 입력하시오");
			add(pwtxt);
			JButton loginBtn = new JButton("로그인");
			loginBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					connectDB();
					boolean isLogin = login();
					
					if(isLogin)
						JOptionPane.showMessageDialog(null, "로그인되었습니다");
					else
						JOptionPane.showMessageDialog(null, "아이디와 패스워드를 확인하세요");
				}
			});
			add(loginBtn);
		}

		void connectDB() {

			String DRIVER = "com.mysql.cj.jdbc.Driver";
			String DBURL = "jdbc:mysql://localhost:3306/javadb?serverTimezone=Asia/Seoul";
			String DBID = "root";
			String DBPW = "1234";
			try {
				// 1. 드라이버로드
				Class.forName(DRIVER);
				// 2. 디비연결
				con = DriverManager.getConnection(DBURL, DBID, DBPW);
				System.out.println("연결되었습니다.");


			} catch (ClassNotFoundException e) {
				System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
			} catch (SQLException e) {
				System.out.println("DB연결 오류");
			}
		}

		boolean login() {
			
			try {
				String id = idtxt.getText(); 
				String pw = pwtxt.getText();
				
				String sql = "select * from manager where manager_pw = password(?)";

				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, pw);
				
				ResultSet rs = pstmt.executeQuery();
				
				while(rs.next()) {
					
					String resultid = rs.getString("manager_id");
					if(id.equals(resultid)) { return true; }
					
					System.out.println(pw);
				}
				
				
			} catch (Exception e) {
				System.out.println("login메소드 내부에서 오류" + e);
			} 
			
			return false;
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new LoginEx();
	}

}
