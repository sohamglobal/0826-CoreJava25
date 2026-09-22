package com.sohamglobal.programs;

import java.util.ArrayDeque;

public class TryArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.add("java");
		ad.add("python");
		ad.add("sql");
		ad.add("spring");
		//ad.add(null);
		ad.add("java");
		ad.add("jpa");
		ad.add("hibernate");
		System.out.println(ad);
		
		ad.addFirst("windows");
		ad.addLast("linux");
		
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		ad.removeLast();
		System.out.println(ad);

	}

}
