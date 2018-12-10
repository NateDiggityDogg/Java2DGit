package com.entities;

import java.awt.Image;

import com.engine.Keybinds;

public class Player extends Characters{

	public int xLoc;
	public int yLoc;
	
	Image charSprite;
	
	public Player() {
		super("graphics/mario.png");
		xLoc = 200;
		yLoc = 200;
		charSprite = super.charSprite;
	}
	
	public void update() {
		if(Keybinds.A) {
			xLoc-=2;
		}
		if(Keybinds.W) {
			yLoc+=2;
		}
		if(Keybinds.S) {
			yLoc-=2;
		}
		if(Keybinds.D) {
			xLoc+=2;
		}
	}
	
}
