package com.kh.practice2.func.CastingPractice1;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		
		double w , h ;
		Scanner sc = new Scanner (System.in);
		
		System.out.print("가로 : ");
		w= sc.nextDouble();
		
		System.out.print("세로 : ");
		h= sc.nextDouble();
		
		System.out.println("면적 : "+(w*h));
		System.out.println("면적 : "+(w+h)*2);
		
		sc.close();
	}

}
