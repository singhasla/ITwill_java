package ch06;

public class P268_MemberServiceExample {

	public static void main(String[] args) {
		
		P268_MemberService memberService = new P268_MemberService();
		boolean result = memberService.login("hong","12345");
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		}else{
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}

	}

}
