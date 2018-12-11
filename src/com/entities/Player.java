package com.entities;

import java.awt.Image;

import com.engine.Engine;
import com.engine.Keybinds;

public class Player extends Characters{

	public double xLoc;
	public double yLoc;
	
	public int width;
	public int regularWidth=32;
	public int mirroredWidth=-32;
	public int height;
	
	public boolean facingRight;
	
	public double defaultRunSpeed = 0.1;
	public double runSpeed = defaultRunSpeed;
	
	Image charSprite;
	
	public Player() {
		super("graphics/mario.png");
		xLoc = 4;
		yLoc = 4;
		width = regularWidth;
		height = 64;
		facingRight = false;
		charSprite = super.charSprite;
	}
	
	public void update() {
		if(Keybinds.A) {
			xLoc-=runSpeed;
			facingRight=false;
		}
		if(Keybinds.W) {
			yLoc+=runSpeed;
		}
		if(Keybinds.S) {
			yLoc-=runSpeed;
		}
		if(Keybinds.D) {
			xLoc+=runSpeed;
			facingRight=true;
		}
		if(Keybinds.SHIFT) {
			runSpeed = defaultRunSpeed*1.5;
		}else {
			runSpeed = defaultRunSpeed;
		}
		if(facingRight) {
			width = mirroredWidth;
		}
		if(!facingRight) {
			width = regularWidth;
		}
		
	}
	
}
