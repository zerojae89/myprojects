package com.kh.class4;


import com.kh.class4.Shape;

public class Run {

	public static void main(String[] args) {
		
		
		Shape s = new Shape();
		s.setwidth(10);
		s.setheight(20);
		
		System.out.println("너비 : "+s.getWidth());
		System.out.println("높이 : "+s.getHeight());


	}

}
