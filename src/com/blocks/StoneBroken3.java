package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class StoneBroken3 extends Block{
	public StoneBroken3(int xLoc, int yLoc){
		super(xLoc, yLoc);
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/stoneBroken3.jpg");
		}
}
