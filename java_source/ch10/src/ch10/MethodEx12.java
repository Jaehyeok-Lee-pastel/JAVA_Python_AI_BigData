package ch10;


class Ex12 {
	
	int add(int...arr) {
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
}

public class MethodEx12 {

	public static void main(String[] args) {
		// 향상된 배열 다루기 = 가변인자 ...
		// 값을 보내기 -> 매개변수 받을 대 (int...arr)
		
		Ex12 ex12 = new Ex12();
		System.out.println(ex12.add(1, 4, 7, 11));
		System.out.println(ex12.add(1, 4, 7, 11, 15));
		System.out.println(ex12.add(1, 4, 7, 11, 15, 33)); // 더할 값을 쉽표로 구분해서 보내기
		

		
		
		{
			int j = 1;
			System.out.println(j);
		}
	}

}
