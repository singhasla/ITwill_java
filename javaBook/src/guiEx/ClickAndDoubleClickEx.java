package guiEx;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class ClickAndDoubleClickEx extends JFrame{

	JPanel contentPane = new JPanel();
	ClickAndDoubleClickEx(){
		setTitle("Click and DoubleClick ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.addMouseListener(new MyMouseListener());
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				
				contentPane.setBackground(new Color(r,g,b));
			}
		}
	}
	
	public static void main(String[] args) {

		new ClickAndDoubleClickEx();
	}

}
