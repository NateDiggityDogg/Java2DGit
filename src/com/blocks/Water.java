package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class Water extends Blocks{
	public Water(){
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/water.jpg");
		}
}
