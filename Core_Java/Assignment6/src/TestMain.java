import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.interfaces.EmployeeOperationImpl;
import com.io.EmpIOImpl;
import com.pojo.Employee;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		List<Employee>empList=new ArrayList<>();
		EmpIOImpl e1=new EmpIOImpl();
		EmployeeOperationImpl e2 =new EmployeeOperationImpl();
		Employee e3=new Employee();
		Scanner sc = new Scanner(System.in);
		while(a<6){
			System.out.println("Menu\n"
					+ "1.Add Employee\n"
					+ "2.Update Employee\n"
					+ "3.Find Employee By ID\n"
					+ "4.Find All Employees\n"
					+ "5.Delete Employee"
					+ "Enter Valid Choice Between 1 to 5");
			a=sc.nextInt();
			int id;
			String name;
			switch(a)
			{
			case 1:
				e3=e1.readFromUser();
				e2.addEmployee(e3);
				break;
			case 2:
				System.out.print("Enter id Of Employee To be Added ::");
				id=sc.nextInt();
				System.out.print("Enter name of Employee To be Added :");
				name=sc.next();
				e3=e2.updateEmployee(id, name);
				System.out.println(e3);
				break;
			case 3:
				System.out.print("Enter id:");
				id=sc.nextInt();
				e3=e2.findEmployeeById(id);
				System.out.println(e3);
				break;
			case 4:
				empList=e2.findAllEmployees();
				empList.forEach(System.out::println);
				break;
			case 5:
				System.out.print("Enter id:");
				id=sc.nextInt();
				e3=e2.deleteEmployee(id);
				System.out.println(e3);
				break;
				
			}
		}
		System.out.println("Thank You For Using the System !!");
		sc.close();
			
	}

}
