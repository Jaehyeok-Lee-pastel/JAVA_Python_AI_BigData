package ch10;



public class Code10_04 {

	static int plus_method(int v1, int v2) {
		int result = 0;
		result = v1 + v2;
		return result;
	}
	
	public static void main(String[] args) {
		//객체를 생성 후 두 수를 더하는 메소드를 만들어 프로그램을 완성하시오
		int sum = 0;
		sum = plus_method(10, 20);
		System.out.println(sum);
	}

}
