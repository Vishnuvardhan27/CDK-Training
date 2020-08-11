class Lab1Helper
{
	void printdemo(int no1, int no2){
		System.out.println("start of printdemo with " + no1 +",  " + no2);
		no1 = no1 + 10;
		no2 = no2+ 20;
		System.out.println("end of printdemo with " + no1 +",  " + no2);
	}
	String printdemo(String  s1,String s2){
		System.out.println("start of printdemo with " + s1 +",  " + s2);
		s1+= "appended1";
		s2+="appended2";
		System.out.println("end of printdemo with " + s1 +",  " + s2);
		return s1;
		
	}

	String m1(){
		System.out.println("m1 invoked");
		return "returning from m1";
	}
}
public class Lab1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Lab1Helper helper = new Lab1Helper();
		int no1, no2;
		no1 = 40;
		no2 = 30;
		System.out.println(" in main before function call = " + no1  + " ,  " + no2);
		helper.printdemo(no1, no2);
		System.out.println(" in main after function call = " + no1  + " ,  " + no2);
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