package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		double g1, g2, g3;
		int tot, avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		g1 = sc.nextDouble();
		
		System.out.print("���� : ");
		g2 = sc.nextDouble();
		
		System.out.print("���� : ");
		g3 = sc.nextDouble();
		
		tot = (int)(g1 + g2 + g3);
		avg = tot / 3;
		
		System.out.printf("���� : %d \n��� : %d \n", tot, avg);
		
		sc.close();
	}

}
