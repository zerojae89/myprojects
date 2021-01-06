package loof;

import java.util.Scanner;

public class practice {
	public static Scanner sc = new Scanner (System.in);

	public static void prt1(){
		
		int num;
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해야 합니다.");
		}
		for (int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
		
	}
	
	public static void prt2(){
		
		int num = 0  ;
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
	System.out.println("정상처리 되었습니다.");
	}
	
	public static void prt3(){
		int num;
		
		System.out.print("1이상의 숫자를 입력하세요. : ");
		num = sc.nextInt();
		if (num <=1) {
			System.out.println("1이상의 숫자를 입력하세요!  ");
		}
		for(int i =1; i<=num;num--) {
			System.out.print(num+" ");
		}
	}
	
	public static void main(String[] args) {
		
		//prt1();
		//prt2();
		//prt3();

	}

}
