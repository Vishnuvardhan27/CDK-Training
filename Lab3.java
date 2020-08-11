import java.util.Scanner;
import java.util.Arrays;
class Emp
{
	private int empno;
	private String ename;
	private double salary ;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return empno + " "+ ename + " " + salary + "\n" ;
		
	}
}

public class Lab3{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Please Enter 5 Employee Details :");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			e[i] = new Emp();
			e[i].setEmpno(sc.nextInt());
			e[i].setEname(sc.next());
			e[i].setSalary(sc.nextDouble());
		}
		
		
		
		
		//jvisualvm Test
		System.out.println("Please Enter A Number to Start Memory Allocation and test jvisualvm");
		sc.nextInt();
		for(int i=1;i<count;i++)
		{
			e[i-1] = new Emp();
			e[i-1].setEmpno(i);
			e[i-1].setEname("Nameof " +i);
			e[i-1].setSalary(i*1000);
		}
		System.out.println("Memory Allocation is Done");
		//System.out.println("Employee Details You have Entered are :");
		
		//System.out.println(Arrays.toString(e));*/
		
		
		
		
		//Check Garbage Collector Working
		System.out.println("1st Call");
		call();
		System.out.println("2st Call");
		call();
		System.out.println("Call to GC");
		System.gc();
		System.out.println("3st Call");
		call();
		System.out.println("In Main Class");
		System.out.println("Enter a Number to stop the Execution ");
		sc.nextInt();
		sc.close();
		
	}
	
	// Check Garbage Collector Code
	 public static void call()
	{
		 int count=999999;
		Emp[] e = new Emp[count];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter A Number to Start Memory Allocation and test jvisualvm");
		sc.nextInt();
		for(int i=1;i<count;i++)
		{
			e[i-1] = new Emp();
			e[i-1].setEmpno(i);
			e[i-1].setEname("Nameof " +i);
			e[i-1].setSalary(i*1000);
		}
		System.out.println("Memory Allocation is Done");
		sc.close();
	}

}
