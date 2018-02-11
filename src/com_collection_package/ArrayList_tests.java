package com_collection_package;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Spring;

public class ArrayList_tests {

	int rollno;
	String name;
	int age;
	ArrayList_tests(String name, int age, int rollno)
	{
		this.rollno =rollno;
		this.name = name;
		this.age = age;
	}



	public static void main(String args[])
	{
		ArrayList<String> list_data = new ArrayList<String>();
		ArrayList<String>  test_list_collection = new ArrayList<String>();
		ArrayList<Integer> list_int_data = new ArrayList<Integer>();

		list_data.add("dhruv");
		list_data.add("ghruv");
		list_data.add("khruv");
		list_data.add("ohruv");
		list_data.add("phruv");
		list_data.add("dhruv");

		list_int_data.add(1000);
		list_int_data.add(2000);
		list_int_data.add(3000);
		list_int_data.add(4000);
		list_int_data.add(4000);
		list_int_data.add(5000);

		test_list_collection.addAll(list_data);

		//Traversing list through Iterator  
		Iterator<String> itr=list_data.iterator(); 
		Iterator<String> itr3=test_list_collection.iterator(); 
		Iterator<Integer> itr2=list_int_data.iterator(); 
		Iterator<String> itr4=test_list_collection.iterator(); 


		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("print integers.");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}


		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}

		test_list_collection.removeAll(list_data);
		while(itr4.hasNext())
		{ System.out.println("1...2....3...");
		System.out.println(itr3.next());
		}

		//using for each loop
		for(String str :list_data)
		{System.out.println(str);}

		for(int inter1 : list_int_data)
		{
			System.out.println(inter1);
		}

	}
}
