package gameLevel_my;

public class Super extends Player {
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}
	
	@Override
	public void jump(){
		System.out.println("���� ���� Jump�մϴ�.");
	}
	
	@Override
	public void turn(){
		System.out.println("�� ���� ���ϴ�.");
	}
}