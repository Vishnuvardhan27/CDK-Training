
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WageEmployee w=new WageEmployee();
//		w.display();	
//		WageEmployee w1=new WageEmployee(1,"Ashley",300,100);
//		w1.display();
		
		
		
		SalariedEmployee se = new SalariedEmployee(1,"Vishnu",100000,5000,6000);
		se.display();
		System.out.println("Total Salary is : "+se.totalSalary());
	}

}

