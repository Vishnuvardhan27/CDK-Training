
public class TestStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students= new Student[7];
		students[0]=new EnggStudent(1, "Vishnu","Science", "SVU College");
		students[1]=new EnggStudent(2, "Hari","Science", "AISSMS");
		students[2]=new EnggStudent(3, "Srinu","Science", "FC College");
		students[3]=new BscStudent(4, "Taniya", "AI","Wadia College");
		students[4]=new BscStudent(5, "Sakshi", "ML","Wadia College");
		students[5]=new CommerceStudent(6, "Ash", "Account","SVU College");
		students[6]=new CommerceStudent(7, "Pranali", "Tally","Wadia College");
		
		
		Student s1=new CommerceStudent(6, "Ash", "Account","SVU College");
		if(search(students,s1))
			System.out.println("Student Found!!");
		else
			System.out.println("Student Not Found");
		
		Student s2=new EnggStudent(8, "Ashley", "Science","PSG College");
		if(search(students,s2))
			System.out.println("Student Found!!");
		else
			System.out.println("Student Not Found");
		

	}
	
	public static boolean search(Student [] students,Student student )
	{
		for (Student s:students)
		{
			if(s.getClass()==student.getClass())
			{
				if(s.equals(student))
					return true;
			}
			
		}
		
		return false;
		
	}

}
