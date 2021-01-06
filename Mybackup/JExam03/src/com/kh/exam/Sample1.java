package com.kh.exam;

import java.util.Scanner;

public class Sample1 {
	
	public static Scanner sc = new Scanner(System.in);
	public static void func1() {
		/*
		 * 사용자 입력으로 정수 값을입력 받은 후 양수/음수 구분하여 출
		 */
		
		int num;
		String res = " 양수가 아니다.";
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		
		if (num>0) {
			res = "양수다";
		}
		
		System.out.println(res);		
		
		
	}
	
	public static void func3() {
		
		String name,gender_name;
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
		
		
		
		System.out.print("성적 : ");
		grade = sc.nextDouble();
		
		if(gender == 'M') {
			gender_name = "남학생";
		}else if (gender =='F') {
			gender_name = "여학생";
		} else {
			gender_name = "잘못된 성별코드";
		}
		
		System.out.printf("%d 학년 %d반 %d번 %s의 성적은 %.2f이다.",lvl,cls,num,
				name,gender == 'M' ?"남학생" : "여학생",grade	);
		
		
		
	}
		
	public static void func4() {
		int age;
		String res;
		
		System.out.print("나이 입력(1~120)	 : ");
		age = sc.nextInt();
		
		if (age >0 && age<=120) {
			if(age <= 13) {
				res = "어린이";
			}else if (age > 13 && age <=19) {
			res = "청소년";
			}else {
				res = "성인";
			}
		}else {
			res = "1~120 사이의 값을 입력하세요.";
		}
		
		System.out.println(res);
	}
	
	public static void func5() {
		
		String order;
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		order = sc.next();
		
		if (order.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, 게시글작성, 댓글작성,게시글조회.");
		} else if (order.equals("회원")) {
			System.out.println("게시글작성,게시글조회,댓글작성.");
		} else if (order.equals("비회원")) {
			System.out.println("게시글 조회");
		}else {
			System.out.println("접근권한이 없습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		//func1();
		//func3();
		//func4();
		func5();
		
		
		
	}
	
	//String res= " ";
	
	//System.out.println(res);
	
	//switch (perm) {
	//case "관리자" :
//		res += "회원관리, 게시글 관리,";
	//case "회원" :
//		res += "게시글 작성, 댓글 작성";
//	case "비회원" :
//		res += "게시글 조회";
//		break;
//		default : 
//			res = " 잘못된 권한 등급 입니다. ";
//	}
//	System.out.println(res);

}
