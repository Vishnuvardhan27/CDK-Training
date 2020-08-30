package com.io;

import java.util.Scanner;

import com.pojo.Product;

public class ProductIOImpl implements ProductIO {

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pId,quantity;
		String pName,category;
		double price;
		System.out.print("Enter product id:");
		pId=sc.nextInt();
		System.out.print("Enter product name:");
		pName=sc.next();
		System.out.print("Enter product price:");
		price=sc.nextDouble();
		System.out.print("Enter product quantity:");
		quantity=sc.nextInt();
		System.out.print("Enter product category:");
		category=sc.next();
		Product p=new Product(pId,pName,price,quantity,category);
		return p;
	}

	@Override
	public void displayProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("ProductId: "+product.getpId()+
				"\n  productName: "+product.getpName()+
				"\n  ProductPrice: "+product.getPrice()+
				"\n  ProductQuantity: "+product.getQuantity()+
				"\n ProductCategory: "+product.getCategory());

	}

}
