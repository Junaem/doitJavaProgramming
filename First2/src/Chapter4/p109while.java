package Chapter4;

public class p109while {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while (num <= 10) {
			sum = num + sum;
			++num;
			
		}
		
		System.out.println("1부터 " + (num - 1) + "까지의 합은 " + sum + "입니다.");
	}
}
