package gameLevel;

public class MainBoard {
	public static void main(String []args) {
		AdvancedLevel aLevel = new AdvancedLevel();
		SuperLevel sLevel = new SuperLevel();
		
		Player player = new Player();
		player.play(1);
	
		player.upgradeLevel(aLevel);
		player.play(2);
		
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
