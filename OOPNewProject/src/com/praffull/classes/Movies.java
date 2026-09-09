package com.praffull.classes;

public class Movies {
	
	private String name;
	private int year;
	private String genre;
	private String actor;
	private double rating;
	
	public Movies(String name, int year, String genre, String actor, double rating) {
		super();
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.actor = actor;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", year=" + year + ", genre=" + genre + ", actor=" + actor + ", rating="
				+ rating + "]";
	}
	

}
