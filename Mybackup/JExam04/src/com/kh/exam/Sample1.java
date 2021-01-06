package com.kh.exam;

public class Sample1 {
	
	public static void func1() {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + "번째 출력");
		}
	}
	
	public static void func3() {
		int i;

		for(i = 1; i<=5; ) {
			System.out.println(i+"th output");
			i += 2;
		}
	}
	
	public static void func4() {
		int i = 1;
		for (; i <= 5;) {
			System.out.println(i+" 번째 출력.");
			i = 1 + 2;
		}
		System.out.println(" 반복문 밖에서도 i값 확인 가능-> "+i);
	}
	
	public static void func5() {
		int i = 1;
		for (;;) {
			System.out.println(i+ " 번째 출력.");
			// 증감식및 조건식 잘못 작성하면 무한반복 발생 (주의)
			i = i + 2;
			if(i > 5) {
				break;
			}
		}
		System.out.println(" 반복문 밖에서도 i값 확인 가능-> "+i);
	}
	
	public static void func6() {
		/*
		 * 1 ~ 100 까지의 정수값중 홀수만 출력하는 반복
		 */
		
		for (int i=1; i<=100; i++) {
			if (i%2 ==1) {
			System.out.println(i);
			}
		}
		System.out.print("--------------------\n");		
		for(int i = 1; i<=100 ; i = i+ 2) {
			System.out.println(i);
		}
		System.out.print("--------------------\n");
		int i = 1;
		for(;;) {
			System.out.println(i);
			i = i + 2;
			if (i>100) {
				break;
			}
		}
	}
	public static void func7() {
		
		for (int i = 100; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.print("--------------------\n");
		
		for(int i = 100; i>=1; i= i-2) {
			System.out.println(i);
		}
		System.out.print("--------------------\n");
		int i = 100;
		for (;;) {
			System.out.println(i);
			i = i - 2;
			if (i<1) { // 종료조건
				break;
			}
					
				}
}
	
	public static void func8() {
		/* 중첩 반복문.
		* 1~9 단 까지 반복 출력 구구단.
		* 1*1 =1 , 1*2 = 2 . . . .
		* 2 *1 =2 , 2 * 2 = 4 . . . .
		* .
		* .
		* 9 . . .
		*/
		
		for ( int i = 1; i <= 9; i++) {
			for (int j = 1;j<=9; j++) {
				System.out.printf("%d 𝗑%d= %d\t",i,j,i*j);
			}
			System.out.print("\n");
		}
		
	}
	public static void main(String[] args) {
		
		//func1();
		//func2();
		//func3();
		//func4();
		//func5();
 		//func6();
		//func7();
		func8();
		
	

	}

}
