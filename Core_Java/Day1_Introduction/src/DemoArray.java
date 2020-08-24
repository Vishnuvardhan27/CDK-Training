
public class DemoArray {

	public static void main(String[] args) {
		int[] numbers;
		numbers=new int[10];
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=i+1;
		}
//		for(int i=0;i<4;i++)
//		{
//			System.out.println(numbers[i]);
//		}
		
		//Finding Out Total of 10 Integers
//		int total =0;
//		for (int var : numbers)
//		{
//			System.out.println(var);
//			total +=var;
//		}
//		System.out.println("Total of First 10 Intergers is "+total);
		
		int max =0, min =0;
		for (int var : numbers)
		{
			if(var>max)
			{
				max=var;
			}
			if(var<min)
			{
				min=var;
			}
		}
		System.out.println("Maximum value in Given Array is "+max);
		System.out.println("Minimum value in Given Array is "+min);
		
		
		
	}
}
