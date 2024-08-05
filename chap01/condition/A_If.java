package com.kh.chap01.condition;

import java.util.Scanner;

// 단독 if문
public class A_If {
	
	/*
	 * * 단독 if문
	 * 단 하나의 선택적인 경우를 나타낼 때 쓰는 구문
	 * 
	 * [ 표현법 ] 
	 * 
	 * if(조건식) {
	 * 		
	 * 		조건식이 true 일 경우 실행할 코드;
	 * 
	 *}
	 * > 조건식의 결과가 참 (true) 일 경우 중괄호 블록 안의 코드가 실행
	 * > 조건식의 결과가 거짓 (false) 일 경우 중괄호 블록 안의 코드를
	 *   무시하고 다음 코드로 넘어감
	 *   
	 */
	
	// 기존 삼항연산자 문제 --> 단독 if문 버전
	
	
	public void method1() { //method1 영역 시작 
		
		// 사용자가에게 정수값을 입력받은 후
		// 양수인지, 0인지, 음수인지 판별 후 결과 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 삼항연산자를 이용한 경우
		//String result = (num > 0) ? ("양수입니다.") : ((num == 0 )?("0입니다."):("음수입니다."));
		
		// 단독 if문을 이용한 경우		
		// > 표현해야하는 경우의 수가 3개이므로 단독 if문도 3개를 적는다.
		// 첫번째 경우의수 : 양수일경우
		if(num > 0) {
			System.out.println("양수입니다.");
		}
		
		// 두번째 경우의수 : 0일경우 (num == 0)
		if(num == 0 ) {
			System.out.println("0입니다.");
		}
		
		// 세번째 경우의수 : 음수일경우 (num < 0)
		if(num < 0) {
			System.out.println("음수 입니다.");			
		} 
		
		
		
	}//method1 영역 끝
	public void method2() {//method2 영역 시작
		
		//사용자가 입력한 정수값이 짝수인지 홀수인지
		// 판별 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 짝수일 경우 "짝수입니다."
		// 홀수일 경우 "홀수입니다."
		
		// 삼항연산자 버전
		// String result = (num % 2 == 0 )?("짝수입니다."):("홀수입니다.");
		
		
		// 단독 if문 버전
		// 경우의 수가 2 개 이므로 단독 if문도 2개가 필요함
		
		
		// 첫번째 경우의 수 : 짝수일 경우
		if(num % 2 ==0) {
			System.out.println("짝수입니다.");
		}
		// 두번째 경우의 수 : 홀수일 경우
		if(num % 2 ==1) {
			System.out.println("홀수입니다.");
			
		}
		
	}//method2 영역 끝
	public void method3() {//method3 영역 시작
		
		// 사용자가 입력한 나이값을 가지고
		// 어린이, 청소년, 성인인지 판별 후 출력
		// 어린이 (13세 이하) / 청소년 (13세 초과~ 19세 이하)
		// 성인 ( 19세 ) 초과
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		// 어린이일 경우 "어린이입니다."
		// 청소년일 경우 "청소년입니다."
		// 어른일 경우 "어른입니다."
		
		// 삼항연사자 버전
		//String result = (age <= 13) ? ("어린이입니다.") : ((( 13 < age) && (age < 19)) ? ("청소년입니다.") :("어른입니다."));
		//System.out.println(result);
		// 단독 if문 버전
		// > 표현할 경우의 수가 3개이기 때문에 단독 if문도 3개 작성
		// 첫번째일 경우 : 어린이일 경우
		// 두번째일 경우 : 청소년일 경우
		// 세번째일 경우 : 어른일 경우
		
		if(age <= 13) {
			System.out.println("어린이입니다.");
		}
		if(13<age && age <19) {
			System.out.println("청소년입니다.");
		}
		if(19 < age) {
			System.out.println("어른입니다.");
		}
		
	}//method3 메소드 영역 끝
	
