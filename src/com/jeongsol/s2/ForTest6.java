package com.jeongsol.s2;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String[] args) {
		System.out.println("Test6 Start");
		// 회원가입시 입력한 ID
		int id = 1234;
		// 회원가입시 입력한 PW
		int pw = 5678;
		
		// 최대 5번의 기회
		// 1. 최대 5번 로그인 시도
		Scanner sc = new Scanner(System.in);
		int mId = 0, mPw = 0;
		boolean flag = false;
		
		for (int i=0;i<5;i++) {
			System.out.println("ID를 입력하세요");
			mId = sc.nextInt();
			System.out.println("PW를 입력하세요");
			mPw = sc.nextInt();
			
			if (id==mId && pw==mPw) {
				flag = !flag;
				break;
			}
			System.out.println(i+1+"번째 로그인 실패");
		} //for 끝
		
		// 2. for 종료 조건 로그인 성공과 5번 모두 실패
		if (flag) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패 은행에 방문");
		}
		
		System.out.println("Test6 Finish");
	}
}
