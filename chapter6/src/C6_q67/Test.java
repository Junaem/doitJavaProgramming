package C6_q67;

public class Test {
	public static void main(String[] args) {
		
		Company company = Company.getInstance();  //�̱��� ����
		
		Card myCard = company.createCard();   //�޼��忡�� Car ����
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNum());    //10001  ���
		System.out.println(yourCard.getCardNum());  //10002  ���
	}
}
