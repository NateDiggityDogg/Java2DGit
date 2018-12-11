package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class StoneBroken2 extends Blocks{
	public StoneBroken2(){
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/stoneBroken2.jpg");
		}
}
