package com.worldGeneration;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public class WorldGenerator{
	static int[][] world = new int[][]{
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
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	
	static Map<String, Integer> map = new HashMap<>();
	static Map<Integer, BufferedImage> blocks = new HashMap<>();
	
	public static void loadMapHashMap() {
		map = new HashMap<>();
		for(int i=0;i<16;i++) {
			for(int k=0;k<16;k++) {
				map.put(i+"x"+k, world[i][k]);
			}
		}
	}
	
	public static void loadBlockHashMap() {
		blocks = new HashMap<>();
		blocks.put(0, loadImage("graphics/sky.jpg"));
		blocks.put(1, loadImage("graphics/dirt.jpg"));
		blocks.put(2, loadImage("graphics/grass.jpg"));
		blocks.put(3, loadImage("graphics/stone.jpg"));
		blocks.put(4, loadImage("graphics/stoneBroken.jpg"));
		blocks.put(5, loadImage("graphics/stoneBroken2.jpg"));
		blocks.put(6, loadImage("graphics/stoneBroken3.jpg"));
		blocks.put(7, loadImage("graphics/water.jpg"));

	}
	
	public static int getBlockID(int x, int y) {
//		return world[x][y];
		return map.get(x+"x"+y);
	}
	
	public static BufferedImage loadBlock(int x, int y) {
//		System.out.println("Got block # " + getBlockID(x,y));
		return blocks.get(getBlockID(x,y));	
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
