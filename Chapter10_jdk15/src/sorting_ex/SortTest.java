package sorting_ex;
import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요(B,H,Q)");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch=='B') {
			sort = new BubbleSort();
		}
		else if(ch=='H') {
			sort = new HeapSort();
		}
		else if(ch=='Q') {
			sort = new QuickSort();
		}
		else
			System.out.println("지원하지 않는 정렬 방식");
		
		int[] arr = new int[10];
		sort.ascedning(arr);
		sort.descending(arr);
		sort.description();
	}

}
