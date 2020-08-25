
public class BscStudent extends Student {

	private String specialization;
	private String collageName;
	
	public BscStudent() {
		// TODO Auto-generated constructor stub
	}

	public BscStudent(int rollno, String name,String specialization, String collageName) {
		super(rollno,name);
		this.specialization = specialization;
		this.collageName = collageName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
		return "BscStudent [specialization=" + specialization + ", collageName=" + collageName + "]";
	}
	 @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		 BscStudent bscStudent = (BscStudent)obj;
		return this.getName().equals(bscStudent.getName());
	}
	
}
