package ch06;

public class Test2 {

	public static void main(String[] args) {
		/*
		Book book1;
		book1 = new Book();	//객체생성할 때 딱 한번만 생성자 이용
							//book1.Book(); <= X, 사용불가		
		book1.title = "홍길동전";
		book1.author = "허균";
		book1.price = 10000;
		book1.stockNum = 10;
		*/
		Book book1 = new Book("홍길동전", "허균", 10000, 10);	//생성자 이용해서 객체 생성
		
		//System.out.println(book1.author+" "+book1.title+" "+book1.price);
		book1.printInfo();
		System.out.println(book1.stockNumber(3));
		
		///////////////////////////////////////////////////////////////////
		
		Book book2 = new Book("열하일기", "박지원", 15000, 30);
		/*
		Book book2 = new Book();
		book2.title = "열하일기";
		book2.author = "박지원";
		book2.price = 15000;
		book2.stockNum = 30;
		*/
		//System.out.println(book2.author+" "+book2.title+" "+book2.price);
		book2.printInfo();
		System.out.println(book2.stockNumber(12));
		
		
	}

}
