package ch07;

public class P367_Q3_HttpServletExample {

	public static void main(String[] args) {

		method(new LoginServlet());	//로그인합니다.
		method(new FileDownloadServlet());	//파일 다운로드합니다.
	}
	
	public static void method(P367_Q3_HttpServlet servlet) {
		servlet.service();
	}

}
