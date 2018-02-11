package com_collection_package;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_tests2 {

	public static void main(String args[])
	{
		ArrayList_tests A1 = new ArrayList_tests("dhruv", 22, 1011);
		ArrayList_tests A2 = new ArrayList_tests("dhruv1", 22, 1012);
		ArrayList_tests A3 = new ArrayList_tests("dhruv2", 22, 1013);
		ArrayList_tests A4 = new ArrayList_tests("dhruv3", 22, 1014);
		ArrayList_tests A5 = new ArrayList_tests("dhruv4", 22, 1015);
		ArrayList_tests A6 = new ArrayList_tests("dhruv5", 22, 1016);
		ArrayList_tests A7 = new ArrayList_tests("dhruv6", 22, 1017);
		ArrayList_tests A8 = new ArrayList_tests("dhruv7", 22, 1018);
		
        ArrayList<ArrayList_tests> arr = new ArrayList<ArrayList_tests>();
        arr.add(A1);
        arr.add(A2);
        arr.add(A3);
        arr.add(A4);
        arr.add(A5);
        arr.add(A6);
        arr.add(A7);
        arr.add(A8);
        
        
        Iterator<ArrayList_tests> itrr = arr.iterator();
        
        while(itrr.hasNext())
        {    ArrayList_tests st=(ArrayList_tests)itrr.next();  

        System.out.println(st.age+"  "+st.name+"  "+ st.rollno);}
	}}