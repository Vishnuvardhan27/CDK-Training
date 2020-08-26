import java.util.Scanner;

import com.exceptions.BookNotFoundException;
import com.interfaces.BookStoreImpl;
import com.pojo.Book;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		long id;
		String s;
		double price;
		
		BookStoreImpl bs = new BookStoreImpl();
		Book[] books= bs.getBooks();
		
		Scanner sc = new Scanner(System.in);
		while(a<5){
			System.out.println("Menu\n"
					+ "1.Find Book By ID\n"
					+ "2.Find Book By Name\n"
					+ "3.Update Book Price\n"
					+ "4.Display Books\n"
					+ "Enter Valid Choice Between 1 to 4");
			a=sc.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("Enter Id Of Book That is to be Found :");
				id=sc.nextLong();
				if(bs.findBookById(books,id)==null)
				{
					try{
						throw new BookNotFoundException("Book Not Found With Given ID Exception!!");
					}
					catch(BookNotFoundException e)
					{
						e.displayMessage();
					}
				}
				else
				{
					System.out.println("Book Found !!!");
				}
				break;
			case 2:
				System.out.println("Enter Name Of Book That is to be Found :");
				s=sc.next();
				if(bs.findBookByName(books,s)==null)
				{
					try{
						throw new BookNotFoundException("Book Not Found With Given Name Exception!!");
					}
					catch(BookNotFoundException e)
					{
						e.displayMessage();
					}
				}
				else
				{
					System.out.println("Book Found !!!");
				}
				break;
			case 3:
				System.out.println("Enter Id Of the book For which Price Is to be updated :");
				id=sc.nextLong();
				System.out.println("Enter Update Price for book Id "+id);
				price=sc.nextDouble();
				if(bs.updateBook(id,price,books)==null)
				{
					try{
						throw new BookNotFoundException("Book Not Found With Given Name Exception!!");
					}
					catch(BookNotFoundException e)
					{
						e.displayMessage();
					}
				}
				else
				{
					System.out.println("SuccessFully Updated !!");
				}
				sc.close();
				
				break;
			case 4:
				System.out.println("Available Books Are :");
				for(Book b:books)
				{
					System.out.println(b);
				}
				break;
				
			}
		}

	}

}
