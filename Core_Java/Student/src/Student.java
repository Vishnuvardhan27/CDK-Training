
public class Student{
	
		private String name;
		private int age;
		private int id;
		private int std;
		private int total;
		private int[] marks= new int[5];
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getStd() {
			return std;
		}
		public void setStd(int std) {
			this.std = std;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public int[] getMarks() {
			return marks;
		}
		public void setMarks(int[] marks) {
			this.marks = marks;
		}
		
		public void display()
		{
			System.out.println(id+"	"+name +"	"+age+"	"+std+"	");
			System.out.println("Marks : ");
			for(int var : marks)
			{
				System.out.println(var);
			}
		}


}
