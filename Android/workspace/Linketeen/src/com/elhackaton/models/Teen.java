package com.elhackaton.models;

import java.util.Date;

import android.graphics.Bitmap;

public class Teen {
	
	private int id;
	private String name;
	private Date birthDate;
	private String location;
	private int currentPoints;
	
	public Teen(int id, String name, Date birthDate, String location, int points){
		setId(id);
		setName(name);
		setBirthDate(birthDate);
		setLocation(location);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	private void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	private void setLocation(String location) {
		this.location = location;
	}
	
	public int getPoints(){
		return currentPoints;
	}
	
	private void setPoints(int points){
		this.currentPoints = points;
	}
	
	public Bitmap getImage(){
		return null;
	}
}
