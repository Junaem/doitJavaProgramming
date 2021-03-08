package object;//p356, 21-03-05

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int num,String title){
		this.bookNumber = num;
		this.bookTitle = title;
	}
	
	@Override
	public String toString() {
		return bookTitle+","+bookNumber;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(123,"노르웨이의 숲");
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}
