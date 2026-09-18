package com.sohamglobal.programs;
import java.util.*;
import java.util.concurrent.*;

public class FailSafeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> lst=new CopyOnWriteArrayList<>();
		lst.add("microsoft");
		lst.add("volkswagen");
		lst.add("samsung");
		lst.add("dell");
		Iterator<String> iterator=lst.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			if(!lst.contains("apple"))
			lst.add(2,"apple");
		}
		
		System.out.println(lst);
	}

}
