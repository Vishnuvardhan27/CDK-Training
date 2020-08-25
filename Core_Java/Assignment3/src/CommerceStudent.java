
public class CommerceStudent extends Student {
	private String majorSubject;
	private String collageName;
	public CommerceStudent() {
		// TODO Auto-generated constructor stub
	}
	public CommerceStudent(int rollno, String name,String majorSubject, String collageName) {
		super(rollno,name);
		this.majorSubject = majorSubject;
		this.collageName = collageName;
	}
	public String getMajorSubject() {
		return majorSubject;
	}
	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	@Override
	public String toString() {
		super.toString();
		return "CommerceStudent [majorSubject=" + majorSubject + ", collageName=" + collageName + "]";
	}
	
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		 CommerceStudent  commerceStudent = (CommerceStudent)obj;
		return this.getName().equals(commerceStudent.getName());
	}
	
	
	
	

}
