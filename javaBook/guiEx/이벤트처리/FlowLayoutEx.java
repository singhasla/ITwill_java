package �̺�Ʈó��;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	FlowLayoutEx() {
		setTitle("FlowLayout Sample"); // �������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		setSize(300, 200); // ������ ũ�� 300x200 ����
		setVisible(true); // �������� ȭ�鿡 ���
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}