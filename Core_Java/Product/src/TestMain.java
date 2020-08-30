import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.ProductDAOImpl;
import com.exception.ProductNotFoundException;
import com.io.ProductIO;
import com.io.ProductIOImpl;
import com.pojo.Product;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int choice=0, success,id,quantity;
				double price;
				boolean flag;
				String category;
				ProductDAOImpl pd = new ProductDAOImpl();
				ProductIO pi = new ProductIOImpl();
				Product product=new Product();
				List<Product>products=new ArrayList<>();
				while(choice<7){
					System.out.println("Menu\n"
							+ "1.Add Product\n"
							+ "2.Update Product By Price\n"
							+ "3.Update Product By quantity\n"
							+ "4.Find By Category\n"
							+ "5.Find By ID \n"
							+ "6.Find All\n"
							+ "7.Exit\n"
							+ "Enter Valid Choice Between 1 to 7");
					choice=sc.nextInt();
					switch(choice)
					{
					case 1:
						product = pi.getProduct();
						success=pd.addProduct(product);
						if(success==-1)
						{	try
							{
							throw new ProductNotFoundException("Cannot Add Product Due To Some Error !!");
							}
						
							catch(ProductNotFoundException e){
								e.displayMessage();
							}	
						}
						else
						{
							System.out.println("Product Added Susccessfully");
							pi.displayProduct(product);
						}
						break;
					case 2:
						System.out.print("Enter product id that is to be Updated :");
						id=sc.nextInt();
						System.out.print("Enter product price for id "+id+" that is to be updtaed :");
						price=sc.nextDouble();
						flag = pd.updateProduct(id, price);
						if(flag==false)
						{	try
							{
							throw new ProductNotFoundException("Product With Given id Does Not Exist Please Check the ID !!");
							}
						
							catch(ProductNotFoundException e){
								e.displayMessage();
							}	
						}
						break;
					case 3:
						System.out.print("Enter product id that is to be Updated :");
						id=sc.nextInt();
						System.out.print("Enter product Quantity for id "+id+" that is to be updtaed :");
						quantity=sc.nextInt();
						flag = pd.updateProduct(id,quantity); 
						if(flag==false)
						{	try
							{
							throw new ProductNotFoundException("Product With Given id Does Not Exist Please Check the ID !!");
							}
						
							catch(ProductNotFoundException e){
								e.displayMessage();
							}	
						}
						break;
					case 4:
						System.out.print("Enter product category:");
						category=sc.next();
						products=pd.findAllByCategory(category);
						if(products.size()>0)
						{
							System.out.println(products);
						}
						else
						{
							try
							{
							throw new ProductNotFoundException("Product Not Found In This Category ");
							}
						
							catch(ProductNotFoundException e){
								e.displayMessage();
							}	
						}
						break;
					case 5:
						System.out.print("Enter product id That is to Found :");
						id=sc.nextInt();
						product=pd.findById(id);
						if(product.getpId()!=0)
						{
					    pi.displayProduct(product);
						}
						else
						{
							try
							{
							throw new ProductNotFoundException("Product With Given id Does Not Exist Please Check the ID ");
							}
						
							catch(ProductNotFoundException e){
								e.displayMessage();
							}	
						}
							
						break;
					case 6:	
						products=pd.findAll();
						if(products.size()>0)
						{
							System.out.println(products);
						}
						else
						{
							try
							{
							throw new ProductNotFoundException("No Products in The DataBase ");
							}
						
							catch(ProductNotFoundException e){
								e.displayMessage();
							}	
						}
						break;
						
					}	
				}
				System.out.println("Thank you!!");
				
			}

	}
