package innerclass;

class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			@Override
			public void run() {
				//num =200;
				//i =10;
				System.out.println(i);
				System.out.println(num);
			}
		};//클래스(runnable)의 끝이라서 쓴다고 함.
	}//getRunnalbe종료
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		out.runner.run();
	}
}
