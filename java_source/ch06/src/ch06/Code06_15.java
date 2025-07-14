package ch06;

public class Code06_15 {

	public static void main(String[] args) {
		// 1 ~ 100 까지 정수의 합을 구하시오.
		// 4의 배수는 생략한 후 합계를 구하시오
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%4 == 0) continue;
			
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
