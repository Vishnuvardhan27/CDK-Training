package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Address;
import com.pojo.Employee;

public class EmpIOImpl implements EmpIO {

	@Override
	public boolean addToFile(List<Employee> employees) {
		// TODO Auto-generated method stub
		try(FileOutputStream fo=new FileOutputStream("mydata.txt");
				ObjectOutputStream oo=new ObjectOutputStream(fo);){
				for(Employee emp: employees){
			      oo.writeObject(emp);
		} 
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public List<Employee> readFromFile() {
		// TODO Auto-generated method stub
		List<Employee>l=new ArrayList<>();
		try(FileInputStream fi=new FileInputStream("mydata.txt");){
			if(fi.available()==0)
				return l;
			ObjectInputStream oi=new ObjectInputStream(fi);
			while(fi.available()!=0){
			Object o=oi.readObject();
			Employee data=(Employee)o;
			l.add(data);
			}
			} catch (FileNotFoundException|ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		return l;
	}

	@Override
	public Employee readFromUser() {
		// TODO Auto-generated method stub
		String city,state,pincode,empName;
		int empId;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter id:");
		empId=sc.nextInt();
		System.out.print("Enter name:");
		empName=sc.next();
		System.out.print("Enter city:");
		city=sc.next();
		System.out.print("Enter state:");
		state=sc.next();
		System.out.print("Enter pincode:");
		pincode=sc.next();
		sc.close();
		Address address=new Address(city,state,pincode);
		Employee e=new Employee(empId,empName,address);
		return e;
	}

	@Override
	public void displayToUser(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println(emp);
	}

}
