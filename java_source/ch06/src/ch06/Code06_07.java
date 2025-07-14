package ch06;

public class Code06_07 {

	public static void main(String[] args) {
		// 1~1000까지의 정수를 모두 더하는 프로그램을 완성하시오.
		// 결과는 최종합 하번만 출력해라
		// 출력예시 "1부터 1000까지의 합계 : 500500
		
//		int sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 1000까지의 합계 : " + sum);
		
		// 1000 ~ 2000까지 짝수의 합을 구하시오.
		
		int sum = 0;
		for (int i = 1002; i<= 2000; i += 2) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
	}

}
