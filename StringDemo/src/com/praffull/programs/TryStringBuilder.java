package com.praffull.programs;

public class TryStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("technology");
		System.out.println(sb);
		sb.append(" is your future");
		System.out.println(sb);
		sb.insert(11, "with ai ");
		System.out.println(sb);
		sb.delete(5, 17);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.replace(3, 9, "123456");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

		
	}

}
