package ������Ʈ;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuEx extends JFrame {

	JFileChooser chooser = new JFileChooser();
	JLabel imageLabel;

	public MenuEx() {

		setTitle(".....");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu1 = new JMenu("\uD30C\uC77C");
		menuBar.add(menu1);

		JMenuItem openItem = new JMenuItem("\uC5F4\uAE30");

		// ���� ���� ���̾�α�
		openItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				FileNameExtensionFilter filter = new FileNameExtensionFilter("�̹��� ����(.jpg / .png / .gif)", "jpg", "png",
						"gif");
				chooser.addChoosableFileFilter(filter);

				int ret = chooser.showOpenDialog(null);

				if (ret == JFileChooser.APPROVE_OPTION) {
					imageLabel.setIcon(new ImageIcon(chooser.getSelectedFile().getPath()));
					pack();
				} else { 
					// �˾� ���̾�α�
					JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�", "���", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		menu1.add(openItem);

		//���� ���� ���̾�α�
		JMenuItem saveItem = new JMenuItem("\uC800\uC7A5");
		menu1.add(saveItem);
		saveItem.addActionListener(new SaveListener());

		//���� ���̾�α�
		JMenuItem exitItem = new JMenuItem("\uB098\uAC00\uAE30");
		menu1.add(exitItem);
		exitItem.addActionListener(new ExitListener());
		
		JMenu menu2 = new JMenu("\uC5D0\uB514\uD2B8");
		menuBar.add(menu2);

		JMenuItem colorItem = new JMenuItem("\uCEEC\uB7EC \uC120\uD0DD");
		menu2.add(colorItem);

		setSize(1000, 1000);

		imageLabel = new JLabel("");
		getContentPane().add(imageLabel, BorderLayout.CENTER);
		setVisible(true);

	}

	class SaveListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
			chooser.setFileFilter(filter);
			int ret = chooser.showSaveDialog(null);
			if (ret == JFileChooser.APPROVE_OPTION) {
				String filePath = chooser.getSelectedFile().getPath();
				File saveFile = new File(filePath);
				
				// �̹��� ���� Ȯ���ϱ�
				BufferedImage newImage = new BufferedImage(imageLabel.getIcon().getIconWidth(),
						imageLabel.getIcon().getIconHeight(), BufferedImage.TYPE_INT_RGB);
				Graphics g = newImage.getGraphics();
				imageLabel.getIcon().paintIcon(null, g, 0, 0);// ������ ������ �׸���(����)
				g.dispose(); // ������� �׷��� ����
				
				try {
					ImageIO.write(newImage, "jpg", saveFile);// ���Ͽ� �����ϱ�
				} catch (IOException ex) {
				
				}
			}
		}
	}

	class ExitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new MenuEx();
	}

}
