
abstract public class Employee {
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public Employee()
	{
		System.out.println("Emp");
		empId=100;
		empName="Vishnu";
	}
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void display()
	{
		System.out.println("Employee ID : "+empId+"\tEmployee Name : "+empName);
	}
	

}
