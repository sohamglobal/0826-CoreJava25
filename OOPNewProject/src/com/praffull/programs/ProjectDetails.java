package com.praffull.programs;

import com.praffull.classes.StudentProject;

public class ProjectDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentProject obj=new StudentProject();
		obj.setProjectname("Healthcare AI Agent");
		obj.setLanguage("Java");
		obj.setDatabase("MongoDB");
		obj.setMembers(4);
		
		System.out.println(obj.getProjectname());
		System.out.println(obj.getLanguage());
		System.out.println(obj.getDatabase());
		System.out.println(obj.getMembers());

		System.out.println("-------------------");
		StudentProject s1=new StudentProject("Death prediction system","python","mongodb",5);
		System.out.println(s1);
	}

}
