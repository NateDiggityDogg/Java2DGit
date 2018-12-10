package com.entities;

import java.awt.Image;

import com.engine.Engine;
import com.engine.Keybinds;

public class Player extends Characters{

	public int xLoc;
	public int yLoc;
	
	public double runSpeed = 2;
	
	Image charSprite;
	
	public Player() {
		super("graphics/mario.png");
		xLoc = Engine.screenWidth/2;
		yLoc = Engine.screenHeight/2;
		charSprite = super.charSprite;
	}
	
	public void update() {
		if(Keybinds.A) {
			xLoc-=runSpeed;
		}
		if(Keybinds.W) {
			yLoc+=runSpeed;
		}
		if(Keybinds.S) {
			yLoc-=runSpeed;
		}
		if(Keybinds.D) {
			xLoc+=runSpeed;
		}
		if(Keybinds.SHIFT) {
			runSpeed = 3;
		}else {
			runSpeed = 2;
		}
	}
	
}
