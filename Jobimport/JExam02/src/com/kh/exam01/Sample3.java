package com.kh.exam01;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		/*
		 *  num1, num2�� ���� ���� �Է� ���� �� num1�� num2�� ������� Ȯ��
		 *  �ϴ� �ڵ�
		 */
		int num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.print("���� 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("���� 2 : ");
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0) {
			System.out.printf("%d�� %d�� ��� �Դϴ�.", num1, num2);
		} else {
			System.out.printf("%d�� %d�� ����� �ƴմϴ�.", num1, num2);
		}
		
		sc.close();
	}

}
