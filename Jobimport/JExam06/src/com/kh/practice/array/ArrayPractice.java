package com.kh.practice.array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
	
	public static Scanner sc = new Scanner(System.in);

	public static void practice1() {
		/*
		 *  ���̰� 10�� �迭�� �����ϰ� 1���� 10������ ���� �ݺ�����
		 *  �̿��Ͽ� ������� �迭 �ε����� ���� �� ���
		 */
		int[] arr = new int[10];
		int num = 1;
		
		// 1 ~ 10 ������ ���� �����ϱ� ���� ������ ������ ���
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num += 1;
		}
		
		// 1 ~ 10 ������ ���� �����ϱ� ���� i ���� Ȱ��
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void practice2() {
		/*
		 *  ���̰� 10�� �迭�� �����ϰ� 1 ~ 10������ ���� �ݺ�����
		 *  �̿��Ͽ� �������� �迭 �ε����� ���� �� �� ���� ���
		 *  10 9 8 7 6 5 4 3 2 1
		 */
		int[] arr = new int[10];
		int num = 10;
		
		// �迭�� ������ 10 ~ 1 ������ ���� ������ ������ �����Ͽ� ���
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num--;
		}
		
		// �迭�� ������ 10 ~ 1 ������ ���� i ������ Ȱ��
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void practice3() {
		/*
		 *  ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		 *  1 ���� �Է� ���� ������ �迭�� �ʱ�ȭ �� ���
		 */
		int arrSize;
		
		while(true) {
			System.out.print("���� ���� : ");
			arrSize = sc.nextInt();
			if(arrSize > 0) {
				break;
			}
		}
		
		int[] arrVar = new int[arrSize];
		
		// �迭�� 1 ~ ����� �Է� ������ �ʱ�ȭ
		for(int i = 0; i < arrVar.length; i++) {
			arrVar[i] = i + 1;
		}
		
		// ���
		for(int i = 0; i < arrVar.length; i++) {
			System.out.print(arrVar[i] + " ");
		}
	}
	
	public static void practice4() {
		/*
		 *  ���̰� 5�� String �迭�� �����ϰ� "���", "��", "����", "������", "����"��
		 *  �ʱ�ȭ �� �迭 �ε����� Ȱ���Ͽ� ���� ����Ͻÿ�.
		 */
		String[] arrVar = {"���", "����", "��", "������", "����"};
		
		for(int i = 0; i < arrVar.length; i++) {
			if("��".equals(arrVar[i])) {
				System.out.println("��ġ �� -> " + i + "\t���ڿ� -> " + arrVar[i]);
			}
		}
	}
	
	public static void practice5() {
		String word;
		char ch;
		char[] chArr;
		int count = 0;
		
		System.out.print("���ڿ� : ");
		word = sc.next();
		
		System.out.print("���� : ");
		ch = sc.next().charAt(0);
		
		// ���ڿ��� ���� ��ŭ ���ڹ迭 ����
		chArr = new char[word.length()];
		
		// ���ڿ��� �ε����� ���ڹ迭�� �ε����� Ȱ���Ͽ�
		// ���ڿ��� ���ڸ� ���ڹ迭�� ����
		for(int i = 0; i < word.length(); i++) {
			chArr[i] = word.charAt(i);
		}
		
		System.out.print(word + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		for(int i = 0; i < chArr.length; i++) {
			if(ch == chArr[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + ch + " ���� : " + count);
		
	}
	
	public static void practice6() {
		/*
		 *  "��" ~ "��" ���ϱ��� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0 ���� 6 ���� ���ڸ�
		 *  �Է¹޾� �Է��� ���ڿ� ���� �ε����� �ִ� ������ ���
		 *  
		 *  Ȱ�� -> 1 ~ 31 ������ ���ڰ��� �Է¹޾� �׿� �����ϴ� ���� ���
		 */
		String[] week = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		int day;
		
		while(true) {
			System.out.print("1 ~ 31 ���� ���� �Է� : ");
			day = sc.nextInt();
			if(day >= 1 && day <= 31) {
				break;
			}
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}
		
		System.out.println(week[day % 7]);
	}
	
	public static void practice7() {
		/*
		 *  ����ڰ� �Է��� ������ ũ���� �迭�� ���� �� ����ڰ� ���� ���� �Է��Ͽ�
		 *  �迭�� ���� �ʱ�ȭ �ϵ��� �Ѵ�.
		 *  �ʱ�ȭ�� �Ϸ�Ǹ� �迭�� ����� ���� ������ ���Ͽ� ����Ѵ�.
		 */
		int[] arrVar;
		int arrSize, total;
		
		System.out.print("���� : ");
		arrSize = sc.nextInt();
		
		arrVar = new int[arrSize];
		for(int i = 0; i < arrSize; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arrVar[i] = sc.nextInt();
		}
		
		total = 0;
		for(int i = 0; i < arrVar.length; i++) {
			System.out.print(arrVar[i] + " ");
			total = total + arrVar[i];
		}
		
		System.out.println("\n�� �� : " + total);
	}
	
	public static void practice8() {
		/*
		 *  3 �̻��� Ȧ�� �ڿ����� �Է¹޾� �迭�� �߰������� 1����
		 *  1�� ������Ű�� �߰����� ���ʹ� 1�� ������ ���� �迭�� �־�
		 *  ���
		 *  
		 *  ���� : 5
		 *  1, 2, 3, 2, 1
		 *  
		 *  ���� : 7
		 *  1, 2, 3, 4, 3, 2, 1
		 */
		
		int num1;	// ����� �Է��� �޾� �����ϱ� ���� ����
		int[] arr;	// ������ �迭 ����, ����ڰ� �Է��� ũ���� �迭�� ������ ��.
		
		while(true) {
			System.out.print("���� : ");
			num1 = sc.nextInt();
			
			if(num1 >= 3 && num1 % 2 == 1) {
				// 3 �̻��� Ȧ����.
				break;
			}
			System.out.println("3 �̻��� Ȧ�� ������ �ٽ� �Է��ϼ���.");
		}
		
		arr = new int[num1];
		/*  ���� : 5           �߰� ��ġ : 5 / 2 -> 2
		 *  1, 2, 3, 2, 1 
		 * 
		 *  ���� : 7           �߰� ��ġ : 7 / 2 -> 3
		 *  1, 2, 3, 4, 3, 2, 1
		 *  
		 *                     �߰� ��ġ : n / 2 -> �迭�� �߰��� �ش��ϴ� �ε���
		 */
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = value;
			if(i < arr.length / 2) {	// �迭�� �߰��� �ش��ϴ� ��ġ ����
				// �迭�� ������ �� ����.
				value++;
			} else {
				// �迭�� ������ �� ����.
				value--;
			}
		}
		
		// ��� ���
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1]);
		
	}
	
	public static void practice8_1() {
		/*
		 *  3 �̻��� Ȧ�� �ڿ����� �Է¹޾� �迭�� �߰������� 1�� ���ҽ�Ű��
		 *  �߰����� ���ʹ� 1�� ������ ���� �迭�� �־� ���
		 *  
		 *  ���� : 5			���� �� : 5 / 2 + 1
		 *  3, 2, 1, 2, 3
		 *  
		 *  ���� : 7			���� �� : 7 / 2 + 1
		 *  4, 3, 2, 1, 2, 3, 4
		 *  
		 *  ���� : 15			���� �� : 15 / 2 + 1
		 *  8, 7, 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8
		 */
		int num1;	// ����� �Է��� �޾� �����ϱ� ���� ����
		int[] arr;	// ������ �迭 ����, ����ڰ� �Է��� ũ���� �迭�� ������ ��.
		
		while(true) {
			System.out.print("���� : ");
			num1 = sc.nextInt();
			
			if(num1 >= 3 && num1 % 2 == 1) {
				// 3 �̻��� Ȧ����.
				break;
			}
			System.out.println("3 �̻��� Ȧ�� ������ �ٽ� �Է��ϼ���.");
		}
		
		arr = new int[num1];
		
		int value = arr.length / 2 + 1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = value;
			if(i < arr.length / 2) {	// �迭�� �߰��� �ش��ϴ� ��ġ ����
				// �迭�� ������ �� ����.
				value--;
			} else {
				// �迭�� ������ �� ����.
				value++;
			}
		}
		
		// ��� ���
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length - 1]);
		
	}
	
	public static void practice9() {
		/*
		 *  ����ڰ� �Է��� ���ڿ��� ���ڿ� �迭�� �����ϴ��� �˻���
		 *  �����ϸ�, "XXX ġŲ ��� ����" ������ "XXX ġŲ�� ���� �޴��Դϴ�."
		 *  ���
		 */
		String[] chickens = {"�Ķ��̵�", "���", "����", "����", "ũ������", "��"};
		String search;
		boolean find = false;	// �޴��� ã�� ��� true�� ����
		int index = 0;
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		search = sc.next();
		
		for(int i = 0; i < chickens.length; i++) {
			if(chickens[i].equals(search)) {
				find = true;
				index = i;
				break;
			}
		}
		
		if(find) {
			System.out.println(chickens[index] + "ġŲ �޴��� ����");
		} else {
			System.out.println(search + "ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	public static void practice9_1() {
		/*
		 *  ġŲ �޴� �迭�� ������ ũ���� ġŲ �޴��� ������ �����ϴ� �迭�� �����ϰ�
		 *  ����ڰ� �Է��� ���ڿ��� ġŲ �޴� �迭�� �����ϴ��� �˻� ��
		 *  �����ϸ�, "XXX ġŲ ������ XXXXX�� �Դϴ�." ������
		 *  "XXX ġŲ�� ���� �޴��Դϴ�." ���
		 */
		String[] chickens = {"�Ķ��̵�", "���", "����", "����", "ũ������", "��"};
		int[] chickensAmount = {10000, 11000, 12000, 12000, 9000, 11000};
		String search;
		boolean find = false;	// �޴��� ã�� ��� true�� ����
		int index = 0;
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		search = sc.next();
		
		for(int i = 0; i < chickens.length; i++) {
			if(chickens[i].equals(search)) {
				find = true;
				index = i;
				break;
			}
		}
		
		if(find) {
			System.out.println(chickens[index] + "ġŲ ������ " + chickensAmount[index] + "�� �Դϴ�.");
		} else {
			System.out.println(search + "ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	public static void practice10() {
		/*
		 *  �ֹε�Ϲ�ȣ�� �Է¹ް� �����ڸ� ���ĺ��ʹ� *�� ������ ���
		 *  ������ �����ϸ鼭 ���纻���� *�� ������ ���� �� ���
		 *  
		 *  ����� ���ÿ� ���� ���� ������ �ֹε�Ϲ�ȣ�� *�� ���纻�� �����ϴ� �Ͱ�
		 *  ��������� ����� ������ �ֹε�� ��ȣ�� *�� ���纻�� �����ϴ� ������ ����
		 *  
		 *  123456-1234567 -> ���� ������ ��ȣ   -> 123456-1******
		 *  123456-1234567 -> ����� ������ ��ȣ -> 1234**-*******
		 */
		String jumin;
		String temp;
		
		// �ݵ�� - ������ �Ǿ� �ִ��� üũ.
		// �ֹε�Ϲ�ȣ ���̰� - �����Ͽ� 14 �� ���� üũ.
		// 123456-1234567
		while(true) {
			System.out.print("�ֹε�Ϲ�ȣ(- ����) : ");
			jumin = sc.next();
			if(jumin.length() != 14) {
				System.out.println("�ֹε�Ϲ�ȣ�� -(������) �����Ͽ� 14�� �Դϴ�.");
				continue;
			}
			if(jumin.charAt(6) != '-') {
				System.out.println("�ùٸ��� ���� �ֹε�Ϲ�ȣ �����Դϴ�.");
				continue;
			}
			break;
		}
		
		// ���� ���� ���� �Ǵ� ����� ���� ���� ���а� �Է� �ޱ�
		while(true) {
			System.out.print("�ֹι�ȣ ����ó��(����, ����� ����) : ");
			temp = sc.next();
			
			if(temp.equals("����") || temp.equals("�����")) {
				break;
			}
			System.out.println("���� �Ǵ� ������� �Է��ϼ���.");
		}
		
		char[] orgJumin = new char[14];
		char[] copJumin = new char[14];
		// char[] tmpJumin;		// Arrays.copyOf �� �ӽù迭
		
		// ���ڿ��� ���ڹ迭�� ����(��������)
		for(int i = 0; i < jumin.length(); i++) {
			orgJumin[i] = jumin.charAt(i);
		}
		
		// ���� ���ڹ迭�� �����͸� ���纻 ���ڹ迭�� ����
		// �������� ������ ���� * �� ����
		// 123456-1234567
		if(temp.equals("����")) {
			for(int i = 0; i < orgJumin.length; i++) {
				if(i <= 7) {
					copJumin[i] = orgJumin[i];
				} else {
					copJumin[i] = '*';
				}
			}
		} else {
			for(int i = 0; i < orgJumin.length; i++) {
				if(i <= 3) {
					copJumin[i] = orgJumin[i];
				} else {
					copJumin[i] = '*';
					if(i == 6) {
						copJumin[i] = '-';
					}
				}
			}
		}
		
		System.out.print("���� �ֹι�ȣ : ");
		for(int i = 0; i < orgJumin.length; i++) {
			System.out.print(orgJumin[i]);
		}
		System.out.print("\n");
		
		System.out.print("���纻 �ֹι�ȣ : ");
		for(int i = 0; i < copJumin.length; i++) {
			System.out.print(copJumin[i]);
		}
	}
	
	public static void practice12() {
		/*
		 *  10���� ���� ������ �� �ִ� �迭�� ���� �� 1 ~ 10 ������ ������ �����Ͽ�
		 *  �ʱ�ȭ �� �迭 ��ü�� �� ��� �� �ִ밪, �ּҰ��� ���
		 */
		Random rand = new Random();
		int[] randArr = new int[10];
		
		for(int i = 0; i < randArr.length; i++) {
			randArr[i] = rand.nextInt(10) + 1;
		}
		
		for(int i = 0; i < randArr.length; i++) {
			System.out.print(randArr[i] + " ");
		}
		
		// �ִ밪, �ּҰ�
		int max = randArr[0], min = randArr[0];
		for(int i = 1; i < randArr.length; i++) {
			if(randArr[i] > max) {
				max = randArr[i];
			}
			if(randArr[i] < min) {
				min = randArr[i];
			}
		}
		System.out.println("\n�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
	
	public static void practice13() {
		/*
		 *  10���� ���� ������ �� �ִ� �迭�� ���� �� 1 ~ 10 ������ ������ �����Ͽ� �ʱ�ȭ
		 *  ��, �ߺ��� ���� ���� �ȵȴ�.
		 */
		Random rand = new Random();
		int[] randArr = new int[10];
		int temp;
		boolean dup = false;		// �ߺ��� �������� ������ �����ϱ� ���� ����
		
		randArr[0] = rand.nextInt(10) + 1;
		for(int i = 1; i < randArr.length;) {
			dup = false;
			temp = rand.nextInt(10) + 1;
			for(int j = 0; j < i; j++) {
				if(randArr[j] == temp) {
					dup = true;
					break;
				}
			}
			if(!dup) {	// �ߺ��� �ƴϸ�. �߰�
				randArr[i] = temp;
				i++;
			}
		}
		
		for(int i = 0; i < randArr.length; i++) {
			System.out.print(randArr[i] + " ");
		}
		
	}
	
	public static void practice14() {
		/*
		 *  �ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ�
		 *  1. �ߺ����� ����� �Ѵ�.
		 *  2. ������������ �����Ͽ� ���
		 */
		// 1 ~ 45 ������ ������ ����.
		Random rand = new Random();
		
		// �� 6���� ���� ����
		int[] lotto = new int[6];
		boolean dup = false;	// �ߺ����� �ִ��� Ȯ���ϱ� ���� �÷���
		int temp;
		for(int i = 1; i <= 6;) {
			// �ߺ��� �� ���� 6���� ���� ����
			temp = rand.nextInt(45) + 1;	// �켱������ ������ ����
			// System.out.println(temp);	// ������� ���� ���
			for(int j = 0; j < i-1; j++) {	// ������ ������ �������� ���� �ߺ� �˻�
				if(temp == lotto[j]) {	// �ߺ����� �ִ� ��쿡�� dup�� true �����.
					dup = true;	break;
				}
			}
			if(!dup) {	// �ߺ����� ���� ���� �� �߰� �� i(Index) ����
				lotto[i-1] = temp;	i++;
			}
			dup = false;	// �ߺ� �˻簡 ���� �� �ٽ� �ʱ�ȭ.
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.print("\n");
		
		// ������������ ����
		int min, minIdx;
		for(int i = 0; i < 6 - 1; i++) {
			min = lotto[i];
			minIdx = i;
			for(int j = i+1; j < 6; j++) {
				if(min > lotto[j]) {
					min = lotto[j];
					minIdx = j;
				}
			}
			if(i != minIdx) {
				temp = lotto[i];
				lotto[i] = lotto[minIdx];
				lotto[minIdx] = temp;
			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public static void practice16() {
		/*
		 *  1. ����ڰ� �Է��� �迭�� ���̸�ŭ ���ڿ� �迭 ����
		 *  2. ������ ���ڿ� �迭�� ���̸�ŭ ����ڰ� �Է��Ͽ� ���� �ʱ�ȭ
		 *  3. ����ڿ��� �߰� �Է��� �� ������ Ȯ�� �� �߰� �Է��� �����ϵ���
		 *  4. �߰� �Է��� ����ڰ� �Է��� �߰� ���� ��ŭ �迭 ũ�� ���� �� ���ڿ� �߰� �Է�
		 *  5. �߰� �Է��� ���� ������ �迭�� ��ü ���ڿ� ���
		 */
		String[] proList, tmpList;
		String yesNo;
		int arrSize, addSize;
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		arrSize = sc.nextInt();		sc.nextLine();	// ���๮�� ó���� ���� ���
		
		proList = new String[arrSize];
		
		for(int i = 0; i < arrSize; i++) {
			System.out.print(i + 1 + " ��° ���ڿ� : ");
			proList[i] = sc.nextLine();
		}
		
		while(true) {
			while(true) {
				System.out.print("�� ���� �Է��ϰڽ��ϱ�? (Y/N) : ");
				yesNo = sc.next();		sc.nextLine();	// ���๮�� ó���� ���� ���
				if(yesNo.equals("Y") || yesNo.equals("y") ||
						yesNo.equals("N") || yesNo.equals("n")) {
					break;
				}
				System.out.println("����� y �Ǵ� n ���θ� �ϼ���.");
			}
			
			if(yesNo.equals("N") || yesNo.equals("n")) {
				break;
			}
			
			System.out.print("�� �Է��� ���� : ");
			addSize = sc.nextInt();		sc.nextLine();
			tmpList = new String[proList.length + addSize];
			
			for(int i = 0; i < tmpList.length; i++) {
				if(i < proList.length) {
					tmpList[i] = proList[i];
				} else {
					System.out.print(i + 1 + " ��° ���ڿ� : ");
					tmpList[i] = sc.nextLine();
				}
			}
			
			proList = new String[tmpList.length];
			System.arraycopy(tmpList, 0, proList, 0, tmpList.length);
		}
		
		for(int i = 0; i < proList.length; i++) {
			System.out.print(proList[i] + ", ");
		}
		
	}
	
	public static void practice15() {
		/*
		 *  1. ���ڿ��� �Է¹޾� ���� �迭�� ����
		 *  2. ���� �迭���� �ߺ��Ǵ� ���� ���� ����
		 *  3. �ߺ� ���� ����� ���ڿ� ���ڹ迭�� ũ�⸦ ���
		 */
		String input;
		char[] orgCharArray, copCharArray;
		
		System.out.print("���ڿ� : ");
		input = sc.next();
		
		orgCharArray = new char[input.length()];
		copCharArray = new char[input.length()];
		
		for(int i = 0; i < orgCharArray.length; i++) {
			orgCharArray[i] = input.charAt(i);
		}
		
		int copIdx = 0;
		boolean dup = false;
		for(int i = 0; i < orgCharArray.length; i++) {
			for(int j = 0; j < copIdx; j++) {
				if(orgCharArray[i] == copCharArray[j]) {
					dup = true;
					break;
				}
			}
			if(!dup) {
				copCharArray[copIdx] = orgCharArray[i];
				copIdx++;
			}
			dup = false;
		}
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < copCharArray.length; i++) {
			System.out.print(copCharArray[i] + " ");
		}
		System.out.print("\n���� ���� : " + copIdx);
		
		
		
	}
	
	public static void main(String[] args) {
		// practice16();
		practice15();
		// practice14();
		// practice13();
		// practice12();
		// practice10();
		// practice9_1();
		// practice9();
		// practice8_1();
		// practice8();
		// practice7();
		// practice6();
		// practice5();
		// practice4();
		// practice3();
		// practice2();
		// practice1();
	}

}
