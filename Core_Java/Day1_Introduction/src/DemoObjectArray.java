
public class DemoObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 [] obj = new Demo1[5];
		obj[0]= new Demo1();
		obj[1]= new Demo1(1,"Delhi");
		obj[2]= new Demo1(2,"HYD");
		obj[3]= new Demo1(3,"Pune");
		obj[4]= new Demo1(4,"Mumbai");

		for (Demo1 d :obj)
		{
			System.out.println(d.getNumber()+"		");
			System.out.println( d.getName());
		}
	}

}
