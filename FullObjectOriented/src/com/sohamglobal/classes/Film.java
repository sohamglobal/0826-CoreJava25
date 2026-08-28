package com.sohamglobal.classes;

public class Film {
	
	private String name;
	private int year;
	private String genre;
	private double imdbrating;
	
	public Film(String name, int year, String genre, double imdbrating) 
	{
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.imdbrating = imdbrating;
	}
	/*
	public void showData()
	{
		System.out.println("Film name : "+name);
		System.out.println("Release year : "+year);
		System.out.println("Genre : "+genre);
		System.out.println("imdbRating : "+imdbrating);
	}
*/
	@Override
	public String toString() {
		return "Film [name=" + name + ", year=" + year + ", genre=" + genre + ", imdbrating=" + imdbrating + "]";
	}
	
	
	

}
