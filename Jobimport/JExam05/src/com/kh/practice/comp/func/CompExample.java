package com.kh.practice.comp.func;

import java.util.Scanner;
import java.util.Random;

public class CompExample {

	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		/*
		 *  정수값을 입력받아 '박' 과 '수' 를 번갈아 출력
		 *  단, 양수값 입력이 아니면 "양수가 아닙니다." 출력
		 */
		
		int n;
		char c1 = '박', c2 = '수';
		String crap = "박수";
		
		System.out.print("정수 : ");
		n = sc.nextInt();
		
		if(n > 0) {
			// 단순 번갈아 가며 출력
			for(int i = 1; i <= n;) {
				System.out.print(c1);
				i++;
				if(i > n) {
					break;
				}
				System.out.print(c2);
				i++;
			}
			System.out.print("\n");
			
			// 짝홀을 구분하여 문자열의 문자 출력
			for(int i = 0; i < n; i++) {
				System.out.print(crap.charAt(i % 2));
			}
			
			System.out.print("\n");
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public static void practice2() {
		/*
		 *  정수값을 입력받아 '박' 과 '수' 를 번갈아 출력
		 *  단, 양수값 입력이 아니면 "양수가 아닙니다." 출력 후 계속 입력받기
		 */
		int n;
		String crap = "박수";
		
		while(true) {
			System.out.print("정수 : ");
			n = sc.nextInt();
			if(n > 0) {
				break;
			}
			System.out.println("양수가 아닙니다.");
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(crap.charAt(i % 2));
		}
		System.out.print("\n");
	}
	
	public static void practice3() {
		/*
		 *  사용자로부터 문자열과 문자를 입력 받고 문자열에 문자가
		 *  몇 개 있는지 출력
		 *  문자열 : banana
		 *  문자 : a
		 */
		String word;
		char c;
		int total = 0;
		
		System.out.print("문자열 : ");
		word = sc.next();
		
		System.out.print("문자 : ");
		c = sc.next().charAt(0);
		
		// System.out.println("입력한 문자열의 길이는 " + word.length());
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == c) {
				total += 1;
			}
		}
		System.out.println(word + " 안에 포함된 " + c + " 개수 : " + total);
	}
	
	public static void practice4() {
		/*
		 *  3번 문제와 동일하나 "더 하겠습니까?" 출력 후 'Y' 또는 'y' 가 입력되면
		 *  계속 진행하고 'N' 또는 'n' 이 입력되면 프로그램을 종료한다.
		 *  단, 위의 문자가 아닌 경우 "잘못된 대답입니다. 다시 입력해주세요."를 출력
		 */
		String word;
		char c;
		
		while(true) {
			int total = 0;
			System.out.print("문자열 : ");
			word = sc.next();
			
			System.out.print("문자 : ");
			c = sc.next().charAt(0);
			
			for(int i = 0; i < word.length(); i++) {
				if(word.charAt(i) == c) {
					total += 1;
				}
			}
			System.out.println(word + " 안에 포함된 " + c + " 개수 : " + total);
			
			while(true) {
				System.out.print("더 하겠습니까? (y/n) : ");
				c = sc.next().charAt(0);
				if(c == 'y' || c == 'Y' || c == 'n' || c == 'N') { 
					break;
				} else {
					System.out.println("잘못된 대답입니다. 다시 입력하세요.");
				}
			}
			
			if(c == 'N' || c == 'n') {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);		// break;
			}
		}
	}
	
	public static void practice5() {
		int num, guess;
		int count = 0;
		
		Random rand = new Random();
		// rand.nextInt(100)     -> 0 ~ 99 까지 범위
		// rand.nextInt(100) + 1 -> 0+1 ~ 99+1 까지 범위
		num = rand.nextInt(100) + 1;
		
		while(true) {
			while(true) {
				System.out.print("1 ~ 100 사이의 값을 맞춰보세요 : ");
				guess = sc.nextInt();
				if(!(guess >= 1 && guess <= 100)) {
					System.out.println("1 ~ 100 사이의 값을 입력하세요.");
				} else {
					break;
				}
			}
			
			// 사용자가 입력한 횟수를 기록하기 위한 변수
			count += 1;
			
			if(guess < num) {
				System.out.println("UP!!");
			} else if(guess > num) {
				System.out.println("DOWN!!");
			} else {
				System.out.println("정답입니다.");
				System.out.println(count + " 회 만에 맞추었습니다.");
				break;
			}
		}
	}
	
	public static void practice6() {
		/*
		 *  가위 바위 보 게임 만들기
		 *  사용자가 "exit" 를 입력하기 전까지 가위 바위 보를 계속 진행하고
		 *  진행하는 동안의 승부를 기록하여 종료전에 출력
		 */
		
		int compCode, userCode;
		int cntPlay = 0, cntWin = 0, cntLose = 0, cntDraw = 0;
		String userName;
		
		Random rand = new Random();
		
		System.out.print("당신의 이름을 입력하세요 : ");
		userName = sc.next();
		
		while(true) {
			/*
			 *  가위 : 0	바위 : 1	보 : 2
			 */
			compCode = rand.nextInt(3);		// 0 ~ 2 까지의 난수값 생성
			while(true) {
				System.out.print("가위 바위 보 입력 : ");
				switch(sc.next()) {
					case "가위":
						userCode = 0;	break;
					case "바위":
						userCode = 1;	break;
					case "보":
						userCode = 2;	break;
					case "exit":
						userCode = -2;	break;	// userCode에 flag 기능까지 활용
					default:
						userCode = -1;			// userCode에 flag 기능까지 활용
						System.out.println("잘못 입력하였습니다.\n");
				}
				if(userCode != -1) {
					break;
				}
			}
			
			if(userCode == -2) {	// 종료 코드
				System.out.println(cntPlay + "전 " + cntWin + "승 " + cntDraw + "무 " + cntLose + "패");
				System.exit(0);		// break;
			}
			
			System.out.println("컴퓨터 : " + (compCode == 0 ? "가위" : compCode == 1 ? "바위" : "보"));
			System.out.println(userName + " : " + (userCode == 0 ? "가위" : userCode == 1 ? "바위" : "보"));
			
			cntPlay += 1;
			if(compCode == 0) {				// 가위
				if(userCode == 0) {
					System.out.println("비겼습니다.");
					cntDraw += 1;
				} else if(userCode == 1) {
					System.out.println("이겼습니다.");
					cntWin += 1;
				} else if(userCode == 2) {
					System.out.println("졌습니다.");
					cntLose += 1;
				}
			} else if(compCode == 1) {		// 바위
				if(userCode == 0) {
					System.out.println("졌습니다.");
					cntLose += 1;
				} else if(userCode == 1) {
					System.out.println("비겼습니다.");
					cntDraw += 1;
				} else if(userCode == 2) {
					System.out.println("이겼습니다.");
					cntWin += 1;
				}
			} else if(compCode == 2) {		// 보
				if(userCode == 0) {
					System.out.println("이겼습니다.");
					cntWin += 1;
				} else if(userCode == 1) {
					System.out.println("졌습니다.");
					cntLose += 1;
				} else if(userCode == 2) {
					System.out.println("비겼습니다.");
					cntDraw += 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		practice6();
		// practice5();
		// practice4();
		// practice3();
		// practice2();
		// practice1();
	}

}
