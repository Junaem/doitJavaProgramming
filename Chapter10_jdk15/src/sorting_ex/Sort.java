package sorting_ex;

public interface Sort {
	public void ascedning(int[] a);
	public void descending(int[] d);
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	}
	
}
