package com.praffull.programs;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TryConcurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String, String> chm=new ConcurrentHashMap<String, String>();
		chm.put("America", "Washington");
		chm.put("England", "London");
		chm.put("Netherlands", "Amsterdam");
		chm.put("Germany", "Berlin");
		System.out.println(chm);
		
		Iterator<Map.Entry<String,String>> iterator=chm.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String,String> entry=iterator.next();
			System.out.println("KEY : "+entry.getKey()+" VALUE : "+entry.getValue());
			//chm.put("Italy", "Rome");
		}
		
		
	}

}
