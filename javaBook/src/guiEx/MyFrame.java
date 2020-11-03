package guiEx;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class MyFrame extends JFrame{

	MyFrame(){
		setTitle("È«±æµ¿");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,700);
		
		JButton btnNewButton = new JButton("Hello, \uC790\uBC14");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("±Ã¼­", Font.BOLD, 30));
		btnNewButton.setBackground(Color.ORANGE);
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new MyFrame();
		
		while(true) {
			System.out.println("Go");
		}
		
	}

}
