package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException{
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R: 한 명씩 차례대로 할당.");
		System.out.println("L: 대기가 가장 적은 상담원에게 할당.");
		System.out.println("P: 우선순위가 높은 고객 먼저 할당.");
		
		int ch = System.in.read();
		Scheduler scheduler=null;
		
		if(ch=='R') {
			scheduler = new RoundRobin();
		}
		else if(ch=='L') {
			scheduler = new LeastJob();
		}
		else if(ch=='P') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("지원하지 않는 기능");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
