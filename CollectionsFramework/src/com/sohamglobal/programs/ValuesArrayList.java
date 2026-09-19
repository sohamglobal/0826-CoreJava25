package com.sohamglobal.programs;
import java.util.*;

public class ValuesArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<>();
		names.add("java");
		names.add("python");
		names.add("praffull");
		names.add("sql");
		System.out.println(names);
		names.add(2,"aarya");
		names.add("babu");
		names.add(null);
		names.add("java");
		names.remove(3);
		names.set(0, "spring boot");
		System.out.println(names);
		System.out.println(names.contains("sharayu"));
		
		System.out.println(names);
		
		for(int i=0;i<names.size();i++)
			System.out.println(names.get(i));
		
		System.out.println("-------------");
		for(String nm:names)
			System.out.println(nm);
		
		System.out.println("-------------");
		Iterator<String> iterator=names.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			//names.add("mongodb");
		}
		
		//---------------------
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(9);
		numbers.add(26);
		numbers.add(45);
		System.out.println(numbers);
		
		}

}
