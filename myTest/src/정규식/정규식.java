package Á¤±Ô½Ä;

public class Á¤±Ô½Ä {

	public static void main(String[] args) {

		String data = "È«±æµ¿0ÀÌ¼ø½ÅzÀ¯°ü¼ø";	//±¸ºÐÀÚ
		
		String[] result = data.split("[0-9a-z]");
		
		for(String str : result)
			System.out.println(str);
		
		System.out.println("//////////////////////");
		//////////////////////////////////////////
		String nameRule = "[a-zA-Z°¡-ÆR]{2,10}";
		
		System.out.println("hello java".matches(nameRule));
		System.out.println("È«±æµ¿".matches(nameRule));
		System.out.println("È«±æµ¿2".matches(nameRule));
		System.out.println("he llo".matches(nameRule));
	}

}
