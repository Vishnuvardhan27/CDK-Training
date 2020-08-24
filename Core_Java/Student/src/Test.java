
public class Test {

	public static void main(String[] args) {
		StudentManipulation obj = new StudentManipulation();
		Student students[] = obj.CreateStudents();
		
		System.out.println("List of All Students");
		
		for(Student st : students) {
			st.display();
		}

		System.out.println("*****************");
		
		System.out.println("Topper is :");
		Student topper = obj.findMax(students);
		topper.display();
	}

}
