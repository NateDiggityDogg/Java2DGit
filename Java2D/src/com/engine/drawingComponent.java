package com.engine;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

import com.entities.Player;
import com.worldGeneration.WorldGenerator;

public class drawingComponent extends JComponent {

	static Font font;
	Player p1 = Engine.returnPlayer();

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		drawWorld(g2d);
		drawEntities(g2d);
	}
	
	public void drawWorld(Graphics2D g2d) {
		
		int frameWidth = super.getWidth();
		int frameHeight = super.getHeight();
		
		for(double xPixel=0;xPixel<frameWidth;xPixel+=(frameWidth/16)) {
			for(double yPixel=0;yPixel<frameHeight;yPixel+=(frameHeight/16)) {
			int xBlock =(int) Math.floor((xPixel/frameWidth)*16);
			int yBlock =(int) Math.floor((yPixel/frameHeight)*16);
			
			int xLocation =(int) Math.round(frameWidth - xPixel);
			int yLocation =(int) Math.round(frameHeight - yPixel);
			
			int xScale = frameWidth/16;
			int yScale = frameHeight/16;
			
			g2d.drawImage(WorldGenerator.loadBlock(xBlock, yBlock), xLocation, yLocation, xScale, yScale, null);
			
			}
			}
	}
	
	public void drawEntities(Graphics2D g2d) {
		System.out.println(p1.xLoc + p1.yLoc);
		g2d.drawImage(p1.returnSprite(), p1.xLoc, p1.yLoc, null);
	}

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