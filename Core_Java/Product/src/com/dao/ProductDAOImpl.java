package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Product;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		
		int inserted=-1;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Ashley", "indiabuf");
			String insertProduct="insert into product values(?,?,?,?,?)";
			PreparedStatement  ps=con.prepareStatement(insertProduct);
			ps.setInt(1, product.getpId());
			ps.setString(2,product.getpName());
			ps.setDouble(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
			ps.setString(5,product.getCategory());
			inserted=ps.executeUpdate();
			}
			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		return inserted;
	}

	@Override
	public boolean updateProduct(int productId, double price) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Ashley", "indiabuf");
			String updateProduct="update product set price=? where pId=?";
			PreparedStatement  ps=con.prepareStatement(updateProduct);
			ps.setDouble(1, price);
			ps.setInt(2, productId);
			int updated=ps.executeUpdate();
			if(updated >0)
			{
				return true;
			}
			else
				System.out.println("Product Cannot be Updated");
		}
		 catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();
			} 
		return false;
	}

	@Override
	public boolean updateProduct(int productId, int quantity) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Ashley", "indiabuf");
			String updateProduct="update product set quantity=? where pId=?";
			PreparedStatement  ps=con.prepareStatement(updateProduct);
			ps.setDouble(1, quantity);
			ps.setInt(2, productId);
			int updated=ps.executeUpdate();
			if(updated >0)
			{
				return true;
			}
			else
				System.out.println("Product Cannot be Updated");
		}
		 catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();
			} 
		return false;
	}

	@Override
	public Product findById(int productId) {
		// TODO Auto-generated method stub
		Product p=new Product();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Ashley", "indiabuf");
			String findProduct="select * from product where pId=?";
			PreparedStatement  ps=con.prepareStatement(findProduct);
			ps.setInt(1, productId);
			ResultSet set=ps.executeQuery();
			int pId,quantity;
			String pName,category;
			double price;
			
			while(set.next()){
				pId=set.getInt("pId");
				pName=set.getString("pName");
				price=set.getDouble("price");
				quantity=set.getInt("quantity");
				category=set.getString("category");
			p=new Product(pId,pName,price,quantity,category);
			}
		}
		 catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();
			}
		return p;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product>products=new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Ashley", "indiabuf");
			String findProduct="select * from product";
			PreparedStatement  ps=con.prepareStatement(findProduct);
            ResultSet set=ps.executeQuery();
			int pId,quantity;
			String pName,category;
			double price;
			Product p=new Product();
			while(set.next()){
				pId=set.getInt("pId");
				pName=set.getString("pName");
				price=set.getDouble("price");
				quantity=set.getInt("quantity");
				category=set.getString("category");
				p=new Product(pId,pName,price,quantity,category);
			products.add(p);
			}
		}
			catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();
			}
		return products;
	}

	@Override
	public List<Product> findAllByCategory(String category) {
		List<Product>products=new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Ashley", "indiabuf");
			String findProduct="select * from product where category=?";
			PreparedStatement  ps=con.prepareStatement(findProduct);
			ps.setString(1,category);
            ResultSet set=ps.executeQuery();
			int pId,quantity;
			String pName;
			double price;
			Product p=new Product();
			while(set.next()){
				pId=set.getInt("pId");
				pName=set.getString("pName");
				price=set.getDouble("price");
				quantity=set.getInt("quantity");
				p=new Product(pId,pName,price,quantity,category);
			    products.add(p);
			}
		}
			catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();
			}
		return products;
	}

}
