package guiEx;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {

	GridLayoutEx() {
		setTitle("GridLayout Sample"); // �������� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4, 2); // 4x2 ������ GridLayout ��ġ������
		grid.setVgap(5); // ���� ������ ���� ������ 5 �ȼ��� ����
		c.setLayout(grid); // grid�� ����Ʈ���� ��ġ�����ڷ� ����
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {

		new GridLayoutEx();
	}

}
