package com.entities;

import com.engine.drawingComponent;

public class Goomba extends Characters{

public Goomba() {
		
		this.charSprite = drawingComponent.loadImage("graphics/goomba.png");
		this.xLoc = 4;
		this.yLoc = 4;
		this.regularWidth = 32;
		this.mirroredWidth = -this.regularWidth;
		this.height = 64;
		width = regularWidth;
		
		this.defaultRunSpeed = 0.1;
		this.runSpeed = defaultRunSpeed;
		
		this.facingRight = false;
	}
}
