package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	// 정적변수
	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		/*
		 *  1 번 문제
		 *	메뉴를 출력하고 메뉴 번호를 입력하면 "XX 메뉴입니다."
		 *  를 출력하고 종료 번호를 누르면 "프로그램이 종료됩니다." 를 출력  
		 */
		
		int menu_num;
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭재");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호 : ");
		
		menu_num = sc.nextInt();
		
//		if(menu_num == 1) {
//			System.out.println("입력 메뉴입니다.");
//		} else if(menu_num == 2) {
//			System.out.println("수정 메뉴입니다.");
//		} else if(menu_num == 3) {
//			System.out.println("조회 메뉴입니다.");
//		} else if(menu_num == 4) {
//			System.out.println("삭제 메뉴입니다.");
//		} else if(menu_num == 7) {
//			System.out.println("프로그램이 종료됩니다.");
//		} else {
//			System.out.println("잘못된 메뉴 번호 입니다.");
//		}
		
		switch(menu_num) {
			case 1:
				System.out.println("입력 메뉴입니다.");	break;
			case 2:
				System.out.println("수정 메뉴입니다.");	break;
			case 3:
				System.out.println("조회 메뉴입니다.");	break;
			case 4:
				System.out.println("삭제 메뉴입니다.");	break;
			case 7:
				System.out.println("프로그램이 종료됩니다.");	break;
			default:
				System.out.println("잘못된 메뉴 번호 입니다.");
		}
	}
	
	public static void practice2() {
		/*
		 *  2 번 문제
		 *  입력된 정수값이 짝수인지 홀수인지 구분하여 출력
		 *  양수값을 입력하지 않은 경우 "영수만 입력해주세요." 출력
		 */
		int num;
		
		System.out.print("양수 입력 : ");
		num = sc.nextInt();
		
//		if(num > 0) {
//			if(num % 2 == 0) {
//				System.out.println("짝수다.");
//			} else {
//				System.out.println("홀수다.");
//			}
//		} else {
//			System.out.println("양수만 입력하세요.");
//		}
		
		if(num > 0) {
			switch(num % 2) {
				case 0:
					System.out.println("짝수다.");	break;
				case 1:
					System.out.println("홀수다.");	break;
			}
		} else {
			System.out.println("양수만 입력하세요.");
		}
	}
	
	public static void practice3() {
		/*
		 *  3 번 문제
		 *  국어, 영어, 수학 세 과목의 점수를 입력 받고 합계와 평균 계산
		 *  합계와 평균을 사용하여 합격/불합격을 처리한다.
		 *  합격 조건
		 *  	세 과목의 점수가 각각 40점 이상이고
		 *  	평균이 60점 이상
		 */
		int g1, g2, g3, tot;
		double avg;
		
		System.out.print("국어 점수 : ");
		g1 = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		g2 = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		g3 = sc.nextInt();
		
		tot = g1 + g2 + g3;
		avg = tot / 3.0;
		
		if(g1 >= 40 && g2 >= 40 && g3 >= 40 && avg >= 60) {
			System.out.printf("국어 : %d 점\n", g1);
			System.out.printf("영어 : %d 점\n", g2);
			System.out.printf("수학 : %d 점\n", g3);
			System.out.printf("합계 : %d 점\n", tot);
			System.out.printf("평균 : %.2f 점\n", avg);
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
	}
	
	public static void practice4() {
		/*
		 * 수업자료 7페이에서 if문으로 되어 있는 봄, 여름, 가을, 겨울 예제를
		 * switch문으로 변경.
		 */
		int month = 0;
		String season;
		
		System.out.println("1 ~ 12 사이의 정수 입력 : ");
		month = sc.nextInt();
		
		switch(month) {
			case 1: case 2: case 12:
				season = "겨울"; break;
			case 3: case 4: case 5:
				season = "봄"; break;
			case 6: case 7: case 8:
				season = "여름"; break;
			case 9: case 10: case 11:
				season = "가을"; break;
			default:
				season = "잘못 입력된 달";
		}
		
		System.out.printf("%d월은 %s입니다.", month, season);
	}
	
	public static void practice5() {
		/*
		 *  아이디, 비밀번호를 정해두고 로그인 기능이 동작하는 것과 같은
		 *  기능을 작성
		 *  로그인 성공 시 "로그인 성공" 출력
		 *  아이디가 틀렸을 때 "아이디가 틀렸습니다."
		 *  비밀번호가 틀렸을 때 "비밀번호가 틀렸습니다."
		 */
		String id, pw;
		String id_input, pw_input;
		
		id = "myId";	pw = "myPassword12";
		
		System.out.print("아이디 입력 : ");
		id_input = sc.next();
		
		System.out.print("패스워드 입력 : ");
		pw_input = sc.next();
		
		if(id.equals(id_input) && pw.equals(pw_input)) {
			System.out.println("로그인 성공");
		} else {
			if (!id.equals(id_input) && !pw.equals(pw_input)) {
				System.out.println("아이디와 패스워드가 틀렸습니다.");
			} else if(!id.equals(id_input)) {
				System.out.println("아이디가 틀렸습니다.");
			} else if(!pw.equals(pw_input)) {
				System.out.println("패스워드가 틀렸습니다.");
			}
		}
	}
	
	public static void practice6() {
		/*
		 *  사용자 입력으로 관리자, 회원, 비회원 중 하나를 입력받아
		 *  각 등급이 행할 수 있는 권한을 출력
		 *  관리자 : 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
		 *  회원 : 게시글 작성, 게시글 조회, 댓글 작성
		 *  비회원 : 게시글 조회
		 */
		String perm;
		
		System.out.print("회원 등급(관리자, 회원, 비회원) : ");
		perm = sc.next();
		
//		if(perm.equals("관리자")) {
//			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
//		} else if(perm.equals("회원")) {
//			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
//		} else if(perm.equals("비회원")) {
//			System.out.println("게시글 조회");
//		} else {
//			System.out.println("잘못된 권한 등급입니다.");
//		}
		// 입력값 가정 : 회원
		String res = "";
		
		switch(perm) {
			case "관리자":
				res += "회원관리, 게시글 관리";	// res = res + "회원관리, 게시글 관리";
			case "회원":
				res += "게시글 작성, 댓글 작성";	// res = res + "게시글 작성, 댓글 작성";
			case "비회원":
				res += "게시글 조회";			// res = res + "게시글 조회";
				break;
			default:
				res = "잘못된 권한 등급입니다.";
		}
		System.out.println(res);
	}
	
	public static void practice7() {
		/*
		 *  키, 몸무게를 입력받아서 BMI 지수를 계산
		 *  BMI = 몸무게 / (키(m) * 키(m))
		 *  ~ 18.5 미만			-> 저체중
		 *  18.5 이상 ~ 23 미만	-> 정상체중
		 *  23 이상 ~ 25 미만		-> 과체중
		 *  25 이상 ~ 30 미만		-> 비만
		 *  30 이상 ~				-> 고도비만
		 */
		double tall, weight, bmi;
		String res;
		
		System.out.print("키(cm)를 입력해주세요 : ");
		tall = sc.nextDouble();
		tall /= 100;	// tall = tall / 100;
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		weight = sc.nextDouble();
		
		bmi = weight / (tall * tall);
		
//		if(bmi < 18.5) {
//			res = "저체중";
//		} else if(bmi >= 18.5 && bmi < 23) {
//			res = "정상체중";
//		} else if(bmi >= 23 && bmi < 25) {
//			res = "과체중";
//		} else if(bmi >= 25 && bmi < 30) {
//			res = "비만";
//		} else if(bmi >= 30) {
//			res = "고도비만";
//		} else {
//			res = "잘못된 입력값이 있습니다.";
//		}
		
		if(bmi < 18.5) {
			res = "저체중";
		} else if(bmi < 23) {
			res = "정상체중";
		} else if(bmi < 25) {
			res = "과체중";
		} else if(bmi < 30) {
			res = "비만";
		} else {
			res = "고도비만";
		}
		
		System.out.printf("BMI 지수 : %.2f\n", bmi);
		System.out.println(res);
	}
	
	public static void practice8() {
		/*
		 *  두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력
		 *  단, 두 개의 정수 모두 양수일 때만 작동하며, 없는 연산 기호를 입력시
		 *  "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력
		 */
		int x, y;
		int iRes = 0;	double dRes = 0.0;
		char op;
		char flag = '\u0000';	// 계산 결과가 저장된 자료형의 종류를 구분하기 위한 플래그, 'i', 'd'
		
		System.out.print("피연산자 1 : ");
		x = sc.nextInt();
		
		System.out.print("피연산자 2 : ");
		y = sc.nextInt();
		
		System.out.print("연산자(+,-,*,/,%) : ");
		op = sc.next().charAt(0);
		
		if(x > 0 && y > 0) {
			switch(op) {
				case '+':
					iRes = x + y;	flag = 'i';			break;
				case '-':
					iRes = x - y;	flag = 'i';			break;
				case '*':
					iRes = x * y;	flag = 'i';			break;
				case '/':
					dRes = (double)x / y;	flag = 'd';	break;
				case '%':
					iRes = x % y;	flag = 'i';			break;
				default:
					System.out.printf("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
			if (flag == 'i') {
				System.out.printf("%d %c %d = %d", x, op, y, iRes);
			} else if (flag == 'd'){ 
				System.out.printf("%d %c %d = %f", x, op, y, dRes);
			}
		}
	}
	
	public static void practice9() {
		/*
		 *  1. 사용자 입력으로 중간고사, 기말고사, 과제점수, 출석횟수를 입력 받기
		 *  2. 평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20% 이다.
		 *  3. 출석 비율은 전체 출석 20회 중 출석 횟수로 고려하여 계산한다.
		 *  4. 평가 비율에 맞추어 100점 계산을 하였을 때 다음조건에 따라 Pass, Fail 출력
		 *	 A. 70점 이상인 경우 Pass
		 *	 B. 70점 이상이지만 결석이 30% 이상이면 Fail
		 *	 C. 70점 미만인 경우 Fail
		 */
		double mid, fin, rep, total, att_jum, att_rate;
		int att;
		
		// 사용자 입력
		System.out.print("중간고사 점수 : ");	mid = sc.nextDouble();
		System.out.print("기말고사 점수 : ");	fin = sc.nextDouble();
		System.out.print("과제 점수 : ");		rep = sc.nextDouble();
		System.out.print("출석 횟수 : ");		att = sc.nextInt();
		
		// 가중치 계산
		rep = rep / 100 * 30;
		fin = fin / 100 * 30;
		mid = mid / 100 * 20;
		att_jum = att / 20.0 * 20;
		att_rate = att / 20.0 * 100;
		total = mid + fin + rep + att;
		
		// 결과 출력
		System.out.println("==================== 결과 ====================");
		System.out.println("중간 점수 (20%) : " + mid);
		System.out.println("기말 점수 (30%) : " + fin);
		System.out.println("과제 점수 (30%) : " + rep);
		System.out.println("출석 점수 (20%) : " + att_jum);
		System.out.println("총점 : " + total);
		
		if(total >= 70) {
			if(100 - att_rate >= 30) {
				System.out.println("Fail [출석 부족 " + att + "/20]");
			} else {
				System.out.println("Pass");
			}
		} else {
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
			default: System.out.println("잘못된 메뉴 번호");
		}
	}


	public static void main(String[] args) {
		practice10();
		sc.close();
	}

}
