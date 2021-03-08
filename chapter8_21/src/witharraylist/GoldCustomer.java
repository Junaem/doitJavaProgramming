package witharraylist;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		int saledPrice = price - (int)(price*saleRatio);
		bonusPoint += saledPrice*bonusRatio;
		return saledPrice;
	}
}
