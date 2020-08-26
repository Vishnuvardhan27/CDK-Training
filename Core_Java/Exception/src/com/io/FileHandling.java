package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileWriter writer = new FileWriter("myfile.txt");)
		{
			System.out.println("File Created");
			
			writer.write("Welcome to File Handaling .");
			writer.write("This is second Line .");
//			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader reader=new FileReader("myfile.txt");
			byte x;
			do{
				x=(byte)reader.read();
				System.out.print((char)x);
			}while(x!=-1);
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
