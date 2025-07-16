package ch10;


class Example7 {
	// 큰 수 구하기 : 메소드 -> 파라미터 2개의 수를 입력받아서 if 비교 한 후 큰 수를 반환
	
	public int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}
	
	
}

public class MethodEx7 {

	public static void main(String[] args) {
		// 두 개의 수 중에서 큰 수를 출력하시오.
		Example7 ex = new Example7();
		int max_num = ex.max(200, 20);
		System.out.println("두 수 중 큰 수는 "+ max_num +"입니다.");
		
	}

}
