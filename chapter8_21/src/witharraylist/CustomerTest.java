package witharraylist;
import java.util.ArrayList;
public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(10010,"�̼���"));
		customerList.add(new Customer(10020,"�Ż��Ӵ�"));
		customerList.add(new GoldCustomer(10030,"ȫ�浿"));
		customerList.add(new GoldCustomer(10040,"������"));
		customerList.add(new VIPCustomer(10050,"������",12345));
		
		System.out.println("===== �� ���� ��� =====");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		int price = 10000;
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName()+"���� ������: "+customer.showCalcInfo(price));
			System.out.println(customer.getCustomerName()+"���� ���ʽ� ����Ʈ: "+customer.bonusPoint);
		}
	}

}
 