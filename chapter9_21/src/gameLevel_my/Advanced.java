package gameLevel_my;

public class Advanced extends Player{
	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	
	@Override
	public void jump(){
		System.out.println("���� Jump�մϴ�.");
	}
	
	@Override
	public void turn(){
		System.out.println("Turn�� �� ������");
	}
}
