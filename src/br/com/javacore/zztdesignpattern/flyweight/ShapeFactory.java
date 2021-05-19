package br.com.javacore.zztdesignpattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	
	private static final HashMap<String, Circle> cicleMap = new HashMap<String, Circle>();
	
	public static Shape getCicle(String color) {
		
		Circle circle = (Circle) cicleMap.get(color);
		
		if(circle == null) {
			circle = new Circle(color);
			cicleMap.put(color, circle);
			System.out.println("Creating circle of color: " + color);
		}
		
		return circle;
	}

}
