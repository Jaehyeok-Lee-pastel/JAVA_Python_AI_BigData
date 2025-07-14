package ch09;

public class ArrEx2 {

	public static void main(String[] args) {
		// 2번 : 선언 + 초기화 동시에
		// 타입[] 배열명 = {초기값1, 초기값2, 초기값3..}
		
		// 학생 3명의 수학점수를 저장하는 배열
		
		int[] math = {70, 80, 90};
		
//		System.out.println(math[0]);
//		System.out.println(math[1]);
//		System.out.println(math[2]);
		
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		
	}

}
