package polymorphism;

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
		return super.showCustomerInfo()+" ��� ���� ��ȣ�� "+agentID+"�Դϴ�.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}