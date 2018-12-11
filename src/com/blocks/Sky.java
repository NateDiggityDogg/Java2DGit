package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class Sky extends Blocks{
	public Sky(){
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/sky.jpg");
		}
}
