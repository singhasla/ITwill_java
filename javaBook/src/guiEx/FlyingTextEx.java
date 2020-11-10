package guiEx;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlyingTextEx extends JFrame {

	JPanel contentPane = new JPanel();
	JLabel la /* = new JLabel("Hello") */;
	final int FLYING_UNIT = 20;

	FlyingTextEx() {
		setTitle("��,��,��,�� Ű�� �ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);

		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());

		//la.setLocation(50, 50);
		//la.setSize(100, 20);

		//contentPane.add(la); // ���̺� ���� �� �гο� ����

		/////////////////////////////////////////////////////////////////////////
		/* �̹��� �����̱� */
		/*
		 * ImageIcon �����Ҿ����� = new ImageIcon("�̹���.png");
		 * Image �������̹��� = �����Ҿ�����.getImage(); //ImageIcon�� Image�� ��ȯ.
		 * Image ������̹��� = �������̹���.getScaledInstance(����, ����, java.awt.Image.SCALE_SMOOTH);
		 * ImageIcon ����Ⱦ����� = new ImageIcon(������̹���); //Image�� ImageIcon ����
		 */
		ImageIcon originalicon = new ImageIcon("img/AmongUs3.png");
		Image Img = originalicon.getImage();  //ImageIcon�� Image�� ��ȯ.
		Image changeImg = Img.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(changeImg); //Image�� ImageIcon ����
		
		
		la = new JLabel(icon);
		la.setLocation(50,50);
		la.setSize(icon.getIconWidth(), icon.getIconHeight());
		contentPane.add(la);
		/////////////////////////////////////////////////////////////////////////	
		
		setSize(1000, 1000);
		setVisible(true);

		contentPane.setFocusable(true);
		contentPane.requestFocus(); // �гο� ��Ŀ��

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
