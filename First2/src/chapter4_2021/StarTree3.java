package chapter4_2021;

public class StarTree3 {

	public static void main(String[] args) {
		
		int lin = 7;
		int i;
		int j;
		
		for(i=1; i<=lin; i++) {
			for(j=lin-i;j>=0;j--) {
				
				if(j-i>=0) {
					System.out.print(' ');
				}
				else if(j-i<0) {
					System.out.print('*');
				}
			}
			System.out.println();
		}

	}

}
