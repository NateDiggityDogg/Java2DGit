package com.entities;

import java.awt.Image;

public class Characters {
	
	int defaultXLoc;
	int defaultYLoc;
	
	double horizontalVelocity;
	double verticalVelocity;
	
	Image charSprite;
	
	public boolean affectedByGravity;
	
	
	Characters(String entityID){
	defaultXLoc = 200;
	defaultYLoc = 200;
	charSprite = convertString(entityID);
	}
	
	static Image convertString(String entityID) {
		return com.engine.drawingComponent.loadImage(entityID);
	}
	
	public Image returnSprite() {
		return charSprite;
	}
	
}
