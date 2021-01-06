package com.kh.practice.chap01;

import java.util.Scanner;



public class Seflpractice {
	public static Scanner sc = new Scanner (System.in);
	
	public static void practice1() {
		
		int choice ;
		String error;
		
		error = "잘못된 번호 입니다. ";
		
		System.out.println(" 1. 입력");
		System.out.println(" 2. 수정");
		System.out.println(" 3. 조회");
		System.out.println(" 4. 삭제");
		System.out.println(" 7. 종료");		
		System.out.print("메뉴 번호를 입력하세요 : ");
		choice = sc.nextInt();
		
		if (choice ==1) {
			System.out.println("입력 메뉴 입니다.");
		} else if (choice ==2) {
			System.out.println("수정 메뉴 입니다.");
		} else if (choice ==3) {
			System.out.println("조회 메뉴 입니다.");
		} else if (choice ==4) {
			System.out.println("삭제 메뉴 입니다.");
		} else if (choice ==7)	{
			System.out.println("시스템을 종료합니다.");
		} else {
			System.out.println(error);
		}
		
		
	}
	
	

	
	public static void practice2() {
		
		int num;
		System.out.print("숫자를 한개 입력하세요 : ");
		num = sc.nextInt()	;
		
		if (num>0) {
			if (num %2 == 0) {
				System.out.println("짝수다.");
			}else 
				System.out.println("홀수다.");
				}
			else {
				System.out.println("양수만 입력하세요.");
			}
				
			
		}
	
	public static void practice3() {
		
		int ko,en,ma,tot;
		double avg;
		
		System.out.print("국어점수 : ");
		ko = sc.nextInt();
		
		System.out.print("수학점수 : ");
		ma = sc.nextInt();
		
		System.out.print("영어점수 : ");
		en = sc.nextInt();
		
		tot = ko+ma+en;
		avg = tot / 3.0;
		
		if (ko >=40 && ma>=40 && en>=40) {
			System.out.printf("국어 :%d점\n",ko);
			System.out.printf("수학 :%d점\n",ma);
			System.out.printf("영어 :%d점\n",en);
			System.out.printf("합계 :%d점\n",tot);
			System.out.printf("평균 :%2f점\n",avg);
			System.out.println("축하합니다, 합격입니다.");
		}
		else System.out.println("불합격입니다.");
			
			
}
	
	public static void practice4() {
		
		int month;
		String season;
		
		System.out.print("달을 입력하세요 : ");
		month = sc.nextInt();
		
		switch (month) {
			case 1:
				season = "겨울"; break;
			case 2:
				season = "겨울" ;break;
			case 3:
				season = "봄"; break;
			case 4:
				season = "봄" ;break;
			case 5:
				season = "봄"; break;
			case 6:
				season = "여름" ;break;
			case 7:
				season = "여름"; break;
			case 8:
				season = "여름" ;break;
			case 9:
				season = "가을" ;break;
			case 10:
				season = "가을"; break;
			case 11:
				season = "가을" ;break;
			case 12:
				season = "겨울" ;break;
			default :
				season = "잘못 입력된 달";
		}
		
		System.out.printf("%d월은 %s입니다.",month,season);
		
	}
	
	public static void practice5() {
		String id,pw;
		String id_input,pw_input;
		

		id = "myId"; pw = "myPassword12";
		
		System.out.print("아이디 : ");
		id_input = sc.next();
		
		System.out.print("비밀번호 : ");
		pw_input = sc.next();
		
		if(id.equals(id_input)&&pw.equals(pw_input)){
			System.out.println("로그인 성공");
		} else {
			if (!id.equals(id_input)&& !pw.equals(pw_input)) {
				System.out.println("아이디와 패스워드가 틀렸습니다.");
			}else if (!id.equals(id_input)) {
				System.out.println("아이디가 틀렸습니다.");
			}else if (!pw.equals(pw_input)) {
				System.out.println("패스워드가 틀렸습니다.");
			}
		}
	}

			
			//if (!id.equals(id_input)&&!pw.equals(pw_input)) {
		//		System.out.println("아이디와 패스워드가 틀렸습니다.");
		//	}else if (!id.equals(id_input)) {
		//			System.out.println("아이디가 틀렸습니다.");
		//		}else if (!pw.equals(pw_input)) {
		//			System.out.println("패스워드가 틀렸습니다.");
		//		}
		//	}
		
		//	System.out.println("아이디가 틀렸습니다.");
		
	public static void practice7() {
		
		double tall, weight,BMI;
		
		System.out.print("키{m)를 입력해 주세요 ; ");
		tall = sc.nextDouble();
		
		System.out.print("몸무게{kg)를 입력해 주세요 ; ");
		weight = sc.nextDouble();
		
		BMI = weight/(tall*tall);
		
		if (BMI<=18.5) {
			System.out.println("저체중");
		} else if (BMI>=18.5 && BMI<23) {
			System.out.println("정상체중");
		} else if (BMI >= 23 && BMI <=25) {
			System.out.println("과체중");
		}
		}
	
	


		
		
		
		
	public static void main(String[] args) {
		
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		practice7();

	}

}
