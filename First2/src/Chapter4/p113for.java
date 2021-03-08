package Chapter4;

public class p113for {
	public static void main(String[] args) {
		
		int num = 1; //for는 선언을 먼저 해야하는듯?
		
		for(num = 1; num <= 10; num += 3) {
			System.out.println(num);
		}
		
		System.out.println("");
		
		int sum;
		int i;
		
		for(sum = 0, i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
