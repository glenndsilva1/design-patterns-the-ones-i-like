package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();

    // Add a graphic to the collection
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    // Remove a graphic from the collection
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }


	@Override
	public void draw() {
		 System.out.println("Drawing a composite group of graphics:");
	        for (Graphic graphic : graphics) {
	            graphic.draw();  // Draw each individual graphic
	        }
	    }

	 public static void main(String[] args) {
	        // Create simple shapes (leaves)
	        Graphic circle = new Circle();
	        Graphic rectangle = new Square();
	        // Create a composite shape (drawing)
	        Drawing drawing = new Drawing();
	        drawing.add(circle);
	        drawing.add(rectangle);
	        // Draw individual shapes
	        circle.draw();
	        rectangle.draw();
	        // Draw composite group of shapes
	        drawing.draw();
	    }
}
