
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s=new Circle(5);
		System.out.println("Area of "+s.getName()+" is : "+s.calculateArea());
		((Circle)s).display();
		Shape s2 = new Rectangle(2,4);
		System.out.println("Area of "+s2.getName()+" is : "+s2.calculateArea());
		((Rectangle)s2).display();
	}

}
