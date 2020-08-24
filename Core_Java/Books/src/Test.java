import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		BookStore bs = new BookStore();
		Book[] books= bs.getBooks();
		for(Book b:books)
		{
			b.display();
		}
		long id;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id Of the Book That is to Find :" );
		id = sc.nextLong();
		if(bs.findBookById(id,books)==null)
		{
			System.out.println("Book Not Found");
		}
		else
		{
			System.out.println("Book Found !!!");
		}
		System.out.println("Update Section");
		if(bs.updateBook(10007,100.00,books)==null)
		{
			System.out.println("Book Not Found For Updation !! I am Sorry ");
		}
		else
		{
			System.out.println("SuccessFully Updated !!");
		}
		sc.close();
		
		for(Book b:books)
		{
			b.display();
		}
	}

}
