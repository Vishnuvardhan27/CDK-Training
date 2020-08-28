package com.arraylist;

import java.util.function.Consumer;
import java.util.jar.Attributes.Name;

public class DemoDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> consumer=new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println("Length :"+t.length());
			}
			
		};
		
		consumer.accept("CDK,abc");
		Consumer<String> consumer2 =(name)->{
			System.out.println("Name Entered :"+name +" Has length :"+name.length());
		};
		consumer2.accept("CDK,abc");
	}

}
