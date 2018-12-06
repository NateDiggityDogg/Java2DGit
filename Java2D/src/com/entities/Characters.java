package com.entities;

public class Characters {
	static double xLocation;
	static double yLocation;
	
	public void spawnAt(double x, double y) {
		xLocation = x;
		yLocation = y;
	}
	
	public void update(){
		xLocation = xLocation += 15;
	}
}
