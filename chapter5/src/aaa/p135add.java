package aaa;


	public class p135add {
		
		public int add(int num1, int num2) {
			int result;
			result  = num1 + num2;
			return result;
			}
		
		
		public int getTenTotal(){
			int sum = 0;
			
			for(int i = 1; i<=10; i++) {
				sum += i;
			}
			return sum;		
		}
		void divide(int num1, int num2) {
			if(num2 == 0) {
				System.out.println("������ ���� 0�� �� �� �����ϴ�.");
				return;
			}
			else {
				int result = num1/num2;
				System.out.println(num1 + "/" + num2 + "=" + result + "�Դϴ�.");
			}
					
		}
		
		
}
