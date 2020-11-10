package 이벤트처리;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame{

	JButton btn1;
	
	MyFrame(){
		setTitle("홍길동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,700);
		
		btn1 = new JButton("Hello, \uC790\uBC14");
		btn1.setForeground(Color.BLUE);
		btn1.setFont(new Font("궁서", Font.BOLD, 30));
		btn1.setBackground(Color.ORANGE);
		getContentPane().add(btn1, BorderLayout.NORTH);
		
		JButton btn2 = new JButton("\uC774\uC2B9\uD558");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("두번째 버튼을 클릭했다~");
				btn1.setText("내가 바꿨다!");
			}
		});
		getContentPane().add(btn2, BorderLayout.EAST);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new MyFrame();
		
		//while(true) {
			System.out.println("Go");
		//}
		
	}

}
