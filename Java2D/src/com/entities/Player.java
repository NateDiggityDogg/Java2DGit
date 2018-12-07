package com.entities;

import java.awt.Image;

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
	
}
