package c7_1;
import java.util.ArrayList;
public class ArrayListTest {//p224 C7_4������.
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���","������"));
		library.add(new Book("���̾�","�츣�� �켼"));
		library.add(new Book("���","���ù�"));
		library.add(new Book("����","�ڰ渮"));
		library.add(new Book("��Ͽ���","����"));
		
		for(int i=0; i<library.size();i++) {
			Book a = library.get(i);
			a.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=====���� for�� ��� ===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}
}
