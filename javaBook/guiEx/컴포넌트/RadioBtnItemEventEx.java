package ������Ʈ;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RadioBtnItemEventEx extends JFrame{

	Container contentPane;
	JRadioButton[] radio = new JRadioButton[3];
	String[] text = {"����1", "����2", "����3"};
	ImageIcon[] image = {new ImageIcon("img/AmongUs1.png"),
						 new ImageIcon("img/AmongUs2.png"),
						 new ImageIcon("img/AmongUs3.png")};
	JLabel imageLabel = new JLabel();
	
	RadioBtnItemEventEx(){
		setTitle("������ư Item Event ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i=0;i<radio.length;i++) {
			radio[i] = new JRadioButton(text[i]);
			g.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		
		radio[1].setSelected(true);
		contentPane.add(panel,BorderLayout.NORTH);
		contentPane.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(1000,800);
		setVisible(true);
		
	}
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			
			if(radio[0].isSelected())
				imageLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageLabel.setIcon(image[1]);
			else
				imageLabel.setIcon(image[2]);
		}

	}
	
	public static void main(String[] args) {

		new RadioBtnItemEventEx();
		
	}

}
