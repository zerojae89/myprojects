package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		/*
		 *  미완성!!
		 */
		int num;

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i = 1;;) {
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				break;
			}
			
			System.out.print(i++ + " ");
			
			if(i >= num) {
				System.out.print(i);
				break;
			}
		}
		
//		if(num >= 1) {
//			for(int i = 1; i <= num; i++) {
//				System.out.print(i + " ");
//			}
//		} else {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
		
	}
	
	public static void practice2() {
		/*
		 *  1번 문제와 동일하나 1 미만의 숫자가 입력됐다면
		 *  "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자가
		 *  값을 입력할 수 있도록 한다.
		 *  
		 *  1. 사용자 입력 받는다.
		 *  2. 입력받은 정수 값이 1 이상인지 확인
		 *  	2-1. 1 이상이 맞으면 반복 종료!
		 *  	2-2. 1 이상이 아니면 계속 반복
		 */
		int num = 0;
		for(;;) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if(num >= 1) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i + "  ");
				}
				break;
			}
			System.out.println("잘못입력했습니다. 다시 입력하세요.");
		}
	}
	
	public static void practice3() {
		int num;
		System.out.print("1 이상의 숫자를 입력하세요. : ");
		num = sc.nextInt();
		
		for(; num > 0; num--) {
			System.out.print(num + " ");
		}
	}
	
	public static void practice4() {
		int num = 0;
		
		for(;num <= 0;) {
			System.out.print("1 이상의 숫자를 입력하세요. : ");
			num = sc.nextInt();
			
			if(num >= 1) {
				break;
			}
			
			System.out.print("잘못된 값을 입력하였습니다.");
		}
		
		for(; num > 0; num--) {
			System.out.print(num + " ");
		}
	}
	
	public static void practice5() {
		/*
		 *  1 부터 사용자가 입력한 정수 값까지의 누적합을 구하고 출력
		 *  누적합 -> 하나의 변수를 사용하여 기존 값에 새로운 값을 계속 더하고
		 *            그 결과를 해당 변수에 다시 저장.
		 */
		int x = 0;
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num - 1; i++) {
			System.out.print(i + " + ");
			x = x + i;
		}
		x = x + num;
		System.out.println(num + " = " + x);
	}
	
	public static void practice6() {
		/*
		 *  사용자로 부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력
		 *  사용자가 값을 입력하면 가장 작은 값부터 큰 값 순으로 출력.
		 *  사용자 입력은 1 이상의 숫자를 입력하도록 한다.
		 */
		
		// 사용자 입력 -> 2개의 정수
		int n1, n2;
		System.out.print("첫 번째 숫자 : ");
		n1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		n2 = sc.nextInt();
		
		// 1 이상의 값을 입력 했을 때에만 동작
		// 1 미만의 값을 입력한 경우 "1 이상의 숫자를 입력하세요" 출력
		if(n1 >= 1 && n2 >= 1) {
			// 만약 첫번째 사용자 입력이 큰 값인 경우에 n2 부터 출력
			if(n1 <= n2) {
				// 입력받은 두 값 사이의 숫자를 출력 -> 반복문
				// 첫번째(n1) : 4		두번째(n2) : 8
				for(int i = n1;i <= n2; i++) {
					System.out.print(i + "  ");
				}
			} else {
				// 입력받은 두 값 사이의 숫자를 출력 -> 반복문
				// 첫번째(n1) : 8		두번째(n2) : 4
				for(int i = n2;i <= n1; i++) {
					System.out.print(i + "  ");
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력하세요.");
		}
	}
	
	public static void practice7() {
		/*
		 *  사용자로 부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력
		 *  사용자가 값을 입력하면 가장 작은 값부터 큰 값 순으로 출력.
		 *  사용자 입력은 1 이상의 숫자를 입력하도록 한다.
		 *  (사용자가 값을 잘못 입력하면 올바른 값을 입력할 때까지 스캔 동작)
		 */
		
		// 사용자 입력 -> 2개의 정수
		int n1, n2;
		
		for(;;) {
			System.out.print("첫 번째 숫자 : ");
			n1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			n2 = sc.nextInt();
			
			// 1 이상의 값을 입력 했을 때에만 동작
			// 1 미만의 값을 입력한 경우 "1 이상의 숫자를 입력하세요" 출력
			if(n1 >= 1 && n2 >= 1) {
				// 만약 첫번째 사용자 입력이 큰 값인 경우에 n2 부터 출력
				if(n1 <= n2) {
					// 입력받은 두 값 사이의 숫자를 출력 -> 반복문
					// 첫번째(n1) : 4		두번째(n2) : 8
					for(int i = n1;i <= n2; i++) {
						System.out.print(i + "  ");
					}
				} else {
					// 입력받은 두 값 사이의 숫자를 출력 -> 반복문
					// 첫번째(n1) : 8		두번째(n2) : 4
					for(int i = n2;i <= n1; i++) {
						System.out.print(i + "  ");
					}
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력하세요.");
			}
		}
	}
	
	public static void practice8() {
		/*
		 *  사용자로부터 입력 받은 숫자의 구구단을 출력.
		 */
		int n1;
		System.out.print("숫자 : ");
		n1 = sc.nextInt();
		
		System.out.printf("==== %d 단 ====\n", n1);
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d × %d = %d\n", n1, i, n1 * i);
		}
	}
	
	public static void practice9() {
		/*
		 *  사용자로부터 입력 받은 숫자의 구구단을 출력.
		 */
		int n1;
		System.out.print("숫자 : ");
		n1 = sc.nextInt();
		
		if(n1 >= 1 && n1 <= 9) {
			for(int n = n1; n <= 9; n++) {
				System.out.printf("==== %d 단 ====\n", n);
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d × %d = %d\n", n, i, n * i);
				}
			}
		} else {
			System.out.println("1 ~ 9 사이의 숫자만 입력하세요.");
		}
	}
	
	public static void practice10() {
		/*
		 *  사용자로부터 입력 받은 숫자의 구구단을 출력.
		 *  (사용자 입력이 잘못된 경우 계속 입력받을 수 있도록 한다.)
		 */
		int n1;
		
		for(;;) {
			System.out.print("숫자 : ");
			n1 = sc.nextInt();
			if(n1 >= 1 && n1 <= 9) {
				break;
			}
			System.out.println("1 ~ 9 사이의 값만 입력하세요.");
		}
		
		for(int n = n1; n <= 9; n++) {
			System.out.printf("==== %d 단 ====\n", n);
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d × %d = %d\n", n, i, n * i);
			}
		}
	}
	
	public static void practice11() {
		/*
		 *  사용자로부터 시작 숫자와 공차를 입력받아 일정값으로
		 *  숫자가 커지거나 작아지는 프로그램 구현
		 *  (단, 출력되는 숫자는 10개)
		 *  
		 *  시작 숫자 : 4
		 *  공차 : 3
		 *  4  7  10  13  16  19  22  25  28  31
		 */
		int stNum, diffNum;
		
		System.out.print("시작 숫자 : ");
		stNum = sc.nextInt();
		
		System.out.print("공차 : ");
		diffNum = sc.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d  ", stNum);
			stNum = stNum + diffNum;
		}
	}
	
	public static void practice12() {
		/*
		 *  1. 정수 두 개와 연산자를 입력받는다.
		 *  2. "exit" 라는 문자열이 입력될 때 까지 무한반복 한다.
		 *     "exit" 라는 문자열이 입력되면 "프로그램을 종료합니다" 출력 후 종료
		 *  3. 연산자가 나누기일 때 두번째 정수가 0 이면,
		 *     "0으로 나눌 수 없습니다. 다시 입력해주세요." 출력
		 *  4. 없는 연산자 입력 시 "없는 연산자입니다. 다시 입력하세요." 출력
		 *  5. 3번 4번의 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터
		 *     입력하도록 한다.
		 */
		int n1, n2, res;
		char op;	String input;
		for(;;) {
			System.out.print("연산자(+, -, *, /, %) : ");
			input = sc.next();
			
			if(input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);		// 반복문 종료가 아닌 프로그램 종료로 사용
			}
			op = input.charAt(0);	// exit 입력이 아니면 첫번째 문자 op 에 할당
			System.out.print("정수 1 :");	n1 = sc.nextInt();
			System.out.print("정수 2 :");	n2 = sc.nextInt();
			
			// 존재하지 않은 연산자를 입력하지 않은 경우 반복 종료
			if(op == '+' || op == '-' || op == '*') {
				break;
			} else if(op == '/' || op == '%') {
				if(n2 != 0) {
					break;
				}
				System.out.println("0 으로 나눌수 없습니다. 다시 입력해주세요.");
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}
		res = op == '+' ? n1 + n2 : op == '-' ? n1 - n2 : op == '/' ? n1 / n2 :
			op == '*' ? n1 * n2 : n1 % n2;
		System.out.printf("%d %c %d = %d", n1, op, n2, res);
	}
	
	public static void practice13() {
		/*
		 *  별 출력 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 */
		int cnt;
		System.out.print("정수 입력 : ");
		cnt = sc.nextInt();
		
		for(int i = 1; i <= cnt; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void practice14() {
		/*
		 *  별 출력 
		 *  ****
		 *  ***
		 *  **
		 *  *
		 */
		int cnt;
		System.out.print("정수 입력 : ");
		cnt = sc.nextInt();
		
		for(int i = cnt; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		practice14();
		// practice13();
		// practice12();
		// practice11();
		// practice10();
		// practice9();
		// practice8();
		// practice7();
		// practice6();
		// practice5();
		// practice4();
		// practice3();
		// practice2();
		// practice1();
		sc.close();
	}

}
