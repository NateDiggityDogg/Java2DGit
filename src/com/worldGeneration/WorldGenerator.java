package com.worldGeneration;

import java.awt.Image;
import java.awt.Rectangle;
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

	public static int[][] world = new int[][]{
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,3,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,3,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,3,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{3,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
	};
	
	static Map<String, Integer> map = new HashMap<>();
	static Map<String, Blocks> blocks = new HashMap<>();
	
	public static void loadMapHashMap() {
		map = new HashMap<>();
		for(int i=0;i<world.length;i++) {
			for(int k=0;k<world[0].length;k++) {
				map.put(i+"x"+k, world[i][k]);
			}
		}
	}
	
	public static void loadBlockHashMap() {
		blocks = new HashMap<>();
		for(int i=0;i<world.length;i++) {
			for(int k=0;k<world[0].length;k++) {
				Blocks selected;
					switch(world[i][k]) {
				case 0:
					selected = new Sky(i,k);
					break;
				case 1:
					selected = new Dirt(i,k);
					break;
				case 2:
					selected = new Grass(i,k);
					break;
				case 3:
					selected = new Stone(i,k);
					break;
				case 4:
					selected = new StoneBroken(i,k);
					break;
				default:
					selected = null;
					break;
				}
				blocks.put(i+"x"+k, selected);
			}
		}

	}
	
	public static Blocks loadBlock(int x, int y) {
//		System.out.println("Got block # " + getBlockID(x,y));
		return blocks.get(x+"x"+y);
	}
	
	public static Rectangle loadHitbox(int x, int y) {
		return blocks.get(x+"x"+y).getHitbox();
	}
	
	public static Blocks getBlockAt(int x, int y) {
		return blocks.get(x+"x"+y);
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
