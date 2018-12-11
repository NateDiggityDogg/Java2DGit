package com.worldGeneration;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import com.blocks.Blocks;
import com.blocks.Dirt;
import com.blocks.Grass;
import com.blocks.Sky;
import com.blocks.Stone;
import com.blocks.StoneBroken;
import com.blocks.StoneBroken2;
import com.blocks.StoneBroken3;
import com.blocks.Water;

public class WorldGenerator{
	
	static int mapSize = 16;
	static int[][] world = new int[][]{
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,4,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	
	static Map<String, Integer> map = new HashMap<>();
	static Map<Integer, Blocks> blocks = new HashMap<>();
	
	public static void loadMapHashMap() {
		map = new HashMap<>();
		for(int i=0;i<mapSize;i++) {
			for(int k=0;k<mapSize;k++) {
				map.put(i+"x"+k, world[i][k]);
			}
		}
	}
	
	public static void loadBlockHashMap() {
		blocks = new HashMap<>();
		blocks.put(0, new Sky());
		blocks.put(1, new Dirt());
		blocks.put(2, new Grass());
		blocks.put(3, new Stone());
		blocks.put(4, new StoneBroken());
		blocks.put(5, new StoneBroken2());
		blocks.put(6, new StoneBroken3());
		blocks.put(7, new Water());

	}
	
	public static int getBlockID(int x, int y) {
		return map.get(x+"x"+y);
	}
	
	public static Image loadBlock(int x, int y) {
//		System.out.println("Got block # " + getBlockID(x,y));
		return blocks.get(getBlockID(x,y)).returnImage();	
	}
	
	public static BufferedImage loadImage(String imageName) {

		try {
			BufferedImage image = ImageIO.read(new File(imageName));
			return image;
		} catch (IOException e) {
			System.out.println("WorldGenerator.loadImage error!");
			e.printStackTrace();
			return null;
		}

	}

	
}
