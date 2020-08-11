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

public class Lab3 {

	public static void main(String[] args) {
		Emp[] e = new Emp[2];
		System.out.println("Please Enter 5 Employee Details :");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			e[i] = new Emp();
			e[i].setEmpno(sc.nextInt());
			e[i].setEname(sc.next());
			e[i].setSalary(sc.nextDouble());
		}
		sc.close();
		System.out.println("Employee Details You have Entered are :");
		
			System.out.println(Arrays.toString(e));
		
	}

}
