package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		char c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		//                             012345
		c = sc.next().charAt(0);    // string
		
		System.out.println(c + " Unicode " + (int)c);
		sc.close();
	}
	
}
