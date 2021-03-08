package witharraylist;
import java.util.ArrayList;
public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(10010,"이순신"));
		customerList.add(new Customer(10020,"신사임당"));
		customerList.add(new GoldCustomer(10030,"홍길동"));
		customerList.add(new GoldCustomer(10040,"이율곡"));
		customerList.add(new VIPCustomer(10050,"김유신",12345));
		
		System.out.println("===== 고객 정보 출력 =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName()+"님의 결제액: "+customer.showCalcInfo(price));
			System.out.println(customer.getCustomerName()+"님의 보너스 포인트: "+customer.bonusPoint);
		}
	}

}
 