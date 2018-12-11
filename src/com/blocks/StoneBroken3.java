package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class StoneBroken3 extends Blocks{
	public StoneBroken3(){
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/stoneBroken3.jpg");
		}
}
