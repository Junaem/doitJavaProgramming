package gameLevel_my;

public class Beginner extends Player {
	
	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	
	@Override
	public void jump(){
		System.out.println("Jump�� �� ������.");
	}
	
	@Override
	public void turn(){
		System.out.println("Turn�� �� ������");
	}
}
