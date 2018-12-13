package com.entities;

import java.awt.Image;
import java.awt.Rectangle;

import com.engine.Engine;
import com.engine.drawingComponent;

public class Characters {
	
	public double xLoc;
	public double yLoc;
	
	public int width;
	public int regularWidth;
	public int mirroredWidth;
	public int height;
	
	public double horizontalVelocity;
	public double verticalVelocity;
	
	public Image charSprite;
	
	public boolean facingRight;
	public boolean affectedByGravity;
	
	public double defaultRunSpeed;
	public double runSpeed;
	
	static Image convertString(String entityID) {
		return com.engine.drawingComponent.loadImage(entityID);
	}
	
	public Image returnSprite() {
		return charSprite;
	}
	
	public Rectangle getHitbox() {
		int frameHeight = Engine.returnDrawingComponent().getHeight();
		if(width>0) {
//		return new Rectangle((int)(xLoc*32-width/2),(int)((frameHeight-yLoc*32)-height/2),width,height);
		return new Rectangle((int) (xLoc*32-width/2), (int) (frameHeight-(yLoc*32-height/2)),width,height);
		}else {
//		return new Rectangle((int)((xLoc*32-width/2)+width),(int)((frameHeight-yLoc*32)-height/2),-width,height);
		return new Rectangle((int) (xLoc*32-width/2+width), (int) (frameHeight-(yLoc*32-height/2)),-width,height);	
		}
	}
}
