package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class Water extends Blocks{
	public Water(int xLoc, int yLoc){
		super(xLoc, yLoc);
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/water.jpg");
		}
}
