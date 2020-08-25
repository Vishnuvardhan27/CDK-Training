
public class SalariedEmployee extends Employee{

	private long salary;
	private double incentive;
	private double ta;
	
	public SalariedEmployee(){
		
	}
	
	public SalariedEmployee(int empId,String empName,long salary, double incentive, double ta) {
		super(empId, empName);
		this.salary = salary;
		this.incentive = incentive;
		this.ta = ta;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public double getTa() {
		return ta;
	}
	public void setTa(double ta) {
		this.ta = ta;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Salary : "+salary+"\t Incentive :"+incentive+"\tTA : "+ta);
	}
	
	public double totalSalary()
	{
		return getSalary()+getIncentive()+getTa();
	}
	
	
}
