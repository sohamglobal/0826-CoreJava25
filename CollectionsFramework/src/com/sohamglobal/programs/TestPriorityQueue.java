package com.sohamglobal.programs;

import java.util.PriorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.offer("soham");
		pq.offer("sharayu");
		pq.offer("praffull");
		pq.offer("shailaja");
		pq.offer("aarya");
		//pq.offer(null);  not allowed
		pq.offer("soham");
		pq.offer("babu");
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		
		
		PriorityQueue<Integer> pqi=new PriorityQueue<Integer>();
		pqi.add(75);
		pqi.add(18);
		pqi.add(32);
		pqi.add(12);
		pqi.add(56);
		pqi.add(49);
		pqi.add(16);
		System.out.println(pqi);
		//Binary Min Heap Tree

	}

}
