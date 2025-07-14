package ch05;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
//		switch(조건) ~ case (if) ~ default(else)
		// 조건에는 정수 타입과 문자(열)만 가능
		// 조건에 등호, 부등호 사용할수 없음
		
		
		// 1 -> 가위, 2 -> 바위, 3 -> 보 그 외는 "잘못입력" 출력하는 분기문
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3,4,5를 입력하면 봄, 6,7,8을 입력하면 여름 \n9,10,11을 입력하면 가을, 12,1,2를 입력하면 겨울이 출력됩니다.");
		
		int num = sc.nextInt();
		
//		switch(num) {
//			case 1:
//				System.out.println("가위를 선택 했습니다.");
//				break; // 현재 조건만 실행하고 switch 구문을 벗어남, 없을경우 모든 케이스의 코드들을 실행함.
//				
//			case 2:
//				System.out.println("바위를 선택 했습니다.");
//				break;
//				
//			case 3:
//				System.out.println("보를 선택 했습니다.");
//				break;
//				
//			default:
//				System.out.println("잘못 입력하셨습니다.");
//				break;
//		}
			
		// 1,3 홀수, 2, 4 짝수
		
//		switch(num) {
//			case 1:
//			case 3:
//				System.out.println("홀수 입니다.");
//				break;
//				
//			case 2:
//			case 4:
//				System.out.println("짝수 입니다.");
//				break;
//				
//			default:
//				System.out.println("잘못 입력하셨습니다.");
//		}
		
		
		switch(num) {
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("여름");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.println("가을");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.println("겨울");
				break;
				
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
		
		
		sc.close();
		
		

	}

}
