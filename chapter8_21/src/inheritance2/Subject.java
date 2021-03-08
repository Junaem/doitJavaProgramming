package inheritance2;

public class Subject {
	private int subjectID;
	private int subjectName;
	
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int ID) {
		this.subjectID = ID;
	}
	public int getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(int name) {
		this.subjectName = name;
	}
	public void showSubjectInfo() {
		System.out.println(subjectID+","+subjectName);
	}
}
