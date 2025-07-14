package ch03;

public class Code03_02 {

	public static void main(String[] args) {
		// 변수 선언 : 타입이 똑같은 변수 3개를 선언
		int n1, n2, res; // 변수는 기본적으로 덮어 쓰기
		
		// 초기화
		n1 = 5;
		n2 = 3;
		// 더하기
		res = n1 + n2;
		// 빼기
		res = n1 - n2; // 덮어쓰기, 메모리 재사용
		
	}

}
