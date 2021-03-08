package chapter4_2021;

public class StarTree {

	public static void main(String[] args) {
		
		int a;
		int b;
		int s;
		
		for(a=1; a<=5; a++) {
			
			for(s=4; s>=a; s--) {
				System.out.print(' ');
			}
			
			for(b=1; b<a*2; b++) {
				System.out.print('*');
			}
			
			System.out.println();
			
			
		}

	}

}
