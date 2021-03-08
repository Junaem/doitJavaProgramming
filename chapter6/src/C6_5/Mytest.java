package C6_5;

public class Mytest {
	public static void main(String[] args) {
	
		int lineC = 7;
		int spaceC = lineC / 2;
		int starC = 1;
		
		for(int a=1;a<=lineC;a++) {	
		
			for(int b=1; b<=spaceC; b++) {
				System.out.print(" ");
			}
			for (int i=1; i<=starC ;i++) {
				System.out.print('*');
			}
			for(int b=1; b<=spaceC; b++) {
				System.out.print(" ");
			}
			
			System.out.println();
			if(a<=lineC/2) {
				starC+=2;
				spaceC--;
				}
			else {
				starC-=2;
				spaceC++;
				}
		}
	}
}
