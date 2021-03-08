package Chapter4;

public class p123triangle {
	public static void main(String[] args) {
		
		int i;
		
		for(i = 0; i <= 4; i++) {
			
			for(int s = 1; s<=(4-i); s++) {
				System.out.print(' ');
			}
			for(int st = 4-i ; st<=4; st++) {
				System.out.print('*');	
			}	
			
			System.out.println();
			
		}
		
		
		
	}
}
