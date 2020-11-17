package �������;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		try {
			Socket s1 = new Socket("192.168.3.7", 15432);
			
			InputStream is = s1.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println(ois.readObject());
			
			OutputStream os = s1.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject("���� �̽��� Ŭ���̾�Ʈ�Դϴ�.");
			
			oos.close();
			ois.close();
			s1.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
