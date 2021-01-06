package kh.com.exam;

import java.util.Scanner;



public class Sample1 {
	public static Scanner sc = new Scanner (System.in);

	
	
	public static void func1(){
		int jumsu = 93;
		
		switch(jumsu / 10) {
		case 10 :	case 9:
			System.out.println("A등급 입니다."); break;
		case 8 :	
			System.out.println("B등급 입니다."); break;
		case 7 :	
			System.out.println("C등급 입니다."); break;
		case 6 :	
			System.out.println("D등급 입니다."); break;
		case 5 :	
			System.out.println("E등급 입니다."); break;
		case 4 :	case 3 :	case 2 :	case 1 :	case 0 :
			System.out.println("F등급 입니다."); break;
		}
				
		
	}
	
	public static void func2(){
		int num=1;
		char op;
		
		System.out.println("값 입력 : ");
		num = sc.nextInt();
		
		if (num ==1) {
			op = '+';
		}else if (num ==2) {
			op = '-'; 
		}else if (num ==3) {
			op = '/';
		}else if (num ==4) {
			op = '*';
		} else {
			System.out.println("올바른 값이 아님.");
					
	
		}
		
		
		
	}
	
	public static void func3(){
		int num = 5;
		
		for(int i = 1;i<=num;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			}
		}
				
	
	public static void main(String[] args) {
		//func1();
		//func2();
		func3();
		

		
	}

}
