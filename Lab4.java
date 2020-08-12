import java.util.Scanner;
import java.util.Arrays;

class Emp1
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


class EmpManager
{
	 private int count=5;
	 static int current=0;
	 private Emp[] e = new Emp[count];
	 Scanner sc = new Scanner(System.in);
	 
	 public void Create()
	 {
		 e[current] = new Emp();
		 System.out.println("Enter Employee Number : \n");
		 e[current].setEmpno(sc.nextInt());
		 System.out.println("Enter Employee Name : \n");
		 e[current].setEname(sc.next());
		 System.out.println("Enter Employee Salary : \n");
		 e[current].setSalary(sc.nextDouble());

		 current++;
	 }
	 
	 
	 
	 
	 public void Update()
	 {
		 int empid;
		 System.out.println("Enter Employee Number Who's Data you want to modify \n");
		 empid = sc.nextInt();
		 for (int i=0 ; i<count;i++)
		 {
			 if(e[i].getEmpno() == empid)
			 {
				 System.out.println("Enter Updated Details od Employee Number : "+ empid);
				 System.out.println("Enter Updated Employee Number : \n");
				 e[i].setEmpno(sc.nextInt());
				 System.out.println("Enter Updated Employee Name : \n");
				 e[i].setEname(sc.next());
				 System.out.println("Enter Updated Employee Salary : \n");
				 e[i].setSalary(sc.nextDouble());

			 }
			 else
			 {
				 System.out.println("No Such Employee With this Employee Numner "+ empid + "is there in the database \n");
			 }
			 break;
		 }
	 }
	 
	 
	 
	 
	 public void Delete()
	 {
		System.out.print("Enter Employee Number to be deleted: ");
		int empid = sc.nextInt();
		int tempno;
		String tempname;
		double tsalary;
		 for (int i=0 ; i<count;i++)
		 {
			 if(e[i].getEmpno() == empid )
			 {
					// shift elements to the left
					for(int j = i; j < count - 1; j++)
					{
						if(e[i+1].getEname() != null)
						{
							tempno = e[j+1].getEmpno();
							e[j].setEmpno(tempno);
							tempname = e[j+1].getEname();
							e[j].setEname(tempname);
							tsalary = e[j+1].getSalary();
							e[j].setSalary(tsalary);
						}
						break;
					}
			break;
			 }
			 
		 }	 
		e[current] = null;
		current--;
	 }
	 
	 
	 
	 public void Display()
	 {
		 System.out.println(Arrays.toString(e));
	 }
	 
	 
}




public class Lab4 {

	public static void main(String[] args) {
		EmpManager em = new EmpManager();
		int a=0;
		Scanner sc = new Scanner(System.in);
		
		while(a<5)
		{
		System.out.println("Menu For Employee Details \n"
				+ "1.Create \n"
				+ "2.Update \n"
				+ "3.Delete \n"
				+ "4.Display \n"
				+ "5.Exit \n"
				+ "Select A Option and Enter A number : ");
		a =sc.nextInt();
		switch(a)
		{
			case 1:
			    em.Create();
			    break;
			case 2:
			    em.Update();
			    break;
			case 3:
			    em.Delete();
			    break;
			case 4:
			    em.Display();
			    break;    
		}
		}
		sc.close();
	}

}
