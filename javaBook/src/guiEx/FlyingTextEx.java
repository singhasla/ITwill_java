package guiEx;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {

	JPanel contentPane = new JPanel();
	JLabel la /* = new JLabel("Hello") */;
	final int FLYING_UNIT = 50;

	FlyingTextEx() {
		setTitle("상,하,좌,우 키로 텍스트 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);

		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());

		//la.setLocation(50, 50);
		//la.setSize(100, 20);

		//contentPane.add(la); // 레이블 설정 및 패널에 붙임

		/////////////////////////////////////////////////////////////////////////
		ImageIcon icon = new ImageIcon("img/AmongUs1.png");
		la = new JLabel(icon);
		la.setLocation(50,50);
		la.setSize(icon.getIconWidth(), icon.getIconHeight());
		contentPane.add(la);
		/////////////////////////////////////////////////////////////////////////	
		
		setSize(1000, 1000);
		setVisible(true);

		contentPane.setFocusable(true);
		contentPane.requestFocus(); // 패널에 포커싱

	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();

			switch (keyCode) {
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + FLYING_UNIT, la.getY());
				break;
			}

		}

	}

	public static void main(String[] args) {

		new FlyingTextEx();
	}

}
