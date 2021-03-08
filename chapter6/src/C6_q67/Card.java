package C6_q67;

public class Card {
	private int cardNum;
	private static int serialNum = 10000;
	String name;
	
	Card(){
		serialNum++;
		cardNum = serialNum;
	}
	
	public int getCardNum() {
		return cardNum;
	}
	
	public void setCardNum(int num) {
		this.cardNum = num;
	}
	
}
