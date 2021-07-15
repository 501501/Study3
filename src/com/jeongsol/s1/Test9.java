package com.jeongsol.s1;

public class Test9 {

	public static void main(String[] args) {
		System.out.println("Test9 Start");
		boolean check = true;
		
		check = !check;
		System.out.println(check);
		
		if (!check) {
			System.out.println("TEst");
		}
		
		System.out.println(check);
		
		int age = 30;
		
		// 조건식 ? true일 때 실행 : false일 때 실행
		String result = age > 19? "성년" : "미성년" ;
		System.out.println("Result : " +result);
		
		System.out.println("1"+1+1); // 111
		System.out.println("1"+1*3); // 13
		System.out.println('1'+"1"); // 11
		// char '1'가 int로 자동형변환 -> 49 (1+49+"1" = 501)
		System.out.println(1+'1'+"1"); // 501
		
		
		System.out.println("Test9 Finish");
	}

}
