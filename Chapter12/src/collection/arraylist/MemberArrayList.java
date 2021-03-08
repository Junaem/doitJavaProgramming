package collection.arraylist;

import java.util.ArrayList;
import collection.Member;
import java.util.Iterator;
public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId==memberId) {
				arrayList.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
		/*Iterator 안쓰고 만들었던 것들
		 * for(Member m : arrayList) { int tempId = m.getMemberId(); if(tempId ==
		 * memberId) { arrayList.remove(m); return true; } }
		 * System.out.println(memberId+"가 존재하지 않습니다."); return false;
		 */
	}
	
	public void showAllMember() {
		for(Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println();
	}
}
