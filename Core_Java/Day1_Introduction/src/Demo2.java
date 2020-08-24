
public class Demo2 {
	public static void main(String args[])
	{
		 Demo1 d = new Demo1();
		 System.out.println("Default Construtor");
		 d.display();
		 Demo1 d1 = new Demo1(1,"Vishnu");
		 d1.display();
		 System.out.println("Before Update");
		 d1.setNumber(30);
		 d1.display();
		 System.out.println("Number Got for Getter Method " + d1.getNumber());
		 System.out.println("Name Got for Getter Method " + d1.getName());
	}
}
