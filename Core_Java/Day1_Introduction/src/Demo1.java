

public class  Demo1 {
	private int number;
	private String name;
	
	public Demo1()
	{
		number =10;
		name ="CDK";
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Demo1(int number , String name)
	{
		this.number =number;
		this.name =name;
	}
	
	
	public void display()
	{
		System.out.println(number+"\t"+name);
	}
	
	
}
