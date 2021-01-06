package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	// ��������
	public static Scanner sc = new Scanner(System.in);
	
	public static void practice1() {
		/*
		 *  1 �� ����
		 *	�޴��� ����ϰ� �޴� ��ȣ�� �Է��ϸ� "XX �޴��Դϴ�."
		 *  �� ����ϰ� ���� ��ȣ�� ������ "���α׷��� ����˴ϴ�." �� ���  
		 */
		
		int menu_num;
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ : ");
		
		menu_num = sc.nextInt();
		
//		if(menu_num == 1) {
//			System.out.println("�Է� �޴��Դϴ�.");
//		} else if(menu_num == 2) {
//			System.out.println("���� �޴��Դϴ�.");
//		} else if(menu_num == 3) {
//			System.out.println("��ȸ �޴��Դϴ�.");
//		} else if(menu_num == 4) {
//			System.out.println("���� �޴��Դϴ�.");
//		} else if(menu_num == 7) {
//			System.out.println("���α׷��� ����˴ϴ�.");
//		} else {
//			System.out.println("�߸��� �޴� ��ȣ �Դϴ�.");
//		}
		
		switch(menu_num) {
			case 1:
				System.out.println("�Է� �޴��Դϴ�.");	break;
			case 2:
				System.out.println("���� �޴��Դϴ�.");	break;
			case 3:
				System.out.println("��ȸ �޴��Դϴ�.");	break;
			case 4:
				System.out.println("���� �޴��Դϴ�.");	break;
			case 7:
				System.out.println("���α׷��� ����˴ϴ�.");	break;
			default:
				System.out.println("�߸��� �޴� ��ȣ �Դϴ�.");
		}
	}
	
	public static void practice2() {
		/*
		 *  2 �� ����
		 *  �Էµ� �������� ¦������ Ȧ������ �����Ͽ� ���
		 *  ������� �Է����� ���� ��� "������ �Է����ּ���." ���
		 */
		int num;
		
		System.out.print("��� �Է� : ");
		num = sc.nextInt();
		
//		if(num > 0) {
//			if(num % 2 == 0) {
//				System.out.println("¦����.");
//			} else {
//				System.out.println("Ȧ����.");
//			}
//		} else {
//			System.out.println("����� �Է��ϼ���.");
//		}
		
		if(num > 0) {
			switch(num % 2) {
				case 0:
					System.out.println("¦����.");	break;
				case 1:
					System.out.println("Ȧ����.");	break;
			}
		} else {
			System.out.println("����� �Է��ϼ���.");
		}
	}
	
	public static void practice3() {
		/*
		 *  3 �� ����
		 *  ����, ����, ���� �� ������ ������ �Է� �ް� �հ�� ��� ���
		 *  �հ�� ����� ����Ͽ� �հ�/���հ��� ó���Ѵ�.
		 *  �հ� ����
		 *  	�� ������ ������ ���� 40�� �̻��̰�
		 *  	����� 60�� �̻�
		 */
		int g1, g2, g3, tot;
		double avg;
		
		System.out.print("���� ���� : ");
		g1 = sc.nextInt();
		
		System.out.print("���� ���� : ");
		g2 = sc.nextInt();
		
		System.out.print("���� ���� : ");
		g3 = sc.nextInt();
		
		tot = g1 + g2 + g3;
		avg = tot / 3.0;
		
		if(g1 >= 40 && g2 >= 40 && g3 >= 40 && avg >= 60) {
			System.out.printf("���� : %d ��\n", g1);
			System.out.printf("���� : %d ��\n", g2);
			System.out.printf("���� : %d ��\n", g3);
			System.out.printf("�հ� : %d ��\n", tot);
			System.out.printf("��� : %.2f ��\n", avg);
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		} else {
			System.out.println("���հ� �Դϴ�.");
		}
	}
	
	public static void practice4() {
		/*
		 * �����ڷ� 7���̿��� if������ �Ǿ� �ִ� ��, ����, ����, �ܿ� ������
		 * switch������ ����.
		 */
		int month = 0;
		String season;
		
		System.out.println("1 ~ 12 ������ ���� �Է� : ");
		month = sc.nextInt();
		
		switch(month) {
			case 1: case 2: case 12:
				season = "�ܿ�"; break;
			case 3: case 4: case 5:
				season = "��"; break;
			case 6: case 7: case 8:
				season = "����"; break;
			case 9: case 10: case 11:
				season = "����"; break;
			default:
				season = "�߸� �Էµ� ��";
		}
		
		System.out.printf("%d���� %s�Դϴ�.", month, season);
	}
	
	public static void practice5() {
		/*
		 *  ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �����ϴ� �Ͱ� ����
		 *  ����� �ۼ�
		 *  �α��� ���� �� "�α��� ����" ���
		 *  ���̵� Ʋ���� �� "���̵� Ʋ�Ƚ��ϴ�."
		 *  ��й�ȣ�� Ʋ���� �� "��й�ȣ�� Ʋ�Ƚ��ϴ�."
		 */
		String id, pw;
		String id_input, pw_input;
		
		id = "myId";	pw = "myPassword12";
		
		System.out.print("���̵� �Է� : ");
		id_input = sc.next();
		
		System.out.print("�н����� �Է� : ");
		pw_input = sc.next();
		
		if(id.equals(id_input) && pw.equals(pw_input)) {
			System.out.println("�α��� ����");
		} else {
			if (!id.equals(id_input) && !pw.equals(pw_input)) {
				System.out.println("���̵�� �н����尡 Ʋ�Ƚ��ϴ�.");
			} else if(!id.equals(id_input)) {
				System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
			} else if(!pw.equals(pw_input)) {
				System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
			}
		}
	}
	
	public static void practice6() {
		/*
		 *  ����� �Է����� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է¹޾�
		 *  �� ����� ���� �� �ִ� ������ ���
		 *  ������ : ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�
		 *  ȸ�� : �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�
		 *  ��ȸ�� : �Խñ� ��ȸ
		 */
		String perm;
		
		System.out.print("ȸ�� ���(������, ȸ��, ��ȸ��) : ");
		perm = sc.next();
		
//		if(perm.equals("������")) {
//			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
//		} else if(perm.equals("ȸ��")) {
//			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
//		} else if(perm.equals("��ȸ��")) {
//			System.out.println("�Խñ� ��ȸ");
//		} else {
//			System.out.println("�߸��� ���� ����Դϴ�.");
//		}
		// �Է°� ���� : ȸ��
		String res = "";
		
		switch(perm) {
			case "������":
				res += "ȸ������, �Խñ� ����";	// res = res + "ȸ������, �Խñ� ����";
			case "ȸ��":
				res += "�Խñ� �ۼ�, ��� �ۼ�";	// res = res + "�Խñ� �ۼ�, ��� �ۼ�";
			case "��ȸ��":
				res += "�Խñ� ��ȸ";			// res = res + "�Խñ� ��ȸ";
				break;
			default:
				res = "�߸��� ���� ����Դϴ�.";
		}
		System.out.println(res);
	}
	
	public static void practice7() {
		/*
		 *  Ű, �����Ը� �Է¹޾Ƽ� BMI ������ ���
		 *  BMI = ������ / (Ű(m) * Ű(m))
		 *  ~ 18.5 �̸�			-> ��ü��
		 *  18.5 �̻� ~ 23 �̸�	-> ����ü��
		 *  23 �̻� ~ 25 �̸�		-> ��ü��
		 *  25 �̻� ~ 30 �̸�		-> ��
		 *  30 �̻� ~				-> ����
		 */
		double tall, weight, bmi;
		String res;
		
		System.out.print("Ű(cm)�� �Է����ּ��� : ");
		tall = sc.nextDouble();
		tall /= 100;	// tall = tall / 100;
		
		System.out.print("������(kg)�� �Է����ּ��� : ");
		weight = sc.nextDouble();
		
		bmi = weight / (tall * tall);
		
//		if(bmi < 18.5) {
//			res = "��ü��";
//		} else if(bmi >= 18.5 && bmi < 23) {
//			res = "����ü��";
//		} else if(bmi >= 23 && bmi < 25) {
//			res = "��ü��";
//		} else if(bmi >= 25 && bmi < 30) {
//			res = "��";
//		} else if(bmi >= 30) {
//			res = "����";
//		} else {
//			res = "�߸��� �Է°��� �ֽ��ϴ�.";
//		}
		
		if(bmi < 18.5) {
			res = "��ü��";
		} else if(bmi < 23) {
			res = "����ü��";
		} else if(bmi < 25) {
			res = "��ü��";
		} else if(bmi < 30) {
			res = "��";
		} else {
			res = "����";
		}
		
		System.out.printf("BMI ���� : %.2f\n", bmi);
		System.out.println(res);
	}
	
	public static void practice8() {
		/*
		 *  �� ���� ������ ���� ��ȣ�� �Է� �޾� ���� ��ȣ�� ���� ���� ����� ���
		 *  ��, �� ���� ���� ��� ����� ���� �۵��ϸ�, ���� ���� ��ȣ�� �Է½�
		 *  "�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�." ���
		 */
		int x, y;
		int iRes = 0;	double dRes = 0.0;
		char op;
		char flag = '\u0000';	// ��� ����� ����� �ڷ����� ������ �����ϱ� ���� �÷���, 'i', 'd'
		
		System.out.print("�ǿ����� 1 : ");
		x = sc.nextInt();
		
		System.out.print("�ǿ����� 2 : ");
		y = sc.nextInt();
		
		System.out.print("������(+,-,*,/,%) : ");
		op = sc.next().charAt(0);
		
		if(x > 0 && y > 0) {
			switch(op) {
				case '+':
					iRes = x + y;	flag = 'i';			break;
				case '-':
					iRes = x - y;	flag = 'i';			break;
				case '*':
					iRes = x * y;	flag = 'i';			break;
				case '/':
					dRes = (double)x / y;	flag = 'd';	break;
				case '%':
					iRes = x % y;	flag = 'i';			break;
				default:
					System.out.printf("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			if (flag == 'i') {
				System.out.printf("%d %c %d = %d", x, op, y, iRes);
			} else if (flag == 'd'){ 
				System.out.printf("%d %c %d = %f", x, op, y, dRes);
			}
		}
	}
	
	public static void practice9() {
		/*
		 *  1. ����� �Է����� �߰����, �⸻���, ��������, �⼮Ƚ���� �Է� �ޱ�
		 *  2. �� ������ �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20% �̴�.
		 *  3. �⼮ ������ ��ü �⼮ 20ȸ �� �⼮ Ƚ���� ����Ͽ� ����Ѵ�.
		 *  4. �� ������ ���߾� 100�� ����� �Ͽ��� �� �������ǿ� ���� Pass, Fail ���
		 *	 A. 70�� �̻��� ��� Pass
		 *	 B. 70�� �̻������� �Ἦ�� 30% �̻��̸� Fail
		 *	 C. 70�� �̸��� ��� Fail
		 */
		double mid, fin, rep, total, att_jum, att_rate;
		int att;
		
		// ����� �Է�
		System.out.print("�߰���� ���� : ");	mid = sc.nextDouble();
		System.out.print("�⸻��� ���� : ");	fin = sc.nextDouble();
		System.out.print("���� ���� : ");		rep = sc.nextDouble();
		System.out.print("�⼮ Ƚ�� : ");		att = sc.nextInt();
		
		// ����ġ ���
		rep = rep / 100 * 30;
		fin = fin / 100 * 30;
		mid = mid / 100 * 20;
		att_jum = att / 20.0 * 20;
		att_rate = att / 20.0 * 100;
		total = mid + fin + rep + att;
		
		// ��� ���
		System.out.println("==================== ��� ====================");
		System.out.println("�߰� ���� (20%) : " + mid);
		System.out.println("�⸻ ���� (30%) : " + fin);
		System.out.println("���� ���� (30%) : " + rep);
		System.out.println("�⼮ ���� (20%) : " + att_jum);
		System.out.println("���� : " + total);
		
		if(total >= 70) {
			if(100 - att_rate >= 30) {
				System.out.println("Fail [�⼮ ���� " + att + "/20]");
			} else {
				System.out.println("Pass");
			}
		} else {
			System.out.println("Fail [���� �̴�]");
		}
	}
	
	public static void practice10() {
		int menu_num;
		
		System.out.println("������ �޴� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		System.out.print("���� : ");
		
		menu_num = sc.nextInt();
		
		switch(menu_num) {
			case 1: practice1(); break;
			case 2: practice2(); break;
			case 3: practice3(); break;
			case 4: practice4(); break;
			case 5: practice5(); break;
			case 6: practice6(); break;
			case 7: practice7(); break;
			case 8: practice8(); break;
			case 9: practice9(); break;
			default: System.out.println("�߸��� �޴� ��ȣ");
		}
	}


	public static void main(String[] args) {
		practice10();
		sc.close();
	}

}
