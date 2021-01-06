package loof;

import java.util.Scanner;

public class practice3 {
	public static Scanner sc = new Scanner(System.in);

	public static void prt1() {
		
		int num ;
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		for(int i = 1; i<=num;i++) {
			System.out.print(i+" ");
		}
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력하세요.");
		}
		
		
	}
	
public static void prt2() {
		
	int num  ;
	for(;;) {
		System.out.print("1 이상의 숫자를 입력하세요. : ");
		num = sc.nextInt();
		if(num >=1) {
			for(int i = 1; i <= num;i++) {
				System.out.print(i+" ");
			}
			break;
		}
	
	}
}
public static void prt3() {
	int num;
	System.out.print("1이상의 숫자를 입력하세요: ");
	num = sc.nextInt();
	
	if(num >= 1) {
		for(;num > 0;num--) {
			System.out.print(num+" ");
		}
	}
}

public static void prt4() {
	int num;
	
	for (;;) {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1이상의 숫자를 입력해 주세요.");
			
			continue;
		}
		
		for(;num > 0;num--) {
			System.out.print(num+" ");
		}
		break;
		}
	
	}

public static void prt5() {
	int number;
	
	System.out.print("정수 : ");
	number = sc.nextInt();
	
	for(int i = 1;i<=number;i++) {
		System.out.print(i+"");
	}
}

public static void prt6() {
	int one , two;
	System.out.print("첫번째 숫자 : ");
	one = sc.nextInt();
	
	System.out.print("두번째 숫자 : ");
	two = sc.nextInt();
	
	if(one>=1 && two >=1) {
		for (int i = one;i<=two;i++) {
			System.out.print(i+" ");
		}
		}
	else {
		System.out.println(" 1이상의 숫자를 입력해주세요.");
	}
}

public static void prt7() {
	int  num1;
		System.out.print("숫자 : ");
		num1 = sc.nextInt();
		
		//for(int i=num;i<=9)
}

	
	public static void main(String[] args) {
		//prt1();
		//prt2();
		//prt3();
		//prt4();
		//prt5();
		prt6();
	}

}
