package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		//System.out.println("하위 클래스 생성자 호출");//생성 순서 테스트용 
	}
	

	public int getAgentID() {
		return agentID;
	}
}
