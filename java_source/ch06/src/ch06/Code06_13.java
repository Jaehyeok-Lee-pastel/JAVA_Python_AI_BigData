package ch06;

public class Code06_13 {

	public static void main(String[] args) {
		// break - 현재 프로그램 빠져나가기 (나를 감싸는 중괄호 빠져나가기)
		// continue - 건너뛰기 
		
		
		// 1 ~ 10까지 출력하시오. for
		
		// i값을 2로 나눈 나머지가 1이면 건너뛰세요.
		
		for (int i = 0; i<10; i++) {
			if (i%2 == 1)
				continue;
			else
				System.out.println(i);
		}

	}

}
