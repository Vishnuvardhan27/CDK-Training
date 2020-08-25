
public class WageEmployee extends Employee {
	
	private int wages;
	private int no_of_hrs;
	
	public WageEmployee() {
		// TODO Auto-generated constructor stub
		//super();
		System.out.println("Wage Emp");
		wages=200;
		no_of_hrs= 8;
	}
	
	

	public WageEmployee(int empId,String empName,int wages, int no_of_hrs) {
		super(empId, empName);
		this.wages = wages;
		this.no_of_hrs = no_of_hrs;
	}



	public int getWages() {
		return wages;
	}

	public void setWages(int wages) {
		this.wages = wages;
	}

	public int getNo_of_hrs() {
		return no_of_hrs;
	}

	public void setNo_of_hrs(int no_of_hrs) {
		this.no_of_hrs = no_of_hrs;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Wages :"+wages+"\tNumber of hours Works : "+no_of_hrs);
	}
	
	
}
