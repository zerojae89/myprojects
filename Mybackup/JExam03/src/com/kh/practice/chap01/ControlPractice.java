package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	public static Scanner sc = new Scanner(System.in);

	public static void practice1() {
		int choice;
		String result;

		result = "잘못된 번호 입니다.";

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 : ");
		choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("입력메뉴 입니다.");
		} else if (choice == 2) {
			System.out.println("수정메뉴 입니다.");
		} else if (choice == 3) {
			System.out.println("조회메뉴 입니다.");
		} else if (choice == 4) {
			System.out.println("삭제메뉴 입니다.");
		} else if (choice == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}

		else {
			System.out.println(result);

		}
	}

	
	public static void practice2() {
		/*
		 * 2번 문제 입력된 정수값이 짝수인지 홀수인지 구분하여 출력 양수값을 입력하지 않은 경우 "영수만 입력해주세요."출력
		 */
		int num1;

		System.out.print("숫자를 한개 입력하세요 : ");
		num1 = sc.nextInt();

		if (num1 > 0) {
			if (num1 % 2 == 0) {
				System.out.println("짝수다.");
			} else
				System.out.println("홀수다.");
		} else {
			System.out.println("양수만 입력하세요.");
		}

	}

	public static void practice3() {
		/*
		 * 3번 문제 국어,영어,수학 세 과목의 점수를 입력받고 합계와 평균 계산 합계와 평균을 사용하여 합격/불합격을 처리한다. 합격조건 세과목의
		 * 점수가 각각 40점 이상 평균이 60점 이상
		 */

		int x, y, z, tot;
		double avg;

		System.out.print("국어점수 : ");
		x = sc.nextInt();

		System.out.print("영어점수 : ");
		y = sc.nextInt();

		System.out.print("수학점수 : ");
		z = sc.nextInt();

		tot = x + y + z;
		avg = tot / 3.0;

		if (x >= 40 && y >= 40 && z >= 40) {
			System.out.printf("국어 : %d 점\n", x);
			System.out.printf("영어 : %d 점\n", y);
			System.out.printf("수학 : %d 점\n", z);
			System.out.printf("합계 : %d 점\n", tot);
			System.out.printf("평균 : %2.f 점\n", avg);
			System.out.println("합격입니다.");

		} else {
			System.out.print("불합격 입니다.");
		}

	}

	public static void practice4() {
		/*
		 * 수업자료
		 */

		int month = 0;
		String season;

		System.out.print("달을 입력하세요: ");
		month = sc.nextInt();

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;

		default:
			season = "잘못된 달";

		}

		System.out.printf("%d월은 %s입니다.", month, season);

	}

	public static void practice5() {

		String id, pw;
		String id_input, pw_input;
		String result;

		id = "myId";
		pw = "myPassword12";

		System.out.print("아이디 : ");
		id_input = sc.next();

		System.out.print("비밀번호 : ");
		pw_input = sc.next();

		if (id.equals(id_input) && pw.equals(pw_input)) {
			System.out.println("로그인 성공");
		} else {
			if (!id.equals(id_input) && !pw.equals(pw_input)) {
				System.out.println("아이디와 패스워드가 틀렸습니다.");
			} else if (!id.equals(id_input)) {
				System.out.println("아이디가 틀렸습니다.");
			} else if (!pw.equals(pw_input)) {
				System.out.println("패스워드가 틀렸습니다.");
			}
		}

	}

	public static void practice6() {

		String grade;

		System.out.print("회원등급 (관리자,회원,비회원) : ");
		grade = sc.next();

//	if (perm.equals("관리자")) {
//		System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//	}else if (perm.equals("회원")) {
//		System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
//	}else if (perm.equals("비회원")) {
//			System.out.println("게시글 조회");
//	}else {
//		System.out.println("잘못된 권한 등급입니다.");
//		}

		String result = " ";

		switch (grade) {
		case "관리자":
			result = "회원관리, 게시글 관리,";
		case "회원":
			result += "게시글 작성, 댓글 작성,";
		case "비회원":
			result += "게시글 조회";
			break;
		default:
			result = "잘못된 권한 등급입니다.";
		}
		System.out.println(result);

	}

	public static void practice7() {
		/*
		 * 키, 몸무게 받아 BMI 계산. BMI = 몸무게 / (키 * 키) ~ 18.5미만 -> 저체중 18.5 이상 ~ 23 미만 - >
		 * 정상체중 23 이상 ~ 30 미만 - > 비만 30 이상 ~ - > 고도비만
		 */

		double tall, weight, bmi;

		System.out.print("당신의 키는 몇입니까?");
		tall = sc.nextDouble();

		System.out.print("당신의 체중은?");
		weight = sc.nextDouble();

		bmi = weight / (tall * tall);

		System.out.printf("BMI 지수 : %.2f\n", bmi);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 30) {
			System.out.println("비만");
		} else if (bmi > 30) {
			System.out.println("고도비만");

		}

	}

	public static void practice8() {

		int x, y;
		double res;
		char op;

		System.out.print("피연산자 1 : ");
		x = sc.nextInt();

		System.out.print("피연산자 2: ");
		y = sc.nextInt();

		System.out.print("연산자(+,-,*,/,%) : ");
		op = sc.next().charAt(0);

		switch (op) {
		case '+':
			System.out.printf("%d + %d = %d", x, y, x + y);
			break;
		case '-':
			System.out.printf("%d - %d = %d", x, y, x + y);
			break;
		case '*':
			System.out.printf("%d * %d = %d", x, y, x + y);
			break;
		case '/':
			System.out.printf("%d / %d = %f", x, y, (double) x / y);
			break;
		case '%':
			System.out.printf("%d %% %d = %d", x, y, x + y);
			break;
		default:
			System.out.println("잘못입력하였습니다. 프로그램을 종료합니다.");

		}

	}

	public static void practice9() {

		double mid,fin,rep,total,att_jum,att_rate;
		int att;
		
		System.out.print("중간고사 점수 : ");
		mid = sc.nextDouble();
		
		
		System.out.print("기말고사 점수 : ");
		fin = sc.nextDouble();
		
		
		System.out.print("과제 점수 : ");
		rep = sc.nextDouble();
		
		
		System.out.print("출석 횟수 : ");
		att = sc.nextInt();
		
		// 가중치 계산
		rep = rep / 100 * 30;
		fin = fin / 100 * 30;
		mid = mid / 100 * 20;
		att_jum = att/ 20.0 * 20;
		att_rate = att / 20.0 * 100;
		total = mid + fin +rep + att_jum;
		
		System.out.println("============== 결과 ==============");
		System.out.println("중간 점수 (20%) : "+ mid);
		System.out.println("기말 점수 (30%) : "+ fin);
		System.out.println("과제 점수 (30%) : "+ rep);
		System.out.println("출석 점수 (20%) : "+ att_jum);
		System.out.println("총점 : "+ total);
		
		if (total >= 70) {
			if(100 - att_rate >= 30) {
			System.out.println("fail [출석 부족"+att+"/20]");
		} else {
			System.out.println("pass");
		}
		}else {
			System.out.println("Fail [점수 미달]");
		}
		
		
}
	
	public static void practice10() {
		
		int menu_num;
		
		System.out.println("실행할 메뉴 번호를 입력하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.print("선택 : ");
		
		menu_num = sc.nextInt();
		
		switch(menu_num) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		case 9: practice9(); break;
		}
		
				
		
		
	}

	public static void main(String[] args) {

		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
		// practice6();
		// practice7();
		// practice8();
		// practice9();
		practice10();

	}

}
