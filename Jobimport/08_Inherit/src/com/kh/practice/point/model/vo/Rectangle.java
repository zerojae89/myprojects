package com.kh.practice.point.model.vo;

public class Rectangle extends Point implements Shape {
	private int height;
	private int width;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int height, int width) {
		super(x, y);
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return super.toString() + getHeight() + ", " + getWidth() + " / ";
	}

	@Override
	public String shapeName() {
		return "[사각형] ";
	}

	@Override
	public int areaInt() {
		return getWidth() * getHeight();
	}

	@Override
	public double areaDouble() {
		return getWidth() * getHeight();
	}

	@Override
	public int rountInt() {
		return 2 * (getWidth()+getHeight());
	}

	@Override
	public double roundDouble() {
		return 2 * (getWidth()+getHeight());
	}
}
