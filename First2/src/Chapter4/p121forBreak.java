package Chapter4;

public class p121forBreak {
	public static void main(String[] args) {
			
		int num;
		int sum;
		
		for (num = 0, sum = 0; ; num++) {
			sum += num;
			if(sum >= 100) break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
}
