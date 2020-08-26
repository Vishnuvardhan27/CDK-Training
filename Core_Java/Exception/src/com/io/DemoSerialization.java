package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.pojo.MyData;

public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fo=new FileOutputStream("mydata.txt");
				ObjectOutputStream oo=new ObjectOutputStream(fo);) {
			
			oo.writeObject(new MyData(1,"CDK",100));
//			oo.close();
//			fo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
