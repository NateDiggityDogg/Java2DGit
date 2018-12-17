package com.entities;

import com.engine.drawingComponent;

public class Goomba extends Characters{

public Goomba(int xLoc, int yLoc) {
		super(xLoc, yLoc);
		this.charSprite = drawingComponent.loadImage("graphics/goomba.png");
		this.regularWidth = 32;
		this.mirroredWidth = -this.regularWidth;
		this.height = 64;
		width = regularWidth;
		
		this.defaultRunSpeed = 0.1;
		this.runSpeed = defaultRunSpeed;
		
		this.facingRight = false;
		
	}
}
