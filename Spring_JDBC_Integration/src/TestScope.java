import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAO_jdbcTemplate;
import com.pojo.Employee;


public class TestScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		EmployeeDAO dao = (EmployeeDAO) context.getBean("template");
		
//		if(dao.addEmployee(new Employee(9999, 50000, "admin","docker")) >0)
//			System.out.println("Inserted ");
//		else
//			System.out.println("Not Inserted");
//		
		//System.out.println(dao.findEmployeeById(9999));
		
		//System.out.println(dao.updateEmployee(new Employee(9999, 60000, "admin","docker")));
		System.out.println(dao.findAllEMployees());
		
//		if(dao.deleteEmployee(9999)>0)
//		{
//			System.out.println("Deleted");
//		}
//		else
//			System.out.println("Not Deleted");
		
		List<Employee> list = new ArrayList<>();
		
		list = dao.findAllEMployees();
		
		System.out.println(list);
		
		
	}
	

}
