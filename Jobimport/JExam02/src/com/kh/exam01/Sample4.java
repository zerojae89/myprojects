package com.kh.exam01;

import java.util.Scanner;

public class Sample4 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�(1 ~ 5) : ");
		num = sc.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("1�� �Է��Ͽ����ϴ�.");
				break;	// switch ������ �����ϱ� ���� ���(�ݺ��������� ���)
			case 2:
				System.out.println("2�� �Է��Ͽ����ϴ�.");
				break;
			case 3:
				System.out.println("3�� �Է��Ͽ����ϴ�.");
				break;
			case 4:
				System.out.println("4�� �Է��Ͽ����ϴ�.");
				break;
			case 5:
				System.out.println("5�� �Է��Ͽ����ϴ�.");
				break;
			default:
				System.out.println("1~5�� �Է����� �ʾҽ��ϴ�.");
		}
		
		sc.close();
	}

}
