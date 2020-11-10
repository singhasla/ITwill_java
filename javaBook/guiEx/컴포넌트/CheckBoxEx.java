package 컴포넌트;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEx extends JFrame {

	JCheckBox cb1, cb2, cb3;
	JLabel sumlb;
	int sum = 0;
	
	public CheckBoxEx() {
		setTitle("...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(new JLabel("사과 100원, 배 500원, 체리 1000원"));
		
		cb1 = new JCheckBox("사과");
		cb2 = new JCheckBox("배");
		cb3 = new JCheckBox("체리");
		
		MyItemListener l = new MyItemListener();
		cb1.addItemListener(l);
		cb2.addItemListener(l);
		cb3.addItemListener(l);
		
		add(cb1); add(cb2); add(cb3);
		
		sumlb = new JLabel("현재 총합은 : ");
		add(sumlb);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {

			if(e.getItem() == cb1) {
				if(e.getStateChange() == ItemEvent.SELECTED) sum = sum + 100;
				else sum = sum - 100;
			}
			
			else if(e.getItem() == cb2) {
				if(e.getStateChange() == ItemEvent.SELECTED) sum = sum + 500;
				else sum = sum - 500;
			}
			
			else if(e.getItem() == cb3) {
				if(e.getStateChange() == ItemEvent.SELECTED) sum = sum + 1000;
				else sum = sum - 1000;
			}
			
			sumlb.setText("현재 총합은 : " + sum);
		}
		
	}
	
	public static void main(String[] args) {
		new CheckBoxEx();
	}

}

