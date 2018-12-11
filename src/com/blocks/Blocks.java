package com.blocks;

import java.awt.Image;

public class Blocks {
	boolean solid;
	boolean affectedByGravity;
	Image image;
	public Image returnImage() {
		return this.image;
	}
	public Boolean isSolid() {
		return this.solid;
	}
	public Boolean affectedByGravity() {
		return this.affectedByGravity();
	}
}
