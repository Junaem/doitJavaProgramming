package c7_1;
import java.util.ArrayList;
public class ArrayListTest {//p224 C7_4내용임.
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥","조정래"));
		library.add(new Book("데미안","헤르만 헤세"));
		library.add(new Book("어떻게","유시민"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("얼니왕자","생텍"));
		
		for(int i=0; i<library.size();i++) {
			Book a = library.get(i);
			a.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=====향상된 for문 사용 ===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
