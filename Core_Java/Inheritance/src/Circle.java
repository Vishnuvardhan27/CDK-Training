
public class Circle extends Shape {
	private int radius;
	
	public Circle()
	{
		
	}

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}
	
	public double calculateArea()
	{
		return 3.14*radius*radius;
	}
	
	public void display(){
		System.out.println("Circle's Radis is : "+radius);
	}

}
