package ch06;

public class Code06_04 {

	public static void main(String[] args) {
//		// 1 ~ 10 정수를 출력하시오
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print((i+1 + " ") );
//		}
//		
//		// 1, 3, 5, 7, 9를 출력하시오.
//		
//		for (int i = 1; i < 10; i += 2) {
//			System.out.print(i + ", ");
//		}
		
		
		// 학생 수를 변수로 저장한 후 반복문을 이용해서 출력하시오
		// 출력 : 학번-1, 학번-2, 학번-3
		
		int std = 10;
		
		for (int i = 1; i <= std; i++) {
			System.out.println("학번-"+ i + ", ");
		}
		
		
		// 5 10 15 20 25 30
		// for 문을 이용해서 위와 같이 출력되도록 하시오.
		
//		for (int i = 5; i < 31; i += 5) {
//			System.out.print(i + " ");
//		}
		
		// 10 9 8 7 ~ 1 거꾸로 출력하시오
		
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}

	}

}
