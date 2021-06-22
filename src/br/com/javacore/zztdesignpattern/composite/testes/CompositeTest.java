package br.com.javacore.zztdesignpattern.composite.testes;

import java.awt.Color;

import br.com.javacore.zztdesignpattern.composite.Circle;
import br.com.javacore.zztdesignpattern.composite.CompoundShape;
import br.com.javacore.zztdesignpattern.composite.Dot;
import br.com.javacore.zztdesignpattern.composite.ImageEditor;
import br.com.javacore.zztdesignpattern.composite.Rectangle;

public class CompositeTest {

	public static void main(String[] args) {
		
		ImageEditor editor = new ImageEditor();
		editor.loadShapes(
				new Circle(10, 10, 10, Color.BLUE),
				new CompoundShape(
						new Circle(110, 110, 50, Color.RED),
						new Dot(160, 160, Color.RED)),
				new CompoundShape(
						new Rectangle(250, 250, Color.GREEN, 100, 100),
						new Dot(240, 240, Color.GREEN),
						new Dot(240, 360, Color.GREEN),
						new Dot(360, 360, Color.GREEN),
						new Dot(360, 240, Color.GREEN)));
	}
}