	public void method4() {//method4 메소드 영역 시작
		// 사용자에게 입력받은 주민번호를 가지고
		// 남자인지 여자인지 판별 후 결과를 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		//1. 사용자에게 주민등록번호를 입력받기
		// 주민번호 : 800120-1547789
		// > 아무리 숫자로만 이루어져 있어도
		//   평소에 주민번호로 산술연산 같은 것을 할 일이 없기 때문에
		//   문자열로 취급하는 것이 더 바람직함 (전화번호도 마찬가지)
		System.out.print("주민번호를 입력 (- 포함) : ");
		String personId = sc.nextLine();
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는
		//    문자 (7번째 인덱스의 문자) 를 추출해서 변수에 담기
		char gender = personId.charAt(7);
		// > gender 에는 '1' 또는 '2' 또는 '3' 또는 '4'
		// 가 담겨있음
		
		// 3. 성별에 해당하는 문자가 '1' 또는 '3' 일 경우 : 남자
		// 						'2' 또는 '4' 일 경우 : 여자
		// 로 판별하기
		
		// 단독 if문 버전
		
		// 첫번째 경우의 수 : 남자일 경우
		// > 문자로써의 '1' 또는 '3' 과 일치하는지를 비교!!
		if((gender == '1') || (gender == '3')) {
			System.out.println("남자입니다.");
			
			
		}
		// 두번째 경우의 수 : 여자일 경우
		// ((gender == '2') || (gender == '4'))
		if((gender == '2') || (gender == '4')) {
			System.out.println("여자입니다.");
		}
		
		
		// 세번째 경우의 수 : 잘못된 주민번호 뒷자리를 입력했을 경우
		// > gender 가 '1' 도 아니고 '2' 도 아니고
		//   '3' 도 아니고 '4' 도 아닐 경우
		if((gender !='1') && (gender !='2') && (gender !='3') && (gender !='4')){
			System.out.println("잘못된 주민번호를 입력하셧습니다.");
		}
	}//method4 메소드 영역 끝
	public void method5() {//method5 메소드 영역 시작
		
		// 사용자로부터 입력한 정수값이
		// "양수이면서" 짝수인지 또는 "양수이면서" 홀수인지 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		// 단독 fi문 버전
		// > 경우의 수가 2개 이므로 단독 if문도 2개 작성
		
		// 첫번째 경우의 수 : 양수이면서 짝수인경우
		// (num > 0) && (num % 2 == 0) 
		/*if((num > 0) && (num % 2 == 0)) {
			System.out.println("양수이면서 짝수입니다.");
		}
		
		
		// 두번째 경우의 수 : 양수이면서 홀수인경우
		
		
		if((num > 0) && (num % 2 == 1)) {
			System.out.println("양수이면서 홀수입니다.");
		}*/
		// String result = (num < 0)?("음수 입니다."):((num % 2 == 1 )?("양수이면서 짝수입니다."):("양수이면서 홀수입니다."));
		// 내가만든 삼단형
		
		// 첫번째, 두번째 경우의 수 모두 짝수인지 홀수인지
		// 검사하기 전에 우선적으로 양수인지를 먼저 체크하고 있음
		// > 중첩 if문을 이용할 수도 있다.
		
		// 우선 양수인지를 먼저 체크
		if(num > 0) {
			
			// 코드의 흐름이 이 시점까지 도달했다라는 것은
			// 곧 num이 "양수"라는 뜻
			// 이 안에서 짝수인지 홀수인지만 다시 판별하면 됨
			if(num % 2 ==0) {
				System.out.println("양수이면서 짝수입니다.");
				
			}
			
			if(num % 2 == 1) {// 홀수일 경우
				
				System.out.println("양수이면서 홀수입니다.");
			}
			
			
		}
		// > 삼항연산자 처럼 if문 안에 if문을 작성할 수 있다.
		// (중첩if문) 
		
		
	}//method5 메소드 영역 끝
	
}
