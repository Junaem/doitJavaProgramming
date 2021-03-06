package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		memberArrayList.addMember(new Member(1001,"이지원"));
		memberArrayList.addMember(new Member(1002,"손민국"));
		memberArrayList.addMember(new Member(1003,"박서훤"));
		Member memberHong = new Member(1004,"홍길동");
		memberArrayList.addMember(memberHong); 

		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
	}

}
