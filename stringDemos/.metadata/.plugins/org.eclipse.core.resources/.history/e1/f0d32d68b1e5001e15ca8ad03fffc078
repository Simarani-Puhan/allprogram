package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("rectangle")
	private Shape shape;
	@Autowired
	private Shape traingle;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	private Shape shaper;

	public ShapeFactory(Shape shaper) {
		super();
		this.shaper = shaper;
	}

	void printArea(String choice, int x, int y) {
		if (choice.equals("r"))
			shape.area(x, y);
		if (choice.equals("t"))
			traingle.area(x, y);
		if (choice.equals("s"))
			shaper.area(x, y);
		

	}

}
