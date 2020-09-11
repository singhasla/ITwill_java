package ch06;

public class Book {

	Book(String t, String a, int p, int n){
		
		title = t;
		author = a;
		price = p;
		stockNum = n;
	}	//디폴트(default)생성자
	
	String title;
	String author;
	int price;
	int stockNum;

	void printInfo() {
		System.out.println(author+" "+title+" "+price+" "+stockNum);
	}
	
	int stockNumber(int sellNum){
		return stockNum - sellNum;
	}
}

