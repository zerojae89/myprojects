package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1()	{
		System.out.println("1번 실습문제");	
		
		/*
		 * 키보드로 입력 받은 정수가 양수면 "양수다" 아니면 "음수다" 출력"
		 * 1. 사용자 입력 받기
		 * 2. 입력받은 값에 대해 양수인지 비교
		 * 		A. 양수면 "양수다" 출력
		 * 		B. 양수가 아니면 " 양수가 아니다" 출
		 */
		
		int num;
		String res;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		res = num <0 ? "양수가 아니다." : "양수다.";
		System.out.println(res);
	
}
	
	
	public static void practice2()	{
		System.out.println("2번 실습문제");
		
		/*
		 * 키보드 값이 0인경우 "0이다"를 출력
		 * 1. 입력받기
		 * 2. 입력받은 값에 대해 양수인지 비
		 */
		int num;
		String res;
	
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		res = num <0 ? "양수가 아니다." : num == 0 ? "0이다." : "양수다.";
		System.out.println(res);
	
	
}
	
	
	public static void practice3()	{
		System.out.println("3번 실습문제");
		/*
		 * 키보드로 받는 하나의 정수
		 * 짝수면 짝 홀수면 
		 */
		
		int num;
		String res;
	
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		res = num%2==0 ? "짝수다" : "홀수다";
		System.out.println(res);
	
}
	
	
	
	public static void practice4()	{
		System.out.println("4번 실습문제");
		
		int x,y;
		
		System.out.print("인원 수 : ");
		x = sc.nextInt();
		
		System.out.print("사탕 수 : ");
		y = sc.nextInt();
		
		System.out.println("1인당 사탕 수 : " +y/x);
		System.out.println("남은 사탕 수 : "+y%x);
		
		
		
	}
	
	public static void practice5()	{
		
	
		System.out.println("5번 실습문제");
		
		String name;
		int lvl, cls, num;
		char gender;
		double grade;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("학년 : ");
		lvl = sc.nextInt();
		
		System.out.print("반 : ");
		cls = sc.nextInt();
		
		System.out.print("번 : ");
		num = sc.nextInt();
		
		System.out.print("성별(M/F : ");
		gender = sc.next().charAt(0);
		
		System.out.print("성 : ");
		grade = sc.nextDouble();
		
		System.out.printf("%d 학년 %d반 %d번 %s의 성적은 %.2f이다.",lvl,cls,num,
				name,gender == 'M' ?"남학생" : "여학생",grade	);
		
		
		
	}
	
	
	public static void practice6()	{
		
		System.out.println("6번 실습문제");
		
		int age;
		String s;
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		s = age <= 13 ? "어린이" : age >13 && age <= 19 ? "청소년" : "성인";
		System.out.println(s);
		
		}
	
public static void practice7()	{
		
		System.out.println("7번 실습문제");
		
		int  ko, en, ma, tot;
		double avg;
		String s;
		
		System.out.print("국어 : ");
		ko = sc.nextInt()	;
		
		System.out.print("영어 : ");
		en = sc.nextInt();
		
		System.out.print("수학 : ");
		ma = sc.nextInt();
		
		tot = ko+en+ma;
		avg = tot / 3.0;
		
		System.out.println("합계 : " + tot);
		System.out.printf("평균 : %.1f", avg);
		
		s = ko >= 40 && en >= 40 && ma >= 40 && avg >= 60 ? "합격" : "불합격";
		
		System.out.println(s);
		
	
		
}

	public static void practice8()	{
	
	System.out.println("8번 실습문제");
	
	String jumin, s;
	
	System.out.print("주민번호 입력(- 포함 입력) : ");
	jumin = sc.next();
	
	s = jumin.charAt(7) == '1' ? "남자" : "여자";
	System.out.println(s);
}
	
	public static void practice9()	{
		
		System.out.println("9번 실습문제");
		int num1 , num2, x;
		boolean b;
		
		System.out.print("정수 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		num2 = sc.nextInt();
		
		System.out.print("입력  : ");
		x = sc.nextInt();
		
		b = x<= num1 || x > num2 ? true : false;
		
		System.out.println(b);
	}
	
	public static void practice10()	{
		
		System.out.println("10번 실습문제");
		
		int num1 , num2, num3;
		boolean b;
		
		System.out.print("정수 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		num2 = sc.nextInt();
		
		System.out.print("정수 3  : ");
		num3 = sc.nextInt();
		
		b = num1 == num2 && num2 == num3 ? true:false;

		System.out.println(b);
		
	}
		
	public static void main(String[] args) {
		
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
		practice9();
		//practice10();
		
		
		
		sc.close();
	}

}
