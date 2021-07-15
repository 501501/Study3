package com.jeongsol.s2;

public class ForTest4 {

	public static void main(String[] args) {
		System.out.println("ForTest4 Start");
		
		// 1+2+3+.....+100000000
		// 1+2+3+4+5=15
		
		int hap = 0;
		for (int i=1;i<6;i++) {
			hap = hap+i;
		}
		System.out.println(hap);
		System.out.println("ForTest4 Finish");
	}

}
