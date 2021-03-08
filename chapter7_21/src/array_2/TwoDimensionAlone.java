package array_2;

public class TwoDimensionAlone {

	public static void main(String[] args) {
		char[][] alphabets = new char[2][13];
		
		char ch = 'a';
		
		for(int i=0;i<alphabets.length;i++) {
			for(int j=0;j<alphabets[i].length;j++,ch++) {
				alphabets[i][j] = ch;
				System.out.print(alphabets[i][j]+" ");
			}
			System.out.println();
		}	
	}

}
