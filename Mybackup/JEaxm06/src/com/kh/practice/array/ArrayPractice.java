package com.kh.practice.array;

import java.util.Scanner;
import java.util.Random;

public class ArrayPractice {
	
	public static Scanner sc = new Scanner (System.in);
	
	public static void practice1() {
		int[] arr = new int[10];
		int num =1;
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = num;
			num += 1;
		}
		for (int i = 0; i< arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void practice2() {
		int[] arr = new int[10];
		int num = 10;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
		num--;
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void practice3() {
		
		int arrSize;
		while(true) {
		System.out.print("양의 정수 : ");
		arrSize = sc.nextInt();
		if(arrSize > 0) {
			break;
		}
		}
	
		int[] arrVar = new int[arrSize];
		// 배열에 1 ~ 사용자 입력 값까지 초기화.	
	
		for(int i = 0; i < arrVar.length;i++) {
			arrVar[i] = i + 1;}
			// 출력
			for(int i = 0; i < arrVar.length;i++) {
				System.out.print(arrVar[i]+" ");
			}
			
		}
	public static void practice4() {
		
		String[] arrVar = {"사과", "귤", "포도", "복숭아","참외"};
		
		for(int i = 0; i<arrVar.length; i++) {
			if("귤".equals(arrVar[i])) {
				System.out.println("위치값 -> "+i+"\t문자열 ->"+arrVar[i]);
			}
		}
		System.out.println(arrVar[1]);
	}
	
	public static void practice5() {
		String word;
		char ch;
		char[] chArr;
		int count = 0;
		
		System.out.print("문자열 : ");
		word = sc.next();
		
		System.out.print("문자 : ");
		ch = sc.next().charAt(0);
		
		// 문자열의 길이 만큼 문자배열 생성
		chArr = new char [word.length()];
		// 문자열의 인덱스와 문자배열의 인덱스를 활용하여
		// 문자열의 문자를 문자배열에 복사
		for(int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i]);
		}
		
		System.out.print(word + "에 "+ch +"가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < chArr.length; i++) {
			if (ch == chArr[i]) {
				count++;
				System.out.print(i+" ");
			}
		}
	System.out.println("\n"+ch+"개수 : "+ count);
		
	}
	
	public static void practice6() {
		String[] week = {"월요일","화요일","수요일","목요일","금요일","토요일"};
		int day;
		
		while(true) {
			System.out.print("1 ~ 31 사이 숫자 입력 : ");
			day = sc.nextInt();
			if(day >= 1 && day <=31) {
				break;
			}
			System.out.println("잘못입력 하였습니다.");
		}
		System.out.println(week[day % 7]);
	}
	public static void practice7() {
		int[] arrVar;
		int arrSize, total;
		
		System.out.print("정수 : ");
		arrSize = sc.nextInt();
		
		arrVar = new int [arrSize];
		for(int i = 0; i < arrSize; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 : ");
			arrVar[i] = sc.nextInt();			
		}
		
		total = 0;
		for(int i = 0; i < arrVar.length; i++) {
			System.out.print(arrVar[i]+ " ");
			total = total + arrVar[i];
		}
		System.out.println("\n총 합 : "+ total);
		
	}
	
	public static void practice8() {
		int num1 ;
		int num2[];
				
			while(true) {
				System.out.print("정수 : ");
				num1 = sc.nextInt();
				
				if(num1 >= 3 && (num1 % 2 == 1)) {
					break;
				}
				System.out.println("3이상 홀수값으로 다시 입력하세요.");
						
			}
			num2 = new int[num1];
			int temp=1;
			
			for(int i = 0 ; i < num2.length; i++) {
				num2[i] = temp;
				if(i <num2.length /2) {
					temp++;
				}else {
					temp--;
				}
			}
		
		for(int i = 0; i < num2.length -1; i++) {
			System.out.print(num2[i]+"  ");
		}
		System.out.println(num2[num2.length-1]);
	
		
		
	}
	
