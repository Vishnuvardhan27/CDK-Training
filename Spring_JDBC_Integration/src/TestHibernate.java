import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDAO;
import com.pojo.Employee;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO dao=(EmployeeDAO)context.getBean("hib_template");
		Employee e =new Employee(88,594549,"BCD","HXX");
		//dao.addEmployee(e);
//		e.setName("XXX");
//		dao.updateEmployee(e);
		System.out.println(dao.findEmployeeById(777));
		//dao.deleteEmployee(88);
	}

}
