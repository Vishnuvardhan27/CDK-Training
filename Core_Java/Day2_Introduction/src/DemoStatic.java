
public class DemoStatic {
	private int id;
	private String name;
	static private int count;
	static{
		System.out.println("Static Block");
		count=0;
	}
	{
		System.out.println("Object Block");
	}
	DemoStatic(){
		this.id = 10;
		this.name = "name";
		System.out.println("Constructor");
		count++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DemoStatic(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		count++;
	}
	
	public void display()
	{
		System.out.println("Name : "+name+"Id : "+id+"Count :"+count);
	}
	static public void displayS()
	{
		System.out.println("Count :"+count);
	}
	
	
}
