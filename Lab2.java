class Coordinate{
	int no1;
	int no2;

}
class Lab2Helper
{
	void printdemo(Coordinate fco){
		System.out.println("start of printdemo with " + fco.no1 +",  " + fco.no2);
		fco.no1 = fco.no1 + 10;
		fco.no2 = fco.no2+ 20;
		System.out.println("end of printdemo with " + fco.no1 +",  " + fco.no2);
//		co = new coordinate();
//		fco.no1 = 44444; fco.no2= 88888;
	}
	void printdemo(String  s1,String s2){
		System.out.println("start of printdemo with " + s1 +",  " + s2);
		s1+= "appended1";
		s2+="appended2";
		System.out.println("end of printdemo with " + s1 +",  " + s2);
	}

	String m1(){
		System.out.println("m1 invoked");
		return "returning from m1";
	}
}
public class Lab2 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Lab2Helper helper = new Lab2Helper();
		Coordinate co = new Coordinate();
		co.no1 = 40;
		co.no2= 30;
		System.out.println(" in main before function call = " + co.no1  + " ,  " + co.no2);
		helper.printdemo(co);
		System.out.println(" in main after function call = " + co.no1  + " ,  " + co.no2);
		String s1, s2;
		s1 = "One";
		s2 = "Two";
		
		System.out.println("in main before function call " + s1 +",  " + s2);
		helper.printdemo(s1, s2);
		System.out.println("in main after function call " + s1 +",  " + s2);
		
		
	//	String s = helper.m1();
	//	System.out.println(" s = " + s);
	}

}