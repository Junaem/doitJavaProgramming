package witharraylist;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID,String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {
		int saledPrice = price - (int)(price*saleRatio);
		bonusPoint += saledPrice*bonusRatio;
		return saledPrice;
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo()+" 담당 상담원 번호는 "+agentID+"입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
