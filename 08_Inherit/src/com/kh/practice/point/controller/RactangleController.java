package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RactangleController {
	private Rectangle r = new Rectangle();
	
	public String calcPerimeter(int x, int y, int h, int w) {
		int result;
		
		r.setX(x); r.setY(y); r.setHeight(h); r.setWidth(w);
		result = (w+h)
	}

}
