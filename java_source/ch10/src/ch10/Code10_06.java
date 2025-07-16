package ch10;

public class Code10_06 {

	static int sum_06(int v1, int v2) {
		int result;
		result = v1 + v2;
		return result;
	}
	
	static int sum_07(int v1, int v2, int v3) {
		int result = 0;
		result = v1 + v2 + v3;
		return result;
	}
	
	public static void main(String[] args) {
		int sum_2 = 0;
		sum_2 = sum_06(5, 1);
		System.out.print("매개변수 2개 메서드 호출 결과 -> " + sum_2 );
		System.out.print("\n");
		
		int sum_3 = 0;
		sum_3 = sum_07(1,6,12);
		System.out.print("매개변수 3개 메서드 호출 결과 -> " + sum_3 );
		
				
	}

}
