package Chapter4;

public class p122example {
	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for(num = 1 ; ; num++) {
			
			sum += num;
			if(sum >= 500) break;
		}
		
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}
}
