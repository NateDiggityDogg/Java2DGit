package com.entities;

import com.blocks.Block;
import com.engine.Engine;

public class CollisionDetection {
	Player p1 = Engine.returnPlayer();
	public static boolean checkCollision(Characters c1, Characters c2) {
		if(c1.getHitbox().intersects(c2.getHitbox())){
			System.out.println("Collision!");
			return true;
		}else {
			return false;
	}
}
	
	public static boolean checkCollision(Characters c1, Characters[] c2) {
		for(int i=0;i<c2.length;i++) {
			if(c1.getHitbox().intersects(c2[i].getHitbox())){
				System.out.println("Collision!");
				return true;
			}
		}
		return false;
		}
	
	public static boolean checkCollision(Characters c1, Block c2) {
		if(c1.getHitbox().intersects(c2.getHitbox())){
			System.out.println("Collision!");
			return true;
		}else {
			return false;
	}
	}
		
		public static boolean checkCollision(Characters c1, Block[] c2) {
			for(int i=0;i<c2.length;i++) {
				if(c1.getHitbox().intersects(c2[i].getHitbox())){
					System.out.println("Collision!");
					return true;
				}
			}
			return false;
			}
		
		public static int checkCollisionIfSolid(Characters c1, Block[] c2) {
			int k = 0;
			for(int i=0;i<c2.length;i++) {
				if(c1.getHitbox().intersects(c2[i].getHitbox()) && c2[i].isSolid()){
					System.out.println("Collision!");
					k++;
				}
			}
			return k;
			}
		
		public static Block[] returnCollisionSolidBlock(Characters c1, Block[] c2) {
			Block[] blocks = new Block[12];
			int count = 0;
			for(int i=0;i<c2.length;i++) {
				if(c1.getHitbox().intersects(c2[i].getHitbox()) && c2[i].isSolid()){
					System.out.println("Collision!");
					blocks[count] = c2[i];
					count++;
				}
			}
			return blocks;
			}
	
}