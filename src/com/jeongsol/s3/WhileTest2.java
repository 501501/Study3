package com.jeongsol.s3;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		
		int id = 1234;
		int pw = 5678;
		
		// 1. 로그인
		//	- id, pw 입력
		//	- 로그인 판단
		// 2. 종료
		
		// 로그인이 성공, 로그인 안됐거나
		// 로그인이 성공했으면 게임을 시작
		// rpg 게임
		// 최초 레벨은 1, 만렙 15
		// 최초 gold 0
		// 레벨 5를 달성했을 때 1000 gold 지급
		// 레벨 10을 달성 시 2000 gold 지급
		// 레벨 15를 달성 시 3000 gold 지급
		
		// 모든 몬스터의 경험치는 동일
		// 1 -> 2 : 3
		// 몬스터 1마리 사냥
		// 몬스터 1마리 사냥
		// 몬스터 1마리 사냥
		// 레벨업
		// 2 -> 3 : 6
		// 몬스터 1마리 사냥
		// 몬스터 1마리 사냥
		// 몬스터 1마리 사냥
		// 몬스터 1마리 사냥
		// 몬스터 1마리 사냥
		// 몬스터 1마리 사냥
		// 3 -> 4 : 9
		// 4 -> 5 : 12
		// 5 -> 6 : 15
		// ...
		// 14 -> 15 : 42
		// 최종 레벨 출력
		// 최종 gold 출력
		
		int select = 0;
		int mId = 0, mPw = 0;
		boolean login = false;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 로그인, 2: 종료");
			select = sc.nextInt();
			if (select==2) {
				break;
			}
			while(true) {
				System.out.println("id 입력");
				mId = sc.nextInt();
				System.out.println("pw 입력");
				mPw = sc.nextInt();
				
				if (id==mId && pw==mPw) {
					login = true;
					break;
				}
			} 
			break;
		}
		
		int count = 3;
		int level = 1;
		int gold = 0;
		
		if (login) {
			for (level=1; level<15; level++) {
				System.out.println(level + " -> " +(level+1));
				
				if (level%5==0) {
					gold = gold + (1000 * level/5);
					System.out.println(gold + "gold 지급");
				}
				
				for (int mon=0; mon<count;mon++) {
					System.out.println("몬스터 1마리 사냥");
				}
				count += 3;
			}
		}
		
		System.out.println("최종 레벨 : " + level);
		gold = gold + (1000 * level/5);
		System.out.println("최종 gold : " + gold);
		
		System.out.println("WhileTest2 Finish");
	}
}
