package com.engine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JFrame;

import com.entities.Player;
import com.worldGeneration.WorldGenerator;

	public class Engine{
		static JFrame gameFrame;
		static Player p1;
		
		public static int screenWidth;
		public static int screenHeight;
	public static void main(String[] args) {
		
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		p1 = new Player();
		gameFrame = new JFrame();
	
			WorldGenerator.loadBlockHashMap();
		
		gameFrame.setSize(screenWidth/2,screenHeight/2);
		gameFrame.setLocation(screenWidth/4, screenHeight/4);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.addKeyListener(new Keybinds());
		gameFrame.setVisible(true); 
		gameFrame.add(new drawingComponent());
		
		while(true) {
			tick();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			gameFrame.repaint();
		}
	}
	
	public static JFrame returnFrame() {
		return gameFrame;
	}
	
	public static Player returnPlayer() {
		return p1;
	}
	
	public static void tick() {
		p1.update();
	}
}
