package br.com.javacore.zztdesignpattern.composite;

import java.awt.Graphics;

public interface Shape {

	int getX();
	int getY();
	int getWidth();
	int getHeigth();
	void move(int x, int y);
	boolean isInsideBounds(int x, int y);
	void select();
	void unselect();
	boolean isSelect();
	void paint(Graphics graphics);
}
