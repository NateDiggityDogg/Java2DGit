package com.entities;

import com.blocks.Blocks;
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
	
	public static boolean checkCollision(Characters c1, Blocks c2) {
		if(c1.getHitbox().intersects(c2.getHitbox())){
			System.out.println("Collision!");
			return true;
		}else {
			return false;
	}
}
}