package Chapter4;

public class p123Q2 {
	public static void main(String[] args) {
		int a;
		int b;
		
		for(a = 2; a <= 9; a++) {
			
			if(a % 2 == 1) continue;
			
			for(b = 1; b <= 9; b++) {
				
				System.out.println(a + "X" + b + "=" + (a * b));
			}
			System.out.println();
		}
	}
}
