package 이벤트처리;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestLayoutEx extends JFrame{

	TestLayoutEx() {
		Random random = new Random();
		setTitle("Test Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0;i<20;i++) {
			int r = random.nextInt(256);
			int g = random.nextInt(256);
			int b = random.nextInt(256);
			
			JLabel la = new JLabel();
			la.setSize(10,10);
			la.setOpaque(true);
			la.setBackground(new Color(r, g, b));
			//la.setBackground(Color.blue);
			
			int x = random.nextInt(201)+50;
			int y = random.nextInt(201)+50;
			//int x = (int)(Math.random()*201 + 50);
			//int y = (int)(Math.random()*201 + 50);
			
			
			la.setLocation(x, y);
			c.add(la);
		}
		setLocation(random.nextInt(1600), random.nextInt(800));
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		new TestLayoutEx();
	}

}
