package aaa;

class p159Stu {
	
	int studentID;
	private String StudentName;
	p161Sub korean;
	p161Sub math;
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String pname) {
		StudentName = pname;
	}
	
	public static void main(String[] args) {
		p159Stu ㄱ = new p159Stu();
		ㄱ.setStudentName("흠");
		
		System.out.println(ㄱ.getStudentName());
	}
}
