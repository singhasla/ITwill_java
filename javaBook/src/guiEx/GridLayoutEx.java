package guiEx;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame {

	GridLayoutEx() {
		setTitle("GridLayout Sample"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4, 2); // 4x2 격자의 GridLayout 배치관리자
		grid.setVgap(5); // 격자 사이의 수직 간격을 5 픽셀로 설정
		c.setLayout(grid); // grid를 컨텐트팬의 배치관리자로 지정
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {

		new GridLayoutEx();
	}

}
