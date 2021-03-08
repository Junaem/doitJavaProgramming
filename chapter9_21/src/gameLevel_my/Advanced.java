package gameLevel_my;

public class Advanced extends Player{
	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}
	
	@Override
	public void jump(){
		System.out.println("높이 Jump합니다.");
	}
	
	@Override
	public void turn(){
		System.out.println("Turn할 줄 모르지롱");
	}
}
