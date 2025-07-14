package ch06;

public class Code06_02 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println("난생처음 자바" + (i+1));
		}

		
		// 1~100 사이의 짝수만 출력
		
		for (int i = 2; i < 101; i += 2) {
			System.out.println(i);
		}
		
		// 1 ~ 10 값의 합(누적)을 구하시오.
		
		
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1) + ": 난생처음 자바는 재미있습니다.");
		}
		
		
		
	}

}
