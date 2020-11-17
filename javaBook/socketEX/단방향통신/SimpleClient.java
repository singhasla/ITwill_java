package 단방향통신;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleClient extends Thread implements ActionListener{
	
	JTextArea ta;
	JTextField tf, tf2;
	JDialog dialog;
	String host;
	
	Socket s1;
	DataInputStream din;
	DataOutputStream dout;
	boolean stop;
	
	SimpleClient(){
		launchFrame();		
	}
	

	public static void main(String[] args) {
		new SimpleClient();

	}
	
	public void launchFrame(){		
		JFrame frame = new JFrame("yoon chatting");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new JTextArea();
		tf=new JTextField();
		tf.addActionListener(this);
		frame.setBackground(Color.lightGray);
		ta.setEditable(false);
		frame.add(new JScrollPane(ta), BorderLayout.CENTER);
		frame.add(tf, BorderLayout.SOUTH);
		
		frame.setSize(500, 300);
		frame.setVisible(true);
		
		dialog = new JDialog(frame,"Input IP Address ",true);
		JLabel label = new JLabel("Input IP Address ");
		tf2 = new JTextField("192.168.219.103",15);
		tf2.addActionListener(this);
		dialog.add(label, BorderLayout.NORTH);
		dialog.add(tf2, BorderLayout.CENTER);
		dialog.pack();
		dialog.setVisible(true);
		service();	
		
	}
	
	public void service(){
		try {
			s1 = new Socket(host,5432);
			din = new DataInputStream(s1.getInputStream());
			dout = new DataOutputStream(s1.getOutputStream());
			
			ta.append(host+" connect complete ...\n");
			this.start();
		}catch(IOException e){
			System.out.println("disconnect....");
			System.exit(0);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf){
			try{
				String msg = tf.getText();
				ta.append("me: "+msg+"\n");
				dout.writeUTF(s1.getInetAddress()+": "+msg);
				tf.setText("");
				if(msg.equals("exit")) {
					//dout.writeUTF(msg);
					//ta.append("bye");
					stop=true;
					dout.close();
					s1.close();
					System.exit(0);
				}else {

				}
			}catch(IOException e1){
				ta.append(e1.getMessage());
			}
		}else {
			host=tf2.getText().trim();
			if(host.equals("")) host="localhost";
			dialog.dispose();
		}
		
	}

	@Override
	public void run() {
		
		//System.out.println("Thread started ....");
		try{
			while(!stop){
				String msg = din.readUTF();
				ta.append("Server :"+msg+"\n");
				if(msg.equals("exit")) break;
			}
			din.close();
			s1.close();
			System.exit(0);
			
		}catch(IOException e){
			ta.append(e.getMessage());
		}
		
		
	}

}
