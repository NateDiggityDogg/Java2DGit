package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class StoneBroken2 extends Blocks{
	boolean solid = true;
	boolean affectedByGravity = false;
	Image image = WorldGenerator.loadImage("graphics/stoneBroken2.jpg");
	public Image returnImage() {
		return this.image;
	}
}
