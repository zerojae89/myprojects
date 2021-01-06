package com.kh.practice2.func.CastingPractice2;

import java.util.Scanner;

public class CastingPractice21 {

	public static void main(String[] args) {
	
		double d1,d2,d3;
		int tot, avg;

		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("국어 : ");
		d1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		d2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		d3 = sc.nextDouble();
		
		tot = (int)(d1+d2+d3);
		avg = tot / 3;
	
		
		System.out.printf("총점 :%d \n평균 : %d \n",tot,avg);
		
		sc.close();

	}

}
