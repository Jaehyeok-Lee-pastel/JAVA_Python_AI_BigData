package ch10;


class Calculator {
	public int add(int x, int y) {
		int res = x + y;
		return res;
		}
	
	public int minus(int x, int y) {
		int res = x - y;
		return res;
		}
	
	public int mul(int x, int y) {
		int res = x * y;
		return res;
		}
}



public class MethodEx2 {
	
	public static void main(String[] args) {
		// 방의 이름은 Calculator
		// 메소드를 만들어 사칙연산 프로그램을 만드시오.
		// 출력결과
		
		// --- 사칙연산 프로그램 ----

		Calculator calc = new Calculator();
		System.out.println(calc.add(3, 7));
		System.out.println(calc.minus(13, 3));
		System.out.println(calc.mul(2, 5));
	}

}
