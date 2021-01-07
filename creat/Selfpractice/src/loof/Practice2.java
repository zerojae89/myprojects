package loof;

import java.util.Scanner;


public class Practice2 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		int ko, ma, en, total ;
		double avg;
		
		System.out.print("국어점수 : ");
		ko = sc.nextInt();
		
		System.out.print("수학점수 : ");
		ma = sc.nextInt();
		
		System.out.print("영어점수 : ");
		en = sc.nextInt();
		
		total = ko+ma+en;
		avg = total/3.0;
		
		if(en.equals(30)) {
			
		}
		
		if (ko <= 40 && ma <= 40 && en <= 40 ) {
		} if (avg <= 60.1) {
			System.out.println("불합격 입니다.");
		}else {	System.out.printf("국어 : %d\n",ko);
				System.out.printf("수학 : %d\n",ma);
				System.out.printf("영어 : %d\n",en);
				System.out.printf("합계 : %d\n",total);
				System.out.printf("평균 : %2f\n",avg);
				System.out.println("축하합니다, 합격입니다.");
				}
	}
	
		
	public static void practice2() {
		int  num;
		
		
		System.out.print("숫자 입력 : 	");
		num = sc.nextInt();
		
		if (num >0 && num %2 ==0) {
			System.out.println("짝수다");
			} else {
				System.out.println("양수만 입력하세요.");
		}
		
	}
	
	public static void practice3() {
		int num;
		
		System.out.println("1. 입력 ");
		System.out.println("2. 수정 ");
		System.out.println("3. 조회 ");
		System.out.println("4. 삭제 ");
		System.out.println("7. 종료 ");
		
		for(;;) {
		System.out.print("메뉴 번호를 입력하세요 : ");
		num = sc.nextInt();
	
		if (num == 1) {
			System.out.println("입력 메뉴 입니다.");
		} else if (num == 2) {
			System.out.println("수정 메뉴 입니다.");
		}else if (num == 3) {
			System.out.println("조회 메뉴 입니다.");
		}else if (num == 4) {
			System.out.println("삭제 메뉴 입니다.");
		}else if (num == 7) {
			System.out.println("프로그램을 종료합니다.");
		}else {
			System.out.println("정확한 숫자를 입력 해 주세요.");
			}
		continue;
		}
		
	}
	
	public static void practice4() {
		String id,pw;
		String input_id , input_pw;
		id = "myId";  pw = "myPassword12";
		
		System.out.print("아이디 : ");
		input_id = sc.next();
		
		System.out.print("비밀번호 : ");
		input_pw = sc.next();
		
		if (input_id.equals(id)&&input_pw.equals(pw)) {
			System.out.println("로그인 성공");
		}else if (input_id.equals(id)&&!input_pw.equals(pw)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else if (!input_id.equals(id)&&input_pw.equals(pw)) {
				System.out.println("비밀번호가 틀렸습니다.");}
			
		}
		
	public static void practice5() {
		String grade;
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		grade = sc.next();
		
		if(grade.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리, "
					+ "게시글 작성, 댓글 작성, 게시글 조회.");	
		}else if(grade.equals("회원")) {
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회.");
		}else if (grade.equals("비회원")) {
			System.out.println("게시글 조회.");
		}else {
			System.out.println("잘못된 접근 입니다.");
		}
	}
	
	public static void practice6() {
		double  weight, tall , BMI	;
		
		System.out.print("키 입력 (m) : ");
		tall = sc.nextDouble();
		
		System.out.print("몸무게 입력 (kg) : ");
		weight = sc.nextDouble();
		
		BMI = weight/(tall*tall);
		
		System.out.println("BMI 지수 : "+BMI);
		
		if (BMI <= 18.5) {
			System.out.println("저체중");
		} else if (18.5<=BMI && BMI<=23) {
			System.out.println("정상체중");
		} else if (23<= BMI && BMI <= 25) {
			System.out.println("과체중");
			
		} else if (25<= BMI && BMI <= 30) {
			System.out.println("비만");
		} else if (BMI >= 30) {
			System.out.println("고도비만");
		} else {
			System.out.println("잘못된 수치 입니다.");
		}
		
	}
	
	public static void practice7() {
		
		String grade;
		
		System.out.print("회원등급 (관리자,회원,비회원) : ");
		grade = sc.next();
		
		String result = " ";
		
		switch (grade) {
		case "관리자" :
			result = "회원관리, 게시글 관리,";
		case "회원" :
			result += "게시글 작성, 댓글 작성";
		case "비회원" : 
			result += "게시글 조회";
			break;
		default : 
			result = "잘못된 접근 입니다. ";
		}
		System.out.println(result);
		
	}

	public static void practice8() {
		String wtr;
		int month;
		
		for(;;) {
		System.out.print("원하는 달 : ");
		month = sc.nextInt();
		
		String res = " ";
		
		switch(month) {
		case 12 	:
		case 1	:
		case 2 	:
			res = "겨울";
			break;
		case 3 :
		case 4 :
		case 5 :
			res = "봄";
			break;
		case 6 :
		case 7 :
		case 8 :
			res = "여름";
			break;
		case 9: 
		case 10 :
		case 11 :
			res = "가을";
			break;
			
			default : 
				res = "잘못된 달.";
		}
		System.out.printf("%d월은 %s입니다.\n",month,res);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice6();
		//practice7();
		practice8();
	}

}
