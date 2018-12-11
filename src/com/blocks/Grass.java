package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class Grass extends Blocks{
	public Grass(){
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/grass.jpg");
		}
}
