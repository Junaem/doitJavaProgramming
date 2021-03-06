package gameLevel_my;

public abstract class Player {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	public final void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}
}
