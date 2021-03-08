package Chapter4;

public class p102switch {

	public static void main(String[] args) {

		int rank = 3;
		char mColor;
		
		switch(rank) {
			case 1 : mColor = 'G';
			case 2 : mColor = 'S';
			default : mColor = 'B';
		}
		
		System.out.println(mColor);
		

	}

}
