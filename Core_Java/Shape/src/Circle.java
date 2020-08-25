
public class Circle extends Shape implements Calculation {
	private int radius;
	
	public Circle()
	{
		
	}

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}

	@Override
	public String toString() {
		super.toString();
		return "Circle [radius=" + radius + "]";
	}
	
	

}
