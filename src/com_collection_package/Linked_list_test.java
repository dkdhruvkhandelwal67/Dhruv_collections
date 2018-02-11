package com_collection_package;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list_test {

	public static void main(String args[]) {

		LinkedList<String> Ln = new LinkedList<String>();
		Ln.add("DHRUV");
		Ln.add("gHRUV");
		Ln.add("jHRUV");
		Ln.add("kHRUV");
		Ln.add("rHRUV");

		Iterator<String> irt = Ln.iterator();
		while(irt.hasNext())
		{
			System.out.println("data is::--" +irt.next());
		}
	}
}
