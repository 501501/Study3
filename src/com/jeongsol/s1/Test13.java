package com.jeongsol.s1;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		System.out.println("Test13 Start");
		
		// 요금조회는 1번
		// 상품가입은 2번
		// 고장신고는 3번
		// 상담원연결 0번
		// 잘못 누름 다시 선택
		
		System.out.println("요금조회: 1번, 상품가입: 2번, 고장신고: 3번, 상담원연결: 0번");
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("요금 조회 선택");
			break;
		case 2: 
			System.out.println("상품 가입 선택");
			break;
		case 3:
			System.out.println("고장 신고 선택");
			break;
		case 0:
			System.out.println("상담원 연결 선택");
			break;
		default:
			System.out.println("잘못 선택");
		}
		
		System.out.println(select);
		
		System.out.println("Test13 Finish");
	}

}