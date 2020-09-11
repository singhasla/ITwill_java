package ch06;

public class Book {

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

