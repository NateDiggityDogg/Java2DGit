package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class StoneBroken extends Blocks{
	public StoneBroken(){
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/stoneBroken.jpg");
		}
}
