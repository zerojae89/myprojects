package com.kh.looppractice;

import java.util.Scanner;



public class WhilePractice {
	public static Scanner sc = new Scanner (System.in);
	public static void practice1() {
		
	/*
	 * 사용자 입력받아 1부터 사용자 입력값 까지 입력.
	 */
		
		int  num1;
		int i = 1;
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num1 = sc.nextInt();
		
		while(num1 >=1) {
			System.out.print(i + " ");
			i++;
			if (i >= num1 ) {
				break;
			}
		}
		
	}
			
		
	public static void practice2() {
		int num = 0;
		int i = 1;
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			while(num >=1) {
				System.out.print(i + " ");
				i++;
				if (i >= num ) { 
					break;
				}
			}
		}
	}
	
	public static void practice3() {
		int num;

		System.out.print("1이상의 숫자를 입력하세요. :");
		num = sc.nextInt();
		
		if (num<1) {
			System.out.println("1이상의 숫자를 입력하세요. :");
		} else {
			while (num >=1 ) {
				System.out.print(num + " ");
				num--;
			}
		}
	}
	
	public static void practice4() {
	int num = 0;
	
	do  {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
	} while (!(num>=1));
	
	while(num >= 1) {
		
		
		System.out.print(num+" ");
		num--;
	}
	}
	public static void practice5() {
		
		int x = 0;
		int num;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for (int i = 1; i<= num - 1; i++) {
			System.out.print(i+" + ");
			x = x + i;
		}
		System.out.print(num + " = "+x);
	
		
	}
	
	public static void practice6() {
		int num1,num2;
		
		System.out.print("첫번째 숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		num2 = sc.nextInt();
		
		if (num1<1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
			if(num1-num2<0) {
				for(int i= num1; i<=num2; i++) {
					System.out.print(i+" ");
				}
				System.out.print("\n");
			}
			else {
				System.out.println("두 사이의 숫자는 없습니다. ");
			}
		}
		
		
	}
	public static void practice7() {
		int num1, num2;
for (;;) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >=1) {
				if(num1 <= num2) {
					for (int i = num1;i <= num2;i++) {
						System.out.print(i+" ");
					}
				}
			break;
			
			}else {
				System.out.println("1 이상의 숫자를 입력하세요.");
			}
			
		}

	}
	public static void practice8() {
		int i;
		System.out.print("숫자 : ");
		i = sc.nextInt();
		
		System.out.printf("=====%d단======\n",i);
		
		for (int j =1; j<=9;j++) {
			System.out.printf("%d X %d = %d\n",i,j,i*j);
		}
	}
	
	public static void practice9() {
		int n1;
		System.out.print("숫자 : ");
		n1 = sc.nextInt();
		
		if(n1 >= 1 && n1 <=9) {
			System.out.printf("=====%d=====\n",n1);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d,",n1,i,n1*i);
			}
		}else 
			System.out.println("");
		
	}
	public static void practice10() {
		int n1 ;
		
		for(;;) {
			System.out.print("숫자: ");
			n1 = sc.nextInt();
			if (n1 >= 1 && n1 <= 9) {
				break;
			}
			System.out.println( "1~9 사이의 값만 입력하세요.");
		}
		
		for (int n = n1; n <=9; n++) {
			System.out.printf("===== %d 단 =====\n",n);
			for(int i = 1; i<=9; i++) {
				System.out.printf("%d X %d = %d\n",n,i,n*i);
			}
		}
		}
	public static void practice11() {
		int stN , difN;
		
		System.out.print("시작순서 : ");
		stN = sc.nextInt();
		
		System.out.print("공차 : ");
		difN = sc.nextInt();
		
		for (int i = 0; i < 10; i ++) {
			System.out.printf("%d ",stN);
			stN =stN + difN;
		}
	}
	public static void practice12() {
		
		int n1, n2 ,res;
		char op;
		String input ;
	for(;;) {
		
		System.out.print("연산자 (+,-,*,/,%) : ");
		input = sc.next();
		

		
		if(input.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
		op = input.charAt(0);
		
		System.out.print("정수 1 : ");
		n1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		n2 = sc.nextInt();
		
		if (op == '+'||op=='-' || op =='*') {
			break;
		} else if (op =='/' || op == '%') {
			if (n2 !=0) {
				break;
			}
			System.out.println("0 으로 나눌 수 없습니다. 다시 입력 해 주세요.");
			
		} else {
			System.out.println("없는 연산자 입니다. 다시 입력해 주세요.");
		}
	}
	res = op == '+'? n1+n2 : op =='-'? n1 - n2 : op == '/'? n1/n2: op == '*'? n1*n2: n1 % n2;
	System.out.printf("%d %c %d = %d", n1, op, n2, res);
		
		
		}
	
	public static void practice13() {
		int cnt;
		System.out.print("정수 입력: ");
		cnt = sc.nextInt();
		
		for (int i=1;i<=cnt;i++) {
			for (int j = 1 ; j<= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void practice14() {
		int cnt;
		System.out.print("정수 입력: ");
		cnt = sc.nextInt();
		
		for (int i=cnt;i>=1;i--) {
			for (int j = 1 ; j<= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
		
	

	public static void main(String[] args) {
		
	//	practice1();
		practice2();
	//	practice3();
	//	practice4();
	//  practice5();
	//	practice6();
	//	practice7();
	//	practice8();
	//	practice9();
	//	practice10();
	//	practice11();
	//	practice12();
	//	practice13();	
	//	practice14();
		sc.close();
		
	}

}
