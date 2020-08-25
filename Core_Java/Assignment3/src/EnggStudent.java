
public class EnggStudent extends Student {

	private String stream;
	private String collageName;
	
	public EnggStudent() {
		// TODO Auto-generated constructor stub
	}

	public EnggStudent(int rollno, String name,String stream, String collageName) {
		super(rollno,name);
		this.stream = stream;
		this.collageName = collageName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
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
		return "EnggStudent [stream=" + stream + ", collageName=" + collageName + "]";
	}
	
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		 EnggStudent  enggStudent = (EnggStudent)obj;
		return this.getName().equals( enggStudent.getName())&&
				this.getRollno()==enggStudent.getRollno() &&
				this.getStream().equals(enggStudent.getStream())&&
				this.getCollageName().equals(enggStudent.getCollageName());
	}
	
	
}
