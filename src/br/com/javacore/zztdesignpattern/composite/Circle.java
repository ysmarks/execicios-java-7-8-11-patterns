package br.com.javacore.zztdesignpattern.composite;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends BaseShape {
	
	public int redius;
	
	public Circle(int x, int y, int redius, Color color) {
		super(x, y, color);
		this.redius = redius;
	}

	@Override
	public int getWidth() {
		return redius * 2;
	}
	
	@Override
	public int getHeigth() {
		return redius * 2;
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawOval(x, y, getWidth() - 1, getHeigth() - 1);
	}

}
