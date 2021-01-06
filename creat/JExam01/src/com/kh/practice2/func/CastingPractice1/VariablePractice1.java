package com.kh.practice2.func.CastingPractice1;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		
		
		String name,gender;
		int age = 0;
		double tall = 0;		
		Scanner sc= new Scanner(System.in);
		

		
		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = sc.next();
		
		System.out.print("나이를 입력하세요: ");
		age = sc.nextInt()	;
		
		System.out.print("키를 입력하세요: ");
		tall = sc.nextDouble();
		
		
		System.out.println("당신의 이름은"+name+"입니다.");
		System.out.println("당신의 성별은"+gender+"입니다.");
		System.out.println("당신의 나이는"+age+"세 입니다.");
		System.out.println("당신의 키는"+tall+"cm입니다.");
		
		System.out.println("키 "+tall+"인 "+age+"살 "+gender+"자 "+name+"님 반습니다.");

		
		
		sc.close();
	
	}

}
