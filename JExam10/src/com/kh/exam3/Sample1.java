package com.kh.exam3;

import java.util.Random;

class Shape{
	private int width;
	private int height;
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return this.width;
		
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getArea() {
		return this.width * this.height;
	}
	
}
	class Square extends Shape{
		public String name = "사각형";
		public Square(int width, int height) {
			super(width,height);
		}
	}
	
	class Triangle extends Shape{
		public String name = "삼각형";
		public Triangle(int width, int height) {
			super(width,height);
		}
		@Override
		public int getArea() {
			return super.getArea()/2;
		}
	
}

public class Sample1 {

	public static void main(String[] args) {
		
		Square s = new Square(10,20);
		System.out.println("넓이 : " + s.getArea());
		
		Triangle t = new Triangle(10,20);
		System.out.println("넓이 : " + t.getArea());
		
		// 업 캐스팅 : 서브객체가 슈퍼객체로 자동형 변환.
		// 다운캐스팅 : 슈퍼객체를 통해서 서브객체를 참조할 때 슈퍼객체가 가지고 있지 않은 멤버에 접근하기	
		//			위해서 참조형을 서브객체로 변환 (자동형변환 안됨.)
		
		Shape p1 = new Square(10,20);
		System.out.println(((Square)p1).name + "넓이 : " + p1.getArea());
		
		Shape p2 = new Triangle(10,20);
		System.out.println(((Triangle)p2).name + "넓이 : " + p2.getArea());
		
		Shape[] shape = new Shape[5];
		for(int i = 0; i < shape.length; i++) {
			int w = rand.nextInt(90)+10;	h = rand.nextInt(90)+10;
			if(i % 2 == 0) {
				shape[i] = new Square(w,h);
			}else {
				shape[i] = new Triangle(w,h);
			}
		}
		for(int i = 0; i < shape.length; i++) {
			System.out.println("너비 : " + shape[i].getWidth() + "|"+"높이 : "+ shape[i].getHeight();
			
		}
	}

}
