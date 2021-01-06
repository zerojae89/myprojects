package com.kh.practice.dimension;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	public static Scanner sc = new Scanner (System.in);
	
	public static void practice1() {
		/*
		 * 1. 3행 3열 문자열 배열 선언 및 할당
		 * 2. 0행 0열 부터 2행 2열까지 차례대로 접근하여 다음과 같은 형식으로 저정
		 * 	  (0,0)(0,1)
		 * 3. 저장된 배열의 문자열 출력
		 */
		String[][] strArray = new String[3][3];

		for(int i = 0; i <= 2; i++) {
			strArray[i][0] = "(" + i +",0)";
			strArray[i][1] = "(" + i +",1)";
			strArray[i][2] = "(" + i +",2)";

		}
		
		for(int i = 0; i <=2; i++) {
			System.out.print(strArray[i][0]);
			System.out.print(strArray[i][1]);
			System.out.print(strArray[i][2]);
			System.out.print("\n");
					
		}
	
		
	}
	public static void practice1_1() {
		String[][] strArray = new String[3][3];

		for(int i = 0; i <= strArray.length-1; i++) {
			for(int j = 0; j < strArray.length; j++) {
				strArray[i][j] = "("+i+","+j+")";
			}

		}
		
		for(int i = 0; i < strArray.length;i++) {
			for(int j = 0; j < strArray[i].length; j++) {
				System.out.print(strArray[i][j]);
			}
			System.out.print("\n");
		}
					
		
	}

	public static void practice2() {
		
		int[][] intArray = new int[4][4];
		int number = 1;
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = number;
				number++;
			}
		}
		
		for (int i = 0; i < intArray.length; i++) {
			for(int j = 0; j> intArray[i].length; j++) {
				System.out.printf("%3d",intArray[i][j]);
			}
			System.out.print("\n");
		}
		
	}
public static void practice3() {
		
		int[][] intArray = new int[4][4];
		int number = 16;
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = number;
				number--;
			}
		}
		
		for (int i = 0; i < intArray.length; i++) {
			for(int j = 0; j> intArray[i].length; j++) {
				System.out.printf("%3d",intArray[i][j]);
			}
			System.out.print("\n");
		}
		
	}

public static void practice4() {
	/*
	 * 
	 */
	int[][] intArray = new int[4][4];
	
	Random rand = new Random();
	
	int rowTotal = 0;
	for(int i = 0; i <intArray.length-1; i++) {
		for(int j = 0; j <intArray.length-1; j++) {
			intArray[i][j] = rand.nextInt(10)+1;
			rowTotal += intArray[i][j];
		}
		intArray[i][intArray[i].length-1] = rowTotal;
		rowTotal = 0;
	}
	int colTotal = 0;
	for(int i = 0; i <intArray[0].length; i++) {
		for(int j = 0; j < intArray.length; j++) {
			colTotal += intArray[j][i];
		}
		intArray[3][i] = colTotal;
		if(i == 3) {
			intArray[3][i] = intArray[3][i] * 2;
		}
		colTotal = 0;
	}
	for(int i = 0; i < intArray.length; i++) {
		for(int j = 0; j< intArray[i].length; j++) {
			System.out.print(intArray[i][j] + "\t");
		}
		System.out.print("\n");
	}
}
public static void practice5() {
	/*
	 * 1. 2차 배열의 행과 열의 크기를 사용자 입력받아 생성
	 * 2. 행과 열의 크기는 1 ~10 사이의 정수만 받아 처리
	 * 3. 1~ 10 사이의 정수가 아니면 다시 입력받기
	 * 4. 생성된 2ㅊ 배열에는 영문자 대문자로 랜덤으로 생성하여 초기화
	 * 5. 2차 배열에 초기화 완료 후 출력
	 */
	int rowSize, colSize;
	char [][] charArray;
	
	while(true) {
		System.out.print("행 크기 : ");
		rowSize = sc.nextInt();
		
		System.out.print("열 크기 : ");
		colSize = sc.nextInt();
		
		if(rowSize >= 1 &&  rowSize <= 10 && colSize >= 1 && colSize <= 10) {
			break;
		}
		System.out.print("행과 열의 크기는 1 ~ 10 사이의 정수값으로 입력하세요.");
		
	}
	charArray = new char[rowSize][colSize];
	Random rand = new Random();
	
	for(int i = 0; i < charArray.length;i++) {
		for(int j = 0; j < charArray[i].length; j++) {
			charArray[i][j] = (char)(rand.nextInt(26) + 65);
		}
	}
	
	for(int i = 0; i < charArray.length; i++) {
		for(int j = 0; j < charArray[i].length; j++) {
			System.out.print(charArray[i][j] + " ");
		}
		System.out.print("\n");
	}
}
public static void practice6() {
	String[][] strArray = new String[][] {
		{"이","까","왔","앞","힘"},
		{"차","지","습","으","냅"},
		{"원","열","니","로","시"},
		{"배","심","다","좀","다"},
		{"열","히","!	","더","!!"},
	};
	
	for(int i = 0; i< strArray.length;i++) {
		for(int j = 0; j< strArray[i].length;j++) {
			System.out.print(strArray[j][i] + " ");
		}
		System.out.print("\n");
	}
	
}

public static void practice7() {
	int rowSize, colSize;
	char[][] charArray;
	
	System.out.print("행의 크기 : ");
	rowSize = sc.nextInt();
	
	charArray = new char[rowSize][]; //사용자가 입력한 행 크기의 1차 배열을 생성
	
	for(int i = 0; i < rowSize; i++) {
		System.out.print(i + "열의 크기 : ");
		colSize = sc.nextInt();
		charArray[i] = new char[colSize];
	}
	int number = 0;
	for(int i = 0; i < charArray.length; i++) {
		for(int j = 0; j < charArray[i].length;j++) {
			charArray[i][j] = (char)(97 + (number % 26));
			number++;
			System.out.print(charArray[i][j] + " ");
		}
		System.out.print("\n");
	}
}

}
		
		

	public static void main(String[] args) {
		//practice1();
		//practice1_1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
	}

}
