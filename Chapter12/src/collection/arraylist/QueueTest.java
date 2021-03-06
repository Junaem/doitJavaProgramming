package collection.arraylist;
import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		return(arrayQueue.remove(0));
	}
	public void showInfo() {
		for(String a : arrayQueue) {
			System.out.print(a);
			System.out.print(" ");
		}
		System.out.println();
	}
	public String get(int a) {
		return arrayQueue.get(a);
	}
}

public class QueueTest{
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		queue.showInfo();
		System.out.println(queue.deQueue());
		System.out.println(queue.get(1));
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
