package com.kh.practice.point.model.vo;

public class Triangle extends Point implements Shape {
	public Triangle() {
	}

	public Triangle(int x, int y) {
		super(x, y);
	}

	@Override
	public String shapeName() {
		return "[삼각형] ";
	}

	@Override
	public int areaInt() {
		return (int) ((getX() * getY()) / 2);
	}

	@Override
	public double areaDouble() {
		return (getX() * getY()) / 2;
	}

	@Override
	public int rountInt() {
		return 3 * getX();
	}

	@Override
	public double roundDouble() {
		return 3 * getX();
	}

	@Override
	public String toString() {
		return super.toString() + " / ";
	}
}
