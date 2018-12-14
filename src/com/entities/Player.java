package com.entities;

import java.awt.Image;

import com.engine.Engine;
import com.engine.Keybinds;
import com.engine.drawingComponent;

public class Player extends Characters{
	
	public Player() {
		
		this.charSprite = drawingComponent.loadImage("graphics/mario.png");
		this.xLoc = 6;
		this.yLoc = 6;
		this.regularWidth = 32;
		this.mirroredWidth = -this.regularWidth;
		this.height = 64;
		width = regularWidth;
		
		this.defaultRunSpeed = 0.001;
		this.runSpeed = defaultRunSpeed;
		
		this.facingRight = false;
	}
	
	public void update() {
		if(Keybinds.A) {
			horizontalVelocity-=runSpeed;
			facingRight=false;
		}
		if(Keybinds.W) {
			verticalVelocity+=runSpeed;
		}
		if(Keybinds.S) {
			verticalVelocity-=runSpeed;
		}
		if(Keybinds.D) {
			horizontalVelocity+=runSpeed;
			facingRight=true;
		}
		if(Keybinds.SHIFT) {
	//		runSpeed = defaultRunSpeed*1.5;
			xLoc = 6;
			yLoc = 6;
			horizontalVelocity = 0;
			verticalVelocity = 0;
		}else {
			runSpeed = defaultRunSpeed;
		}
		if(facingRight) {
			width = mirroredWidth;
		}
		if(!facingRight) {
			width = regularWidth;
		}
		
		xLoc+=horizontalVelocity;
		yLoc+=verticalVelocity;
		
		if(CollisionDetection.checkCollision(this, ) {
			xLoc = 12;
			yLoc = 12;
		}
		
	}
	
}
