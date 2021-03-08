package sorting_ex;

public class QuickSort implements Sort{

	@Override
	public void ascedning(int[] a) {
		System.out.println("QuickSort ascedning");
		
	}

	@Override
	public void descending(int[] d) {
		System.out.println("QuickSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort 방식");
	}
	
	
}
