
public class BookStore {
	
	Book[] getBooks()
	{
		Book[] books=new Book[5];
		books[0]=new Book(10001,"Python The Hard Way",200);
		books[1]=new Book(10002,"C++",300);
		books[2]=new Book(10003,"AI",500);
		books[3]=new Book(10004,"Machine Leaning","Super DataScience Team","Udemy");
		books[4]=new Book(10005,"The BlockChain blog","Mohd.Arbaaz Shaikh","WordPress");
		return books;
	}

	Book findBookById(long Id,Book[] books)
	{
		for (Book b : books)
		{
			if(b.getIsbn()==Id)
			{
				return b;
			}
		}
		return null;
	}
	Book updateBook(long id,double price,Book[] books)
	{
		for (Book b : books)
		{
			if(b.getIsbn()==id)
			{
				b.setPrice(price);
				return b;
			}
		}
		return null;
		
	}
}
