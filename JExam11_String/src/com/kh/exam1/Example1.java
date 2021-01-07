package com.kh.exam1;

import java.util.Scanner;

public class Example1 {
	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input;
		while(true) {
			System.out.println("프로그램이 실행중 입니다.");
			System.out.println("계속 실행하시겠습니까? (yes/no) : ");
			input = sc.next();
			if(input.equalsIgnoreCase("no")) {
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);
			}else if (input.equalsIgnoreCase("yes")) {
				continue;
			}
		}
		

		
		
	}

}
