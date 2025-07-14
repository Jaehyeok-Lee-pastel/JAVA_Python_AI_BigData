package ch09;

public class ArrEx3 {

	public static void main(String[] args) {
		// 3번 : 선언과 초기화 동시에
		// 타입 [] 배열명 = new 타입 {값1, 값2, 값3}
		
		int[] score = new int[] {70, 80, 90};
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

	}

}
