package ch09;

public class Code09_07 {

	public static void main(String[] args) {
		// 배열을 선언함과 동시에 10, 20, 30을 넣어 초기화 하고
		// 반복문을 이용하여 각각 출력해라
		
		int[] ary = {
				10, 20, 30
		};
		
		for (int i = 0; i < ary.length; i++) {
			int data = ary[i];
			System.out.println(data);
		}
			
		// 배열을 선언함과 동시에 10, 20, 30을 넣어 초기화 하고
		// 향상된 for를 이용해 각각 출력해라
		
		int[] num = {
				10, 20, 30
		};
		for (int number : num) {
			System.out.println(number);
		}
		

	}

}
