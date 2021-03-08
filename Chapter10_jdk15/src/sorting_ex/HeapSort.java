package sorting_ex;

public class HeapSort implements Sort{

	@Override
	public void ascedning(int[] a) {
		System.out.println("HeapSort ascedning");
		
	}

	@Override
	public void descending(int[] d) {
		System.out.println("HeapSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort 방식");
	}
	
	
}
