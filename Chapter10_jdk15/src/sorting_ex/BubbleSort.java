package sorting_ex;

public class BubbleSort implements Sort{

	@Override
	public void ascedning(int[] a) {
		System.out.println("BubbleSort ascedning");
		
	}

	@Override
	public void descending(int[] d) {
		System.out.println("BubbleSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort 방식");
	}
	
	
}
