
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(5);
		System.out.println(c.toString());
		System.out.println("Area is :"+c.area());
		System.out.println("perimeter is :"+c.perimeter());
		
		Rectangle r=new Rectangle(2,5);
		System.out.println(r.toString());
		System.out.println("Area is :"+r.area());
		System.out.println("perimeter is :"+r.perimeter());
		
		Square s=new Square(5);
		System.out.println(s.toString());
		System.out.println("Area is :"+s.area());
		System.out.println("perimeter is :"+s.perimeter());
		
		

	}

}
