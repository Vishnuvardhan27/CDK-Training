
public class StudentManipulation {

	Student[]  CreateStudents(){
		
		Student[] students = new Student[3];
		students[0] = new Student();
		students[0].setId(1);
		students[0].setName("Vishnu");
		students[0].setAge(22);
		students[0].setMarks(new int[]{100 , 100  , 100 , 30 , 25});
        
		students[1] = new Student();
		students[1].setId(222);
		students[1].setName("Hari");
		students[1].setAge(24);
		students[1].setMarks(new int[]{500 , 43  , 20 , 12 , 28});
		
		students[2] = new Student();
		students[2].setId(333);
		students[2].setName("Shree");
		students[2].setAge(21);
		students[2].setMarks(new int[]{23 , 21  , 600 , 40 , 24});
		return students;
	}
	void total(Student student)
	{
		int total = 0;
		int[] temp = student.getMarks();
		for (int m : temp) {

			total += m;
		}
		student.setTotal(total);

	}
	
	
	
	Student findMax(Student[] students)
	{	
		int max=Integer.MIN_VALUE;
		Student top = new Student();
		for (Student s : students)
		{
			total(s);
			if(s.getTotal() > max) {
				top = s;
				max=s.getTotal();
			}
		}
		
		
		return top; 
	}
}
