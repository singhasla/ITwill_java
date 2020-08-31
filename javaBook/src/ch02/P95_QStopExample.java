package ch02;

public class P95_QStopExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int keyCode;

		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		
		System.out.println("Á¾·á");
	}

}
