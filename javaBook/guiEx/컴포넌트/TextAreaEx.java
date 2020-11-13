package 컴포넌트;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{

	Container contentPane;
	
	TextAreaEx() {
		setTitle("텍스트 영역 만들기 예제");
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
			btn = new JButton("추가");
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText() + "\n");
				
				}
			});
			
			ta = new JTextArea("hello",7,20);
			add(new JLabel("아래 창에 문자열을 입력하고 버튼을 클릭하세요"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));
			
		}
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}

}
