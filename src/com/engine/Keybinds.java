package com.engine;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Keybinds implements KeyListener {
	
	public static boolean W = false;
	public static boolean A = false;
	public static boolean S = false;
	public static boolean D = false;

	public void keyPressed(KeyEvent e) {
		int keyInfo = e.getKeyCode();
		
		if(keyInfo == KeyEvent.VK_A) {
			A=true;
		}
		
		if(keyInfo == KeyEvent.VK_W) {
			W=true;
		}
		
		if(keyInfo == KeyEvent.VK_S) {
			S=true;
		}
		
		if(keyInfo == KeyEvent.VK_D) {
			D=true;
		}
		
	}

	public void keyReleased(KeyEvent e) {
		int keyInfo = e.getKeyCode();
		
		if(keyInfo == KeyEvent.VK_A) {
			A=false;
		}
		
		if(keyInfo == KeyEvent.VK_W) {
			W=false;
		}
		
		if(keyInfo == KeyEvent.VK_S) {
			S=false;
		}
		
		if(keyInfo == KeyEvent.VK_D) {
			D=false;
		}
		
	}

	public void keyTyped(KeyEvent e) {
		//unused
		
	}
}
