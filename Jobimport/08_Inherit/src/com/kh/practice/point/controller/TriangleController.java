package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Triangle;

public class TriangleController {
	private Triangle t = new Triangle();

	public String calcArea(int x, int y) {
		t = new Triangle(x,y);
		return t.shapeName() + t.toString() + t.areaDouble();
	}
	public String calcCircum(int x, int y) {
		t = new Triangle(x, y);
		return t.shapeName() + t.toString() + t.rountInt();
	}
}
