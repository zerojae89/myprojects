package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	public void menu() {
		// Snack 객체에 데이터를 저장할 수 있도록 값을 받고, 저장한 값을 출력.
		// SnackController의 savaData()/confirmData()를 활용.

		// savaData()/confirmData()를 호출하기 위한 지역변수 선언
		String kind, name, flavor;
		int numOf, price;

		char select; // 저장정보를 확인할 것인지 묻는 반복문을 위한 변수 선언

		System.out.println("스낵류를 입력하세요");
		System.out.print("종류 : ");
		kind = sc.next();
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("맛 : ");
		flavor = sc.next();
		System.out.print("개수 : ");
		numOf = sc.nextInt();
		System.out.print("가격 : ");
		price = sc.nextInt();

		scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(scr.saveData(kind, name, flavor, numOf, price)); // 저장 완료되었습니다 출력

		while (true) {

			System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
			select = sc.next().charAt(0);

			if (select == 'y' || select == 'Y') {
				System.out.println(scr.confirmData());
				break;
			} else if (select == 'n' || select == 'N') {
				break;
			} else {
				System.out.println("Y or N으로 입력해주세요.");
			}
		}

		sc.close();
	}

}
