package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class Grass extends Blocks{
	boolean solid = true;
	boolean affectedByGravity = false;
	Image image = WorldGenerator.loadImage("graphics/grass.jpg");
	public Image returnImage() {
		return this.image;
	}
}
