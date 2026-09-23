package com.sohamglobal.programs;

import java.util.HashSet;

public class TryHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("chatgpt");
		hs.add("copilot");
		hs.add("claude");
		hs.add("gemini");
		hs.add("deepseek");
		hs.add("grok");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		hs.add("copilot");
		//every value is stored as key and can't be duplicated
		//PRESENT dummy object as a value
		
		
		
	}

}
