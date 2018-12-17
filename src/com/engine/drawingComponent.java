package com.engine;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

import com.blocks.Block;
import com.entities.Goomba;
import com.entities.Player;
import com.worldGeneration.WorldGenerator;

public class drawingComponent extends JComponent {

	static Font font;
	Player p1 = Engine.returnPlayer();
	Goomba g1 = Engine.returnGoomba();
	
	int frameWidth = super.getWidth();
	int frameHeight = super.getHeight();

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		drawWorld(g2d);
		drawEntities(g2d);
	}
	
	public void drawWorld(Graphics2D g2d) {
		
		frameWidth = super.getWidth();
		frameHeight = super.getHeight();
		
		for(int i=0;i<WorldGenerator.world.length;i++) {
			for(int k=0;k<WorldGenerator.world[0].length;k++) {
			Block block = WorldGenerator.loadBlock(i, k);
			drawImageFromCenter(block.returnImage(), i, k, block.width, block.height, g2d);
			g2d.draw(WorldGenerator.loadHitbox(i, k));
			}
		}
		
	}
	
	public void drawEntities(Graphics2D g2d) {
		drawImageFromCenter(p1.returnSprite(), p1.xLoc, p1.yLoc, p1.width, p1.height, g2d);
		drawImageFromCenter(g1.returnSprite(), g1.xLoc, g1.yLoc, g1.width, g1.height, g2d);
	}
	
	public void drawImageFromCenter(Image i, double xLoc, double yLoc, int width, int height, Graphics2D g2d) {
		g2d.drawImage(i, (int) (xLoc*32-width/2), (int) (frameHeight-(yLoc*32-height/2)),width,height,null);
	}
	
//	public void drawShapeFromCenter(Shape s, Graphics2D g2d) {
//		g2d.drawRect(arg0, arg1, arg2, arg3);
//	}

	public static BufferedImage loadImage(String imageName) {

		try {
			BufferedImage image = ImageIO.read(new File(imageName));
			return image;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
}