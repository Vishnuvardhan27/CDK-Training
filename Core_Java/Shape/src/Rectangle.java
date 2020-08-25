
public class Rectangle extends Shape implements Calculation {
	private int length,breadth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*length*breadth;
	}

	@Override
	public String toString() {
		super.toString();
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}


}
