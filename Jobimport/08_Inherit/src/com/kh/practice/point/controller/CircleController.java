package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	private Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return c.shapeName() + c.toString() + c.areaDouble();
	}

	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return c.shapeName() + c.toString() + c.roundDouble();
	}
}
