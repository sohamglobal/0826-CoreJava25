package com.praffull.classes;

public class StudentProject {
	private String projectname;
	private String language;
	private String database;
	private int members;
	
	public StudentProject()
	{
		projectname="";
		language="";
		database="";
		members=0;
	}
	
	public StudentProject(String projectname, String language, String database, int members) {
		super();
		this.projectname = projectname;
		this.language = language;
		this.database = database;
		this.members = members;
	}
	
	
	
	@Override
	public String toString() {
		return "StudentProject [projectname=" + projectname + ", language=" + language + ", database=" + database
				+ ", members=" + members + "]";
	}



	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public String getProjectname() {
		return projectname;
	}
	public String getLanguage() {
		return language;
	}
	public String getDatabase() {
		return database;
	}
	public int getMembers() {
		return members;
	}
	
	
	

}
