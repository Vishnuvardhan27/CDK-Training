import java.util.List;
import java.util.Scanner;
import com.interfaces.PersonIOImpl;
import com.pojo.Person;

public class TestMain {

	public static void main(String[] args) {
	int choice,pId,flag=0;
	String name;
	Scanner sc=new Scanner(System.in);
	PersonIOImpl person=new PersonIOImpl();
	List<Person>persons=person.getPersons();
	Person p;
	while(true){
		System.out.println("MENU\n1.add Data\n2.update person\n3.find person\n4.Remove person\n5.Display all\n6.exit");
		System.out.print("Enter your choice:");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			  System.out.print("Enter pId:");
			  pId=sc.nextInt();
			  System.out.print("Enter name:");
			  name=sc.next();
			  p=new Person(pId,name);
			 persons=person.addPerson(persons, p);
			 person.displayPersons(persons);
			  break;
		case 2:
			System.out.print("Enter id:");
			pId=sc.nextInt();
			 System.out.print("Enter name:");
			 name=sc.next();
			p= person.updatePerson(pId, persons, name);
			 System.out.println(p);
			 break;
		case 3:
			System.out.print("Enter id:");
			pId=sc.nextInt();
			p=person.findById(pId, persons);
			System.out.println(p);
			break;
		case 4:
			System.out.print("Enter id:");
			pId=sc.nextInt();
			person.removePerson(pId, persons);
			break;
		case 5:
			person.displayPersons(persons);
			break;
		case 6:
			flag=1;
			break;
		}
		if(flag==1)
			break;
	}
	}
}
