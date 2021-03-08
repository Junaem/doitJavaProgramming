package witharraylist;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName +" 님의 등급은 "+customerGrade+"이고, 보너스 포인트는 "+bonusPoint+" 점 입니다.";
	}
	
	public String showCalcInfo(int price) {
		return customerName+" 님이 "+this.calcPrice(price)+"원 지불하셨습니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int ID) {
		this.customerID = ID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String name) {
		this.customerName = name;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String grade) {
		this.customerGrade = grade;
	}
}
