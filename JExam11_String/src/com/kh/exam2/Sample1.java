package com.kh.exam2;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("First StringBuilder");
		System.out.println(sb1);
		
		sb1.insert(0,"My");
		System.out.println(sb1);
		
		sb1.insert(2, " ");
		System.out.println(sb1);
		
		String find = "String";	
		int startIdx = sb1.indexOf(find);
		System.out.println("sb.indexOf(find)->" + startIdx);
		sb1.delete(startIdx, startIdx+find.length());
		System.out.println(sb1);
		
		
		find = "Builder";
		startIdx = sb1.indexOf(find);
		sb1.replace(0, sb1.length(), "StringBuilder");
		System.out.println(sb1);
	}

}
