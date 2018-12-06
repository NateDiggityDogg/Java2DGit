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

import com.worldGeneration.WorldGenerator;

public class drawingComponent extends JComponent {

	static Font font;

	public void paintComponent(Graphics g) {
		int frameWidth = super.getWidth();
		int frameHeight = super.getHeight();

		Graphics2D g2d = (Graphics2D) g;

		System.out.println("draw!");
//		for(int xPixel=frameWidth;xPixel>= frameWidth/8;xPixel-=frameWidth/16) {
//		for(int yPixel=frameHeight;yPixel>= frameHeight/8;yPixel-=frameHeight/16) {
//			int blockX = xPixel/frameWidth*16-1;
//			//System.out.println("BlockX: " + blockX);
//			int blockY = yPixel/frameHeight*16-1;
//			//System.out.println("BlockY: " + blockY);
//			g2d.drawImage(WorldGenerator.loadBlock(blockX, blockY), xPixel-frameWidth/16, yPixel-frameHeight/16, null);
//		}
//	}
		
		for(double xPixel=0;xPixel<frameWidth;xPixel+=(frameWidth/16)) {
		for(double yPixel=0;yPixel<frameHeight;yPixel+=(frameHeight/16)) {
		int xBlock =(int) Math.floor((xPixel/frameWidth)*16);
		int yBlock =(int) Math.floor((yPixel/frameHeight)*16);
		
		System.out.println(xPixel+" "+yPixel+" "+frameWidth+" "+frameHeight);
		
		System.out.println(yPixel/frameHeight*16);
		System.out.println(yBlock);
		
		int xLocation =(int) Math.round(frameWidth - xPixel);
		int yLocation =(int) Math.round(frameHeight - yPixel);
		
		int xScale = frameWidth/16;
		int yScale = frameHeight/16;
		
		g2d.drawImage(WorldGenerator.loadBlock(xBlock, yBlock), xLocation, yLocation, xScale, yScale, null);
		
		}
		}
		
	}

	public BufferedImage loadImage(String imageName) {

		try {
			BufferedImage image = ImageIO.read(new File(imageName));
			return image;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}
}