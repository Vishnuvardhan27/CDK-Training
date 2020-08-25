
public class Rectangle extends Shape {
	
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
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	public void display(){
		System.out.println("Length of Rectangle is : "+length+
				"\nBredth of Rectangle is : "+breadth);
	}

}
