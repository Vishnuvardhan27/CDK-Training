package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.MyData;

public class DemoDeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		FileInputStream fi = new FileInputStream("mydata.txt");
		ObjectInputStream oi =new ObjectInputStream(fi); 
		Object o=oi.readObject();
		MyData data=(MyData) o;
		System.out.println(data);
	 
		
		
//		catch (FileNotFoundException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} 
	}

}
