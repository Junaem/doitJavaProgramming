package chapter4_2021;

public class P110while {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			sum += num;
			
			if(num>=10) {
				break;
			}
			
			num++;
		}
		
		
		System.out.println(num);
		System.out.println(sum);
		
		
		
	}
}
