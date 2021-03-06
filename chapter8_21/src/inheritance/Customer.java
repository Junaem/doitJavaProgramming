package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	/*public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출 ");
	}*/
	public Customer(int customerID,String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이고, 보너스 포인트는 "+bonusPoint+"입니다.";
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