	public static void practice8_1() {
		/*
		 * 정수 : 5
		 * 3 2 1 2 3
		 * 
		 * 정수 : 7
		 * 4 3 2 1 2 3 4
		 */
		
		int num1;
		int arr[];
		
		System.out.print("정수 : ");
		num1 = sc.nextInt();
		
		while(true) {
			if(num1 >= 3 && num1 % 2 == 1) {
				break;
			}
			System.out.println("3이상의 홀수값 입력.");
		}
		
		arr = new int[num1];
		int value = arr.length / 2 + 1;
		for(int i = 0; i < num1; i++) {
			arr[i] = value;
			if(i < arr.length / 2) {
				value--;
			} else {
				value++;
			}
		}
		for(int i = 0; i < arr.length -1; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println(arr[arr.length-1]);
	
	}
	
	public static void practice9() {
		String[] chickens = {"후라이드","양념","간장","갈릭","크리스피","파"};
		String search;
		boolean find = false; // 메뉴를 찾은 경우 true로 설정.
		int index = 0;
		
		System.out.print("치킨 이름을 입력하세요 : ");
		search = sc.next();
		
		for(int i = 0; i < chickens.length;i++) {
			if (chickens[i].equals(search)) {
				find = true;
				index = i;
				break;
			}
		}
		if (find) {
			System.out.println(chickens[index]+" 치킨메뉴가 존재");
		}else {System.out.println(search + " 치킨은 없는 메뉴 입니다. ");
			
		}
	}
	
	public static void practice9_1() {
		/*
		 *	치킨	메뉴	배열과 동일한 크기의 치킨메뉴의 가격을 저장하는 배열을 생성하고
		 * 사용자가 입력한 문자열이 치킨 메뉴 배열에 존재하는지 검색 후
		 * 존재하면,"XXX" 치킨 가격은 XXXX 원 입니다." 없으면
		 * "XXX" 치킨은 없는 메뉴 입니다. 출력.
		 */
		String[] chickens = {"후라이드","양념","간장","갈릭","크리스피","파"};
		int[] chickensAmount = {10000,11000,12000,13000,9000,5000};
		String search;
		boolean find = false; // 메뉴를 찾은 경우 true로 설정.
		int index = 0;
		
		System.out.print("치킨 이름을 입력하세요 : ");
		search = sc.next();
		
		for(int i = 0; i < chickens.length;i++) {
			if (chickens[i].equals(search)) {
				find = true;
				index = i;
			    break;
		}
		}
		if (find) {
			System.out.println(chickens[index]+" 치킨메뉴가 존재 합니다. "+ "가격은 "+(chickensAmount[index])+" 원 입니다.");
		}else {System.out.println(search + " 치킨은 없는 메뉴 입니다. ");
			
		}
		
	}
	
	public static void practice10() {
		/*
		 * 주민등록번호를 입력받고 성별자리 이후부터는 *로 가려서 출력
		 * 원본은 유지하면서 복사본에만 *로 가려서 저장 후 출력
		 */
		
		String idNum = "";
		char[] idNumArr, copArr;
		
		System.out.print("주민등록번호(-포함) : ");
		idNum = sc.next();
		
		if(idNum.length() == 14 && idNum.charAt(6)== '-');
		
		//배열사이즈
		idNumArr = new char[idNum.length()];
		copArr = new char[idNum.length()];
		
		// 입력 주민번호 배열로 만들기
		for (int i = 0; i < idNum.length(); i++) {
			idNumArr[i] = idNum.charAt(i);
		}
		System.arraycopy(idNumArr, 0, copArr, 0, 8);
		for(int i = 8; i < idNumArr.length; i++) {
			copArr[i] = '*';
		}
		// 복사된 배열 출력
		for(int i = 0; i < copArr.length; i++) {
			System.out.print(copArr[i]);
		}
	}
	
	public static void practice12() {
		
		Random rand = new Random();
		int[] randArr = new int[10];
		
		for(int i = 0; i < randArr.length; i++) {
			randArr[i] = rand.nextInt(10) + 1;
		}
		
		for(int i = 0; i < randArr.length; i++) {
			System.out.print(randArr[i]+" ");
		}
		
		// 최대값, 최소값
		int max = randArr[0], min = randArr[0];
		for(int i = 1; i < randArr.length; i++) {
			if(randArr[i] > max) {
				max = randArr[i];
			}
			if(randArr[i] < min) {
				min = randArr[i];
			}
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
	}
	
	public static void practice13() {
		Random rand = new Random();
		int[] randArr = new int[10];
		int temp;
		boolean dup = false;
		
		randArr[0] = rand.nextInt(10) +1;
		for(int i = 1; i < randArr.length;i++) {
			dup = false;
			temp = rand.nextInt(10) + 1;
			for(int j = 0; j < i; j++) {
				if(randArr[j] == temp) {
					dup = true;	
					break;
				}
			}
			if(!dup) {
				randArr[i] = temp;
				i++;
			}
		}
		for(int i = 0; i< randArr.length; i++) {
			System.out.print(randArr[i]+" ");
		}
		
	}
	
	public static void practice14() {
		Random rand = new Random();
		int num = rand.nextInt(45) + 1;
		boolean dup = false; // 중복값이 있는지 확인하기 위한 플래
		
		System.out.print("정렬전 -> ");
		int[] lotto = new int[6];
		int temp ;
		for(int i = 1; i <= 6;) {
			temp = rand.nextInt(45) +1 ;
			System.out.print(temp+" ");
			for (int j = 0; j < i-1; j++){
				if(temp == lotto[j]) {
					dup = true;
					break;
				}
			}
			if(!dup) {
			lotto[i-1] = temp;
			i++;
			}
			dup = false; // 중복 검사가 끝난 후 다시 초기화.
		} 
		
		int min,minIdx;
		for(int i = 0; i<6;i++) {
			min = lotto[i]; minIdx = i;
			for(int j = i; j < 6; j++) {
				if(min > lotto[j]) {
					min = lotto[j];minIdx = j;
				}
			}
			if(i != minIdx) {
				temp = lotto[i];
				lotto[i] = lotto[minIdx];
				lotto[minIdx] = temp;
			}
			}
		System.out.print("\n정렬후 -> ");
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i]+" ");
		}
		}
	public static void practice15() {
		/*
		 * 1. 문자열을 입력받아 문자 배열에 저장
		 * 2. 문자 배열에는 중복되는 문자 없이 저장
		 * 3. 중복 없이 저장된 문자와 문자배열의 크기를 출
		 */
		String input;
		char[] orgCharArray, copCharArray;
		
		System.out.print("문자열 : ");
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
			if (!dup) {
				copCharArray[copIdx] = orgCharArray[i];
				copIdx++;
			}
			dup = false;
		}
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < copCharArray.length; i++) {
			System.out.print(copCharArray[i]+" ");
		}
		System.out.print("\n문자 개수 : " + copIdx);
	}
	
	public static void practice16() {
		
		String[] proList , tempList;
		int arrSize, addSize;
		String yesno;
		
		System.out.print("배열의 크기를 입력하세요 :");
		arrSize = sc.nextInt(); sc.nextLine();
		
		proList = new String[arrSize];
		
		for(int i = 0; i < arrSize; i++) {
			System.out.print(i + 1 + " 번째 문자열  : ");
			proList[i] = sc.nextLine();
		}
	
	while(true) {
		while(true) {
		
		System.out.print("더 값을 입력하겠습니까? (Y/N) : ");
		yesno = sc.next();		sc.nextLine(); // 개행문자 처리를 위해 사용
		if(yesno.equals("Y") || yesno.equals("y") || 
				yesno.equals("N") || yesno.equals("n")) {
			break;
			}
			System.out.println("대답은 y 또는 n 으로만 하세요.");
		}
		
		if(yesno == "n" || yesno == "N") {
			break;
		}
		
		System.out.print("더 입력할 개수 : ");
		addSize = sc.nextInt();		sc.nextLine();
		tempList = new String[proList.length + addSize];
		
		
		for(int i = 0;i < proList.length;i++) {
			if(i < proList.length) {
				tempList[i]	= proList[i];
			}else {
				System.out.print(i + 1 + " 번째 문자열 : ");
				tempList[i] = sc.nextLine();
			}
			
		}
		proList = new String[tempList.length];
		System.arraycopy(tempList, 0, proList, 0, tempList.length);
		
	}
	}
	

	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
		//practice8_1();
		//practice9();
		//practice9_1();
		//practice10();
	//	practice10_1();
		//practice11();
		//practice12();
		//practice13();
		//practice14();
		practice15();
		//practice16();
	}

}
