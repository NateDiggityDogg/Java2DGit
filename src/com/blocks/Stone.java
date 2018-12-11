package com.blocks;

import java.awt.Image;

import com.worldGeneration.WorldGenerator;

public class Stone extends Blocks{
	public Stone(){
		this.solid = true;
		this.affectedByGravity = false;
		this.image = WorldGenerator.loadImage("graphics/stone.jpg");
		}
}
