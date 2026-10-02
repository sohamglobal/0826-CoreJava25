package com.sharayu.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst=new ArrayList<String>();
		lst.add("soham");
		lst.add("aarya");
		lst.add("sharayu");
		lst.add("owee");
		lst.add("praffull");
		lst.add("sharayu");
		lst.add("owee");
		System.out.println(lst);
		
		//print all elements
		lst.stream()
		.forEach(nm->System.out.println(nm));
		
		System.out.println("-------------");
		
		//print only unique elements
		lst.stream()
		.distinct()  //intermediate operation
		.forEach(nm->System.out.println(nm));  //terminal operation

		System.out.println("-------------");
		lst.stream()
		.distinct()
		.filter(nm->nm.startsWith("s"))
		.forEach(nm->System.out.println(nm));
		
		System.out.println("-------------");
		//display all elements in upper case
		lst.stream()
		.map(nm->nm.toUpperCase())
		.forEach(nm->System.out.println(nm));
		
		//take unique elements, convert them to upper case 
		//and store in another list
		
		List<String> capitalnames=lst.stream()
		.distinct()
		.map(nm->nm.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(capitalnames);
		capitalnames.stream()
		.sorted()
		.forEach(nm->System.out.println(nm));
		
		System.out.println("---------------");
		
		lst.stream()
		.skip(2)
		.limit(3)
		.forEach(nm->System.out.println(nm));
		
	}

}
