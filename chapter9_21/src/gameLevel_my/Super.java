package gameLevel_my;

public class Super extends Player {
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}
	
	@Override
	public void jump(){
		System.out.println("아주 높이 Jump합니다.");
	}
	
	@Override
	public void turn(){
		System.out.println("한 바퀴 돕니다.");
	}
}
