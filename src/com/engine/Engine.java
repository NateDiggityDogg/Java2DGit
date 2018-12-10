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
		JFrame gameFrame;
		static Player p1;
	public static void main(String[] args) {
		p1 = new Player();
		
		JFrame gameFrame = new JFrame();
		
		int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	
			WorldGenerator.loadBlockHashMap();
		
		gameFrame.setSize(screenWidth/2,screenHeight/2);
		gameFrame.setLocation(screenWidth/4, screenHeight/4);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true); 
		gameFrame.add(new drawingComponent());
		
//		while(true) {
//			gameFrame.repaint();
//		}
	}
	
	public JFrame returnFrame() {
		return gameFrame;
	}
	
	public static Player returnPlayer() {
		return p1;
	}
}
