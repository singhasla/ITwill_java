package 정규식;

public class 정규식 {

	public static void main(String[] args) {

		String data = "홍길동0이순신z유관순";	//구분자
		
		String[] result = data.split("[0-9a-z]");
		
		for(String str : result)
			System.out.println(str);
		
		System.out.println("//////////////////////");
		//////////////////////////////////////////
		String nameRule = "[a-zA-Z가-힣]{2,10}";
		
		System.out.println("hello java".matches(nameRule));
		System.out.println("홍길동".matches(nameRule));
		System.out.println("홍길동2".matches(nameRule));
		System.out.println("he llo".matches(nameRule));
	}

}
