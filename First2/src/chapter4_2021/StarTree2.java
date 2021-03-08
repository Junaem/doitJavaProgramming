package chapter4_2021;

public class StarTree2 {

	public static void main(String[] args) {
		
		int input = 5;
		int fLine = input *2 +1; 
		int lin;	//줄
		int sta;	//별
		int spa;	//스페이스
		
		
		for(lin=1; lin<=fLine-2;lin++) {
			
			if(lin<=fLine/2) {
				for(spa=input;spa>lin;spa--) {
					System.out.print(' ');
				}
				for(sta=1;sta<=lin*2-1;sta++) {
					System.out.print('*');
				}
			}
			else {
				for(spa=input;spa<=lin-1;spa++) {
					System.out.print(' ');
				}			
				for(sta=1; sta<=2*fLine-lin*2-3;sta++) {
					System.out.print('*');
				}
			}
			
			
			
			
			System.out.println();
		}

	}

}
