package com.kh.practice.point.view;

import java.util.Scanner;
import com.kh.practice.point.controller.*;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RactangleController rc = new RactangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴번호 : ");
			
			switch(sc.next()) {
			case "1" :
				circleMenu();	break;
			
			case "2" : 
				rectangleMenu();	break;
			case "9" :
				exit = true;	break;
				default : 
					continue;
				
			}
				
		
	}
		
		public void rectangleMenu() {
			while(true) {
				System.out.println("1. 원");
				System.out.println("2. 사각형");
				System.out.println("9. 끝내기");
				System.out.println("메뉴번호 : ");
				
				switch(sc.next()) {
				case "1" :
					calcPerimeter();	break;
				
				case "2" : 
					calcCircleArea();	break;
				case "9" :
					exit = true;	break;
					default : 
						continue;
	
}
