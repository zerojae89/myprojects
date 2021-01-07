package com.kh.exam2;

import java.util.StringTokenizer;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * StringBuilder의 replace 메서드 활
		 * 		- StringBuilder의 replace는 지정된 범위에서 문자열을 변경하는 메서드로 동작한다. 
		 * 		- String의  replace는 target으로 지정한 문자열을 replacement로 지정만 문자열로 전부 변경한다.
		 * 
		 * 위의 차이를 확인하고 StringBuilder의 replace도 String의 replace 처럼 동작할 수 있도록 반복문을
		 * 활용하여 문자열 변경이 될 수 있도록 한다. 
		 * 
		 */
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("First Builder Builder");
		System.out.println(sb1);
		
		/*
		 * 1. target 문자열을 설정한다. 
		 * 2. replacement 문자열을 설정한다. 
		 * 3. garget 문자열의 위치를 찾는다. 
		 * 4. target 문자열의위치부터 문자열 길이만큼 replacement로 변경한다. 
		 * 5. replacement로 변경한 위치 이후 부터 다시 target 문자열의 위치를 찾는다.
		 * 6. 3~5번의 과정을 계속 반복하며, indexOf의 결과가 -1이 나오면 종료한다. 
		 */
		
		String target = "Builder";
		String replacement = "Stringbuilder";
		
		int startIdx = sb1.indexOf(target);
		while(startIdx != -1) {
			sb1.replace(startIdx,  startIdx+target.length(),replacement);
			startIdx = sb1.indexOf(target,startIdx+replacement.length());
		}
		
		System.out.println(sb1);
		 
		 
		 // 문자열의 18번 인덱스 위치에서 찾기
		
		// StringTokenizer
		// 		- 문자열을 구분문자열로 분리하는 기능을 가진 클래스
		StringTokenizer st= new StringTokenizer("My StringBulder First Builder new String", " ");
		while(st.hasMoreTokens()) {
			System.out.println("st.nextToken() ->" + st.nextToken());
		}
		
		st = new StringTokenizer("2021-01-07", "-");
		while(st.hasMoreTokens()) {
			System.out.println("st.nextToken()->" + st.nextToken());
		}
		

	}

}
