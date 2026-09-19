package com.sohamglobal.programs;
import java.util.*;

public class TryLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add("english");
		list.add("urdu");
		list.add("hindi");
		list.add("marathi");
		list.add(null);
		list.add("english");
		list.remove("marathi");
		
		list.addFirst("spanish");
		list.addLast("french");
		System.out.println(list);
		System.out.println(list.getFirst()); //NoSuchElementException
		System.out.println(list.getLast());
		System.out.println(list.peekFirst()); // returns null
		System.out.println(list.pollFirst());  // retrieve and remove
		System.out.println(list);
		//stack behavior
		list.push("german");
		System.out.println(list.pop());
		System.out.println(list);
		
		Iterator<String> iterator=list.descendingIterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
	}

}
