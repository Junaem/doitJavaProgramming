package chapter4_2021;

public class StarTri {

	public static void main(String[] args) {
		
		int f = 5;
		int i;
		int j;
		
		for(i=1;i<=f;i++) {
			for(j=f;j>0;j--) {
				if(j>i) {
					System.out.print(' ');
				}
				else 
					System.out.print('*');
			}
			
			
			System.out.println();
		}

	}

}
