package com.kh.chap3.run;

import com.kh.chap3.branch.A_Break;
import com.kh.chap3.branch.B_Continue;

public class BranchRun {

	/*
	 * * 분기문
	 * 조건문, 반복문을 제외한 그 이외의 흐름을 
	 * 제어할 때 사용하는 구문
	 * 주로, 반복문을 "보조"해주는 역할로 많이 쓰임
	 * 
	 * [ 종류 ] 
	 * 1. break문 : 반복을 빠져 나가게 해주는 역할
	 * 2. continue문 : 반복문의 다음 증감식 또는 다음 조건식으로 넘어가게 해주는 역할
	 * 3.
	 * 
	 */
	
	public static void main(String[] args) {
		A_Break a = new A_Break();
		//a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		
		B_Continue b = new B_Continue();
		//b.method1();
		//b.method2();
		b.method3();
		
		
		
	}

}
