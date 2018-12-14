package com.blocks;

import java.awt.Image;
import java.awt.Rectangle;

import com.engine.Engine;

public class Blocks {
	boolean solid;
	boolean affectedByGravity;
	
	double xLoc;
	double yLoc;
	
	public int width;
	public int height;
	
	Image image;
	
	Blocks (int xLoc, int yLoc){
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.width = 32;
		this.height = 32;
	}
	
	public Image returnImage() {
		return this.image;
	}
	public Boolean isSolid() {
		return this.solid;
	}
	public Boolean affectedByGravity() {
		return this.affectedByGravity();
	}
	
	public Rectangle getHitbox() {
		int frameHeight = Engine.returnDrawingComponent().getHeight();
		return new Rectangle((int) (xLoc*32-width/2), (int) (frameHeight-(yLoc*32-height/2)),width,height);
	}
}
