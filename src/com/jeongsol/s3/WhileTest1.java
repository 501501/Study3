package com.jeongsol.s3;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		// 0-4까지 출력
		for (int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		// while
		// while(조건식){}
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int i=0;
		
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("회원가입 코드 진행");
			case 2:
				System.out.println("로그인 코드 진행");
			default:
				check = !check;
				//check = false;
			}
			
//			if (select==1) {
//				System.out.println("회원가입 코드 진행");
//			} else if (select==2) {
//				System.out.println("로그인 코드 진행");
//			}
//			else {
//				check = !check;
//				break;
//			}
		}
	}

}
