package com.engine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JFrame;

	public class Engine{
		JFrame gameFrame;
	public static void main(String[] args) {
		JFrame gameFrame = new JFrame();
		
		gameFrame.setSize(512 * 2, 256 * 2);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true); 
		
		Color red = new Color(255, 0, 0);
		Color blue = new Color(0, 0, 255);
		
		Image image;
		
		gameFrame.getContentPane().setBackground(red);
		
		Graphics draw = gameFrame.getContentPane().getGraphics();
		draw.setColor(blue);
		
		draw.drawRect(50, 50, 500, 500);
		gameFrame.repaint();
	}
	
	public JFrame returnFrame() {
		return gameFrame;
	}
}
