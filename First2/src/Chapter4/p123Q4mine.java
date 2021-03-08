package Chapter4;

public class p123Q4mine {

	public static void main(String[] args) {

		int line = 4;
		int star = 1;
		int spacecount = 3;
		int lv = 1;
		
		if(lv <= 4) {
			for(int li1 = 1; ; li1++) {
		
				for(int spa = 1; spa <= spacecount; spa++) {
					System.out.print(' ');
				}
				for(int sta = 1; sta <= star; sta++) {
					System.out.print('*');
				}
				for(int spa = 1; spa <= spacecount; spa++) {
					System.out.print(' ');
				}

				++lv;
				
				if(li1 >= line) break;
			
				star+=2;
				spacecount--;
				
				System.out.println();
			}
		}
		
		
		
		else {
			int a = star;
			
			for(int li1=1; ; li1++) {
				
				for(int spa = 0; spa <= spacecount; spa++) {
					System.out.print(' ');
				}
				for(int sta = a; sta >= star; sta--) {
					System.out.print('*');
				}
				for(int spa = 0; spa <= spacecount; spa++) {
					System.out.print(' ');
				}

				if(li1 >= line) break;
			
				star-=2;
				spacecount++;
				lv++;
				
				System.out.println();
			}
		}
		int b = 15;
		System.out.println();
		System.out.println();
		System.out.println(b/2);
	}

}
