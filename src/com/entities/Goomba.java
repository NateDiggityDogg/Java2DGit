package com.entities;

import com.engine.Engine;
import com.engine.drawingComponent;

public class Goomba extends Characters{

public Goomba(double xLoc, double yLoc) {
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

	public void update() {
		super.update();
		if(CollisionDetection.checkCollision(this, Engine.returnPlayer()) && lastCollisionTicks >= 20) {
			horizontalVelocity = Engine.returnPlayer().horizontalVelocity;
			verticalVelocity = Engine.returnPlayer().verticalVelocity;
			lastCollisionTicks = 0;
		}else if(lastCollisionTicks <= 20) {
			lastCollisionTicks++;
		}
	}
}
