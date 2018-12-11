package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class Dirt extends Blocks{
	boolean solid = true;
	boolean affectedByGravity = false;
	Image image = WorldGenerator.loadImage("graphics/dirt.jpg");
	public Image returnImage() {
		return this.image;
	}
}
