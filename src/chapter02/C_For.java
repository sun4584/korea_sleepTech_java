package chapter02;

// === 반복문(Loop) === //
// : 특정 조건 만족 시 까지 동일한 작업 반복!
// -for, while, do while

public class C_For {
	public static void main(String[] args) {
		/*
		 for문 
		 : 특정 조건이 만족될 때까지 코드 블럭을 반복 실행
		 >> 횟수를 저장(횟수가 정해져 있을때)
		 
		 for (초기화; 조건; 증감) {
		 	조건이 만족될 떄까지 실행할 코드 블록
		 }
		 	
	 	1. 초기화(Initialization)
	 	: 반복을 시작할 때 사용할 변수를 초기화하는 부분(반복에 사용할 변수)
	 	2. 조건(Condition)
	 	: 반복이 실행될 조건을 정의하는 부분 (해당 조건이 참인 동안 반복문이 실행)
	 	3. 증감(Increment/Decrement)
	 	: 반복문의 각 실행이 끝나고 난 후 변수의 값을 증감하는 부분(매 반복 시 실행)
		 */
		for(int num = 1; num <= 5; num++) {
			System.out.print(num);
		}
		//12345
		System.out.println();
		// == 예제 ==//
		// : for 반복문을 사용하여 1부터 10까지의 숫자 중에서 짝수만 출력
		for(int i = 1; i <=10; i++) {
			if(i % 2 == 0) {
				//조건식을 통해 짝수만 출력
				System.out.print(i);				
			}
		}
		// == 구구단 예제 == //
		System.out.println();
		System.out.println("=== 3단 ===");
		int num = 3;
		// 3 X 1 = 3 ...
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + "X" + i + "=" + num * i);
		}
		
		// cf) for 문의 횟수 지정 방법
		// 초기화를 0으로 설정
		// : int i = 0; i < N; 
		// >> N번 반복
		
		//초기화를 1로 설정
		// : int i = 1; i <=N;
		// >> N번 반복
		
		// cf) 중첩 for문(반복문)
		// : for문 내에 또 다른 for문 작성
 		
		// == 예제 == //
		// : 구구단 전체를 출력하는 코드
		// > 2단 ~ 9단 까지 반복
		// > 각 단의 내부에서는 1 ~ 9까지 숫자 반복 ( 9번 반복)
		
		for(int i = 0; i < 8; i++) {
			// for문의 초기화식
			int dan = i + 2; //2단부터 9단까지 반복
			System.out.println("[" + dan + "단]");
			for(int j = 0; j < 9; j++) {
				int number = j + 1; // 1부터 9까지 반복
				System.out.println(dan + "X" + number + "=" + dan * number);
				System.out.println();
				
			}
		}
//	for(int x = 0; x < 8; x++) {
//		System.out.println("[ " + x + "단]");
//		for(int a = 2; a <= 9; a++) {
//			for(int b = 1; b <= 9; b++) {
//				System.out.println(a + "X" + b + "=" + a * b );
//			}
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
