package Chapter4;

public class p111dowhile {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do {
			sum = num + sum;
			++num;	//이거를 먼저 한번 하고 뒤에 조건문 반복함
		}
		while (num <= 10);
		
		System.out.println("1부터 " + (num - 1) + "까지의 합은 " + sum + "입니다.");
	}
}
