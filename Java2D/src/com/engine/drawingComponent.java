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
		for(int xPixel=512;xPixel>0;xPixel-=32)
		for(int yPixel=512;yPixel>0;yPixel-=32) {
			g2d.drawImage(WorldGenerator.loadBlock(xPixel/32-1, yPixel/32-1), xPixel, yPixel, null);
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