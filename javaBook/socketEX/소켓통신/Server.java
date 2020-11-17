package 소켓통신;

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
			System.out.println("서버 작동 시작");
			
			while (true) {
				
				Socket s1 = s.accept();
				System.out.println("클라이언트 접속!");
				
				OutputStream os = s1.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject("이승하 서버입니다.");
				
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
