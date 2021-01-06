package com.kh.practice.point.model.vo;

public class Circle extends Point implements Shape {
	private int radius;

	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return super.toString() + getRadius() + " / ";
	}

	@Override
	public String shapeName() {
		return "[원형] ";
	}

	@Override
	public int areaInt() {
		return (int)(3.14*getRadius()*getRadius());
	}

	@Override
	public double areaDouble() {
		return 3.14*getRadius()*getRadius();
	}

	@Override
	public int rountInt() {
		return (int)(2*3.14*getRadius());
	}

	@Override
	public double roundDouble() {
		return 2*3.14*getRadius();
	}
}
