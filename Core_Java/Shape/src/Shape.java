
public class Shape {
	private String name;
	public Shape(String name) {
		super();
		this.name = name;
	}
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
	
	
}
