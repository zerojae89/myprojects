package com.kh.exam01;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� (1 ~ 100) : ");
		num = sc.nextInt();
		
		if(num >= 1 && num <= 100) {
			System.out.println("�ùٸ� �Է°� �Դϴ�.");
		} else {
			System.out.println("�߸��� �Է°� �Դϴ�."
					+ "(1 ~ 100 ������ ���� �Է��ϼ���.)");
		}
		
		sc.close();
	}

}
