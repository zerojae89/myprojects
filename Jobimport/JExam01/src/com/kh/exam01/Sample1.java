package com.kh.exam01;

public class Sample1 {

	public static void main(String[] args) {
		// �ζ��� �ּ� : ������ �ڵ带 �������� �ʴ� �ڵ�� �����.
		/*
		 *  �� �ּ� : �� ������ �ּ��� �����Ѵ�.
		 *            ���� ���� �ּ����� ó��
		 */
		int x, y, sum;	// ���� �����
		final int MULTIPLE;	// ��� ����
		String s = "����" + 123 + 45 + "ĢĢ����";
		MULTIPLE = 2;
		x = 10;	y = 20;	x = 30;
		// MULTIPLE = 3;  ����� �ѹ� �ʱ�ȭ �ϸ� �ٽ� �Ҵ��� �� ����.
		sum = x + y * MULTIPLE;
		System.out.println(sum);  // println -> print line
		System.out.println(s);
	}

}
