package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class Sky extends Blocks{
	boolean solid = true;
	boolean affectedByGravity = false;
	Image image = WorldGenerator.loadImage("graphics/sky.jpg");
	public Image returnImage() {
		return this.image;
	}
}
