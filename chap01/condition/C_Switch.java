package com.kh.chap01.condition;

import java.util.Scanner;

// switch문
public class C_Switch {
	/*
	 * 
	 * * switch문
	 * if문 계열은 대놓고 "조건식" 을 직접 기술하여 선택적인 흐름을
	 * 만들어 내는 조건문이였다면,
	 * 직접 "조건식" 을 기술하지 않고도 선택적인 흐름을 만들어 낼 수
	 * 있는 조건문임
	 * (내부적으로 내가 제시한 값과 동등비교를 수행)
	 * 
	 * 
	 * * switch문과 if문 계열의 차이점
	 * if(조건식) : 조건식 복잡하게도 기술 가능, 범위 제시 가능
	 * switch : 조건식을 제시하지 않음, 내부적으로 조건검사가 일어남
	 * 				(확실한 값의 조건, 즉 "동등비교"가 일어나는 원리)
	 * 
	 * [ 표현법 ]
	 * switch(동등비교를할대상자){
	 * case 값1 :
	 *  	실행할코드1;
	 *  	break;
	 *  case 값2:
	 *  	실행할코드2;
	 *  	break;
	 * ...
	 * 
	 * case 값n : 
	 * 		실행할코드n;
	 * 		break;
	 * 	default : 
	 * 		실행할코드; 
	 * 			위의 값1 ~ 값n 까지 일치하는 값을 찾기 못했을 경우
	 * 			default 구문이 실행됨 (else 블럭 역할과 동일)
	 * 			break;
	 * 			> default : 어차피 switch 블럭의 마지막 부분이기때문에
	 * 				굳이 break;를 쓰지 않는다.
	 * 
	 * 
	 * }	
	 * 
	 */
	public void method1() {// method 1 영역 시작
		// 1 ~ 3 사이의 정수값을 입력받아
		// 1인 경우 "빨간불입니다" 출력
		// 2인 경우 "파란불입니다" 출력
		// 3인 경우 "초록불입니다" 출력
		// 잘못 입력한 경우 "잘못 입력했습니다." 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		/*
		 *
		 * if(num == 1) {// 1을 입력한경우 System.out.println("빨간불입니다."); } else if(num == 2)
		 * 
		 * {// 2을 입력한경우 System.out.println("파란불입니다."); } else if(num == 3) {// 3을 입력한경우
		 * 
		 * System.out.println("초록불입니다."); } else {// 1,2,3 도 아닐경우
		 * 
		 * System.out.println("잘못 입력했습니다."); }
		 */
		
		
		/*
		 * switch (num) { 
		 * case 1: // num == 1 
		 * System.out.println("빨간불입니다."); 
		 * break; case 2:
		 *  // num == 2 
		 *  System.out.println("파란불입니다."); break; 
		 *  case 3: // num == 3
		 * System.out.println("초록불입니다."); break;
		 * 
		 * default: System.out.println("잘못 입력했습니다."); break; }
		 */
		// 판별결과를 담아둘 변수 먼저 셋팅
		String result = "";// String 타입은 기본적으로 빈 문자열로 셋팅함
		
		
		
		
		switch(num){
			case 1 : 
				result = "빨간불";
				break;
			case 2 : 
				result = "파란불";
				break;
			case 3 : 
				result = "초록불";
				break;
				
			default :
				System.out.println("잘못 입력했습니다."); 
				return;
				// > return문은 현재 실행중인 이 메소드 자체를 빠져나가는 역할
				// 이 메소드를 호출했던 태초마을로 흐름이 돌아가는 구문임
		}
		
		// 이 시점에서 판별 결과를 가지고 단 한번 출력문을 작성
		System.out.println(result +" 입니다.");
	} // method 1 영역 끝
	public void method2() {// method2 메소드 영역 시작
		// 사용자에게 구매할 과일명을 입력받아
		// 각 과일마다의 가격을 출력
		// > 사과 (1000원), 바나나(2000원), 복숭아 (5000원)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---- Welcome 과일가게 -----");
		System.out.print("구매할 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		/*
		 * // if 문 계열 버전 if(fruit.equals("사과")) { // "사과" 를 입력한 경우
		 * System.out.println("1000원입니다.");
		 * 
		 * 
		 * }else if(fruit.equals("바나나")){// "바나나" 를 입력한 경우
		 * System.out.println("2000원입니다.");
		 * 
		 * }else if(fruit.equals("복숭아")) {// "복숭아" 를 입력한 경우
		 * System.out.println("5000원입니다.");
		 * 
		 * } else { // 그 이외의 과일을 입력한 경우 System.out.println("저희 가게에서 판매하는 과일이 아닙니다."); }
		 */
		//문자열의 경우 "참조자료형" 이기 때문에
		// == 으로 동등비교를 할 경우 문자열의 내용이 아닌
		// "주소값" 기준으로 동등비교가 일어나게 된다.
		// > 문자열의 "내용물" 을 기준으로 동등비교를 해주는 구문
		// .equals 메소드를 이용해야 해결 가능하다.
		// [ 표현법 ]
		// 문자열.equals("동등비교하고자하는문자열")
		// > 문자열 내용물이 일치한다면 true / 일치하지 않으면 false
		
		// switch문 버전
		switch(fruit) {
		case "사과":
			System.out.println("1000원입니다.");
			break;
		case "바나나":
			System.out.println("2000원입니다.");
			break;
		case "복숭아":
			System.out.println("5000원입니다.");
			break;
		default :
			 System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
			return;
			
		}
		// > switch문은 문자열을 동등비교 대상자로 제시했을 경우
		//   내부적으로 문자열의 내용물을 가지고 알아서 동등비교를 해줌
		// 특이케이스 - break를 생략하는 경우
	}// method2 메소드 영역 끝
	public void method3() { // method3 메소드 영역 시작
		
		// 사용자로부터 키보드로등급을 입력받기
		// 해당 등급별로 권한을 출력하기
		// 1등급 : 관리권한, 쓰기권한, 읽기권한
		// 2등급 : 쓰기권한, 읽기권한
		// 3등급 : 읽기권한
		Scanner sc = new Scanner(System.in);

		System.out.print("등급을 입력하세요 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		switch(grade) {
		case 1 : // grade == 1
			System.out.println("관리권한 부여");
			//System.out.println("읽기권한 부여");
			//System.out.println("쓰기권한 부여");
			//break;
			
		case 2 : // grade == 2
			//System.out.println("읽기권한 부여");
			System.out.println("쓰기권한 부여");
			//break;
		case 3 : // grade == 3
			System.out.println("읽기권한 부여");
			
		}
		// > switch문에서 break를 생략하는 순간
		// 다음 break; 를 만나기 전까지 또는 switch문이
		// 끝날때 까지 계속 아래의 코드가 실행된다.
		
	}// method3 메소드 영역 끝
	
	public void method4() {// method4 메소드 시작
		// 메뉴를 출력해보고, 메뉴 번호를 입력하면 "xx메뉴입니다."출력
		// 종료값을 입려가면 "프로그램이 종료됩니다." 출력
		
		System.out.println("1. 입력"); 
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		// 사용자가 어느 메뉴 번호를 입력했는지 판별 후에
		// 알맞은 메뉴 내용을 출력해야함
		/*
		switch(menu) {
		case 1: // menu == 1
			System.out.println("입력 메뉴입니다.");
			break;

		case 2: // menu == 2
			System.out.println("수정 메뉴입니다.");
			break;

		case 3: // menu == 3
			System.out.println("조회 메뉴입니다.");
			break;

		case 4: // menu == 4
			System.out.println("삭제 메뉴입니다.");
			break;

		case 9: // menu == 9
			System.out.println("프로그램이 종료됩니다.");
			break;
		default: //그 이외의 menu 번호를 입력한 경우
			System.out.println("잘못 입력 하셧습니다.");
			//break; 굳이 안써도 빠져나가는 공간이라 쓰던지 안쓰던지~
		}*/
		// 위의 구문은 지저분하게 출력문이 남발하고 있음
		// > 결과를 담을 변수 같은 것들을 활용하면 코드 줄이기 가능
		
		//결과를 담을 변수 먼저 셋팅
		
		String result = "";
		
		switch (menu) {
		case 1:
			result = "입력";
			break;
		case 2:
			result = "수정";
			break;

		case 3:
			result = "조회";
			break;

		case 4:
			result = "삭제";
			break;

		case 9:
			System.out.println("프로그램이 종료됩니다.");
			return;

			
		default:
			System.out.println("잘못 입력 하셧습니다.");
			return;
			
		}
		// 이 시점 기준으로 result 변수에는
		// 판별 결과가 잘 담겨있음
		System.out.println(result + "메뉴입니다.");
	}// method4 메소드 끝
	public void method5() {
		// 아이디, 비밀번호를 정해두고 로그인 기능을 작성
		// 로그인 성공 시 "로그인 성공"
		// 아이디가 틀렸을 경우 "아이디가 틀렸습니다."
		// 비밀번호가 틀렸을 경우 "비밀번호가 틀렸습니다." 출력
		
		// 아이디 : gahyun
		// 비밀번호 : 1234
		
		//1. 우선 아이디와 비밀번호를 사용자로부터 입력받아야함
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		// 조건문 (if문 계열) 을 통해
		// 사용자가 제대로 된 아이디와 비밀번호를 입력했는지 판별
		
		if(userId.equals("gahyun") && userPwd.equals("1234")) {
			// 첫번째 경우의 수 : 아이디와 비밀번호가 모두 일치할경우
			// >로그인에 성공할 경우
		
			System.out.println("로그인 성공");
			
			
		} else {
			// 두번째 경우의 수 : 아이디와 비밀번호 둘중에 하나라도
			// 					다를경우
			// > 로그인에 실패할경우
			if(!userId.equals("gahyun")) {
				System.out.println("아이디가 틀렸습니다.");
			}
			// 비밀번호가 틀린경우
			if(!userPwd.equals("1234")) {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			
		}
		
	}
	
}
