package com.kh.practice.point.view;

import com.kh.practice.point.controller.*;
import java.util.Scanner;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	private TriangleController tc = new TriangleController();

	// 메인메뉴 출력, 잘못 입력시 반복
	public void mainMenu() {
		int menuNum1;
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("3. 삼각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum1 = sc.nextInt();
			
			switch(menuNum1) {
			case 1 : this.circleMenu();	break;
			case 2 : this.rectangleMenu(); break;
			case 3 : this.TriangleMenu(); break;
			case 9 : System.exit(0);
			default : System.out.println("올바른 메뉴 번호를 입력하세요.");
			}
		}
	}

	// 원 메뉴 출력, 잘못 입력시 메인으로
	public void circleMenu() {
		int menuNum2;
		
		while(true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			menuNum2 = sc.nextInt();
			
			switch(menuNum2) {
			case 1 : this.calcCircum(); break;
			case 2 : this.calcCircleArea(); break;
			case 9 : this.mainMenu(); break;
			default : System.out.println("올바른 메뉴 번호를 입력하세요.");
			}
		}
	}

	// 사각형 메뉴 출력, 잘못 입력 시 메인으로
	public void rectangleMenu() {
		int menuNum3;
		
		while(true) {
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			menuNum3 = sc.nextInt();
			
			switch(menuNum3) {
			case 1 : this.calcPerimeter(); break;
			case 2 : this.calcRectArea(); break;
			case 9 : this.mainMenu(); break;
			default : System.out.println("올바른 메뉴 번호를 입력하세요.");
			}
		}
	}
	
	public void TriangleMenu() {
		int menuNum4;
		
		while(true) {
			System.out.println("===== 삼각형 메뉴 =====");
			System.out.println("1. 삼각형 둘레");
			System.out.println("2. 삼각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			menuNum4 = sc.nextInt();
			
			switch(menuNum4) {
			case 1 : this.calcTriRound(); break;
			case 2 : this.calcTriArea(); break;
			case 9 : this.mainMenu(); break;
			default : System.out.println("올바른 메뉴 번호를 입력하세요.");
			}
		}
	}

	// x,y좌표와 반지름을 입력받아 원의 정보/둘레 출력
	public void calcCircum() {
		int x,y,radius;
		System.out.print("x 좌표 : ");		x = sc.nextInt();
		System.out.print("y 좌표 : ");		y = sc.nextInt();
		System.out.print("반지름 : ");		radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius));
	}

	// x,y좌표와 반지름을 입력받아 원의 정보/넓이 출력
	public void calcCircleArea() {
		int x, y, radius;
		System.out.print("x 좌표 : ");		x = sc.nextInt();
		System.out.print("y 좌표 : ");		y = sc.nextInt();
		System.out.print("반지름 : ");		radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}

	// x,y좌표와 높이, 너비를 받아 사각형의 정보/둘레 출력
	public void calcPerimeter() {
		int x, y, height, width;
		System.out.print("x 좌표 : ");		x = sc.nextInt();
		System.out.print("y 좌표 : ");		y = sc.nextInt();
		System.out.print("높이 : ");		height = sc.nextInt();
		System.out.print("너비 : ");		width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}

	// x,y좌표와 높이, 너비를 받아 사각형의 정보/넓이 출력
	public void calcRectArea() {
		int x, y, height, width;
		System.out.print("x 좌표 : ");		x = sc.nextInt();
		System.out.print("y 좌표 : ");		y = sc.nextInt();
		System.out.print("높이 : ");		height = sc.nextInt();
		System.out.print("너비 : ");		width = sc.nextInt();
		System.out.println(rc.calcArea(x, y, height, width));
	}
	// x,y좌표 (각각 한 변의 길이, 정삼각형의 높이)
	public void calcTriRound() {
		int x, y;
		System.out.print("x 좌표 : ");		x = sc.nextInt();
		System.out.print("y 좌표 : ");		y = sc.nextInt();
		System.out.println(tc.calcCircum(x, y));
	}
	public void calcTriArea() {
		int x, y;
		System.out.print("x 좌표 : ");		x = sc.nextInt();
		System.out.print("y 좌표 : ");		y = sc.nextInt();
		System.out.println(tc.calcArea(x, y));
	}
}
