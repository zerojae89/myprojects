package com.kh.exam;

public class Sample1 {

	// Ctrl + F11 -> ����
	// F11        -> �����
	// F6         -> �� �ܰ辿 ����
	public static void func1() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " ��° ���");
		}
	}
	
	public static void func2() {
		int i;
		for(i = 1; i <= 5; i++) {
			System.out.println(i + " ��° ���");
		}
		System.out.println("�ݺ��� �ۿ����� i �� Ȯ�� ���� -> " + i);
	}
	
	public static void func3() {
		int i;
		for(i = 1; i <= 5;) {
			System.out.println(i + " ��° ���");
			// ������ �� ���ǽ��� �߸� �ۼ��ϸ� ���ѹݺ� �߻�(����!!)
			i = i + 2;	// for() ������ ������ �κ��� �����ϰ� ����ȿ� �ۼ� ����
		}
		System.out.println("�ݺ��� �ۿ����� i �� Ȯ�� ���� -> " + i);
	}
	
	public static void func4() {
		// �ݺ����� �ʱⰪ�� �����ϰ� �ܺο� �ʱⰪ �ۼ�
		int i = 1;
		for(; i <= 5;) {
			System.out.println(i + " ��° ���");
			// ������ �� ���ǽ��� �߸� �ۼ��ϸ� ���ѹݺ� �߻�(����!!)
			i = i + 2;	// for() ������ ������ �κ��� �����ϰ� ����ȿ� �ۼ� ����
		}
		System.out.println("�ݺ��� �ۿ����� i �� Ȯ�� ���� -> " + i);
	}
	
	public static void func5() {
		// �ݺ����� �ʱⰪ�� �����ϰ� �ܺο� �ʱⰪ �ۼ�
		int i = 1;
		// ���ǽ��� ����, �� �ݺ��� �ȿ� ������ �� �ִ� ������ ������ �Ѵ�.
		// ���ѹݺ� �߻�(����!!)
		for(;;) {
			System.out.println(i + " ��° ���");
			// ������ �� ���ǽ��� �߸� �ۼ��ϸ� ���ѹݺ� �߻�(����!!)
			i = i + 2;	// for() ������ ������ �κ��� �����ϰ� ����ȿ� �ۼ� ����
			if(i > 5) {
				break;
			}
		}
		System.out.println("�ݺ��� �ۿ����� i �� Ȯ�� ���� -> " + i);
	}
	
	public static void func6() {
		/*
		 *  1 ~ 100 ������ ������ �� Ȧ���� ����ϴ� �ݺ���
		 */
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		for(int i = 1; i <= 100; i = i + 2) {
			System.out.println(i);
		}
		
		int i = 1;
		for(;;) {
			System.out.println(i);
			i = i + 2;
			if(i > 100) {
				break;
			}
		}
	}
	
	public static void func7() {
		/*
		 *  100 ~ 1 ������ ������ �� ¦���� ����ϴ� �ݺ���
		 */
		for(int i = 100; i >= 1; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		//               �ݺ� ����
		for(int i = 100; i >= 1;   i = i - 2) {
			System.out.println(i);
		}
		
		int i = 100;
		for(;;) {
			System.out.println(i);
			i = i - 2;
			if(i < 1) {	// ���� ����
				break;
			}
		}
	}
	
	public static void func8() {
		/*  ��ø �ݺ���
		 *  1 ~ 9 �� ���� �ݺ� ��� ������.
		 *  1 * 1 = 1	1 * 2 = 2	1 * 3 = 3 ..... 1 * 9 = 9
		 *  2 * 1 = 2	2 * 2 = 4	2 * 3 = 6 ..... 2 * 9 = 18
		 *  3 * 1 = 3 ............................. 3 * 9 = 27
		 *  .
		 *  .
		 *  9 * 1 = 9 ............................. 9 * 9 = 81
		 */
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d �� %d = %d\t", j, i, i * j);
			}
			System.out.print("\n");
		}
		
	}
	
	public static void main(String[] args) {
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
