package Chapter4;

public class p123Q4answer {

	public static void main(String[] args) {
		
		int lineCount = 4;  
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			spaceCount-=1;
			starCount+=2;
			System.out.println();
		}
	}

}
