package URL;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class UrlEx {

	public static void main(String[] args) {

		try {
			FileOutputStream os = new FileOutputStream("c:/temp/index.html");
			
			URL url = new URL("http://www.google.com/index.html");
			InputStream is = url.openStream();
			
			byte[] buffer = new byte[100];
			while(true) {
				int cnt = is.read(buffer);
				if(cnt == -1) break;
				
				//System.out.println(new String(buffer));
				os.write(buffer);
			}
			
			is.close();
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인종료");
	}

}
