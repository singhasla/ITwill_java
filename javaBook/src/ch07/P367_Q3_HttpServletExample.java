package ch07;

public class P367_Q3_HttpServletExample {

	public static void main(String[] args) {

		method(new LoginServlet());	//�α����մϴ�.
		method(new FileDownloadServlet());	//���� �ٿ�ε��մϴ�.
	}
	
	public static void method(P367_Q3_HttpServlet servlet) {
		servlet.service();
	}

}
