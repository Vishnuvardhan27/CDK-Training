package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class DemoReadData {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Your Name :");
		try {
			String name = reader.readLine();
			System.out.println("Your Name is :"+name );
		} 
		catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
