package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		double h, w;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		w = sc.nextDouble();
		
		System.out.print("���� : ");
		h = sc.nextDouble();
		
		System.out.println("���� : " + (h * w));
		System.out.println("�ѷ� : " + (h + w) * 2);
		
		sc.close();
	}

}
