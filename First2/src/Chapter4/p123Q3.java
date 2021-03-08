package Chapter4;

public class p123Q3 {
	public static void main(String[] args) {
		
		int a;
		int b;
		
		for(a = 2; a <= 9; a++) {
			
			
			for(b = 1; b <= 9; b++) {

				if(a < b) break;
				System.out.println(a + "X" + b + "=" + (a * b));
			}
			System.out.println();
		}
		
	}
}
