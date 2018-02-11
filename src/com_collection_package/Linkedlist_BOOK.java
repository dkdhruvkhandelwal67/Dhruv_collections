package com_collection_package;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_BOOK {

	static String book_name;
	static float book_cost;
	static String book_author;
	static String publisher;

	public Linkedlist_BOOK(String book_name1,
			float book_cost1,
			String book_author1,
			String publisher1) {
				book_name =book_name1;
				book_cost = book_cost1;
				book_author =book_author1;
				publisher = publisher1;
	}

	public static void main(String[] args) {


		Linkedlist_BOOK book1 = new Linkedlist_BOOK("testbook1", 260, "Ramesh1", "test_publisher1");
		Linkedlist_BOOK book2 = new Linkedlist_BOOK("testbook12", 260, "Ramesh2", "test_publisher2");
		Linkedlist_BOOK book3 = new Linkedlist_BOOK("testbook13", 260, "Ramesh3", "test_publisher3");
		Linkedlist_BOOK book4 = new Linkedlist_BOOK("testbook14", 260, "Ramesh4", "test_publisher4");
		Linkedlist_BOOK book5 = new Linkedlist_BOOK("testbook15", 260, "Ramesh5", "test_publisher5");
		Linkedlist_BOOK book6 = new Linkedlist_BOOK("testbook16", 260, "Ramesh6", "test_publisher6");
		Linkedlist_BOOK book7 = new Linkedlist_BOOK("testbook17", 260, "Ramesh7", "test_publisher7");
		Linkedlist_BOOK book8 = new Linkedlist_BOOK("testbook18", 260, "Ramesh8", "test_publisher8");
		Linkedlist_BOOK book9 = new Linkedlist_BOOK("testbook19", 260, "Ramesh9", "test_publisher9");
		LinkedList<Linkedlist_BOOK> Ltr = new LinkedList<Linkedlist_BOOK>();
		Ltr.add(book1);
		Ltr.add(book2);
		Ltr.add(book3);
		Ltr.add(book4);
		Ltr.add(book5);
		Ltr.add(book6);
		Ltr.add(book7);
		Ltr.add(book8);
		Ltr.add(book9);
   for(Linkedlist_BOOK BOOK : Ltr)
   {
	   System.out.println(BOOK.book_name+"  "+BOOK.book_cost+" "+ BOOK.book_author+" "+ BOOK.publisher);
   }
		
	}
}
