package ������Ʈ;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TextAreaEx extends JFrame{

	Container contentPane;
	
	TextAreaEx() {
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyCenterPanel(), BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	class MyCenterPanel extends JPanel{
		
		JTextField tf;
		JButton btn;
		JTextArea ta;
		
		MyCenterPanel() {
			tf = new JTextField(20);
			btn = new JButton("�߰�");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText() + "\n");
				
				}
			});
			
			ta = new JTextArea("hello",7,20);
			add(new JLabel("�Ʒ� â�� ���ڿ��� �Է��ϰ� ��ư�� Ŭ���ϼ���"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));
			
		}
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
