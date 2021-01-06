package com.kh.exam;

import java.util.Arrays;

public class Sample1 {
	
	public static void func1() {
		int[] arr1;  // Heap 에 생성할 배열의 주소를 저장하기 위 참조주소 공간 생

		// Heap에 5개의 정수 데이터를 저장할 배열 공간 생성
		// 생성된 공간의 주소를 arr1에 저장 (arr1는 참조주소(값)가 저장)
		arr1 = new int[5]; 
		
		System.out.print(arr1[0]+"|"+arr1[1]+"|"+arr1[2]+"|"+arr1[3]);
			
	}
	
	public static void func2() {
		int[] arr1 = {1,2,3,4,5};
		
		System.out.print(arr1[0]+"|"+arr1[1]+"|"+arr1[2]+"|"+arr1[3]+"\n");
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		
		System.out.print(arr1[0]+"|"+arr1[1]+"|"+arr1[2]+"|"+arr1[3]+"\n");
		
	for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (i * 100) + 100;
		}
	System.out.println(arr1[0]+"|"+arr1[1]+"|"+arr1[2]+"|"+arr1[3]);
	}
	
	public static void func3() {
		char[] chArr1 = new char[5];
		
		for(int i = 0; i < chArr1.length; i++) {
			chArr1[i] = (char)(65+i);
		}
		System.out.println(chArr1[0]+""+chArr1[1]+""+chArr1[2]);
		
	}
	
	public static void func4() {
		String[] strArr1 = {"Java","JavaScript", "HTML","CSS","SQL"};
		for(int i = 0; i < strArr1.length;i++) {

			System.out.println("프로그래밍 언어 : "+ strArr1[i]);
		}
		
	}
	
	public static void func5() {
		/* 복사
		 * 일반적인 변수에 저장된 값을 복사. (값을 복사하여 저장.)
		 * int x = 10;
		 * int y = x;
		 * x = 15; 		y = 20;
		 * System.out.print(" x ->" + x + "\y -> "+y");
		 * 
		 * 배열 변수에 저장된 값을 복사. (참조값이 복사되어 저장.)
		 */
		
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1; // 얕은 복사 -> 참조값만 복사.
		
		System.out.println("arr1 -> "+arr1[0]+","+arr1[1]+","+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+","+arr2[1]+","+arr2[2]);	
		
		arr1[0] = 10;
		System.out.println("arr1 -> "+arr1[0]+","+arr1[1]+","+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+","+arr2[1]+","+arr2[2]);
		
		System.out.println("arr2-1 를 20으로 바꾼 상황");
		
		arr2[1] = 20;
		System.out.println("arr1 -> "+arr1[0]+","+arr1[1]+","+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+","+arr2[1]+","+arr2[2]);
		
	}
	
	public static void func6() {
		/*
		 * 깊은 복사 : 참조값을 복사하는 것이 아닌 Heap 영역의 값을복사한다. 
		 */
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[3];
		
		//반복문 사용하여 값을 복사.
		
		for(int i = 0; i < arr1.length;i++) {
			arr2[i] = arr1[i];
		}
		System.out.println("arr1 -> "+arr1[0]+","+arr1[1]+","+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+","+arr2[1]+","+arr2[2]);
		
		arr1[0]= 10;
		System.out.println("arr1 -> "+arr1[0]+","+arr1[1]+","+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+","+arr2[1]+","+arr2[2]);
	}
	
	public static void func7() {
		/*
		 *  .clone() : 배열을 복사하기 위한 메서드
		 */
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[3];
		
		arr2 = arr1.clone();
		
		System.out.println("arr1 -> "+arr1[0]+","+arr1[1]+","+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+","+arr2[1]+","+arr2[2]);
		
		arr1[0]= 10;
		System.out.println("arr[0] = 10; 을 한 후의 상황");
		System.out.println("arr1 -> "+arr1[0]+","+arr1[1]+","+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+","+arr2[1]+","+arr2[2]);
	}
	

	public static void func8() {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[3];
		
		// 원본, 원본 시작 위치.
	//	System.arraycopy(src, srcPos, dest, destpos, length);
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println("arr1 -> "+arr1[0]+", "+arr1[1]+", "+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+", "+arr2[1]+", "+arr2[2]);
		
		arr1[0]= 100;
		System.out.println("arr[0] = 100; 을 한 후의 상황");
		System.out.println("arr1 -> "+arr1[0]+", "+arr1[1]+", "+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+", "+arr2[1]+", "+arr2[2]);
		
	}
	
	public static void func9() {
		int[] arr1= {1, 2, 3};
		int[] arr2 = new int[3];
		
		arr2 = Arrays.copyOf(arr1,arr1.length);
		

		System.out.println("arr1 -> "+arr1[0]+", "+arr1[1]+", "+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+", "+arr2[1]+", "+arr2[2]);
		
		arr1[0]= 100;
		System.out.println("arr[0] = 100; 을 한 후의 상황");
		System.out.println("arr1 -> "+arr1[0]+", "+arr1[1]+", "+arr1[2]);
		System.out.println("arr2 -> "+arr2[0]+", "+arr2[1]+", "+arr2[2]);
		
		
		
	}
	public static void main(String[] args) {
			//func1();
			//func2();
			//func3();
			//func4();
			//func5();
			//func6();
			//func7();
		    //func8();
			func9(); 
			
			

	}

}
