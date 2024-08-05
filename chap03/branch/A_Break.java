package com.kh.chap3.branch;

import java.util.Random;
import java.util.Scanner;

public class A_Break {
	
	
	/*
	 * * break문
	 * break문을 만나는 순간 "가장 가까운 반복문" 을
	 * 단 한겹 빠져나가는 역할
	 * 즉, 해당 break문이 속해이는 반복문 한겹만 빠져나감
	 * [ 표현법 ]
	 * 
	 * for / while() { // 반복문
	 * 
	 * 
	 * 		반복적으로 실행할 구문 ~~~;
	 * 
	 * 		break; // 해당 반복문을 바로 빠져나감
	 * 			   // 반복 횟수가 몇번이 남아있든 간에
	 * }
	 * 
	 * * 주의할점
	 * switch문 안의 break 와는 다른 개념임!!
	 * switch문 안의 break; 는 해당 switch문을 빠져나가는 역할
	 * 오늘 배우는 break; 는 해당 반복문을 빠져나가는 역할
	 * > 구문은 똑같이 생겻지만, 결국 근본적인 역할 자체가 다르기 때문에
	 *   애초에 개념 자체가 다른 구문이다.
	 * 
	 * 
	 */
	public void method1() {
		
		// 매번 반복적으로 새로이 발생되는 랜덤값 (1 ~  100) 출력
		// 단, 그 발생된 랜덤값이 "홀수" 일 경우 반복문을 멈추기
		
		
		
		// > "매번" : 계속 진행하겠다 (즉, 무한 반복을 돌리겠다)
		// for(;;)
		while(true) {
			
			int random = 
					(int/*소숫점 잘라주기*/)(Math.random() * 100/*몇개의 랜덤수*/ + /*시작수*/1);
			
			// 발생된 random 이 홀수일 경우
			// > 해당 random 값을 출력하고
			// "프로그램을 종료합니다" 까지 출력 후 멈추기
			
			
			// 발생된 random 이 짝수일 경우
			// > 해당 random 값을 출력
			
				System.out.println("random : " + random);
			if(random %2 ==1) { // random 이 홀수일 경우

				System.out.println("프로그램을 종료합니다.");
				
				break; // while(true) 를 빠져나감
				// 가장 가까운 반복문을 빠져나감 여긴 if문 
				

			}
			
			
			
			
			
		}
	}// method1 메소드 영역 끝
	
	public void method2() {
		
		//매번 사용자게에 문자열을 입력받은 후
		// 해당 문자열의 길이를 출력
		// 단, 사용자가  입력한 문자열이 "exit" 와 일치하는 경우
		// 반복을 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력 : ");
			
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// "xxxx의 글자수(길이): xx"
			System.out.printf("%s의 글자수(길이) : %d\n",str ,str.length());
			
			
			
		}
		
	} // method2 메소드 영역 끝
	public void method3() {
		
		// 매번 반복적으로 사용자에게 양수를 입력받아
		// 1 ~ 사용자가 입력한 수까지 출력
		// 단, 정확하게 양수를 입력했을 경우에는 반복문을 빠져나가게끔
		// 
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("양수 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			// 우선 양수인지 먼저 검사
			
			if(num > 0) { // 양수일 경우
				
				// 시작수 1, 끝수 num 포함, 1씩 증가
				for(int i = 1; i <= num; i++) {
					System.out.print(i +" ");
				}
				System.out.println();// 줄바꿈
				break; // while(true) 빠져나감
				
			}else { // 양수가 아닐 경우
				System.out.println("잘못 입력하셧습니다. 다시 입력해주세요");
			} // while(true) 영역 끝
			
			// > break문을 무한 반복문 안에서
			//   특정 조건과 결합하여 해당 반복문의 종료시점을 나타낼 때 주로 쓰임
		}// method 3 메소드 영역 끝
		
		
	}// method 3 메소드 영역 끝
	// break문 사용 시 주의사항
	public void method4() {
		
		int num = 1;
		
		while(true) {
			
			System.out.println("안녕하세요?");
			if(num == 1) {
				//break; // 해당 반복만 한겹 빠져나감
				return;  // method4 를 빠져나감 (태초마을로 돌아감)
			}
		}
		
		//System.out.println("프로그램이 종료됩니다.");
		// > Unreachable code
		// "도달할 수 없는"코드
		// > 무한 반복 코드를 작성할 때
		// break문이 없을 경우
		// 프로그램의 흐름이 절대 도달할 수 없음!!
		
	}
	
}
