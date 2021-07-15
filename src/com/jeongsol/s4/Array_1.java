package com.jeongsol.s4;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 11, 20, 32 
		// 데이터타입 변수명
		int num1 = 11;
		int num2 = 20;
		num2 = 30;
		
		// 모으려고하는 데이터타입 [] 변수명 = new 모으려고하는 데이터타입[개수];
		int [] numbers = new int[3];
		// numbers 데이터타입은???
		System.out.println(numbers);
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[2]);

		System.out.println("배열의 크기 : "+numbers.length);
		
		// 3.12, 2.3, 4.123, 5.0 배열 선언하고 데이터 대입
		double [] n2 = new double[4];
		n2[0] = 3.12;
		System.out.println(n2[0]);
		System.out.println(n2[1]);
		n2[1] = 2.3;
		n2[2] = 4.123;
		n2[3] = 5.0;
		
		// 문자열을 담을 배열 3칸짜리 생성
		// 모두 출력
		String[] names = new String[3];
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		// 스캐너를 담을 배열 2칸짜리 생성
		// 모두 출력
		Scanner [] sc = new Scanner[2];
		System.out.println(sc[0]);
		System.out.println(sc[1]);
	}

}
