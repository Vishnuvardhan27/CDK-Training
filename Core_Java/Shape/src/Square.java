
public class Square extends Shape implements Calculation {
	private int side;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	public Square(int side) {
		super("Circle");
		this.side = side;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

	@Override
	public String toString() {
		super.toString();
		return "Square [side=" + side + "]";
	}
	

}
