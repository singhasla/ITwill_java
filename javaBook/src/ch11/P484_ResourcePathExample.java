package ch11;

public class P484_ResourcePathExample {

	public static void main(String[] args) {

		Class clazz = Test_Circle.class;
		
		String photo1Path = clazz.getResource("dog4.jpg").getPath();
		String photo2Path = clazz.getResource("img/dog4.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
