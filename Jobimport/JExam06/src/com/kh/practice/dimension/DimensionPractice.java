package com.kh.practice.dimension;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		/*
		 *  1. 3�� 3�� ���ڿ� �迭 ���� �� �Ҵ�
		 *  2. 0�� 0�� ���� 2�� 2������ ���ʴ�� �����Ͽ� ������ ���� �������� ����
		 *     (0, 0)(0, 1)(0, 2) ....
		 *  3. ����� �迭�� ���ڿ� ���
		 */
		String[][] strArray = new String[3][3];
		
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j < strArray[i].length; j++) {
				strArray[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j < strArray[i].length; j++) {
				System.out.print(strArray[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static void practice2() {
		/*
		 *  1. 4�� 4�� ������ �迭 ���� �� �Ҵ�
		 *  2. 1 ~ 16���� ���� ���ʷ� ����
		 *  3. ����� �迭�� ���� ���
		 */
		int[][] intArray = new int[4][4];
		int number = 1;
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				// intArray[i][j] = (i * 4) + j + 1;
				intArray[i][j] = number;
				number++;
			}
		}
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.printf("%3d", intArray[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static void practice3() {
		/*
		 *  1. 4�� 4�� ������ �迭 ���� �� �Ҵ�
		 *  2. 16 ~ 1���� ���� ���ʷ� ����
		 *  3. ����� �迭�� ���� ���
		 */
		int[][] intArray = new int[4][4];
		int number = 16;
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				intArray[i][j] = number;
				number--;
			}
		}
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.printf("%3d", intArray[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public static void practice4() {
		/*
		 *  1. 4�� 4�� �迭�� ����
		 *  2. 0�� 0�� ���� 2�� 2�� ������ ������ ����
		 *  3. �������� 1 ~ 10 ������ ������ ����
		 *  4. ������ ������ ������ ���� ������ ����
		 *  5. ������ ������ �࿡�� ���� ������ ����
		 *  6. 3�� 3������ 4�� 5������ ���� ������ ������ ����
		 */
		int[][] intArray = new int[4][4];
		
		Random rand = new Random();
		
		int rowTotal = 0;
		for(int i = 0; i < intArray.length-1; i++) {
			for(int j = 0; j < intArray[i].length-1; j++) {
				intArray[i][j] = rand.nextInt(10) + 1;
				rowTotal += intArray[i][j];
			}
			intArray[i][intArray[i].length-1] = rowTotal;
			rowTotal = 0;
		}
		
		int colTotal = 0;
		for(int i = 0; i < intArray[0].length; i++) {
			for(int j = 0; j < intArray.length; j++) {
				colTotal += intArray[j][i];
			}
			intArray[intArray[0].length-1][i] = colTotal;
			if(i == intArray[0].length-1) {
				intArray[intArray[0].length-1][i] *= 2;
			}
			colTotal = 0;
		}
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	
	public static void practice5() {
		/*
		 *  1. 2�� �迭�� ��� ���� ũ�⸦ ����� �Է¹޾� ����
		 *  2. ��� ���� ũ��� 1 ~ 10 ������ ������ �޾� ó��
		 *  3. 1 ~ 10 ������ ������ �ƴϸ� �ٽ� �Է¹ޱ�
		 *  4. ������ 2�� �迭���� ������ �빮�ڷ� �������� �����Ͽ� �ʱ�ȭ
		 *  5. 2�� �迭�� �ʱ�ȭ �Ϸ� �� ���
		 */
		int rowSize, colSize;
		char[][] charArray;
		
		while(true) {
			System.out.print("�� ũ�� : ");
			rowSize = sc.nextInt();
			
			System.out.print("�� ũ�� : ");
			colSize = sc.nextInt();
			
			if(rowSize >= 1 && rowSize <= 10 && colSize >= 1 && colSize <= 10) {
				break;
			}
			System.out.print("��� ���� ũ��� 1 ~ 10 ������ ���������� �Է��ϼ���.");
		}
		
		charArray = new char[rowSize][colSize];
		Random rand = new Random();
		
		for(int i = 0; i < charArray.length; i++) {
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
		/*
		 *  1. �־��� ���ڿ� �迭�� �̿��Ͽ� �־��� ���·� ���.
		 */
		String[][] strArray = new String[][] {
			{"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"},
			{"��", "��", "! ", "��", "!!"}
		};
		
		for(int i = 0; i < strArray.length; i++) {
			for(int j = 0; j < strArray[i].length; j++) {
				System.out.print(strArray[j][i] + " ");
			}
			System.out.print("\n");
		}
	}
	
	public static void practice7() {
		/*
		 *  1. ���� ũ�⸦ ����� �Է����� �ޱ�
		 *  2. �Է� ���� ���� ũ�⸸ŭ �ݺ��Ͽ� ���� ũ�⵵ ����� �Է� �ޱ�
		 */
		int rowSize, colSize;
		char[][] charArray;
		
		System.out.print("���� ũ�� : ");
		rowSize = sc.nextInt();
		
		charArray = new char[rowSize][];	// ����ڰ� �Է��� �� ũ���� 1�� �迭�� ����
		
		for(int i = 0; i < rowSize; i++) {
			System.out.print(i + " ���� ũ�� : ");
			colSize = sc.nextInt();
			charArray[i] = new char[colSize];
		}
		
		int number = 0;
		for(int i = 0; i < charArray.length; i++) {
			for(int j = 0; j < charArray[i].length; j++) {
				charArray[i][j] = (char)(97 + (number % 26));
				number++;
				System.out.print(charArray[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	public static void practice8() {
		/*
		 *  1. 1�� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ
		 *  2. 2�� 3������ 2�� �迭 2���� �̿��Ͽ� �д��� ������.
		 *  3. 1�д� ���ʺ��� ������ �������� 0�࿡�� 1�� ������ �ڸ� ��ġ
		 *  
		 *  ���
		 *  == 1 �д� ==
		 *  ���ǰ�	������
		 *  �����	�����
		 *  ���̹�	�ں���
		 *  == 2 �д� ==
		 *  �ۼ���	������
		 *  ������	��õ��
		 *  ��ǳǥ	ȫ����
		 *  
		 *  �߰� �̼� -> 3�� �迭�� �̿��� �ڵ�ε� �ۼ��Ͻÿ�.
		 */
	}

	public static void main(String[] args) {
		practice7();
		// practice6();
		// practice5();
		// practice4();
		// practice3();
		// practice2();
		// practice1();
	}
	
	public static void practice() {
		
	}

}
