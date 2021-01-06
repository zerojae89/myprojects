package com.kh.exam;

import java.util.Arrays;

public class Simple1 {
	
	public static void func1() {
		int[] arr1;		// Heap �� ���� �� �迭�� �ּҸ� �����ϱ� ���� �����ּ� ���� ����
		
		// heap�� 5���� ���� �����͸� ������ �迭 ���� ����
		// ������ ������ �ּҸ� arr1�� ���� (arr1�� �����ּ�(��)�� ����)
		arr1 = new int[5];
		
		// �迭�� ����ϸ� �迭���� �⺻���� �ڵ����� ����ȴ�.
		System.out.print(arr1[0] + " | " + arr1[1] + " | " + arr1[2]);
	}
	
	public static void func2() {
		int[] arr1 = {1, 2, 3, 4, 5};
		System.out.println(arr1[0] + " | " + arr1[1] + " | " + arr1[2]);
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		System.out.println(arr1[0] + " | " + arr1[1] + " | " + arr1[2]);
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (i * 100) + 100;
		}
		System.out.println(arr1[0] + " | " + arr1[1] + " | " + arr1[2]);
	}
	
	public static void func3() {
		char[] chArr1 = new char[5];
		
		for(int i = 0; i < chArr1.length; i++) {
			/*
			 *             65 + i
			 *  A -> 65 -> 65 + 0
			 *  B -> 66 -> 65 + 1
			 *  C -> 67 -> 65 + 2
			 */
			chArr1[i] = (char)(65 + i);
		}
		
		System.out.println(chArr1[0] + "" + chArr1[1] + "" + chArr1[2]);
	}
	
	public static void func4() {
		String[] strArr1 = {"Java", "JavaScript", "HTML", "CSS", "SQL"};
		
		for(int i = 0; i < strArr1.length; i++) {
			System.out.println("���α׷��� ��� : " + strArr1[i]);
		}
	}
	
	public static void func5() {
		/*  
		 *  �Ϲ����� ������ ����� ���� ����.(���� �����Ͽ� ����.)
		 *  int x = 10;
		 *  int y = x;
		 *  x = 15;		y = 20;
		 *  System.out.print("x -> " + x + "\ty -> " + y);
		 *  
		 *  �迭 ������ ����� ���� ����. (�������� �����Ͽ� ����.)
		 *  ���������� �����ϱ� ������ ������ ���纻�� ������ Heap�� �޸𸮸� �����Ѵ�.
		 */
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;		// ���� ���� -> �������� ����.
		
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 10;
		System.out.println("arr1[0] = 10; �� �� ���� ��Ȳ");
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr2[1] = 20;
		System.out.println("arr2[1] = 20; �� �� ���� ��Ȳ");
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void func6() {
		/*
		 *  ���� ���� : �������� �����ϴ� ���� �ƴ� Heap ������ ���� �����Ѵ�.
		 */
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[3];
		
		// �ݺ����� ����Ͽ� ���� ����
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 10;
		System.out.println("arr1[0] = 10; �� �� ���� ��Ȳ");
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void func7() {
		/*
		 *  .clone() : �迭�� �����ϱ� ���� �޼���
		 */
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[3];
		
		arr2 = arr1.clone();
		
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 10;
		System.out.println("arr1[0] = 10; �� �� ���� ��Ȳ");
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void func8() {
		/*
		 *  System.arraycopy() : �迭�� �����ϱ� ���� �޼���
		 */
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[3];
		
		//                  ����, ����������ġ, ���纻, ���纻������ġ, �������
		// System.arraycopy(src,  srcPos,       dest,   destPos,        length);
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 100;
		System.out.println("arr1[0] = 100; �� �� ���� ��Ȳ");
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}
	
	public static void func9() {
		/*
		 *  import java.util.Arrays;
		 *  Arrays.copyOf() : �迭�� �����ϱ� ���� Arrays ��ü�� �޼���
		 */
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[3];
		
		arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
		
		arr1[0] = 100;
		System.out.println("arr1[0] = 100; �� �� ���� ��Ȳ");
		System.out.println("arr1 -> " + arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
		System.out.println("arr2 -> " + arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
	}

	public static void main(String[] args) {
		func9();
		// func8();
		// func7();
		// func6();
		// func5();
		// func4();
		// func3();
		// func2();
		// func1();
	}

}
