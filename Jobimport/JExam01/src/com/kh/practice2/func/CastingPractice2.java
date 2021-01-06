package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		double g1, g2, g3;
		int tot, avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		g1 = sc.nextDouble();
		
		System.out.print("¿µ¾î : ");
		g2 = sc.nextDouble();
		
		System.out.print("¼öÇÐ : ");
		g3 = sc.nextDouble();
		
		tot = (int)(g1 + g2 + g3);
		avg = tot / 3;
		
		System.out.printf("ÃÑÁ¡ : %d \nÆò±Õ : %d \n", tot, avg);
		
		sc.close();
	}

}
