package �������;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		try {
			ServerSocket s = new ServerSocket(15432);
			System.out.println("���� �۵� ����");
			
			while (true) {
				
				Socket s1 = s.accept();
				System.out.println("Ŭ���̾�Ʈ ����!");
				
				OutputStream os = s1.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject("�̽��� �����Դϴ�.");
				
				InputStream is = s1.getInputStream();
				ObjectInputStream ois = new ObjectInputStream(is);
				System.out.println(ois.readObject());
				
				oos.close();
				ois.close();
				s1.close();

			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
