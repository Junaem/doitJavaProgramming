package Chapter4;

public class p123Q5answer {
	public static void main(String[] args) {
		
		int lineCount = 9;  //다른 홀수 값을 넣어보세요
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
			
			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}
			else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
	}
}
