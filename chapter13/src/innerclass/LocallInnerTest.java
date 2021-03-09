package innerclass;

class  Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num =100;
		
		class MyRunnable implements Runnable{
			int localNum =10;
			@Override
			public void run() {
				//num = 200; - 지역변수(getRunnable에서 선언한 num)는 상수로 바뀌므로 값 변경 x
				//i = 100; - 매개변수도 마찬가지
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = "+outNum);
				System.out.println("Outer.sNum = "+ Outer.sNum+"(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}


public class LocallInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}
