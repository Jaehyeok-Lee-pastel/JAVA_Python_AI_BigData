package ch10;


class Calcul {
	
	public int plus(int a, int b) {
		return a + b; 
	}
	
	public int plus(int a, int b, int c) {
		return a + b + c;
	}
}	
	// 오버라이딩 : 고쳐서 사용
	// 오버로딩 : 타입이 다르거나 매개변수 개수가 다르면 동일이름 = 메소드 오버로딩


public class MethodEx3 {

	public static void main(String[] args) {
		
		// 메소드 오버로딩
		// 하나의 이름으로 여러 동작을 처리
		// 타입이 다르거나 매개변수(파라미터, 인수)를 다르게
		Calcul c = new Calcul();
		// 2개의 수
		System.out.println(c.plus(5, 5));
		
		// 3개의 수
		System.out.println(c.plus(5, 5, 15));
		
	}

}
