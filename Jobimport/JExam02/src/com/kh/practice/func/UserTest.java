package com.kh.practice.func;

import java.util.Scanner;

public class UserTest {

	public static Scanner sc = new Scanner(System.in);	//정적 변수로 대체 사용.
	public static void practice1() {
		int a ;
		
		System.out.println("1번 실습문제");
		System.out.println("정수 : ");
		a = sc.nextInt();
		System.out.println(a > 0 ? "양수다." : "양수가 아니다.");
		
	}
	
	public static void practice2() {
		int b ;
		
		System.out.println("2번 실습문제");
		System.out.println("정수 : ");
		b = sc.nextInt();
		System.out.println(b >= 0 ? b == 0 ? "0이다." : "양수다." : "음수다.");
		
	}
	
	public static void practice3() {
		int c ;
		
		System.out.println("3번 실습문제");
		System.out.println("정수 : ");
		c = sc.nextInt();
		System.out.println(c % 2 == 0 ? "짝수다." : "홀수다.");
		
	}
	
	public static void practice4() {
		int d, e, f, g;
		
		System.out.println("4번 실습문제");
		System.out.println("인원수 : ");
		d = sc.nextInt();
		System.out.println("사탕 개수 : ");
		e = sc.nextInt();
		
		f = e / d;
		g = e % d; 
		
		
		System.out.printf("1인당 사탕 개수 : %d\n남는 사탕 개수 : %d", f, g);
		
	}
	
	public static void practice5() {
		String name, gen;
		int grd ,cls, num;
		double scr;
		
		System.out.println("5번 실습문제");
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("학년(숫자만) : ");
		grd = sc.nextInt();
		System.out.println("반(숫자만) : ");
		cls = sc.nextInt();
		System.out.println("번호(숫자만) : ");
		num = sc.nextInt();
		System.out.println("성별(M/F) : ");
		gen = sc.next();
		System.out.println("성적(소수점 아래 둘째자리까지) : ");
		scr = sc.nextDouble();
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", grd, cls, num, name, gen, scr);
		
	}
	
	public static void practice6() {
		int age ;
		
		System.out.println("6번 실습문제");
		System.out.println("나이 : ");
		age = sc.nextInt();
		System.out.println(age <= 13 ? "어린" : age <= 19 ? "청소년" : "성인");
		
	}
	
	public static void practice7() {
		int k, e, m, sum ;
		double avg;
		
		System.out.println("7번 실습문제");
		System.out.println("국어 : ");
		k = sc.nextInt();
		System.out.println("영어 : ");
		e = sc.nextInt();
		System.out.println("수학 : ");
		m = sc.nextInt();
		
		sum = k + e + m;
		avg = sum / 3;
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f", avg);
		
		System.out.println(k >= 40 && e >= 40 && m >= 40 && avg >= 60 ? "합격" : "불합격");
		
	}
	
	public static void practice8() {
		String id ;
		
		System.out.println("8번 실습문제");
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		id = String.valueOf(sc.next().charAt(7));    // 문자 -> 문자열 변환 참고.
		
		// 문자열은 기본 비교연산자로 비교하면 안됨.
		System.out.println(id.equals("2") ? "여자" : "남자");
	}
	
	public static void practice9() {
		int num1, num2, a ;
	
		System.out.println("9번 실습문제");
		System.out.println("정수1 : ");
		num1 = sc.nextInt();
		System.out.println("정수2 : ");
		num2 = sc.nextInt();
		System.out.println("입력 : ");
		a = sc.nextInt();
		System.out.println(a >= num2 || a < num1 ? "true" : "false");
		
	}
	
	public static void practice10() {
		int num1, num2, num3 ;
		
		
		System.out.println("입력1 : ");
		num1 = sc.nextInt();
		System.out.println("입력2 : ");
		num2 = sc.nextInt();
		System.out.println("입력3 : ");
		num3 = sc.nextInt();
		System.out.println(num1 == num2 && num2 == num3 ? "true" : "false");
		
	}
	
	public static void main(String[] args) {
//		practice1(); 		//method call
//		practice2();
//		practice3();
//		practice4();
//		practice5();
//		practice6();
//		practice7();
//		practice8();
//		practice9();
		practice10();
		
		sc.close();
	}

}
