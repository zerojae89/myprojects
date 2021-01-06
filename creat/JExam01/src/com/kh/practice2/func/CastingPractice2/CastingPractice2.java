package com.kh.practice2.func.CastingPractice2;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
	
		double d1,d2,d3;

		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("국어 : ");
		d1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		d2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		d3 = sc.nextDouble();
		
		System.out.println("총점 : "+(int)(d1+d2+d3));
		System.out.print("평균 : "+(int)(d1+d2+d3)/3);
		
		sc.close();

	}

}
