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
		return customerName +" ���� ����� "+customerGrade+"�̰�, ���ʽ� ����Ʈ�� "+bonusPoint+" �� �Դϴ�.";
	}
	
	public String showCalcInfo(int price) {
		return customerName+" ���� "+this.calcPrice(price)+"�� �����ϼ̽��ϴ�.";
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
