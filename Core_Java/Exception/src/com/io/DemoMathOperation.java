package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoMathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter Number 1 :");
			String n1=reader.readLine();
			System.out.println("Enter Number 2 :");
			String n2=reader.readLine();
			
			System.out.println(Integer.parseInt(n1)+Integer.parseInt(n2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
