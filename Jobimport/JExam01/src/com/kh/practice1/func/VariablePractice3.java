package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		double h, w;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		w = sc.nextDouble();
		
		System.out.print("세로 : ");
		h = sc.nextDouble();
		
		System.out.println("면적 : " + (h * w));
		System.out.println("둘레 : " + (h + w) * 2);
		
		sc.close();
	}

}
