package 컴포넌트;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelEx extends JFrame{

	JLabelEx() {
		setTitle("...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lb1 = new JLabel("어몽어스");
		
		ImageIcon originalicon = new ImageIcon("./img/AmongUs2.png");
		Image Img = originalicon.getImage();  //ImageIcon을 Image로 변환.
		Image changeImg = Img.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(changeImg); //Image로 ImageIcon 생성
		
		JLabel lb2 = new JLabel(icon);
		JLabel lb3 = new JLabel("하늘",new ImageIcon("./img/sky1.jpg"), SwingConstants.CENTER);

		getContentPane().add(lb1, BorderLayout.WEST);
		getContentPane().add(lb2, BorderLayout.SOUTH);
		getContentPane().add(lb3, BorderLayout.CENTER);
		
		setSize(783,603);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new JLabelEx();
	}

}
