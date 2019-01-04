package com.entities;

import java.awt.Image;
import java.awt.Rectangle;

import com.blocks.Block;
import com.engine.Engine;
import com.engine.Keybinds;
import com.engine.drawingComponent;
import com.worldGeneration.WorldGenerator;

public class Characters {
	
	public double xLoc;
	public double yLoc;
	
	public int width;
	public int regularWidth;
	public int mirroredWidth;
	public int height;
	
	public double horizontalVelocity;
	public double verticalVelocity;
	
	public Image charSprite;
	
	public boolean facingRight;
	public boolean affectedByGravity;
	
	public double defaultRunSpeed;
	public double runSpeed;
	
	public int lastCollisionTicks = 0;
	public int cooldown = 0;
	
	public int collisionError = 5;
	public int frictionMultiplier = 1;
	
	Characters(double xLoc, double yLoc){
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	static Image convertString(String entityID) {
		return com.engine.drawingComponent.loadImage(entityID);
	}
	
	public Image returnSprite() {
		return charSprite;
	}
	
	public void update() {
		
		collision();
		xLoc+=horizontalVelocity;
		yLoc+=verticalVelocity;
		
	}
	
	public double[] getPredictedPreviousLocation(int ticks) {
		double[] vals = new double[2];
		vals[0] = this.xLoc - (horizontalVelocity * ticks);
		vals[1] = this.yLoc - (verticalVelocity * ticks);
		return vals;
	}
	
	public Rectangle getHitbox() {
		int frameHeight = Engine.returnDrawingComponent().getHeight();
		if(width>0) {
		return new Rectangle((int) (xLoc*32-width/2), (int) (frameHeight-(yLoc*32-height/2)),width,height);
		}else {
		return new Rectangle((int) (xLoc*32-width/2+width), (int) (frameHeight-(yLoc*32-height/2)),-width,height);	
		}
	}
	
	public Rectangle getPreviousHitbox(int previousTicks) {
		
		int frameHeight = Engine.returnDrawingComponent().getHeight();
		
		double[] previousLocs = getPredictedPreviousLocation(previousTicks);
		double xLoc = previousLocs[0];
		double yLoc = previousLocs[1];
		
		if(width>0) {
			return new Rectangle((int) (xLoc*32-width/2), (int) (frameHeight-(yLoc*32-height/2)),width,height);
			}else {
			return new Rectangle((int) (xLoc*32-width/2+width), (int) (frameHeight-(yLoc*32-height/2)),-width,height);	
			}
	}
	
	public void collision() {

		if(CollisionDetection.checkCollisionIfSolid(this, WorldGenerator.getLoadedBlocks()) > 0) {
			if(CollisionDetection.checkCollisionIfSolid(this, WorldGenerator.getLoadedBlocks()) > 1) {
				Block[] b = CollisionDetection.returnCollisionSolidBlock(this, WorldGenerator.getLoadedBlocks());
				if(this.getPreviousHitbox(2).getMaxY() - collisionError <= b[0].getHitbox().getMinY() && this.getPreviousHitbox(2).getMaxY() - collisionError <= b[1].getHitbox().getMinY()) {
					if(verticalVelocity < 0)	verticalVelocity = 0; //Math.abs(verticalVelocity);
					horizontalVelocity = horizontalVelocity*198/200;
				}else if(this.getPreviousHitbox(2).getMinY() >= b[0].getHitbox().getMaxY() && this.getPreviousHitbox(2).getMinY() >= b[1].getHitbox().getMaxY()) {
					verticalVelocity = -Math.abs(verticalVelocity);
				}
				
				if(this.getPreviousHitbox(1).getMaxX() <= b[0].getHitbox().getMinX() && this.getPreviousHitbox(1).getMaxX() <= b[1].getHitbox().getMinX()) {
					horizontalVelocity = -Math.abs(horizontalVelocity);
				}else if(this.getPreviousHitbox(1).getMinX() >= b[0].getHitbox().getMaxX() && this.getPreviousHitbox(1).getMinX() >= b[1].getHitbox().getMaxX()) {
					horizontalVelocity = Math.abs(horizontalVelocity);
				}
			}else {
			Block[] b = CollisionDetection.returnCollisionSolidBlock(this, WorldGenerator.getLoadedBlocks());
			if(this.getPreviousHitbox(2).getMaxY() - collisionError <= b[0].getHitbox().getMinY()) {
				if(verticalVelocity < 0)verticalVelocity = 0; //Math.abs(verticalVelocity);
				horizontalVelocity = horizontalVelocity*198/200;
			}else if(this.getPreviousHitbox(2).getMinY() >= b[0].getHitbox().getMaxY()) {
				verticalVelocity = -Math.abs(verticalVelocity);
			}
			
			if(this.getPreviousHitbox(1).getMaxX() <= b[0].getHitbox().getMinX()) {
				horizontalVelocity = -Math.abs(horizontalVelocity);
			}else if(this.getPreviousHitbox(1).getMinX() >= b[0].getHitbox().getMaxX()) {
				horizontalVelocity = Math.abs(horizontalVelocity);
			}
			}
		}
	}
}
