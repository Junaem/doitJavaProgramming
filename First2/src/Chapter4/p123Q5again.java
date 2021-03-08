package Chapter4;

public class p123Q5again {

	public static void main(String[] args) {
		
		int line = 9;
		int space = line/2;
		int star = 1;
				
				for(int i=1; i <= line; i++) {
					
					for(int s=1; s<=space;s++) {
						System.out.print(' ');
					}
					for(int st=1; st<=star; st++) {
						System.out.print('*');
					}
					for(int s=1; s<=space;s++) {
						System.out.print(' ');
					}
					System.out.println();
							
					if(i<=line/2) {
						space--;
						star+=2;}
					
					else {
						space++;
						star-=2;
					}
				}
				
				
				
	}
}
